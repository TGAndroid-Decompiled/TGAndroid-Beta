package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f19513a;
    public final FileLoadOperation f19514b;

    public s2(FileLoadOperation fileLoadOperation, int i10) {
        this.f19513a = i10;
        this.f19514b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19513a) {
            case 0:
                this.f19514b.lambda$clearOperation$27();
                return;
            case 1:
                this.f19514b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f19514b.lambda$start$11();
                return;
            case 3:
                this.f19514b.lambda$pause$8();
                return;
            case 4:
                this.f19514b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f19514b.lambda$new$0();
                return;
            default:
                this.f19514b.lambda$new$7();
                return;
        }
    }
}
