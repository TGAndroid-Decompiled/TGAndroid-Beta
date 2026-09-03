package c1;

import w0.i;
public final class a implements Runnable {
    public final int f1884a;
    public final f f1885b;
    public final i f1886c;

    public a(f fVar, i iVar, int i10) {
        this.f1884a = i10;
        this.f1885b = fVar;
        this.f1886c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f1884a) {
            case 0:
                this.f1885b.e().onError(this.f1886c);
                return;
            case 1:
                this.f1885b.e().onError(this.f1886c);
                return;
            default:
                this.f1885b.e().onError(this.f1886c);
                return;
        }
    }
}
