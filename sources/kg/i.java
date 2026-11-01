package kg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.e20;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u10;
import w7.b6;
public final class i extends FrameLayout {
    public final g9 f11107a;
    public final u10 f11108b;
    public final int f11109c;
    public final l d;

    public i(l lVar, Context context) {
        super(context);
        this.d = lVar;
        u10 u10Var = new u10();
        this.f11108b = u10Var;
        int i10 = lVar.f11164f;
        p6 p6Var = lVar.f10989a;
        if (i10 == 0) {
            this.f11109c = org.telegram.messenger.i0.L(150.0f);
            g9 g9Var = new g9(context);
            this.f11107a = g9Var;
            g9Var.setRoundRadius((int) (org.telegram.messenger.i0.L(65.0f) / 2.0f));
            addView(g9Var, b6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f7 = e20.i(e20.f15506s0).f();
            r8 r8Var = new r8((p6) null);
            r8Var.r(f7);
            g9Var.getImageReceiver().i0(f7, r8Var, null);
            TextView textView = new TextView(context);
            sc.e.t(textView, 1, 20.0f);
            a30.p(textView, t6.G6, p6Var, null, 2131743831);
            addView(textView, b6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            u10Var.f30815m = true;
            u10Var.f30806a = true;
            u10Var.d(t6.x0(null, t6.Ak, false), t6.x0(null, t6.zk, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = u10Var.f30808c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.i0.N(3.3f));
        } else if (i10 == 1) {
            g gVar = new g(context, 0);
            addView(gVar, b6.e(-1, 190, 55));
            h hVar = new h(context, 1, 1, 0);
            hVar.setStarParticlesView(gVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = t6.Ak;
            canvas.drawColor(i0.b.f(0.5f, t6.w0(i11, p6Var), t6.w0(t6.f21002h5, p6Var)));
            hVar.setBackgroundBitmap(createBitmap);
            lg.h hVar2 = hVar.f11920b;
            hVar2.f11898z = i11;
            hVar2.A = t6.zk;
            hVar2.b();
            addView(hVar, b6.e(160, 160, 1));
            hVar.m(100L);
            TextView g10 = m5.g(context, 1, 20.0f);
            g10.setTypeface(org.telegram.messenger.i0.o());
            a30.p(g10, t6.G6, p6Var, null, 2131744277);
            g10.setGravity(17);
            addView(g10, b6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            a30.p(textView2, t6.f21331z6, p6Var, null, 2131744273);
            textView2.setGravity(17);
            addView(textView2, b6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f11164f == 0) {
            Rect rect = org.telegram.messenger.i0.Q;
            this.f11107a.getHitRect(rect);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(rect);
            rectF.inset(-org.telegram.messenger.i0.L(5.0f), -org.telegram.messenger.i0.L(5.0f));
            u10 u10Var = this.f11108b;
            u10Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(org.telegram.messenger.i0.P, f12, ((f10 + f7) - f11) - f12, false, u10Var.f30808c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f11109c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
