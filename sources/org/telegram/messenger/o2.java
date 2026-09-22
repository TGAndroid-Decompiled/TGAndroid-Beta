package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f17141a;
    public final FileLoadOperation f17142b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f17141a = i10;
        this.f17142b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17141a) {
            case 0:
                this.f17142b.lambda$clearOperation$26();
                return;
            case 1:
                this.f17142b.lambda$start$10();
                return;
            case 2:
                this.f17142b.lambda$pause$7();
                return;
            case 3:
                this.f17142b.lambda$onFinishLoadingFile$18();
                return;
            case 4:
                this.f17142b.lambda$cancelOnStage$14();
                return;
            default:
                this.f17142b.lambda$new$6();
                return;
        }
    }
}
