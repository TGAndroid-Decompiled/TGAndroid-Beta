package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class h89 extends r4 {
    public final RecyclerView d;
    public final g89 e = new g89(this);

    public h89(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !e()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                x46 x46Var = (x46) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = x46Var.b;
                oh2 oh2Var = recyclerView2.b;
                if (accessibilityEvent != null) {
                    boolean z = true;
                    if (!recyclerView2.canScrollVertically(1) && !x46Var.b.canScrollVertically(-1) && !x46Var.b.canScrollHorizontally(-1) && !x46Var.b.canScrollHorizontally(1)) {
                        z = false;
                    }
                    accessibilityEvent.setScrollable(z);
                    j79 j79Var = x46Var.b.x;
                    if (j79Var != null) {
                        accessibilityEvent.setItemCount(j79Var.b());
                    }
                }
                if (x46Var.r() > 0) {
                    accessibilityEvent.setFromIndex(x46Var.K0());
                    accessibilityEvent.setToIndex(x46Var.M0());
                }
            }
        }
    }

    @Override
    public final void c(View view, v4 v4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, v4Var.a);
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                q79 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                layoutManager.R(recyclerView2.b, recyclerView2.v0, v4Var);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r3, int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h89.d(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.b0() && !recyclerView.v0.g) {
            return false;
        }
        return true;
    }
}
