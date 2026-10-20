package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19634a;
    public final FileLoadOperation f19635b;
    public final FileLoadOperationStream f19636c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19634a = i10;
        this.f19635b = fileLoadOperation;
        this.f19636c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19634a) {
            case 0:
                this.f19635b.lambda$removeStreamListener$6(this.f19636c);
                return;
            default:
                this.f19635b.lambda$setStream$1(this.f19636c);
                return;
        }
    }
}
