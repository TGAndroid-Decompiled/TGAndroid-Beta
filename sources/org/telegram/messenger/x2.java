package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f20035a;
    public final FileLoader f20036b;

    public x2(FileLoader fileLoader, int i10) {
        this.f20035a = i10;
        this.f20036b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20035a) {
            case 0:
                FileLoader.t(this.f20036b);
                return;
            case 1:
                FileLoader.m(this.f20036b);
                return;
            default:
                FileLoader.q(this.f20036b);
                return;
        }
    }
}
