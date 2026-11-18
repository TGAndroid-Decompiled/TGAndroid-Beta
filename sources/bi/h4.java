package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class h4 implements x10 {
    public final int f3696a;
    public final Context f3697b;
    public final int f3698c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final o3 f3699e;
    public final Boolean f3700f;

    public h4(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, o3 o3Var, Boolean bool, int i10) {
        this.f3696a = i10;
        this.f3697b = context;
        this.f3698c = i7;
        this.d = i6Var;
        this.f3699e = o3Var;
        this.f3700f = bool;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3696a) {
            case 0:
                lc k10 = this.f3699e.k();
                v4.q(this.f3697b, this.f3698c, this.d, k10, (String) obj, this.f3700f);
                return;
            case 1:
                lc k11 = this.f3699e.k();
                v4.q(this.f3697b, this.f3698c, this.d, k11, (String) obj, this.f3700f);
                return;
            case 2:
                lc k12 = this.f3699e.k();
                v4.q(this.f3697b, this.f3698c, this.d, k12, (String) obj, this.f3700f);
                return;
            default:
                lc k13 = this.f3699e.k();
                v4.q(this.f3697b, this.f3698c, this.d, k13, (String) obj, this.f3700f);
                return;
        }
    }
}
