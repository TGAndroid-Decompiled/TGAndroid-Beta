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
    final DispatchQueue2 workerQueue;
    public ArrayList<FileLoadOperation> allOperations = new ArrayList<>();
    public ArrayList<FileLoadOperation> tmpListOperations = new ArrayList<>();
    boolean checkOperationsScheduled = false;
    private final Runnable checkVisibleStoryRunnable = new Runnable(this) {
        public final FileLoaderPriorityQueue f20479b;

        {
            this.f20479b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f20479b.lambda$new$0();
                    return;
                default:
                    this.f20479b.lambda$new$1();
                    return;
            }
        }
    };
    Runnable checkOperationsRunnable = new Runnable(this) {
        public final FileLoaderPriorityQueue f20479b;

        {
            this.f20479b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f20479b.lambda$new$0();
                    return;
                default:
                    this.f20479b.lambda$new$1();
                    return;
            }
        }
    };

    public FileLoaderPriorityQueue(int i10, String str, int i11, DispatchQueue2 dispatchQueue2) {
        this.currentAccount = i10;
        this.name = str;
        this.type = i11;
        this.workerQueue = dispatchQueue2;
    }

    private void checkLoadingOperationInternal() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoaderPriorityQueue.checkLoadingOperationInternal():void");
    }

    public void lambda$new$1() {
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
            if (i10 < this.allOperations.size()) {
                if (fileLoadOperation.getPriority() > this.allOperations.get(i10).getPriority()) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
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

    public void lambda$new$0() {
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
