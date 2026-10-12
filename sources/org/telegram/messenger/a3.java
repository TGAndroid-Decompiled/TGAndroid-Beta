package org.telegram.messenger;
public final class a3 implements Runnable {
    public final int f17036a;
    public final FileLoader f17037b;
    public final String f17038c;

    public a3(FileLoader fileLoader, String str, int i10) {
        this.f17036a = i10;
        this.f17037b = fileLoader;
        this.f17038c = str;
    }

    @Override
    public final void run() {
        switch (this.f17036a) {
            case 0:
                FileLoader.u(this.f17037b, this.f17038c);
                return;
            case 1:
                FileLoader.a(this.f17037b, this.f17038c);
                return;
            default:
                FileLoader.r(this.f17037b, this.f17038c);
                return;
        }
    }
}
