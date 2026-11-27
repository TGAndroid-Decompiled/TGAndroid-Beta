package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class j94 extends FrameLayout {
    public final de0 a;
    public final o15 b;
    public final int c;
    public final m94 d;

    public j94(m94 m94Var, Context context) {
        super(context);
        this.d = m94Var;
        o15 o15Var = new o15();
        this.b = o15Var;
        boolean z = m94Var.f;
        vnb vnbVar = m94Var.a;
        if (!z) {
            this.c = hl.L(150.0f);
            de0 de0Var = new de0(context);
            this.a = de0Var;
            de0Var.setRoundRadius((int) (hl.L(65.0f) / 2.0f));
            addView(de0Var, tre.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f = yac.h(yac.t0).f();
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.q(f);
            de0Var.getImageReceiver().U(f, rb0Var, null);
            TextView textView = new TextView(context);
            bs2.t(textView, 1, 20.0f);
            ik8.x(textView, aob.G6, vnbVar, null, 2131743460);
            addView(textView, tre.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            o15Var.m = true;
            o15Var.a = true;
            o15Var.d(aob.w0(null, aob.Dk, false), aob.w0(null, aob.Ck, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = o15Var.c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(hl.N(3.3f));
        } else if (z) {
            vb vbVar = new vb(context, (byte) 2);
            addView(vbVar, tre.e(-1, 190, 55));
            i94 i94Var = new i94(context, 1, 1, (byte) 0);
            i94Var.setStarParticlesView(vbVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i = aob.Dk;
            canvas.drawColor(vm2.f(0.5f, aob.v0(i, vnbVar), aob.v0(aob.h5, vnbVar)));
            i94Var.setBackgroundBitmap(createBitmap);
            ys4 ys4Var = i94Var.b;
            ys4Var.z = i;
            ys4Var.A = aob.Ck;
            ys4Var.b();
            addView(i94Var, tre.e(160, 160, 1));
            i94Var.m(100L);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(hl.o());
            ik8.x(textView2, aob.G6, vnbVar, null, 2131743905);
            textView2.setGravity(17);
            addView(textView2, tre.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            ik8.x(textView3, aob.z6, vnbVar, null, 2131743901);
            textView3.setGravity(17);
            addView(textView3, tre.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.d.f) {
            Rect rect = hl.Q;
            this.a.getHitRect(rect);
            RectF rectF = hl.P;
            rectF.set(rect);
            rectF.inset(-hl.L(5.0f), -hl.L(5.0f));
            o15 o15Var = this.b;
            o15Var.c(rectF);
            for (int i = 0; i < 7; i++) {
                float f = (i * 51.42857f) - 90.0f;
                float f2 = f + 5.0f;
                canvas.drawArc(hl.P, f2, ((51.42857f + f) - 5.0f) - f2, false, o15Var.c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.c;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
