package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.CheckBoxBase;
public final class si9 extends View {
    public final byte a;
    public final Object b;

    public si9(Context context, wjb wjbVar) {
        super(context);
        this.a = (byte) 0;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, wjbVar, this);
        this.b = checkBoxBase;
        checkBoxBase.h(bkb.Xl, bkb.y5, bkb.j7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(gl.L(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 11:
                canvas.save();
                t7b t7bVar = (t7b) this.b;
                canvas.translate(t7bVar.d1.getX() + t7bVar.m0.getX(), t7bVar.d1.getY() + t7bVar.m0.getY());
                j7b j7bVar = t7bVar.d1;
                j7bVar.k(canvas, j7bVar.getBounds(), t7bVar.d1.getOver2Alpha());
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.draw(canvas);
                taa taaVar = (taa) this.b;
                ql0 ql0Var = taaVar.Q2;
                ql0Var.setBounds(0, (getMeasuredHeight() - taaVar.B2.d) - gl.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                ql0Var.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 7:
                super.invalidate();
                ((cja) this.b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.b).l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.b).l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 2:
                super.onLayout(z, i, i2, i3, i4);
                jw9 jw9Var = (jw9) this.b;
                int[] iArr = jw9Var.H;
                getLocationOnScreen(iArr);
                Rect rect = jw9Var.d;
                int i5 = iArr[0];
                rect.set(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1]);
                gl.V1(jw9Var.c, rect, jw9Var.J, jw9Var.e);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(24.0f));
                return;
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            default:
                super.onMeasure(i, i2);
                return;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((qaa) obj).L.E1.R, 1073741824));
                return;
            case 6:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((dha) obj).getMeasuredHeight());
                return;
            case 8:
                jva jvaVar = (jva) obj;
                if (jvaVar.I) {
                    i3 = (jvaVar.o0().getMeasuredHeight() + jvaVar.J) - gl.L(16.0f);
                } else {
                    int L = gl.L(140.0f) + jvaVar.J;
                    if (gl.L(24.0f) + jvaVar.E.getMeasuredHeight() > L) {
                        i3 = gl.L(24.0f) + jvaVar.E.getMeasuredHeight();
                    } else {
                        i3 = L;
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), 1073741824));
                return;
            case 9:
                lya lyaVar = (lya) obj;
                tya tyaVar = lyaVar.d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i2) - gl.L(4.0f);
                int i6 = tyaVar.o3;
                if (i6 > 0) {
                    i4 = gl.L(4.0f) + i6;
                } else {
                    i4 = 0;
                }
                int max = Math.max(i4, (int) (size - Math.min(gl.L(4.0f) + ((lyaVar.b() - 1) * size2), tyaVar.f3 * size2)));
                tyaVar.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i2);
                return;
            case 10:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), 1073741824));
                return;
            case 12:
                ydb ydbVar = (ydb) obj;
                if (ydbVar.I) {
                    i5 = (ydbVar.o0().getMeasuredHeight() + ydbVar.J) - gl.L(16.0f);
                } else {
                    int L2 = gl.L(140.0f) + ydbVar.J;
                    if (gl.L(24.0f) + ydbVar.E.getMeasuredHeight() > L2) {
                        i5 = gl.L(24.0f) + ydbVar.E.getMeasuredHeight();
                    } else {
                        i5 = L2;
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i5 - 0.0f), 1073741824));
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 13:
                super.setAlpha(f);
                View view = ((qvb) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setTranslationX(float f) {
        switch (this.a) {
            case 5:
                super.setTranslationX(f);
                invalidate();
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    public si9(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
