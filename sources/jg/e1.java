package jg;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.hy;
public final class e1 {
    public final int f16717a;
    public final long f16718b;
    public final long f16719c;
    public boolean f16720e;
    public final int f16722g;
    public final ls h;
    public boolean d = false;
    public long f16721f = -1;

    public e1(ls lsVar, int i7, long j3, long j10, int i10) {
        this.f16722g = i10;
        this.h = lsVar;
        this.f16717a = i7;
        this.f16718b = j3;
        this.f16719c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f16722g) {
            case 0:
                N = ((i1) this.h).N();
                break;
            default:
                hy hyVar = (hy) this.h;
                if (hyVar.f34467t1 != null && hyVar.getVisibility() == 0 && hyVar.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f16720e) {
                qp.s1(this.f16717a).C4(2, 0, this.f16718b, this.f16719c, null);
            }
            this.f16721f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f16721f == -1) {
                this.f16721f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f16721f > 2000) {
                this.f16720e = true;
                this.f16721f = System.currentTimeMillis();
                qp.s1(this.f16717a).C4(10, 0, this.f16718b, this.f16719c, null);
            }
        }
    }
}
