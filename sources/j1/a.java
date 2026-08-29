package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.ui.Components.n;
import r0.j0;
import s0.c;
public final class a extends n {
    public final b f10359c;

    public a(b bVar) {
        super(15);
        this.f10359c = bVar;
    }

    @Override
    public final c g(int i10) {
        return new c(AccessibilityNodeInfo.obtain(this.f10359c.j(i10).f47482a));
    }

    @Override
    public final c i(int i10) {
        int i11;
        b bVar = this.f10359c;
        if (i10 == 2) {
            i11 = bVar.f10366k;
        } else {
            i11 = bVar.f10367l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return g(i11);
    }

    @Override
    public final boolean n(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f10359c;
        View view = bVar.f10364i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f10366k != i10) {
                            return false;
                        }
                        bVar.f10366k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f10366k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f10366k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f10366k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f10367l != i10) {
                    return false;
                } else {
                    bVar.f10367l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f10367l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f10367l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f10367l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = j0.f46829a;
        return view.performAccessibilityAction(i11, bundle);
    }
}
