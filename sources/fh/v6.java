package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import gh.oa;
import gh.v7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v6 extends View {
    public final gh.m5 f6822a;
    public final org.telegram.ui.ActionBar.b6 f6823b;
    public float f6824c;
    public float d;
    public Drawable f6825e;

    public v6(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f6823b = b6Var;
        gh.m5 m5Var = new gh.m5(i9, this, b6Var);
        this.f6822a = m5Var;
        m5Var.f8567y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f10;
        gh.m5 m5Var = this.f6822a;
        org.telegram.ui.Components.i5 i5Var = m5Var.f8549e;
        i2 i2Var = m5Var.f8553j;
        ImageReceiver imageReceiver = m5Var.d;
        m5Var.K = false;
        m5Var.N = null;
        m5Var.O = null;
        m5Var.f8559p = false;
        m5Var.f8554k = (TL_stars.starGiftAttributeBackdrop) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m5Var.f8555l = (TL_stars.starGiftAttributePattern) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = m5Var.f8556m;
        m5Var.f8556m = (TL_stars.starGiftAttributeModel) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = m5Var.f8550f;
        m5Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = m5Var.f8555l;
        if (stargiftattributepattern != null) {
            i5Var.i(stargiftattributepattern.document, false);
        } else {
            i5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = m5Var.f8556m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f22386id != stargiftattributemodel2.document.f22386id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            oa.Z0(imageReceiver, m5Var.f8556m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        m5Var.J = z11;
        if (z11) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, m5Var.f8548c);
            Paint paint2 = i2Var.f29171a;
            paint2.setShader(null);
            paint2.setColor(v02);
            i2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            i2Var.d(m5Var.f8554k, true, false);
            i2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (m5Var.P) {
            imageReceiver.onAttachedToWindow();
            i5Var.a();
            m5Var.f8567y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        m5Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            m5Var.L = (int) (m5Var.L * 1.2f);
        }
        m5Var.L -= AndroidUtilities.dp(8.0f);
        m5Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        td.c cVar = m5Var.Q;
        if (z10) {
            if (cVar.f47782g) {
                f10 = cVar.f47781f;
            } else {
                f10 = cVar.f47780e;
            }
            int round = Math.round(f10);
            int i9 = m5Var.L;
            if (round != i9) {
                cVar.a(i9);
            }
        } else {
            cVar.c(m5Var.L);
        }
        requestLayout();
        invalidate();
    }

    public gh.m5 getLayout() {
        return this.f6822a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gh.m5 m5Var = this.f6822a;
        m5Var.P = true;
        if (m5Var.N != null) {
            m5Var.d.onAttachedToWindow();
            m5Var.f8549e.a();
            m5Var.f8567y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gh.m5 m5Var = this.f6822a;
        m5Var.P = false;
        m5Var.d.onDetachedFromWindow();
        m5Var.f8549e.b();
        a1 a1Var = m5Var.f8567y;
        a1Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, a1Var.f6345q);
        a1Var.f6345q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        if (getParent() instanceof View) {
            i9 = ((View) getParent()).getHeight();
        } else {
            i9 = 0;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f6823b;
        if (b6Var != null) {
            b6Var.o(0.0f, getY(), getMeasuredWidth(), i9);
        } else {
            org.telegram.ui.ActionBar.f6.q(0.0f, getY(), getMeasuredWidth(), i9);
        }
        gh.m5 m5Var = this.f6822a;
        this.f6824c = (getWidth() - ((int) m5Var.Q.f47780e)) / 2.0f;
        float dp = m5Var.Q.f47780e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, m5Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f6825e.setBounds(rect);
        this.f6825e.draw(canvas);
        canvas.save();
        canvas.translate(this.f6824c, this.d);
        m5Var.a(canvas);
        m5Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        gh.m5 m5Var = this.f6822a;
        this.f6824c = (size - ((int) m5Var.Q.f47780e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + m5Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f6822a.e(this.f6824c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f6825e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f6822a.f8567y) {
            return false;
        }
        return true;
    }
}
