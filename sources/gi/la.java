package gi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.tz;
public final class la extends r {
    public final Path R1;
    public final va S1;

    public la(va vaVar, Activity activity, FrameLayout frameLayout, qt0 qt0Var, FrameLayout frameLayout2, ei.b bVar, org.telegram.ui.Components.x9 x9Var) {
        super(activity, frameLayout, qt0Var, frameLayout2, bVar, x9Var);
        this.S1 = vaVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        ac acVar;
        if (hp.s1(this.V).D3() || ((acVar = ac.f31784w) != null && acVar.f31785a == 2)) {
            return false;
        }
        int i3 = hp.s1(this.V).W4;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.G(Math.round(i3 / hp.s1(this.V).V4), "CaptionPremiumSubtitle", k2.p1.i(i3, "")));
        int indexOf = X2.toString().indexOf("__");
        if (indexOf >= 0) {
            X2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = X2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                X2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                X2.setSpan(new tz(org.telegram.ui.ActionBar.k6.Uc, this.f13135a), indexOf, indexOf2, 33);
                X2.setSpan(new ka(this, 0), indexOf, indexOf2, 33);
            }
        }
        ac I = new fc(this.S1.m0, this.f13135a).I(2131623970, bd.M0(2131752556, null), X2);
        I.f31785a = 2;
        I.f31792j = 5000;
        I.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f13756s0.c();
    }

    @Override
    public final int getTimelineHeight() {
        fb fbVar;
        va vaVar = this.S1;
        if (vaVar.Z0 != null && (fbVar = vaVar.f13700a1) != null && fbVar.getVisibility() == 0) {
            return vaVar.f13700a1.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.ba baVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f11, f12);
        baVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f13738n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        va vaVar = this.S1;
        x9 x9Var = vaVar.f13770w1;
        if (x9Var != null && x9Var.B0 != null) {
            la laVar = vaVar.f13710d1;
            if (!laVar.f13155p0) {
                float x10 = laVar.getX() + f10;
                float y9 = vaVar.f13710d1.getY() + f11;
                float x11 = vaVar.m0.getX() + x10;
                float y10 = vaVar.m0.getY() + y9;
                float x12 = x11 - vaVar.f13726i0.getX();
                float y11 = y10 - vaVar.f13726i0.getY();
                for (int i3 = 0; i3 < vaVar.f13770w1.B0.getChildCount(); i3++) {
                    View childAt = vaVar.f13770w1.B0.getChildAt(i3);
                    if (childAt instanceof ug.j) {
                        ni0 selectionBounds = ((ug.j) childAt).getSelectionBounds();
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f12 = selectionBounds.f36563a;
                        float f13 = selectionBounds.f36564b;
                        rectF.set(f12, f13, selectionBounds.f36565c + f12, selectionBounds.d + f13);
                        if (rectF.contains(x12, y11)) {
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
        ai.x2 x2Var = this.S1.f13762u0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        f7 f7Var;
        va vaVar = this.S1;
        q5 q5Var = vaVar.f13708c1;
        if (!vaVar.O1 && !z10) {
            ei.z6 P1 = hp.s1(this.V).P1();
            int A = vaVar.A();
            ei.t6 o10 = P1.o();
            if (o10 == null || !o10.a(P1.f11274a, A) || ((f7Var = vaVar.L1) != null && f7Var.f12718g)) {
                z11 = true;
                q5Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        q5Var.setShareEnabled(z11);
    }
}
