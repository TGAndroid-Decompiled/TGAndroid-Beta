package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.ui.Components.zz;
import r0.j0;
import s0.d;
public final class a extends zz {
    public final b f8392c;

    public a(b bVar) {
        super(13);
        this.f8392c = bVar;
    }

    @Override
    public final boolean G(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f8392c;
        View view = bVar.f8396i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f8398k != i10) {
                            return false;
                        }
                        bVar.f8398k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f8398k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f8398k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f8398k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f8399l != i10) {
                    return false;
                } else {
                    bVar.f8399l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f8399l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f8399l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f8399l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = j0.f43142a;
        return view.performAccessibilityAction(i11, bundle);
    }

    @Override
    public final d g(int i10) {
        return new d(AccessibilityNodeInfo.obtain(this.f8392c.j(i10).f43969a));
    }

    @Override
    public final d i(int i10) {
        int i11;
        b bVar = this.f8392c;
        if (i10 == 2) {
            i11 = bVar.f8398k;
        } else {
            i11 = bVar.f8399l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return g(i11);
    }
}
