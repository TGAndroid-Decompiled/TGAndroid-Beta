package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f20034a;
    public final FileLoader f20035b;

    public x2(FileLoader fileLoader, int i10) {
        this.f20034a = i10;
        this.f20035b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20034a) {
            case 0:
                FileLoader.t(this.f20035b);
                return;
            case 1:
                FileLoader.m(this.f20035b);
                return;
            default:
                FileLoader.q(this.f20035b);
                return;
        }
    }
}
