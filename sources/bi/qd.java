package bi;

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
import org.telegram.ui.Components.rk0;
public final class qd extends v {
    public final Path R1;
    public final ce S1;

    public qd(ce ceVar, Activity activity, FrameLayout frameLayout, aw0 aw0Var, FrameLayout frameLayout2, zh.b bVar, org.telegram.ui.Components.ia iaVar) {
        super(activity, frameLayout, aw0Var, frameLayout2, bVar, iaVar);
        this.S1 = ceVar;
        this.R1 = new Path();
    }

    @Override
    public final boolean e() {
        org.telegram.ui.Components.pc pcVar;
        if (MessagesController.getInstance(this.U).premiumFeaturesBlocked() || ((pcVar = org.telegram.ui.Components.pc.f26074w) != null && pcVar.f26075a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault), hc.b.j(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.f3260a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new pd(this, 0), indexOf, indexOf2, 33);
            }
        }
        org.telegram.ui.Components.pc M = new org.telegram.ui.Components.wc(this.S1.f2466l0, this.f3260a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f26075a = 2;
        M.f26081j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.S1.f2484r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        me meVar;
        ce ceVar = this.S1;
        if (ceVar.Y0 != null && (meVar = ceVar.Z0) != null && meVar.getVisibility() == 0) {
            return ceVar.Z0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.ma maVar, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.R1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f10, f11);
        maVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.S1.f2470n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        ce ceVar = this.S1;
        ad adVar = ceVar.f2498v1;
        if (adVar != null && adVar.R0 != null) {
            qd qdVar = ceVar.f2439c1;
            if (!qdVar.f3279p0) {
                float x10 = qdVar.getX() + f7;
                float y3 = ceVar.f2439c1.getY() + f10;
                float x11 = ceVar.f2466l0.getX() + x10;
                float y10 = ceVar.f2466l0.getY() + y3;
                float x12 = x11 - ceVar.f2454h0.getX();
                float y11 = y10 - ceVar.f2454h0.getY();
                for (int i10 = 0; i10 < ceVar.f2498v1.R0.getChildCount(); i10++) {
                    View childAt = ceVar.f2498v1.R0.getChildAt(i10);
                    if (childAt instanceof pg.j) {
                        rk0 selectionBounds = ((pg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f11 = selectionBounds.f26681a;
                        float f12 = selectionBounds.f26682b;
                        rectF.set(f11, f12, selectionBounds.f26683c + f11, selectionBounds.d + f12);
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
        nc ncVar = this.S1.f2491t0;
        if (ncVar != null) {
            ncVar.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        r9 r9Var;
        ce ceVar = this.S1;
        v7 v7Var = ceVar.f2435b1;
        if (!ceVar.N1 && !z10) {
            zh.i5 storiesController = MessagesController.getInstance(this.U).getStoriesController();
            int B = ceVar.B();
            j4.w o9 = storiesController.o();
            if (o9 == null || !o9.a(storiesController.f48499a, B) || ((r9Var = ceVar.K1) != null && r9Var.f3574g)) {
                z11 = true;
                v7Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        v7Var.setShareEnabled(z11);
    }
}
