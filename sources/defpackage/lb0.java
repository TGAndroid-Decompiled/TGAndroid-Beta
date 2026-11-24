package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public abstract class lb0 extends FrameLayout {
    public float E;
    public float F;
    public final mb0 G;
    public long a;
    public TLRPC.Document b;
    public final kb0 c;
    public final kz4 d;
    public final kz4 e;
    public float f;
    public hb0 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final lm s;
    public boolean w;
    public float x;
    public float y;

    public lb0(mb0 mb0Var, Activity activity) {
        super(activity);
        this.G = mb0Var;
        this.d = new kz4();
        this.e = new kz4();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new lm(200L, this, s33.g);
        this.x = -1.0f;
        kb0 kb0Var = new kb0((byte) 0, activity, this);
        this.c = kb0Var;
        kb0Var.getImageReceiver().N(1);
        kb0Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(kb0Var, nme.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        float f5 = this.s.c;
        if (f5 == 0.0f) {
            canvas.drawCircle(f, f2, f4, paint);
            return;
        }
        float R1 = gl.R1(f3, 0.0f, f5);
        RectF rectF = gl.P;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawRoundRect(rectF, R1, R1, paint);
    }

    public final void b(hb0 hb0Var, boolean z) {
        hb0 hb0Var2 = this.h;
        if (hb0Var2 != null) {
            this.e.d(hb0Var2.c, hb0Var2.d, hb0Var2.e, hb0Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = hb0Var;
        this.n = z;
        kk7.e().k(kk7.t4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        float f;
        int i;
        lb0 lb0Var;
        Canvas canvas2;
        int L2;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        mb0 mb0Var = this.G;
        if (mb0Var.V) {
            L = getMeasuredWidth() * 0.3f;
        } else {
            L = gl.L(50.0f);
        }
        float f2 = L;
        if (this.w) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        lm lmVar = this.s;
        lmVar.e(false, f);
        float f3 = this.x;
        if (f3 >= 0.0f) {
            lmVar.e(true, f3);
        }
        float R1 = gl.R1(f2, getMeasuredWidth() / 2.0f, lmVar.c);
        this.y = R1;
        this.y = gl.R1(R1, gl.L(21.0f), mb0Var.O);
        this.E = gl.R1(this.E, (getMeasuredWidth() - gl.L(12.0f)) - gl.L(21.0f), mb0Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-i) / 2.0f, getMeasuredWidth(), (((mb0Var.d - mb0Var.c) / 2.0f) * mb0Var.F) + getMeasuredHeight());
        hb0 hb0Var = this.h;
        if (hb0Var != null) {
            int i2 = hb0Var.c;
            int i3 = hb0Var.d;
            int i4 = hb0Var.e;
            int i5 = hb0Var.f;
            kz4 kz4Var = this.d;
            kz4Var.d(i2, i3, i4, i5);
            Paint paint = kz4Var.c;
            float f4 = this.E;
            float f5 = this.y;
            float f6 = this.F;
            kz4Var.b(f4 - f5, f6 - f5, f4 + f5, f6 + f5);
            if (this.f != 1.0f) {
                float f7 = this.E;
                float f8 = this.y;
                float f9 = f7 - f8;
                float f10 = this.F;
                float f11 = f10 - f8;
                float f12 = f7 + f8;
                float f13 = f10 + f8;
                kz4 kz4Var2 = this.e;
                kz4Var2.b(f9, f11, f12, f13);
                Paint paint2 = kz4Var2.c;
                paint2.setAlpha(255);
                lb0Var = this;
                lb0Var.a(canvas, this.E, this.F, f2, this.y, paint2);
                paint.setAlpha((int) (lb0Var.f * 255.0f));
                lb0Var.a(canvas, lb0Var.E, lb0Var.F, f2, lb0Var.y, paint);
                float f14 = lb0Var.f + 0.064f;
                lb0Var.f = f14;
                if (f14 > 1.0f) {
                    lb0Var.f = 1.0f;
                }
                lb0Var.invalidate();
                canvas2 = canvas;
            } else {
                lb0Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                lb0Var.a(canvas2, lb0Var.E, lb0Var.F, f2, lb0Var.y, paint);
            }
        } else {
            lb0Var = this;
            canvas2 = canvas;
        }
        if (mb0Var.V) {
            L2 = (int) (f2 * 2.0f * 0.7f);
        } else {
            L2 = gl.L(70.0f);
        }
        float R12 = gl.R1(gl.U1(lmVar.c, L2, (int) (lb0Var.getMeasuredWidth() * 0.7f)), (int) (gl.L(42.0f) * 0.7f), mb0Var.O) / 2.0f;
        kb0 kb0Var = lb0Var.c;
        vl vlVar = kb0Var.e;
        if (vlVar != null) {
            ml mlVar = vlVar.k;
            if (mlVar != null) {
                mlVar.q0((int) (2.0f * R12 * 0.13f));
            }
            vl vlVar2 = kb0Var.e;
            float f15 = lb0Var.E;
            float f16 = lb0Var.F;
            vlVar2.setBounds((int) (f15 - R12), (int) (f16 - R12), (int) (f15 + R12), (int) (f16 + R12));
            kb0Var.e.setColorFilter(lb0Var.r);
            kb0Var.e.draw(canvas2);
            return;
        }
        ImageReceiver imageReceiver = kb0Var.a;
        float f17 = lb0Var.E - R12;
        float f18 = lb0Var.F - R12;
        float f19 = R12 * 2.0f;
        imageReceiver.i0(f17, f18, f19, f19);
        kb0Var.a.q0((int) (f19 * 0.13f));
        kb0Var.a.h(canvas2, null);
    }

    public long getDuration() {
        kb0 kb0Var = this.c;
        ImageReceiver imageReceiver = kb0Var.getImageReceiver();
        vl vlVar = kb0Var.e;
        if (vlVar != null) {
            imageReceiver = vlVar.k;
        }
        if (imageReceiver != null && imageReceiver.y() != null) {
            return imageReceiver.y().m();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        kb0 kb0Var = this.c;
        ImageReceiver imageReceiver = kb0Var.getImageReceiver();
        vl vlVar = kb0Var.e;
        if (vlVar != null) {
            ml mlVar = vlVar.k;
            vlVar.setColorFilter(this.r);
            return mlVar;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.G.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.G.V) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z) {
        ml mlVar;
        if (this.w == z) {
            return;
        }
        this.w = z;
        if (z) {
            kb0 kb0Var = this.c;
            vl vlVar = kb0Var.e;
            if (vlVar != null && (mlVar = vlVar.k) != null) {
                mlVar.w0(false);
            }
            kb0Var.a.w0(false);
        }
        kk7.e().k(kk7.t4, new Object[0]);
        invalidate();
    }
}
