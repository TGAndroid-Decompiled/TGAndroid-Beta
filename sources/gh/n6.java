package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import hh.oa;
import hh.u7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class n6 extends View {

    public final hh.k5 f7469a;

    public final org.telegram.ui.ActionBar.c6 f7470b;

    public float f7471c;
    public float d;

    public Drawable f7472e;

    public n6(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f7470b = c6Var;
        hh.k5 k5Var = new hh.k5(i10, this, c6Var);
        this.f7469a = k5Var;
        k5Var.f9602y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        hh.k5 k5Var = this.f7469a;
        org.telegram.ui.Components.i5 i5Var = k5Var.f9584e;
        e2 e2Var = k5Var.f9588j;
        ImageReceiver imageReceiver = k5Var.d;
        k5Var.K = false;
        k5Var.N = null;
        k5Var.O = null;
        k5Var.f9594p = false;
        k5Var.f9589k = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        k5Var.f9590l = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = k5Var.f9591m;
        k5Var.f9591m = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = k5Var.f9585f;
        k5Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = k5Var.f9590l;
        if (stargiftattributepattern != null) {
            i5Var.i(stargiftattributepattern.document, false);
        } else {
            i5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = k5Var.f9591m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f22386id != stargiftattributemodel2.document.f22386id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            oa.Z0(imageReceiver, k5Var.f9591m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        k5Var.J = z11;
        if (z11) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, k5Var.f9583c);
            Paint paint2 = e2Var.f28431a;
            paint2.setShader(null);
            paint2.setColor(iV0);
            e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            e2Var.d(k5Var.f9589k, true, false);
            e2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (k5Var.P) {
            imageReceiver.onAttachedToWindow();
            i5Var.a();
            k5Var.f9602y.d.onAttachedToWindow();
        }
        k5Var.L = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            k5Var.L = (int) (k5Var.L * 1.2f);
        }
        k5Var.L -= AndroidUtilities.dp(8.0f);
        k5Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        ud.c cVar = k5Var.Q;
        if (z10) {
            int iRound = Math.round(cVar.f48504g ? cVar.f48503f : cVar.f48502e);
            int i10 = k5Var.L;
            if (iRound != i10) {
                cVar.a(i10);
            }
        } else {
            cVar.c(k5Var.L);
        }
        requestLayout();
        invalidate();
    }

    public hh.k5 getLayout() {
        return this.f7469a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hh.k5 k5Var = this.f7469a;
        k5Var.P = true;
        if (k5Var.N != null) {
            k5Var.d.onAttachedToWindow();
            k5Var.f9584e.a();
            k5Var.f9602y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hh.k5 k5Var = this.f7469a;
        k5Var.P = false;
        k5Var.d.onDetachedFromWindow();
        k5Var.f9584e.b();
        y0 y0Var = k5Var.f9602y;
        y0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, y0Var.f7648q);
        y0Var.f7648q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f7470b;
        if (c6Var != null) {
            c6Var.m(0.0f, getY(), getMeasuredWidth(), height);
        } else {
            org.telegram.ui.ActionBar.g6.q(0.0f, getY(), getMeasuredWidth(), height);
        }
        hh.k5 k5Var = this.f7469a;
        this.f7471c = (getWidth() - ((int) k5Var.Q.f48502e)) / 2.0f;
        float fDp = k5Var.Q.f48502e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - fDp) / 2.0f;
        float fDp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, fDp2, fDp + width, k5Var.M + fDp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f7472e.setBounds(rect);
        this.f7472e.draw(canvas);
        canvas.save();
        canvas.translate(this.f7471c, this.d);
        k5Var.a(canvas);
        k5Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        hh.k5 k5Var = this.f7469a;
        int i12 = (int) k5Var.Q.f48502e;
        int i13 = k5Var.M;
        this.f7471c = (size - i12) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f7469a.e(this.f7471c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f7472e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7469a.f9602y;
    }
}
