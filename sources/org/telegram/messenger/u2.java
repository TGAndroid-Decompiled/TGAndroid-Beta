package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17643a;
    public final FileLoader f17644b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17643a = i10;
        this.f17644b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17643a) {
            case 0:
                FileLoader.t(this.f17644b);
                return;
            case 1:
                FileLoader.m(this.f17644b);
                return;
            default:
                FileLoader.q(this.f17644b);
                return;
        }
    }
}
