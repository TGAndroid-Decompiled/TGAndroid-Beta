package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class sp1 extends ly3 {
    public final zu1 Q1;

    public sp1(zu1 zu1Var, e eVar, Activity activity, vnb vnbVar, ArrayList arrayList) {
        super(eVar, activity, vnbVar, arrayList);
        this.Q1 = zu1Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.Q1.y6(false, true, 0.0f);
    }
}
