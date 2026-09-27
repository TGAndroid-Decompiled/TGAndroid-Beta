package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17342a;
    public final FileLoadOperation f17343b;
    public final FileLoadOperationStream f17344c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17342a = i10;
        this.f17343b = fileLoadOperation;
        this.f17344c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17342a) {
            case 0:
                this.f17343b.lambda$removeStreamListener$5(this.f17344c);
                return;
            default:
                this.f17343b.lambda$setStream$0(this.f17344c);
                return;
        }
    }
}
