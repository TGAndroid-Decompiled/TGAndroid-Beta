package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f18834a;
    public final FileLoadOperation f18835b;

    public s2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18834a = i10;
        this.f18835b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18834a) {
            case 0:
                this.f18835b.lambda$clearOperation$27();
                return;
            case 1:
                this.f18835b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f18835b.lambda$start$11();
                return;
            case 3:
                this.f18835b.lambda$pause$8();
                return;
            case 4:
                this.f18835b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f18835b.lambda$new$0();
                return;
            default:
                this.f18835b.lambda$new$7();
                return;
        }
    }
}
