package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2858a;
    public final v0.g f2859b;
    public final i f2860c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2858a = i7;
        this.f2859b = gVar;
        this.f2860c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2858a) {
            case 0:
                Object obj = this.f2860c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2859b.a(obj);
                return;
            case 1:
                this.f2859b.a(this.f2860c);
                return;
            default:
                this.f2859b.a(this.f2860c);
                return;
        }
    }
}
