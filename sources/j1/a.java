package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import r0.h0;
import r2.y;
import s0.c;
public final class a extends y {
    public final b f9327c;

    public a(b bVar) {
        super(3);
        this.f9327c = bVar;
    }

    @Override
    public final c I(int i10) {
        return new c(AccessibilityNodeInfo.obtain(this.f9327c.j(i10).f47861a));
    }

    @Override
    public final c Q(int i10) {
        int i11;
        b bVar = this.f9327c;
        if (i10 == 2) {
            i11 = bVar.f9333k;
        } else {
            i11 = bVar.f9334l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return I(i11);
    }

    @Override
    public final boolean a0(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f9327c;
        View view = bVar.f9331i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f9333k != i10) {
                            return false;
                        }
                        bVar.f9333k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f9333k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f9333k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f9333k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f9334l != i10) {
                    return false;
                } else {
                    bVar.f9334l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f9334l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f9334l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f9334l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = h0.f46134a;
        return view.performAccessibilityAction(i11, bundle);
    }
}
