package org.telegram.messenger;
public final class jn implements Runnable {
    public final int f16488a;
    public final q0.a f16489b;
    public final int f16490c;

    public jn(q0.a aVar, int i10, int i11) {
        this.f16488a = i11;
        this.f16489b = aVar;
        this.f16490c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16488a) {
            case 0:
                this.f16489b.accept(Integer.valueOf(this.f16490c));
                return;
            default:
                this.f16489b.accept(Integer.valueOf(this.f16490c));
                return;
        }
    }
}
