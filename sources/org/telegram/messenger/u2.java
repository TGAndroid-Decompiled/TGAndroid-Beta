package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19058a;
    public final FileLoadOperation f19059b;
    public final FileLoadOperationStream f19060c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19058a = i10;
        this.f19059b = fileLoadOperation;
        this.f19060c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19058a) {
            case 0:
                this.f19059b.lambda$removeStreamListener$6(this.f19060c);
                return;
            default:
                this.f19059b.lambda$setStream$1(this.f19060c);
                return;
        }
    }
}
