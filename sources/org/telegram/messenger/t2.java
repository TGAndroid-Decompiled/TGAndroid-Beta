package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19547a;
    public final FileLoadOperation f19548b;
    public final FileLoadOperationStream f19549c;

    public t2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f19547a = i10;
        this.f19548b = fileLoadOperation;
        this.f19549c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f19547a) {
            case 0:
                this.f19548b.lambda$removeStreamListener$6(this.f19549c);
                return;
            default:
                this.f19548b.lambda$setStream$1(this.f19549c);
                return;
        }
    }
}
