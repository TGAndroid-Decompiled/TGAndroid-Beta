package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class u49 extends q4 {
    public final RecyclerView d;
    public final t49 e = new t49(this);

    public u49(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !e()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                t26 t26Var = (t26) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = t26Var.b;
                wg2 wg2Var = recyclerView2.b;
                if (accessibilityEvent != null) {
                    boolean z = true;
                    if (!recyclerView2.canScrollVertically(1) && !t26Var.b.canScrollVertically(-1) && !t26Var.b.canScrollHorizontally(-1) && !t26Var.b.canScrollHorizontally(1)) {
                        z = false;
                    }
                    accessibilityEvent.setScrollable(z);
                    w39 w39Var = t26Var.b.x;
                    if (w39Var != null) {
                        accessibilityEvent.setItemCount(w39Var.b());
                    }
                }
                if (t26Var.r() > 0) {
                    accessibilityEvent.setFromIndex(t26Var.K0());
                    accessibilityEvent.setToIndex(t26Var.M0());
                }
            }
        }
    }

    @Override
    public final void c(View view, u4 u4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, u4Var.a);
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                d49 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                layoutManager.R(recyclerView2.b, recyclerView2.v0, u4Var);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r3, int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u49.d(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.a0() && !recyclerView.v0.g) {
            return false;
        }
        return true;
    }
}
