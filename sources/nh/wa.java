package nh;

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
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
public final class wa extends r {
    public final Path N1;
    public final gb O1;

    public wa(gb gbVar, Activity activity, FrameLayout frameLayout, hv0 hv0Var, FrameLayout frameLayout2, lh.b bVar, org.telegram.ui.Components.ga gaVar) {
        super(activity, frameLayout, hv0Var, frameLayout2, bVar, gaVar);
        this.O1 = gbVar;
        this.N1 = new Path();
    }

    @Override
    public final boolean e() {
        mc mcVar;
        if (MessagesController.getInstance(this.Q).premiumFeaturesBlocked() || ((mcVar = mc.f30644w) != null && mcVar.f30645a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault), j7.l1.k(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.f18067a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new cg.l0(this, 2), indexOf, indexOf2, 33);
            }
        }
        mc M = new tc(this.O1.f17761h0, this.f18067a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f30645a = 2;
        M.f30652j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.O1.f17778n0.c();
    }

    @Override
    public final int getTimelineHeight() {
        qb qbVar;
        gb gbVar = this.O1;
        if (gbVar.U0 != null && (qbVar = gbVar.V0) != null && qbVar.getVisibility() == 0) {
            return gbVar.V0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.ka kaVar, Canvas canvas, RectF rectF, float f9, boolean z10, float f10, float f11, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.N1;
        path.rewind();
        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f10, f11);
        kaVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.O1.f17777n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f9, float f10) {
        gb gbVar = this.O1;
        ja jaVar = gbVar.f17792r1;
        if (jaVar != null && jaVar.N0 != null) {
            wa waVar = gbVar.Y0;
            if (!waVar.f18083l0) {
                float x4 = waVar.getX() + f9;
                float y8 = gbVar.Y0.getY() + f10;
                float x10 = gbVar.f17761h0.getX() + x4;
                float y10 = gbVar.f17761h0.getY() + y8;
                float x11 = x10 - gbVar.f17747d0.getX();
                float y11 = y10 - gbVar.f17747d0.getY();
                for (int i10 = 0; i10 < gbVar.f17792r1.N0.getChildCount(); i10++) {
                    View childAt = gbVar.f17792r1.N0.getChildAt(i10);
                    if (childAt instanceof bg.k) {
                        hk0 selectionBounds = ((bg.k) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f29195a;
                        float f12 = selectionBounds.f29196b;
                        rectF.set(f11, f12, selectionBounds.f29197c + f11, selectionBounds.d + f12);
                        if (rectF.contains(x11, y11)) {
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
        cg.h0 h0Var = this.O1.f17784p0;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        o7 o7Var;
        gb gbVar = this.O1;
        w5 w5Var = gbVar.X0;
        if (!gbVar.J1 && !z10) {
            lh.s6 storiesController = MessagesController.getInstance(this.Q).getStoriesController();
            int B = gbVar.B();
            lh.m6 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.f16218a, B) || ((o7Var = gbVar.G1) != null && o7Var.f18270g)) {
                z11 = true;
                w5Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        w5Var.setShareEnabled(z11);
    }
}
