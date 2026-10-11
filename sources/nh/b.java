package nh;

import android.content.Context;
import android.os.Build;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.is;
import yf.i0;
public final class b extends ci.d implements me.d {
    public final me.b f16943h0;
    public final d6 f16944i0;

    public b(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f16943h0 = new me.b(0, this, is.h, 320L, true);
        this.f16944i0 = d6Var;
        e();
        setOutlineProvider(i0.f52293b);
    }

    public final int m(int i10) {
        d6 d6Var = this.f16944i0;
        if (d6Var != null) {
            return d6Var.x0(i10);
        }
        return h6.x0(null, i10, false);
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        boolean q6;
        d6 d6Var = this.f16944i0;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = h6.I.q();
        }
        float f11 = this.f16943h0.f16401e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(h6.f20822d6), m(h6.Oh)));
        setTextColor(i0.a.d(f11, m(h6.f21062q7), m(h6.Sh)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (q6) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
                return;
            }
            setOutlineAmbientShadowColor(1610612736);
            setOutlineSpotShadowColor(1610612736);
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
