package kh;

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
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.xu0;
public final class mb extends s {
    public final Path N1;
    public final wb O1;

    public mb(wb wbVar, Activity activity, FrameLayout frameLayout, xu0 xu0Var, FrameLayout frameLayout2, ih.b bVar, org.telegram.ui.Components.ba baVar) {
        super(activity, frameLayout, xu0Var, frameLayout2, bVar, baVar);
        this.O1 = wbVar;
        this.N1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.gc gcVar;
        if (MessagesController.getInstance(this.Q).premiumFeaturesBlocked() || ((gcVar = org.telegram.ui.Components.gc.f28729w) != null && gcVar.f28730a == 2)) {
            return false;
        }
        int i9 = MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i9 / MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault), j3.r0.l(i9, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, this.f15623a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new lb(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.gc M = new org.telegram.ui.Components.oc(this.O1.f16271h0, this.f15623a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f28730a = 2;
        M.f28737j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.O1.f16288n0.c();
    }

    @Override
    public final int getTimelineHeight() {
        gc gcVar;
        wb wbVar = this.O1;
        if (wbVar.U0 != null && (gcVar = wbVar.V0) != null && gcVar.getVisibility() == 0) {
            return wbVar.V0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.N1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f11, f12);
        faVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.O1.f16287n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        wb wbVar = this.O1;
        ya yaVar = wbVar.f16302r1;
        if (yaVar != null && yaVar.N0 != null) {
            mb mbVar = wbVar.Y0;
            if (!mbVar.f15639l0) {
                float x10 = mbVar.getX() + f10;
                float y10 = wbVar.Y0.getY() + f11;
                float x11 = wbVar.f16271h0.getX() + x10;
                float y11 = wbVar.f16271h0.getY() + y10;
                float x12 = x11 - wbVar.f16257d0.getX();
                float y12 = y11 - wbVar.f16257d0.getY();
                for (int i9 = 0; i9 < wbVar.f16302r1.N0.getChildCount(); i9++) {
                    View childAt = wbVar.f16302r1.N0.getChildAt(i9);
                    if (childAt instanceof yf.j) {
                        wj0 selectionBounds = ((yf.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f12 = selectionBounds.f34233a;
                        float f13 = selectionBounds.f34234b;
                        rectF.set(f12, f13, selectionBounds.f34235c + f12, selectionBounds.d + f13);
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
        fh.l2 l2Var = this.O1.f16294p0;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        a8 a8Var;
        wb wbVar = this.O1;
        k6 k6Var = wbVar.X0;
        if (!wbVar.J1 && !z10) {
            ih.v6 storiesController = MessagesController.getInstance(this.Q).getStoriesController();
            int B = wbVar.B();
            ih.p6 o6 = storiesController.o();
            if (o6 == null || !o6.a(storiesController.f12236a, B) || ((a8Var = wbVar.G1) != null && a8Var.f14917g)) {
                z11 = true;
                k6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        k6Var.setShareEnabled(z11);
    }
}
