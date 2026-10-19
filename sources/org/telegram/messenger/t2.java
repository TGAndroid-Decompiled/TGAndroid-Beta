package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19539a;
    public final FileLoadOperation f19540b;
    public final FileLoadOperationStream f19541c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19539a = i10;
        this.f19540b = fileLoadOperation;
        this.f19541c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19539a) {
            case 0:
                this.f19540b.lambda$removeStreamListener$6(this.f19541c);
                return;
            default:
                this.f19540b.lambda$setStream$1(this.f19541c);
                return;
        }
    }
}
