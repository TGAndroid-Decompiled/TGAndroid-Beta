package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18897a;
    public final FileLoadOperation f18898b;
    public final FileLoadOperationStream f18899c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18897a = i10;
        this.f18898b = fileLoadOperation;
        this.f18899c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18897a) {
            case 0:
                this.f18898b.lambda$removeStreamListener$6(this.f18899c);
                return;
            default:
                this.f18898b.lambda$setStream$1(this.f18899c);
                return;
        }
    }
}
