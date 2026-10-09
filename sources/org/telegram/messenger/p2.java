package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18793a;
    public final FileLoadOperation f18794b;
    public final boolean f18795c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18793a = i10;
        this.f18794b = fileLoadOperation;
        this.f18795c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18793a) {
            case 0:
                this.f18794b.lambda$setIsPreloadVideoOperation$13(this.f18795c);
                return;
            case 1:
                this.f18794b.lambda$onFinishLoadingFile$18(this.f18795c);
                return;
            case 2:
                this.f18794b.lambda$onFinishLoadingFile$20(this.f18795c);
                return;
            default:
                this.f18794b.lambda$cancel$14(this.f18795c);
                return;
        }
    }
}
