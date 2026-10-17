package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19536a;
    public final FileLoadOperation f19537b;
    public final FileLoadOperationStream f19538c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19536a = i10;
        this.f19537b = fileLoadOperation;
        this.f19538c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19536a) {
            case 0:
                this.f19537b.lambda$removeStreamListener$6(this.f19538c);
                return;
            default:
                this.f19537b.lambda$setStream$1(this.f19538c);
                return;
        }
    }
}
