package f2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class s1 extends r0.b {
    public final RecyclerView d;
    public final r1 f5527e = new r1(this);

    public s1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                m0 m0Var = (m0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = m0Var.f5563b;
                g1 g1Var = recyclerView2.f1339b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !m0Var.f5563b.canScrollVertically(-1) && !m0Var.f5563b.canScrollHorizontally(-1) && !m0Var.f5563b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    r0 r0Var = m0Var.f5563b.f1366w;
                    if (r0Var != null) {
                        accessibilityEvent.setItemCount(r0Var.h());
                    }
                }
                if (m0Var.r() > 0) {
                    accessibilityEvent.setFromIndex(m0Var.L0());
                    accessibilityEvent.setToIndex(m0Var.N0());
                }
            }
        }
    }

    @Override
    public final void c(View view, s0.d dVar) {
        this.f46878a.onInitializeAccessibilityNodeInfo(view, dVar.f47292a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            z0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f5563b;
            layoutManager.S(recyclerView2.f1339b, recyclerView2.f1357p0, dVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: f2.s1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
