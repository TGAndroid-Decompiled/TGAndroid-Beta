package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17411a;
    public final FileLoader f17412b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17411a = i10;
        this.f17412b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17411a) {
            case 0:
                FileLoader.t(this.f17412b);
                return;
            case 1:
                FileLoader.m(this.f17412b);
                return;
            default:
                FileLoader.q(this.f17412b);
                return;
        }
    }
}
