package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17648a;
    public final FileLoader f17649b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17648a = i10;
        this.f17649b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17648a) {
            case 0:
                FileLoader.t(this.f17649b);
                return;
            case 1:
                FileLoader.m(this.f17649b);
                return;
            default:
                FileLoader.q(this.f17649b);
                return;
        }
    }
}
