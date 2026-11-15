package jg;

import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ly;
public final class d1 {
    public final int f17051a;
    public final long f17052b;
    public final long f17053c;
    public boolean f17054e;
    public final int f17056g;
    public final is h;
    public boolean d = false;
    public long f17055f = -1;

    public d1(is isVar, int i7, long j3, long j10, int i10) {
        this.f17056g = i10;
        this.h = isVar;
        this.f17051a = i7;
        this.f17052b = j3;
        this.f17053c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f17056g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                ly lyVar = (ly) this.h;
                if (lyVar.f36993u1 != null && lyVar.getVisibility() == 0 && lyVar.L0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f17054e) {
                np.s1(this.f17051a).D4(2, 0, this.f17052b, this.f17053c, null);
            }
            this.f17055f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f17055f == -1) {
                this.f17055f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f17055f > 2000) {
                this.f17054e = true;
                this.f17055f = System.currentTimeMillis();
                np.s1(this.f17051a).D4(10, 0, this.f17052b, this.f17053c, null);
            }
        }
    }
}
