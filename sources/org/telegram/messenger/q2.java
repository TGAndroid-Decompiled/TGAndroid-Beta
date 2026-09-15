package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17102a;
    public final FileLoadOperation f17103b;
    public final FileLoadOperationStream f17104c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17102a = i10;
        this.f17103b = fileLoadOperation;
        this.f17104c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17102a) {
            case 0:
                this.f17103b.lambda$removeStreamListener$5(this.f17104c);
                return;
            default:
                this.f17103b.lambda$setStream$0(this.f17104c);
                return;
        }
    }
}
