package org.telegram.messenger;
public final class o2 implements Runnable {
    public final int f18591a;
    public final FileLoadOperation f18592b;

    public o2(FileLoadOperation fileLoadOperation, int i10) {
        this.f18591a = i10;
        this.f18592b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f18591a) {
            case 0:
                this.f18592b.lambda$clearOperation$26();
                return;
            case 1:
                this.f18592b.lambda$start$10();
                return;
            case 2:
                this.f18592b.lambda$pause$7();
                return;
            case 3:
                this.f18592b.lambda$onFinishLoadingFile$18();
                return;
            case 4:
                this.f18592b.lambda$cancelOnStage$14();
                return;
            default:
                this.f18592b.lambda$new$6();
                return;
        }
    }
}
