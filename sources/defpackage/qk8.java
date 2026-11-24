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
public final class qk8 extends TextView {
    public final byte a = 0;
    public final Object b;
    public final Object c;
    public final FrameLayout d;

    public qk8(bgc bgcVar, Context context) {
        super(context);
        this.d = bgcVar;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint[bgcVar.e.length];
        ye7 ye7Var = bgcVar.S;
        ye7Var.setBounds(0, 0, 80, 80);
        ye7 ye7Var2 = bgcVar.T;
        ye7Var2.setBounds(0, 0, 80, 80);
        ep epVar = bgcVar.Q;
        epVar.i(0.0f, 0.0f, 80.0f, 80.0f);
        ep epVar2 = bgcVar.R;
        epVar2.i(0.0f, 0.0f, 80.0f, 80.0f);
        ye7Var.setAlpha(255);
        ye7Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) epVar.b).drawColor(0, mode);
        ((Canvas) epVar2.b).drawColor(0, mode);
        ye7Var.draw((Canvas) epVar.b);
        ye7Var2.draw((Canvas) epVar2.b);
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
                bgc bgcVar = (bgc) frameLayout;
                qk8 qk8Var = bgcVar.c;
                bgcVar.Q.i(-getX(), -getY(), bgcVar.getWidth() - getX(), bgcVar.getHeight() - getY());
                bgcVar.R.i(-getX(), -getY(), bgcVar.getWidth() - getX(), bgcVar.getHeight() - getY());
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[bgcVar.w].setAlpha(255);
                float L = gl.L(8.0f) + ((int) ((1.0f - bgcVar.E) * (gl.L(26.0f) - gl.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[bgcVar.w]);
                float f = bgcVar.s;
                if (f > 0.0f && (i = bgcVar.w + 1) < paintArr.length) {
                    paintArr[i].setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[bgcVar.w + 1]);
                }
                float f2 = bgcVar.E;
                if (f2 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f2) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (bgcVar.P) {
                    canvas.drawText(k96.M0(2131742998, null), getWidth() / 2, (int) ((getHeight() / 2) - ((qk8Var.getPaint().ascent() + qk8Var.getPaint().descent()) / 2.0f)), qk8Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                xhc xhcVar = (xhc) frameLayout;
                lfc lfcVar = (lfc) obj;
                lfcVar.d(((View) xhcVar.getParent()).getX() + xhcVar.getX() + ((View) getParent()).getX() + getX(), ((View) xhcVar.getParent()).getY() + xhcVar.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, gl.L(16.0f), gl.L(16.0f), lfcVar.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                bgc bgcVar = (bgc) this.d;
                ep epVar = bgcVar.Q;
                super.onSizeChanged(i, i2, i3, i4);
                int i5 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.c;
                    if (i5 < paintArr.length) {
                        if (i5 == 0) {
                            paintArr[i5] = (Paint) epVar.a;
                        } else if (i5 == 1) {
                            paintArr[i5] = (Paint) bgcVar.R.a;
                        } else {
                            paintArr[i5] = (Paint) epVar.a;
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

    public qk8(xhc xhcVar, Activity activity, lfc lfcVar) {
        super(activity);
        this.d = xhcVar;
        this.c = lfcVar;
        this.b = new RectF();
        lfcVar.a(this);
    }
}
