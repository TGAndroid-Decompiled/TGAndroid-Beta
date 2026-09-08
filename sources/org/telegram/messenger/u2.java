package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19139a;
    public final FileLoader f19140b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19139a = i10;
        this.f19140b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19139a) {
            case 0:
                FileLoader.t(this.f19140b);
                return;
            case 1:
                FileLoader.m(this.f19140b);
                return;
            default:
                FileLoader.q(this.f19140b);
                return;
        }
    }
}
