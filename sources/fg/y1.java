package fg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ov;
public final class y1 extends ov {
    public final d2 T;

    public y1(d2 d2Var, x1 x1Var, Context context, g6 g6Var, ArrayList arrayList) {
        super(x1Var, context, g6Var, arrayList);
        this.T = d2Var;
    }

    @Override
    public final void Y() {
        this.T.dismiss();
    }
}
