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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.sk0;
public final class bc extends r {
    public final Path R1;
    public final lc S1;

    public bc(lc lcVar, Activity activity, FrameLayout frameLayout, aw0 aw0Var, FrameLayout frameLayout2, ai.d dVar, org.telegram.ui.Components.ja jaVar) {
        super(activity, frameLayout, aw0Var, frameLayout2, dVar, jaVar);
        this.S1 = lcVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.f27570w) != null && qcVar.f27571a == 2)) {
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
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, this.f5113a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new ac(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new org.telegram.ui.Components.xc(this.S1.f5062l0, this.f5113a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f27571a = 2;
        M.f27577j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f5080r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        wc wcVar;
        lc lcVar = this.S1;
        if (lcVar.Y0 != null && (wcVar = lcVar.Z0) != null && wcVar.getVisibility() == 0) {
            return lcVar.Z0.getTimelineHeight();
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
        this.S1.f5066n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        lc lcVar = this.S1;
        nb nbVar = lcVar.f5094v1;
        if (nbVar != null && nbVar.R0 != null) {
            bc bcVar = lcVar.f5035c1;
            if (!bcVar.f5132p0) {
                float x10 = bcVar.getX() + f7;
                float y3 = lcVar.f5035c1.getY() + f10;
                float x11 = lcVar.f5062l0.getX() + x10;
                float y10 = lcVar.f5062l0.getY() + y3;
                float x12 = x11 - lcVar.f5050h0.getX();
                float y11 = y10 - lcVar.f5050h0.getY();
                for (int i10 = 0; i10 < lcVar.f5094v1.R0.getChildCount(); i10++) {
                    View childAt = lcVar.f5094v1.R0.getChildAt(i10);
                    if (childAt instanceof qg.j) {
                        sk0 selectionBounds = ((qg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f28265a;
                        float f12 = selectionBounds.f28266b;
                        rectF.set(f11, f12, selectionBounds.f28267c + f11, selectionBounds.d + f12);
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
        bb bbVar = this.S1.f5087t0;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        l8 l8Var;
        lc lcVar = this.S1;
        u6 u6Var = lcVar.f5031b1;
        if (!lcVar.N1 && !z10) {
            ai.l9 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = lcVar.B();
            ai.f9 o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.f1192a, B) || ((l8Var = lcVar.K1) != null && l8Var.f4979g)) {
                z11 = true;
                u6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        u6Var.setShareEnabled(z11);
    }
}
