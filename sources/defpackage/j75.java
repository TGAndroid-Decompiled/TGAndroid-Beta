package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.ui.LaunchActivity;
public abstract class j75 extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public j75(LaunchActivity launchActivity) {
        super(launchActivity);
        this.c = new LinkedHashMap(16);
    }

    public final void a(dic dicVar) {
        addView(dicVar);
        this.c.put(dicVar, new i75(dicVar, new iu4(this, (byte) 14)));
    }

    public final void b(boolean z, boolean z2) {
        boolean z3;
        int min;
        int i;
        boolean z4;
        y74 y74Var;
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
            for (i75 i75Var : linkedHashMap.values()) {
                if (i75Var.h) {
                    i3++;
                }
            }
            if (i3 == 0) {
                i3 = 1;
            }
            if (!z3) {
                int min2 = Math.min(gl.L(50.0f) + Math.max((int) ((measuredWidth2 - (gl.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredWidth2 / i3);
                min = gl.L(76.0f);
                i = (measuredWidth2 - (i3 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(gl.L(50.0f) + Math.max((int) ((measuredHeight - (gl.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredHeight / i3);
                i = (measuredHeight - (i3 * min)) / 2;
            }
            int i4 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                i75 i75Var2 = (i75) entry.getValue();
                boolean z5 = i75Var2.h;
                dic dicVar = i75Var2.e;
                y74 y74Var2 = i75Var2.b;
                fm0 fm0Var = i75Var2.c;
                y74 y74Var3 = i75Var2.a;
                if (z5) {
                    if (!z3) {
                        measuredWidth = ((measuredWidth2 - dicVar.getMeasuredWidth()) / 2) + (measuredWidth2 * i4) + i;
                        i2 = getMeasuredHeight() - gl.L(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - dicVar.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i2 = (min * i4) + i;
                    }
                    if (!z2 && ((z || y74Var3.h) && fm0Var.f)) {
                        y74Var3.a(measuredWidth);
                    } else {
                        y74Var3.c(measuredWidth);
                    }
                    if (!z2 && ((z || y74Var2.h) && fm0Var.f)) {
                        y74Var2.a(i2);
                    } else {
                        y74Var2.c(i2);
                    }
                    i4++;
                }
                boolean z6 = i75Var2.h;
                if (!z2 && (z || ((y74Var = fm0Var.h) != null && y74Var.h))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                fm0Var.a(z6, z4);
            }
            invalidate();
        }
    }

    public final void c(dic dicVar, boolean z, boolean z2) {
        i75 i75Var = (i75) this.c.get(dicVar);
        if (i75Var != null && i75Var.h != z) {
            i75Var.h = z;
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), 1073741824);
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
