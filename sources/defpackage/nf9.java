package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.CheckBoxBase;
public final class nf9 extends View {
    public final byte a;
    public final Object b;

    public nf9(Context context, vnb vnbVar) {
        super(context);
        this.a = (byte) 1;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, vnbVar, this);
        this.b = checkBoxBase;
        checkBoxBase.h(aob.Yl, aob.z5, aob.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(hl.L(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 12:
                canvas.save();
                sbb sbbVar = (sbb) this.b;
                canvas.translate(sbbVar.d1.getX() + sbbVar.m0.getX(), sbbVar.d1.getY() + sbbVar.m0.getY());
                ibb ibbVar = sbbVar.d1;
                ibbVar.k(canvas, ibbVar.getBounds(), sbbVar.d1.getOver2Alpha());
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
                kea keaVar = (kea) this.b;
                rl0 rl0Var = keaVar.Q2;
                rl0Var.setBounds(0, (getMeasuredHeight() - keaVar.B2.d) - hl.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                rl0Var.draw(canvas);
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
                ((wma) this.b).S();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf9.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                c0a c0aVar = (c0a) this.b;
                int[] iArr = c0aVar.H;
                getLocationOnScreen(iArr);
                Rect rect = c0aVar.d;
                int i5 = iArr[0];
                rect.set(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1]);
                hl.V1(c0aVar.c, rect, c0aVar.J, c0aVar.e);
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
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(24.0f));
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((hea) obj).L.E1.R, 1073741824));
                return;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((wka) obj).getMeasuredHeight());
                return;
            case 9:
                nza nzaVar = (nza) obj;
                if (nzaVar.I) {
                    i3 = (nzaVar.o0().getMeasuredHeight() + nzaVar.J) - hl.L(16.0f);
                } else {
                    int L = hl.L(140.0f) + nzaVar.J;
                    if (hl.L(24.0f) + nzaVar.E.getMeasuredHeight() > L) {
                        i3 = hl.L(24.0f) + nzaVar.E.getMeasuredHeight();
                    } else {
                        i3 = L;
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i3 - 0.0f), 1073741824));
                return;
            case 10:
                l2b l2bVar = (l2b) obj;
                t2b t2bVar = l2bVar.d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i2) - hl.L(4.0f);
                int i6 = t2bVar.o3;
                if (i6 > 0) {
                    i4 = hl.L(4.0f) + i6;
                } else {
                    i4 = 0;
                }
                int max = Math.max(i4, (int) (size - Math.min(hl.L(4.0f) + ((l2bVar.b() - 1) * size2), t2bVar.f3 * size2)));
                t2bVar.n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i2);
                return;
            case 11:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824));
                return;
            case 13:
                thb thbVar = (thb) obj;
                if (thbVar.I) {
                    i5 = (thbVar.o0().getMeasuredHeight() + thbVar.J) - hl.L(16.0f);
                } else {
                    int L2 = hl.L(140.0f) + thbVar.J;
                    if (hl.L(24.0f) + thbVar.E.getMeasuredHeight() > L2) {
                        i5 = hl.L(24.0f) + thbVar.E.getMeasuredHeight();
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
                View view = ((tzb) this.b).fragmentView;
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

    public nf9(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
