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
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d9 extends View {
    public final di.h6 f3565a;
    public final org.telegram.ui.ActionBar.h6 f3566b;
    public float f3567c;
    public float d;
    public Drawable f3568e;

    public d9(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f3566b = h6Var;
        di.h6 h6Var2 = new di.h6(i7, this, h6Var);
        this.f3565a = h6Var2;
        h6Var2.f8994y.setCallback(this);
        ls.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float L;
        float f10;
        di.h6 h6Var = this.f3565a;
        org.telegram.ui.Components.n5 n5Var = h6Var.f8976e;
        j3 j3Var = h6Var.f8980j;
        ImageReceiver imageReceiver = h6Var.d;
        h6Var.N = false;
        h6Var.Q = null;
        h6Var.R = null;
        h6Var.f8986p = false;
        h6Var.f8981k = (TL_stars.starGiftAttributeBackdrop) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        h6Var.f8982l = (TL_stars.starGiftAttributePattern) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = h6Var.f8983m;
        h6Var.f8983m = (TL_stars.starGiftAttributeModel) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = h6Var.f8977f;
        h6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = h6Var.f8982l;
        if (stargiftattributepattern != null) {
            n5Var.i(stargiftattributepattern.document, false);
        } else {
            n5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = h6Var.f8983m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f28440id != stargiftattributemodel2.document.f28440id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            pb.d1(imageReceiver, h6Var.f8983m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        h6Var.L = z11;
        if (z11) {
            j3Var.f(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29622q7, h6Var.f8975c));
            h6Var.M = org.telegram.ui.ActionBar.t6.f30069b;
            j3Var.g(11, hd.N0(2131749876, null), true);
        } else {
            j3Var.e(h6Var.f8981k, true, false);
            j3Var.g(11, hd.N0(2131749877, null), true);
        }
        if (h6Var.S) {
            imageReceiver.P();
            n5Var.a();
            h6Var.f8994y.d.P();
        }
        if (org.telegram.messenger.g0.Q1()) {
            L = org.telegram.messenger.g0.Q0() * 0.6f;
        } else {
            L = (org.telegram.messenger.g0.f24046q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f);
        }
        h6Var.O = o10.D(64.0f, (org.telegram.messenger.g0.f24046q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24040m, (int) L);
        if (!org.telegram.messenger.g0.Q1()) {
            h6Var.O = (int) (h6Var.O * 1.2f);
        }
        h6Var.O -= org.telegram.messenger.g0.L(8.0f);
        h6Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = h6Var.T;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57707g;
            } else {
                f10 = cVar.f57706f;
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
        return this.f3565a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3565a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        di.h6 h6Var = this.f3565a;
        h6Var.S = false;
        h6Var.d.R();
        h6Var.f8976e.b();
        l1 l1Var = h6Var.f8994y;
        l1Var.d.R();
        org.telegram.ui.Components.y5.release((View) null, l1Var.f3825q);
        l1Var.f3825q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        if (getParent() instanceof View) {
            i7 = ((View) getParent()).getHeight();
        } else {
            i7 = 0;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f3566b;
        if (h6Var != null) {
            h6Var.e(0.0f, getY(), getMeasuredWidth(), i7);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, getY(), getMeasuredWidth(), i7);
        }
        di.h6 h6Var2 = this.f3565a;
        this.f3567c = (getWidth() - ((int) h6Var2.T.f57706f)) / 2.0f;
        float L = h6Var2.T.f57706f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, h6Var2.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.f3568e.setBounds(rect);
        this.f3568e.draw(canvas);
        canvas.save();
        canvas.translate(this.f3567c, this.d);
        h6Var2.b(canvas);
        h6Var2.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        di.h6 h6Var = this.f3565a;
        this.f3567c = (size - ((int) h6Var.T.f57706f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + h6Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f3565a.e(this.f3567c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f3568e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f3565a.f8994y) {
            return false;
        }
        return true;
    }
}
