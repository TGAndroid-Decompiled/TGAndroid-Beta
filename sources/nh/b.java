package nh;

import android.content.Context;
import android.os.Build;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.rr;
import yf.i0;
public final class b extends ci.d implements e {
    public final le.c f15206h0;
    public final d6 f15207i0;

    public b(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f15206h0 = new le.c(0, this, rr.h, 320L, true);
        this.f15207i0 = d6Var;
        e();
        setOutlineProvider(i0.f46787b);
    }

    @Override
    public final void D(int i10, float f7, float f10, f fVar) {
        boolean q6;
        d6 d6Var = this.f15207i0;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = h6.I.q();
        }
        float f11 = this.f15206h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(h6.f18789d6), m(h6.Oh)));
        setTextColor(i0.a.d(f11, m(h6.f19026q7), m(h6.Sh)));
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
        d6 d6Var = this.f15207i0;
        if (d6Var != null) {
            return d6Var.G0(i10);
        }
        return h6.w0(null, i10, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
