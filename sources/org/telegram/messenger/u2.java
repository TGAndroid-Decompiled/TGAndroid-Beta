package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17611a;
    public final FileLoader f17612b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17611a = i10;
        this.f17612b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17611a) {
            case 0:
                FileLoader.t(this.f17612b);
                return;
            case 1:
                FileLoader.m(this.f17612b);
                return;
            default:
                FileLoader.q(this.f17612b);
                return;
        }
    }
}
