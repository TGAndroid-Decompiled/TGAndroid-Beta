package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17437a;
    public final FileLoader f17438b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17437a = i10;
        this.f17438b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17437a) {
            case 0:
                FileLoader.t(this.f17438b);
                return;
            case 1:
                FileLoader.m(this.f17438b);
                return;
            default:
                FileLoader.q(this.f17438b);
                return;
        }
    }
}
