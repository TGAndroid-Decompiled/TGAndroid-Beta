package f2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class o1 extends r0.b {
    public final RecyclerView d;
    public final n1 f5903e = new n1(this);

    public o1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                j0 j0Var = (j0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = j0Var.f5941b;
                bf.f fVar = recyclerView2.f1320b;
                if (accessibilityEvent != null) {
                    boolean z4 = true;
                    if (!recyclerView2.canScrollVertically(1) && !j0Var.f5941b.canScrollVertically(-1) && !j0Var.f5941b.canScrollHorizontally(-1) && !j0Var.f5941b.canScrollHorizontally(1)) {
                        z4 = false;
                    }
                    accessibilityEvent.setScrollable(z4);
                    p0 p0Var = j0Var.f5941b.f1347w;
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
    public final void c(View view, s0.d dVar) {
        this.f46432a.onInitializeAccessibilityNodeInfo(view, dVar.f46881a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            w0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f5941b;
            layoutManager.S(recyclerView2.f1320b, recyclerView2.f1339q0, dVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: f2.o1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
