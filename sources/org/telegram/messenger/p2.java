package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18797a;
    public final FileLoadOperation f18798b;
    public final boolean f18799c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18797a = i10;
        this.f18798b = fileLoadOperation;
        this.f18799c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18797a) {
            case 0:
                this.f18798b.lambda$setIsPreloadVideoOperation$13(this.f18799c);
                return;
            case 1:
                this.f18798b.lambda$onFinishLoadingFile$18(this.f18799c);
                return;
            case 2:
                this.f18798b.lambda$onFinishLoadingFile$20(this.f18799c);
                return;
            default:
                this.f18798b.lambda$cancel$14(this.f18799c);
                return;
        }
    }
}
