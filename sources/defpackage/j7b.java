package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class j7b extends rb1 {
    public final Path R1;
    public final t7b S1;

    public j7b(t7b t7bVar, Context context, FrameLayout frameLayout, cja cjaVar, FrameLayout frameLayout2, f53 f53Var, sl0 sl0Var) {
        super(context, frameLayout, cjaVar, frameLayout2, f53Var, sl0Var);
        this.S1 = t7bVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        m21 m21Var;
        if (na7.q1(this.V).E3() || ((m21Var = m21.w) != null && m21Var.a == 2)) {
            return false;
        }
        int f = na7.q1(this.V).k4.j1.f();
        SpannableStringBuilder T2 = gl.T2(k96.G(Math.round(f / na7.q1(this.V).k4.i1.f()), "CaptionPremiumSubtitle", String.valueOf(f)));
        int indexOf = T2.toString().indexOf("__");
        if (indexOf >= 0) {
            T2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = T2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                T2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                T2.setSpan(new cm4(bkb.Wc, this.a), indexOf, indexOf2, 33);
                T2.setSpan(new r21(this, (byte) 10), indexOf, indexOf2, 33);
            }
        }
        m21 I = new u21(this.S1.m0, this.a).I(2131623970, k96.M0(2131752544, null), T2);
        I.a = (byte) 2;
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
        kob kobVar;
        t7b t7bVar = this.S1;
        if (t7bVar.Z0 != null && (kobVar = t7bVar.a1) != null && kobVar.getVisibility() == 0) {
            return t7bVar.a1.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(wl0 wl0Var, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f2, f3);
        wl0Var.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, 12);
    }

    @Override
    public final boolean l(float f, float f2) {
        t7b t7bVar = this.S1;
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null && x6bVar.H0 != null) {
            j7b j7bVar = t7bVar.d1;
            if (!j7bVar.p0) {
                float x = j7bVar.getX() + f;
                float y = t7bVar.d1.getY() + f2;
                float x2 = t7bVar.m0.getX() + x;
                float y2 = t7bVar.m0.getY() + y;
                float x3 = x2 - t7bVar.i0.getX();
                float y3 = y2 - t7bVar.i0.getY();
                for (int i = 0; i < t7bVar.w1.H0.getChildCount(); i++) {
                    View childAt = t7bVar.w1.H0.getChildAt(i);
                    if (childAt instanceof l34) {
                        l29 selectionBounds = ((l34) childAt).getSelectionBounds();
                        RectF rectF = gl.P;
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
        si9 si9Var = this.S1.u0;
        if (si9Var != null) {
            si9Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z) {
        boolean z2;
        f4b f4bVar;
        t7b t7bVar = this.S1;
        vi8 vi8Var = t7bVar.c1;
        if (!t7bVar.O1 && !z) {
            g2b M1 = na7.q1(this.V).M1();
            int z3 = t7bVar.z();
            wx n = M1.n();
            if (n == null || !n.a(M1.a, z3) || ((f4bVar = t7bVar.L1) != null && f4bVar.g)) {
                z2 = true;
                vi8Var.setShareEnabled(z2);
            }
        }
        z2 = false;
        vi8Var.setShareEnabled(z2);
    }
}
