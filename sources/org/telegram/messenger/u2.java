package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19715a;
    public final FileLoadOperation f19716b;
    public final FileLoadOperationStream f19717c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19715a = i10;
        this.f19716b = fileLoadOperation;
        this.f19717c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19715a) {
            case 0:
                this.f19716b.lambda$removeStreamListener$6(this.f19717c);
                return;
            default:
                this.f19716b.lambda$setStream$1(this.f19717c);
                return;
        }
    }
}
