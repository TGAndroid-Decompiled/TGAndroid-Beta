package bi;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
public final class w3 implements y10 {
    public final int f4208a;
    public final Context f4209b;
    public final int f4210c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final s3 f4211e;

    public w3(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, s3 s3Var, int i10) {
        this.f4208a = i10;
        this.f4209b = context;
        this.f4210c = i7;
        this.d = h6Var;
        this.f4211e = s3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f4208a) {
            case 0:
                lc k10 = this.f4211e.k();
                x4.q(this.f4209b, this.f4210c, this.d, k10, (String) obj, null);
                return;
            default:
                lc k11 = this.f4211e.k();
                x4.q(this.f4209b, this.f4210c, this.d, k11, (String) obj, null);
                return;
        }
    }
}
