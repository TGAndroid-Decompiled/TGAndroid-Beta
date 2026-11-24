package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class t49 extends q4 {
    public final byte d = 1;
    public final Object e;

    public t49(u49 u49Var) {
        this.e = u49Var;
    }

    @Override
    public final void b(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t49.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
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
                u49 u49Var = (u49) obj;
                boolean e = u49Var.e();
                RecyclerView recyclerView = u49Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, u4Var);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                u4Var.i(gec.class.getName());
                gec gecVar = (gec) obj;
                pr7 pr7Var = gecVar.e;
                if (pr7Var != null && pr7Var.b() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfo.setScrollable(z);
                if (gecVar.canScrollHorizontally(1)) {
                    u4Var.a(4096);
                }
                if (gecVar.canScrollHorizontally(-1)) {
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
                u49 u49Var = (u49) obj;
                if (super.d(view, i, bundle)) {
                    return true;
                }
                boolean e = u49Var.e();
                RecyclerView recyclerView = u49Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    wg2 wg2Var = recyclerView.getLayoutManager().b.b;
                }
                return false;
            default:
                gec gecVar = (gec) obj;
                if (super.d(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && gecVar.canScrollHorizontally(-1)) {
                        gecVar.setCurrentItem(gecVar.f - 1);
                        return true;
                    }
                } else if (gecVar.canScrollHorizontally(1)) {
                    gecVar.setCurrentItem(gecVar.f + 1);
                    return true;
                }
                return false;
        }
    }

    public t49(gec gecVar) {
        this.e = gecVar;
    }
}
