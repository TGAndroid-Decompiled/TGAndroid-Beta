package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17346a;
    public final FileLoadOperation f17347b;
    public final FileLoadOperationStream f17348c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17346a = i10;
        this.f17347b = fileLoadOperation;
        this.f17348c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17346a) {
            case 0:
                this.f17347b.lambda$removeStreamListener$5(this.f17348c);
                return;
            default:
                this.f17347b.lambda$setStream$0(this.f17348c);
                return;
        }
    }
}
