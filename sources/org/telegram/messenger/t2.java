package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f21263a;
    public final FileLoadOperation f21264b;

    public t2(FileLoadOperation fileLoadOperation, int i10) {
        this.f21263a = i10;
        this.f21264b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21263a) {
            case 0:
                this.f21264b.lambda$clearOperation$27();
                return;
            case 1:
                this.f21264b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f21264b.lambda$start$11();
                return;
            case 3:
                this.f21264b.lambda$pause$8();
                return;
            case 4:
                this.f21264b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f21264b.lambda$new$0();
                return;
            default:
                this.f21264b.lambda$new$7();
                return;
        }
    }
}
