package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import l2.w;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.voip.n2;
import te.c;
public abstract class b extends ViewGroup {
    public int f20040a;
    public int f20041b;
    public final LinkedHashMap f20042c;

    public b(Context context) {
        super(context);
        this.f20042c = new LinkedHashMap(16);
    }

    public final void a(n2 n2Var) {
        addView(n2Var);
        this.f20042c.put(n2Var, new a(n2Var, new w(this, 10)));
    }

    public final void b(boolean z9, boolean z10) {
        boolean z11;
        int min;
        int i7;
        boolean z12;
        c cVar;
        int measuredWidth;
        int i10;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth2 > measuredHeight) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (measuredWidth2 > 0 && measuredHeight > 0) {
            LinkedHashMap linkedHashMap = this.f20042c;
            int i11 = 0;
            for (a aVar : linkedHashMap.values()) {
                if (aVar.h) {
                    i11++;
                }
            }
            if (i11 == 0) {
                i11 = 1;
            }
            if (!z11) {
                int min2 = Math.min(g0.L(50.0f) + Math.max((int) (q.A(50.0f, i11, measuredWidth2) / (i11 + 0.333f)), 0), measuredWidth2 / i11);
                min = g0.L(76.0f);
                i7 = (measuredWidth2 - (i11 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(g0.L(50.0f) + Math.max((int) (q.A(50.0f, i11, measuredHeight) / (i11 + 0.333f)), 0), measuredHeight / i11);
                i7 = (measuredHeight - (i11 * min)) / 2;
            }
            int i12 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a aVar2 = (a) entry.getValue();
                boolean z13 = aVar2.h;
                n2 n2Var = aVar2.f20038e;
                c cVar2 = aVar2.f20036b;
                te.a aVar3 = aVar2.f20037c;
                c cVar3 = aVar2.f20035a;
                if (z13) {
                    if (!z11) {
                        measuredWidth = ((measuredWidth2 - n2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i12) + i7;
                        i10 = getMeasuredHeight() - g0.L(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - n2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i10 = (min * i12) + i7;
                    }
                    if (!z10 && ((z9 || cVar3.h) && aVar3.f55395f)) {
                        cVar3.a(measuredWidth);
                    } else {
                        cVar3.c(measuredWidth);
                    }
                    if (!z10 && ((z9 || cVar2.h) && aVar3.f55395f)) {
                        cVar2.a(i10);
                    } else {
                        cVar2.c(i10);
                    }
                    i12++;
                }
                boolean z14 = aVar2.h;
                if (!z10 && (z9 || ((cVar = aVar3.h) != null && cVar.h))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                aVar3.a(z14, z12);
            }
            invalidate();
        }
    }

    public final void c(n2 n2Var, boolean z9, boolean z10) {
        a aVar = (a) this.f20042c.get(n2Var);
        if (aVar != null && aVar.h != z9) {
            aVar.h = z9;
            b(z10, false);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
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
        if (this.f20040a == size && this.f20041b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.f20040a = size;
        this.f20041b = size2;
    }
}
