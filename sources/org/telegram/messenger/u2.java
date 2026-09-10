package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f16451a;
    public final FileLoadOperation f16452b;
    public final FileLoadOperationStream f16453c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f16451a = i10;
        this.f16452b = fileLoadOperation;
        this.f16453c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f16451a) {
            case 0:
                this.f16452b.lambda$removeStreamListener$5(this.f16453c);
                return;
            default:
                this.f16452b.lambda$setStream$0(this.f16453c);
                return;
        }
    }
}
