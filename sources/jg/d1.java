package jg;

import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ty;
public final class d1 {
    public final int f17462a;
    public final long f17463b;
    public final long f17464c;
    public boolean f17465e;
    public final int f17467g;
    public final gs h;
    public boolean d = false;
    public long f17466f = -1;

    public d1(gs gsVar, int i7, long j3, long j10, int i10) {
        this.f17467g = i10;
        this.h = gsVar;
        this.f17462a = i7;
        this.f17463b = j3;
        this.f17464c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f17467g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                ty tyVar = (ty) this.h;
                if (tyVar.f40144u1 != null && tyVar.getVisibility() == 0 && tyVar.L0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f17465e) {
                np.u1(this.f17462a).N4(2, 0, this.f17463b, this.f17464c, null);
            }
            this.f17466f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f17466f == -1) {
                this.f17466f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f17466f > 2000) {
                this.f17465e = true;
                this.f17466f = System.currentTimeMillis();
                np.u1(this.f17462a).N4(10, 0, this.f17463b, this.f17464c, null);
            }
        }
    }
}
