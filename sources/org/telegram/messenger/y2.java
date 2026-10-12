package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f19630a;
    public final FileLoader f19631b;

    public y2(FileLoader fileLoader, int i10) {
        this.f19630a = i10;
        this.f19631b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19630a) {
            case 0:
                this.f19631b.lambda$new$18();
                return;
            case 1:
                this.f19631b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f19631b.lambda$cancel$10();
                return;
        }
    }
}
