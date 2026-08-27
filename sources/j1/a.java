package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import m5.o;
import r0.j0;
import s0.c;

public final class a extends o {

    public final b f12291c;

    public a(b bVar) {
        super(21);
        this.f12291c = bVar;
    }

    @Override
    public final c u(int i10) {
        return new c(AccessibilityNodeInfo.obtain(this.f12291c.j(i10).f47656a));
    }

    @Override
    public final c w(int i10) {
        b bVar = this.f12291c;
        int i11 = i10 == 2 ? bVar.f12298k : bVar.f12299l;
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i11);
    }

    @Override
    public final boolean y(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f12291c;
        View view = bVar.f12296i;
        if (i10 == -1) {
            WeakHashMap weakHashMap = j0.f46605a;
            return view.performAccessibilityAction(i11, bundle);
        }
        if (i11 != 1) {
            if (i11 == 2) {
                if (bVar.f12299l != i10) {
                    return false;
                }
                bVar.f12299l = Integer.MIN_VALUE;
                bVar.m(i10, 8);
                return true;
            }
            if (i11 != 64) {
                if (i11 != 128) {
                    return bVar.k(i10, i11);
                }
                if (bVar.f12298k != i10) {
                    return false;
                }
                bVar.f12298k = Integer.MIN_VALUE;
                view.invalidate();
                bVar.m(i10, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f12298k) != i10) {
                if (i13 != Integer.MIN_VALUE) {
                    bVar.f12298k = Integer.MIN_VALUE;
                    view.invalidate();
                    bVar.m(i13, 65536);
                }
                bVar.f12298k = i10;
                view.invalidate();
                bVar.m(i10, 32768);
                return true;
            }
        } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f12299l) != i10) {
            if (i12 != Integer.MIN_VALUE) {
                bVar.f12299l = Integer.MIN_VALUE;
                bVar.m(i12, 8);
            }
            bVar.f12299l = i10;
            bVar.m(i10, 8);
            return true;
        }
        return false;
    }
}
