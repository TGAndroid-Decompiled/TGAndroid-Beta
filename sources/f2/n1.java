package f2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class n1 extends r0.b {
    public final RecyclerView d;
    public final m1 e = new m1(this);

    public n1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                i0 i0Var = (i0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = i0Var.f5837b;
                af.h hVar = recyclerView2.f1233b;
                if (accessibilityEvent != null) {
                    boolean z4 = true;
                    if (!recyclerView2.canScrollVertically(1) && !i0Var.f5837b.canScrollVertically(-1) && !i0Var.f5837b.canScrollHorizontally(-1) && !i0Var.f5837b.canScrollHorizontally(1)) {
                        z4 = false;
                    }
                    accessibilityEvent.setScrollable(z4);
                    o0 o0Var = i0Var.f5837b.f1259w;
                    if (o0Var != null) {
                        accessibilityEvent.setItemCount(o0Var.h());
                    }
                }
                if (i0Var.r() > 0) {
                    accessibilityEvent.setFromIndex(i0Var.L0());
                    accessibilityEvent.setToIndex(i0Var.N0());
                }
            }
        }
    }

    @Override
    public final void c(View view, s0.d dVar) {
        this.f43108a.onInitializeAccessibilityNodeInfo(view, dVar.f43969a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            v0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f5837b;
            layoutManager.S(recyclerView2.f1233b, recyclerView2.f1251q0, dVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: f2.n1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
