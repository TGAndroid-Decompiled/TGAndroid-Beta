package bi;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
public final class n4 implements y10 {
    public final int f3880a;
    public final Context f3881b;
    public final int f3882c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final u3 f3883e;
    public final Boolean f3884f;

    public n4(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, u3 u3Var, Boolean bool, int i10) {
        this.f3880a = i10;
        this.f3881b = context;
        this.f3882c = i7;
        this.d = h6Var;
        this.f3883e = u3Var;
        this.f3884f = bool;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3880a) {
            case 0:
                lc k10 = this.f3883e.k();
                a5.q(this.f3881b, this.f3882c, this.d, k10, (String) obj, this.f3884f);
                return;
            case 1:
                lc k11 = this.f3883e.k();
                a5.q(this.f3881b, this.f3882c, this.d, k11, (String) obj, this.f3884f);
                return;
            case 2:
                lc k12 = this.f3883e.k();
                a5.q(this.f3881b, this.f3882c, this.d, k12, (String) obj, this.f3884f);
                return;
            default:
                lc k13 = this.f3883e.k();
                a5.q(this.f3881b, this.f3882c, this.d, k13, (String) obj, this.f3884f);
                return;
        }
    }
}
