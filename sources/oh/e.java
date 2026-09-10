package oh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import gh.k;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r0.i0;
import r0.l1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;
import w7.c0;
public final class e extends b2.g {
    public static final RectF e;
    public static final Rect f14586f;
    public final ViewGroup f14587b;
    public int f14588c;
    public final pe.b d = new pe.b(true);

    static {
        new PointF();
        e = new RectF();
        f14586f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f14587b = viewGroup;
        WeakHashMap weakHashMap = i0.f41062a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.e;
        View.OnApplyWindowInsetsListener p0Var = new p0(viewGroup, this);
        viewGroup.setTag(2131296698, p0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static l1 Z0(l1 l1Var, View view, View view2) {
        if (view != null && view2 != null && l1Var != null) {
            RectF rectF = e;
            if (k.c(view, view2, rectF)) {
                Rect rect = f14586f;
                rectF.round(rect);
                int i10 = rect.left;
                int i11 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
                    return l1Var;
                }
                return l1Var.f41074a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void S0() {
        int i10 = this.f14588c - 1;
        this.f14588c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).L();
            }
        }
    }

    @Override
    public final l1 T0(l1 l1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((v0) it.next()).f41097a.c();
        }
        if (c0.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                l1 Z0 = Z0(l1Var, dVar.N(), this.f14587b);
                if (Z0 != null) {
                    dVar.j(Z0);
                }
            }
        }
        return l1Var;
    }
}
