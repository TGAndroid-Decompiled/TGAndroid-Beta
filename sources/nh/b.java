package nh;

import android.content.Context;
import android.os.Build;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qr;
import yf.i0;
public final class b extends ci.d implements le.d {
    public final le.b f15229h0;
    public final e6 f15230i0;

    public b(Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f15229h0 = new le.b(0, this, qr.h, 320L, true);
        this.f15230i0 = e6Var;
        e();
        setOutlineProvider(i0.f46829b);
    }

    @Override
    public final void D(int i10, float f7, float f10, e eVar) {
        boolean q6;
        e6 e6Var = this.f15230i0;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = i6.I.q();
        }
        float f11 = this.f15229h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(i6.f18834d6), m(i6.Oh)));
        setTextColor(i0.a.d(f11, m(i6.f19071q7), m(i6.Sh)));
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
        e6 e6Var = this.f15230i0;
        if (e6Var != null) {
            return e6Var.G0(i10);
        }
        return i6.w0(null, i10, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
