package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f19826a;
    public final FileLoadOperation f19827b;
    public final FileLoadOperationStream f19828c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19826a = i10;
        this.f19827b = fileLoadOperation;
        this.f19828c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19826a) {
            case 0:
                this.f19827b.lambda$removeStreamListener$5(this.f19828c);
                return;
            default:
                this.f19827b.lambda$setStream$0(this.f19828c);
                return;
        }
    }
}
