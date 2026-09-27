package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3639a;
    public final e f3640b;
    public final i f3641c;

    public a(e eVar, i iVar, int i10) {
        this.f3639a = i10;
        this.f3640b = eVar;
        this.f3641c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3639a) {
            case 0:
                this.f3640b.e().onError(this.f3641c);
                return;
            case 1:
                this.f3640b.e().onError(this.f3641c);
                return;
            default:
                this.f3640b.e().onError(this.f3641c);
                return;
        }
    }
}
