package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class s1d extends v1d {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final x84 f = new x84(x84.c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        j1d i = i(view);
        if (i != null) {
            i.b();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, l2d l2dVar, boolean z) {
        j1d i = i(view);
        if (i != null) {
            i.a = l2dVar;
            if (!z) {
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), l2dVar, z);
            }
        }
    }

    public static void g(View view, l2d l2dVar, List list) {
        j1d i = i(view);
        if (i != null) {
            i.c(l2dVar, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), l2dVar, list);
            }
        }
    }

    public static void h(View view, k7b k7bVar) {
        j1d i = i(view);
        if (i != null) {
            if (i.c == 0) {
                Iterator it = i.d.iterator();
                while (it.hasNext()) {
                    ((i1d) it.next()).w();
                }
            }
            i.c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), k7bVar);
            }
        }
    }

    public static j1d i(View view) {
        Object tag = view.getTag(2131296700);
        if (tag instanceof r1d) {
            return ((r1d) tag).a;
        }
        return null;
    }
}
