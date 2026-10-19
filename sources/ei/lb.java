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
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.xc;
public final class lb extends r {
    public final Path R1;
    public final vb S1;

    public lb(vb vbVar, Activity activity, FrameLayout frameLayout, kw0 kw0Var, FrameLayout frameLayout2, ci.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(activity, frameLayout, kw0Var, frameLayout2, bVar, jaVar);
        this.S1 = vbVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.f29589w) != null && qcVar.f29590a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), i2.e.j(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21048gc, this.f9393a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new kb(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new xc(this.S1.f9985l0, this.f9393a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f29590a = 2;
        M.f29596j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f10003r0.c();
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
        this.S1.f9989n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        vb vbVar = this.S1;
        xa xaVar = vbVar.f10017v1;
        if (xaVar != null && xaVar.R0 != null) {
            lb lbVar = vbVar.f9958c1;
            if (!lbVar.f9412p0) {
                float x10 = lbVar.getX() + f7;
                float y3 = vbVar.f9958c1.getY() + f10;
                float x11 = vbVar.f9985l0.getX() + x10;
                float y10 = vbVar.f9985l0.getY() + y3;
                float x12 = x11 - vbVar.f9973h0.getX();
                float y11 = y10 - vbVar.f9973h0.getY();
                for (int i10 = 0; i10 < vbVar.f10017v1.R0.getChildCount(); i10++) {
                    View childAt = vbVar.f10017v1.R0.getChildAt(i10);
                    if (childAt instanceof rg.j) {
                        el0 selectionBounds = ((rg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f25947a;
                        float f12 = selectionBounds.f25948b;
                        rectF.set(f11, f12, selectionBounds.f25949c + f11, selectionBounds.d + f12);
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
        ai.ic icVar = this.S1.f10010t0;
        if (icVar != null) {
            icVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        a8 a8Var;
        vb vbVar = this.S1;
        k6 k6Var = vbVar.f9954b1;
        if (!vbVar.N1 && !z10) {
            ci.i7 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int A = vbVar.A();
            ci.c7 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.f5493a, A) || ((a8Var = vbVar.K1) != null && a8Var.f8711g)) {
                z11 = true;
                k6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        k6Var.setShareEnabled(z11);
    }
}
