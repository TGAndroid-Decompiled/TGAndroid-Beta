package k1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.ui.Components.cf;
import r0.i0;
import s0.c;
public final class a extends cf {
    public final b f17710b;

    public a(b bVar) {
        super(15);
        this.f17710b = bVar;
    }

    @Override
    public final c m(int i7) {
        return new c(AccessibilityNodeInfo.obtain(this.f17710b.j(i7).f56166a));
    }

    @Override
    public final c p(int i7) {
        int i10;
        b bVar = this.f17710b;
        if (i7 == 2) {
            i10 = bVar.f17717k;
        } else {
            i10 = bVar.f17718l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return m(i10);
    }

    @Override
    public final boolean r(int i7, int i10, Bundle bundle) {
        int i11;
        int i12;
        b bVar = this.f17710b;
        View view = bVar.f17715i;
        if (i7 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 64) {
                        if (i10 != 128) {
                            return bVar.k(i7, i10);
                        }
                        if (bVar.f17717k != i7) {
                            return false;
                        }
                        bVar.f17717k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.m(i7, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f17717k) != i7) {
                        if (i12 != Integer.MIN_VALUE) {
                            bVar.f17717k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.m(i12, 65536);
                        }
                        bVar.f17717k = i7;
                        view.invalidate();
                        bVar.m(i7, 32768);
                        return true;
                    }
                } else if (bVar.f17718l != i7) {
                    return false;
                } else {
                    bVar.f17718l = Integer.MIN_VALUE;
                    bVar.m(i7, 8);
                    return true;
                }
            } else if ((view.isFocused() || view.requestFocus()) && (i11 = bVar.f17718l) != i7) {
                if (i11 != Integer.MIN_VALUE) {
                    bVar.f17718l = Integer.MIN_VALUE;
                    bVar.m(i11, 8);
                }
                bVar.f17718l = i7;
                bVar.m(i7, 8);
                return true;
            }
            return false;
        }
        WeakHashMap weakHashMap = i0.f55671a;
        return view.performAccessibilityAction(i10, bundle);
    }
}
