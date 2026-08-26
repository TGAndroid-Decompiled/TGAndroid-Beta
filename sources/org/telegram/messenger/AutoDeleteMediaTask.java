package org.telegram.messenger;

import android.util.SparseArray;
import androidx.recyclerview.widget.DiffUtil;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class AutoDeleteMediaTask {
    public static Set<String> usingFilePaths = Collections.newSetFromMap(new ConcurrentHashMap());

    public static class FileInfoInternal extends CacheByChatsController.KeepMediaFile {
        final long lastUsageDate;

        private FileInfoInternal(File file) {
            super(file);
            this.lastUsageDate = Utilities.getLastUsageFileTime(file.getAbsolutePath());
        }
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

    public static int lambda$run$0(FileInfoInternal fileInfoInternal, FileInfoInternal fileInfoInternal2) {
        long j = fileInfoInternal2.lastUsageDate;
        long j2 = fileInfoInternal.lastUsageDate;
        if (j > j2) {
            return -1;
        }
        return j < j2 ? 1 : 0;
    }

    public static void lambda$run$1(int i, File file) {
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        long j2;
        char c;
        long daysInSeconds;
        long daysInSeconds2;
        int i6;
        ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList;
        long j3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia start task");
        }
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        boolean z = false;
        while (true) {
            i2 = 4;
            i3 = 1;
            if (i7 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i7).isClientActivated()) {
                CacheByChatsController cacheByChatsController = UserConfig.getInstance(i7).getMessagesController().getCacheByChatsController();
                arrayList2.add(cacheByChatsController);
                if (cacheByChatsController.getKeepMediaExceptionsByDialogs().size() > 0) {
                    z = true;
                }
            }
            i7++;
        }
        int[] iArr = new int[4];
        long j4 = Long.MAX_VALUE;
        boolean z2 = true;
        for (int i8 = 0; i8 < 4; i8++) {
            int i9 = SharedConfig.getPreferences().getInt(DiffUtil.m(i8, "keep_media_type_"), CacheByChatsController.getDefault(i8));
            iArr[i8] = i9;
            if (i9 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                z2 = false;
            }
            long daysInSeconds3 = CacheByChatsController.getDaysInSeconds(i9);
            if (daysInSeconds3 < j4) {
                j4 = daysInSeconds3;
            }
        }
        if (z) {
            z2 = false;
        }
        SparseArray<File> sparseArrayCreateMediaPaths = ImageLoader.getInstance().createMediaPaths();
        int i10 = 0;
        int i11 = 0;
        long length = 0;
        while (i11 < sparseArrayCreateMediaPaths.size()) {
            if (z2 && (sparseArrayCreateMediaPaths.keyAt(i11) == i3 || sparseArrayCreateMediaPaths.keyAt(i11) == 3)) {
                j2 = jCurrentTimeMillis;
            } else {
                boolean z3 = sparseArrayCreateMediaPaths.keyAt(i11) == i2;
                try {
                    File[] fileArrListFiles = sparseArrayCreateMediaPaths.valueAt(i11).listFiles();
                    ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList3 = new ArrayList<>();
                    if (fileArrListFiles != null) {
                        c = 3;
                        for (int i12 = 0; i12 < fileArrListFiles.length; i12++) {
                            if (!fileArrListFiles[i12].isDirectory() && !usingFilePaths.contains(fileArrListFiles[i12].getAbsolutePath())) {
                                arrayList3.add(new CacheByChatsController.KeepMediaFile(fileArrListFiles[i12]));
                            }
                        }
                    } else {
                        c = 3;
                    }
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        ((CacheByChatsController) arrayList2.get(i13)).lookupFiles(arrayList3);
                    }
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        CacheByChatsController.KeepMediaFile keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList3.get(i14);
                        try {
                            if (keepMediaFile.isStory) {
                                daysInSeconds2 = CacheByChatsController.getDaysInSeconds(iArr[c]);
                                j2 = jCurrentTimeMillis;
                            } else {
                                j2 = jCurrentTimeMillis;
                                int i15 = keepMediaFile.keepMedia;
                                if (i15 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                                    if (i15 >= 0) {
                                        daysInSeconds = CacheByChatsController.getDaysInSeconds(i15);
                                    } else {
                                        int i16 = keepMediaFile.dialogType;
                                        if (i16 >= 0) {
                                            daysInSeconds = CacheByChatsController.getDaysInSeconds(iArr[i16]);
                                        } else if (!z3) {
                                            daysInSeconds = j4;
                                        }
                                    }
                                    if (daysInSeconds != Long.MAX_VALUE) {
                                        daysInSeconds2 = daysInSeconds;
                                    }
                                }
                                i6 = i14;
                                arrayList = arrayList3;
                                i14 = i6 + 1;
                                i = i;
                                arrayList3 = arrayList;
                                jCurrentTimeMillis = j2;
                            }
                            arrayList = arrayList3;
                            long lastUsageFileTime = Utilities.getLastUsageFileTime(keepMediaFile.file.getAbsolutePath());
                            if (lastUsageFileTime <= 316000000 || lastUsageFileTime >= j3) {
                                i6 = i14;
                            } else {
                                i6 = i14;
                                if (!usingFilePaths.contains(keepMediaFile.file.getPath())) {
                                    try {
                                        if (BuildVars.LOGS_ENABLED) {
                                            i10++;
                                            length += keepMediaFile.file.length();
                                        }
                                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                            FileLog.d("delete file " + keepMediaFile.file.getPath() + " last_usage_time=" + lastUsageFileTime + " time_local=" + j3 + " story=" + keepMediaFile.isStory);
                                        }
                                        keepMediaFile.file.delete();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            }
                            i14 = i6 + 1;
                            i = i;
                            arrayList3 = arrayList;
                            jCurrentTimeMillis = j2;
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th);
                            i11++;
                            jCurrentTimeMillis = j2;
                            i2 = 4;
                            i3 = 1;
                        }
                        j3 = ((long) i) - daysInSeconds2;
                    }
                    j2 = jCurrentTimeMillis;
                } catch (Throwable th2) {
                    th = th2;
                    j2 = jCurrentTimeMillis;
                }
            }
            i11++;
            jCurrentTimeMillis = j2;
            i2 = 4;
            i3 = 1;
        }
        long j5 = jCurrentTimeMillis;
        int i17 = SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE);
        if (i17 == Integer.MAX_VALUE) {
            j = 0;
            i4 = 0;
            i5 = 0;
        } else {
            long j6 = i17 == 1 ? 314572800L : ((long) i17) * 1048576000;
            long dirSize = 0;
            for (int i18 = 0; i18 < sparseArrayCreateMediaPaths.size(); i18++) {
                dirSize += Utilities.getDirSize(sparseArrayCreateMediaPaths.valueAt(i18).getAbsolutePath(), 0, true);
            }
            if (dirSize > j6) {
                ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList4 = new ArrayList<>();
                for (int i19 = 0; i19 < sparseArrayCreateMediaPaths.size(); i19++) {
                    fillFilesRecursive(sparseArrayCreateMediaPaths.valueAt(i19), arrayList4);
                }
                for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                    ((CacheByChatsController) arrayList2.get(i20)).lookupFiles(arrayList4);
                }
                Collections.sort(arrayList4, new Emoji$$ExternalSyntheticLambda0(2));
                j = 0;
                int i21 = 0;
                i4 = 0;
                for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                    if (((FileInfoInternal) arrayList4.get(i22)).keepMedia != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                        if (((FileInfoInternal) arrayList4.get(i22)).lastUsageDate > 0) {
                            long length2 = ((FileInfoInternal) arrayList4.get(i22)).file.length();
                            dirSize -= length2;
                            i21++;
                            j += length2;
                            try {
                                ((FileInfoInternal) arrayList4.get(i22)).file.delete();
                            } catch (Exception unused) {
                            }
                            if (dirSize < j6) {
                                break;
                            }
                        } else {
                            i4++;
                        }
                    }
                }
                i5 = i21;
            } else {
                j = 0;
                i4 = 0;
                i5 = 0;
            }
        }
        File file2 = new File(file, "acache");
        if (file2.exists()) {
            try {
                Utilities.clearDir(file2.getAbsolutePath(), 0, i - 86400, false);
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
        }
        MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia task end time " + (System.currentTimeMillis() - j5) + " auto deleted info: files " + i10 + " size " + AndroidUtilities.formatFileSize(length) + "   deleted by size limit info: files " + i5 + " size " + AndroidUtilities.formatFileSize(j) + " unknownTimeFiles " + i4);
        }
    }

    public static void lockFile(File file) {
        if (file == null) {
            return;
        }
        lockFile(file.getAbsolutePath());
    }

    public static void run() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(iCurrentTimeMillis - SharedConfig.lastKeepMediaCheckTime) < 86400) {
            return;
        }
        SharedConfig.lastKeepMediaCheckTime = iCurrentTimeMillis;
        Utilities.cacheClearQueue.postRunnable(new Utilities$$ExternalSyntheticLambda0(iCurrentTimeMillis, FileLoader.checkDirectory(4), 5));
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
