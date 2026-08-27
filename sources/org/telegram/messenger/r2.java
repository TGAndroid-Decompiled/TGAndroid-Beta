package org.telegram.messenger;

public final class r2 implements Runnable {

    public final int f21399a;

    public final FileLoadOperation f21400b;

    public final FileLoadOperationStream f21401c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f21399a = i10;
        this.f21400b = fileLoadOperation;
        this.f21401c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f21399a) {
            case 0:
                this.f21400b.lambda$removeStreamListener$5(this.f21401c);
                break;
            default:
                this.f21400b.lambda$setStream$0(this.f21401c);
                break;
        }
    }
}
