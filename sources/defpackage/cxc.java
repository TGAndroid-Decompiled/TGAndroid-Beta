package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class cxc extends fxc {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final c84 f = new c84(c84.c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        twc i = i(view);
        if (i != null) {
            i.b();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, vxc vxcVar, boolean z) {
        twc i = i(view);
        if (i != null) {
            i.a = vxcVar;
            if (!z) {
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), vxcVar, z);
            }
        }
    }

    public static void g(View view, vxc vxcVar, List list) {
        twc i = i(view);
        if (i != null) {
            i.c(vxcVar, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), vxcVar, list);
            }
        }
    }

    public static void h(View view, v8b v8bVar) {
        twc i = i(view);
        if (i != null) {
            if (i.c == 0) {
                Iterator it = i.d.iterator();
                while (it.hasNext()) {
                    ((swc) it.next()).w();
                }
            }
            i.c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), v8bVar);
            }
        }
    }

    public static twc i(View view) {
        Object tag = view.getTag(2131296700);
        if (tag instanceof bxc) {
            return ((bxc) tag).a;
        }
        return null;
    }
}
