package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19544a;
    public final FileLoadOperation f19545b;
    public final FileLoadOperationStream f19546c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19544a = i10;
        this.f19545b = fileLoadOperation;
        this.f19546c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19544a) {
            case 0:
                this.f19545b.lambda$removeStreamListener$6(this.f19546c);
                return;
            default:
                this.f19545b.lambda$setStream$1(this.f19546c);
                return;
        }
    }
}
