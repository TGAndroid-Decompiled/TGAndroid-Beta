package di;

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
import org.telegram.ui.Components.ov0;
public final class fc extends r {
    public final Path R1;
    public final pc S1;

    public fc(pc pcVar, Activity activity, FrameLayout frameLayout, ov0 ov0Var, FrameLayout frameLayout2, bi.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(activity, frameLayout, ov0Var, frameLayout2, bVar, jaVar);
        this.S1 = pcVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.qc qcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((qcVar = org.telegram.ui.Components.qc.f29671w) != null && qcVar.f29672a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), i2.g.i(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.f7584a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new ec(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.qc M = new org.telegram.ui.Components.yc(this.S1.f7878l0, this.f7584a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f29672a = 2;
        M.f29679j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f7896r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        zc zcVar;
        pc pcVar = this.S1;
        if (pcVar.Y0 != null && (zcVar = pcVar.Z0) != null && zcVar.getVisibility() == 0) {
            return pcVar.Z0.getTimelineHeight();
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
        this.S1.f7882n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        pc pcVar = this.S1;
        rb rbVar = pcVar.f7910v1;
        if (rbVar != null && rbVar.R0 != null) {
            fc fcVar = pcVar.f7850c1;
            if (!fcVar.f7604p0) {
                float x10 = fcVar.getX() + f7;
                float y3 = pcVar.f7850c1.getY() + f10;
                float x11 = pcVar.f7878l0.getX() + x10;
                float y10 = pcVar.f7878l0.getY() + y3;
                float x12 = x11 - pcVar.f7866h0.getX();
                float y11 = y10 - pcVar.f7866h0.getY();
                for (int i10 = 0; i10 < pcVar.f7910v1.R0.getChildCount(); i10++) {
                    View childAt = pcVar.f7910v1.R0.getChildAt(i10);
                    if (childAt instanceof rg.k) {
                        hk0 selectionBounds = ((rg.k) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f26743a;
                        float f12 = selectionBounds.f26744b;
                        rectF.set(f11, f12, selectionBounds.f26745c + f11, selectionBounds.d + f12);
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
        eb ebVar = this.S1.f7903t0;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        o8 o8Var;
        pc pcVar = this.S1;
        u6 u6Var = pcVar.f7846b1;
        if (!pcVar.N1 && !z10) {
            bi.u8 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = pcVar.B();
            bi.n8 o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.f3805a, B) || ((o8Var = pcVar.K1) != null && o8Var.f7756g)) {
                z11 = true;
                u6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        u6Var.setShareEnabled(z11);
    }
}
