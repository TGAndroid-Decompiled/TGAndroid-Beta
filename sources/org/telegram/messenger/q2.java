package org.telegram.messenger;

public final class q2 implements Runnable {

    public final int f21311a;

    public final FileLoadOperation f21312b;

    public final boolean f21313c;

    public q2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f21311a = i10;
        this.f21312b = fileLoadOperation;
        this.f21313c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21311a) {
            case 0:
                this.f21312b.lambda$setIsPreloadVideoOperation$12(this.f21313c);
                break;
            case 1:
                this.f21312b.lambda$cancel$13(this.f21313c);
                break;
            case 2:
                this.f21312b.lambda$onFinishLoadingFile$17(this.f21313c);
                break;
            default:
                this.f21312b.lambda$onFinishLoadingFile$19(this.f21313c);
                break;
        }
    }
}
