package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19573a;
    public final FileLoadOperation f19574b;
    public final boolean f19575c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19573a = i10;
        this.f19574b = fileLoadOperation;
        this.f19575c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19573a) {
            case 0:
                this.f19574b.lambda$setIsPreloadVideoOperation$13(this.f19575c);
                return;
            case 1:
                this.f19574b.lambda$onFinishLoadingFile$18(this.f19575c);
                return;
            case 2:
                this.f19574b.lambda$onFinishLoadingFile$20(this.f19575c);
                return;
            default:
                this.f19574b.lambda$cancel$14(this.f19575c);
                return;
        }
    }
}
