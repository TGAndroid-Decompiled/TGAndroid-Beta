package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class s3 implements x10 {
    public final int f4051a;
    public final Context f4052b;
    public final int f4053c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final o3 f4054e;

    public s3(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, o3 o3Var, int i10) {
        this.f4051a = i10;
        this.f4052b = context;
        this.f4053c = i7;
        this.d = i6Var;
        this.f4054e = o3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4051a) {
            case 0:
                lc k10 = this.f4054e.k();
                v4.q(this.f4052b, this.f4053c, this.d, k10, (String) obj, null);
                return;
            default:
                lc k11 = this.f4054e.k();
                v4.q(this.f4052b, this.f4053c, this.d, k11, (String) obj, null);
                return;
        }
    }
}
