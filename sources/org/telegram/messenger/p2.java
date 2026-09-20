package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17221a;
    public final FileLoadOperation f17222b;
    public final boolean f17223c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17221a = i10;
        this.f17222b = fileLoadOperation;
        this.f17223c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17221a) {
            case 0:
                this.f17222b.lambda$setIsPreloadVideoOperation$12(this.f17223c);
                return;
            case 1:
                this.f17222b.lambda$cancel$13(this.f17223c);
                return;
            case 2:
                this.f17222b.lambda$onFinishLoadingFile$17(this.f17223c);
                return;
            default:
                this.f17222b.lambda$onFinishLoadingFile$19(this.f17223c);
                return;
        }
    }
}
