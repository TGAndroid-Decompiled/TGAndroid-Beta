package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17657a;
    public final FileLoader f17658b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17657a = i10;
        this.f17658b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17657a) {
            case 0:
                FileLoader.t(this.f17658b);
                return;
            case 1:
                FileLoader.m(this.f17658b);
                return;
            default:
                FileLoader.q(this.f17658b);
                return;
        }
    }
}
