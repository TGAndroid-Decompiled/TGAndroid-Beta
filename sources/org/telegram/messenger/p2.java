package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17254a;
    public final FileLoadOperation f17255b;
    public final boolean f17256c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17254a = i10;
        this.f17255b = fileLoadOperation;
        this.f17256c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17254a) {
            case 0:
                this.f17255b.lambda$setIsPreloadVideoOperation$12(this.f17256c);
                return;
            case 1:
                this.f17255b.lambda$cancel$13(this.f17256c);
                return;
            case 2:
                this.f17255b.lambda$onFinishLoadingFile$17(this.f17256c);
                return;
            default:
                this.f17255b.lambda$onFinishLoadingFile$19(this.f17256c);
                return;
        }
    }
}
