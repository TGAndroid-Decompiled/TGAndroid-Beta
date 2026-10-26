package fi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;
public final class ib extends r {
    public final Path R1;
    public final sb S1;

    public ib(sb sbVar, Activity activity, FrameLayout frameLayout, vw0 vw0Var, FrameLayout frameLayout2, di.b bVar, org.telegram.ui.Components.la laVar) {
        super(activity, frameLayout, vw0Var, frameLayout2, bVar, laVar);
        this.S1 = sbVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.f31882x) != null && qcVar.f31883a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), ic.a.i(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new p10(org.telegram.ui.ActionBar.y6.gc, this.f11191a), indexOf, indexOf2, 33);
                replaceTags.setSpan(new hb(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new wc(this.S1.f11641l0, this.f11191a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f31883a = 2;
        M.f31889j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f11659r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        cc ccVar;
        sb sbVar = this.S1;
        if (sbVar.Y0 != null && (ccVar = sbVar.Z0) != null && ccVar.getVisibility() == 0) {
            return sbVar.Z0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.pa paVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f10, f11);
        paVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f11645n.X(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        sb sbVar = this.S1;
        ta taVar = sbVar.f11673v1;
        if (taVar != null && taVar.G0 != null) {
            ib ibVar = sbVar.f11614c1;
            if (!ibVar.f11210p0) {
                float x9 = ibVar.getX() + f7;
                float y3 = sbVar.f11614c1.getY() + f10;
                float x10 = sbVar.f11641l0.getX() + x9;
                float y10 = sbVar.f11641l0.getY() + y3;
                float x11 = x10 - sbVar.f11629h0.getX();
                float y11 = y10 - sbVar.f11629h0.getY();
                for (int i10 = 0; i10 < sbVar.f11673v1.G0.getChildCount(); i10++) {
                    View childAt = sbVar.f11673v1.G0.getChildAt(i10);
                    if (childAt instanceof sg.j) {
                        hl0 selectionBounds = ((sg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f29009a;
                        float f12 = selectionBounds.f29010b;
                        rectF.set(f11, f12, selectionBounds.f29011c + f11, selectionBounds.d + f12);
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
        bi.cc ccVar = this.S1.f11666t0;
        if (ccVar != null) {
            ccVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        w7 w7Var;
        sb sbVar = this.S1;
        i6 i6Var = sbVar.f11610b1;
        if (!sbVar.N1 && !z10) {
            di.h7 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int A = sbVar.A();
            di.b7 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.f8630a, A) || ((w7Var = sbVar.K1) != null && w7Var.f11903g)) {
                z11 = true;
                i6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        i6Var.setShareEnabled(z11);
    }
}
