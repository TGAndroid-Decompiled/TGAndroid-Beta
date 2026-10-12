package nh;

import android.content.Context;
import android.os.Build;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.js;
import yf.i0;
public final class b extends ci.d implements me.d {
    public final me.b f16611h0;
    public final c6 f16612i0;

    public b(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f16611h0 = new me.b(0, this, js.h, 320L, true);
        this.f16612i0 = c6Var;
        e();
        setOutlineProvider(i0.f52404b);
    }

    public final int m(int i10) {
        c6 c6Var = this.f16612i0;
        if (c6Var != null) {
            return c6Var.x0(i10);
        }
        return h6.x0(null, i10, false);
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        boolean q6;
        c6 c6Var = this.f16612i0;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = h6.I.q();
        }
        float f11 = this.f16611h0.f16088e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(h6.f20560d6), m(h6.Oh)));
        setTextColor(i0.a.d(f11, m(h6.f20800q7), m(h6.Sh)));
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
    public final void C(float f7, int i10) {
    }
}
