package b5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import u4.e1;
public final class g extends r0.b {
    public final int d = 0;
    public final Object f2405e;

    public g(e1 e1Var) {
        this.f2405e = e1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: b5.g.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f54570a;
                this.f53986a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(l.class.getName());
                l lVar = (l) this.f2405e;
                a aVar = lVar.f2422e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (lVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (lVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    return;
                }
                return;
            default:
                this.f53986a.onInitializeAccessibilityNodeInfo(view, dVar.f54570a);
                e1 e1Var = (e1) this.f2405e;
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
    public final boolean d(View view, int i3, Bundle bundle) {
        switch (this.d) {
            case 0:
                l lVar = (l) this.f2405e;
                if (super.d(view, i3, bundle)) {
                    return true;
                }
                if (i3 != 4096) {
                    if (i3 == 8192 && lVar.canScrollHorizontally(-1)) {
                        lVar.setCurrentItem(lVar.f2424f - 1);
                        return true;
                    }
                } else if (lVar.canScrollHorizontally(1)) {
                    lVar.setCurrentItem(lVar.f2424f + 1);
                    return true;
                }
                return false;
            default:
                e1 e1Var = (e1) this.f2405e;
                if (super.d(view, i3, bundle)) {
                    return true;
                }
                boolean e10 = e1Var.e();
                RecyclerView recyclerView = e1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    tf.e eVar = recyclerView.getLayoutManager().f55630b.f2274b;
                }
                return false;
        }
    }

    public g(l lVar) {
        this.f2405e = lVar;
    }
}
