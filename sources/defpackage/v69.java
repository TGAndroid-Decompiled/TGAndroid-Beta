package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class v69 extends q4 {
    public final byte d = 1;
    public final Object e;

    public v69(w69 w69Var) {
        this.e = w69Var;
    }

    @Override
    public final void b(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v69.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, u4 u4Var) {
        boolean z;
        byte b = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, u4Var.a);
                w69 w69Var = (w69) obj;
                boolean e = w69Var.e();
                RecyclerView recyclerView = w69Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, u4Var);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                u4Var.i(ggc.class.getName());
                ggc ggcVar = (ggc) obj;
                qt7 qt7Var = ggcVar.e;
                if (qt7Var != null && qt7Var.b() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfo.setScrollable(z);
                if (ggcVar.canScrollHorizontally(1)) {
                    u4Var.a(4096);
                }
                if (ggcVar.canScrollHorizontally(-1)) {
                    u4Var.a(8192);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i, Bundle bundle) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                w69 w69Var = (w69) obj;
                if (super.d(view, i, bundle)) {
                    return true;
                }
                boolean e = w69Var.e();
                RecyclerView recyclerView = w69Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    ki2 ki2Var = recyclerView.getLayoutManager().b.b;
                }
                return false;
            default:
                ggc ggcVar = (ggc) obj;
                if (super.d(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && ggcVar.canScrollHorizontally(-1)) {
                        ggcVar.setCurrentItem(ggcVar.f - 1);
                        return true;
                    }
                } else if (ggcVar.canScrollHorizontally(1)) {
                    ggcVar.setCurrentItem(ggcVar.f + 1);
                    return true;
                }
                return false;
        }
    }

    public v69(ggc ggcVar) {
        this.e = ggcVar;
    }
}
