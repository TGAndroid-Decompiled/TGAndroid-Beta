package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
public final class zo4 extends c51 implements s84 {
    public final fm0 m0;
    public final vnb n0;
    public boolean o0;

    public zo4(Context context, vnb vnbVar) {
        super(vnbVar, context, true);
        this.m0 = new fm0(0, this, k43.h, 320L, true);
        this.n0 = vnbVar;
        f();
        setOutlineProvider(yhc.b);
    }

    public final int m(int i) {
        vnb vnbVar = this.n0;
        if (vnbVar != null) {
            return vnbVar.h(i);
        }
        return aob.w0(null, i, false);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        boolean o;
        this.o0 = true;
        vnb vnbVar = this.n0;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        float f3 = this.m0.e;
        setElevation((1.0f - f3) * hl.L(1.0f));
        setColor(vm2.f(f3, m(aob.d6), m(aob.Fi)));
        setTextColor(vm2.f(f3, m(aob.q7), m(aob.Ji)));
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

    @Override
    public final void updateColors() {
        super.updateColors();
        fm0 fm0Var = this.m0;
        if (fm0Var != null && this.o0) {
            try {
                float f = fm0Var.e;
                int f2 = vm2.f(f, m(aob.d6), m(aob.Fi));
                Drawable background = getBackground();
                if ((background instanceof ShapeDrawable) && ((ShapeDrawable) background).getPaint().getColor() != f2) {
                    ((ShapeDrawable) background).getPaint().setColor(f2);
                    background.invalidateSelf();
                }
                setTextColor(vm2.f(f, m(aob.q7), m(aob.Ji)));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
