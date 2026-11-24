package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class jw9 extends px9 {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final kw9 T;

    public jw9(kw9 kw9Var, Context context, jx9 jx9Var, View view, dx9 dx9Var, wjb wjbVar, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(kw9Var.e, context, jx9Var, view, dx9Var, wjbVar);
        this.T = kw9Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}
