package org.telegram.messenger;
public final class in implements Runnable {
    public final int f16153a;
    public final q0.a f16154b;
    public final int f16155c;

    public in(q0.a aVar, int i10, int i11) {
        this.f16153a = i11;
        this.f16154b = aVar;
        this.f16155c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16153a) {
            case 0:
                this.f16154b.accept(Integer.valueOf(this.f16155c));
                return;
            default:
                this.f16154b.accept(Integer.valueOf(this.f16155c));
                return;
        }
    }
}
