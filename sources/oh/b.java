package oh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import zf.j0;
public final class b extends ei.d implements ne.d {
    public final ne.b f17807k0;
    public final g6 f17808l0;
    public boolean m0;

    public b(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.f17807k0 = new ne.b(0, this, bs.h, 320L, true);
        this.f17808l0 = g6Var;
        f();
        setOutlineProvider(j0.f52048b);
    }

    public final int m(int i10) {
        g6 g6Var = this.f17808l0;
        if (g6Var != null) {
            return g6Var.g(i10);
        }
        return k6.x0(null, i10, false);
    }

    @Override
    public final void o(int i10, float f7, float f10, e eVar) {
        boolean q6;
        this.m0 = true;
        g6 g6Var = this.f17808l0;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = k6.I.q();
        }
        float f11 = this.f17807k0.e;
        setElevation((1.0f - f11) * AndroidUtilities.dp(1.0f));
        setColor(i0.a.f(f11, m(k6.f21183d6), m(k6.Oh)));
        setTextColor(i0.a.f(f11, m(k6.f21421q7), m(k6.Sh)));
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
    public final void updateColors() {
        super.updateColors();
        ne.b bVar = this.f17807k0;
        if (bVar != null && this.m0) {
            try {
                float f7 = bVar.e;
                int f10 = i0.a.f(f7, m(k6.f21183d6), m(k6.Oh));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f10) {
                    ((ShapeDrawable) background).getPaint().setColor(f10);
                    background.invalidateSelf();
                }
                setTextColor(i0.a.f(f7, m(k6.f21421q7), m(k6.Sh)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
