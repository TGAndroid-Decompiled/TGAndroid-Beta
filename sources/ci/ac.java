package ci;

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
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.uk0;
public final class ac extends r {
    public final Path R1;
    public final kc S1;

    public ac(kc kcVar, Activity activity, FrameLayout frameLayout, cw0 cw0Var, FrameLayout frameLayout2, ai.d dVar, org.telegram.ui.Components.ja jaVar) {
        super(activity, frameLayout, cw0Var, frameLayout2, dVar, jaVar);
        this.S1 = kcVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.f27684w) != null && qcVar.f27685a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), hg.k0.h(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, this.f5114a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new zb(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new org.telegram.ui.Components.xc(this.S1.f5018l0, this.f5114a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f27685a = 2;
        M.f27691j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f5036r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        vc vcVar;
        kc kcVar = this.S1;
        if (kcVar.Y0 != null && (vcVar = kcVar.Z0) != null && vcVar.getVisibility() == 0) {
            return kcVar.Z0.getTimelineHeight();
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
        this.S1.f5022n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        kc kcVar = this.S1;
        mb mbVar = kcVar.f5050v1;
        if (mbVar != null && mbVar.R0 != null) {
            ac acVar = kcVar.f4991c1;
            if (!acVar.f5133p0) {
                float x10 = acVar.getX() + f7;
                float y3 = kcVar.f4991c1.getY() + f10;
                float x11 = kcVar.f5018l0.getX() + x10;
                float y10 = kcVar.f5018l0.getY() + y3;
                float x12 = x11 - kcVar.f5006h0.getX();
                float y11 = y10 - kcVar.f5006h0.getY();
                for (int i10 = 0; i10 < kcVar.f5050v1.R0.getChildCount(); i10++) {
                    View childAt = kcVar.f5050v1.R0.getChildAt(i10);
                    if (childAt instanceof qg.j) {
                        uk0 selectionBounds = ((qg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f28894a;
                        float f12 = selectionBounds.f28895b;
                        rectF.set(f11, f12, selectionBounds.f28896c + f11, selectionBounds.d + f12);
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
        ab abVar = this.S1.f5043t0;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        k8 k8Var;
        kc kcVar = this.S1;
        u6 u6Var = kcVar.f4987b1;
        if (!kcVar.N1 && !z10) {
            ai.l9 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = kcVar.B();
            ai.f9 o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.f1194a, B) || ((k8Var = kcVar.K1) != null && k8Var.f4935g)) {
                z11 = true;
                u6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        u6Var.setShareEnabled(z11);
    }
}
