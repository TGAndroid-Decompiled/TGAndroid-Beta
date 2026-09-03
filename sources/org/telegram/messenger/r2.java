package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f18236a;
    public final FileLoadOperation f18237b;
    public final FileLoadOperationStream f18238c;

    public r2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.f18236a = i10;
        this.f18237b = fileLoadOperation;
        this.f18238c = fileLoadOperationStream;
    }

    @Override
    public final void run() {
        switch (this.f18236a) {
            case 0:
                this.f18237b.lambda$removeStreamListener$5(this.f18238c);
                return;
            default:
                this.f18237b.lambda$setStream$0(this.f18238c);
                return;
        }
    }
}
