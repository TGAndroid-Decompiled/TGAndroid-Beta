package org.telegram.messenger;
public final class tm implements Runnable {
    public final int f27056a;
    public final q0.a f27057b;
    public final int f27058c;

    public tm(q0.a aVar, int i7, int i10) {
        this.f27056a = i10;
        this.f27057b = aVar;
        this.f27058c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27056a) {
            case 0:
                this.f27057b.accept(Integer.valueOf(this.f27058c));
                return;
            default:
                this.f27057b.accept(Integer.valueOf(this.f27058c));
                return;
        }
    }
}
