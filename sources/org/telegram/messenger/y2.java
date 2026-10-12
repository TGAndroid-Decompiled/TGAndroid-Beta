package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f19629a;
    public final FileLoader f19630b;

    public y2(FileLoader fileLoader, int i10) {
        this.f19629a = i10;
        this.f19630b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19629a) {
            case 0:
                this.f19630b.lambda$new$18();
                return;
            case 1:
                this.f19630b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f19630b.lambda$cancel$10();
                return;
        }
    }
}
