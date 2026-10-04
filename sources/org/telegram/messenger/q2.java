package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18942a;
    public final FileLoadOperation f18943b;
    public final FileLoadOperationStream f18944c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18942a = i10;
        this.f18943b = fileLoadOperation;
        this.f18944c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18942a) {
            case 0:
                this.f18943b.lambda$removeStreamListener$5(this.f18944c);
                return;
            default:
                this.f18943b.lambda$setStream$0(this.f18944c);
                return;
        }
    }
}
