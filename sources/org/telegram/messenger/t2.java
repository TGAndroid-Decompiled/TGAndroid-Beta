package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f18945a;
    public final FileLoadOperation f18946b;
    public final boolean f18947c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18945a = i10;
        this.f18946b = fileLoadOperation;
        this.f18947c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18945a) {
            case 0:
                this.f18946b.lambda$setIsPreloadVideoOperation$13(this.f18947c);
                return;
            case 1:
                this.f18946b.lambda$onFinishLoadingFile$18(this.f18947c);
                return;
            case 2:
                this.f18946b.lambda$onFinishLoadingFile$20(this.f18947c);
                return;
            default:
                this.f18946b.lambda$cancel$14(this.f18947c);
                return;
        }
    }
}
