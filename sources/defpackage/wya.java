package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
public final class wya extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        int i;
        int i2;
        int i3;
        xya xyaVar = (xya) view;
        ImageView imageView = xyaVar.b;
        in inVar = xyaVar.a;
        int i4 = xyaVar.c;
        int i5 = b8cVar.d;
        if (i4 == i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        xyaVar.c = i5;
        inVar.c(b8cVar.m, z2, true);
        if (b8cVar.r) {
            i = aob.o6;
        } else {
            i = aob.G6;
        }
        aob.u0(i);
        if (b8cVar.r) {
            i2 = aob.o6;
        } else {
            i2 = aob.G6;
        }
        yob.U(inVar, i2, null);
        if (b8cVar.r) {
            i3 = aob.o6;
        } else {
            i3 = aob.G6;
        }
        yob.s(imageView, i3, null, PorterDuff.Mode.SRC_IN);
        float f = 180.0f;
        if (z2) {
            ViewPropertyAnimator animate = imageView.animate();
            if (b8cVar.f) {
                f = 0.0f;
            }
            animate.rotation(f).setDuration(340L).setInterpolator(k43.h);
        } else {
            if (b8cVar.f) {
                f = 0.0f;
            }
            imageView.setRotation(f);
        }
        xyaVar.d = z;
        xyaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new xya(context);
    }
}
