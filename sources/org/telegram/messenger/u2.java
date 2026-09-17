package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19150a;
    public final FileLoader f19151b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19150a = i10;
        this.f19151b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19150a) {
            case 0:
                FileLoader.t(this.f19151b);
                return;
            case 1:
                FileLoader.m(this.f19151b);
                return;
            default:
                FileLoader.q(this.f19151b);
                return;
        }
    }
}
