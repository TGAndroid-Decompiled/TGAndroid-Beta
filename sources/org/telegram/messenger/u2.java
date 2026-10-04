package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19285a;
    public final FileLoader f19286b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19285a = i10;
        this.f19286b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19285a) {
            case 0:
                FileLoader.t(this.f19286b);
                return;
            case 1:
                FileLoader.m(this.f19286b);
                return;
            default:
                FileLoader.q(this.f19286b);
                return;
        }
    }
}
