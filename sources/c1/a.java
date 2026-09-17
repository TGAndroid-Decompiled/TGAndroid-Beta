package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3645a;
    public final e f3646b;
    public final i f3647c;

    public a(e eVar, i iVar, int i10) {
        this.f3645a = i10;
        this.f3646b = eVar;
        this.f3647c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3645a) {
            case 0:
                this.f3646b.e().onError(this.f3647c);
                return;
            case 1:
                this.f3646b.e().onError(this.f3647c);
                return;
            default:
                this.f3646b.e().onError(this.f3647c);
                return;
        }
    }
}
