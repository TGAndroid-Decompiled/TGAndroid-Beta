package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class g4 implements x10 {
    public final int f3616a;
    public final Context f3617b;
    public final int f3618c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final o3 f3619e;
    public final Boolean f3620f;

    public g4(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, o3 o3Var, Boolean bool, int i10) {
        this.f3616a = i10;
        this.f3617b = context;
        this.f3618c = i7;
        this.d = i6Var;
        this.f3619e = o3Var;
        this.f3620f = bool;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3616a) {
            case 0:
                lc k10 = this.f3619e.k();
                u4.q(this.f3617b, this.f3618c, this.d, k10, (String) obj, this.f3620f);
                return;
            case 1:
                lc k11 = this.f3619e.k();
                u4.q(this.f3617b, this.f3618c, this.d, k11, (String) obj, this.f3620f);
                return;
            case 2:
                lc k12 = this.f3619e.k();
                u4.q(this.f3617b, this.f3618c, this.d, k12, (String) obj, this.f3620f);
                return;
            default:
                lc k13 = this.f3619e.k();
                u4.q(this.f3617b, this.f3618c, this.d, k13, (String) obj, this.f3620f);
                return;
        }
    }
}
