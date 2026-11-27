package defpackage;

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qk5 extends ActionBarLayout {
    public final m0 z1;

    public qk5(Activity activity, m0 m0Var) {
        super(activity, false);
        this.z1 = m0Var;
    }

    @Override
    public final nx0 getBottomSheet() {
        return ((nx0[]) this.z1.b)[0];
    }
}
