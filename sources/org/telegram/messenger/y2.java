package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f20180a;
    public final FileLoader f20181b;

    public y2(FileLoader fileLoader, int i10) {
        this.f20180a = i10;
        this.f20181b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20180a) {
            case 0:
                this.f20181b.lambda$new$20();
                return;
            case 1:
                this.f20181b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f20181b.lambda$cancel$10();
                return;
        }
    }
}
