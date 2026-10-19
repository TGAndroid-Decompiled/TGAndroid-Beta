package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f20033a;
    public final FileLoader f20034b;

    public x2(FileLoader fileLoader, int i10) {
        this.f20033a = i10;
        this.f20034b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20033a) {
            case 0:
                FileLoader.t(this.f20034b);
                return;
            case 1:
                FileLoader.m(this.f20034b);
                return;
            default:
                FileLoader.q(this.f20034b);
                return;
        }
    }
}
