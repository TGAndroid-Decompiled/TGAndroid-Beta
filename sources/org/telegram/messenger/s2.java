package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f19470a;
    public final FileLoadOperation f19471b;
    public final boolean f19472c;

    public s2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19470a = i10;
        this.f19471b = fileLoadOperation;
        this.f19472c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19470a) {
            case 0:
                this.f19471b.lambda$setIsPreloadVideoOperation$13(this.f19472c);
                return;
            case 1:
                this.f19471b.lambda$onFinishLoadingFile$18(this.f19472c);
                return;
            case 2:
                this.f19471b.lambda$onFinishLoadingFile$20(this.f19472c);
                return;
            default:
                this.f19471b.lambda$cancel$14(this.f19472c);
                return;
        }
    }
}
