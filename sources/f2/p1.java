package f2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class p1 extends r0.b {
    public final RecyclerView d;
    public final o1 f6461e = new o1(this);

    public p1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                j0 j0Var = (j0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = j0Var.f6497b;
                d1 d1Var = recyclerView2.f1829b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !j0Var.f6497b.canScrollVertically(-1) && !j0Var.f6497b.canScrollHorizontally(-1) && !j0Var.f6497b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    p0 p0Var = j0Var.f6497b.f1856w;
                    if (p0Var != null) {
                        accessibilityEvent.setItemCount(p0Var.h());
                    }
                }
                if (j0Var.r() > 0) {
                    accessibilityEvent.setFromIndex(j0Var.L0());
                    accessibilityEvent.setToIndex(j0Var.N0());
                }
            }
        }
    }

    @Override
    public final void c(View view, s0.c cVar) {
        this.f46792a.onInitializeAccessibilityNodeInfo(view, cVar.f47482a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            w0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f6497b;
            layoutManager.S(recyclerView2.f1829b, recyclerView2.f1847p0, cVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: f2.p1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
