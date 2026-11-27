package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class bk2 extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public ok2[] f;

    public bk2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk2.b(int, int):void");
    }

    public final void c(String str, boolean z) {
        if (this.f != null) {
            int i = 0;
            if (z) {
                int i2 = 0;
                while (true) {
                    ok2[] ok2VarArr = this.f;
                    if (i2 >= ok2VarArr.length) {
                        break;
                    } else if (ok2VarArr[i2].isFocused()) {
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
            if (childAt instanceof ok2) {
                ok2 ok2Var = (ok2) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        ok2Var.B(1.0f);
                    } else if (!childAt.isFocused()) {
                        ok2Var.B(0.0f);
                    }
                }
                float successProgress = ok2Var.getSuccessProgress();
                int f = vm2.f(successProgress, vm2.f(ok2Var.getErrorProgress(), vm2.f(ok2Var.getFocusedProgress(), aob.w0(null, aob.k6, false), aob.w0(null, aob.l6, false)), aob.w0(null, aob.q7, false)), aob.w0(null, aob.i7, false));
                Paint paint = this.a;
                paint.setColor(f);
                RectF rectF = hl.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f2 = this.c;
                rectF.inset(f2, f2);
                if (successProgress != 0.0f) {
                    float f3 = -Math.max(0.0f, (ok2Var.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f3, f3);
                }
                canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view instanceof ok2) {
            ok2 ok2Var = (ok2) view;
            canvas.save();
            float f = ok2Var.W1;
            RectF rectF = hl.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f2 = this.c;
            rectF.inset(f2, f2);
            canvas.clipRect(rectF);
            if (ok2Var.Y1) {
                float f3 = (f * 0.5f) + 0.5f;
                view.setAlpha(f);
                canvas.scale(f3, f3, (ok2Var.getMeasuredWidth() / 2.0f) + ok2Var.getX(), (ok2Var.getMeasuredHeight() / 2.0f) + ok2Var.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j);
            canvas.restore();
            float f4 = ok2Var.X1;
            if (f4 < 1.0f) {
                canvas.save();
                float f5 = 1.0f - f4;
                float f6 = (f5 * 0.5f) + 0.5f;
                canvas.scale(f6, f6, (ok2Var.getMeasuredWidth() / 2.0f) + ok2Var.getX(), (ok2Var.getMeasuredHeight() / 2.0f) + ok2Var.getY());
                Paint paint = this.b;
                paint.setAlpha((int) (f5 * 255.0f));
                canvas.drawBitmap(ok2Var.Z1, ok2Var.getX(), ok2Var.getY(), paint);
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
            ok2[] ok2VarArr = this.f;
            if (i < ok2VarArr.length) {
                sb.append(f78.h(ok2VarArr[i].getText().toString(), false));
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = hl.L(1.5f);
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
