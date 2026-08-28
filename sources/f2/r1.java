package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class r1 extends r0.b {
    public final int d = 0;
    public final Object f5525e;

    public r1(s1 s1Var) {
        this.f5525e = s1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: f2.r1.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                this.f46878a.onInitializeAccessibilityNodeInfo(view, dVar.f47292a);
                s1 s1Var = (s1) this.f5525e;
                RecyclerView recyclerView = s1Var.d;
                RecyclerView recyclerView2 = s1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47292a;
                this.f46878a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(m2.g.class.getName());
                m2.g gVar = (m2.g) this.f5525e;
                m2.a aVar = gVar.f17192e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (gVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (gVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i9, Bundle bundle) {
        switch (this.d) {
            case 0:
                s1 s1Var = (s1) this.f5525e;
                if (super.d(view, i9, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = s1Var.d;
                RecyclerView recyclerView2 = s1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    g1 g1Var = recyclerView2.getLayoutManager().f5563b.f1339b;
                }
                return false;
            default:
                m2.g gVar = (m2.g) this.f5525e;
                if (super.d(view, i9, bundle)) {
                    return true;
                }
                if (i9 != 4096) {
                    if (i9 == 8192 && gVar.canScrollHorizontally(-1)) {
                        gVar.setCurrentItem(gVar.f17194f - 1);
                        return true;
                    }
                } else if (gVar.canScrollHorizontally(1)) {
                    gVar.setCurrentItem(gVar.f17194f + 1);
                    return true;
                }
                return false;
        }
    }

    public r1(m2.g gVar) {
        this.f5525e = gVar;
    }
}
