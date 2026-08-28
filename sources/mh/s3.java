package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class s3 extends k41 {
    public static final int f18104a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        t3 t3Var = (t3) view;
        CharSequence charSequence = l41Var.f30339l;
        CharSequence charSequence2 = l41Var.f30340m;
        t3Var.setText(charSequence);
        t3Var.f18133r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new t3(context, b6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
