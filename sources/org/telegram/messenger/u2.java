package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19288a;
    public final FileLoader f19289b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19288a = i10;
        this.f19289b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19288a) {
            case 0:
                FileLoader.t(this.f19289b);
                return;
            case 1:
                FileLoader.m(this.f19289b);
                return;
            default:
                FileLoader.q(this.f19289b);
                return;
        }
    }
}
