package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2904a;
    public final v0.g f2905b;
    public final i f2906c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2904a = i7;
        this.f2905b = gVar;
        this.f2906c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2904a) {
            case 0:
                Object obj = this.f2906c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2905b.a(obj);
                return;
            case 1:
                this.f2905b.a(this.f2906c);
                return;
            default:
                this.f2905b.a(this.f2906c);
                return;
        }
    }
}
