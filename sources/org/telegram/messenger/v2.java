package org.telegram.messenger;
public final class v2 implements Runnable {
    public final int f21479a;
    public final FileLoadOperation f21480b;
    public final FileLoadOperationStream f21481c;

    public v2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f21479a = i10;
        this.f21480b = fileLoadOperation;
        this.f21481c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f21479a) {
            case 0:
                this.f21480b.lambda$removeStreamListener$6(this.f21481c);
                return;
            default:
                this.f21480b.lambda$setStream$1(this.f21481c);
                return;
        }
    }
}
