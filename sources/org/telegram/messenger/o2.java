package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18740a;
    public final FileLoadOperation f18741b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18740a = i10;
        this.f18741b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18740a) {
            case 0:
                this.f18741b.lambda$clearOperation$27();
                return;
            case 1:
                this.f18741b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f18741b.lambda$start$11();
                return;
            case 3:
                this.f18741b.lambda$pause$8();
                return;
            case 4:
                this.f18741b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f18741b.lambda$new$0();
                return;
            default:
                this.f18741b.lambda$new$7();
                return;
        }
    }
}
