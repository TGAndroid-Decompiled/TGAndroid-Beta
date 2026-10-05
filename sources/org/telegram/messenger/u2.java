package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19297a;
    public final FileLoader f19298b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19297a = i10;
        this.f19298b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19297a) {
            case 0:
                FileLoader.t(this.f19298b);
                return;
            case 1:
                FileLoader.m(this.f19298b);
                return;
            default:
                FileLoader.q(this.f19298b);
                return;
        }
    }
}
