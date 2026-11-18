package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class s3 implements x10 {
    public final int f4019a;
    public final Context f4020b;
    public final int f4021c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final o3 f4022e;

    public s3(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, o3 o3Var, int i10) {
        this.f4019a = i10;
        this.f4020b = context;
        this.f4021c = i7;
        this.d = i6Var;
        this.f4022e = o3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4019a) {
            case 0:
                lc k10 = this.f4022e.k();
                u4.q(this.f4020b, this.f4021c, this.d, k10, (String) obj, null);
                return;
            default:
                lc k11 = this.f4022e.k();
                u4.q(this.f4020b, this.f4021c, this.d, k11, (String) obj, null);
                return;
        }
    }
}
