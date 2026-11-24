package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oi5 extends ActionBarLayout {
    public final l0 z1;

    public oi5(Activity activity, l0 l0Var) {
        super(activity, false);
        this.z1 = l0Var;
    }

    @Override
    public final fx0 getBottomSheet() {
        return ((fx0[]) this.z1.b)[0];
    }
}
