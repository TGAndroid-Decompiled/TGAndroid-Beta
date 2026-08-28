package c1;

import w0.i;
public final class a implements Runnable {
    public final int f2078a;
    public final e f2079b;
    public final i f2080c;

    public a(e eVar, i iVar, int i9) {
        this.f2078a = i9;
        this.f2079b = eVar;
        this.f2080c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2078a) {
            case 0:
                this.f2079b.e().onError(this.f2080c);
                return;
            case 1:
                this.f2079b.e().onError(this.f2080c);
                return;
            default:
                this.f2079b.e().onError(this.f2080c);
                return;
        }
    }
}
