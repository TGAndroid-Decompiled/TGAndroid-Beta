package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import l2.f;
import r0.i0;
import s0.d;
public final class a extends f {
    public final b f13666c;

    public a(b bVar) {
        super(22);
        this.f13666c = bVar;
    }

    @Override
    public final d o(int i10) {
        return new d(AccessibilityNodeInfo.obtain(this.f13666c.j(i10).f47711a));
    }

    @Override
    public final d p(int i10) {
        int i11;
        b bVar = this.f13666c;
        if (i10 == 2) {
            i11 = bVar.f13673k;
        } else {
            i11 = bVar.f13674l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return o(i11);
    }

    @Override
    public final boolean u(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f13666c;
        View view = bVar.f13671i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f13673k != i10) {
                            return false;
                        }
                        bVar.f13673k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f13673k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f13673k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f13673k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f13674l != i10) {
                    return false;
                } else {
                    bVar.f13674l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f13674l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f13674l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f13674l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f46890a;
        return view.performAccessibilityAction(i11, bundle);
    }
}
