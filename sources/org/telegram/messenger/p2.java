package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17255a;
    public final FileLoadOperation f17256b;
    public final boolean f17257c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17255a = i10;
        this.f17256b = fileLoadOperation;
        this.f17257c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17255a) {
            case 0:
                this.f17256b.lambda$setIsPreloadVideoOperation$12(this.f17257c);
                return;
            case 1:
                this.f17256b.lambda$cancel$13(this.f17257c);
                return;
            case 2:
                this.f17256b.lambda$onFinishLoadingFile$17(this.f17257c);
                return;
            default:
                this.f17256b.lambda$onFinishLoadingFile$19(this.f17257c);
                return;
        }
    }
}
