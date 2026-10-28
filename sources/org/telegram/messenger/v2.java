package org.telegram.messenger;
public final class v2 implements Runnable {
    public final int f21488a;
    public final FileLoadOperation f21489b;
    public final FileLoadOperationStream f21490c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f21488a = i10;
        this.f21489b = fileLoadOperation;
        this.f21490c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f21488a) {
            case 0:
                this.f21489b.lambda$removeStreamListener$6(this.f21490c);
                return;
            default:
                this.f21489b.lambda$setStream$1(this.f21490c);
                return;
        }
    }
}
