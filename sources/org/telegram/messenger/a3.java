package org.telegram.messenger;
public final class a3 implements Runnable {
    public final int f17833a;
    public final FileLoader f17834b;
    public final String f17835c;

    public a3(FileLoader fileLoader, String str, int i10) {
        this.f17833a = i10;
        this.f17834b = fileLoader;
        this.f17835c = str;
    }

    @Override
    public final void run() {
        switch (this.f17833a) {
            case 0:
                FileLoader.u(this.f17834b, this.f17835c);
                return;
            case 1:
                FileLoader.a(this.f17834b, this.f17835c);
                return;
            default:
                FileLoader.r(this.f17834b, this.f17835c);
                return;
        }
    }
}
