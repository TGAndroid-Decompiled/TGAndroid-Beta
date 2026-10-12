package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f18946a;
    public final FileLoadOperation f18947b;
    public final boolean f18948c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18946a = i10;
        this.f18947b = fileLoadOperation;
        this.f18948c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18946a) {
            case 0:
                this.f18947b.lambda$setIsPreloadVideoOperation$13(this.f18948c);
                return;
            case 1:
                this.f18947b.lambda$onFinishLoadingFile$18(this.f18948c);
                return;
            case 2:
                this.f18947b.lambda$onFinishLoadingFile$20(this.f18948c);
                return;
            default:
                this.f18947b.lambda$cancel$14(this.f18948c);
                return;
        }
    }
}
