package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17324a;
    public final FileLoadOperation f17325b;
    public final FileLoadOperationStream f17326c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17324a = i10;
        this.f17325b = fileLoadOperation;
        this.f17326c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17324a) {
            case 0:
                this.f17325b.lambda$removeStreamListener$5(this.f17326c);
                return;
            default:
                this.f17325b.lambda$setStream$0(this.f17326c);
                return;
        }
    }
}
