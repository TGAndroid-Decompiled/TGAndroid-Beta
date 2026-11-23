package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f26668a;
    public final yf f26669b;
    public final bd f26670c;

    public rc(yf yfVar, bd bdVar, int i7) {
        this.f26668a = i7;
        this.f26669b = yfVar;
        this.f26670c = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f26668a) {
            case 0:
                this.f26669b.run();
                this.f26670c.a();
                return;
            default:
                this.f26669b.run();
                this.f26670c.a();
                return;
        }
    }
}
