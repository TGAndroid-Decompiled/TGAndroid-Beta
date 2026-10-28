package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import jg.i;
import r0.i0;
import s0.d;
public final class a extends i {
    public final b f15176b;

    public a(b bVar) {
        super(25);
        this.f15176b = bVar;
    }

    @Override
    public final d c0(int i10) {
        return new d(AccessibilityNodeInfo.obtain(this.f15176b.j(i10).f47688a));
    }

    @Override
    public final d d0(int i10) {
        int i11;
        b bVar = this.f15176b;
        if (i10 == 2) {
            i11 = bVar.f15182k;
        } else {
            i11 = bVar.f15183l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return c0(i11);
    }

    @Override
    public final boolean h0(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f15176b;
        View view = bVar.f15180i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f15182k != i10) {
                            return false;
                        }
                        bVar.f15182k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f15182k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f15182k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f15182k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f15183l != i10) {
                    return false;
                } else {
                    bVar.f15183l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f15183l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f15183l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f15183l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f47143a;
        return view.performAccessibilityAction(i11, bundle);
    }
}
