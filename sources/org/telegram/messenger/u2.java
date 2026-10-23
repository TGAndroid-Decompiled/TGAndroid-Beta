package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19655a;
    public final FileLoadOperation f19656b;
    public final FileLoadOperationStream f19657c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19655a = i10;
        this.f19656b = fileLoadOperation;
        this.f19657c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19655a) {
            case 0:
                this.f19656b.lambda$removeStreamListener$6(this.f19657c);
                return;
            default:
                this.f19656b.lambda$setStream$1(this.f19657c);
                return;
        }
    }
}
