package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18745a;
    public final FileLoadOperation f18746b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18745a = i10;
        this.f18746b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18745a) {
            case 0:
                this.f18746b.lambda$clearOperation$26();
                return;
            case 1:
                this.f18746b.lambda$start$10();
                return;
            case 2:
                this.f18746b.lambda$pause$7();
                return;
            case 3:
                this.f18746b.lambda$onFinishLoadingFile$18();
                return;
            case 4:
                this.f18746b.lambda$cancelOnStage$14();
                return;
            default:
                this.f18746b.lambda$new$6();
                return;
        }
    }
}
