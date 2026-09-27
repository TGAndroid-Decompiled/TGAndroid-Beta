package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17247a;
    public final FileLoadOperation f17248b;
    public final boolean f17249c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17247a = i10;
        this.f17248b = fileLoadOperation;
        this.f17249c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17247a) {
            case 0:
                this.f17248b.lambda$setIsPreloadVideoOperation$12(this.f17249c);
                return;
            case 1:
                this.f17248b.lambda$cancel$13(this.f17249c);
                return;
            case 2:
                this.f17248b.lambda$onFinishLoadingFile$17(this.f17249c);
                return;
            default:
                this.f17248b.lambda$onFinishLoadingFile$19(this.f17249c);
                return;
        }
    }
}
