package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f17663a;
    public final FileLoader f17664b;

    public u2(FileLoader fileLoader, int i10) {
        this.f17663a = i10;
        this.f17664b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f17663a) {
            case 0:
                FileLoader.t(this.f17664b);
                return;
            case 1:
                FileLoader.m(this.f17664b);
                return;
            default:
                FileLoader.q(this.f17664b);
                return;
        }
    }
}
