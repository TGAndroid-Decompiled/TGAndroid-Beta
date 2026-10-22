package org.telegram.messenger;
public final class s2 implements Runnable {
    public final int f19444a;
    public final FileLoadOperation f19445b;

    public s2(FileLoadOperation fileLoadOperation, int i10) {
        this.f19444a = i10;
        this.f19445b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f19444a) {
            case 0:
                this.f19445b.lambda$clearOperation$27();
                return;
            case 1:
                this.f19445b.lambda$onFinishLoadingFile$19();
                return;
            case 2:
                this.f19445b.lambda$start$11();
                return;
            case 3:
                this.f19445b.lambda$pause$8();
                return;
            case 4:
                this.f19445b.lambda$cancelOnStage$15();
                return;
            case 5:
                this.f19445b.lambda$new$0();
                return;
            default:
                this.f19445b.lambda$new$7();
                return;
        }
    }
}
