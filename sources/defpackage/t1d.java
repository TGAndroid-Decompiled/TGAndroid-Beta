package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
public final class t1d extends WindowInsetsAnimation$Callback {
    public final j1d a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public t1d(j1d j1dVar) {
        super(0);
        this.d = new HashMap();
        this.a = j1dVar;
    }

    public final w1d a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        w1d w1dVar = (w1d) hashMap.get(windowInsetsAnimation);
        if (w1dVar == null) {
            w1dVar = new w1d(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                w1dVar.a = new u1d(windowInsetsAnimation);
            }
            hashMap.put(windowInsetsAnimation, w1dVar);
        }
        return w1dVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.b();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.getClass();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            w1d a = a(windowInsetsAnimation);
            a.a.d(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        l2d h = l2d.h(null, windowInsets);
        this.a.c(h, this.b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        mq5 f = u1d.f(bounds);
        mq5 e = u1d.e(bounds);
        j1d j1dVar = this.a;
        if (j1dVar.c == 0) {
            Iterator it = j1dVar.d.iterator();
            while (it.hasNext()) {
                ((i1d) it.next()).w();
            }
        }
        j1dVar.c++;
        uc3.d();
        return uc3.a(f.d(), e.d());
    }
}
