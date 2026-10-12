package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import l2.g;
import r0.i0;
import s0.d;
public final class a extends g {
    public final b f13664c;

    public a(b bVar) {
        this.f13664c = bVar;
    }

    @Override
    public final boolean A0(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f13664c;
        View view = bVar.f13669i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f13671k != i10) {
                            return false;
                        }
                        bVar.f13671k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f13671k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f13671k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f13671k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f13672l != i10) {
                    return false;
                } else {
                    bVar.f13672l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f13672l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f13672l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f13672l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f46989a;
        return view.performAccessibilityAction(i11, bundle);
    }

    @Override
    public final d p0(int i10) {
        return new d(AccessibilityNodeInfo.obtain(this.f13664c.j(i10).f47826a));
    }

    @Override
    public final d q0(int i10) {
        int i11;
        b bVar = this.f13664c;
        if (i10 == 2) {
            i11 = bVar.f13671k;
        } else {
            i11 = bVar.f13672l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return p0(i11);
    }
}
