package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class g89 extends r4 {
    public final byte d = 1;
    public final Object e;

    public g89(h89 h89Var) {
        this.e = h89Var;
    }

    @Override
    public final void b(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g89.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, v4 v4Var) {
        boolean z;
        byte b = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v4Var.a);
                h89 h89Var = (h89) obj;
                boolean e = h89Var.e();
                RecyclerView recyclerView = h89Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, v4Var);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                v4Var.i(fic.class.getName());
                fic ficVar = (fic) obj;
                vu7 vu7Var = ficVar.e;
                if (vu7Var != null && vu7Var.b() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfo.setScrollable(z);
                if (ficVar.canScrollHorizontally(1)) {
                    v4Var.a(4096);
                }
                if (ficVar.canScrollHorizontally(-1)) {
                    v4Var.a(8192);
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
                h89 h89Var = (h89) obj;
                if (super.d(view, i, bundle)) {
                    return true;
                }
                boolean e = h89Var.e();
                RecyclerView recyclerView = h89Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    oh2 oh2Var = recyclerView.getLayoutManager().b.b;
                }
                return false;
            default:
                fic ficVar = (fic) obj;
                if (super.d(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && ficVar.canScrollHorizontally(-1)) {
                        ficVar.setCurrentItem(ficVar.f - 1);
                        return true;
                    }
                } else if (ficVar.canScrollHorizontally(1)) {
                    ficVar.setCurrentItem(ficVar.f + 1);
                    return true;
                }
                return false;
        }
    }

    public g89(fic ficVar) {
        this.e = ficVar;
    }
}
