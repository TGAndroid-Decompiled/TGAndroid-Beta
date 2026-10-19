package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f19460a;
    public final FileLoadOperation f19461b;
    public final boolean f19462c;

    public s2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19460a = i10;
        this.f19461b = fileLoadOperation;
        this.f19462c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19460a) {
            case 0:
                this.f19461b.lambda$setIsPreloadVideoOperation$13(this.f19462c);
                return;
            case 1:
                this.f19461b.lambda$onFinishLoadingFile$18(this.f19462c);
                return;
            case 2:
                this.f19461b.lambda$onFinishLoadingFile$20(this.f19462c);
                return;
            default:
                this.f19461b.lambda$cancel$14(this.f19462c);
                return;
        }
    }
}
