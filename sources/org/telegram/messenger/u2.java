package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17658a;
    public final FileLoader f17659b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17658a = i10;
        this.f17659b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17658a) {
            case 0:
                FileLoader.t(this.f17659b);
                return;
            case 1:
                FileLoader.m(this.f17659b);
                return;
            default:
                FileLoader.q(this.f17659b);
                return;
        }
    }
}
