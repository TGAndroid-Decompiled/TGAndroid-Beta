package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f19559a;
    public final FileLoadOperation f19560b;
    public final boolean f19561c;

    public t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.f19559a = i10;
        this.f19560b = fileLoadOperation;
        this.f19561c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19559a) {
            case 0:
                this.f19560b.lambda$setIsPreloadVideoOperation$13(this.f19561c);
                return;
            case 1:
                this.f19560b.lambda$onFinishLoadingFile$18(this.f19561c);
                return;
            case 2:
                this.f19560b.lambda$onFinishLoadingFile$20(this.f19561c);
                return;
            default:
                this.f19560b.lambda$cancel$14(this.f19561c);
                return;
        }
    }
}
