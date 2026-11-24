package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.a;
public final class v38 extends a {
    public final b48 G1;

    public v38(b48 b48Var, Activity activity) {
        super(activity, null);
        this.G1 = b48Var;
    }

    @Override
    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.G1.b.invalidate();
    }
}
