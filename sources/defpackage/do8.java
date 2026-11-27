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
public final class do8 extends TextView {
    public final byte a = 1;
    public final Object b;
    public final Object c;
    public final FrameLayout d;

    public do8(gkc gkcVar, Context context) {
        super(context);
        this.d = gkcVar;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint[gkcVar.e.length];
        hh7 hh7Var = gkcVar.S;
        hh7Var.setBounds(0, 0, 80, 80);
        hh7 hh7Var2 = gkcVar.T;
        hh7Var2.setBounds(0, 0, 80, 80);
        fp fpVar = gkcVar.Q;
        fpVar.i(0.0f, 0.0f, 80.0f, 80.0f);
        fp fpVar2 = gkcVar.R;
        fpVar2.i(0.0f, 0.0f, 80.0f, 80.0f);
        hh7Var.setAlpha(255);
        hh7Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) fpVar.b).drawColor(0, mode);
        ((Canvas) fpVar2.b).drawColor(0, mode);
        hh7Var.draw((Canvas) fpVar.b);
        hh7Var2.draw((Canvas) fpVar2.b);
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
                gkc gkcVar = (gkc) frameLayout;
                do8 do8Var = gkcVar.c;
                gkcVar.Q.i(-getX(), -getY(), gkcVar.getWidth() - getX(), gkcVar.getHeight() - getY());
                gkcVar.R.i(-getX(), -getY(), gkcVar.getWidth() - getX(), gkcVar.getHeight() - getY());
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[gkcVar.w].setAlpha(255);
                float L = hl.L(8.0f) + ((int) ((1.0f - gkcVar.E) * (hl.L(26.0f) - hl.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[gkcVar.w]);
                float f = gkcVar.s;
                if (f > 0.0f && (i = gkcVar.w + 1) < paintArr.length) {
                    paintArr[i].setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[gkcVar.w + 1]);
                }
                float f2 = gkcVar.E;
                if (f2 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f2) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (gkcVar.P) {
                    canvas.drawText(ob6.M0(2131742892, null), getWidth() / 2, (int) ((getHeight() / 2) - ((do8Var.getPaint().ascent() + do8Var.getPaint().descent()) / 2.0f)), do8Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                emc emcVar = (emc) frameLayout;
                kjc kjcVar = (kjc) obj;
                kjcVar.d(((View) emcVar.getParent()).getX() + emcVar.getX() + ((View) getParent()).getX() + getX(), ((View) emcVar.getParent()).getY() + emcVar.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, hl.L(16.0f), hl.L(16.0f), kjcVar.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                gkc gkcVar = (gkc) this.d;
                fp fpVar = gkcVar.Q;
                super.onSizeChanged(i, i2, i3, i4);
                int i5 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.c;
                    if (i5 < paintArr.length) {
                        if (i5 == 0) {
                            paintArr[i5] = (Paint) fpVar.a;
                        } else if (i5 == 1) {
                            paintArr[i5] = (Paint) gkcVar.R.a;
                        } else {
                            paintArr[i5] = (Paint) fpVar.a;
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

    public do8(emc emcVar, Activity activity, kjc kjcVar) {
        super(activity);
        this.d = emcVar;
        this.c = kjcVar;
        this.b = new RectF();
        kjcVar.a(this);
    }
}
