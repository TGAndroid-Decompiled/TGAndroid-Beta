package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4475a;
    public final e f4476b;
    public final i f4477c;

    public a(e eVar, i iVar, int i10) {
        this.f4475a = i10;
        this.f4476b = eVar;
        this.f4477c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4475a) {
            case 0:
                this.f4476b.e().onError(this.f4477c);
                return;
            case 1:
                this.f4476b.e().onError(this.f4477c);
                return;
            default:
                this.f4476b.e().onError(this.f4477c);
                return;
        }
    }
}
