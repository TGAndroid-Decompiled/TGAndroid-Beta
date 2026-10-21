package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19632a;
    public final FileLoadOperation f19633b;
    public final FileLoadOperationStream f19634c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19632a = i10;
        this.f19633b = fileLoadOperation;
        this.f19634c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19632a) {
            case 0:
                this.f19633b.lambda$removeStreamListener$6(this.f19634c);
                return;
            default:
                this.f19633b.lambda$setStream$1(this.f19634c);
                return;
        }
    }
}
