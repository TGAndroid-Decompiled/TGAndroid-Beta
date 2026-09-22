package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17426a;
    public final FileLoader f17427b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17426a = i10;
        this.f17427b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17426a) {
            case 0:
                FileLoader.t(this.f17427b);
                return;
            case 1:
                FileLoader.m(this.f17427b);
                return;
            default:
                FileLoader.q(this.f17427b);
                return;
        }
    }
}
