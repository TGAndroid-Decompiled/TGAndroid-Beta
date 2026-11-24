package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
public final class r64 extends l69 {
    public final s64 f;

    public r64(s64 s64Var) {
        super((byte) 3);
        this.f = s64Var;
    }

    @Override
    public final boolean E(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        s64 s64Var = this.f;
        View view = s64Var.i;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            return s64Var.k(i, i2);
                        }
                        if (s64Var.k != i) {
                            return false;
                        }
                        s64Var.k = Integer.MIN_VALUE;
                        view.invalidate();
                        s64Var.m(i, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = s64Var.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = s64Var.k) != i) {
                        if (i4 != Integer.MIN_VALUE) {
                            s64Var.k = Integer.MIN_VALUE;
                            view.invalidate();
                            s64Var.m(i4, 65536);
                        }
                        s64Var.k = i;
                        view.invalidate();
                        s64Var.m(i, 32768);
                        return true;
                    }
                } else if (s64Var.l != i) {
                    return false;
                } else {
                    s64Var.l = Integer.MIN_VALUE;
                    s64Var.m(i, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i3 = s64Var.l) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    s64Var.l = Integer.MIN_VALUE;
                    s64Var.m(i3, 8);
                }
                s64Var.l = i;
                s64Var.m(i, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = jdc.a;
        return view.performAccessibilityAction(i2, bundle);
    }

    @Override
    public final u4 u(int i) {
        return new u4(AccessibilityNodeInfo.obtain(this.f.j(i).a));
    }

    @Override
    public final u4 w(int i) {
        int i2;
        s64 s64Var = this.f;
        if (i == 2) {
            i2 = s64Var.k;
        } else {
            i2 = s64Var.l;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i2);
    }
}
