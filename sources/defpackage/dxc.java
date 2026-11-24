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
public final class dxc extends WindowInsetsAnimation$Callback {
    public final twc a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public dxc(twc twcVar) {
        super(0);
        this.d = new HashMap();
        this.a = twcVar;
    }

    public final gxc a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        gxc gxcVar = (gxc) hashMap.get(windowInsetsAnimation);
        if (gxcVar == null) {
            gxcVar = new gxc(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                gxcVar.a = new exc(windowInsetsAnimation);
            }
            hashMap.put(windowInsetsAnimation, gxcVar);
        }
        return gxcVar;
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
            gxc a = a(windowInsetsAnimation);
            a.a.d(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        vxc h = vxc.h(null, windowInsets);
        this.a.c(h, this.b);
        return h.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        io5 f = exc.f(bounds);
        io5 e = exc.e(bounds);
        twc twcVar = this.a;
        if (twcVar.c == 0) {
            Iterator it = twcVar.d.iterator();
            while (it.hasNext()) {
                ((swc) it.next()).w();
            }
        }
        twcVar.c++;
        bc3.d();
        return bc3.a(f.d(), e.d());
    }
}
