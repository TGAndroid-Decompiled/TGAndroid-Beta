package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2853a;
    public final v0.g f2854b;
    public final i f2855c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2853a = i7;
        this.f2854b = gVar;
        this.f2855c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2853a) {
            case 0:
                Object obj = this.f2855c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2854b.a(obj);
                return;
            case 1:
                this.f2854b.a(this.f2855c);
                return;
            default:
                this.f2854b.a(this.f2855c);
                return;
        }
    }
}
