package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4126a;
    public final e f4127b;
    public final i f4128c;

    public a(e eVar, i iVar, int i10) {
        this.f4126a = i10;
        this.f4127b = eVar;
        this.f4128c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4126a) {
            case 0:
                this.f4127b.e().onError(this.f4128c);
                return;
            case 1:
                this.f4127b.e().onError(this.f4128c);
                return;
            default:
                this.f4127b.e().onError(this.f4128c);
                return;
        }
    }
}
