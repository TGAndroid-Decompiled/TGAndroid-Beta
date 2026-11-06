package jg;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.gy;
public final class e1 {
    public final int f16714a;
    public final long f16715b;
    public final long f16716c;
    public boolean f16717e;
    public final int f16719g;
    public final ls h;
    public boolean d = false;
    public long f16718f = -1;

    public e1(ls lsVar, int i7, long j3, long j10, int i10) {
        this.f16719g = i10;
        this.h = lsVar;
        this.f16714a = i7;
        this.f16715b = j3;
        this.f16716c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f16719g) {
            case 0:
                N = ((i1) this.h).N();
                break;
            default:
                gy gyVar = (gy) this.h;
                if (gyVar.f34128t1 != null && gyVar.getVisibility() == 0 && gyVar.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f16717e) {
                qp.s1(this.f16714a).C4(2, 0, this.f16715b, this.f16716c, null);
            }
            this.f16718f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f16718f == -1) {
                this.f16718f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f16718f > 2000) {
                this.f16717e = true;
                this.f16718f = System.currentTimeMillis();
                qp.s1(this.f16714a).C4(10, 0, this.f16715b, this.f16716c, null);
            }
        }
    }
}
