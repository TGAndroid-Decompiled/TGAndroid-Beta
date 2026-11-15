package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import di.lb;
import di.u8;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v6 extends View {
    public final di.e6 f3945a;
    public final org.telegram.ui.ActionBar.e6 f3946b;
    public float f3947c;
    public float d;
    public Drawable f3948e;

    public v6(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f3946b = e6Var;
        di.e6 e6Var2 = new di.e6(i7, this, e6Var);
        this.f3945a = e6Var2;
        e6Var2.f8486y.setCallback(this);
        ns.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float L;
        float f10;
        di.e6 e6Var = this.f3945a;
        org.telegram.ui.Components.e5 e5Var = e6Var.f8468e;
        l2 l2Var = e6Var.f8472j;
        ImageReceiver imageReceiver = e6Var.d;
        e6Var.N = false;
        e6Var.Q = null;
        e6Var.R = null;
        e6Var.f8478p = false;
        e6Var.f8473k = (TL_stars.starGiftAttributeBackdrop) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e6Var.f8474l = (TL_stars.starGiftAttributePattern) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = e6Var.f8475m;
        e6Var.f8475m = (TL_stars.starGiftAttributeModel) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = e6Var.f8469f;
        e6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = e6Var.f8474l;
        if (stargiftattributepattern != null) {
            e5Var.i(stargiftattributepattern.document, false);
        } else {
            e5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = e6Var.f8475m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f28057id != stargiftattributemodel2.document.f28057id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            lb.c1(imageReceiver, e6Var.f8475m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        e6Var.L = z11;
        if (z11) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29090q7, e6Var.f8467c);
            Paint paint2 = (Paint) l2Var.f220b;
            paint2.setShader(null);
            paint2.setColor(w02);
            e6Var.M = org.telegram.ui.ActionBar.q6.f29535b;
            l2Var.f(11, hd.M0(2131749893, null), true);
        } else {
            l2Var.e(e6Var.f8473k, true, false);
            l2Var.f(11, hd.M0(2131749894, null), true);
        }
        if (e6Var.S) {
            imageReceiver.P();
            e5Var.a();
            e6Var.f8486y.d.P();
        }
        if (org.telegram.messenger.g0.Q1()) {
            L = org.telegram.messenger.g0.Q0() * 0.6f;
        } else {
            L = (org.telegram.messenger.g0.f23611q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f);
        }
        e6Var.O = i20.C(64.0f, (org.telegram.messenger.g0.f23611q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f23605m, (int) L);
        if (!org.telegram.messenger.g0.Q1()) {
            e6Var.O = (int) (e6Var.O * 1.2f);
        }
        e6Var.O -= org.telegram.messenger.g0.L(8.0f);
        e6Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = e6Var.T;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57092g;
            } else {
                f10 = cVar.f57091f;
            }
            int round = Math.round(f10);
            int i7 = e6Var.O;
            if (round != i7) {
                cVar.a(i7);
            }
        } else {
            cVar.c(e6Var.O);
        }
        requestLayout();
        invalidate();
    }

    public di.e6 getLayout() {
        return this.f3945a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3945a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        di.e6 e6Var = this.f3945a;
        e6Var.S = false;
        e6Var.d.R();
        e6Var.f8468e.b();
        g1 g1Var = e6Var.f8486y;
        g1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, g1Var.f3542q);
        g1Var.f3542q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        if (getParent() instanceof View) {
            i7 = ((View) getParent()).getHeight();
        } else {
            i7 = 0;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f3946b;
        if (e6Var != null) {
            e6Var.b(0.0f, getY(), getMeasuredWidth(), i7);
        } else {
            org.telegram.ui.ActionBar.j6.r(0.0f, getY(), getMeasuredWidth(), i7);
        }
        di.e6 e6Var2 = this.f3945a;
        this.f3947c = (getWidth() - ((int) e6Var2.T.f57091f)) / 2.0f;
        float L = e6Var2.T.f57091f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, e6Var2.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.f3948e.setBounds(rect);
        this.f3948e.draw(canvas);
        canvas.save();
        canvas.translate(this.f3947c, this.d);
        e6Var2.b(canvas);
        e6Var2.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        di.e6 e6Var = this.f3945a;
        this.f3947c = (size - ((int) e6Var.T.f57091f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + e6Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f3945a.e(this.f3947c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f3948e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f3945a.f8486y) {
            return false;
        }
        return true;
    }
}
