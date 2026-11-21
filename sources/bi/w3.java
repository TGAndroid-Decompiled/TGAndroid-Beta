package bi;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
public final class w3 implements x10 {
    public final int f4203a;
    public final Context f4204b;
    public final int f4205c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final s3 f4206e;

    public w3(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var, int i10) {
        this.f4203a = i10;
        this.f4204b = context;
        this.f4205c = i7;
        this.d = h6Var;
        this.f4206e = s3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4203a) {
            case 0:
                lc k10 = this.f4206e.k();
                y4.q(this.f4204b, this.f4205c, this.d, k10, (String) obj, null);
                return;
            default:
                lc k11 = this.f4206e.k();
                y4.q(this.f4204b, this.f4205c, this.d, k11, (String) obj, null);
                return;
        }
    }
}
