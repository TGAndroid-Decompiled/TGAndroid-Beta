package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4153a;
    public final e f4154b;
    public final i f4155c;

    public a(e eVar, i iVar, int i10) {
        this.f4153a = i10;
        this.f4154b = eVar;
        this.f4155c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4153a) {
            case 0:
                this.f4154b.e().onError(this.f4155c);
                return;
            case 1:
                this.f4154b.e().onError(this.f4155c);
                return;
            default:
                this.f4154b.e().onError(this.f4155c);
                return;
        }
    }
}
