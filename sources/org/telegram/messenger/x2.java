package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f18673a;
    public final FileLoader f18674b;

    public x2(FileLoader fileLoader, int i10) {
        this.f18673a = i10;
        this.f18674b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f18673a) {
            case 0:
                FileLoader.t(this.f18674b);
                return;
            case 1:
                FileLoader.m(this.f18674b);
                return;
            default:
                FileLoader.q(this.f18674b);
                return;
        }
    }
}
