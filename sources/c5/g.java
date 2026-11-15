package c5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import v4.f1;
import v4.w0;
public final class g extends r0.b {
    public final int d = 0;
    public final Object f4140e;

    public g(f1 f1Var) {
        this.f4140e = f1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: c5.g.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.c cVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56166a;
                this.f55642a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                cVar.i(l.class.getName());
                l lVar = (l) this.f4140e;
                a aVar = lVar.f4157e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (lVar.canScrollHorizontally(1)) {
                    cVar.a(4096);
                }
                if (lVar.canScrollHorizontally(-1)) {
                    cVar.a(8192);
                    return;
                }
                return;
            default:
                this.f55642a.onInitializeAccessibilityNodeInfo(view, cVar.f56166a);
                f1 f1Var = (f1) this.f4140e;
                boolean e10 = f1Var.e();
                RecyclerView recyclerView = f1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, cVar);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i7, Bundle bundle) {
        switch (this.d) {
            case 0:
                l lVar = (l) this.f4140e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                if (i7 != 4096) {
                    if (i7 == 8192 && lVar.canScrollHorizontally(-1)) {
                        lVar.setCurrentItem(lVar.f4159f - 1);
                        return true;
                    }
                } else if (lVar.canScrollHorizontally(1)) {
                    lVar.setCurrentItem(lVar.f4159f + 1);
                    return true;
                }
                return false;
            default:
                f1 f1Var = (f1) this.f4140e;
                if (super.d(view, i7, bundle)) {
                    return true;
                }
                boolean e10 = f1Var.e();
                RecyclerView recyclerView = f1Var.d;
                if (!e10 && recyclerView.getLayoutManager() != null) {
                    w0 w0Var = recyclerView.getLayoutManager().f58622b.f2796b;
                }
                return false;
        }
    }

    public g(l lVar) {
        this.f4140e = lVar;
    }
}
