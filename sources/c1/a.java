package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4108a;
    public final e f4109b;
    public final i f4110c;

    public a(e eVar, i iVar, int i10) {
        this.f4108a = i10;
        this.f4109b = eVar;
        this.f4110c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4108a) {
            case 0:
                this.f4109b.e().onError(this.f4110c);
                return;
            case 1:
                this.f4109b.e().onError(this.f4110c);
                return;
            default:
                this.f4109b.e().onError(this.f4110c);
                return;
        }
    }
}
