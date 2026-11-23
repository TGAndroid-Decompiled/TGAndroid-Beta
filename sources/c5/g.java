package c5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import v4.g1;
import v4.x0;
public final class g extends r0.b {
    public final int d = 0;
    public final Object f4453e;

    public g(g1 g1Var) {
        this.f4453e = g1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: c5.g.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.c cVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56785a;
                this.f56261a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                cVar.i(l.class.getName());
                l lVar = (l) this.f4453e;
                a aVar = lVar.f4470e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (lVar.canScrollHorizontally(1)) {
                    cVar.a(4096);
                }
                if (lVar.canScrollHorizontally(-1)) {
                    cVar.a(8192);
                    return;
                }
                return;
            default:
                this.f56261a.onInitializeAccessibilityNodeInfo(view, cVar.f56785a);
                g1 g1Var = (g1) this.f4453e;
                boolean e10 = g1Var.e();
                RecyclerView recyclerView = g1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, cVar);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i7, Bundle bundle) {
        switch (this.d) {
            case 0:
                l lVar = (l) this.f4453e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                if (i7 != 4096) {
                    if (i7 == 8192 && lVar.canScrollHorizontally(-1)) {
                        lVar.setCurrentItem(lVar.f4472f - 1);
                        return true;
                    }
                } else if (lVar.canScrollHorizontally(1)) {
                    lVar.setCurrentItem(lVar.f4472f + 1);
                    return true;
                }
                return false;
            default:
                g1 g1Var = (g1) this.f4453e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                boolean e10 = g1Var.e();
                RecyclerView recyclerView = g1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    x0 x0Var = recyclerView.getLayoutManager().f59250b.f2810b;
                }
                return false;
        }
    }

    public g(l lVar) {
        this.f4453e = lVar;
    }
}
