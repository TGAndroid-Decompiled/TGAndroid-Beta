package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
public final class wwa extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        int i;
        int i2;
        int i3;
        xwa xwaVar = (xwa) view;
        ImageView imageView = xwaVar.b;
        io ioVar = xwaVar.a;
        int i4 = xwaVar.c;
        int i5 = c6cVar.d;
        if (i4 == i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        xwaVar.c = i5;
        ioVar.c(c6cVar.m, z2, true);
        if (c6cVar.r) {
            i = cmb.n6;
        } else {
            i = cmb.F6;
        }
        cmb.u0(i);
        if (c6cVar.r) {
            i2 = cmb.n6;
        } else {
            i2 = cmb.F6;
        }
        anb.U(ioVar, i2, null);
        if (c6cVar.r) {
            i3 = cmb.n6;
        } else {
            i3 = cmb.F6;
        }
        anb.s(imageView, i3, null, PorterDuff.Mode.SRC_IN);
        float f = 180.0f;
        if (z2) {
            ViewPropertyAnimator animate = imageView.animate();
            if (c6cVar.f) {
                f = 0.0f;
            }
            animate.rotation(f).setDuration(340L).setInterpolator(d53.h);
        } else {
            if (c6cVar.f) {
                f = 0.0f;
            }
            imageView.setRotation(f);
        }
        xwaVar.d = z;
        xwaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new xwa(context);
    }
}
