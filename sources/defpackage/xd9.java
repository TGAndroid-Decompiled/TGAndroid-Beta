package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.CheckBoxBase;
public final class xd9 extends View {
    public final byte a;
    public final Object b;

    public xd9(Context context, ylb ylbVar) {
        super(context);
        this.a = (byte) 1;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, ylbVar, this);
        this.b = checkBoxBase;
        checkBoxBase.h(cmb.Xl, cmb.y5, cmb.j7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(gm.L(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 12:
                canvas.save();
                v9b v9bVar = (v9b) this.b;
                canvas.translate(v9bVar.d1.getX() + v9bVar.m0.getX(), v9bVar.d1.getY() + v9bVar.m0.getY());
                l9b l9bVar = v9bVar.d1;
                l9bVar.k(canvas, l9bVar.getBounds(), v9bVar.d1.getOver2Alpha());
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
            case 4:
                super.draw(canvas);
                tca tcaVar = (tca) this.b;
                qm0 qm0Var = tcaVar.Q2;
                qm0Var.setBounds(0, (getMeasuredHeight() - tcaVar.B2.d) - gm.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                qm0Var.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 8:
                super.invalidate();
                ((ela) this.b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 1:
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
            case 1:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                ly9 ly9Var = (ly9) this.b;
                int[] iArr = ly9Var.H;
                getLocationOnScreen(iArr);
                Rect rect = ly9Var.d;
                int i5 = iArr[0];
                rect.set(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1]);
                gm.V1(ly9Var.c, rect, ly9Var.J, ly9Var.e);
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
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(24.0f));
                return;
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 12:
            default:
                super.onMeasure(i, i2);
                return;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((qca) obj).L.E1.R, 1073741824));
                return;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((fja) obj).getMeasuredHeight());
                return;
            case 9:
                nxa nxaVar = (nxa) obj;
                if (nxaVar.I) {
                    i3 = (nxaVar.p0().getMeasuredHeight() + nxaVar.J) - gm.L(16.0f);
                } else {
                    int L = gm.L(140.0f) + nxaVar.J;
                    if (gm.L(24.0f) + nxaVar.E.getMeasuredHeight() > L) {
                        i3 = gm.L(24.0f) + nxaVar.E.getMeasuredHeight();
                    } else {
                        i3 = L;
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), 1073741824));
                return;
            case 10:
                m0b m0bVar = (m0b) obj;
                u0b u0bVar = m0bVar.d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i2) - gm.L(4.0f);
                int i6 = u0bVar.o3;
                if (i6 > 0) {
                    i4 = gm.L(4.0f) + i6;
                } else {
                    i4 = 0;
                }
                int max = Math.max(i4, (int) (size - Math.min(gm.L(4.0f) + ((m0bVar.b() - 1) * size2), u0bVar.f3 * size2)));
                u0bVar.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i2);
                return;
            case 11:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), 1073741824));
                return;
            case 13:
                yfb yfbVar = (yfb) obj;
                if (yfbVar.I) {
                    i5 = (yfbVar.p0().getMeasuredHeight() + yfbVar.J) - gm.L(16.0f);
                } else {
                    int L2 = gm.L(140.0f) + yfbVar.J;
                    if (gm.L(24.0f) + yfbVar.E.getMeasuredHeight() > L2) {
                        i5 = gm.L(24.0f) + yfbVar.E.getMeasuredHeight();
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
            case 14:
                super.setAlpha(f);
                View view = ((sxb) this.b).fragmentView;
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
            case 6:
                super.setTranslationX(f);
                invalidate();
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    public xd9(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
