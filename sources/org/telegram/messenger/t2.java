package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f18153a;
    public final FileLoadOperation f18154b;
    public final FileLoadOperationStream f18155c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18153a = i10;
        this.f18154b = fileLoadOperation;
        this.f18155c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18153a) {
            case 0:
                this.f18154b.lambda$removeStreamListener$6(this.f18155c);
                return;
            default:
                this.f18154b.lambda$setStream$1(this.f18155c);
                return;
        }
    }
}
