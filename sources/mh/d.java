package mh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.i5;
import org.telegram.messenger.o5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.r8;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final j f13315a;
    public final q1 f13316b;
    public final ImageReceiver f13317c;
    public final long d;
    public b e;
    public b f13318f;
    public Paint f13319g;
    public final StaticLayout h;
    public float f13320i;
    public float f13321j;
    public ValueAnimator f13322k;
    public float f13323l;
    public boolean f13324m;
    public ValueAnimator f13325n;
    public float f13326o;
    public boolean f13327p;

    public d(j jVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f7;
        CharSequence ellipsize;
        r8 r8Var = new r8((p6) null);
        int i10 = e20.f15506s0;
        this.f13323l = 1.0f;
        this.f13324m = true;
        this.f13326o = 0.0f;
        this.f13327p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(jVar.f13359a);
        this.f13317c = imageReceiver2;
        this.f13315a = jVar;
        q1 q1Var = jVar.D;
        this.f13316b = q1Var;
        this.d = j10;
        r8Var.f29927p = 1.0f;
        if (o5.E(j10)) {
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(j10));
            r8Var.r(Z1);
            if (i20.B(Z1)) {
                str2 = dd.L0(2131745918, null);
                r8Var.g(1);
                r8Var.f29927p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.r0(null, null, null, null, r8Var, 0L, null, Z1, 0);
                imageReceiver.J0(i0.L(i.f13352a / 2.0f));
                imageReceiver.y0(0.0f, 0.0f, i0.L(f7), i0.L(f7));
                Paint X1 = q1Var.X1("paintChatActionText");
                if (str2 == null && X1 != null) {
                    int L = i0.L(48);
                    TextPaint textPaint = new TextPaint(X1);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, i0.f16172q.x - L, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = Z1 != null ? i5.m(0, Z1.first_name, Z1.last_name) : "";
            imageReceiver.i0(Z1, r8Var, null);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
            str = L0 != null ? L0.title : "";
            r8Var.q(L0);
            imageReceiver.i0(L0, r8Var, null);
        }
        str2 = str;
        imageReceiver.J0(i0.L(i.f13352a / 2.0f));
        imageReceiver.y0(0.0f, 0.0f, i0.L(f7), i0.L(f7));
        Paint X12 = q1Var.X1("paintChatActionText");
        if (str2 == null) {
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        float f13 = f10 / 2.0f;
        float f14 = f7 - f13;
        float f15 = f7 + f13;
        float f16 = f12 - f11;
        if (f10 > f16) {
            float f17 = (f11 + f12) / 2.0f;
            float f18 = f10 - f16;
            float max = Math.max(0.0f, f11 - f14);
            float max2 = Math.max(0.0f, f15 - f12);
            float f19 = max + max2;
            if (f19 < 0.1f) {
                return f17;
            }
            return a1.g.c(f18, 2.0f, (max - max2) / f19, f17);
        } else if (f14 < f11) {
            return f11 + f13;
        } else {
            if (f15 > f12) {
                return f12 - f13;
            }
            return f7;
        }
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f7 - f11, f10 - f11);
        int i10 = i.f13352a;
        float f13 = 21;
        canvas.scale(f11 / i0.L(f13), f11 / i0.L(f13));
        ImageReceiver imageReceiver = this.f13317c;
        imageReceiver.setAlpha(((this.f13323l * 0.25f) + 0.75f) * f12);
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f13325n) {
            this.f13326o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f13322k) {
            this.f13323l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f13315a.invalidateSelf();
    }
}
