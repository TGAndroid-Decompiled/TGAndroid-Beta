package org.telegram.messenger;
public final class u2 implements Runnable {
    public final int f19326a;
    public final FileLoader f19327b;

    public u2(FileLoader fileLoader, int i10) {
        this.f19326a = i10;
        this.f19327b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f19326a) {
            case 0:
                FileLoader.t(this.f19327b);
                return;
            case 1:
                FileLoader.m(this.f19327b);
                return;
            default:
                FileLoader.q(this.f19327b);
                return;
        }
    }
}
