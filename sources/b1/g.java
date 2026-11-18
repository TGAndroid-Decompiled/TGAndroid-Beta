package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2852a;
    public final v0.g f2853b;
    public final i f2854c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2852a = i7;
        this.f2853b = gVar;
        this.f2854c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2852a) {
            case 0:
                Object obj = this.f2854c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2853b.a(obj);
                return;
            case 1:
                this.f2853b.a(this.f2854c);
                return;
            default:
                this.f2853b.a(this.f2854c);
                return;
        }
    }
}
