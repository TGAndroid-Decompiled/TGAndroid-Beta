package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17674a;
    public final FileLoader f17675b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17674a = i10;
        this.f17675b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17674a) {
            case 0:
                FileLoader.t(this.f17675b);
                return;
            case 1:
                FileLoader.m(this.f17675b);
                return;
            default:
                FileLoader.q(this.f17675b);
                return;
        }
    }
}
