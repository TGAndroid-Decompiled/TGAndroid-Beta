package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import k2.u;
import r0.i0;
import s0.c;
public final class a extends u {
    public final b f12551c;

    public a(b bVar) {
        super(23);
        this.f12551c = bVar;
    }

    @Override
    public final c Z(int i10) {
        return new c(AccessibilityNodeInfo.obtain(this.f12551c.j(i10).f42624a));
    }

    @Override
    public final c a0(int i10) {
        int i11;
        b bVar = this.f12551c;
        if (i10 == 2) {
            i11 = bVar.f12557k;
        } else {
            i11 = bVar.f12558l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return Z(i11);
    }

    @Override
    public final boolean c0(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f12551c;
        View view = bVar.f12555i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f12557k != i10) {
                            return false;
                        }
                        bVar.f12557k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f12557k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f12557k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f12557k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f12558l != i10) {
                    return false;
                } else {
                    bVar.f12558l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f12558l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f12558l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f12558l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f41843a;
        return view.performAccessibilityAction(i11, bundle);
    }
}
