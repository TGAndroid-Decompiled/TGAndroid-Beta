package org.telegram.messenger;
public final class b3 implements Runnable {
    public final int f19678a;
    public final FileLoader f19679b;
    public final String f19680c;

    public b3(FileLoader fileLoader, String str, int i10) {
        this.f19678a = i10;
        this.f19679b = fileLoader;
        this.f19680c = str;
    }

    @Override
    public final void run() {
        switch (this.f19678a) {
            case 0:
                FileLoader.w(this.f19679b, this.f19680c);
                return;
            case 1:
                FileLoader.a(this.f19679b, this.f19680c);
                return;
            default:
                FileLoader.u(this.f19679b, this.f19680c);
                return;
        }
    }
}
