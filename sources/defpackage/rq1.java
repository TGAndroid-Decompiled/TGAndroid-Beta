package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class rq1 extends az3 {
    public final yv1 Q1;

    public rq1(yv1 yv1Var, d dVar, Activity activity, ylb ylbVar, ArrayList arrayList) {
        super(dVar, activity, ylbVar, arrayList);
        this.Q1 = yv1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.y6(false, true, 0.0f);
    }
}
