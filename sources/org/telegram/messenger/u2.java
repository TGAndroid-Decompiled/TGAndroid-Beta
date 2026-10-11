package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19290a;
    public final FileLoader f19291b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19290a = i10;
        this.f19291b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19290a) {
            case 0:
                FileLoader.t(this.f19291b);
                return;
            case 1:
                FileLoader.m(this.f19291b);
                return;
            default:
                FileLoader.q(this.f19291b);
                return;
        }
    }
}
