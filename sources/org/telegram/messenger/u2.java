package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f21690a;
    public final FileLoader f21691b;

    public u2(FileLoader fileLoader, int i10) {
        this.f21690a = i10;
        this.f21691b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f21690a) {
            case 0:
                FileLoader.t(this.f21691b);
                return;
            case 1:
                FileLoader.m(this.f21691b);
                return;
            default:
                FileLoader.q(this.f21691b);
                return;
        }
    }
}
