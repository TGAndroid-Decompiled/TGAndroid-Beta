package eg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.lv;
public final class z1 extends lv {
    public final e2 T;

    public z1(e2 e2Var, y1 y1Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(y1Var, context, f6Var, arrayList);
        this.T = e2Var;
    }

    @Override
    public final void Y() {
        this.T.dismiss();
    }
}
