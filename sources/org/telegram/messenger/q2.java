package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17366a;
    public final FileLoadOperation f17367b;
    public final FileLoadOperationStream f17368c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17366a = i10;
        this.f17367b = fileLoadOperation;
        this.f17368c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17366a) {
            case 0:
                this.f17367b.lambda$removeStreamListener$5(this.f17368c);
                return;
            default:
                this.f17367b.lambda$setStream$0(this.f17368c);
                return;
        }
    }
}
