package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18749a;
    public final FileLoadOperation f18750b;
    public final FileLoadOperationStream f18751c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18749a = i10;
        this.f18750b = fileLoadOperation;
        this.f18751c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18749a) {
            case 0:
                this.f18750b.lambda$removeStreamListener$5(this.f18751c);
                return;
            default:
                this.f18750b.lambda$setStream$0(this.f18751c);
                return;
        }
    }
}
