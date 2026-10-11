package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18798a;
    public final FileLoadOperation f18799b;
    public final boolean f18800c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18798a = i10;
        this.f18799b = fileLoadOperation;
        this.f18800c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18798a) {
            case 0:
                this.f18799b.lambda$setIsPreloadVideoOperation$13(this.f18800c);
                return;
            case 1:
                this.f18799b.lambda$onFinishLoadingFile$18(this.f18800c);
                return;
            case 2:
                this.f18799b.lambda$onFinishLoadingFile$20(this.f18800c);
                return;
            default:
                this.f18799b.lambda$cancel$14(this.f18800c);
                return;
        }
    }
}
