package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f17093a;
    public final FileLoadOperation f17094b;
    public final FileLoadOperationStream f17095c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f17093a = i10;
        this.f17094b = fileLoadOperation;
        this.f17095c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f17093a) {
            case 0:
                this.f17094b.lambda$removeStreamListener$5(this.f17095c);
                return;
            default:
                this.f17094b.lambda$setStream$0(this.f17095c);
                return;
        }
    }
}
