package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f19828a;
    public final FileLoadOperation f19829b;
    public final FileLoadOperationStream f19830c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19828a = i10;
        this.f19829b = fileLoadOperation;
        this.f19830c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19828a) {
            case 0:
                this.f19829b.lambda$removeStreamListener$5(this.f19830c);
                return;
            default:
                this.f19829b.lambda$setStream$0(this.f19830c);
                return;
        }
    }
}
