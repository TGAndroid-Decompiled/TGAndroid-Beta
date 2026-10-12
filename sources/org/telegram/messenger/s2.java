package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f18349a;
    public final FileLoadOperation f18350b;
    public final boolean f18351c;

    public s2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18349a = i10;
        this.f18350b = fileLoadOperation;
        this.f18351c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18349a) {
            case 0:
                this.f18350b.lambda$setIsPreloadVideoOperation$13(this.f18351c);
                return;
            case 1:
                this.f18350b.lambda$onFinishLoadingFile$18(this.f18351c);
                return;
            case 2:
                this.f18350b.lambda$onFinishLoadingFile$20(this.f18351c);
                return;
            default:
                this.f18350b.lambda$cancel$14(this.f18351c);
                return;
        }
    }
}
