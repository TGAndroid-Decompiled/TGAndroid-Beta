package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nk5 extends ActionBarLayout {
    public final xg0 z1;

    public nk5(Activity activity, xg0 xg0Var) {
        super(activity, false);
        this.z1 = xg0Var;
    }

    @Override
    public final my0 getBottomSheet() {
        return ((my0[]) this.z1.b)[0];
    }
}
