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
public final class yqa extends View {
    public final xqa a;
    public final wjb b;
    public float c;
    public float d;
    public Drawable e;

    public yqa(int i, wjb wjbVar, Context context) {
        super(context);
        this.b = wjbVar;
        xqa xqaVar = new xqa(i, wjbVar, this);
        this.a = xqaVar;
        xqaVar.y.setCallback(this);
        kk7.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z) {
        float L;
        float f;
        xqa xqaVar = this.a;
        tl tlVar = xqaVar.e;
        qv4 qv4Var = xqaVar.j;
        ImageReceiver imageReceiver = xqaVar.d;
        xqaVar.N = false;
        xqaVar.Q = null;
        xqaVar.R = null;
        xqaVar.p = false;
        xqaVar.k = (TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        xqaVar.l = (TL_stars.starGiftAttributePattern) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = xqaVar.m;
        xqaVar.m = (TL_stars.starGiftAttributeModel) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = xqaVar.f;
        xqaVar.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = xqaVar.l;
        if (stargiftattributepattern != null) {
            tlVar.i(stargiftattributepattern.document, false);
        } else {
            tlVar.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = xqaVar.m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.id != stargiftattributemodel2.document.id)) {
            imageReceiver.N(0);
            imageReceiver.e();
            imageReceiver.M(0);
            jva.d1(imageReceiver, xqaVar.m.document, 110);
        }
        boolean z2 = tL_starGiftUnique.burned;
        xqaVar.L = z2;
        if (z2) {
            qv4Var.f(bkb.v0(bkb.p7, xqaVar.c));
            xqaVar.M = zkb.b;
            qv4Var.g(11, k96.M0(2131749877, null), true);
        } else {
            qv4Var.e(xqaVar.k, true, false);
            qv4Var.g(11, k96.M0(2131749878, null), true);
        }
        if (xqaVar.S) {
            imageReceiver.I();
            tlVar.a();
            xqaVar.y.d.I();
        }
        if (gl.O1()) {
            L = gl.P0() * 0.6f;
        } else {
            L = (gl.q.x * 0.62f) - gl.L(34.0f);
        }
        xqaVar.O = b00.x(64.0f, (gl.q.y - a.getCurrentActionBarHeight()) - gl.m, (int) L);
        if (!gl.O1()) {
            xqaVar.O = (int) (xqaVar.O * 1.2f);
        }
        xqaVar.O -= gl.L(8.0f);
        xqaVar.h(tL_starGiftUnique, j, tL_textWithEntities, str);
        y74 y74Var = xqaVar.T;
        if (z) {
            if (y74Var.h) {
                f = y74Var.g;
            } else {
                f = y74Var.f;
            }
            int round = Math.round(f);
            int i = xqaVar.O;
            if (round != i) {
                y74Var.a(i);
            }
        } else {
            y74Var.c(xqaVar.O);
        }
        requestLayout();
        invalidate();
    }

    public xqa getLayout() {
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
        xqa xqaVar = this.a;
        xqaVar.S = false;
        xqaVar.d.K();
        xqaVar.e.b();
        eu4 eu4Var = xqaVar.y;
        eu4Var.d.K();
        gm.release((View) null, eu4Var.q);
        eu4Var.q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        if (getParent() instanceof View) {
            i = ((View) getParent()).getHeight();
        } else {
            i = 0;
        }
        wjb wjbVar = this.b;
        if (wjbVar != null) {
            wjbVar.b(0.0f, getY(), getMeasuredWidth(), i);
        } else {
            bkb.q(0.0f, getY(), getMeasuredWidth(), i);
        }
        xqa xqaVar = this.a;
        this.c = (getWidth() - ((int) xqaVar.T.f)) / 2.0f;
        float L = xqaVar.T.f + gl.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - gl.L(4.0f);
        RectF rectF = gl.P;
        rectF.set(width, L2, L + width, xqaVar.P + L2 + gl.L(8.0f));
        Rect rect = gl.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.c, this.d);
        xqaVar.b(canvas);
        xqaVar.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        xqa xqaVar = this.a;
        this.c = (size - ((int) xqaVar.T.f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + xqaVar.P);
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
