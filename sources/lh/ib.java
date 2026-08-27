package lh;

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
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zu0;

public final class ib extends s {
    public final Path N1;
    public final sb O1;

    public ib(sb sbVar, Activity activity, FrameLayout frameLayout, zu0 zu0Var, FrameLayout frameLayout2, jh.b bVar, org.telegram.ui.Components.z9 z9Var) {
        super(activity, frameLayout, zu0Var, frameLayout2, bVar, z9Var);
        this.O1 = sbVar;
        this.N1 = new Path();
    }

    @Override
    public final boolean e() {
        if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked()) {
            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
            int i10 = 2;
            if (ecVar == null || ecVar.f28013a != 2) {
                int i11 = MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i11 / MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault), i0.a.k(i11, "")));
                int iIndexOf = spannableStringBuilderReplaceTags.toString().indexOf("__");
                if (iIndexOf >= 0) {
                    spannableStringBuilderReplaceTags.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
                    int iIndexOf2 = spannableStringBuilderReplaceTags.toString().indexOf("__");
                    if (iIndexOf2 >= 0) {
                        spannableStringBuilderReplaceTags.replace(iIndexOf2, iIndexOf2 + 2, (CharSequence) "");
                        spannableStringBuilderReplaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.f16329a)), iIndexOf, iIndexOf2, 33);
                        spannableStringBuilderReplaceTags.setSpan(new ag.x0(this, i10), iIndexOf, iIndexOf2, 33);
                    }
                }
                org.telegram.ui.Components.ec ecVarM = new org.telegram.ui.Components.mc(this.O1.f16767h0, this.f16329a).M(LocaleController.getString(R.string.CaptionPremiumTitle), spannableStringBuilderReplaceTags, R.raw.caption_limit);
                ecVarM.f28013a = 2;
                ecVarM.f28020j = 5000;
                ecVarM.k(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.O1.f16784n0.c();
    }

    @Override
    public final int getTimelineHeight() {
        cc ccVar;
        sb sbVar = this.O1;
        if (sbVar.U0 == null || (ccVar = sbVar.V0) == null || ccVar.getVisibility() != 0) {
            return 0;
        }
        return sbVar.V0.getTimelineHeight();
    }

    @Override
    public final void h(org.telegram.ui.Components.da daVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11) {
        if (canvas.isHardwareAccelerated()) {
            canvas.save();
            Path path = this.N1;
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(f11, f12);
            daVar.b(canvas, true);
            canvas.restore();
        }
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.O1.f16783n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        sb sbVar = this.O1;
        va vaVar = sbVar.f16798r1;
        if (vaVar != null && vaVar.N0 != null) {
            ib ibVar = sbVar.Y0;
            if (!ibVar.f16345l0) {
                float x8 = ibVar.getX() + f10;
                float y10 = sbVar.Y0.getY() + f11;
                float x10 = sbVar.f16767h0.getX() + x8;
                float y11 = sbVar.f16767h0.getY() + y10;
                float x11 = x10 - sbVar.f16753d0.getX();
                float y12 = y11 - sbVar.f16753d0.getY();
                for (int i10 = 0; i10 < sbVar.f16798r1.N0.getChildCount(); i10++) {
                    View childAt = sbVar.f16798r1.N0.getChildAt(i10);
                    if (childAt instanceof zf.j) {
                        yj0 selectionBounds = ((zf.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f12 = selectionBounds.f34911a;
                        float f13 = selectionBounds.f34912b;
                        rectF.set(f12, f13, selectionBounds.f34913c + f12, selectionBounds.d + f13);
                        if (rectF.contains(x11, y12)) {
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
        ag.s0 s0Var = this.O1.f16790p0;
        if (s0Var != null) {
            s0Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        z7 z7Var;
        sb sbVar = this.O1;
        i6 i6Var = sbVar.X0;
        if (sbVar.J1 || z10) {
            z11 = false;
        } else {
            jh.s6 storiesController = MessagesController.getInstance(this.Q).getStoriesController();
            int iB = sbVar.B();
            jh.l6 l6VarO = storiesController.o();
            if (l6VarO == null || !l6VarO.a(storiesController.f13955a, iB) || ((z7Var = sbVar.G1) != null && z7Var.f17209g)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        i6Var.setShareEnabled(z11);
    }
}
