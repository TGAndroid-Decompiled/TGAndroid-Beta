package ei;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.xc;
public final class lb extends r {
    public final Path R1;
    public final vb S1;

    public lb(vb vbVar, Activity activity, FrameLayout frameLayout, jw0 jw0Var, FrameLayout frameLayout2, ci.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(activity, frameLayout, jw0Var, frameLayout2, bVar, jaVar);
        this.S1 = vbVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.f29638w) != null && qcVar.f29639a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), i2.d.j(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21052gc, this.f9394a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new kb(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new xc(this.S1.f9986l0, this.f9394a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f29639a = 2;
        M.f29645j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f10004r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        gc gcVar;
        vb vbVar = this.S1;
        if (vbVar.Y0 != null && (gcVar = vbVar.Z0) != null && gcVar.getVisibility() == 0) {
            return vbVar.Z0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.na naVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f10, f11);
        naVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f9990n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        vb vbVar = this.S1;
        xa xaVar = vbVar.f10018v1;
        if (xaVar != null && xaVar.R0 != null) {
            lb lbVar = vbVar.f9959c1;
            if (!lbVar.f9413p0) {
                float x10 = lbVar.getX() + f7;
                float y3 = vbVar.f9959c1.getY() + f10;
                float x11 = vbVar.f9986l0.getX() + x10;
                float y10 = vbVar.f9986l0.getY() + y3;
                float x12 = x11 - vbVar.f9974h0.getX();
                float y11 = y10 - vbVar.f9974h0.getY();
                for (int i10 = 0; i10 < vbVar.f10018v1.R0.getChildCount(); i10++) {
                    View childAt = vbVar.f10018v1.R0.getChildAt(i10);
                    if (childAt instanceof rg.j) {
                        el0 selectionBounds = ((rg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f25963a;
                        float f12 = selectionBounds.f25964b;
                        rectF.set(f11, f12, selectionBounds.f25965c + f11, selectionBounds.d + f12);
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
        ai.ic icVar = this.S1.f10011t0;
        if (icVar != null) {
            icVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        a8 a8Var;
        vb vbVar = this.S1;
        k6 k6Var = vbVar.f9955b1;
        if (!vbVar.N1 && !z10) {
            ci.i7 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int A = vbVar.A();
            ci.c7 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.f5494a, A) || ((a8Var = vbVar.K1) != null && a8Var.f8712g)) {
                z11 = true;
                k6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        k6Var.setShareEnabled(z11);
    }
}
