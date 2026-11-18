package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f26567a;
    public final yf f26568b;
    public final bd f26569c;

    public rc(yf yfVar, bd bdVar, int i7) {
        this.f26567a = i7;
        this.f26568b = yfVar;
        this.f26569c = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f26567a) {
            case 0:
                this.f26568b.run();
                this.f26569c.a();
                return;
            default:
                this.f26568b.run();
                this.f26569c.a();
                return;
        }
    }
}
