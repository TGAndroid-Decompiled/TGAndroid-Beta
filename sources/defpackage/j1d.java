package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
public final class j1d {
    public static final RectF e = new RectF();
    public static final Rect f = new Rect();
    public l2d a;
    public final FrameLayout b;
    public int c;
    public final r89 d = new r89(0, false);

    public j1d(FrameLayout frameLayout) {
        this.b = frameLayout;
        WeakHashMap weakHashMap = ihc.a;
        if (Build.VERSION.SDK_INT >= 30) {
            u1d.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = s1d.e;
        View.OnApplyWindowInsetsListener r1dVar = new r1d(frameLayout, this);
        frameLayout.setTag(2131296700, r1dVar);
        if (frameLayout.getTag(2131296688) == null && frameLayout.getTag(2131296689) == null) {
            frameLayout.setOnApplyWindowInsetsListener(r1dVar);
        }
    }

    public static l2d a(l2d l2dVar, View view, View view2) {
        if (view != null && view2 != null && l2dVar != null) {
            RectF rectF = e;
            if (yic.c(view, view2, rectF)) {
                Rect rect = f;
                rectF.round(rect);
                int i = rect.left;
                int i2 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i == 0 && i2 == 0 && width == 0 && height == 0) {
                    return l2dVar;
                }
                return l2dVar.a.m(Math.max(0, i), Math.max(0, i2), Math.max(0, width), Math.max(0, height));
            }
            return null;
        }
        return null;
    }

    public final void b() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((i1d) it.next()).P();
            }
        }
    }

    public final void c(l2d l2dVar, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((w1d) it.next()).a.c();
        }
        if (vsd.a(i, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                i1d i1dVar = (i1d) it2.next();
                l2d a = a(l2dVar, i1dVar.R(), this.b);
                if (a != null) {
                    i1dVar.o(a);
                }
            }
        }
    }
}
