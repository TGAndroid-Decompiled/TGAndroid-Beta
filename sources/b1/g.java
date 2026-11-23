package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2823a;
    public final v0.g f2824b;
    public final i f2825c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2823a = i7;
        this.f2824b = gVar;
        this.f2825c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2823a) {
            case 0:
                Object obj = this.f2825c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2824b.a(obj);
                return;
            case 1:
                this.f2824b.a(this.f2825c);
                return;
            default:
                this.f2824b.a(this.f2825c);
                return;
        }
    }
}
