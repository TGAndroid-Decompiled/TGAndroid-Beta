package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class n1 extends r0.b {
    public final int d = 0;
    public final Object f5898e;

    public n1(o1 o1Var) {
        this.f5898e = o1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: f2.n1.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z4;
        switch (this.d) {
            case 0:
                this.f46401a.onInitializeAccessibilityNodeInfo(view, dVar.f46850a);
                o1 o1Var = (o1) this.f5898e;
                RecyclerView recyclerView = o1Var.d;
                RecyclerView recyclerView2 = o1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46850a;
                this.f46401a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(m2.h.class.getName());
                m2.h hVar = (m2.h) this.f5898e;
                m2.a aVar = hVar.f13444e;
                if (aVar != null && aVar.b() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                accessibilityNodeInfo.setScrollable(z4);
                if (hVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (hVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                o1 o1Var = (o1) this.f5898e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = o1Var.d;
                RecyclerView recyclerView2 = o1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    bf.f fVar = recyclerView2.getLayoutManager().f5941b.f1320b;
                }
                return false;
            default:
                m2.h hVar = (m2.h) this.f5898e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && hVar.canScrollHorizontally(-1)) {
                        hVar.setCurrentItem(hVar.f13446f - 1);
                        return true;
                    }
                } else if (hVar.canScrollHorizontally(1)) {
                    hVar.setCurrentItem(hVar.f13446f + 1);
                    return true;
                }
                return false;
        }
    }

    public n1(m2.h hVar) {
        this.f5898e = hVar;
    }
}
