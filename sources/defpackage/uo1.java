package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class uo1 extends qx3 {
    public final vo1 Q1;

    public uo1(vo1 vo1Var, d dVar, Activity activity, wjb wjbVar, ArrayList arrayList) {
        super(dVar, activity, wjbVar, arrayList);
        this.Q1 = vo1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.p.r6(false, true, 0.0f);
    }
}
