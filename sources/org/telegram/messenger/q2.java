package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17339a;
    public final FileLoadOperation f17340b;
    public final FileLoadOperationStream f17341c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17339a = i10;
        this.f17340b = fileLoadOperation;
        this.f17341c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17339a) {
            case 0:
                this.f17340b.lambda$removeStreamListener$5(this.f17341c);
                return;
            default:
                this.f17340b.lambda$setStream$0(this.f17341c);
                return;
        }
    }
}
