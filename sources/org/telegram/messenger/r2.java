package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f19397a;
    public final FileLoadOperation f19398b;

    public r2(FileLoadOperation fileLoadOperation, int i10) {
        this.f19397a = i10;
        this.f19398b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19397a) {
            case 0:
                this.f19398b.lambda$clearOperation$27();
                return;
            case 1:
                this.f19398b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f19398b.lambda$start$11();
                return;
            case 3:
                this.f19398b.lambda$pause$8();
                return;
            case 4:
                this.f19398b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f19398b.lambda$new$0();
                return;
            default:
                this.f19398b.lambda$new$7();
                return;
        }
    }
}
