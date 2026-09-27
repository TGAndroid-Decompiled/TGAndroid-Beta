package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17652a;
    public final FileLoader f17653b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17652a = i10;
        this.f17653b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17652a) {
            case 0:
                FileLoader.t(this.f17653b);
                return;
            case 1:
                FileLoader.m(this.f17653b);
                return;
            default:
                FileLoader.q(this.f17653b);
                return;
        }
    }
}
