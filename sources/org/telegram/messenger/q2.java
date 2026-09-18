package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17279a;
    public final FileLoadOperation f17280b;
    public final FileLoadOperationStream f17281c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17279a = i10;
        this.f17280b = fileLoadOperation;
        this.f17281c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17279a) {
            case 0:
                this.f17280b.lambda$removeStreamListener$5(this.f17281c);
                return;
            default:
                this.f17280b.lambda$setStream$0(this.f17281c);
                return;
        }
    }
}
