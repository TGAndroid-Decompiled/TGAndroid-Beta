package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19720a;
    public final FileLoadOperation f19721b;
    public final FileLoadOperationStream f19722c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19720a = i10;
        this.f19721b = fileLoadOperation;
        this.f19722c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19720a) {
            case 0:
                this.f19721b.lambda$removeStreamListener$6(this.f19722c);
                return;
            default:
                this.f19721b.lambda$setStream$1(this.f19722c);
                return;
        }
    }
}
