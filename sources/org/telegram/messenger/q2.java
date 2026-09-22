package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17098a;
    public final FileLoadOperation f17099b;
    public final FileLoadOperationStream f17100c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17098a = i10;
        this.f17099b = fileLoadOperation;
        this.f17100c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17098a) {
            case 0:
                this.f17099b.lambda$removeStreamListener$5(this.f17100c);
                return;
            default:
                this.f17099b.lambda$setStream$0(this.f17100c);
                return;
        }
    }
}
