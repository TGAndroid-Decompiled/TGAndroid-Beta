package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f18262a;
    public final FileLoadOperation f18263b;
    public final FileLoadOperationStream f18264c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18262a = i10;
        this.f18263b = fileLoadOperation;
        this.f18264c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18262a) {
            case 0:
                this.f18263b.lambda$removeStreamListener$5(this.f18264c);
                return;
            default:
                this.f18263b.lambda$setStream$0(this.f18264c);
                return;
        }
    }
}
