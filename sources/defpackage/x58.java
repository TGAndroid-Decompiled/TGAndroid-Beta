package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.a;
public final class x58 extends a {
    public final d68 G1;

    public x58(d68 d68Var, Activity activity) {
        super(activity, null);
        this.G1 = d68Var;
    }

    @Override
    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.G1.b.invalidate();
    }
}
