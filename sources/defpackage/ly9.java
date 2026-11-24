package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class ly9 extends rz9 {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final my9 T;

    public ly9(my9 my9Var, Context context, lz9 lz9Var, View view, fz9 fz9Var, ylb ylbVar, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(my9Var.e, context, lz9Var, view, fz9Var, ylbVar);
        this.T = my9Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}
