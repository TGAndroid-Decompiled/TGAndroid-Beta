package cg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jv;
public final class a2 extends jv {
    public final f2 S;

    public a2(f2 f2Var, z1 z1Var, Context context, c6 c6Var, ArrayList arrayList) {
        super(z1Var, context, c6Var, arrayList);
        this.S = f2Var;
    }

    @Override
    public final void Y() {
        this.S.dismiss();
    }
}
