package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import n2.e;
import r0.i0;
import s0.d;
public final class a extends e {
    public final b f12555c;

    public a(b bVar) {
        super(18);
        this.f12555c = bVar;
    }

    @Override
    public final boolean H(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f12555c;
        View view = bVar.f12559i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f12561k != i10) {
                            return false;
                        }
                        bVar.f12561k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f12561k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f12561k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f12561k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f12562l != i10) {
                    return false;
                } else {
                    bVar.f12562l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f12562l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f12562l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f12562l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f42142a;
        return view.performAccessibilityAction(i11, bundle);
    }

    @Override
    public final d t(int i10) {
        return new d(AccessibilityNodeInfo.obtain(this.f12555c.j(i10).f42923a));
    }

    @Override
    public final d u(int i10) {
        int i11;
        b bVar = this.f12555c;
        if (i10 == 2) {
            i11 = bVar.f12561k;
        } else {
            i11 = bVar.f12562l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return t(i11);
    }
}
