package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f26569a;
    public final yf f26570b;
    public final bd f26571c;

    public rc(yf yfVar, bd bdVar, int i7) {
        this.f26569a = i7;
        this.f26570b = yfVar;
        this.f26571c = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f26569a) {
            case 0:
                this.f26570b.run();
                this.f26571c.a();
                return;
            default:
                this.f26570b.run();
                this.f26571c.a();
                return;
        }
    }
}
