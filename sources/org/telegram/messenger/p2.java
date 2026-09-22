package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17236a;
    public final FileLoadOperation f17237b;
    public final boolean f17238c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17236a = i10;
        this.f17237b = fileLoadOperation;
        this.f17238c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17236a) {
            case 0:
                this.f17237b.lambda$setIsPreloadVideoOperation$12(this.f17238c);
                return;
            case 1:
                this.f17237b.lambda$cancel$13(this.f17238c);
                return;
            case 2:
                this.f17237b.lambda$onFinishLoadingFile$17(this.f17238c);
                return;
            default:
                this.f17237b.lambda$onFinishLoadingFile$19(this.f17238c);
                return;
        }
    }
}
