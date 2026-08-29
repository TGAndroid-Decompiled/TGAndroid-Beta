package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f21300a;
    public final FileLoadOperation f21301b;
    public final FileLoadOperationStream f21302c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f21300a = i10;
        this.f21301b = fileLoadOperation;
        this.f21302c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f21300a) {
            case 0:
                this.f21301b.lambda$removeStreamListener$5(this.f21302c);
                return;
            default:
                this.f21301b.lambda$setStream$0(this.f21302c);
                return;
        }
    }
}
