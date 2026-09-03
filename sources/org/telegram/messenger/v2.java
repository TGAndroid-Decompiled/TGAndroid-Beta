package org.telegram.messenger;
public final class v2 implements Runnable {
    public final int f18610a;
    public final FileLoader f18611b;

    public v2(FileLoader fileLoader, int i10) {
        this.f18610a = i10;
        this.f18611b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f18610a) {
            case 0:
                FileLoader.t(this.f18611b);
                return;
            case 1:
                FileLoader.m(this.f18611b);
                return;
            default:
                FileLoader.q(this.f18611b);
                return;
        }
    }
}
