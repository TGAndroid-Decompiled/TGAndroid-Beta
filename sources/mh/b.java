package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kg.i0;
import org.telegram.messenger.g0;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.voip.q2;
import te.c;
public abstract class b extends ViewGroup {
    public int f21032a;
    public int f21033b;
    public final LinkedHashMap f21034c;

    public b(Context context) {
        super(context);
        this.f21034c = new LinkedHashMap(16);
    }

    public final void a(q2 q2Var) {
        addView(q2Var);
        this.f21034c.put(q2Var, new a(q2Var, new i0(this, 20)));
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        int min;
        int i7;
        boolean z13;
        c cVar;
        int measuredWidth;
        int i10;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth2 > measuredHeight) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (measuredWidth2 > 0 && measuredHeight > 0) {
            LinkedHashMap linkedHashMap = this.f21034c;
            int i11 = 0;
            for (a aVar : linkedHashMap.values()) {
                if (aVar.h) {
                    i11++;
                }
            }
            if (i11 == 0) {
                i11 = 1;
            }
            if (!z12) {
                int min2 = Math.min(g0.L(50.0f) + Math.max((int) (o10.B(50.0f, i11, measuredWidth2) / (i11 + 0.333f)), 0), measuredWidth2 / i11);
                min = g0.L(76.0f);
                i7 = (measuredWidth2 - (i11 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(g0.L(50.0f) + Math.max((int) (o10.B(50.0f, i11, measuredHeight) / (i11 + 0.333f)), 0), measuredHeight / i11);
                i7 = (measuredHeight - (i11 * min)) / 2;
            }
            int i12 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a aVar2 = (a) entry.getValue();
                boolean z14 = aVar2.h;
                q2 q2Var = aVar2.f21030e;
                c cVar2 = aVar2.f21028b;
                te.a aVar3 = aVar2.f21029c;
                c cVar3 = aVar2.f21027a;
                if (z14) {
                    if (!z12) {
                        measuredWidth = ((measuredWidth2 - q2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i12) + i7;
                        i10 = getMeasuredHeight() - g0.L(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - q2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i10 = (min * i12) + i7;
                    }
                    if (!z11 && ((z10 || cVar3.h) && aVar3.f57701f)) {
                        cVar3.a(measuredWidth);
                    } else {
                        cVar3.c(measuredWidth);
                    }
                    if (!z11 && ((z10 || cVar2.h) && aVar3.f57701f)) {
                        cVar2.a(i10);
                    } else {
                        cVar2.c(i10);
                    }
                    i12++;
                }
                boolean z15 = aVar2.h;
                if (!z11 && (z10 || ((cVar = aVar3.h) != null && cVar.h))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                aVar3.a(z15, z13);
            }
            invalidate();
        }
    }

    public final void c(q2 q2Var, boolean z10, boolean z11) {
        a aVar = (a) this.f21034c.get(q2Var);
        if (aVar != null && aVar.h != z10) {
            aVar.h = z10;
            b(z11, false);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(g0.L(76.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0.L(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.f21032a == size && this.f21033b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.f21032a = size;
        this.f21033b = size2;
    }
}
