package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4479a;
    public final e f4480b;
    public final i f4481c;

    public a(e eVar, i iVar, int i10) {
        this.f4479a = i10;
        this.f4480b = eVar;
        this.f4481c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4479a) {
            case 0:
                this.f4480b.e().onError(this.f4481c);
                return;
            case 1:
                this.f4480b.e().onError(this.f4481c);
                return;
            default:
                this.f4480b.e().onError(this.f4481c);
                return;
        }
    }
}
