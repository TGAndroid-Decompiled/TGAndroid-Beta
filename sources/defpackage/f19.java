package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class f19 implements ValueAnimator.AnimatorUpdateListener {
    public final i19 a;
    public final wb2 b;
    public final ImageReceiver c;
    public final long d;
    public al0 e;
    public al0 f;
    public Paint g;
    public final StaticLayout h;
    public float i;
    public float j;
    public ValueAnimator k;
    public float l;
    public boolean m;
    public ValueAnimator n;
    public float o;
    public boolean p;

    public f19(i19 i19Var, long j) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        rb0 rb0Var = new rb0((vnb) null);
        int i = yac.t0;
        this.l = 1.0f;
        this.m = true;
        this.o = 0.0f;
        this.p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(i19Var.a);
        this.c = imageReceiver2;
        this.a = i19Var;
        wb2 wb2Var = i19Var.E;
        this.b = wb2Var;
        this.d = j;
        rb0Var.p = 1.0f;
        if (wf3.D(j)) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            rb0Var.q(X1);
            if (lbc.D(X1)) {
                str2 = ob6.M0(2131745629, null);
                rb0Var.f(1);
                rb0Var.p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.Z(null, null, null, null, rb0Var, 0L, null, X1, 0);
                imageReceiver.q0(hl.L(21.0f));
                imageReceiver.i0(0.0f, 0.0f, hl.L(42.0f), hl.L(42.0f));
                Paint c2 = wb2Var.c2("paintChatActionText");
                if (str2 == null && c2 != null) {
                    int L = hl.L(48.0f);
                    TextPaint textPaint = new TextPaint(c2);
                    CharSequence ellipsize = TextUtils.ellipsize(str2, textPaint, hl.q.x - L, TextUtils.TruncateAt.END);
                    this.h = new StaticLayout(ellipsize, textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = X1 != null ? lv2.m(0, X1.first_name, X1.last_name) : "";
            imageReceiver.U(X1, rb0Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            str = M0 != null ? M0.title : "";
            rb0Var.p(M0);
            imageReceiver.U(M0, rb0Var, null);
        }
        str2 = str;
        imageReceiver.q0(hl.L(21.0f));
        imageReceiver.i0(0.0f, 0.0f, hl.L(42.0f), hl.L(42.0f));
        Paint c22 = wb2Var.c2("paintChatActionText");
        if (str2 == null) {
        }
    }

    public static float b(float f, float f2, float f3, float f4) {
        float f5 = f2 / 2.0f;
        float f6 = f - f5;
        float f7 = f + f5;
        float f8 = f4 - f3;
        if (f2 > f8) {
            float f9 = (f3 + f4) / 2.0f;
            float f10 = f2 - f8;
            float max = Math.max(0.0f, f3 - f6);
            float max2 = Math.max(0.0f, f7 - f4);
            float f11 = max + max2;
            if (f11 < 0.1f) {
                return f9;
            }
            return c00.B(f10, 2.0f, (max - max2) / f11, f9);
        } else if (f6 < f3) {
            return f3 + f5;
        } else {
            if (f7 > f4) {
                return f4 - f5;
            }
            return f;
        }
    }

    public final void a(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.translate(f - f3, f2 - f3);
        canvas.scale(f3 / hl.L(21.0f), f3 / hl.L(21.0f));
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setAlpha(((this.l * 0.25f) + 0.75f) * f4);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.n) {
            this.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.k) {
            this.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.a.invalidateSelf();
    }
}
