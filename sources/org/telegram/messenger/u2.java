package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19057a;
    public final FileLoadOperation f19058b;
    public final FileLoadOperationStream f19059c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19057a = i10;
        this.f19058b = fileLoadOperation;
        this.f19059c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19057a) {
            case 0:
                this.f19058b.lambda$removeStreamListener$6(this.f19059c);
                return;
            default:
                this.f19058b.lambda$setStream$1(this.f19059c);
                return;
        }
    }
}
