package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class m1 extends r0.b {
    public final int d = 0;
    public final Object e;

    public m1(n1 n1Var) {
        this.e = n1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: f2.m1.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z4;
        switch (this.d) {
            case 0:
                this.f43108a.onInitializeAccessibilityNodeInfo(view, dVar.f43969a);
                n1 n1Var = (n1) this.e;
                RecyclerView recyclerView = n1Var.d;
                RecyclerView recyclerView2 = n1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().U(view, dVar);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f43969a;
                this.f43108a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(m2.h.class.getName());
                m2.h hVar = (m2.h) this.e;
                m2.a aVar = hVar.e;
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
                n1 n1Var = (n1) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = n1Var.d;
                RecyclerView recyclerView2 = n1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    af.h hVar = recyclerView2.getLayoutManager().f5837b.f1233b;
                }
                return false;
            default:
                m2.h hVar2 = (m2.h) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && hVar2.canScrollHorizontally(-1)) {
                        hVar2.setCurrentItem(hVar2.f13719f - 1);
                        return true;
                    }
                } else if (hVar2.canScrollHorizontally(1)) {
                    hVar2.setCurrentItem(hVar2.f13719f + 1);
                    return true;
                }
                return false;
        }
    }

    public m1(m2.h hVar) {
        this.e = hVar;
    }
}
