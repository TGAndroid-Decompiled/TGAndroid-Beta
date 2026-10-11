package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18704a;
    public final FileLoadOperation f18705b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18704a = i10;
        this.f18705b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18704a) {
            case 0:
                this.f18705b.lambda$clearOperation$27();
                return;
            case 1:
                this.f18705b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f18705b.lambda$start$11();
                return;
            case 3:
                this.f18705b.lambda$pause$8();
                return;
            case 4:
                this.f18705b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f18705b.lambda$new$0();
                return;
            default:
                this.f18705b.lambda$new$7();
                return;
        }
    }
}
