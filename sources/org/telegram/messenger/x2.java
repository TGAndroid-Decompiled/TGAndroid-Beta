package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f20040a;
    public final FileLoader f20041b;

    public x2(FileLoader fileLoader, int i10) {
        this.f20040a = i10;
        this.f20041b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20040a) {
            case 0:
                FileLoader.t(this.f20041b);
                return;
            case 1:
                FileLoader.m(this.f20041b);
                return;
            default:
                FileLoader.q(this.f20041b);
                return;
        }
    }
}
