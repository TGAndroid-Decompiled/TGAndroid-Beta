package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2865a;
    public final v0.g f2866b;
    public final i f2867c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2865a = i7;
        this.f2866b = gVar;
        this.f2867c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2865a) {
            case 0:
                Object obj = this.f2867c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2866b.a(obj);
                return;
            case 1:
                this.f2866b.a(this.f2867c);
                return;
            default:
                this.f2866b.a(this.f2867c);
                return;
        }
    }
}
