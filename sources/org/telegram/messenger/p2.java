package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f18834a;
    public final FileLoadOperation f18835b;
    public final boolean f18836c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18834a = i10;
        this.f18835b = fileLoadOperation;
        this.f18836c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18834a) {
            case 0:
                this.f18835b.lambda$setIsPreloadVideoOperation$13(this.f18836c);
                return;
            case 1:
                this.f18835b.lambda$onFinishLoadingFile$18(this.f18836c);
                return;
            case 2:
                this.f18835b.lambda$onFinishLoadingFile$20(this.f18836c);
                return;
            default:
                this.f18835b.lambda$cancel$14(this.f18836c);
                return;
        }
    }
}
