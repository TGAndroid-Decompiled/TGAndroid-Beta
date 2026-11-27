package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;
public final class zua extends View {
    public final yua a;
    public final vnb b;
    public float c;
    public float d;
    public Drawable e;

    public zua(int i, vnb vnbVar, Context context) {
        super(context);
        this.b = vnbVar;
        yua yuaVar = new yua(i, vnbVar, this);
        this.a = yuaVar;
        yuaVar.y.setCallback(this);
        jn7.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z) {
        float L;
        float f;
        yua yuaVar = this.a;
        ul ulVar = yuaVar.e;
        vx4 vx4Var = yuaVar.j;
        ImageReceiver imageReceiver = yuaVar.d;
        yuaVar.N = false;
        yuaVar.Q = null;
        yuaVar.R = null;
        yuaVar.p = false;
        yuaVar.k = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        yuaVar.l = (TL_stars.starGiftAttributePattern) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = yuaVar.m;
        yuaVar.m = (TL_stars.starGiftAttributeModel) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = yuaVar.f;
        yuaVar.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = yuaVar.l;
        if (stargiftattributepattern != null) {
            ulVar.i(stargiftattributepattern.document, false);
        } else {
            ulVar.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = yuaVar.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.N(0);
            imageReceiver.e();
            imageReceiver.M(0);
            nza.e1(imageReceiver, yuaVar.m.document, 110);
        }
        boolean z2 = tL_starGiftUnique.burned;
        yuaVar.L = z2;
        if (z2) {
            vx4Var.f(aob.v0(aob.q7, yuaVar.c));
            yuaVar.M = yob.b;
            vx4Var.g(11, ob6.M0(2131749839, null), true);
        } else {
            vx4Var.e(yuaVar.k, true, false);
            vx4Var.g(11, ob6.M0(2131749840, null), true);
        }
        if (yuaVar.S) {
            imageReceiver.I();
            ulVar.a();
            yuaVar.y.d.I();
        }
        if (hl.O1()) {
            L = hl.P0() * 0.6f;
        } else {
            L = (hl.q.x * 0.62f) - hl.L(34.0f);
        }
        yuaVar.O = c00.y(64.0f, (hl.q.y - a.getCurrentActionBarHeight()) - hl.m, (int) L);
        if (!hl.O1()) {
            yuaVar.O = (int) (yuaVar.O * 1.2f);
        }
        yuaVar.O -= hl.L(8.0f);
        yuaVar.h(tL_starGiftUnique, j, tL_textWithEntities, str);
        t84 t84Var = yuaVar.T;
        if (z) {
            if (t84Var.h) {
                f = t84Var.g;
            } else {
                f = t84Var.f;
            }
            int round = Math.round(f);
            int i = yuaVar.O;
            if (round != i) {
                t84Var.a(i);
            }
        } else {
            t84Var.c(yuaVar.O);
        }
        requestLayout();
        invalidate();
    }

    public yua getLayout() {
        return this.a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yua yuaVar = this.a;
        yuaVar.S = false;
        yuaVar.d.K();
        yuaVar.e.b();
        iw4 iw4Var = yuaVar.y;
        iw4Var.d.K();
        hm.release((View) null, iw4Var.q);
        iw4Var.q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        if (getParent() instanceof View) {
            i = ((View) getParent()).getHeight();
        } else {
            i = 0;
        }
        vnb vnbVar = this.b;
        if (vnbVar != null) {
            vnbVar.b(0.0f, getY(), getMeasuredWidth(), i);
        } else {
            aob.q(0.0f, getY(), getMeasuredWidth(), i);
        }
        yua yuaVar = this.a;
        this.c = (getWidth() - ((int) yuaVar.T.f)) / 2.0f;
        float L = yuaVar.T.f + hl.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - hl.L(4.0f);
        RectF rectF = hl.P;
        rectF.set(width, L2, L + width, yuaVar.P + L2 + hl.L(8.0f));
        Rect rect = hl.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        yuaVar.b(canvas);
        yuaVar.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        yua yuaVar = this.a;
        this.c = (size - ((int) yuaVar.T.f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + yuaVar.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.e(this.c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.a.y) {
            return false;
        }
        return true;
    }
}
