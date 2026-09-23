package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3637a;
    public final e f3638b;
    public final i f3639c;

    public a(e eVar, i iVar, int i10) {
        this.f3637a = i10;
        this.f3638b = eVar;
        this.f3639c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3637a) {
            case 0:
                this.f3638b.e().onError(this.f3639c);
                return;
            case 1:
                this.f3638b.e().onError(this.f3639c);
                return;
            default:
                this.f3638b.e().onError(this.f3639c);
                return;
        }
    }
}
