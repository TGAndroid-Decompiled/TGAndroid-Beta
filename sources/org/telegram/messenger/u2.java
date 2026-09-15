package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17428a;
    public final FileLoader f17429b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17428a = i10;
        this.f17429b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17428a) {
            case 0:
                FileLoader.t(this.f17429b);
                return;
            case 1:
                FileLoader.m(this.f17429b);
                return;
            default:
                FileLoader.q(this.f17429b);
                return;
        }
    }
}
