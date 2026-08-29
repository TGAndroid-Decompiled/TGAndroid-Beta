package ah;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import i7.n8;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r0.j0;
import r0.m1;
import r0.q0;
import r0.r0;
import r0.u0;
import r0.w0;
public final class e extends ab.e {
    public static final RectF f743e;
    public static final Rect f744f;
    public final ViewGroup f745b;
    public int f746c;
    public final zd.b d = new zd.b(true);

    static {
        new PointF();
        f743e = new RectF();
        f744f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.f745b = viewGroup;
        WeakHashMap weakHashMap = j0.f46829a;
        if (Build.VERSION.SDK_INT >= 30) {
            u0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = r0.f46854e;
        View.OnApplyWindowInsetsListener q0Var = new q0(viewGroup, this);
        viewGroup.setTag(2131296698, q0Var);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(q0Var);
        }
    }

    public static m1 Q(m1 m1Var, View view, View view2) {
        if (view != null && view2 != null && m1Var != null) {
            RectF rectF = f743e;
            if (sg.i.c(view, view2, rectF)) {
                Rect rect = f744f;
                rectF.round(rect);
                int i10 = rect.left;
                int i11 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
                    return m1Var;
                }
                return m1Var.f46843a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    @Override
    public final void L() {
        int i10 = this.f746c - 1;
        this.f746c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).I();
            }
        }
    }

    @Override
    public final m1 M(m1 m1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((w0) it.next()).f46870a.c();
        }
        if (n8.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                m1 Q = Q(m1Var, dVar.M(), this.f745b);
                if (Q != null) {
                    dVar.k(Q);
                }
            }
        }
        return m1Var;
    }
}
