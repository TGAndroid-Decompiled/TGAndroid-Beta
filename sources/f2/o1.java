package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class o1 extends r0.b {
    public final int d = 0;
    public final Object f6454e;

    public o1(p1 p1Var) {
        this.f6454e = p1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: f2.o1.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.c cVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                this.f46792a.onInitializeAccessibilityNodeInfo(view, cVar.f47482a);
                p1 p1Var = (p1) this.f6454e;
                RecyclerView recyclerView = p1Var.d;
                RecyclerView recyclerView2 = p1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, cVar);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47482a;
                this.f46792a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                cVar.i(m2.g.class.getName());
                m2.g gVar = (m2.g) this.f6454e;
                m2.a aVar = gVar.f16790e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (gVar.canScrollHorizontally(1)) {
                    cVar.a(4096);
                }
                if (gVar.canScrollHorizontally(-1)) {
                    cVar.a(8192);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                p1 p1Var = (p1) this.f6454e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = p1Var.d;
                RecyclerView recyclerView2 = p1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    d1 d1Var = recyclerView2.getLayoutManager().f6497b.f1829b;
                }
                return false;
            default:
                m2.g gVar = (m2.g) this.f6454e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && gVar.canScrollHorizontally(-1)) {
                        gVar.setCurrentItem(gVar.f16792f - 1);
                        return true;
                    }
                } else if (gVar.canScrollHorizontally(1)) {
                    gVar.setCurrentItem(gVar.f16792f + 1);
                    return true;
                }
                return false;
        }
    }

    public o1(m2.g gVar) {
        this.f6454e = gVar;
    }
}
