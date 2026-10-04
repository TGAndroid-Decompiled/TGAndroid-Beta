package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19286a;
    public final FileLoader f19287b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19286a = i10;
        this.f19287b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19286a) {
            case 0:
                FileLoader.t(this.f19287b);
                return;
            case 1:
                FileLoader.m(this.f19287b);
                return;
            default:
                FileLoader.q(this.f19287b);
                return;
        }
    }
}
