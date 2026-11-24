package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class ep1 extends qx3 {
    public final mu1 Q1;

    public ep1(mu1 mu1Var, d dVar, Activity activity, wjb wjbVar, ArrayList arrayList) {
        super(dVar, activity, wjbVar, arrayList);
        this.Q1 = mu1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.r6(false, true, 0.0f);
    }
}
