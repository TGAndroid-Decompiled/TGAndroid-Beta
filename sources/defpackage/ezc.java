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
public final class ezc extends WindowInsetsAnimation$Callback {
    public final uyc a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public ezc(uyc uycVar) {
        super(0);
        this.d = new HashMap();
        this.a = uycVar;
    }

    public final hzc a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        hzc hzcVar = (hzc) hashMap.get(windowInsetsAnimation);
        if (hzcVar == null) {
            hzcVar = new hzc(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                hzcVar.a = new fzc(windowInsetsAnimation);
            }
            hashMap.put(windowInsetsAnimation, hzcVar);
        }
        return hzcVar;
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
            hzc a = a(windowInsetsAnimation);
            a.a.d(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        wzc h = wzc.h(null, windowInsets);
        this.a.c(h, this.b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        iq5 f = fzc.f(bounds);
        iq5 e = fzc.e(bounds);
        uyc uycVar = this.a;
        if (uycVar.c == 0) {
            Iterator it = uycVar.d.iterator();
            while (it.hasNext()) {
                ((tyc) it.next()).v();
            }
        }
        uycVar.c++;
        nd3.d();
        return nd3.a(f.d(), e.d());
    }
}
