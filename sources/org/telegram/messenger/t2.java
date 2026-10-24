package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19626a;
    public final FileLoadOperation f19627b;
    public final boolean f19628c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19626a = i10;
        this.f19627b = fileLoadOperation;
        this.f19628c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19626a) {
            case 0:
                this.f19627b.lambda$setIsPreloadVideoOperation$13(this.f19628c);
                return;
            case 1:
                this.f19627b.lambda$onFinishLoadingFile$18(this.f19628c);
                return;
            case 2:
                this.f19627b.lambda$onFinishLoadingFile$20(this.f19628c);
                return;
            default:
                this.f19627b.lambda$cancel$14(this.f19628c);
                return;
        }
    }
}
