package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.ui.LaunchActivity;
public abstract class i95 extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public i95(LaunchActivity launchActivity) {
        super(launchActivity);
        this.c = new LinkedHashMap(16);
    }

    public final void a(dkc dkcVar) {
        addView(dkcVar);
        this.c.put(dkcVar, new h95(dkcVar, new qn4(this, (byte) 21)));
    }

    public final void b(boolean z, boolean z2) {
        boolean z3;
        int min;
        int i;
        boolean z4;
        h94 h94Var;
        int measuredWidth;
        int i2;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth2 > measuredHeight) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (measuredWidth2 > 0 && measuredHeight > 0) {
            LinkedHashMap linkedHashMap = this.c;
            int i3 = 0;
            for (h95 h95Var : linkedHashMap.values()) {
                if (h95Var.h) {
                    i3++;
                }
            }
            if (i3 == 0) {
                i3 = 1;
            }
            if (!z3) {
                int min2 = Math.min(gm.L(50.0f) + Math.max((int) ((measuredWidth2 - (gm.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredWidth2 / i3);
                min = gm.L(76.0f);
                i = (measuredWidth2 - (i3 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(gm.L(50.0f) + Math.max((int) ((measuredHeight - (gm.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredHeight / i3);
                i = (measuredHeight - (i3 * min)) / 2;
            }
            int i4 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                h95 h95Var2 = (h95) entry.getValue();
                boolean z5 = h95Var2.h;
                dkc dkcVar = h95Var2.e;
                h94 h94Var2 = h95Var2.b;
                fn0 fn0Var = h95Var2.c;
                h94 h94Var3 = h95Var2.a;
                if (z5) {
                    if (!z3) {
                        measuredWidth = ((measuredWidth2 - dkcVar.getMeasuredWidth()) / 2) + (measuredWidth2 * i4) + i;
                        i2 = getMeasuredHeight() - gm.L(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - dkcVar.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i2 = (min * i4) + i;
                    }
                    if (!z2 && ((z || h94Var3.h) && fn0Var.f)) {
                        h94Var3.a(measuredWidth);
                    } else {
                        h94Var3.c(measuredWidth);
                    }
                    if (!z2 && ((z || h94Var2.h) && fn0Var.f)) {
                        h94Var2.a(i2);
                    } else {
                        h94Var2.c(i2);
                    }
                    i4++;
                }
                boolean z6 = h95Var2.h;
                if (!z2 && (z || ((h94Var = fn0Var.h) != null && h94Var.h))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                fn0Var.a(z6, z4);
            }
            invalidate();
        }
    }

    public final void c(dkc dkcVar, boolean z, boolean z2) {
        h95 h95Var = (h95) this.c.get(dkcVar);
        if (h95Var != null && h95Var.h != z) {
            h95Var.h = z;
            b(z2, false);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.a == size && this.b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.a = size;
        this.b = size2;
    }
}
