package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import ji.u4;
import r0.i0;
import s0.c;
public final class a extends u4 {
    public final b f13153c;

    public a(b bVar) {
        super(22);
        this.f13153c = bVar;
    }

    @Override
    public final boolean N(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f13153c;
        View view = bVar.f13158i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f13160k != i10) {
                            return false;
                        }
                        bVar.f13160k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f13160k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f13160k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f13160k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f13161l != i10) {
                    return false;
                } else {
                    bVar.f13161l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f13161l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f13161l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f13161l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f44697a;
        return view.performAccessibilityAction(i11, bundle);
    }

    @Override
    public final c o(int i10) {
        return new c(AccessibilityNodeInfo.obtain(this.f13153c.j(i10).f45685a));
    }

    @Override
    public final c z(int i10) {
        int i11;
        b bVar = this.f13153c;
        if (i10 == 2) {
            i11 = bVar.f13160k;
        } else {
            i11 = bVar.f13161l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return o(i11);
    }
}
