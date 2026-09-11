package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18669a;
    public final FileLoadOperation f18670b;
    public final boolean f18671c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18669a = i10;
        this.f18670b = fileLoadOperation;
        this.f18671c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18669a) {
            case 0:
                this.f18670b.lambda$setIsPreloadVideoOperation$12(this.f18671c);
                return;
            case 1:
                this.f18670b.lambda$cancel$13(this.f18671c);
                return;
            case 2:
                this.f18670b.lambda$onFinishLoadingFile$17(this.f18671c);
                return;
            default:
                this.f18670b.lambda$onFinishLoadingFile$19(this.f18671c);
                return;
        }
    }
}
