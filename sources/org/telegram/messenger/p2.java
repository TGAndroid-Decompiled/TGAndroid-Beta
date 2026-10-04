package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18840a;
    public final FileLoadOperation f18841b;
    public final boolean f18842c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18840a = i10;
        this.f18841b = fileLoadOperation;
        this.f18842c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18840a) {
            case 0:
                this.f18841b.lambda$setIsPreloadVideoOperation$12(this.f18842c);
                return;
            case 1:
                this.f18841b.lambda$cancel$13(this.f18842c);
                return;
            case 2:
                this.f18841b.lambda$onFinishLoadingFile$17(this.f18842c);
                return;
            default:
                this.f18841b.lambda$onFinishLoadingFile$19(this.f18842c);
                return;
        }
    }
}
