package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17111a;
    public final FileLoadOperation f17112b;
    public final FileLoadOperationStream f17113c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17111a = i10;
        this.f17112b = fileLoadOperation;
        this.f17113c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17111a) {
            case 0:
                this.f17112b.lambda$removeStreamListener$5(this.f17113c);
                return;
            default:
                this.f17112b.lambda$setStream$0(this.f17113c);
                return;
        }
    }
}
