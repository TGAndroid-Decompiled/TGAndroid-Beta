package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f21279a;
    public final FileLoadOperation f21280b;
    public final FileLoadOperationStream f21281c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i9) {
        this.f21279a = i9;
        this.f21280b = fileLoadOperation;
        this.f21281c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f21279a) {
            case 0:
                this.f21280b.lambda$removeStreamListener$5(this.f21281c);
                return;
            default:
                this.f21280b.lambda$setStream$0(this.f21281c);
                return;
        }
    }
}
