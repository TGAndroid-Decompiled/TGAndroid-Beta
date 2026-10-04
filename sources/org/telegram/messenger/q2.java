package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18943a;
    public final FileLoadOperation f18944b;
    public final FileLoadOperationStream f18945c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18943a = i10;
        this.f18944b = fileLoadOperation;
        this.f18945c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18943a) {
            case 0:
                this.f18944b.lambda$removeStreamListener$5(this.f18945c);
                return;
            default:
                this.f18944b.lambda$setStream$0(this.f18945c);
                return;
        }
    }
}
