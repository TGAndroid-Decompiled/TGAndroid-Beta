package ag;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.cv;

public final class s2 extends cv {
    public final y2 S;

    public s2(y2 y2Var, r2 r2Var, Context context, c6 c6Var, ArrayList arrayList) {
        super(r2Var, context, c6Var, arrayList);
        this.S = y2Var;
    }

    @Override
    public final void Y() {
        this.S.dismiss();
    }
}
