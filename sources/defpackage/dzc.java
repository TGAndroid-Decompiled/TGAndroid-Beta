package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
public final class dzc extends gzc {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final l94 f = new l94(l94.c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        uyc i = i(view);
        if (i != null) {
            i.b();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, wzc wzcVar, boolean z) {
        uyc i = i(view);
        if (i != null) {
            i.a = wzcVar;
            if (!z) {
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), wzcVar, z);
            }
        }
    }

    public static void g(View view, wzc wzcVar, List list) {
        uyc i = i(view);
        if (i != null) {
            i.c(wzcVar, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), wzcVar, list);
            }
        }
    }

    public static void h(View view, xab xabVar) {
        uyc i = i(view);
        if (i != null) {
            if (i.c == 0) {
                Iterator it = i.d.iterator();
                while (it.hasNext()) {
                    ((tyc) it.next()).v();
                }
            }
            i.c++;
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), xabVar);
            }
        }
    }

    public static uyc i(View view) {
        Object tag = view.getTag(2131296700);
        if (tag instanceof czc) {
            return ((czc) tag).a;
        }
        return null;
    }
}
