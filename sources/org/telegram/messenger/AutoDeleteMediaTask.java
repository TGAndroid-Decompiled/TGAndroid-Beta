package org.telegram.messenger;

import android.util.SparseArray;
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
        long j10 = fileInfoInternal2.lastUsageDate;
        long j11 = fileInfoInternal.lastUsageDate;
        if (j10 > j11) {
            return -1;
        }
        return j10 < j11 ? 1 : 0;
    }

    public static void lambda$run$1(int i10, File file) {
        int i11;
        int i12;
        long j10;
        int i13;
        int i14;
        long j11;
        char c10;
        long daysInSeconds;
        long daysInSeconds2;
        int i15;
        ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList;
        long j12;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia start task");
        }
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        boolean z10 = false;
        while (true) {
            i11 = 4;
            i12 = 1;
            if (i16 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i16).isClientActivated()) {
                CacheByChatsController cacheByChatsController = UserConfig.getInstance(i16).getMessagesController().getCacheByChatsController();
                arrayList2.add(cacheByChatsController);
                if (cacheByChatsController.getKeepMediaExceptionsByDialogs().size() > 0) {
                    z10 = true;
                }
            }
            i16++;
        }
        int[] iArr = new int[4];
        long j13 = Long.MAX_VALUE;
        boolean z11 = true;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = SharedConfig.getPreferences().getInt(i0.a.k(i17, "keep_media_type_"), CacheByChatsController.getDefault(i17));
            iArr[i17] = i18;
            if (i18 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                z11 = false;
            }
            long daysInSeconds3 = CacheByChatsController.getDaysInSeconds(i18);
            if (daysInSeconds3 < j13) {
                j13 = daysInSeconds3;
            }
        }
        if (z10) {
            z11 = false;
        }
        SparseArray<File> sparseArrayCreateMediaPaths = ImageLoader.getInstance().createMediaPaths();
        int i19 = 0;
        int i20 = 0;
        long length = 0;
        while (i20 < sparseArrayCreateMediaPaths.size()) {
            if (z11 && (sparseArrayCreateMediaPaths.keyAt(i20) == i12 || sparseArrayCreateMediaPaths.keyAt(i20) == 3)) {
                j11 = jCurrentTimeMillis;
            } else {
                boolean z12 = sparseArrayCreateMediaPaths.keyAt(i20) == i11;
                try {
                    File[] fileArrListFiles = sparseArrayCreateMediaPaths.valueAt(i20).listFiles();
                    ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList3 = new ArrayList<>();
                    if (fileArrListFiles != null) {
                        c10 = 3;
                        for (int i21 = 0; i21 < fileArrListFiles.length; i21++) {
                            if (!fileArrListFiles[i21].isDirectory() && !usingFilePaths.contains(fileArrListFiles[i21].getAbsolutePath())) {
                                arrayList3.add(new CacheByChatsController.KeepMediaFile(fileArrListFiles[i21]));
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                    for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                        ((CacheByChatsController) arrayList2.get(i22)).lookupFiles(arrayList3);
                    }
                    int i23 = 0;
                    while (i23 < arrayList3.size()) {
                        CacheByChatsController.KeepMediaFile keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList3.get(i23);
                        try {
                            if (keepMediaFile.isStory) {
                                daysInSeconds2 = CacheByChatsController.getDaysInSeconds(iArr[c10]);
                                j11 = jCurrentTimeMillis;
                            } else {
                                j11 = jCurrentTimeMillis;
                                int i24 = keepMediaFile.keepMedia;
                                if (i24 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                                    if (i24 >= 0) {
                                        daysInSeconds = CacheByChatsController.getDaysInSeconds(i24);
                                    } else {
                                        int i25 = keepMediaFile.dialogType;
                                        if (i25 >= 0) {
                                            daysInSeconds = CacheByChatsController.getDaysInSeconds(iArr[i25]);
                                        } else if (!z12) {
                                            daysInSeconds = j13;
                                        }
                                    }
                                    if (daysInSeconds != Long.MAX_VALUE) {
                                        daysInSeconds2 = daysInSeconds;
                                    }
                                }
                                i15 = i23;
                                arrayList = arrayList3;
                                i23 = i15 + 1;
                                i10 = i10;
                                arrayList3 = arrayList;
                                jCurrentTimeMillis = j11;
                            }
                            arrayList = arrayList3;
                            long lastUsageFileTime = Utilities.getLastUsageFileTime(keepMediaFile.file.getAbsolutePath());
                            if (lastUsageFileTime <= 316000000 || lastUsageFileTime >= j12) {
                                i15 = i23;
                            } else {
                                i15 = i23;
                                if (!usingFilePaths.contains(keepMediaFile.file.getPath())) {
                                    try {
                                        if (BuildVars.LOGS_ENABLED) {
                                            i19++;
                                            length += keepMediaFile.file.length();
                                        }
                                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                            FileLog.d("delete file " + keepMediaFile.file.getPath() + " last_usage_time=" + lastUsageFileTime + " time_local=" + j12 + " story=" + keepMediaFile.isStory);
                                        }
                                        keepMediaFile.file.delete();
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                }
                            }
                            i23 = i15 + 1;
                            i10 = i10;
                            arrayList3 = arrayList;
                            jCurrentTimeMillis = j11;
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th);
                            i20++;
                            jCurrentTimeMillis = j11;
                            i11 = 4;
                            i12 = 1;
                        }
                        j12 = ((long) i10) - daysInSeconds2;
                    }
                    j11 = jCurrentTimeMillis;
                } catch (Throwable th2) {
                    th = th2;
                    j11 = jCurrentTimeMillis;
                }
            }
            i20++;
            jCurrentTimeMillis = j11;
            i11 = 4;
            i12 = 1;
        }
        long j14 = jCurrentTimeMillis;
        int i26 = SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE);
        if (i26 == Integer.MAX_VALUE) {
            j10 = 0;
            i13 = 0;
            i14 = 0;
        } else {
            long j15 = i26 == 1 ? 314572800L : ((long) i26) * 1048576000;
            long dirSize = 0;
            for (int i27 = 0; i27 < sparseArrayCreateMediaPaths.size(); i27++) {
                dirSize += Utilities.getDirSize(sparseArrayCreateMediaPaths.valueAt(i27).getAbsolutePath(), 0, true);
            }
            if (dirSize > j15) {
                ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList4 = new ArrayList<>();
                for (int i28 = 0; i28 < sparseArrayCreateMediaPaths.size(); i28++) {
                    fillFilesRecursive(sparseArrayCreateMediaPaths.valueAt(i28), arrayList4);
                }
                for (int i29 = 0; i29 < arrayList2.size(); i29++) {
                    ((CacheByChatsController) arrayList2.get(i29)).lookupFiles(arrayList4);
                }
                Collections.sort(arrayList4, new q(1));
                j10 = 0;
                int i30 = 0;
                i13 = 0;
                for (int i31 = 0; i31 < arrayList4.size(); i31++) {
                    if (((FileInfoInternal) arrayList4.get(i31)).keepMedia != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                        if (((FileInfoInternal) arrayList4.get(i31)).lastUsageDate > 0) {
                            long length2 = ((FileInfoInternal) arrayList4.get(i31)).file.length();
                            dirSize -= length2;
                            i13++;
                            j10 += length2;
                            try {
                                ((FileInfoInternal) arrayList4.get(i31)).file.delete();
                            } catch (Exception unused) {
                            }
                            if (dirSize < j15) {
                                break;
                            }
                        } else {
                            i30++;
                        }
                    }
                }
                i14 = i30;
            } else {
                j10 = 0;
                i13 = 0;
                i14 = 0;
            }
        }
        File file2 = new File(file, "acache");
        if (file2.exists()) {
            try {
                Utilities.clearDir(file2.getAbsolutePath(), 0, i10 - 86400, false);
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
        }
        MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia task end time " + (System.currentTimeMillis() - j14) + " auto deleted info: files " + i19 + " size " + AndroidUtilities.formatFileSize(length) + "   deleted by size limit info: files " + i13 + " size " + AndroidUtilities.formatFileSize(j10) + " unknownTimeFiles " + i14);
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
        Utilities.cacheClearQueue.postRunnable(new p6(iCurrentTimeMillis, FileLoader.checkDirectory(4), 4));
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
