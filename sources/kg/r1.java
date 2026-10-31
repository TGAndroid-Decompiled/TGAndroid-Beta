package kg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cv;
public final class r1 extends cv {
    public final v1 N1;

    public r1(v1 v1Var, q1 q1Var, Context context, p6 p6Var, ArrayList arrayList) {
        super(q1Var, context, p6Var, arrayList);
        this.N1 = v1Var;
    }

    @Override
    public final void L0() {
        this.N1.dismiss();
    }
}
