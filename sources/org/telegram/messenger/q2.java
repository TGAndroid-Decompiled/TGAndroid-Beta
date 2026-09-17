package org.telegram.messenger;
public final class q2 implements Runnable {
    public final int f18796a;
    public final FileLoadOperation f18797b;
    public final FileLoadOperationStream f18798c;

    public q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18796a = i10;
        this.f18797b = fileLoadOperation;
        this.f18798c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18796a) {
            case 0:
                this.f18797b.lambda$removeStreamListener$5(this.f18798c);
                return;
            default:
                this.f18797b.lambda$setStream$0(this.f18798c);
                return;
        }
    }
}
