package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

public final class p1 extends r0.b {
    public final int d = 0;

    public final Object f5812e;

    public p1(q1 q1Var) {
        this.f5812e = q1Var;
    }

    @Override
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        m2.a aVar;
        switch (this.d) {
            case 1:
                m2.g gVar = (m2.g) this.f5812e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(m2.g.class.getName());
                m2.a aVar2 = gVar.f17568e;
                if (aVar2 != null) {
                    z10 = aVar2.b() > 1;
                }
                accessibilityEvent.setScrollable(z10);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = gVar.f17568e) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(gVar.f17570f);
                    accessibilityEvent.setToIndex(gVar.f17570f);
                    break;
                }
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override
    public final void c(View view, s0.c cVar) {
        switch (this.d) {
            case 0:
                this.f46568a.onInitializeAccessibilityNodeInfo(view, cVar.f47656a);
                q1 q1Var = (q1) this.f5812e;
                RecyclerView recyclerView = q1Var.d;
                RecyclerView recyclerView2 = q1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, cVar);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47656a;
                this.f46568a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                cVar.i(m2.g.class.getName());
                m2.g gVar = (m2.g) this.f5812e;
                m2.a aVar = gVar.f17568e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (gVar.canScrollHorizontally(1)) {
                    cVar.a(4096);
                }
                if (gVar.canScrollHorizontally(-1)) {
                    cVar.a(8192);
                }
                break;
        }
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                q1 q1Var = (q1) this.f5812e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = q1Var.d;
                RecyclerView recyclerView2 = q1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    e1 e1Var = recyclerView2.getLayoutManager().f5853b.f1835b;
                }
                return false;
            default:
                m2.g gVar = (m2.g) this.f5812e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && gVar.canScrollHorizontally(-1)) {
                        gVar.setCurrentItem(gVar.f17570f - 1);
                        return true;
                    }
                } else if (gVar.canScrollHorizontally(1)) {
                    gVar.setCurrentItem(gVar.f17570f + 1);
                    return true;
                }
                return false;
        }
    }

    public p1(m2.g gVar) {
        this.f5812e = gVar;
    }
}
