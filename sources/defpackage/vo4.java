package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
public final class vo4 extends b61 implements g94 {
    public final fn0 m0;
    public final ylb n0;
    public boolean o0;

    public vo4(Context context, ylb ylbVar) {
        super(ylbVar, context, true);
        this.m0 = new fn0(0, this, d53.h, 320L, true);
        this.n0 = ylbVar;
        f();
        setOutlineProvider(agc.b);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        boolean o;
        this.o0 = true;
        ylb ylbVar = this.n0;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        float f3 = this.m0.e;
        setElevation((1.0f - f3) * gm.L(1.0f));
        setColor(on2.f(f3, m(cmb.c6), m(cmb.Ei)));
        setTextColor(on2.f(f3, m(cmb.p7), m(cmb.Ii)));
        if (Build.VERSION.SDK_INT >= 28) {
            if (o) {
                setOutlineAmbientShadowColor(553648127);
                setOutlineSpotShadowColor(553648127);
                return;
            }
            setOutlineAmbientShadowColor(1610612736);
            setOutlineSpotShadowColor(1610612736);
        }
    }

    public final int m(int i) {
        ylb ylbVar = this.n0;
        if (ylbVar != null) {
            return ylbVar.h(i);
        }
        return cmb.w0(null, i, false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        fn0 fn0Var = this.m0;
        if (fn0Var != null && this.o0) {
            try {
                float f = fn0Var.e;
                int f2 = on2.f(f, m(cmb.c6), m(cmb.Ei));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f2) {
                    ((ShapeDrawable) background).getPaint().setColor(f2);
                    background.invalidateSelf();
                }
                setTextColor(on2.f(f, m(cmb.p7), m(cmb.Ii)));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
