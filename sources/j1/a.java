package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.ui.Components.nh;
import r0.i0;
import s0.d;
public final class a extends nh {
    public final b f16135c;

    public a(b bVar) {
        super(17);
        this.f16135c = bVar;
    }

    @Override
    public final d A(int i3) {
        int i10;
        b bVar = this.f16135c;
        if (i3 == 2) {
            i10 = bVar.f16142k;
        } else {
            i10 = bVar.f16143l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return y(i10);
    }

    @Override
    public final boolean D(int i3, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.f16135c;
        View view = bVar.f16140i;
        if (i3 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            return bVar.k(i3, i10);
                        }
                        if (bVar.f16142k != i3) {
                            return false;
                        }
                        bVar.f16142k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i3, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f16142k) != i3) {
                        if (i12 != Integer.MIN_VALUE) {
                            bVar.f16142k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i12, 65536);
                        }
                        bVar.f16142k = i3;
                        view.invalidate();
                        bVar.m(i3, 32768);
                        return true;
                    }
                } else if (bVar.f16143l != i3) {
                    return false;
                } else {
                    bVar.f16143l = Integer.MIN_VALUE;
                    bVar.m(i3, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.f16143l) != i3) {
                if (i11 != Integer.MIN_VALUE) {
                    bVar.f16143l = Integer.MIN_VALUE;
                    bVar.m(i11, 8);
                }
                bVar.f16143l = i3;
                bVar.m(i3, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f54015a;
        return view.performAccessibilityAction(i10, bundle);
    }

    @Override
    public final d y(int i3) {
        return new d(AccessibilityNodeInfo.obtain(this.f16135c.j(i3).f54570a));
    }
}
