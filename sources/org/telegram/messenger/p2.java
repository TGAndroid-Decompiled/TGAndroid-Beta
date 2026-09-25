package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17250a;
    public final FileLoadOperation f17251b;
    public final boolean f17252c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17250a = i10;
        this.f17251b = fileLoadOperation;
        this.f17252c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17250a) {
            case 0:
                this.f17251b.lambda$setIsPreloadVideoOperation$12(this.f17252c);
                return;
            case 1:
                this.f17251b.lambda$cancel$13(this.f17252c);
                return;
            case 2:
                this.f17251b.lambda$onFinishLoadingFile$17(this.f17252c);
                return;
            default:
                this.f17251b.lambda$onFinishLoadingFile$19(this.f17252c);
                return;
        }
    }
}
