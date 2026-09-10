package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f17022a;
    public final FileLoader f17023b;

    public y2(FileLoader fileLoader, int i10) {
        this.f17022a = i10;
        this.f17023b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17022a) {
            case 0:
                this.f17023b.lambda$new$18();
                return;
            case 1:
                this.f17023b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f17023b.lambda$cancel$10();
                return;
        }
    }
}
