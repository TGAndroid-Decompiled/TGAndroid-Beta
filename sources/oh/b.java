package oh;

import android.content.Context;
import android.os.Build;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import zf.j0;
public final class b extends ei.d implements ne.d {
    public final ne.b f17744h0;
    public final d6 f17745i0;

    public b(Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f17744h0 = new ne.b(0, this, bs.h, 320L, true);
        this.f17745i0 = d6Var;
        e();
        setOutlineProvider(j0.f51585b);
    }

    public final int m(int i10) {
        d6 d6Var = this.f17745i0;
        if (d6Var != null) {
            return d6Var.w(i10);
        }
        return h6.x0(null, i10, false);
    }

    @Override
    public final void r(int i10, float f7, float f10, e eVar) {
        boolean q6;
        d6 d6Var = this.f17745i0;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = h6.I.q();
        }
        float f11 = this.f17744h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.f(f11, m(h6.f20993d6), m(h6.Oh)));
        setTextColor(i0.a.f(f11, m(h6.f21231q7), m(h6.Sh)));
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
    public final void H(float f7, int i10) {
    }
}
