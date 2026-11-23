package hi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.i00;
public final class db extends s {
    public final Path R1;
    public final nb S1;

    public db(nb nbVar, Activity activity, FrameLayout frameLayout, cu0 cu0Var, FrameLayout frameLayout2, fi.b bVar, org.telegram.ui.Components.ba baVar) {
        super(activity, frameLayout, cu0Var, frameLayout2, bVar, baVar);
        this.S1 = nbVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.fc fcVar;
        if (mp.u1(this.V).K3() || ((fcVar = org.telegram.ui.Components.fc.f35083w) != null && fcVar.f35084a == 2)) {
            return false;
        }
        int i7 = mp.u1(this.V).Z4;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G(Math.round(i7 / mp.u1(this.V).Y4), "CaptionPremiumSubtitle", i5.c.i(i7, "")));
        int indexOf = W2.toString().indexOf("__");
        if (indexOf >= 0) {
            W2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = W2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                W2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                W2.setSpan(new i00(org.telegram.ui.ActionBar.n6.Xc, this.f14927a), indexOf, indexOf2, 33);
                W2.setSpan(new cb(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.fc I = new org.telegram.ui.Components.kc(this.S1.m0, this.f14927a).I(2131623970, gd.N0(2131752544, null), W2);
        I.f35084a = 2;
        I.f35091j = 5000;
        I.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f15112s0.c();
    }

    @Override
    public final int getTimelineHeight() {
        xb xbVar;
        nb nbVar = this.S1;
        if (nbVar.Z0 != null && (xbVar = nbVar.f15056a1) != null && xbVar.getVisibility() == 0) {
            return nbVar.f15056a1.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f11, f12);
        faVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f15095n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        nb nbVar = this.S1;
        pa paVar = nbVar.f15126w1;
        if (paVar != null && paVar.B0 != null) {
            db dbVar = nbVar.f15067d1;
            if (!dbVar.f14947p0) {
                float x10 = dbVar.getX() + f10;
                float y10 = nbVar.f15067d1.getY() + f11;
                float x11 = nbVar.m0.getX() + x10;
                float y11 = nbVar.m0.getY() + y10;
                float x12 = x11 - nbVar.f15082i0.getX();
                float y12 = y11 - nbVar.f15082i0.getY();
                for (int i7 = 0; i7 < nbVar.f15126w1.B0.getChildCount(); i7++) {
                    View childAt = nbVar.f15126w1.B0.getChildAt(i7);
                    if (childAt instanceof tg.n) {
                        aj0 selectionBounds = ((tg.n) childAt).getSelectionBounds();
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f12 = selectionBounds.f33482a;
                        float f13 = selectionBounds.f33483b;
                        rectF.set(f12, f13, selectionBounds.f33484c + f12, selectionBounds.d + f13);
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
        bi.o3 o3Var = this.S1.f15118u0;
        if (o3Var != null) {
            o3Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        x7 x7Var;
        nb nbVar = this.S1;
        z5 z5Var = nbVar.f15064c1;
        if (!nbVar.O1 && !z10) {
            fi.p6 R1 = mp.u1(this.V).R1();
            int A = nbVar.A();
            fi.j6 o4 = R1.o();
            if (o4 == null || !o4.a(R1.f12387a, A) || ((x7Var = nbVar.L1) != null && x7Var.f15749g)) {
                z11 = true;
                z5Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        z5Var.setShareEnabled(z11);
    }
}
