package fi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import bi.ec;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xz;
public final class la extends r {
    public final Path Q1;
    public final va R1;

    public la(va vaVar, Activity activity, FrameLayout frameLayout, rt0 rt0Var, FrameLayout frameLayout2, di.b bVar, org.telegram.ui.Components.y9 y9Var) {
        super(activity, frameLayout, rt0Var, frameLayout2, bVar, y9Var);
        this.R1 = vaVar;
        this.Q1 = new Path();
    }

    @Override
    public final boolean e() {
        cc ccVar;
        if (qp.s1(this.U).D3() || ((ccVar = cc.f32519w) != null && ccVar.f32520a == 2)) {
            return false;
        }
        int i7 = qp.s1(this.U).W4;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.G(Math.round(i7 / qp.s1(this.U).V4), "CaptionPremiumSubtitle", jg.g.j(i7, "")));
        int indexOf = X2.toString().indexOf("__");
        if (indexOf >= 0) {
            X2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = X2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                X2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                X2.setSpan(new xz(org.telegram.ui.ActionBar.k6.Uc, this.f12356a), indexOf, indexOf2, 33);
                X2.setSpan(new ka(this, 0), indexOf, indexOf2, 33);
            }
        }
        cc I = new hc(this.R1.f12971l0, this.f12356a).I(2131623970, hd.M0(2131752556, null), X2);
        I.f32520a = 2;
        I.f32527j = 5000;
        I.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.R1.f12988r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        fb fbVar;
        va vaVar = this.R1;
        if (vaVar.Y0 != null && (fbVar = vaVar.Z0) != null && fbVar.getVisibility() == 0) {
            return vaVar.Z0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.ca caVar, Canvas canvas, RectF rectF, float f10, boolean z9, float f11, float f12, boolean z10) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.Q1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f11, f12);
        caVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.R1.f12975n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        va vaVar = this.R1;
        x9 x9Var = vaVar.f13002v1;
        if (x9Var != null && x9Var.A0 != null) {
            la laVar = vaVar.f12944c1;
            if (!laVar.f12375o0) {
                float x10 = laVar.getX() + f10;
                float y10 = vaVar.f12944c1.getY() + f11;
                float x11 = vaVar.f12971l0.getX() + x10;
                float y11 = vaVar.f12971l0.getY() + y10;
                float x12 = x11 - vaVar.f12959h0.getX();
                float y12 = y11 - vaVar.f12959h0.getY();
                for (int i7 = 0; i7 < vaVar.f13002v1.A0.getChildCount(); i7++) {
                    View childAt = vaVar.f13002v1.A0.getChildAt(i7);
                    if (childAt instanceof tg.j) {
                        ki0 selectionBounds = ((tg.j) childAt).getSelectionBounds();
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f12 = selectionBounds.f35322a;
                        float f13 = selectionBounds.f35323b;
                        rectF.set(f12, f13, selectionBounds.f35324c + f12, selectionBounds.d + f13);
                        if (rectF.contains(x12, y12)) {
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
        ec ecVar = this.R1.f12995t0;
        if (ecVar != null) {
            ecVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z9) {
        boolean z10;
        e7 e7Var;
        va vaVar = this.R1;
        s5 s5Var = vaVar.f12940b1;
        if (!vaVar.N1 && !z9) {
            di.y6 P1 = qp.s1(this.U).P1();
            int A = vaVar.A();
            di.s6 o4 = P1.o();
            if (o4 == null || !o4.a(P1.f9963a, A) || ((e7Var = vaVar.K1) != null && e7Var.f11892g)) {
                z10 = true;
                s5Var.setShareEnabled(z10);
            }
        }
        z10 = false;
        s5Var.setShareEnabled(z10);
    }
}
