package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import lh.ja;
import lh.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class e6 extends View {
    public final lh.i5 f10692a;
    public final f6 f10693b;
    public float f10694c;
    public float d;
    public Drawable e;

    public e6(Context context, int i10, f6 f6Var) {
        super(context);
        this.f10693b = f6Var;
        lh.i5 i5Var = new lh.i5(i10, this, f6Var);
        this.f10692a = i5Var;
        i5Var.f12592y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z4) {
        float dp;
        float f10;
        lh.i5 i5Var = this.f10692a;
        org.telegram.ui.Components.j5 j5Var = i5Var.e;
        a2 a2Var = i5Var.f12578j;
        ImageReceiver imageReceiver = i5Var.d;
        i5Var.K = false;
        i5Var.N = null;
        i5Var.O = null;
        i5Var.f12584p = false;
        i5Var.f12579k = (TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        i5Var.f12580l = (TL_stars.starGiftAttributePattern) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = i5Var.f12581m;
        i5Var.f12581m = (TL_stars.starGiftAttributeModel) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = i5Var.f12575f;
        i5Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = i5Var.f12580l;
        if (stargiftattributepattern != null) {
            j5Var.i(stargiftattributepattern.document, false);
        } else {
            j5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = i5Var.f12581m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f19165id != stargiftattributemodel2.document.f19165id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            ja.Z0(imageReceiver, i5Var.f12581m.document, 110);
        }
        boolean z10 = tL_starGiftUnique.burned;
        i5Var.J = z10;
        if (z10) {
            int v02 = j6.v0(j6.f20116q7, i5Var.f12574c);
            Paint paint2 = a2Var.f27627a;
            paint2.setShader(null);
            paint2.setColor(v02);
            a2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            a2Var.d(i5Var.f12579k, true, false);
            a2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (i5Var.P) {
            imageReceiver.onAttachedToWindow();
            j5Var.a();
            i5Var.f12592y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        i5Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            i5Var.L = (int) (i5Var.L * 1.2f);
        }
        i5Var.L -= AndroidUtilities.dp(8.0f);
        i5Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        xd.c cVar = i5Var.Q;
        if (z4) {
            if (cVar.f46966g) {
                f10 = cVar.f46965f;
            } else {
                f10 = cVar.e;
            }
            int round = Math.round(f10);
            int i10 = i5Var.L;
            if (round != i10) {
                cVar.a(i10);
            }
        } else {
            cVar.c(i5Var.L);
        }
        requestLayout();
        invalidate();
    }

    public lh.i5 getLayout() {
        return this.f10692a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lh.i5 i5Var = this.f10692a;
        i5Var.P = true;
        if (i5Var.N != null) {
            i5Var.d.onAttachedToWindow();
            i5Var.e.a();
            i5Var.f12592y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lh.i5 i5Var = this.f10692a;
        i5Var.P = false;
        i5Var.d.onDetachedFromWindow();
        i5Var.e.b();
        v0 v0Var = i5Var.f12592y;
        v0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release((View) null, v0Var.f10994q);
        v0Var.f10994q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        f6 f6Var = this.f10693b;
        if (f6Var != null) {
            f6Var.l(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            j6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        lh.i5 i5Var = this.f10692a;
        this.f10694c = (getWidth() - ((int) i5Var.Q.e)) / 2.0f;
        float dp = i5Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, i5Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f10694c, this.d);
        i5Var.a(canvas);
        i5Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        lh.i5 i5Var = this.f10692a;
        this.f10694c = (size - ((int) i5Var.Q.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + i5Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f10692a.e(this.f10694c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f10692a.f12592y) {
            return false;
        }
        return true;
    }
}
