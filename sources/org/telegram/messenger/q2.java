package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17349a;
    public final FileLoadOperation f17350b;
    public final FileLoadOperationStream f17351c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17349a = i10;
        this.f17350b = fileLoadOperation;
        this.f17351c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17349a) {
            case 0:
                this.f17350b.lambda$removeStreamListener$5(this.f17351c);
                return;
            default:
                this.f17350b.lambda$setStream$0(this.f17351c);
                return;
        }
    }
}
