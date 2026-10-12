package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4104a;
    public final e f4105b;
    public final i f4106c;

    public a(e eVar, i iVar, int i10) {
        this.f4104a = i10;
        this.f4105b = eVar;
        this.f4106c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4104a) {
            case 0:
                this.f4105b.e().onError(this.f4106c);
                return;
            case 1:
                this.f4105b.e().onError(this.f4106c);
                return;
            default:
                this.f4105b.e().onError(this.f4106c);
                return;
        }
    }
}
