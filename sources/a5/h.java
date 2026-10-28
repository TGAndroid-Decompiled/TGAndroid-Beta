package a5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import s4.f1;
public final class h extends r0.b {
    public final int d = 0;
    public final Object e;

    public h(f1 f1Var) {
        this.e = f1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: a5.h.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47688a;
                this.f47111a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(m.class.getName());
                m mVar = (m) this.e;
                a aVar = mVar.e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (mVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (mVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    return;
                }
                return;
            default:
                this.f47111a.onInitializeAccessibilityNodeInfo(view, dVar.f47688a);
                f1 f1Var = (f1) this.e;
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                m mVar = (m) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && mVar.canScrollHorizontally(-1)) {
                        mVar.setCurrentItem(mVar.f309f - 1);
                        return true;
                    }
                } else if (mVar.canScrollHorizontally(1)) {
                    mVar.setCurrentItem(mVar.f309f + 1);
                    return true;
                }
                return false;
            default:
                f1 f1Var = (f1) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    rf.e eVar = recyclerView2.getLayoutManager().f47854b.f3056b;
                }
                return false;
        }
    }

    public h(m mVar) {
        this.e = mVar;
    }
}
