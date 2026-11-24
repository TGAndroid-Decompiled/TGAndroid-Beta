package defpackage;

import android.app.Activity;
import android.widget.LinearLayout;
public final class oj2 extends LinearLayout {
    public final rj2 a;

    public oj2(rj2 rj2Var, Activity activity) {
        super(activity);
        this.a = rj2Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.D0();
    }
}
