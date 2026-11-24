package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
public final class sua extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        int i;
        int i2;
        int i3;
        tua tuaVar = (tua) view;
        ImageView imageView = tuaVar.b;
        hn hnVar = tuaVar.a;
        int i4 = tuaVar.c;
        int i5 = c4cVar.d;
        if (i4 == i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        tuaVar.c = i5;
        hnVar.c(c4cVar.m, z2, true);
        if (c4cVar.r) {
            i = bkb.n6;
        } else {
            i = bkb.F6;
        }
        bkb.u0(i);
        if (c4cVar.r) {
            i2 = bkb.n6;
        } else {
            i2 = bkb.F6;
        }
        zkb.U(hnVar, i2, null);
        if (c4cVar.r) {
            i3 = bkb.n6;
        } else {
            i3 = bkb.F6;
        }
        zkb.s(imageView, i3, null, PorterDuff.Mode.SRC_IN);
        float f = 180.0f;
        if (z2) {
            ViewPropertyAnimator animate = imageView.animate();
            if (c4cVar.f) {
                f = 0.0f;
            }
            animate.rotation(f).setDuration(340L).setInterpolator(s33.h);
        } else {
            if (c4cVar.f) {
                f = 0.0f;
            }
            imageView.setRotation(f);
        }
        tuaVar.d = z;
        tuaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new tua(context);
    }
}
