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
public final class zwb extends ela {
    public boolean m0;
    public final Paint n0;
    public final sxb o0;

    public zwb(sxb sxbVar, Context context) {
        super(context, null);
        this.o0 = sxbVar;
        setWillNotDraw(false);
        this.n0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT >= 29 && gda.f()) {
            sxb sxbVar = this.o0;
            if (sxbVar.j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f);
                sxbVar.j1.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
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
            sxb sxbVar = this.o0;
            if (i < sxbVar.O.getChildCount()) {
                View childAt = sxbVar.O.getChildAt(i);
                if (childAt.getY() < gm.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + sxbVar.O.getX(), childAt.getY() + sxbVar.O.getY() + getY());
                    if (arrayList != null && (childAt instanceof bla)) {
                        arrayList.add((bla) childAt);
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
        sxb sxbVar = this.o0;
        nz4 nz4Var = sxbVar.k1;
        nz4 nz4Var2 = sxbVar.j1;
        mr3 mr3Var = sxbVar.i1;
        if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
            sxbVar.y0();
            nk3 nk3Var = sxbVar.N0;
            if (nk3Var != null) {
                measuredWidth = nk3Var.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            nk3 nk3Var2 = sxbVar.N0;
            if (nk3Var2 != null) {
                measuredHeight = nk3Var2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (nz4Var2 != null && !nz4Var2.r && nz4Var2.k(measuredWidth, measuredHeight)) {
                mr3Var.b(nz4Var2.i(measuredWidth, measuredHeight), -3);
                nz4Var2.j();
            }
            if (nz4Var != null && !nz4Var.r && nz4Var.k(measuredWidth, measuredHeight)) {
                mr3Var.b(nz4Var.i(measuredWidth, measuredHeight), -2);
                nz4Var.j();
            }
        }
        super.dispatchDraw(canvas);
        if (sxbVar.isInPreviewMode()) {
            int themedColor = sxbVar.getThemedColor(cmb.c6);
            Paint paint = this.n0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (sxbVar.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), gm.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), cmb.j0);
        } else {
            canvas2 = canvas;
        }
        if (sxbVar.N0 == null) {
            gm.O(canvas2, this, sxbVar.getThemedColor(cmb.c6), sxbVar.h1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        a aVar3;
        float f;
        sxb sxbVar = this.o0;
        aVar = ((d) sxbVar).actionBar;
        if (view == aVar && !sxbVar.isInPreviewMode()) {
            aVar2 = ((d) sxbVar).actionBar;
            float y = aVar2.getY();
            aVar3 = ((d) sxbVar).actionBar;
            float height = aVar3.getHeight();
            vgc vgcVar = sxbVar.b1;
            if (vgcVar != null && vgcVar.getVisibility() != 8) {
                f = sxbVar.b1.getMeasuredHeight();
            } else {
                f = 0.0f;
            }
            int i = (int) (y + ((int) ((f * sxbVar.X) + height)));
            ((ActionBarLayout) sxbVar.getParentLayout()).n(canvas, (int) ((1.0f - sxbVar.X) * 255.0f), i);
            float f2 = sxbVar.X;
            if (f2 > 0.0f) {
                if (f2 < 1.0f) {
                    int alpha = cmb.j0.getAlpha();
                    cmb.j0.setAlpha((int) (alpha * sxbVar.X));
                    float f3 = i;
                    canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, cmb.j0);
                    cmb.j0.setAlpha(alpha);
                } else {
                    float f4 = i;
                    canvas.drawLine(0.0f, f4, getMeasuredWidth(), f4, cmb.j0);
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwb.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        sxb sxbVar = this.o0;
        ct8 ct8Var = sxbVar.p0;
        if (ct8Var != null) {
            this.m0 = true;
            ViewGroup.LayoutParams layoutParams = ct8Var.getLayoutParams();
            int L = gm.L(51.0f);
            int i4 = sxbVar.h1;
            layoutParams.height = L + i4;
            sxbVar.p0.setPadding(0, 0, 0, i4);
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
