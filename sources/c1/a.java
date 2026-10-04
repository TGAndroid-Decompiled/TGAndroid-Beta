package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3932a;
    public final e f3933b;
    public final i f3934c;

    public a(e eVar, i iVar, int i10) {
        this.f3932a = i10;
        this.f3933b = eVar;
        this.f3934c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3932a) {
            case 0:
                this.f3933b.e().onError(this.f3934c);
                return;
            case 1:
                this.f3933b.e().onError(this.f3934c);
                return;
            default:
                this.f3933b.e().onError(this.f3934c);
                return;
        }
    }
}
