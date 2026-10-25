package c1;

import w0.i;
public final class a implements Runnable {
    public final int f5915a;
    public final e f5916b;
    public final i f5917c;

    public a(e eVar, i iVar, int i10) {
        this.f5915a = i10;
        this.f5916b = eVar;
        this.f5917c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f5915a) {
            case 0:
                this.f5916b.e().onError(this.f5917c);
                return;
            case 1:
                this.f5916b.e().onError(this.f5917c);
                return;
            default:
                this.f5916b.e().onError(this.f5917c);
                return;
        }
    }
}
