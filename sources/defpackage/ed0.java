package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ed0 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final pc0 c;
    public float d;
    public final int e;
    public View f;
    public boolean h;
    public final wd n;
    public float r;
    public int s;
    public boolean w;

    public ed0(float f, int i, View view) {
        this.h = true;
        this.n = new wd(this, (byte) 2);
        this.s = 255;
        this.w = true;
        this.e = i;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.K0 = true;
        this.c = new pc0((ylb) null);
        imageReceiver.q0(gm.L(f));
        this.d = f;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(0.66f), 855638016);
        d(view);
    }

    public static void a(CharSequence charSequence, bjb bjbVar) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (ed0 ed0Var : (ed0[]) spannable.getSpans(0, spannable.length(), ed0.class)) {
                ed0Var.d(bjbVar);
            }
        }
    }

    public final void b(TLRPC.Chat chat) {
        pc0 pc0Var = this.c;
        pc0Var.p(chat);
        this.b.U(chat, pc0Var, null);
    }

    public final void c(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.e;
        if (i >= 0) {
            e(oc7.r1(i2).W1(Long.valueOf(j)));
        } else {
            b(oc7.r1(i2).L0(Long.valueOf(-j)));
        }
    }

    public final void d(View view) {
        View view2 = this.f;
        if (view2 != view) {
            wd wdVar = this.n;
            ImageReceiver imageReceiver = this.b;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(wdVar);
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
                view.addOnAttachStateChangeListener(wdVar);
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
                paint2.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(0.66f), cmb.p1(this.s / 255.0f, 855638016));
            }
            canvas.drawCircle((gm.L(this.d) / 2.0f) + 0.0f + f, ((i3 + i5) / 2.0f) + this.r, gm.L(this.d) / 2.0f, paint2);
        }
        float f3 = 0.0f + f;
        float f4 = (i3 + i5) / 2.0f;
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(f3, (f4 + this.r) - (gm.L(this.d) / 2.0f), gm.L(this.d), gm.L(this.d));
        if (this.w) {
            f2 = paint.getAlpha() / 255.0f;
        }
        imageReceiver.setAlpha(f2);
        imageReceiver.h(canvas, null);
    }

    public final void e(TLRPC.User user) {
        pc0 pc0Var = this.c;
        pc0Var.q(user);
        this.b.U(user, pc0Var, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return gm.L(this.d);
    }

    public ed0(int i, View view) {
        this(18.0f, i, view);
    }
}
