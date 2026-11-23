package bi;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
public final class y3 implements y10 {
    public final int f4251a;
    public final Context f4252b;
    public final int f4253c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final u3 f4254e;

    public y3(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, u3 u3Var, int i10) {
        this.f4251a = i10;
        this.f4252b = context;
        this.f4253c = i7;
        this.d = h6Var;
        this.f4254e = u3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4251a) {
            case 0:
                lc k10 = this.f4254e.k();
                a5.q(this.f4252b, this.f4253c, this.d, k10, (String) obj, null);
                return;
            default:
                lc k11 = this.f4254e.k();
                a5.q(this.f4252b, this.f4253c, this.d, k11, (String) obj, null);
                return;
        }
    }
}
