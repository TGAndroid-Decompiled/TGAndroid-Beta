package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class yub extends cja {
    public boolean m0;
    public final Paint n0;
    public final qvb o0;

    public yub(qvb qvbVar, Context context) {
        super(context, null);
        this.o0 = qvbVar;
        setWillNotDraw(false);
        this.n0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT >= 29 && gba.f()) {
            qvb qvbVar = this.o0;
            if (qvbVar.j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f);
                qvbVar.j1.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i = 0;
        while (true) {
            qvb qvbVar = this.o0;
            if (i < qvbVar.O.getChildCount()) {
                View childAt = qvbVar.O.getChildAt(i);
                if (childAt.getY() < gl.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + qvbVar.O.getX(), childAt.getY() + qvbVar.O.getY() + getY());
                    if (arrayList != null && (childAt instanceof zia)) {
                        arrayList.add((zia) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int measuredWidth;
        int measuredHeight;
        qvb qvbVar = this.o0;
        lx4 lx4Var = qvbVar.k1;
        lx4 lx4Var2 = qvbVar.j1;
        cq3 cq3Var = qvbVar.i1;
        if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
            qvbVar.x0();
            cj3 cj3Var = qvbVar.N0;
            if (cj3Var != null) {
                measuredWidth = cj3Var.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            cj3 cj3Var2 = qvbVar.N0;
            if (cj3Var2 != null) {
                measuredHeight = cj3Var2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (lx4Var2 != null && !lx4Var2.r && lx4Var2.k(measuredWidth, measuredHeight)) {
                cq3Var.b(lx4Var2.i(measuredWidth, measuredHeight), -3);
                lx4Var2.j();
            }
            if (lx4Var != null && !lx4Var.r && lx4Var.k(measuredWidth, measuredHeight)) {
                cq3Var.b(lx4Var.i(measuredWidth, measuredHeight), -2);
                lx4Var.j();
            }
        }
        super.dispatchDraw(canvas);
        if (qvbVar.isInPreviewMode()) {
            int themedColor = qvbVar.getThemedColor(bkb.c6);
            Paint paint = this.n0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (qvbVar.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), gl.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), bkb.j0);
        } else {
            canvas2 = canvas;
        }
        if (qvbVar.N0 == null) {
            gl.O(canvas2, this, qvbVar.getThemedColor(bkb.c6), qvbVar.h1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        a aVar3;
        float f;
        qvb qvbVar = this.o0;
        aVar = ((d) qvbVar).actionBar;
        if (view == aVar && !qvbVar.isInPreviewMode()) {
            aVar2 = ((d) qvbVar).actionBar;
            float y = aVar2.getY();
            aVar3 = ((d) qvbVar).actionBar;
            float height = aVar3.getHeight();
            vec vecVar = qvbVar.b1;
            if (vecVar != null && vecVar.getVisibility() != 8) {
                f = qvbVar.b1.getMeasuredHeight();
            } else {
                f = 0.0f;
            }
            int i = (int) (y + ((int) ((f * qvbVar.X) + height)));
            ((ActionBarLayout) qvbVar.getParentLayout()).n(canvas, (int) ((1.0f - qvbVar.X) * 255.0f), i);
            float f2 = qvbVar.X;
            if (f2 > 0.0f) {
                if (f2 < 1.0f) {
                    int alpha = bkb.j0.getAlpha();
                    bkb.j0.setAlpha((int) (alpha * qvbVar.X));
                    float f3 = i;
                    canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, bkb.j0);
                    bkb.j0.setAlpha(alpha);
                } else {
                    float f4 = i;
                    canvas.drawLine(0.0f, f4, getMeasuredWidth(), f4, bkb.j0);
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yub.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        qvb qvbVar = this.o0;
        ar8 ar8Var = qvbVar.p0;
        if (ar8Var != null) {
            this.m0 = true;
            ViewGroup.LayoutParams layoutParams = ar8Var.getLayoutParams();
            int L = gl.L(51.0f);
            int i4 = qvbVar.h1;
            layoutParams.height = L + i4;
            qvbVar.p0.setPadding(0, 0, 0, i4);
            this.m0 = false;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt instanceof a) {
                childAt.measure(i, 0);
                i5 = childAt.getMeasuredHeight();
            }
        }
        int i7 = 0;
        while (i7 < getChildCount()) {
            View childAt2 = getChildAt(i7);
            if (!(childAt2 instanceof a)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i, 0, i2, 0);
                } else {
                    i3 = i5;
                    measureChildWithMargins(childAt2, i, 0, i2, i3);
                    i7++;
                    i5 = i3;
                }
            }
            i3 = i5;
            i7++;
            i5 = i3;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
