package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import n5.e0;
import r0.j0;
import s0.d;
public final class a extends e0 {
    public final b f13194c;

    public a(b bVar) {
        super(21);
        this.f13194c = bVar;
    }

    @Override
    public final d P0(int i9) {
        return new d(AccessibilityNodeInfo.obtain(this.f13194c.j(i9).f47292a));
    }

    @Override
    public final d X0(int i9) {
        int i10;
        b bVar = this.f13194c;
        if (i9 == 2) {
            i10 = bVar.f13201k;
        } else {
            i10 = bVar.f13202l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return P0(i10);
    }

    @Override
    public final boolean c1(int i9, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.f13194c;
        View view = bVar.f13199i;
        if (i9 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            return bVar.k(i9, i10);
                        }
                        if (bVar.f13201k != i9) {
                            return false;
                        }
                        bVar.f13201k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i9, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f13201k) != i9) {
                        if (i12 != Integer.MIN_VALUE) {
                            bVar.f13201k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i12, 65536);
                        }
                        bVar.f13201k = i9;
                        view.invalidate();
                        bVar.m(i9, 32768);
                        return true;
                    }
                } else if (bVar.f13202l != i9) {
                    return false;
                } else {
                    bVar.f13202l = Integer.MIN_VALUE;
                    bVar.m(i9, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.f13202l) != i9) {
                if (i11 != Integer.MIN_VALUE) {
                    bVar.f13202l = Integer.MIN_VALUE;
                    bVar.m(i11, 8);
                }
                bVar.f13202l = i9;
                bVar.m(i9, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = j0.f46915a;
        return view.performAccessibilityAction(i10, bundle);
    }
}
