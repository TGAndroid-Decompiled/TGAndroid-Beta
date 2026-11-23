package k1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.ui.Cells.c5;
import r0.i0;
import s0.c;
public final class a extends c5 {
    public final b f18099b;

    public a(b bVar) {
        super(18);
        this.f18099b = bVar;
    }

    @Override
    public final c t(int i7) {
        return new c(AccessibilityNodeInfo.obtain(this.f18099b.j(i7).f56750a));
    }

    @Override
    public final c w(int i7) {
        int i10;
        b bVar = this.f18099b;
        if (i7 == 2) {
            i10 = bVar.f18106k;
        } else {
            i10 = bVar.f18107l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return t(i10);
    }

    @Override
    public final boolean z(int i7, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.f18099b;
        View view = bVar.f18104i;
        if (i7 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            return bVar.k(i7, i10);
                        }
                        if (bVar.f18106k != i7) {
                            return false;
                        }
                        bVar.f18106k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i7, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f18106k) != i7) {
                        if (i12 != Integer.MIN_VALUE) {
                            bVar.f18106k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i12, 65536);
                        }
                        bVar.f18106k = i7;
                        view.invalidate();
                        bVar.m(i7, 32768);
                        return true;
                    }
                } else if (bVar.f18107l != i7) {
                    return false;
                } else {
                    bVar.f18107l = Integer.MIN_VALUE;
                    bVar.m(i7, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.f18107l) != i7) {
                if (i11 != Integer.MIN_VALUE) {
                    bVar.f18107l = Integer.MIN_VALUE;
                    bVar.m(i11, 8);
                }
                bVar.f18107l = i7;
                bVar.m(i7, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f56254a;
        return view.performAccessibilityAction(i10, bundle);
    }
}
