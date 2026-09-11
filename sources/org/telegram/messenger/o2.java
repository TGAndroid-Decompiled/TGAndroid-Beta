package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18564a;
    public final FileLoadOperation f18565b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18564a = i10;
        this.f18565b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18564a) {
            case 0:
                this.f18565b.lambda$clearOperation$26();
                return;
            case 1:
                this.f18565b.lambda$start$10();
                return;
            case 2:
                this.f18565b.lambda$pause$7();
                return;
            case 3:
                this.f18565b.lambda$onFinishLoadingFile$18();
                return;
            case 4:
                this.f18565b.lambda$cancelOnStage$14();
                return;
            default:
                this.f18565b.lambda$new$6();
                return;
        }
    }
}
