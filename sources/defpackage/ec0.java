package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ec0 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final pb0 c;
    public float d;
    public final int e;
    public View f;
    public boolean h;
    public final wc n;
    public float r;
    public int s;
    public boolean w;

    public ec0(float f, int i, View view) {
        this.h = true;
        this.n = new wc(this, (byte) 2);
        this.s = 255;
        this.w = true;
        this.e = i;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.K0 = true;
        this.c = new pb0((wjb) null);
        imageReceiver.q0(gl.L(f));
        this.d = f;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(0.66f), 855638016);
        d(view);
    }

    public static void a(CharSequence charSequence, ahb ahbVar) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (ec0 ec0Var : (ec0[]) spannable.getSpans(0, spannable.length(), ec0.class)) {
                ec0Var.d(ahbVar);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        pb0 pb0Var = this.c;
        pb0Var.p(chat);
        this.b.U(chat, pb0Var, null);
    }

    public final void c(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.e;
        if (i >= 0) {
            e(na7.q1(i2).V1(Long.valueOf(j)));
        } else {
            b(na7.q1(i2).K0(Long.valueOf(-j)));
        }
    }

    public final void d(View view) {
        View view2 = this.f;
        if (view2 != view) {
            wc wcVar = this.n;
            ImageReceiver imageReceiver = this.b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(wcVar);
                if (this.f.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.K();
                }
            }
            View view3 = this.f;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.I();
            }
            this.f = view;
            imageReceiver.p0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(wcVar);
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = 1.0f;
        if (this.h) {
            int i6 = this.s;
            int alpha = paint.getAlpha();
            Paint paint2 = this.a;
            if (i6 != alpha) {
                int alpha2 = paint.getAlpha();
                this.s = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(0.66f), bkb.p1(this.s / 255.0f, 855638016));
            }
            canvas.drawCircle((gl.L(this.d) / 2.0f) + 0.0f + f, ((i3 + i5) / 2.0f) + this.r, gl.L(this.d) / 2.0f, paint2);
        }
        float f3 = 0.0f + f;
        float f4 = (i3 + i5) / 2.0f;
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f3, (f4 + this.r) - (gl.L(this.d) / 2.0f), gl.L(this.d), gl.L(this.d));
        if (this.w) {
            f2 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f2);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        pb0 pb0Var = this.c;
        pb0Var.q(user);
        this.b.U(user, pb0Var, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return gl.L(this.d);
    }

    public ec0(int i, View view) {
        this(18.0f, i, view);
    }
}
