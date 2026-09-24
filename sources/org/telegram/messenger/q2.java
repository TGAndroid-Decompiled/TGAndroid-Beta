package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17331a;
    public final FileLoadOperation f17332b;
    public final FileLoadOperationStream f17333c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17331a = i10;
        this.f17332b = fileLoadOperation;
        this.f17333c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17331a) {
            case 0:
                this.f17332b.lambda$removeStreamListener$5(this.f17333c);
                return;
            default:
                this.f17332b.lambda$setStream$0(this.f17333c);
                return;
        }
    }
}
