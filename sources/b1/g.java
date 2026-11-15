package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2861a;
    public final v0.g f2862b;
    public final i f2863c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2861a = i7;
        this.f2862b = gVar;
        this.f2863c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2861a) {
            case 0:
                Object obj = this.f2863c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2862b.a(obj);
                return;
            case 1:
                this.f2862b.a(this.f2863c);
                return;
            default:
                this.f2862b.a(this.f2863c);
                return;
        }
    }
}
