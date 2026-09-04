package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19112a;
    public final FileLoader f19113b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19112a = i10;
        this.f19113b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19112a) {
            case 0:
                FileLoader.t(this.f19113b);
                return;
            case 1:
                FileLoader.m(this.f19113b);
                return;
            default:
                FileLoader.q(this.f19113b);
                return;
        }
    }
}
