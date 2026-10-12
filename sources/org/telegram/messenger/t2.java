package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f18451a;
    public final FileLoadOperation f18452b;
    public final FileLoadOperationStream f18453c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18451a = i10;
        this.f18452b = fileLoadOperation;
        this.f18453c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18451a) {
            case 0:
                this.f18452b.lambda$removeStreamListener$6(this.f18453c);
                return;
            default:
                this.f18452b.lambda$setStream$1(this.f18453c);
                return;
        }
    }
}
