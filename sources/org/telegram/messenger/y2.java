package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f20119a;
    public final FileLoader f20120b;

    public y2(FileLoader fileLoader, int i10) {
        this.f20119a = i10;
        this.f20120b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20119a) {
            case 0:
                this.f20120b.lambda$new$20();
                return;
            case 1:
                this.f20120b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f20120b.lambda$cancel$10();
                return;
        }
    }
}
