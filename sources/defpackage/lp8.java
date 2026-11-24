package defpackage;

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class lp8 extends rja {
    public final ProfileActivity x0;

    public lp8(ProfileActivity profileActivity, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.x0 = profileActivity;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        super.D(i, f, f2, h94Var);
        RectF rectF = ProfileActivity.e7;
        this.x0.V3();
    }
}
