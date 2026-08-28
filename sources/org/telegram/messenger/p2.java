package org.telegram.messenger;
public final class p2 implements Runnable {
    public final int f21195a;
    public final FileLoadOperation f21196b;
    public final boolean f21197c;

    public p2(FileLoadOperation fileLoadOperation, boolean z10, int i9) {
        this.f21195a = i9;
        this.f21196b = fileLoadOperation;
        this.f21197c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21195a) {
            case 0:
                this.f21196b.lambda$setIsPreloadVideoOperation$12(this.f21197c);
                return;
            case 1:
                this.f21196b.lambda$cancel$13(this.f21197c);
                return;
            case 2:
                this.f21196b.lambda$onFinishLoadingFile$17(this.f21197c);
                return;
            default:
                this.f21196b.lambda$onFinishLoadingFile$19(this.f21197c);
                return;
        }
    }
}
