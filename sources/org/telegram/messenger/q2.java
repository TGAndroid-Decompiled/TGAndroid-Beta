package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18902a;
    public final FileLoadOperation f18903b;
    public final FileLoadOperationStream f18904c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18902a = i10;
        this.f18903b = fileLoadOperation;
        this.f18904c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18902a) {
            case 0:
                this.f18903b.lambda$removeStreamListener$6(this.f18904c);
                return;
            default:
                this.f18903b.lambda$setStream$1(this.f18904c);
                return;
        }
    }
}
