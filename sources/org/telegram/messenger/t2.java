package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19638a;
    public final FileLoadOperation f19639b;
    public final boolean f19640c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19638a = i10;
        this.f19639b = fileLoadOperation;
        this.f19640c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19638a) {
            case 0:
                this.f19639b.lambda$setIsPreloadVideoOperation$13(this.f19640c);
                return;
            case 1:
                this.f19639b.lambda$onFinishLoadingFile$18(this.f19640c);
                return;
            case 2:
                this.f19639b.lambda$onFinishLoadingFile$20(this.f19640c);
                return;
            default:
                this.f19639b.lambda$cancel$14(this.f19640c);
                return;
        }
    }
}
