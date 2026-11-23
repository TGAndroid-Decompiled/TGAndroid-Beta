package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kg.i0;
import org.telegram.messenger.g0;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.voip.r2;
import te.c;
public abstract class b extends ViewGroup {
    public int f21094a;
    public int f21095b;
    public final LinkedHashMap f21096c;

    public b(Context context) {
        super(context);
        this.f21096c = new LinkedHashMap(16);
    }

    public final void a(r2 r2Var) {
        addView(r2Var);
        this.f21096c.put(r2Var, new a(r2Var, new i0(this, 20)));
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
            LinkedHashMap linkedHashMap = this.f21096c;
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
                int min2 = Math.min(g0.L(50.0f) + Math.max((int) (m10.B(50.0f, i11, measuredWidth2) / (i11 + 0.333f)), 0), measuredWidth2 / i11);
                min = g0.L(76.0f);
                i7 = (measuredWidth2 - (i11 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(g0.L(50.0f) + Math.max((int) (m10.B(50.0f, i11, measuredHeight) / (i11 + 0.333f)), 0), measuredHeight / i11);
                i7 = (measuredHeight - (i11 * min)) / 2;
            }
            int i12 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a aVar2 = (a) entry.getValue();
                boolean z14 = aVar2.h;
                r2 r2Var = aVar2.f21092e;
                c cVar2 = aVar2.f21090b;
                te.a aVar3 = aVar2.f21091c;
                c cVar3 = aVar2.f21089a;
                if (z14) {
                    if (!z12) {
                        measuredWidth = ((measuredWidth2 - r2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i12) + i7;
                        i10 = getMeasuredHeight() - g0.L(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - r2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i10 = (min * i12) + i7;
                    }
                    if (!z11 && ((z10 || cVar3.h) && aVar3.f57780f)) {
                        cVar3.a(measuredWidth);
                    } else {
                        cVar3.c(measuredWidth);
                    }
                    if (!z11 && ((z10 || cVar2.h) && aVar3.f57780f)) {
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

    public final void c(r2 r2Var, boolean z10, boolean z11) {
        a aVar = (a) this.f21096c.get(r2Var);
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
        if (this.f21094a == size && this.f21095b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.f21094a = size;
        this.f21095b = size2;
    }
}
