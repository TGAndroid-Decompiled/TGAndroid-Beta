package org.telegram.messenger;

public final class p2 implements Runnable {

    public final int f21218a;

    public final FileLoadOperation f21219b;

    public p2(FileLoadOperation fileLoadOperation, int i10) {
        this.f21218a = i10;
        this.f21219b = fileLoadOperation;
    }

    @Override
    public final void run() {
        switch (this.f21218a) {
            case 0:
                this.f21219b.lambda$clearOperation$26();
                break;
            case 1:
                this.f21219b.lambda$start$10();
                break;
            case 2:
                this.f21219b.lambda$pause$7();
                break;
            case 3:
                this.f21219b.lambda$onFinishLoadingFile$18();
                break;
            case 4:
                this.f21219b.lambda$cancelOnStage$14();
                break;
            default:
                this.f21219b.lambda$new$6();
                break;
        }
    }
}
