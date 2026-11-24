package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
public final class a84 extends ni6 {
    public final b84 f;

    public a84(b84 b84Var) {
        super((byte) 2);
        this.f = b84Var;
    }

    @Override
    public final boolean C(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        b84 b84Var = this.f;
        View view = b84Var.i;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            return b84Var.k(i, i2);
                        }
                        if (b84Var.k != i) {
                            return false;
                        }
                        b84Var.k = Integer.MIN_VALUE;
                        view.invalidate();
                        b84Var.m(i, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = b84Var.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = b84Var.k) != i) {
                        if (i4 != Integer.MIN_VALUE) {
                            b84Var.k = Integer.MIN_VALUE;
                            view.invalidate();
                            b84Var.m(i4, 65536);
                        }
                        b84Var.k = i;
                        view.invalidate();
                        b84Var.m(i, 32768);
                        return true;
                    }
                } else if (b84Var.l != i) {
                    return false;
                } else {
                    b84Var.l = Integer.MIN_VALUE;
                    b84Var.m(i, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i3 = b84Var.l) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    b84Var.l = Integer.MIN_VALUE;
                    b84Var.m(i3, 8);
                }
                b84Var.l = i;
                b84Var.m(i, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = kfc.a;
        return view.performAccessibilityAction(i2, bundle);
    }

    @Override
    public final u4 i(int i) {
        return new u4(AccessibilityNodeInfo.obtain(this.f.j(i).a));
    }

    @Override
    public final u4 j(int i) {
        int i2;
        b84 b84Var = this.f;
        if (i == 2) {
            i2 = b84Var.k;
        } else {
            i2 = b84Var.l;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return i(i2);
    }
}
