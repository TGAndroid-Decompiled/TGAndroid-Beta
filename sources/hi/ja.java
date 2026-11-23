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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.lc;
public final class ja extends r {
    public final Path R1;
    public final ta S1;

    public ja(ta taVar, Activity activity, FrameLayout frameLayout, du0 du0Var, FrameLayout frameLayout2, fi.b bVar, org.telegram.ui.Components.ca caVar) {
        super(activity, frameLayout, du0Var, frameLayout2, bVar, caVar);
        this.S1 = taVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        gc gcVar;
        if (np.u1(this.V).K3() || ((gcVar = gc.f35481w) != null && gcVar.f35482a == 2)) {
            return false;
        }
        int i7 = np.u1(this.V).Z4;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.G(Math.round(i7 / np.u1(this.V).Y4), "CaptionPremiumSubtitle", i5.c.i(i7, "")));
        int indexOf = W2.toString().indexOf("__");
        if (indexOf >= 0) {
            W2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = W2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                W2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                W2.setSpan(new k00(org.telegram.ui.ActionBar.m6.Xc, this.f14962a), indexOf, indexOf2, 33);
                W2.setSpan(new ia(this, 0), indexOf, indexOf2, 33);
            }
        }
        gc I = new lc(this.S1.m0, this.f14962a).I(2131623970, hd.N0(2131752544, null), W2);
        I.f35482a = 2;
        I.f35489j = 5000;
        I.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f15445s0.c();
    }

    @Override
    public final int getTimelineHeight() {
        db dbVar;
        ta taVar = this.S1;
        if (taVar.Z0 != null && (dbVar = taVar.f15389a1) != null && dbVar.getVisibility() == 0) {
            return taVar.f15389a1.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.ga gaVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f11, f12);
        gaVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f15428n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        ta taVar = this.S1;
        v9 v9Var = taVar.f15459w1;
        if (v9Var != null && v9Var.B0 != null) {
            ja jaVar = taVar.f15400d1;
            if (!jaVar.f14982p0) {
                float x10 = jaVar.getX() + f10;
                float y10 = taVar.f15400d1.getY() + f11;
                float x11 = taVar.m0.getX() + x10;
                float y11 = taVar.m0.getY() + y10;
                float x12 = x11 - taVar.f15415i0.getX();
                float y12 = y11 - taVar.f15415i0.getY();
                for (int i7 = 0; i7 < taVar.f15459w1.B0.getChildCount(); i7++) {
                    View childAt = taVar.f15459w1.B0.getChildAt(i7);
                    if (childAt instanceof tg.j) {
                        aj0 selectionBounds = ((tg.j) childAt).getSelectionBounds();
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f12 = selectionBounds.f33496a;
                        float f13 = selectionBounds.f33497b;
                        rectF.set(f12, f13, selectionBounds.f33498c + f12, selectionBounds.d + f13);
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
        bi.o3 o3Var = this.S1.f15451u0;
        if (o3Var != null) {
            o3Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        d7 d7Var;
        ta taVar = this.S1;
        p5 p5Var = taVar.f15397c1;
        if (!taVar.O1 && !z10) {
            fi.p6 R1 = np.u1(this.V).R1();
            int A = taVar.A();
            fi.j6 o4 = R1.o();
            if (o4 == null || !o4.a(R1.f12377a, A) || ((d7Var = taVar.L1) != null && d7Var.f14378g)) {
                z11 = true;
                p5Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        p5Var.setShareEnabled(z11);
    }
}
