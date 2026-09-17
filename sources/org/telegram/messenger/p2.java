package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18696a;
    public final FileLoadOperation f18697b;
    public final boolean f18698c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18696a = i10;
        this.f18697b = fileLoadOperation;
        this.f18698c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18696a) {
            case 0:
                this.f18697b.lambda$setIsPreloadVideoOperation$12(this.f18698c);
                return;
            case 1:
                this.f18697b.lambda$cancel$13(this.f18698c);
                return;
            case 2:
                this.f18697b.lambda$onFinishLoadingFile$17(this.f18698c);
                return;
            default:
                this.f18697b.lambda$onFinishLoadingFile$19(this.f18698c);
                return;
        }
    }
}
