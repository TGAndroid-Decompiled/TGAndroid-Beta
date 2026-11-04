package kg;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.ey;
public final class a1 {
    public final int f16920a;
    public final long f16921b;
    public final long f16922c;
    public boolean f16923e;
    public final int f16925g;
    public final cs h;
    public boolean d = false;
    public long f16924f = -1;

    public a1(cs csVar, int i3, long j10, long j11, int i10) {
        this.f16925g = i10;
        this.h = csVar;
        this.f16920a = i3;
        this.f16921b = j10;
        this.f16922c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.f16925g) {
            case 0:
                N = ((e1) this.h).N();
                break;
            default:
                ey eyVar = (ey) this.h;
                if (eyVar.f33582u1 != null && eyVar.getVisibility() == 0 && eyVar.L0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f16923e) {
                hp.s1(this.f16920a).C4(2, 0, this.f16921b, this.f16922c, null);
            }
            this.f16924f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f16924f == -1) {
                this.f16924f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f16924f > 2000) {
                this.f16923e = true;
                this.f16924f = System.currentTimeMillis();
                hp.s1(this.f16920a).C4(10, 0, this.f16921b, this.f16922c, null);
            }
        }
    }
}
