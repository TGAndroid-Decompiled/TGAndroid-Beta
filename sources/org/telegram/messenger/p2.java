package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f17180a;
    public final FileLoadOperation f17181b;
    public final boolean f17182c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f17180a = i10;
        this.f17181b = fileLoadOperation;
        this.f17182c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17180a) {
            case 0:
                this.f17181b.lambda$setIsPreloadVideoOperation$12(this.f17182c);
                return;
            case 1:
                this.f17181b.lambda$cancel$13(this.f17182c);
                return;
            case 2:
                this.f17181b.lambda$onFinishLoadingFile$17(this.f17182c);
                return;
            default:
                this.f17181b.lambda$onFinishLoadingFile$19(this.f17182c);
                return;
        }
    }
}
