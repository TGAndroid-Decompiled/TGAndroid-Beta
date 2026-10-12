package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f18835a;
    public final FileLoadOperation f18836b;

    public s2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18835a = i10;
        this.f18836b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18835a) {
            case 0:
                this.f18836b.lambda$clearOperation$27();
                return;
            case 1:
                this.f18836b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f18836b.lambda$start$11();
                return;
            case 3:
                this.f18836b.lambda$pause$8();
                return;
            case 4:
                this.f18836b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f18836b.lambda$new$0();
                return;
            default:
                this.f18836b.lambda$new$7();
                return;
        }
    }
}
