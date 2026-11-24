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
public final class twc {
    public static final RectF e = new RectF();
    public static final Rect f = new Rect();
    public vxc a;
    public final FrameLayout b;
    public int c;
    public final e59 d = new e59(0, false);

    public twc(FrameLayout frameLayout) {
        this.b = frameLayout;
        WeakHashMap weakHashMap = jdc.a;
        if (Build.VERSION.SDK_INT >= 30) {
            exc.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = cxc.e;
        View.OnApplyWindowInsetsListener bxcVar = new bxc(frameLayout, this);
        frameLayout.setTag(2131296700, bxcVar);
        if (frameLayout.getTag(2131296688) == null && frameLayout.getTag(2131296689) == null) {
            frameLayout.setOnApplyWindowInsetsListener(bxcVar);
        }
    }

    public static vxc a(vxc vxcVar, View view, View view2) {
        if (view != null && view2 != null && vxcVar != null) {
            RectF rectF = e;
            if (zec.c(view, view2, rectF)) {
                Rect rect = f;
                rectF.round(rect);
                int i = rect.left;
                int i2 = rect.top;
                int width = view2.getWidth() - rect.right;
                int height = view2.getHeight() - rect.bottom;
                if (i == 0 && i2 == 0 && width == 0 && height == 0) {
                    return vxcVar;
                }
                return vxcVar.a.m(Math.max(0, i), Math.max(0, i2), Math.max(0, width), Math.max(0, height));
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
                ((swc) it.next()).P();
            }
        }
    }

    public final void c(vxc vxcVar, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((gxc) it.next()).a.c();
        }
        if (fod.a(i, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                swc swcVar = (swc) it2.next();
                vxc a = a(vxcVar, swcVar.R(), this.b);
                if (a != null) {
                    swcVar.o(a);
                }
            }
        }
    }
}
