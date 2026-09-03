package bh;

import android.content.Context;
import android.os.Build;
import lf.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public final class c extends qh.d implements xd.b {
    public final xd.a f1984e0;
    public final g6 f1985f0;

    public c(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.f1984e0 = new xd.a(0, this, pr.h, 320L, true);
        this.f1985f0 = g6Var;
        e();
        setOutlineProvider(q0.f12505b);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        boolean q10;
        g6 g6Var = this.f1985f0;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = k6.I.q();
        }
        float f12 = this.f1984e0.f50541e;
        setElevation((1.0f - f12) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f12, m(k6.f21661d6), m(k6.Oh)));
        setTextColor(i0.a.d(f12, m(k6.f21897q7), m(k6.Sh)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (q10) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
                return;
            }
            setOutlineAmbientShadowColor(1610612736);
            setOutlineSpotShadowColor(1610612736);
        }
    }

    public final int m(int i10) {
        g6 g6Var = this.f1985f0;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return k6.w0(null, i10, false);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
