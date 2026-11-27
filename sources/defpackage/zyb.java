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
import org.telegram.ui.ActionBar.e;
public final class zyb extends wma {
    public boolean g0;
    public final Paint h0;
    public final tzb i0;

    public zyb(tzb tzbVar, Context context) {
        super(context, null);
        this.i0 = tzbVar;
        setWillNotDraw(false);
        this.h0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT >= 29 && xea.f()) {
            tzb tzbVar = this.i0;
            if (tzbVar.j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f);
                tzbVar.j1.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
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
            tzb tzbVar = this.i0;
            if (i < tzbVar.O.getChildCount()) {
                View childAt = tzbVar.O.getChildAt(i);
                if (childAt.getY() < hl.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + tzbVar.O.getX(), childAt.getY() + tzbVar.O.getY() + getY());
                    if (arrayList != null && (childAt instanceof tma)) {
                        arrayList.add((tma) childAt);
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
        tzb tzbVar = this.i0;
        rz4 rz4Var = tzbVar.k1;
        rz4 rz4Var2 = tzbVar.j1;
        tq3 tq3Var = tzbVar.i1;
        if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
            tzbVar.y0();
            uj3 uj3Var = tzbVar.N0;
            if (uj3Var != null) {
                measuredWidth = uj3Var.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            uj3 uj3Var2 = tzbVar.N0;
            if (uj3Var2 != null) {
                measuredHeight = uj3Var2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (rz4Var2 != null && !rz4Var2.r && rz4Var2.k(measuredWidth, measuredHeight)) {
                tq3Var.b(rz4Var2.i(measuredWidth, measuredHeight), -3);
                rz4Var2.j();
            }
            if (rz4Var != null && !rz4Var.r && rz4Var.k(measuredWidth, measuredHeight)) {
                tq3Var.b(rz4Var.i(measuredWidth, measuredHeight), -2);
                rz4Var.j();
            }
        }
        super.dispatchDraw(canvas);
        if (tzbVar.isInPreviewMode()) {
            int themedColor = tzbVar.getThemedColor(aob.d6);
            Paint paint = this.h0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (tzbVar.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), hl.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), aob.j0);
        } else {
            canvas2 = canvas;
        }
        if (tzbVar.N0 == null) {
            hl.O(canvas2, this, tzbVar.getThemedColor(aob.d6), tzbVar.h1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        a aVar3;
        float f;
        tzb tzbVar = this.i0;
        aVar = ((e) tzbVar).actionBar;
        if (view == aVar && !tzbVar.isInPreviewMode()) {
            aVar2 = ((e) tzbVar).actionBar;
            float y = aVar2.getY();
            aVar3 = ((e) tzbVar).actionBar;
            float height = aVar3.getHeight();
            uic uicVar = tzbVar.b1;
            if (uicVar != null && uicVar.getVisibility() != 8) {
                f = tzbVar.b1.getMeasuredHeight();
            } else {
                f = 0.0f;
            }
            int i = (int) (y + ((int) ((f * tzbVar.X) + height)));
            ((ActionBarLayout) tzbVar.getParentLayout()).n(canvas, (int) ((1.0f - tzbVar.X) * 255.0f), i);
            float f2 = tzbVar.X;
            if (f2 > 0.0f) {
                if (f2 < 1.0f) {
                    int alpha = aob.j0.getAlpha();
                    aob.j0.setAlpha((int) (alpha * tzbVar.X));
                    float f3 = i;
                    canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, aob.j0);
                    aob.j0.setAlpha(alpha);
                } else {
                    float f4 = i;
                    canvas.drawLine(0.0f, f4, getMeasuredWidth(), f4, aob.j0);
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zyb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        tzb tzbVar = this.i0;
        ir8 ir8Var = tzbVar.p0;
        if (ir8Var != null) {
            this.g0 = true;
            ViewGroup.LayoutParams layoutParams = ir8Var.getLayoutParams();
            int L = hl.L(51.0f);
            int i4 = tzbVar.h1;
            layoutParams.height = L + i4;
            tzbVar.p0.setPadding(0, 0, 0, i4);
            this.g0 = false;
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
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}
