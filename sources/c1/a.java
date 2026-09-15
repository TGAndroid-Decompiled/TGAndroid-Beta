package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3640a;
    public final e f3641b;
    public final i f3642c;

    public a(e eVar, i iVar, int i10) {
        this.f3640a = i10;
        this.f3641b = eVar;
        this.f3642c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3640a) {
            case 0:
                this.f3641b.e().onError(this.f3642c);
                return;
            case 1:
                this.f3641b.e().onError(this.f3642c);
                return;
            default:
                this.f3641b.e().onError(this.f3642c);
                return;
        }
    }
}
