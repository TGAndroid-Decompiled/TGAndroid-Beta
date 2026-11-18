package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import di.pb;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a9 extends View {
    public final di.h6 f3422a;
    public final org.telegram.ui.ActionBar.i6 f3423b;
    public float f3424c;
    public float d;
    public Drawable f3425e;

    public a9(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f3423b = i6Var;
        di.h6 h6Var = new di.h6(i7, this, i6Var);
        this.f3422a = h6Var;
        h6Var.f8960y.setCallback(this);
        ks.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float L;
        float f10;
        di.h6 h6Var = this.f3422a;
        org.telegram.ui.Components.m5 m5Var = h6Var.f8942e;
        f3 f3Var = h6Var.f8946j;
        ImageReceiver imageReceiver = h6Var.d;
        h6Var.N = false;
        h6Var.Q = null;
        h6Var.R = null;
        h6Var.f8952p = false;
        h6Var.f8947k = (TL_stars.starGiftAttributeBackdrop) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        h6Var.f8948l = (TL_stars.starGiftAttributePattern) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = h6Var.f8949m;
        h6Var.f8949m = (TL_stars.starGiftAttributeModel) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = h6Var.f8943f;
        h6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = h6Var.f8948l;
        if (stargiftattributepattern != null) {
            m5Var.i(stargiftattributepattern.document, false);
        } else {
            m5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = h6Var.f8949m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f28409id != stargiftattributemodel2.document.f28409id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            pb.d1(imageReceiver, h6Var.f8949m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        h6Var.L = z11;
        if (z11) {
            f3Var.f(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29635q7, h6Var.f8941c));
            h6Var.M = org.telegram.ui.ActionBar.u6.f30083b;
            f3Var.g(11, gd.M0(2131749877, null), true);
        } else {
            f3Var.e(h6Var.f8947k, true, false);
            f3Var.g(11, gd.M0(2131749878, null), true);
        }
        if (h6Var.S) {
            imageReceiver.P();
            m5Var.a();
            h6Var.f8960y.d.P();
        }
        if (org.telegram.messenger.g0.Q1()) {
            L = org.telegram.messenger.g0.Q0() * 0.6f;
        } else {
            L = (org.telegram.messenger.g0.f24118q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f);
        }
        h6Var.O = n10.D(64.0f, (org.telegram.messenger.g0.f24118q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24112m, (int) L);
        if (!org.telegram.messenger.g0.Q1()) {
            h6Var.O = (int) (h6Var.O * 1.2f);
        }
        h6Var.O -= org.telegram.messenger.g0.L(8.0f);
        h6Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = h6Var.T;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57664g;
            } else {
                f10 = cVar.f57663f;
            }
            int round = Math.round(f10);
            int i7 = h6Var.O;
            if (round != i7) {
                cVar.a(i7);
            }
        } else {
            cVar.c(h6Var.O);
        }
        requestLayout();
        invalidate();
    }

    public di.h6 getLayout() {
        return this.f3422a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3422a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        di.h6 h6Var = this.f3422a;
        h6Var.S = false;
        h6Var.d.R();
        h6Var.f8942e.b();
        h1 h1Var = h6Var.f8960y;
        h1Var.d.R();
        org.telegram.ui.Components.x5.release((View) null, h1Var.f3653q);
        h1Var.f3653q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        if (getParent() instanceof View) {
            i7 = ((View) getParent()).getHeight();
        } else {
            i7 = 0;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f3423b;
        if (i6Var != null) {
            i6Var.e(0.0f, getY(), getMeasuredWidth(), i7);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, getY(), getMeasuredWidth(), i7);
        }
        di.h6 h6Var = this.f3422a;
        this.f3424c = (getWidth() - ((int) h6Var.T.f57663f)) / 2.0f;
        float L = h6Var.T.f57663f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, h6Var.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.f3425e.setBounds(rect);
        this.f3425e.draw(canvas);
        canvas.save();
        canvas.translate(this.f3424c, this.d);
        h6Var.b(canvas);
        h6Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        di.h6 h6Var = this.f3422a;
        this.f3424c = (size - ((int) h6Var.T.f57663f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + h6Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f3422a.e(this.f3424c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f3425e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f3422a.f8960y) {
            return false;
        }
        return true;
    }
}
