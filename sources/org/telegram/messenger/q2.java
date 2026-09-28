package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17350a;
    public final FileLoadOperation f17351b;
    public final FileLoadOperationStream f17352c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17350a = i10;
        this.f17351b = fileLoadOperation;
        this.f17352c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17350a) {
            case 0:
                this.f17351b.lambda$removeStreamListener$5(this.f17352c);
                return;
            default:
                this.f17351b.lambda$setStream$0(this.f17352c);
                return;
        }
    }
}
