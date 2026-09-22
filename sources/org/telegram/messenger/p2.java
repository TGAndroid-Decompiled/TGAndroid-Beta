package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17000a;
    public final FileLoadOperation f17001b;
    public final boolean f17002c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17000a = i10;
        this.f17001b = fileLoadOperation;
        this.f17002c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17000a) {
            case 0:
                this.f17001b.lambda$setIsPreloadVideoOperation$12(this.f17002c);
                return;
            case 1:
                this.f17001b.lambda$cancel$13(this.f17002c);
                return;
            case 2:
                this.f17001b.lambda$onFinishLoadingFile$17(this.f17002c);
                return;
            default:
                this.f17001b.lambda$onFinishLoadingFile$19(this.f17002c);
                return;
        }
    }
}
