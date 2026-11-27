package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.a;
public final class l78 extends a {
    public final r78 G1;

    public l78(r78 r78Var, Activity activity) {
        super(activity, null);
        this.G1 = r78Var;
    }

    @Override
    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.G1.b.invalidate();
    }
}
