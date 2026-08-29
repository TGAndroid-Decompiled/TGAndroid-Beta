package c1;

import w0.i;
public final class a implements Runnable {
    public final int f2747a;
    public final e f2748b;
    public final i f2749c;

    public a(e eVar, i iVar, int i10) {
        this.f2747a = i10;
        this.f2748b = eVar;
        this.f2749c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2747a) {
            case 0:
                this.f2748b.e().onError(this.f2749c);
                return;
            case 1:
                this.f2748b.e().onError(this.f2749c);
                return;
            default:
                this.f2748b.e().onError(this.f2749c);
                return;
        }
    }
}
