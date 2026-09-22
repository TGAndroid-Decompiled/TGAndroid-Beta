package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3644a;
    public final e f3645b;
    public final i f3646c;

    public a(e eVar, i iVar, int i10) {
        this.f3644a = i10;
        this.f3645b = eVar;
        this.f3646c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3644a) {
            case 0:
                this.f3645b.e().onError(this.f3646c);
                return;
            case 1:
                this.f3645b.e().onError(this.f3646c);
                return;
            default:
                this.f3645b.e().onError(this.f3646c);
                return;
        }
    }
}
