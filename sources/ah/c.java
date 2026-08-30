package ah;

import android.content.Context;
import android.os.Build;
import lf.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
public final class c extends ph.d implements xd.b {
    public final xd.a f194e0;
    public final f6 f195f0;

    public c(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f194e0 = new xd.a(0, this, nr.h, 320L, true);
        this.f195f0 = f6Var;
        e();
        setOutlineProvider(q0.f12054b);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        boolean q10;
        f6 f6Var = this.f195f0;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = j6.I.q();
        }
        float f12 = this.f194e0.e;
        setElevation((1.0f - f12) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.d(f12, m(j6.f19906d6), m(j6.Oh)));
        setTextColor(i0.a.d(f12, m(j6.f20141q7), m(j6.Sh)));
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
        f6 f6Var = this.f195f0;
        if (f6Var != null) {
            return f6Var.x0(i10);
        }
        return j6.w0(null, i10, false);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
