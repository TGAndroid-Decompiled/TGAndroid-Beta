package kh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import i2.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.voip.v2;
public abstract class b extends ViewGroup {
    public int f13647a;
    public int f13648b;
    public final LinkedHashMap f13649c;

    public b(Context context) {
        super(context);
        this.f13649c = new LinkedHashMap(16);
    }

    public final void a(v2 v2Var) {
        addView(v2Var);
        this.f13649c.put(v2Var, new a(v2Var, new g0(this, 9)));
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        int min;
        int i10;
        boolean z13;
        e eVar;
        int measuredWidth;
        int i11;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth2 > measuredHeight) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (measuredWidth2 > 0 && measuredHeight > 0) {
            LinkedHashMap linkedHashMap = this.f13649c;
            int i12 = 0;
            for (a aVar : linkedHashMap.values()) {
                if (aVar.h) {
                    i12++;
                }
            }
            if (i12 == 0) {
                i12 = 1;
            }
            if (!z12) {
                int min2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (wh.B(50.0f, i12, measuredWidth2) / (i12 + 0.333f)), 0), measuredWidth2 / i12);
                min = AndroidUtilities.dp(76.0f);
                i10 = (measuredWidth2 - (i12 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (wh.B(50.0f, i12, measuredHeight) / (i12 + 0.333f)), 0), measuredHeight / i12);
                i10 = (measuredHeight - (i12 * min)) / 2;
            }
            int i13 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a aVar2 = (a) entry.getValue();
                boolean z14 = aVar2.h;
                v2 v2Var = aVar2.e;
                e eVar2 = aVar2.f13644b;
                le.b bVar = aVar2.f13645c;
                e eVar3 = aVar2.f13643a;
                if (z14) {
                    if (!z12) {
                        measuredWidth = ((measuredWidth2 - v2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i13) + i10;
                        i11 = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - v2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i11 = (min * i13) + i10;
                    }
                    if (!z11 && ((z10 || eVar3.f14139g) && bVar.f14131f)) {
                        eVar3.a(measuredWidth);
                    } else {
                        eVar3.c(measuredWidth);
                    }
                    if (!z11 && ((z10 || eVar2.f14139g) && bVar.f14131f)) {
                        eVar2.a(i11);
                    } else {
                        eVar2.c(i11);
                    }
                    i13++;
                }
                boolean z15 = aVar2.h;
                if (!z11 && (z10 || ((eVar = bVar.h) != null && eVar.f14139g))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar.a(z15, z13);
            }
            invalidate();
        }
    }

    public final void c(v2 v2Var, boolean z10, boolean z11) {
        a aVar = (a) this.f13649c.get(v2Var);
        if (aVar != null && aVar.h != z10) {
            aVar.h = z10;
            b(z11, false);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.f13647a == size && this.f13648b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.f13647a = size;
        this.f13648b = size2;
    }
}
