package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.CacheByChatsController;
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
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    fillFilesRecursive(file2, arrayList);
                } else if (!file2.getName().equals(".nomedia") && !usingFilePaths.contains(file2.getAbsolutePath())) {
                    arrayList.add(new FileInfoInternal(file2));
                }
            }
        }
    }

    public static int lambda$run$0(FileInfoInternal fileInfoInternal, FileInfoInternal fileInfoInternal2) {
        long j3 = fileInfoInternal2.lastUsageDate;
        long j10 = fileInfoInternal.lastUsageDate;
        if (j3 > j10) {
            return -1;
        }
        if (j3 < j10) {
            return 1;
        }
        return 0;
    }

    public static void lambda$run$1(int r29, java.io.File r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AutoDeleteMediaTask.lambda$run$1(int, java.io.File):void");
    }

    public static void lockFile(File file) {
        if (file == null) {
            return;
        }
        lockFile(file.getAbsolutePath());
    }

    public static void run() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - SharedConfig.lastKeepMediaCheckTime) < 86400) {
            return;
        }
        SharedConfig.lastKeepMediaCheckTime = currentTimeMillis;
        Utilities.cacheClearQueue.postRunnable(new o6(currentTimeMillis, FileLoader.checkDirectory(4), 4));
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
