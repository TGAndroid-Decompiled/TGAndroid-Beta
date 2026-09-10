package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4059a;
    public final e f4060b;
    public final i f4061c;

    public a(e eVar, i iVar, int i10) {
        this.f4059a = i10;
        this.f4060b = eVar;
        this.f4061c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4059a) {
            case 0:
                this.f4060b.e().onError(this.f4061c);
                return;
            case 1:
                this.f4060b.e().onError(this.f4061c);
                return;
            default:
                this.f4060b.e().onError(this.f4061c);
                return;
        }
    }
}
