package c1;

import w0.i;

public final class a implements Runnable {

    public final int f2217a;

    public final e f2218b;

    public final i f2219c;

    public a(e eVar, i iVar, int i10) {
        this.f2217a = i10;
        this.f2218b = eVar;
        this.f2219c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2217a) {
            case 0:
                this.f2218b.e().onError(this.f2219c);
                break;
            case 1:
                this.f2218b.e().onError(this.f2219c);
                break;
            default:
                this.f2218b.e().onError(this.f2219c);
                break;
        }
    }
}
