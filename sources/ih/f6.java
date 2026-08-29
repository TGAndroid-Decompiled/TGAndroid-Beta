package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import jh.ia;
import jh.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
public final class f6 extends View {
    public final jh.j5 f9159a;
    public final org.telegram.ui.ActionBar.c6 f9160b;
    public float f9161c;
    public float d;
    public Drawable f9162e;

    public f6(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9160b = c6Var;
        jh.j5 j5Var = new jh.j5(i10, this, c6Var);
        this.f9159a = j5Var;
        j5Var.f12337y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f9;
        jh.j5 j5Var = this.f9159a;
        org.telegram.ui.Components.n5 n5Var = j5Var.f12319e;
        b2 b2Var = j5Var.f12323j;
        ImageReceiver imageReceiver = j5Var.d;
        j5Var.K = false;
        j5Var.N = null;
        j5Var.O = null;
        j5Var.f12329p = false;
        j5Var.f12324k = (TL_stars.starGiftAttributeBackdrop) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        j5Var.f12325l = (TL_stars.starGiftAttributePattern) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = j5Var.f12326m;
        j5Var.f12326m = (TL_stars.starGiftAttributeModel) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = j5Var.f12320f;
        j5Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = j5Var.f12325l;
        if (stargiftattributepattern != null) {
            n5Var.i(stargiftattributepattern.document, false);
        } else {
            n5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = j5Var.f12326m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f22398id != stargiftattributemodel2.document.f22398id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            ia.Z0(imageReceiver, j5Var.f12326m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        j5Var.J = z11;
        if (z11) {
            int v02 = g6.v0(g6.f23295q7, j5Var.f12318c);
            Paint paint2 = b2Var.f30413a;
            paint2.setShader(null);
            paint2.setColor(v02);
            b2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            b2Var.d(j5Var.f12324k, true, false);
            b2Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (j5Var.P) {
            imageReceiver.onAttachedToWindow();
            n5Var.a();
            j5Var.f12337y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        j5Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            j5Var.L = (int) (j5Var.L * 1.2f);
        }
        j5Var.L -= AndroidUtilities.dp(8.0f);
        j5Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        vd.c cVar = j5Var.Q;
        if (z10) {
            if (cVar.f49512g) {
                f9 = cVar.f49511f;
            } else {
                f9 = cVar.f49510e;
            }
            int round = Math.round(f9);
            int i10 = j5Var.L;
            if (round != i10) {
                cVar.a(i10);
            }
        } else {
            cVar.c(j5Var.L);
        }
        requestLayout();
        invalidate();
    }

    public jh.j5 getLayout() {
        return this.f9159a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jh.j5 j5Var = this.f9159a;
        j5Var.P = true;
        if (j5Var.N != null) {
            j5Var.d.onAttachedToWindow();
            j5Var.f12319e.a();
            j5Var.f12337y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jh.j5 j5Var = this.f9159a;
        j5Var.P = false;
        j5Var.d.onDetachedFromWindow();
        j5Var.f12319e.b();
        w0 w0Var = j5Var.f12337y;
        w0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release((View) null, w0Var.f9479q);
        w0Var.f9479q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f9160b;
        if (c6Var != null) {
            c6Var.l(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            g6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        jh.j5 j5Var = this.f9159a;
        this.f9161c = (getWidth() - ((int) j5Var.Q.f49510e)) / 2.0f;
        float dp = j5Var.Q.f49510e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, j5Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f9162e.setBounds(rect);
        this.f9162e.draw(canvas);
        canvas.save();
        canvas.translate(this.f9161c, this.d);
        j5Var.a(canvas);
        j5Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        jh.j5 j5Var = this.f9159a;
        this.f9161c = (size - ((int) j5Var.Q.f49510e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + j5Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f9159a.e(this.f9161c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f9162e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9159a.f12337y) {
            return false;
        }
        return true;
    }
}
