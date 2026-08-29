package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f21112a;
    public final FileLoadOperation f21113b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f21112a = i10;
        this.f21113b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21112a) {
            case 0:
                this.f21113b.lambda$clearOperation$26();
                return;
            case 1:
                this.f21113b.lambda$start$10();
                return;
            case 2:
                this.f21113b.lambda$pause$7();
                return;
            case 3:
                this.f21113b.lambda$onFinishLoadingFile$18();
                return;
            case 4:
                this.f21113b.lambda$cancelOnStage$14();
                return;
            default:
                this.f21113b.lambda$new$6();
                return;
        }
    }
}
