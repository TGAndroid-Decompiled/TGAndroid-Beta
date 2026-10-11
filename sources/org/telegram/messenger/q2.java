package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18938a;
    public final FileLoadOperation f18939b;
    public final FileLoadOperationStream f18940c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18938a = i10;
        this.f18939b = fileLoadOperation;
        this.f18940c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18938a) {
            case 0:
                this.f18939b.lambda$removeStreamListener$6(this.f18940c);
                return;
            default:
                this.f18939b.lambda$setStream$1(this.f18940c);
                return;
        }
    }
}
