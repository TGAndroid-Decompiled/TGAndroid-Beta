package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18769a;
    public final FileLoadOperation f18770b;
    public final FileLoadOperationStream f18771c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18769a = i10;
        this.f18770b = fileLoadOperation;
        this.f18771c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18769a) {
            case 0:
                this.f18770b.lambda$removeStreamListener$5(this.f18771c);
                return;
            default:
                this.f18770b.lambda$setStream$0(this.f18771c);
                return;
        }
    }
}
