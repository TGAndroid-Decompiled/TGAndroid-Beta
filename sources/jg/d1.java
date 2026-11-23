package jg;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.qy;
public final class d1 {
    public final int f17530a;
    public final long f17531b;
    public final long f17532c;
    public boolean f17533e;
    public final int f17535g;
    public final fs h;
    public boolean d = false;
    public long f17534f = -1;

    public d1(fs fsVar, int i7, long j3, long j10, int i10) {
        this.f17535g = i10;
        this.h = fsVar;
        this.f17530a = i7;
        this.f17531b = j3;
        this.f17532c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f17535g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                qy qyVar = (qy) this.h;
                if (qyVar.f39099u1 != null && qyVar.getVisibility() == 0 && qyVar.L0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f17533e) {
                mp.u1(this.f17530a).N4(2, 0, this.f17531b, this.f17532c, null);
            }
            this.f17534f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f17534f == -1) {
                this.f17534f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f17534f > 2000) {
                this.f17533e = true;
                this.f17534f = System.currentTimeMillis();
                mp.u1(this.f17530a).N4(10, 0, this.f17531b, this.f17532c, null);
            }
        }
    }
}
