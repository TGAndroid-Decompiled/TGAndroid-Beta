package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f20115a;
    public final FileLoader f20116b;

    public y2(FileLoader fileLoader, int i10) {
        this.f20115a = i10;
        this.f20116b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20115a) {
            case 0:
                this.f20116b.lambda$new$20();
                return;
            case 1:
                this.f20116b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f20116b.lambda$cancel$10();
                return;
        }
    }
}
