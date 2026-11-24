package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class cx3 extends qx3 {
    public final qx3 Q1;

    public cx3(qx3 qx3Var, d dVar, Context context, wjb wjbVar, ArrayList arrayList) {
        super(dVar, context, wjbVar, arrayList);
        this.Q1 = qx3Var;
    }

    @Override
    public final void G0() {
        this.Q1.dismiss();
    }
}
