package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3981a;
    public final e f3982b;
    public final i f3983c;

    public a(e eVar, i iVar, int i10) {
        this.f3981a = i10;
        this.f3982b = eVar;
        this.f3983c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3981a) {
            case 0:
                this.f3982b.e().onError(this.f3983c);
                return;
            case 1:
                this.f3982b.e().onError(this.f3983c);
                return;
            default:
                this.f3982b.e().onError(this.f3983c);
                return;
        }
    }
}
