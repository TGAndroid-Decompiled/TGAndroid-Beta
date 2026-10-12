package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f18969a;
    public final FileLoader f18970b;

    public x2(FileLoader fileLoader, int i10) {
        this.f18969a = i10;
        this.f18970b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f18969a) {
            case 0:
                FileLoader.t(this.f18970b);
                return;
            case 1:
                FileLoader.m(this.f18970b);
                return;
            default:
                FileLoader.q(this.f18970b);
                return;
        }
    }
}
