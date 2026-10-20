package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19565a;
    public final FileLoadOperation f19566b;
    public final boolean f19567c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19565a = i10;
        this.f19566b = fileLoadOperation;
        this.f19567c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19565a) {
            case 0:
                this.f19566b.lambda$setIsPreloadVideoOperation$13(this.f19567c);
                return;
            case 1:
                this.f19566b.lambda$onFinishLoadingFile$18(this.f19567c);
                return;
            case 2:
                this.f19566b.lambda$onFinishLoadingFile$20(this.f19567c);
                return;
            default:
                this.f19566b.lambda$cancel$14(this.f19567c);
                return;
        }
    }
}
