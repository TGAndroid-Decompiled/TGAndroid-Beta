package oh;

import android.content.Context;
import android.os.Build;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import zf.j0;
public final class b extends di.d implements ne.d {
    public final ne.b f16653h0;
    public final c6 f16654i0;

    public b(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f16653h0 = new ne.b(0, this, es.h, 320L, true);
        this.f16654i0 = c6Var;
        e();
        setOutlineProvider(j0.f50192b);
    }

    public final int m(int i10) {
        c6 c6Var = this.f16654i0;
        if (c6Var != null) {
            return c6Var.F0(i10);
        }
        return g6.x0(null, i10, false);
    }

    @Override
    public final void p(int i10, float f7, float f10, e eVar) {
        boolean q6;
        c6 c6Var = this.f16654i0;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = g6.I.q();
        }
        float f11 = this.f16653h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(g6.f19901d6), m(g6.Oh)));
        setTextColor(i0.a.d(f11, m(g6.f20139q7), m(g6.Sh)));
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
