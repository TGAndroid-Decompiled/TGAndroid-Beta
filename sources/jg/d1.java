package jg;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.ry;
public final class d1 {
    public final int f17437a;
    public final long f17438b;
    public final long f17439c;
    public boolean f17440e;
    public final int f17442g;
    public final fs h;
    public boolean d = false;
    public long f17441f = -1;

    public d1(fs fsVar, int i7, long j3, long j10, int i10) {
        this.f17442g = i10;
        this.h = fsVar;
        this.f17437a = i7;
        this.f17438b = j3;
        this.f17439c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f17442g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                ry ryVar = (ry) this.h;
                if (ryVar.f39397u1 != null && ryVar.getVisibility() == 0 && ryVar.L0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f17440e) {
                mp.u1(this.f17437a).N4(2, 0, this.f17438b, this.f17439c, null);
            }
            this.f17441f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f17441f == -1) {
                this.f17441f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f17441f > 2000) {
                this.f17440e = true;
                this.f17441f = System.currentTimeMillis();
                mp.u1(this.f17437a).N4(10, 0, this.f17438b, this.f17439c, null);
            }
        }
    }
}
