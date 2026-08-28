package org.telegram.messenger;
public final class t2 implements Runnable {
    public final int f21528a;
    public final FileLoader f21529b;

    public t2(FileLoader fileLoader, int i9) {
        this.f21528a = i9;
        this.f21529b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f21528a) {
            case 0:
                FileLoader.t(this.f21529b);
                return;
            case 1:
                FileLoader.m(this.f21529b);
                return;
            default:
                FileLoader.q(this.f21529b);
                return;
        }
    }
}
