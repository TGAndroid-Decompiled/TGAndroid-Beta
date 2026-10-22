package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19650a;
    public final FileLoadOperation f19651b;
    public final FileLoadOperationStream f19652c;

    public u2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19650a = i10;
        this.f19651b = fileLoadOperation;
        this.f19652c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19650a) {
            case 0:
                this.f19651b.lambda$removeStreamListener$6(this.f19652c);
                return;
            default:
                this.f19651b.lambda$setStream$1(this.f19652c);
                return;
        }
    }
}
