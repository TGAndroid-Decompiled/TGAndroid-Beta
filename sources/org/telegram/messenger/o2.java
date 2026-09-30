package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f17168a;
    public final FileLoadOperation f17169b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f17168a = i10;
        this.f17169b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17168a) {
            case 0:
                this.f17169b.lambda$clearOperation$26();
                return;
            case 1:
                this.f17169b.lambda$start$10();
                return;
            case 2:
                this.f17169b.lambda$pause$7();
                return;
            case 3:
                this.f17169b.lambda$onFinishLoadingFile$18();
                return;
            case 4:
                this.f17169b.lambda$cancelOnStage$14();
                return;
            default:
                this.f17169b.lambda$new$6();
                return;
        }
    }
}
