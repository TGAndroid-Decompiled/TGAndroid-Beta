package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3980a;
    public final e f3981b;
    public final i f3982c;

    public a(e eVar, i iVar, int i10) {
        this.f3980a = i10;
        this.f3981b = eVar;
        this.f3982c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3980a) {
            case 0:
                this.f3981b.e().onError(this.f3982c);
                return;
            case 1:
                this.f3981b.e().onError(this.f3982c);
                return;
            default:
                this.f3981b.e().onError(this.f3982c);
                return;
        }
    }
}
