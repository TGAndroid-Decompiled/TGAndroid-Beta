package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f19462a;
    public final FileLoadOperation f19463b;
    public final boolean f19464c;

    public s2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19462a = i10;
        this.f19463b = fileLoadOperation;
        this.f19464c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19462a) {
            case 0:
                this.f19463b.lambda$setIsPreloadVideoOperation$13(this.f19464c);
                return;
            case 1:
                this.f19463b.lambda$onFinishLoadingFile$18(this.f19464c);
                return;
            case 2:
                this.f19463b.lambda$onFinishLoadingFile$20(this.f19464c);
                return;
            default:
                this.f19463b.lambda$cancel$14(this.f19464c);
                return;
        }
    }
}
