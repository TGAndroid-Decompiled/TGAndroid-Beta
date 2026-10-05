package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18844a;
    public final FileLoadOperation f18845b;
    public final boolean f18846c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18844a = i10;
        this.f18845b = fileLoadOperation;
        this.f18846c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18844a) {
            case 0:
                this.f18845b.lambda$setIsPreloadVideoOperation$12(this.f18846c);
                return;
            case 1:
                this.f18845b.lambda$cancel$13(this.f18846c);
                return;
            case 2:
                this.f18845b.lambda$onFinishLoadingFile$17(this.f18846c);
                return;
            default:
                this.f18845b.lambda$onFinishLoadingFile$19(this.f18846c);
                return;
        }
    }
}
