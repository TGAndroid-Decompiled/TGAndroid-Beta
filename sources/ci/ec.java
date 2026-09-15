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
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pv0;
public final class ec extends r {
    public final Path R1;
    public final oc S1;

    public ec(oc ocVar, Activity activity, FrameLayout frameLayout, pv0 pv0Var, FrameLayout frameLayout2, ai.d dVar, org.telegram.ui.Components.ha haVar) {
        super(activity, frameLayout, pv0Var, frameLayout2, dVar, haVar);
        this.S1 = ocVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.oc ocVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((ocVar = org.telegram.ui.Components.oc.f26747w) != null && ocVar.f26748a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), hg.k0.i(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, this.f4982a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new dc(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.oc M = new org.telegram.ui.Components.vc(this.S1.f5235l0, this.f4982a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f26748a = 2;
        M.f26754j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f5253r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        zc zcVar;
        oc ocVar = this.S1;
        if (ocVar.Y0 != null && (zcVar = ocVar.Z0) != null && zcVar.getVisibility() == 0) {
            return ocVar.Z0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.la laVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f10, f11);
        laVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f5239n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        oc ocVar = this.S1;
        qb qbVar = ocVar.f5267v1;
        if (qbVar != null && qbVar.R0 != null) {
            ec ecVar = ocVar.f5208c1;
            if (!ecVar.f5001p0) {
                float x10 = ecVar.getX() + f7;
                float y3 = ocVar.f5208c1.getY() + f10;
                float x11 = ocVar.f5235l0.getX() + x10;
                float y10 = ocVar.f5235l0.getY() + y3;
                float x12 = x11 - ocVar.f5223h0.getX();
                float y11 = y10 - ocVar.f5223h0.getY();
                for (int i10 = 0; i10 < ocVar.f5267v1.R0.getChildCount(); i10++) {
                    View childAt = ocVar.f5267v1.R0.getChildAt(i10);
                    if (childAt instanceof qg.j) {
                        hk0 selectionBounds = ((qg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f24709a;
                        float f12 = selectionBounds.f24710b;
                        rectF.set(f11, f12, selectionBounds.f24711c + f11, selectionBounds.d + f12);
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
        eb ebVar = this.S1.f5260t0;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        o8 o8Var;
        oc ocVar = this.S1;
        v6 v6Var = ocVar.f5204b1;
        if (!ocVar.N1 && !z10) {
            ai.l9 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = ocVar.B();
            ai.f9 o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.f1188a, B) || ((o8Var = ocVar.K1) != null && o8Var.f5152g)) {
                z11 = true;
                v6Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        v6Var.setShareEnabled(z11);
    }
}
