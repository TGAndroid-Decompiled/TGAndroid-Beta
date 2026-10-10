package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19292a;
    public final FileLoader f19293b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19292a = i10;
        this.f19293b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19292a) {
            case 0:
                FileLoader.t(this.f19293b);
                return;
            case 1:
                FileLoader.m(this.f19293b);
                return;
            default:
                FileLoader.q(this.f19293b);
                return;
        }
    }
}
