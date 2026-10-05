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
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.uk0;
public final class ac extends r {
    public final Path R1;
    public final kc S1;

    public ac(kc kcVar, Activity activity, FrameLayout frameLayout, mw0 mw0Var, FrameLayout frameLayout2, ai.d dVar, org.telegram.ui.Components.ka kaVar) {
        super(activity, frameLayout, mw0Var, frameLayout2, dVar, kaVar);
        this.S1 = kcVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.rc rcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((rcVar = org.telegram.ui.Components.rc.f30419w) != null && rcVar.f30420a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), hg.c.h(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, this.f5509a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new zb(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.rc M = new org.telegram.ui.Components.yc(this.S1.f5411l0, this.f5509a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f30420a = 2;
        M.f30427j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f5429r0.c();
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
    public final void h(org.telegram.ui.Components.oa oaVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f10, f11);
        oaVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f5415n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        kc kcVar = this.S1;
        mb mbVar = kcVar.f5443v1;
        if (mbVar != null && mbVar.R0 != null) {
            ac acVar = kcVar.f5383c1;
            if (!acVar.f5529p0) {
                float x10 = acVar.getX() + f7;
                float y3 = kcVar.f5383c1.getY() + f10;
                float x11 = kcVar.f5411l0.getX() + x10;
                float y10 = kcVar.f5411l0.getY() + y3;
                float x12 = x11 - kcVar.f5399h0.getX();
                float y11 = y10 - kcVar.f5399h0.getY();
                for (int i10 = 0; i10 < kcVar.f5443v1.R0.getChildCount(); i10++) {
                    View childAt = kcVar.f5443v1.R0.getChildAt(i10);
                    if (childAt instanceof qg.j) {
                        uk0 selectionBounds = ((qg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f31448a;
                        float f12 = selectionBounds.f31449b;
                        rectF.set(f11, f12, selectionBounds.f31450c + f11, selectionBounds.d + f12);
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
        ab abVar = this.S1.f5436t0;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        k8 k8Var;
        kc kcVar = this.S1;
        u6 u6Var = kcVar.f5379b1;
        if (!kcVar.N1 && !z10) {
            ai.l9 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = kcVar.B();
            ai.f9 o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.f1290a, B) || ((k8Var = kcVar.K1) != null && k8Var.f5326g)) {
                z11 = true;
                u6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        u6Var.setShareEnabled(z11);
    }
}
