package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class AutoDeleteMediaTask {
    public static Set<String> usingFilePaths = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void run() {
        final int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(iCurrentTimeMillis - SharedConfig.lastKeepMediaCheckTime) < 86400) {
            return;
        }
        SharedConfig.lastKeepMediaCheckTime = iCurrentTimeMillis;
        final File fileCheckDirectory = FileLoader.checkDirectory(4);
        Utilities.cacheClearQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                AutoDeleteMediaTask.lambda$run$1(iCurrentTimeMillis, fileCheckDirectory);
            }
        });
    }

    public static void lambda$run$1(int i, File file) {
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int[] iArr;
        long j2;
        int i7;
        int i8;
        CacheByChatsController.KeepMediaFile keepMediaFile;
        boolean z;
        int i9;
        int i10;
        long daysInSeconds;
        long daysInSeconds2;
        ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList;
        long lastUsageFileTime;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia start task");
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        boolean z2 = false;
        while (true) {
            i2 = 4;
            i3 = 1;
            if (i11 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i11).isClientActivated()) {
                CacheByChatsController cacheByChatsController = UserConfig.getInstance(i11).getMessagesController().getCacheByChatsController();
                arrayList2.add(cacheByChatsController);
                if (cacheByChatsController.getKeepMediaExceptionsByDialogs().size() > 0) {
                    z2 = true;
                }
            }
            i11++;
        }
        int[] iArr2 = new int[4];
        long j3 = Long.MAX_VALUE;
        boolean z3 = true;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = SharedConfig.getPreferences().getInt("keep_media_type_" + i12, CacheByChatsController.getDefault(i12));
            iArr2[i12] = i13;
            if (i13 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                z3 = false;
            }
            long daysInSeconds3 = CacheByChatsController.getDaysInSeconds(i13);
            if (daysInSeconds3 < j3) {
                j3 = daysInSeconds3;
            }
        }
        if (z2) {
            z3 = false;
        }
        SparseArray<File> sparseArrayCreateMediaPaths = ImageLoader.getInstance().createMediaPaths();
        int i14 = 0;
        int i15 = 0;
        long length = 0;
        while (i14 < sparseArrayCreateMediaPaths.size()) {
            if (z3 && (sparseArrayCreateMediaPaths.keyAt(i14) == i3 || sparseArrayCreateMediaPaths.keyAt(i14) == 3)) {
                iArr = iArr2;
                j2 = j3;
            } else {
                boolean z4 = sparseArrayCreateMediaPaths.keyAt(i14) == i2;
                try {
                    File[] fileArrListFiles = sparseArrayCreateMediaPaths.valueAt(i14).listFiles();
                    ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList3 = new ArrayList<>();
                    if (fileArrListFiles != null) {
                        int i16 = 0;
                        while (i16 < fileArrListFiles.length) {
                            try {
                                if (fileArrListFiles[i16].isDirectory()) {
                                    j2 = j3;
                                } else {
                                    j2 = j3;
                                    try {
                                        if (!usingFilePaths.contains(fileArrListFiles[i16].getAbsolutePath())) {
                                            arrayList3.add(new CacheByChatsController.KeepMediaFile(fileArrListFiles[i16]));
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        iArr = iArr2;
                                        FileLog.e(th);
                                        i14++;
                                        j3 = j2;
                                        iArr2 = iArr;
                                        i2 = 4;
                                        i3 = 1;
                                    }
                                }
                                i16++;
                                j3 = j2;
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = j3;
                            }
                        }
                        j2 = j3;
                        for (i7 = 0; i7 < arrayList2.size(); i7++) {
                            ((CacheByChatsController) arrayList2.get(i7)).lookupFiles(arrayList3);
                        }
                        i8 = 0;
                        while (i8 < arrayList3.size()) {
                            keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList3.get(i8);
                            if (keepMediaFile.isStory) {
                                z = z4;
                                daysInSeconds2 = ((long) i) - CacheByChatsController.getDaysInSeconds(iArr2[3]);
                            } else {
                                z = z4;
                                i9 = keepMediaFile.keepMedia;
                                if (i9 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                                    if (i9 >= 0) {
                                        daysInSeconds = CacheByChatsController.getDaysInSeconds(i9);
                                    } else {
                                        i10 = keepMediaFile.dialogType;
                                        if (i10 >= 0) {
                                            daysInSeconds = CacheByChatsController.getDaysInSeconds(iArr2[i10]);
                                        } else if (z) {
                                            daysInSeconds = j2;
                                        }
                                    }
                                    if (daysInSeconds == Long.MAX_VALUE) {
                                        daysInSeconds2 = ((long) i) - daysInSeconds;
                                    }
                                }
                                arrayList = arrayList3;
                                iArr = iArr2;
                                i8++;
                                z4 = z;
                                arrayList3 = arrayList;
                                iArr2 = iArr;
                            }
                            lastUsageFileTime = Utilities.getLastUsageFileTime(keepMediaFile.file.getAbsolutePath());
                            if (lastUsageFileTime > 316000000 || lastUsageFileTime >= daysInSeconds2) {
                                arrayList = arrayList3;
                                iArr = iArr2;
                            } else {
                                arrayList = arrayList3;
                                iArr = iArr2;
                                try {
                                    if (!usingFilePaths.contains(keepMediaFile.file.getPath())) {
                                        try {
                                            if (BuildVars.LOGS_ENABLED) {
                                                i15++;
                                                length += keepMediaFile.file.length();
                                            }
                                            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                                FileLog.d("delete file " + keepMediaFile.file.getPath() + " last_usage_time=" + lastUsageFileTime + " time_local=" + daysInSeconds2 + " story=" + keepMediaFile.isStory);
                                            }
                                            keepMediaFile.file.delete();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    FileLog.e(th);
                                    i14++;
                                    j3 = j2;
                                    iArr2 = iArr;
                                    i2 = 4;
                                    i3 = 1;
                                }
                            }
                            i8++;
                            z4 = z;
                            arrayList3 = arrayList;
                            iArr2 = iArr;
                        }
                        iArr = iArr2;
                    } else {
                        j2 = j3;
                        while (i7 < arrayList2.size()) {
                            ((CacheByChatsController) arrayList2.get(i7)).lookupFiles(arrayList3);
                        }
                        i8 = 0;
                        while (i8 < arrayList3.size()) {
                            keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList3.get(i8);
                            if (keepMediaFile.isStory) {
                                z = z4;
                                daysInSeconds2 = ((long) i) - CacheByChatsController.getDaysInSeconds(iArr2[3]);
                            } else {
                                z = z4;
                                i9 = keepMediaFile.keepMedia;
                                if (i9 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                                    if (i9 >= 0) {
                                        daysInSeconds = CacheByChatsController.getDaysInSeconds(i9);
                                    } else {
                                        i10 = keepMediaFile.dialogType;
                                        if (i10 >= 0) {
                                            daysInSeconds = CacheByChatsController.getDaysInSeconds(iArr2[i10]);
                                        } else if (z) {
                                            daysInSeconds = j2;
                                        }
                                    }
                                    if (daysInSeconds == Long.MAX_VALUE) {
                                        daysInSeconds2 = ((long) i) - daysInSeconds;
                                    }
                                }
                                arrayList = arrayList3;
                                iArr = iArr2;
                                i8++;
                                z4 = z;
                                arrayList3 = arrayList;
                                iArr2 = iArr;
                            }
                            lastUsageFileTime = Utilities.getLastUsageFileTime(keepMediaFile.file.getAbsolutePath());
                            if (lastUsageFileTime > 316000000) {
                                arrayList = arrayList3;
                                iArr = iArr2;
                            } else {
                                arrayList = arrayList3;
                                iArr = iArr2;
                            }
                            i8++;
                            z4 = z;
                            arrayList3 = arrayList;
                            iArr2 = iArr;
                        }
                        iArr = iArr2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    iArr = iArr2;
                    j2 = j3;
                }
            }
            i14++;
            j3 = j2;
            iArr2 = iArr;
            i2 = 4;
            i3 = 1;
        }
        int i17 = SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE);
        if (i17 == Integer.MAX_VALUE) {
            i4 = i15;
            j = 0;
            i5 = 0;
            i6 = 0;
        } else {
            long j4 = i17 == 1 ? 314572800L : ((long) i17) * 1048576000;
            long dirSize = 0;
            for (int i18 = 0; i18 < sparseArrayCreateMediaPaths.size(); i18++) {
                dirSize += Utilities.getDirSize(sparseArrayCreateMediaPaths.valueAt(i18).getAbsolutePath(), 0, true);
            }
            if (dirSize > j4) {
                ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList4 = new ArrayList<>();
                for (int i19 = 0; i19 < sparseArrayCreateMediaPaths.size(); i19++) {
                    fillFilesRecursive(sparseArrayCreateMediaPaths.valueAt(i19), arrayList4);
                }
                for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                    ((CacheByChatsController) arrayList2.get(i20)).lookupFiles(arrayList4);
                }
                Collections.sort(arrayList4, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return AutoDeleteMediaTask.lambda$run$0((AutoDeleteMediaTask.FileInfoInternal) obj, (AutoDeleteMediaTask.FileInfoInternal) obj2);
                    }
                });
                i5 = 0;
                i6 = 0;
                int i21 = 0;
                long j5 = 0;
                while (true) {
                    if (i21 >= arrayList4.size()) {
                        i4 = i15;
                        break;
                    }
                    if (((FileInfoInternal) arrayList4.get(i21)).keepMedia != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                        i4 = i15;
                        if (((FileInfoInternal) arrayList4.get(i21)).lastUsageDate > 0) {
                            long length2 = ((FileInfoInternal) arrayList4.get(i21)).file.length();
                            dirSize -= length2;
                            i5++;
                            j5 += length2;
                            try {
                                ((FileInfoInternal) arrayList4.get(i21)).file.delete();
                            } catch (Exception unused) {
                            }
                            if (dirSize < j4) {
                                break;
                            }
                        } else {
                            i6++;
                        }
                    } else {
                        i4 = i15;
                    }
                    i21++;
                    i15 = i4;
                }
                j = j5;
            } else {
                i4 = i15;
                j = 0;
                i5 = 0;
                i6 = 0;
            }
        }
        File file2 = new File(file, "acache");
        if (file2.exists()) {
            try {
                Utilities.clearDir(file2.getAbsolutePath(), 0, i - 86400, false);
            } catch (Throwable th5) {
                FileLog.e(th5);
            }
        }
        MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia task end time " + (System.currentTimeMillis() - jCurrentTimeMillis) + " auto deleted info: files " + i4 + " size " + AndroidUtilities.formatFileSize(length) + "   deleted by size limit info: files " + i5 + " size " + AndroidUtilities.formatFileSize(j) + " unknownTimeFiles " + i6);
        }
    }

    public static int lambda$run$0(FileInfoInternal fileInfoInternal, FileInfoInternal fileInfoInternal2) {
        long j = fileInfoInternal2.lastUsageDate;
        long j2 = fileInfoInternal.lastUsageDate;
        if (j > j2) {
            return -1;
        }
        return j < j2 ? 1 : 0;
    }

    private static void fillFilesRecursive(File file, ArrayList<FileInfoInternal> arrayList) {
        File[] fileArrListFiles;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                fillFilesRecursive(file2, arrayList);
            } else if (!file2.getName().equals(".nomedia") && !usingFilePaths.contains(file2.getAbsolutePath())) {
                arrayList.add(new FileInfoInternal(file2));
            }
        }
    }

    static class FileInfoInternal extends CacheByChatsController.KeepMediaFile {
        final long lastUsageDate;

        private FileInfoInternal(File file) {
            super(file);
            this.lastUsageDate = Utilities.getLastUsageFileTime(file.getAbsolutePath());
        }
    }

    public static void lockFile(File file) {
        if (file == null) {
            return;
        }
        lockFile(file.getAbsolutePath());
    }

    public static void unlockFile(File file) {
        if (file == null) {
            return;
        }
        unlockFile(file.getAbsolutePath());
    }

    public static void lockFile(String str) {
        if (str == null) {
            return;
        }
        usingFilePaths.add(str);
    }

    public static void unlockFile(String str) {
        if (str == null) {
            return;
        }
        usingFilePaths.remove(str);
    }
}
