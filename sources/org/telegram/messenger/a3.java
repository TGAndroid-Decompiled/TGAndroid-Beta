package org.telegram.messenger;
public final class a3 implements Runnable {
    public final int f14679a;
    public final FileLoader f14680b;
    public final String f14681c;

    public a3(FileLoader fileLoader, String str, int i10) {
        this.f14679a = i10;
        this.f14680b = fileLoader;
        this.f14681c = str;
    }

    @Override
    public final void run() {
        switch (this.f14679a) {
            case 0:
                FileLoader.u(this.f14680b, this.f14681c);
                return;
            case 1:
                FileLoader.a(this.f14680b, this.f14681c);
                return;
            default:
                FileLoader.r(this.f14680b, this.f14681c);
                return;
        }
    }
}
