package org.telegram.messenger;
public final class v2 implements Runnable {
    public final int f20242a;
    public final FileLoader f20243b;

    public v2(FileLoader fileLoader, int i10) {
        this.f20242a = i10;
        this.f20243b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20242a) {
            case 0:
                FileLoader.t(this.f20243b);
                return;
            case 1:
                FileLoader.m(this.f20243b);
                return;
            default:
                FileLoader.q(this.f20243b);
                return;
        }
    }
}
