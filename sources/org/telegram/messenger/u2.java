package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f21367a;
    public final FileLoadOperation f21368b;
    public final boolean f21369c;

    public u2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f21367a = i10;
        this.f21368b = fileLoadOperation;
        this.f21369c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21367a) {
            case 0:
                this.f21368b.lambda$setIsPreloadVideoOperation$13(this.f21369c);
                return;
            case 1:
                this.f21368b.lambda$onFinishLoadingFile$18(this.f21369c);
                return;
            case 2:
                this.f21368b.lambda$onFinishLoadingFile$20(this.f21369c);
                return;
            default:
                this.f21368b.lambda$cancel$14(this.f21369c);
                return;
        }
    }
}
