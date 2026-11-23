package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2872a;
    public final v0.g f2873b;
    public final i f2874c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2872a = i7;
        this.f2873b = gVar;
        this.f2874c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2872a) {
            case 0:
                Object obj = this.f2874c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2873b.a(obj);
                return;
            case 1:
                this.f2873b.a(this.f2874c);
                return;
            default:
                this.f2873b.a(this.f2874c);
                return;
        }
    }
}
