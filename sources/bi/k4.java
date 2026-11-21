package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class k4 implements x10 {
    public final int f3788a;
    public final Context f3789b;
    public final int f3790c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final s3 f3791e;
    public final Boolean f3792f;

    public k4(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var, Boolean bool, int i10) {
        this.f3788a = i10;
        this.f3789b = context;
        this.f3790c = i7;
        this.d = h6Var;
        this.f3791e = s3Var;
        this.f3792f = bool;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3788a) {
            case 0:
                lc k10 = this.f3791e.k();
                y4.q(this.f3789b, this.f3790c, this.d, k10, (String) obj, this.f3792f);
                return;
            case 1:
                lc k11 = this.f3791e.k();
                y4.q(this.f3789b, this.f3790c, this.d, k11, (String) obj, this.f3792f);
                return;
            case 2:
                lc k12 = this.f3791e.k();
                y4.q(this.f3789b, this.f3790c, this.d, k12, (String) obj, this.f3792f);
                return;
            default:
                lc k13 = this.f3791e.k();
                y4.q(this.f3789b, this.f3790c, this.d, k13, (String) obj, this.f3792f);
                return;
        }
    }
}
