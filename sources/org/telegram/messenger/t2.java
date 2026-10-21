package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19563a;
    public final FileLoadOperation f19564b;
    public final boolean f19565c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19563a = i10;
        this.f19564b = fileLoadOperation;
        this.f19565c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                this.f19564b.lambda$setIsPreloadVideoOperation$13(this.f19565c);
                return;
            case 1:
                this.f19564b.lambda$onFinishLoadingFile$18(this.f19565c);
                return;
            case 2:
                this.f19564b.lambda$onFinishLoadingFile$20(this.f19565c);
                return;
            default:
                this.f19564b.lambda$cancel$14(this.f19565c);
                return;
        }
    }
}
