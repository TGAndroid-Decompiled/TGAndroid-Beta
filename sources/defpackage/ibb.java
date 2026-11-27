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
public final class ibb extends zb1 {
    public final Path R1;
    public final sbb S1;

    public ibb(sbb sbbVar, Activity activity, FrameLayout frameLayout, wma wmaVar, FrameLayout frameLayout2, x53 x53Var, tl0 tl0Var) {
        super(activity, frameLayout, wmaVar, frameLayout2, x53Var, tl0Var);
        this.S1 = sbbVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        v21 v21Var;
        if (uc7.s1(this.V).M3() || ((v21Var = v21.x) != null && v21Var.a == 2)) {
            return false;
        }
        int f = uc7.s1(this.V).l4.r1.f();
        SpannableStringBuilder S2 = hl.S2(ob6.G(Math.round(f / uc7.s1(this.V).l4.q1.f()), "CaptionPremiumSubtitle", String.valueOf(f)));
        int indexOf = S2.toString().indexOf("__");
        if (indexOf >= 0) {
            S2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = S2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                S2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                S2.setSpan(new ho4(aob.Xc, this.a), indexOf, indexOf2, 33);
                S2.setSpan(new a31(this, (byte) 10), indexOf, indexOf2, 33);
            }
        }
        v21 I = new d31(this.S1.m0, this.a).I(2131623970, ob6.M0(2131752537, null), S2);
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
        ksb ksbVar;
        sbb sbbVar = this.S1;
        if (sbbVar.Z0 != null && (ksbVar = sbbVar.a1) != null && ksbVar.getVisibility() == 0) {
            return sbbVar.a1.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(xl0 xl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f2, f3);
        xl0Var.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    @Override
    public final boolean l(float f, float f2) {
        sbb sbbVar = this.S1;
        wab wabVar = sbbVar.w1;
        if (wabVar != null && wabVar.B0 != null) {
            ibb ibbVar = sbbVar.d1;
            if (!ibbVar.p0) {
                float x = ibbVar.getX() + f;
                float y = sbbVar.d1.getY() + f2;
                float x2 = sbbVar.m0.getX() + x;
                float y2 = sbbVar.m0.getY() + y;
                float x3 = x2 - sbbVar.i0.getX();
                float y3 = y2 - sbbVar.i0.getY();
                for (int i = 0; i < sbbVar.w1.B0.getChildCount(); i++) {
                    View childAt = sbbVar.w1.B0.getChildAt(i);
                    if (childAt instanceof h44) {
                        a69 selectionBounds = ((h44) childAt).getSelectionBounds();
                        RectF rectF = hl.P;
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
        nf9 nf9Var = this.S1.u0;
        if (nf9Var != null) {
            nf9Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z) {
        boolean z2;
        c8b c8bVar;
        sbb sbbVar = this.S1;
        im8 im8Var = sbbVar.c1;
        if (!sbbVar.O1 && !z) {
            c6b O1 = uc7.s1(this.V).O1();
            int z3 = sbbVar.z();
            xx n = O1.n();
            if (n == null || !n.a(O1.a, z3) || ((c8bVar = sbbVar.L1) != null && c8bVar.g)) {
                z2 = true;
                im8Var.setShareEnabled(z2);
            }
        }
        z2 = false;
        im8Var.setShareEnabled(z2);
    }
}
