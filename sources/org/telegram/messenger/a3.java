package org.telegram.messenger;
public final class a3 implements Runnable {
    public final int f17896a;
    public final FileLoader f17897b;
    public final String f17898c;

    public a3(FileLoader fileLoader, String str, int i10) {
        this.f17896a = i10;
        this.f17897b = fileLoader;
        this.f17898c = str;
    }

    @Override
    public final void run() {
        switch (this.f17896a) {
            case 0:
                FileLoader.w(this.f17897b, this.f17898c);
                return;
            case 1:
                FileLoader.a(this.f17897b, this.f17898c);
                return;
            default:
                FileLoader.u(this.f17897b, this.f17898c);
                return;
        }
    }
}
