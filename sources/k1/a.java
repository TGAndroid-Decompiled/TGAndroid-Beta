package k1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.ui.Components.n;
import r0.i0;
import s0.d;
public final class a extends n {
    public final b f17150b;

    public a(b bVar) {
        super(16);
        this.f17150b = bVar;
    }

    @Override
    public final d s(int i7) {
        return new d(AccessibilityNodeInfo.obtain(this.f17150b.j(i7).f54484a));
    }

    @Override
    public final d v(int i7) {
        int i10;
        b bVar = this.f17150b;
        if (i7 == 2) {
            i10 = bVar.f17157k;
        } else {
            i10 = bVar.f17158l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return s(i10);
    }

    @Override
    public final boolean z(int i7, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.f17150b;
        View view = bVar.f17155i;
        if (i7 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            return bVar.k(i7, i10);
                        }
                        if (bVar.f17157k != i7) {
                            return false;
                        }
                        bVar.f17157k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i7, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f17157k) != i7) {
                        if (i12 != Integer.MIN_VALUE) {
                            bVar.f17157k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i12, 65536);
                        }
                        bVar.f17157k = i7;
                        view.invalidate();
                        bVar.m(i7, 32768);
                        return true;
                    }
                } else if (bVar.f17158l != i7) {
                    return false;
                } else {
                    bVar.f17158l = Integer.MIN_VALUE;
                    bVar.m(i7, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.f17158l) != i7) {
                if (i11 != Integer.MIN_VALUE) {
                    bVar.f17158l = Integer.MIN_VALUE;
                    bVar.m(i11, 8);
                }
                bVar.f17158l = i7;
                bVar.m(i7, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f54073a;
        return view.performAccessibilityAction(i10, bundle);
    }
}
