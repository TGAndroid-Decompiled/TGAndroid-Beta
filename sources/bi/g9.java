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
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g9 extends View {
    public final di.h6 f3626a;
    public final org.telegram.ui.ActionBar.i6 f3627b;
    public float f3628c;
    public float d;
    public Drawable f3629e;

    public g9(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f3627b = i6Var;
        di.h6 h6Var = new di.h6(i7, this, i6Var);
        this.f3626a = h6Var;
        h6Var.f8955y.setCallback(this);
        ks.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float L;
        float f10;
        di.h6 h6Var = this.f3626a;
        org.telegram.ui.Components.m5 m5Var = h6Var.f8937e;
        l3 l3Var = h6Var.f8941j;
        ImageReceiver imageReceiver = h6Var.d;
        h6Var.N = false;
        h6Var.Q = null;
        h6Var.R = null;
        h6Var.f8947p = false;
        h6Var.f8942k = (TL_stars.starGiftAttributeBackdrop) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        h6Var.f8943l = (TL_stars.starGiftAttributePattern) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = h6Var.f8944m;
        h6Var.f8944m = (TL_stars.starGiftAttributeModel) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = h6Var.f8938f;
        h6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = h6Var.f8943l;
        if (stargiftattributepattern != null) {
            m5Var.i(stargiftattributepattern.document, false);
        } else {
            m5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = h6Var.f8944m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f28498id != stargiftattributemodel2.document.f28498id)) {
            imageReceiver.Y(0);
            imageReceiver.e();
            imageReceiver.X(0);
            pb.d1(imageReceiver, h6Var.f8944m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        h6Var.L = z11;
        if (z11) {
            l3Var.f(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29692q7, h6Var.f8936c));
            h6Var.M = org.telegram.ui.ActionBar.u6.f30164b;
            l3Var.g(11, gd.N0(2131749876, null), true);
        } else {
            l3Var.e(h6Var.f8942k, true, false);
            l3Var.g(11, gd.N0(2131749877, null), true);
        }
        if (h6Var.S) {
            imageReceiver.Q();
            m5Var.a();
            h6Var.f8955y.d.Q();
        }
        if (org.telegram.messenger.g0.Q1()) {
            L = org.telegram.messenger.g0.Q0() * 0.6f;
        } else {
            L = (org.telegram.messenger.g0.f24226q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f);
        }
        h6Var.O = m10.D(64.0f, (org.telegram.messenger.g0.f24226q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24220m, (int) L);
        if (!org.telegram.messenger.g0.Q1()) {
            h6Var.O = (int) (h6Var.O * 1.2f);
        }
        h6Var.O -= org.telegram.messenger.g0.L(8.0f);
        h6Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = h6Var.T;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57786g;
            } else {
                f10 = cVar.f57785f;
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
        return this.f3626a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3626a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        di.h6 h6Var = this.f3626a;
        h6Var.S = false;
        h6Var.d.S();
        h6Var.f8937e.b();
        l1 l1Var = h6Var.f8955y;
        l1Var.d.S();
        org.telegram.ui.Components.x5.release((View) null, l1Var.f3787q);
        l1Var.f3787q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        if (getParent() instanceof View) {
            i7 = ((View) getParent()).getHeight();
        } else {
            i7 = 0;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f3627b;
        if (i6Var != null) {
            i6Var.c(0.0f, getY(), getMeasuredWidth(), i7);
        } else {
            org.telegram.ui.ActionBar.n6.r(0.0f, getY(), getMeasuredWidth(), i7);
        }
        di.h6 h6Var = this.f3626a;
        this.f3628c = (getWidth() - ((int) h6Var.T.f57785f)) / 2.0f;
        float L = h6Var.T.f57785f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, h6Var.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.f3629e.setBounds(rect);
        this.f3629e.draw(canvas);
        canvas.save();
        canvas.translate(this.f3628c, this.d);
        h6Var.b(canvas);
        h6Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        di.h6 h6Var = this.f3626a;
        this.f3628c = (size - ((int) h6Var.T.f57785f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + h6Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f3626a.e(this.f3628c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f3629e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f3626a.f8955y) {
            return false;
        }
        return true;
    }
}
