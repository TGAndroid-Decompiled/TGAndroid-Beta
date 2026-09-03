package org.telegram.messenger;
public final class v2 implements Runnable {
    public final int f20244a;
    public final FileLoader f20245b;

    public v2(FileLoader fileLoader, int i10) {
        this.f20244a = i10;
        this.f20245b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20244a) {
            case 0:
                FileLoader.t(this.f20245b);
                return;
            case 1:
                FileLoader.m(this.f20245b);
                return;
            default:
                FileLoader.q(this.f20245b);
                return;
        }
    }
}
