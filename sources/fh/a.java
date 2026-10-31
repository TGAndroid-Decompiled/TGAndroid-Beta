package fh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import fe.e;
import fe.f;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import rf.e0;
import vh.d;
public final class a extends d implements e {
    public final fe.b f7095k0;
    public final p6 f7096l0;
    public boolean m0;

    public a(Context context, p6 p6Var) {
        super(context, p6Var, true);
        this.f7095k0 = new fe.b(0, this, gr.h, 320L, true);
        this.f7096l0 = p6Var;
        f();
        setOutlineProvider(e0.f46527b);
    }

    public final int m(int i10) {
        p6 p6Var = this.f7096l0;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return t6.x0(null, i10, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        fe.b bVar = this.f7095k0;
        if (bVar != null && this.m0) {
            try {
                float f7 = bVar.e;
                int f10 = i0.b.f(f7, m(t6.f20929d6), m(t6.Ci));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f10) {
                    ((ShapeDrawable) background).getPaint().setColor(f10);
                    background.invalidateSelf();
                }
                setTextColor(i0.b.f(f7, m(t6.f21170q7), m(t6.Gi)));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, f fVar) {
        boolean q6;
        this.m0 = true;
        p6 p6Var = this.f7096l0;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = t6.I.q();
        }
        float f11 = this.f7095k0.e;
        setElevation((1.0f - f11) * i0.L(1.0f));
        setColor(i0.b.f(f11, m(t6.f20929d6), m(t6.Ci)));
        setTextColor(i0.b.f(f11, m(t6.f21170q7), m(t6.Gi)));
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
    public final void E(float f7, int i10) {
    }
}
