package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18705a;
    public final FileLoadOperation f18706b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18705a = i10;
        this.f18706b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18705a) {
            case 0:
                this.f18706b.lambda$clearOperation$27();
                return;
            case 1:
                this.f18706b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f18706b.lambda$start$11();
                return;
            case 3:
                this.f18706b.lambda$pause$8();
                return;
            case 4:
                this.f18706b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f18706b.lambda$new$0();
                return;
            default:
                this.f18706b.lambda$new$7();
                return;
        }
    }
}
