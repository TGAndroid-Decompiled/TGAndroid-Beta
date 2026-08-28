package org.telegram.messenger;

import java.util.ArrayList;
public class FileLoaderPriorityQueue {
    public static final int PRIORITY_VALUE_LOW = 0;
    public static final int PRIORITY_VALUE_MAX = 1048576;
    public static final int PRIORITY_VALUE_NORMAL = 65536;
    public static final int TYPE_LARGE = 1;
    public static final int TYPE_SMALL = 0;
    int currentAccount;
    String name;
    int type;
    final DispatchQueue workerQueue;
    public ArrayList<FileLoadOperation> allOperations = new ArrayList<>();
    public ArrayList<FileLoadOperation> tmpListOperations = new ArrayList<>();
    boolean checkOperationsScheduled = false;
    Runnable checkOperationsRunnable = new e1(this, 20);

    public FileLoaderPriorityQueue(int i9, String str, int i10, DispatchQueue dispatchQueue) {
        this.currentAccount = i9;
        this.name = str;
        this.type = i10;
        this.workerQueue = dispatchQueue;
    }

    public static void a(FileLoaderPriorityQueue fileLoaderPriorityQueue) {
        fileLoaderPriorityQueue.lambda$new$0();
    }

    private void checkLoadingOperationInternal() {
        int i9;
        FileLoadOperation fileLoadOperation;
        if (this.type == 1) {
            i9 = MessagesController.getInstance(this.currentAccount).largeQueueMaxActiveOperations;
        } else {
            i9 = MessagesController.getInstance(this.currentAccount).smallQueueMaxActiveOperations;
        }
        this.tmpListOperations.clear();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < this.allOperations.size(); i11++) {
            if (i11 > 0) {
                fileLoadOperation = this.allOperations.get(i11 - 1);
            } else {
                fileLoadOperation = null;
            }
            FileLoadOperation fileLoadOperation2 = this.allOperations.get(i11);
            if (i11 > 0 && !z10) {
                if (this.type == 1 && fileLoadOperation != null && fileLoadOperation.isStory && fileLoadOperation.getPriority() >= 1048576 && fileLoadOperation2.getPriority() <= 0) {
                    z10 = true;
                }
                if (i10 > 0 && fileLoadOperation2.getPriority() == 0) {
                    z10 = true;
                }
            }
            if (fileLoadOperation2.preFinished) {
                i9++;
            } else {
                if (!z10 && i11 < i9) {
                    this.tmpListOperations.add(fileLoadOperation2);
                } else if (fileLoadOperation2.wasStarted()) {
                    fileLoadOperation2.pause();
                }
                i10 = fileLoadOperation2.getPriority();
            }
        }
        for (int i12 = 0; i12 < this.tmpListOperations.size(); i12++) {
            this.tmpListOperations.get(i12).start();
        }
    }

    public void lambda$new$0() {
        checkLoadingOperationInternal();
        this.checkOperationsScheduled = false;
    }

    public void add(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation == null) {
            return;
        }
        int i9 = 0;
        int i10 = 0;
        while (i10 < this.allOperations.size()) {
            if (this.allOperations.get(i10) == fileLoadOperation) {
                this.allOperations.remove(i10);
                i10--;
            }
            i10++;
        }
        while (true) {
            if (i9 < this.allOperations.size()) {
                if (fileLoadOperation.getPriority() > this.allOperations.get(i9).getPriority()) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0) {
            this.allOperations.add(i9, fileLoadOperation);
        } else {
            this.allOperations.add(fileLoadOperation);
        }
    }

    public void cancel(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation != null && this.allOperations.remove(fileLoadOperation)) {
            fileLoadOperation.cancel();
        }
    }

    public void checkLoadingOperations() {
        checkLoadingOperations(false);
    }

    public int getCount() {
        return this.allOperations.size();
    }

    public int getPosition(FileLoadOperation fileLoadOperation) {
        return this.allOperations.indexOf(fileLoadOperation);
    }

    public boolean remove(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation == null) {
            return false;
        }
        return this.allOperations.remove(fileLoadOperation);
    }

    public void checkLoadingOperations(boolean z10) {
        if (z10) {
            this.workerQueue.cancelRunnable(this.checkOperationsRunnable);
            this.checkOperationsRunnable.run();
        } else if (this.checkOperationsScheduled) {
        } else {
            this.checkOperationsScheduled = true;
            this.workerQueue.cancelRunnable(this.checkOperationsRunnable);
            this.workerQueue.postRunnable(this.checkOperationsRunnable, 20L);
        }
    }
}
