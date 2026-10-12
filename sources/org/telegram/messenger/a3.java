package org.telegram.messenger;
public final class a3 implements Runnable {
    public final int f17035a;
    public final FileLoader f17036b;
    public final String f17037c;

    public a3(FileLoader fileLoader, String str, int i10) {
        this.f17035a = i10;
        this.f17036b = fileLoader;
        this.f17037c = str;
    }

    @Override
    public final void run() {
        switch (this.f17035a) {
            case 0:
                FileLoader.u(this.f17036b, this.f17037c);
                return;
            case 1:
                FileLoader.a(this.f17036b, this.f17037c);
                return;
            default:
                FileLoader.r(this.f17036b, this.f17037c);
                return;
        }
    }
}
