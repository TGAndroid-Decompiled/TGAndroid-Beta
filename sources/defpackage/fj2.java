package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class fj2 extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public sj2[] f;

    public fj2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj2.b(int, int):void");
    }

    public final void c(String str, boolean z) {
        if (this.f != null) {
            int i = 0;
            if (z) {
                int i2 = 0;
                while (true) {
                    sj2[] sj2VarArr = this.f;
                    if (i2 >= sj2VarArr.length) {
                        break;
                    } else if (sj2VarArr[i2].isFocused()) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            for (int i3 = i; i3 < Math.min(this.f.length, str.length() + i); i3++) {
                this.f[i3].setText(Character.toString(str.charAt(i3 - i)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof sj2) {
                sj2 sj2Var = (sj2) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        sj2Var.B(1.0f);
                    } else if (!childAt.isFocused()) {
                        sj2Var.B(0.0f);
                    }
                }
                float successProgress = sj2Var.getSuccessProgress();
                int f = bm2.f(successProgress, bm2.f(sj2Var.getErrorProgress(), bm2.f(sj2Var.getFocusedProgress(), bkb.w0(null, bkb.j6, false), bkb.w0(null, bkb.k6, false)), bkb.w0(null, bkb.p7, false)), bkb.w0(null, bkb.h7, false));
                Paint paint = this.a;
                paint.setColor(f);
                RectF rectF = gl.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f2 = this.c;
                rectF.inset(f2, f2);
                if (successProgress != 0.0f) {
                    float f3 = -Math.max(0.0f, (sj2Var.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f3, f3);
                }
                canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view instanceof sj2) {
            sj2 sj2Var = (sj2) view;
            canvas.save();
            float f = sj2Var.V1;
            RectF rectF = gl.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f2 = this.c;
            rectF.inset(f2, f2);
            canvas.clipRect(rectF);
            if (sj2Var.X1) {
                float f3 = (f * 0.5f) + 0.5f;
                view.setAlpha(f);
                canvas.scale(f3, f3, (sj2Var.getMeasuredWidth() / 2.0f) + sj2Var.getX(), (sj2Var.getMeasuredHeight() / 2.0f) + sj2Var.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j);
            canvas.restore();
            float f4 = sj2Var.W1;
            if (f4 < 1.0f) {
                canvas.save();
                float f5 = 1.0f - f4;
                float f6 = (f5 * 0.5f) + 0.5f;
                canvas.scale(f6, f6, (sj2Var.getMeasuredWidth() / 2.0f) + sj2Var.getX(), (sj2Var.getMeasuredHeight() / 2.0f) + sj2Var.getY());
                Paint paint = this.b;
                paint.setAlpha((int) (f5 * 255.0f));
                canvas.drawBitmap(sj2Var.Y1, sj2Var.getX(), sj2Var.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            sj2[] sj2VarArr = this.f;
            if (i < sj2VarArr.length) {
                sb.append(p38.h(sj2VarArr[i].getText().toString(), false));
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = gl.L(1.5f);
        this.c = L;
        this.a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
