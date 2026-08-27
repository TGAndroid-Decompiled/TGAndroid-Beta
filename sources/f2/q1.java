package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class q1 extends r0.b {
    public final RecyclerView d;

    public final p1 f5816e = new p1(this);

    public q1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.Z()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            k0 k0Var = (k0) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = k0Var.f5853b;
            e1 e1Var = recyclerView2.f1835b;
            if (accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView2.canScrollVertically(1) && !k0Var.f5853b.canScrollVertically(-1) && !k0Var.f5853b.canScrollHorizontally(-1) && !k0Var.f5853b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                q0 q0Var = k0Var.f5853b.f1862w;
                if (q0Var != null) {
                    accessibilityEvent.setItemCount(q0Var.h());
                }
            }
            if (k0Var.r() > 0) {
                accessibilityEvent.setFromIndex(k0Var.L0());
                accessibilityEvent.setToIndex(k0Var.N0());
            }
        }
    }

    @Override
    public final void c(View view, s0.c cVar) {
        this.f46568a.onInitializeAccessibilityNodeInfo(view, cVar.f47656a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.Z() || recyclerView.getLayoutManager() == null) {
            return;
        }
        x0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f5853b;
        layoutManager.S(recyclerView2.f1835b, recyclerView2.f1853p0, cVar);
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        int iF;
        int iD;
        if (super.d(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            x0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f5853b;
            e1 e1Var = recyclerView2.f1835b;
            if (i10 == 4096) {
                iF = recyclerView2.canScrollVertically(1) ? (layoutManager.f5863n - layoutManager.F()) - layoutManager.C() : 0;
                if (layoutManager.f5853b.canScrollHorizontally(1)) {
                    iD = (layoutManager.f5862m - layoutManager.D()) - layoutManager.E();
                } else {
                    iD = 0;
                }
            } else if (i10 != 8192) {
                iD = 0;
                iF = 0;
            } else {
                iF = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f5863n - layoutManager.F()) - layoutManager.C()) : 0;
                if (layoutManager.f5853b.canScrollHorizontally(-1)) {
                    iD = -((layoutManager.f5862m - layoutManager.D()) - layoutManager.E());
                } else {
                    iD = 0;
                }
            }
            if (iF != 0 || iD != 0) {
                layoutManager.f5853b.v0(iD, iF, null);
                return true;
            }
        }
        return false;
    }
}
