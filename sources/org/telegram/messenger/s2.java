package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f19463a;
    public final FileLoadOperation f19464b;
    public final boolean f19465c;

    public s2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19463a = i10;
        this.f19464b = fileLoadOperation;
        this.f19465c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19463a) {
            case 0:
                this.f19464b.lambda$setIsPreloadVideoOperation$13(this.f19465c);
                return;
            case 1:
                this.f19464b.lambda$onFinishLoadingFile$18(this.f19465c);
                return;
            case 2:
                this.f19464b.lambda$onFinishLoadingFile$20(this.f19465c);
                return;
            default:
                this.f19464b.lambda$cancel$14(this.f19465c);
                return;
        }
    }
}
