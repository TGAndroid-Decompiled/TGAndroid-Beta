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
public final class o84 extends FrameLayout {
    public final be0 a;
    public final kz4 b;
    public final int c;
    public final r84 d;

    public o84(r84 r84Var, Context context) {
        super(context);
        this.d = r84Var;
        kz4 kz4Var = new kz4();
        this.b = kz4Var;
        boolean z = r84Var.f;
        wjb wjbVar = r84Var.a;
        if (!z) {
            this.c = gl.L(150.0f);
            be0 be0Var = new be0(context);
            this.a = be0Var;
            be0Var.setRoundRadius((int) (gl.L(65.0f) / 2.0f));
            addView(be0Var, nme.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f = y6c.h(y6c.t0).f();
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.q(f);
            be0Var.getImageReceiver().U(f, pb0Var, null);
            TextView textView = new TextView(context);
            ir2.t(textView, 1, 20.0f);
            ug8.x(textView, bkb.F6, wjbVar, null, 2131743566);
            addView(textView, nme.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            kz4Var.m = true;
            kz4Var.a = true;
            kz4Var.d(bkb.w0(null, bkb.Ck, false), bkb.w0(null, bkb.Bk, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = kz4Var.c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(gl.N(3.3f));
        } else if (z) {
            ub ubVar = new ub(context, (byte) 2);
            addView(ubVar, nme.e(-1, 190, 55));
            n84 n84Var = new n84(context, 1, 1, (byte) 0);
            n84Var.setStarParticlesView(ubVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i = bkb.Ck;
            canvas.drawColor(bm2.f(0.5f, bkb.v0(i, wjbVar), bkb.v0(bkb.g5, wjbVar)));
            n84Var.setBackgroundBitmap(createBitmap);
            uq4 uq4Var = n84Var.b;
            uq4Var.z = i;
            uq4Var.A = bkb.Bk;
            uq4Var.b();
            addView(n84Var, nme.e(160, 160, 1));
            n84Var.m(100L);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(gl.o());
            ug8.x(textView2, bkb.F6, wjbVar, null, 2131744011);
            textView2.setGravity(17);
            addView(textView2, nme.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 14.0f);
            ug8.x(textView3, bkb.y6, wjbVar, null, 2131744007);
            textView3.setGravity(17);
            addView(textView3, nme.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.d.f) {
            Rect rect = gl.Q;
            this.a.getHitRect(rect);
            RectF rectF = gl.P;
            rectF.set(rect);
            rectF.inset(-gl.L(5.0f), -gl.L(5.0f));
            kz4 kz4Var = this.b;
            kz4Var.c(rectF);
            for (int i = 0; i < 7; i++) {
                float f = (i * 51.42857f) - 90.0f;
                float f2 = f + 5.0f;
                canvas.drawArc(gl.P, f2, ((51.42857f + f) - 5.0f) - f2, false, kz4Var.c);
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
