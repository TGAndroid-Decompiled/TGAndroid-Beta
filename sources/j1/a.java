package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import ji.w4;
import r0.i0;
import s0.c;
public final class a extends w4 {
    public final b f12508c;

    public a(b bVar) {
        super(24);
        this.f12508c = bVar;
    }

    @Override
    public final c Z0(int i10) {
        return new c(AccessibilityNodeInfo.obtain(this.f12508c.j(i10).f44795a));
    }

    @Override
    public final c c1(int i10) {
        int i11;
        b bVar = this.f12508c;
        if (i10 == 2) {
            i11 = bVar.f12514k;
        } else {
            i11 = bVar.f12515l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return Z0(i11);
    }

    @Override
    public final boolean k1(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f12508c;
        View view = bVar.f12512i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f12514k != i10) {
                            return false;
                        }
                        bVar.f12514k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f12514k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f12514k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f12514k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f12515l != i10) {
                    return false;
                } else {
                    bVar.f12515l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f12515l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f12515l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f12515l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f43485a;
        return view.performAccessibilityAction(i11, bundle);
    }
}
