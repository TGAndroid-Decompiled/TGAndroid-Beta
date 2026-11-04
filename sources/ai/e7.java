package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ci.e9;
import ci.wb;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e7 extends View {
    public final ci.n6 f628a;
    public final org.telegram.ui.ActionBar.e6 f629b;
    public float f630c;
    public float d;
    public Drawable f631e;

    public e7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f629b = e6Var;
        ci.n6 n6Var = new ci.n6(i3, this, e6Var);
        this.f628a = n6Var;
        n6Var.f5630y.setCallback(this);
        hs.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float L;
        float f10;
        ci.n6 n6Var = this.f628a;
        org.telegram.ui.Components.e5 e5Var = n6Var.f5612e;
        t2 t2Var = n6Var.f5616j;
        ImageReceiver imageReceiver = n6Var.d;
        n6Var.N = false;
        n6Var.Q = null;
        n6Var.R = null;
        n6Var.f5622p = false;
        n6Var.f5617k = (TL_stars.starGiftAttributeBackdrop) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        n6Var.f5618l = (TL_stars.starGiftAttributePattern) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = n6Var.f5619m;
        n6Var.f5619m = (TL_stars.starGiftAttributeModel) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = n6Var.f5613f;
        n6Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = n6Var.f5618l;
        if (stargiftattributepattern != null) {
            e5Var.i(stargiftattributepattern.document, false);
        } else {
            e5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = n6Var.f5619m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f27007id != stargiftattributemodel2.document.f27007id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            wb.c1(imageReceiver, n6Var.f5619m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        n6Var.L = z11;
        if (z11) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28122q7, n6Var.f5611c);
            Paint paint2 = (Paint) t2Var.f40801b;
            paint2.setShader(null);
            paint2.setColor(w02);
            n6Var.M = org.telegram.ui.ActionBar.r6.f28515b;
            t2Var.f(11, bd.M0(2131749901, null), true);
        } else {
            t2Var.e(n6Var.f5617k, true, false);
            t2Var.f(11, bd.M0(2131749902, null), true);
        }
        if (n6Var.S) {
            imageReceiver.P();
            e5Var.a();
            n6Var.f5630y.d.P();
        }
        if (org.telegram.messenger.g0.Q1()) {
            L = org.telegram.messenger.g0.Q0() * 0.6f;
        } else {
            L = (org.telegram.messenger.g0.f22608q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f);
        }
        n6Var.O = org.telegram.messenger.camera.q.C(64.0f, (org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22602m, (int) L);
        if (!org.telegram.messenger.g0.Q1()) {
            n6Var.O = (int) (n6Var.O * 1.2f);
        }
        n6Var.O -= org.telegram.messenger.g0.L(8.0f);
        n6Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        qe.c cVar = n6Var.T;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f53847g;
            } else {
                f10 = cVar.f53846f;
            }
            int round = Math.round(f10);
            int i3 = n6Var.O;
            if (round != i3) {
                cVar.a(i3);
            }
        } else {
            cVar.c(n6Var.O);
        }
        requestLayout();
        invalidate();
    }

    public ci.n6 getLayout() {
        return this.f628a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f628a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ci.n6 n6Var = this.f628a;
        n6Var.S = false;
        n6Var.d.R();
        n6Var.f5612e.b();
        j1 j1Var = n6Var.f5630y;
        j1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, j1Var.f743q);
        j1Var.f743q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        if (getParent() instanceof View) {
            i3 = ((View) getParent()).getHeight();
        } else {
            i3 = 0;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f629b;
        if (e6Var != null) {
            e6Var.b(0.0f, getY(), getMeasuredWidth(), i3);
        } else {
            org.telegram.ui.ActionBar.k6.r(0.0f, getY(), getMeasuredWidth(), i3);
        }
        ci.n6 n6Var = this.f628a;
        this.f630c = (getWidth() - ((int) n6Var.T.f53846f)) / 2.0f;
        float L = n6Var.T.f53846f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, n6Var.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.f631e.setBounds(rect);
        this.f631e.draw(canvas);
        canvas.save();
        canvas.translate(this.f630c, this.d);
        n6Var.b(canvas);
        n6Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        ci.n6 n6Var = this.f628a;
        this.f630c = (size - ((int) n6Var.T.f53846f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + n6Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f628a.e(this.f630c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f631e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f628a.f5630y) {
            return false;
        }
        return true;
    }
}
