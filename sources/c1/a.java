package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4477a;
    public final e f4478b;
    public final i f4479c;

    public a(e eVar, i iVar, int i10) {
        this.f4477a = i10;
        this.f4478b = eVar;
        this.f4479c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4477a) {
            case 0:
                this.f4478b.e().onError(this.f4479c);
                return;
            case 1:
                this.f4478b.e().onError(this.f4479c);
                return;
            default:
                this.f4478b.e().onError(this.f4479c);
                return;
        }
    }
}
