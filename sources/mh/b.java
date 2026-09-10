package mh;

import android.content.Context;
import android.os.Build;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wr;
import xf.k0;
public final class b extends bi.d implements le.d {
    public final le.b f13660h0;
    public final f6 f13661i0;

    public b(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f13660h0 = new le.b(0, this, wr.h, 320L, true);
        this.f13661i0 = f6Var;
        e();
        setOutlineProvider(k0.f45157b);
    }

    @Override
    public final void G(int i10, float f7, float f10, e eVar) {
        boolean q6;
        f6 f6Var = this.f13661i0;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = j6.I.q();
        }
        float f11 = this.f13660h0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f11, m(j6.f17928d6), m(j6.Oh)));
        setTextColor(i0.a.d(f11, m(j6.f18162q7), m(j6.Sh)));
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
        f6 f6Var = this.f13661i0;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return j6.w0(null, i10, false);
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
