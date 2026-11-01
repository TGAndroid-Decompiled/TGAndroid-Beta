package hh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r0.h0;
import r0.j1;
import r0.o0;
import r0.p0;
import r0.s0;
import r0.u0;
import v7.u7;
public final class e extends b2.h {
    public static final RectF e;
    public static final Rect f7691f;
    public final ViewGroup f7692b;
    public int f7693c;
    public final je.b d = new je.b();

    static {
        new PointF();
        e = new RectF();
        f7691f = new Rect();
    }

    public e(FrameLayout frameLayout) {
        this.f7692b = frameLayout;
        WeakHashMap weakHashMap = h0.f46134a;
        if (Build.VERSION.SDK_INT >= 30) {
            s0.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = p0.e;
        View.OnApplyWindowInsetsListener o0Var = new o0(frameLayout, this);
        frameLayout.setTag(2131296698, o0Var);
        if (frameLayout.getTag(2131296686) == null && frameLayout.getTag(2131296687) == null) {
            frameLayout.setOnApplyWindowInsetsListener(o0Var);
        }
    }

    public static j1 e1(j1 j1Var, View view, View view2) {
        if (view != null && view2 != null && j1Var != null) {
            RectF rectF = e;
            if (zg.h.c(view, view2, rectF)) {
                Rect rect = f7691f;
                rectF.round(rect);
                int i10 = rect.left;
                int i11 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
                    return j1Var;
                }
                return j1Var.f46143a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void V0() {
        int i10 = this.f7693c - 1;
        this.f7693c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).Q();
            }
        }
    }

    @Override
    public final j1 W0(j1 j1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((u0) it.next()).f46167a.c();
        }
        if (u7.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                j1 e12 = e1(j1Var, dVar.S(), this.f7692b);
                if (e12 != null) {
                    dVar.m(e12);
                }
            }
        }
        return j1Var;
    }
}
