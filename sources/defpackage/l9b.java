package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class l9b extends yc1 {
    public final Path R1;
    public final v9b S1;

    public l9b(v9b v9bVar, Activity activity, FrameLayout frameLayout, ela elaVar, FrameLayout frameLayout2, r63 r63Var, sm0 sm0Var) {
        super(activity, frameLayout, elaVar, frameLayout2, r63Var, sm0Var);
        this.S1 = v9bVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        u31 u31Var;
        if (oc7.r1(this.V).H3() || ((u31Var = u31.x) != null && u31Var.a == 2)) {
            return false;
        }
        int f = oc7.r1(this.V).l4.j1.f();
        SpannableStringBuilder S2 = gm.S2(jb6.G(Math.round(f / oc7.r1(this.V).l4.i1.f()), "CaptionPremiumSubtitle", String.valueOf(f)));
        int indexOf = S2.toString().indexOf("__");
        if (indexOf >= 0) {
            S2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = S2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                S2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                S2.setSpan(new do4(cmb.Wc, this.a), indexOf, indexOf2, 33);
                S2.setSpan(new z31(this, (byte) 10), indexOf, indexOf2, 33);
            }
        }
        u31 I = new c41(this.S1.m0, this.a).I(2131623970, jb6.M0(2131752509, null), S2);
        I.a = 2;
        I.j = 5000;
        I.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.s0.c();
    }

    @Override
    public final int getTimelineHeight() {
        lqb lqbVar;
        v9b v9bVar = this.S1;
        if (v9bVar.Z0 != null && (lqbVar = v9bVar.a1) != null && lqbVar.getVisibility() == 0) {
            return v9bVar.a1.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(wm0 wm0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f2, f3);
        wm0Var.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    @Override
    public final boolean l(float f, float f2) {
        v9b v9bVar = this.S1;
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null && z8bVar.H0 != null) {
            l9b l9bVar = v9bVar.d1;
            if (!l9bVar.p0) {
                float x = l9bVar.getX() + f;
                float y = v9bVar.d1.getY() + f2;
                float x2 = v9bVar.m0.getX() + x;
                float y2 = v9bVar.m0.getY() + y;
                float x3 = x2 - v9bVar.i0.getX();
                float y3 = y2 - v9bVar.i0.getY();
                for (int i = 0; i < v9bVar.w1.H0.getChildCount(); i++) {
                    View childAt = v9bVar.w1.H0.getChildAt(i);
                    if (childAt instanceof w44) {
                        o49 selectionBounds = ((w44) childAt).getSelectionBounds();
                        RectF rectF = gm.P;
                        float f3 = selectionBounds.a;
                        float f4 = selectionBounds.b;
                        rectF.set(f3, f4, selectionBounds.c + f3, selectionBounds.d + f4);
                        if (rectF.contains(x3, y3)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void n() {
        xd9 xd9Var = this.S1.u0;
        if (xd9Var != null) {
            xd9Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z) {
        boolean z2;
        g6b g6bVar;
        v9b v9bVar = this.S1;
        yk8 yk8Var = v9bVar.c1;
        if (!v9bVar.O1 && !z) {
            h4b N1 = oc7.r1(this.V).N1();
            int z3 = v9bVar.z();
            xy n = N1.n();
            if (n == null || !n.a(N1.a, z3) || ((g6bVar = v9bVar.L1) != null && g6bVar.g)) {
                z2 = true;
                yk8Var.setShareEnabled(z2);
            }
        }
        z2 = false;
        yk8Var.setShareEnabled(z2);
    }
}
