package jg;

import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ty;
public final class d1 {
    public final int f17428a;
    public final long f17429b;
    public final long f17430c;
    public boolean f17431e;
    public final int f17433g;
    public final gs h;
    public boolean d = false;
    public long f17432f = -1;

    public d1(gs gsVar, int i7, long j3, long j10, int i10) {
        this.f17433g = i10;
        this.h = gsVar;
        this.f17428a = i7;
        this.f17429b = j3;
        this.f17430c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f17433g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                ty tyVar = (ty) this.h;
                if (tyVar.f40126u1 != null && tyVar.getVisibility() == 0 && tyVar.L0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f17431e) {
                np.u1(this.f17428a).N4(2, 0, this.f17429b, this.f17430c, null);
            }
            this.f17432f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f17432f == -1) {
                this.f17432f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f17432f > 2000) {
                this.f17431e = true;
                this.f17432f = System.currentTimeMillis();
                np.u1(this.f17428a).N4(10, 0, this.f17429b, this.f17430c, null);
            }
        }
    }
}
