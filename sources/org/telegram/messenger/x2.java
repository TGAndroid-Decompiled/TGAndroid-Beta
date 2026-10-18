package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f20030a;
    public final FileLoader f20031b;

    public x2(FileLoader fileLoader, int i10) {
        this.f20030a = i10;
        this.f20031b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20030a) {
            case 0:
                FileLoader.t(this.f20031b);
                return;
            case 1:
                FileLoader.m(this.f20031b);
                return;
            default:
                FileLoader.q(this.f20031b);
                return;
        }
    }
}
