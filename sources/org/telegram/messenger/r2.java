package org.telegram.messenger;
public final class r2 implements Runnable {
    public final int f17964a;
    public final FileLoadOperation f17965b;

    public r2(FileLoadOperation fileLoadOperation, int i10) {
        this.f17964a = i10;
        this.f17965b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f17964a) {
            case 0:
                this.f17965b.lambda$clearOperation$27();
                return;
            case 1:
                this.f17965b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f17965b.lambda$start$11();
                return;
            case 3:
                this.f17965b.lambda$pause$8();
                return;
            case 4:
                this.f17965b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f17965b.lambda$new$0();
                return;
            default:
                this.f17965b.lambda$new$7();
                return;
        }
    }
}
