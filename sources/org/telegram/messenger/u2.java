package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19123a;
    public final FileLoader f19124b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19123a = i10;
        this.f19124b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19123a) {
            case 0:
                FileLoader.t(this.f19124b);
                return;
            case 1:
                FileLoader.m(this.f19124b);
                return;
            default:
                FileLoader.q(this.f19124b);
                return;
        }
    }
}
