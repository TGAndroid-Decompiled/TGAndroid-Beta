package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class xb4 extends View {
    public final Paint a;
    public final Paint b;
    public final Path c;
    public int d;
    public int e;
    public tgb[] f;
    public RectF[] h;
    public float n;
    public xz7 r;
    public int s;

    public xb4(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = new Path();
        this.d = -1;
        this.e = -1;
        this.s = -1;
    }

    public final void a(float f, int i, int i2, Canvas canvas) {
        tgb[] tgbVarArr = this.f;
        int length = tgbVarArr.length;
        int i3 = 0;
        float f2 = f;
        while (i3 < length) {
            tgb tgbVar = tgbVarArr[i3];
            int i4 = i2;
            tgbVar.c(f2, i / 2.0f, 1.0f, i4, canvas);
            f2 += tgbVar.j() + gl.L(24.0f);
            i3++;
            i2 = i4;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f2 = 4.0f;
        int L = gl.L(4.0f) + de9.y(24.0f, this.f.length, gl.L(4.0f));
        int i = 0;
        while (true) {
            tgb[] tgbVarArr = this.f;
            if (i >= tgbVarArr.length) {
                break;
            }
            L = (int) (tgbVarArr[i].j() + L);
            i++;
        }
        float L2 = (height - gl.L(36.0f)) / 2.0f;
        float L3 = (gl.L(36.0f) + height) / 2.0f;
        float f3 = (width - L) / 2.0f;
        float L4 = gl.L(16.0f) + f3;
        RectF rectF = gl.P;
        rectF.set(f3, L2, L + f3, L3);
        canvas.drawRoundRect(rectF, gl.L(18.0f), gl.L(18.0f), this.a);
        float L5 = f3 + gl.L(16.0f);
        int i2 = 0;
        while (i2 < this.f.length) {
            this.h[i2].set(L5 - gl.L(16.0f), L2, this.f[i2].j() + L5 + gl.L(16.0f), L3);
            L5 += this.f[i2].j() + gl.L(24.0f);
            i2++;
            f2 = f2;
        }
        gl.L(f2);
        int j = Utilities.j((int) Math.floor(this.n), this.f.length - 1, 0);
        int j2 = Utilities.j((int) Math.ceil(this.n), this.f.length - 1, 0);
        float L6 = this.h[j].left + gl.L(f);
        float L7 = this.h[j2].left + gl.L(f);
        float f4 = this.n;
        float R1 = gl.R1(L6, L7, (float) (f4 - Math.floor(f4)));
        float L8 = this.h[j].right - gl.L(f);
        float L9 = this.h[j2].right - gl.L(f);
        float f5 = this.n;
        float R12 = gl.R1(L8, L9, (float) (f5 - Math.floor(f5)));
        RectF rectF2 = gl.P;
        rectF2.set(R1, (height - gl.L(28.0f)) / 2.0f, R12, (gl.L(28.0f) + height) / 2.0f);
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF2, gl.L(15.0f), gl.L(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, gl.L(15.0f), gl.L(15.0f), this.b);
        a(L4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(L4, height, this.e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vq1 vq1Var;
        int i = 0;
        if (this.f == null || this.h == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.h;
            if (i < rectFArr.length) {
                if (rectFArr[i].contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0 && i != this.s) {
            this.s = i;
            xz7 xz7Var = this.r;
            if (xz7Var != null && (vq1Var = xz7Var.b.J) != null) {
                vq1Var.E(i);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.s = -1;
        }
        if (motionEvent.getAction() == 0 && i >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i) {
        this.a.setColor(i);
        invalidate();
    }

    public void setSelected(float f) {
        if (Math.abs(f - this.n) > 0.001f) {
            invalidate();
        }
        this.n = f;
    }

    public void setSelectedColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public void setSelectedTextColor(int i) {
        this.e = i;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f = new tgb[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            this.f[i] = new tgb(charSequenceArr[i], 14.0f, gl.o());
            this.h[i] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i) {
        this.d = i;
        invalidate();
    }
}
