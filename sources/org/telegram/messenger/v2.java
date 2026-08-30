package org.telegram.messenger;
public final class v2 implements Runnable {
    public final int f18628a;
    public final FileLoader f18629b;

    public v2(FileLoader fileLoader, int i10) {
        this.f18628a = i10;
        this.f18629b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f18628a) {
            case 0:
                FileLoader.t(this.f18629b);
                return;
            case 1:
                FileLoader.m(this.f18629b);
                return;
            default:
                FileLoader.q(this.f18629b);
                return;
        }
    }
}
