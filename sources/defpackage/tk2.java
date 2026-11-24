package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class tk2 extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public gl2[] f;

    public tk2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        gl2[] gl2VarArr = this.f;
        int i7 = 0;
        if (gl2VarArr != null) {
            if (gl2VarArr.length != i) {
                for (gl2 gl2Var : gl2VarArr) {
                    removeView(gl2Var);
                }
            } else {
                while (true) {
                    gl2[] gl2VarArr2 = this.f;
                    if (i7 < gl2VarArr2.length) {
                        gl2VarArr2[i7].setText("");
                        i7++;
                    } else {
                        return;
                    }
                }
            }
        }
        this.f = new gl2[i];
        for (int i8 = 0; i8 < i; i8++) {
            this.f[i8] = new rk2(this, getContext(), i8, i);
            this.f[i8].setImeOptions(268435461);
            this.f[i8].setTextSize(1, 20.0f);
            this.f[i8].setMaxLines(1);
            this.f[i8].setTypeface(gm.o());
            this.f[i8].setPadding(0, 0, 0, 0);
            this.f[i8].setGravity(17);
            gl2[] gl2VarArr3 = this.f;
            if (i2 == 3) {
                gl2VarArr3[i8].setEnabled(false);
                this.f[i8].setInputType(0);
                this.f[i8].setVisibility(8);
            } else {
                gl2VarArr3[i8].setInputType(3);
            }
            if (i2 == 10) {
                i5 = 42;
                i4 = 47;
                i3 = 10;
            } else if (i2 == 11) {
                i3 = 5;
                i5 = 28;
                i4 = 34;
            } else {
                i3 = 7;
                i4 = 42;
                i5 = 34;
            }
            gl2 gl2Var2 = this.f[i8];
            if (i8 != i - 1) {
                i6 = i3;
            } else {
                i6 = 0;
            }
            addView(gl2Var2, qoe.t(i5, i4, 1, 0, 0, i6, 0));
            this.f[i8].addTextChangedListener(new sk2(this, i8, i));
            this.f[i8].setOnEditorActionListener(new j(this, (byte) 10));
        }
    }

    public final void c(String str, boolean z) {
        if (this.f != null) {
            int i = 0;
            if (z) {
                int i2 = 0;
                while (true) {
                    gl2[] gl2VarArr = this.f;
                    if (i2 >= gl2VarArr.length) {
                        break;
                    } else if (gl2VarArr[i2].isFocused()) {
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
            if (childAt instanceof gl2) {
                gl2 gl2Var = (gl2) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        gl2Var.B(1.0f);
                    } else if (!childAt.isFocused()) {
                        gl2Var.B(0.0f);
                    }
                }
                float successProgress = gl2Var.getSuccessProgress();
                int f = on2.f(successProgress, on2.f(gl2Var.getErrorProgress(), on2.f(gl2Var.getFocusedProgress(), cmb.w0(null, cmb.j6, false), cmb.w0(null, cmb.k6, false)), cmb.w0(null, cmb.p7, false)), cmb.w0(null, cmb.h7, false));
                Paint paint = this.a;
                paint.setColor(f);
                RectF rectF = gm.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f2 = this.c;
                rectF.inset(f2, f2);
                if (successProgress != 0.0f) {
                    float f3 = -Math.max(0.0f, (gl2Var.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f3, f3);
                }
                canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view instanceof gl2) {
            gl2 gl2Var = (gl2) view;
            canvas.save();
            float f = gl2Var.V1;
            RectF rectF = gm.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f2 = this.c;
            rectF.inset(f2, f2);
            canvas.clipRect(rectF);
            if (gl2Var.X1) {
                float f3 = (f * 0.5f) + 0.5f;
                view.setAlpha(f);
                canvas.scale(f3, f3, (gl2Var.getMeasuredWidth() / 2.0f) + gl2Var.getX(), (gl2Var.getMeasuredHeight() / 2.0f) + gl2Var.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j);
            canvas.restore();
            float f4 = gl2Var.W1;
            if (f4 < 1.0f) {
                canvas.save();
                float f5 = 1.0f - f4;
                float f6 = (f5 * 0.5f) + 0.5f;
                canvas.scale(f6, f6, (gl2Var.getMeasuredWidth() / 2.0f) + gl2Var.getX(), (gl2Var.getMeasuredHeight() / 2.0f) + gl2Var.getY());
                Paint paint = this.b;
                paint.setAlpha((int) (f5 * 255.0f));
                canvas.drawBitmap(gl2Var.Y1, gl2Var.getX(), gl2Var.getY(), paint);
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
            gl2[] gl2VarArr = this.f;
            if (i < gl2VarArr.length) {
                sb.append(r58.h(gl2VarArr[i].getText().toString(), false));
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = gm.L(1.5f);
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
