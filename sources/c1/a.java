package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4478a;
    public final e f4479b;
    public final i f4480c;

    public a(e eVar, i iVar, int i10) {
        this.f4478a = i10;
        this.f4479b = eVar;
        this.f4480c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4478a) {
            case 0:
                this.f4479b.e().onError(this.f4480c);
                return;
            case 1:
                this.f4479b.e().onError(this.f4480c);
                return;
            default:
                this.f4479b.e().onError(this.f4480c);
                return;
        }
    }
}
