package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3642a;
    public final e f3643b;
    public final i f3644c;

    public a(e eVar, i iVar, int i10) {
        this.f3642a = i10;
        this.f3643b = eVar;
        this.f3644c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3642a) {
            case 0:
                this.f3643b.e().onError(this.f3644c);
                return;
            case 1:
                this.f3643b.e().onError(this.f3644c);
                return;
            default:
                this.f3643b.e().onError(this.f3644c);
                return;
        }
    }
}
