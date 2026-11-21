package jg;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.ty;
public final class d1 {
    public final int f17459a;
    public final long f17460b;
    public final long f17461c;
    public boolean f17462e;
    public final int f17464g;
    public final fs h;
    public boolean d = false;
    public long f17463f = -1;

    public d1(fs fsVar, int i7, long j3, long j10, int i10) {
        this.f17464g = i10;
        this.h = fsVar;
        this.f17459a = i7;
        this.f17460b = j3;
        this.f17461c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f17464g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                ty tyVar = (ty) this.h;
                if (tyVar.f40151u1 != null && tyVar.getVisibility() == 0 && tyVar.L0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f17462e) {
                mp.u1(this.f17459a).N4(2, 0, this.f17460b, this.f17461c, null);
            }
            this.f17463f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f17463f == -1) {
                this.f17463f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f17463f > 2000) {
                this.f17462e = true;
                this.f17463f = System.currentTimeMillis();
                mp.u1(this.f17459a).N4(10, 0, this.f17460b, this.f17461c, null);
            }
        }
    }
}
