package j1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.ui.Cells.f1;
import r0.j0;
import s0.d;
public final class a extends f1 {
    public final b f8966c;

    public a(b bVar) {
        super(17);
        this.f8966c = bVar;
    }

    @Override
    public final boolean D(int i10, int i11, Bundle bundle) {
        int i12;
        int i13;
        b bVar = this.f8966c;
        View view = bVar.f8971i;
        if (i10 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.k(i10, i11);
                        }
                        if (bVar.f8973k != i10) {
                            return false;
                        }
                        bVar.f8973k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i10, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i13 = bVar.f8973k) != i10) {
                        if (i13 != Integer.MIN_VALUE) {
                            bVar.f8973k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i13, 65536);
                        }
                        bVar.f8973k = i10;
                        view.invalidate();
                        bVar.m(i10, 32768);
                        return true;
                    }
                } else if (bVar.f8974l != i10) {
                    return false;
                } else {
                    bVar.f8974l = Integer.MIN_VALUE;
                    bVar.m(i10, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i12 = bVar.f8974l) != i10) {
                if (i12 != Integer.MIN_VALUE) {
                    bVar.f8974l = Integer.MIN_VALUE;
                    bVar.m(i12, 8);
                }
                bVar.f8974l = i10;
                bVar.m(i10, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = j0.f46469a;
        return view.performAccessibilityAction(i11, bundle);
    }

    @Override
    public final d i(int i10) {
        return new d(AccessibilityNodeInfo.obtain(this.f8966c.j(i10).f46881a));
    }

    @Override
    public final d o(int i10) {
        int i11;
        b bVar = this.f8966c;
        if (i10 == 2) {
            i11 = bVar.f8973k;
        } else {
            i11 = bVar.f8974l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return i(i11);
    }
}
