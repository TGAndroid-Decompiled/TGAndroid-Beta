package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f18055a;
    public final FileLoadOperation f18056b;
    public final boolean f18057c;

    public s2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f18055a = i10;
        this.f18056b = fileLoadOperation;
        this.f18057c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18055a) {
            case 0:
                this.f18056b.lambda$setIsPreloadVideoOperation$13(this.f18057c);
                return;
            case 1:
                this.f18056b.lambda$onFinishLoadingFile$18(this.f18057c);
                return;
            case 2:
                this.f18056b.lambda$onFinishLoadingFile$20(this.f18057c);
                return;
            default:
                this.f18056b.lambda$cancel$14(this.f18057c);
                return;
        }
    }
}
