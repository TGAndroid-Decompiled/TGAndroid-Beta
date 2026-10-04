package nh;

import android.content.Context;
import android.os.Build;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.tr;
import yf.f0;
public final class b extends ci.d implements le.d {
    public final le.b f16904h0;
    public final d6 f16905i0;

    public b(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f16904h0 = new le.b(0, this, tr.h, 320L, true);
        this.f16905i0 = d6Var;
        e();
        setOutlineProvider(f0.f50987b);
    }

    @Override
    public final void a0(int i10, float f7, float f10, e eVar) {
        boolean q6;
        d6 d6Var = this.f16905i0;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = i6.I.q();
        }
        float f11 = this.f16904h0.f15436e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(i6.f20822d6), m(i6.Oh)));
        setTextColor(i0.a.d(f11, m(i6.f21063q7), m(i6.Sh)));
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

    public final int m(int i10) {
        d6 d6Var = this.f16905i0;
        if (d6Var != null) {
            return d6Var.H0(i10);
        }
        return i6.w0(null, i10, false);
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
