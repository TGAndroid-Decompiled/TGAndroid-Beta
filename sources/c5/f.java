package c5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import v4.e1;
import v4.v0;
public final class f extends r0.b {
    public final int d = 0;
    public final Object f5317e;

    public f(e1 e1Var) {
        this.f5317e = e1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: c5.f.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z9;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54601a;
                this.f54162a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(k.class.getName());
                k kVar = (k) this.f5317e;
                a aVar = kVar.f5334e;
                if (aVar != null && aVar.b() > 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                accessibilityNodeInfo.setScrollable(z9);
                if (kVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (kVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    return;
                }
                return;
            default:
                this.f54162a.onInitializeAccessibilityNodeInfo(view, dVar.f54601a);
                e1 e1Var = (e1) this.f5317e;
                boolean e10 = e1Var.e();
                RecyclerView recyclerView = e1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, dVar);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i7, Bundle bundle) {
        switch (this.d) {
            case 0:
                k kVar = (k) this.f5317e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                if (i7 != 4096) {
                    if (i7 == 8192 && kVar.canScrollHorizontally(-1)) {
                        kVar.setCurrentItem(kVar.f5336f - 1);
                        return true;
                    }
                } else if (kVar.canScrollHorizontally(1)) {
                    kVar.setCurrentItem(kVar.f5336f + 1);
                    return true;
                }
                return false;
            default:
                e1 e1Var = (e1) this.f5317e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                boolean e10 = e1Var.e();
                RecyclerView recyclerView = e1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    v0 v0Var = recyclerView.getLayoutManager().f57132b.f2842b;
                }
                return false;
        }
    }

    public f(k kVar) {
        this.f5317e = kVar;
    }
}
