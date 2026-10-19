package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f19473a;
    public final FileLoadOperation f19474b;
    public final boolean f19475c;

    public s2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19473a = i10;
        this.f19474b = fileLoadOperation;
        this.f19475c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19473a) {
            case 0:
                this.f19474b.lambda$setIsPreloadVideoOperation$13(this.f19475c);
                return;
            case 1:
                this.f19474b.lambda$onFinishLoadingFile$18(this.f19475c);
                return;
            case 2:
                this.f19474b.lambda$onFinishLoadingFile$20(this.f19475c);
                return;
            default:
                this.f19474b.lambda$cancel$14(this.f19475c);
                return;
        }
    }
}
