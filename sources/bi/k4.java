package bi;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
public final class k4 implements y10 {
    public final int f3797a;
    public final Context f3798b;
    public final int f3799c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final s3 f3800e;
    public final Boolean f3801f;

    public k4(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var, Boolean bool, int i10) {
        this.f3797a = i10;
        this.f3798b = context;
        this.f3799c = i7;
        this.d = h6Var;
        this.f3800e = s3Var;
        this.f3801f = bool;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3797a) {
            case 0:
                lc k10 = this.f3800e.k();
                x4.q(this.f3798b, this.f3799c, this.d, k10, (String) obj, this.f3801f);
                return;
            case 1:
                lc k11 = this.f3800e.k();
                x4.q(this.f3798b, this.f3799c, this.d, k11, (String) obj, this.f3801f);
                return;
            case 2:
                lc k12 = this.f3800e.k();
                x4.q(this.f3798b, this.f3799c, this.d, k12, (String) obj, this.f3801f);
                return;
            default:
                lc k13 = this.f3800e.k();
                x4.q(this.f3798b, this.f3799c, this.d, k13, (String) obj, this.f3801f);
                return;
        }
    }
}
