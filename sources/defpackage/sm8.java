package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class sm8 extends TextView {
    public final byte a = 0;
    public final Object b;
    public final Object c;
    public final FrameLayout d;

    public sm8(cic cicVar, Context context) {
        super(context);
        this.d = cicVar;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint[cicVar.e.length];
        ah7 ah7Var = cicVar.S;
        ah7Var.setBounds(0, 0, 80, 80);
        ah7 ah7Var2 = cicVar.T;
        ah7Var2.setBounds(0, 0, 80, 80);
        eq eqVar = cicVar.Q;
        eqVar.i(0.0f, 0.0f, 80.0f, 80.0f);
        eq eqVar2 = cicVar.R;
        eqVar2.i(0.0f, 0.0f, 80.0f, 80.0f);
        ah7Var.setAlpha(255);
        ah7Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) eqVar.b).drawColor(0, mode);
        ((Canvas) eqVar2.b).drawColor(0, mode);
        ah7Var.draw((Canvas) eqVar.b);
        ah7Var2.draw((Canvas) eqVar2.b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        byte b = this.a;
        Object obj = this.c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Paint paint = (Paint) obj2;
                cic cicVar = (cic) frameLayout;
                sm8 sm8Var = cicVar.c;
                cicVar.Q.i(-getX(), -getY(), cicVar.getWidth() - getX(), cicVar.getHeight() - getY());
                cicVar.R.i(-getX(), -getY(), cicVar.getWidth() - getX(), cicVar.getHeight() - getY());
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[cicVar.w].setAlpha(255);
                float L = gm.L(8.0f) + ((int) ((1.0f - cicVar.E) * (gm.L(26.0f) - gm.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[cicVar.w]);
                float f = cicVar.s;
                if (f > 0.0f && (i = cicVar.w + 1) < paintArr.length) {
                    paintArr[i].setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[cicVar.w + 1]);
                }
                float f2 = cicVar.E;
                if (f2 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f2) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (cicVar.P) {
                    canvas.drawText(jb6.M0(2131742924, null), getWidth() / 2, (int) ((getHeight() / 2) - ((sm8Var.getPaint().ascent() + sm8Var.getPaint().descent()) / 2.0f)), sm8Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                xjc xjcVar = (xjc) frameLayout;
                lhc lhcVar = (lhc) obj;
                lhcVar.d(((View) xjcVar.getParent()).getX() + xjcVar.getX() + ((View) getParent()).getX() + getX(), ((View) xjcVar.getParent()).getY() + xjcVar.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, gm.L(16.0f), gm.L(16.0f), lhcVar.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                cic cicVar = (cic) this.d;
                eq eqVar = cicVar.Q;
                super.onSizeChanged(i, i2, i3, i4);
                int i5 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.c;
                    if (i5 < paintArr.length) {
                        if (i5 == 0) {
                            paintArr[i5] = (Paint) eqVar.a;
                        } else if (i5 == 1) {
                            paintArr[i5] = (Paint) cicVar.R.a;
                        } else {
                            paintArr[i5] = (Paint) eqVar.a;
                        }
                        i5++;
                    } else {
                        return;
                    }
                }
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    public sm8(xjc xjcVar, Activity activity, lhc lhcVar) {
        super(activity);
        this.d = xjcVar;
        this.c = lhcVar;
        this.b = new RectF();
        lhcVar.a(this);
    }
}
