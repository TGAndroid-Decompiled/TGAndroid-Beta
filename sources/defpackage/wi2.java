package defpackage;

import android.app.Activity;
import android.widget.LinearLayout;
public final class wi2 extends LinearLayout {
    public final zi2 a;

    public wi2(zi2 zi2Var, Activity activity) {
        super(activity);
        this.a = zi2Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.E0();
    }
}
