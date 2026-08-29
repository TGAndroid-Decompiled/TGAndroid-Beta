package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f21222a;
    public final FileLoadOperation f21223b;
    public final boolean f21224c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f21222a = i10;
        this.f21223b = fileLoadOperation;
        this.f21224c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21222a) {
            case 0:
                this.f21223b.lambda$setIsPreloadVideoOperation$12(this.f21224c);
                return;
            case 1:
                this.f21223b.lambda$cancel$13(this.f21224c);
                return;
            case 2:
                this.f21223b.lambda$onFinishLoadingFile$17(this.f21224c);
                return;
            default:
                this.f21223b.lambda$onFinishLoadingFile$19(this.f21224c);
                return;
        }
    }
}
