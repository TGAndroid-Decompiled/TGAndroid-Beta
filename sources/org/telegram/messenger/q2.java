package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18947a;
    public final FileLoadOperation f18948b;
    public final FileLoadOperationStream f18949c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18947a = i10;
        this.f18948b = fileLoadOperation;
        this.f18949c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18947a) {
            case 0:
                this.f18948b.lambda$removeStreamListener$5(this.f18949c);
                return;
            default:
                this.f18948b.lambda$setStream$0(this.f18949c);
                return;
        }
    }
}
