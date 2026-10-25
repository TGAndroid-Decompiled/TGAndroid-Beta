package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f21382a;
    public final FileLoadOperation f21383b;
    public final boolean f21384c;

    public u2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f21382a = i10;
        this.f21383b = fileLoadOperation;
        this.f21384c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21382a) {
            case 0:
                this.f21383b.lambda$setIsPreloadVideoOperation$13(this.f21384c);
                return;
            case 1:
                this.f21383b.lambda$onFinishLoadingFile$18(this.f21384c);
                return;
            case 2:
                this.f21383b.lambda$onFinishLoadingFile$20(this.f21384c);
                return;
            default:
                this.f21383b.lambda$cancel$14(this.f21384c);
                return;
        }
    }
}
