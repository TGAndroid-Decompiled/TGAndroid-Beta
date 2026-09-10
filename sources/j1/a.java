package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import l2.h;
import r0.i0;
import s0.d;
public final class a extends h {
    public final b f11442c;

    public a(b bVar) {
        super(19);
        this.f11442c = bVar;
    }

    @Override
    public final boolean A(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f11442c;
        View view = bVar.f11446i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f11448k != i10) {
                            return false;
                        }
                        bVar.f11448k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f11448k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f11448k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f11448k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f11449l != i10) {
                    return false;
                } else {
                    bVar.f11449l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f11449l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f11449l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f11449l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f41062a;
        return view.performAccessibilityAction(i11, bundle);
    }

    @Override
    public final d o(int i10) {
        return new d(AccessibilityNodeInfo.obtain(this.f11442c.j(i10).f41559a));
    }

    @Override
    public final d t(int i10) {
        int i11;
        b bVar = this.f11442c;
        if (i10 == 2) {
            i11 = bVar.f11448k;
        } else {
            i11 = bVar.f11449l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return o(i11);
    }
}
