package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class w69 extends q4 {
    public final RecyclerView d;
    public final v69 e = new v69(this);

    public w69(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !e()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                u46 u46Var = (u46) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = u46Var.b;
                ki2 ki2Var = recyclerView2.b;
                if (accessibilityEvent != null) {
                    boolean z = true;
                    if (!recyclerView2.canScrollVertically(1) && !u46Var.b.canScrollVertically(-1) && !u46Var.b.canScrollHorizontally(-1) && !u46Var.b.canScrollHorizontally(1)) {
                        z = false;
                    }
                    accessibilityEvent.setScrollable(z);
                    y59 y59Var = u46Var.b.x;
                    if (y59Var != null) {
                        accessibilityEvent.setItemCount(y59Var.b());
                    }
                }
                if (u46Var.r() > 0) {
                    accessibilityEvent.setFromIndex(u46Var.K0());
                    accessibilityEvent.setToIndex(u46Var.M0());
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
                f69 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                layoutManager.R(recyclerView2.b, recyclerView2.v0, u4Var);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r3, int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w69.d(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.a0() && !recyclerView.v0.g) {
            return false;
        }
        return true;
    }
}
