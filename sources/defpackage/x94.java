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
public final class x94 extends FrameLayout {
    public final bf0 a;
    public final j15 b;
    public final int c;
    public final aa4 d;

    public x94(aa4 aa4Var, Context context) {
        super(context);
        this.d = aa4Var;
        j15 j15Var = new j15();
        this.b = j15Var;
        boolean z = aa4Var.f;
        ylb ylbVar = aa4Var.a;
        if (!z) {
            this.c = gm.L(150.0f);
            bf0 bf0Var = new bf0(context);
            this.a = bf0Var;
            bf0Var.setRoundRadius((int) (gm.L(65.0f) / 2.0f));
            addView(bf0Var, qoe.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f = z8c.h(z8c.t0).f();
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.q(f);
            bf0Var.getImageReceiver().U(f, pc0Var, null);
            TextView textView = new TextView(context);
            ts2.s(textView, 1, 20.0f);
            wi8.x(textView, cmb.F6, ylbVar, null, 2131743492);
            addView(textView, qoe.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            j15Var.m = true;
            j15Var.a = true;
            j15Var.d(cmb.w0(null, cmb.Ck, false), cmb.w0(null, cmb.Bk, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = j15Var.c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(gm.N(3.3f));
        } else if (z) {
            ub ubVar = new ub(context, (byte) 2);
            addView(ubVar, qoe.e(-1, 190, 55));
            w94 w94Var = new w94(context, 1, 1, (byte) 0);
            w94Var.setStarParticlesView(ubVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i = cmb.Ck;
            canvas.drawColor(on2.f(0.5f, cmb.v0(i, ylbVar), cmb.v0(cmb.g5, ylbVar)));
            w94Var.setBackgroundBitmap(createBitmap);
            vs4 vs4Var = w94Var.b;
            vs4Var.z = i;
            vs4Var.A = cmb.Bk;
            vs4Var.b();
            addView(w94Var, qoe.e(160, 160, 1));
            w94Var.m(100L);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(gm.o());
            wi8.x(textView2, cmb.F6, ylbVar, null, 2131743937);
            textView2.setGravity(17);
            addView(textView2, qoe.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            wi8.x(textView3, cmb.y6, ylbVar, null, 2131743933);
            textView3.setGravity(17);
            addView(textView3, qoe.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.d.f) {
            Rect rect = gm.Q;
            this.a.getHitRect(rect);
            RectF rectF = gm.P;
            rectF.set(rect);
            rectF.inset(-gm.L(5.0f), -gm.L(5.0f));
            j15 j15Var = this.b;
            j15Var.c(rectF);
            for (int i = 0; i < 7; i++) {
                float f = (i * 51.42857f) - 90.0f;
                float f2 = f + 5.0f;
                canvas.drawArc(gm.P, f2, ((51.42857f + f) - 5.0f) - f2, false, j15Var.c);
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
