package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f26595a;
    public final yf f26596b;
    public final bd f26597c;

    public rc(yf yfVar, bd bdVar, int i7) {
        this.f26595a = i7;
        this.f26596b = yfVar;
        this.f26597c = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f26595a) {
            case 0:
                this.f26596b.run();
                this.f26597c.a();
                return;
            default:
                this.f26596b.run();
                this.f26597c.a();
                return;
        }
    }
}
