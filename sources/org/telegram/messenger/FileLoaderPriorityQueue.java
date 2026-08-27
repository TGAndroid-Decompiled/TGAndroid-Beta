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
    Runnable checkOperationsRunnable = new d1(this, 20);

    public FileLoaderPriorityQueue(int i10, String str, int i11, DispatchQueue dispatchQueue) {
        this.currentAccount = i10;
        this.name = str;
        this.type = i11;
        this.workerQueue = dispatchQueue;
    }

    private void checkLoadingOperationInternal() {
        int i10 = this.type == 1 ? MessagesController.getInstance(this.currentAccount).largeQueueMaxActiveOperations : MessagesController.getInstance(this.currentAccount).smallQueueMaxActiveOperations;
        this.tmpListOperations.clear();
        int i11 = 0;
        boolean z10 = false;
        int priority = 0;
        while (i11 < this.allOperations.size()) {
            FileLoadOperation fileLoadOperation = i11 > 0 ? this.allOperations.get(i11 - 1) : null;
            FileLoadOperation fileLoadOperation2 = this.allOperations.get(i11);
            if (i11 > 0 && !z10) {
                if (this.type == 1 && fileLoadOperation != null && fileLoadOperation.isStory && fileLoadOperation.getPriority() >= 1048576 && fileLoadOperation2.getPriority() <= 0) {
                    z10 = true;
                }
                if (priority > 0 && fileLoadOperation2.getPriority() == 0) {
                    z10 = true;
                }
            }
            if (fileLoadOperation2.preFinished) {
                i10++;
            } else {
                if (!z10 && i11 < i10) {
                    this.tmpListOperations.add(fileLoadOperation2);
                } else if (fileLoadOperation2.wasStarted()) {
                    fileLoadOperation2.pause();
                }
                priority = fileLoadOperation2.getPriority();
            }
            i11++;
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
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.allOperations.size()) {
            if (this.allOperations.get(i11) == fileLoadOperation) {
                this.allOperations.remove(i11);
                i11--;
            }
            i11++;
        }
        while (true) {
            if (i10 >= this.allOperations.size()) {
                i10 = -1;
                break;
            } else if (fileLoadOperation.getPriority() > this.allOperations.get(i10).getPriority()) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            this.allOperations.add(i10, fileLoadOperation);
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
        } else {
            if (this.checkOperationsScheduled) {
                return;
            }
            this.checkOperationsScheduled = true;
            this.workerQueue.cancelRunnable(this.checkOperationsRunnable);
            this.workerQueue.postRunnable(this.checkOperationsRunnable, 20L);
        }
    }
}
