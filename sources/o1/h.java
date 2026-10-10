package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16923m = new c(1);
    public static final c f16924n = new c(2);
    public static final c f16925o = new c(3);
    public static final c f16926p = new c(4);
    public static final c f16927q = new c(5);
    public static final c f16928r = new c(6);
    public static final c f16929s = new c(7);
    public static final c f16930t = new c(0);
    public float f16931a;
    public float f16932b;
    public boolean f16933c;
    public final Object d;
    public final i f16934e;
    public boolean f16935f;
    public float f16936g;
    public float h;
    public long f16937i;
    public float f16938j;
    public final ArrayList f16939k;
    public final ArrayList f16940l;

    public h(j jVar) {
        this.f16931a = 0.0f;
        this.f16932b = Float.MAX_VALUE;
        this.f16933c = false;
        this.f16935f = false;
        this.f16936g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16937i = 0L;
        this.f16939k = new ArrayList();
        this.f16940l = new ArrayList();
        this.d = null;
        this.f16934e = new d(jVar, 0);
        this.f16938j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16939k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16935f) {
            ArrayList arrayList = this.f16940l;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f16935f) {
                d(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void d(boolean z10) {
        ArrayList arrayList;
        int i10 = 0;
        this.f16935f = false;
        ThreadLocal threadLocal = b.f16913f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16914a.remove(this);
        ArrayList arrayList2 = bVar.f16915b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16917e = true;
        }
        this.f16937i = 0L;
        this.f16933c = false;
        while (true) {
            arrayList = this.f16939k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16932b, this.f16931a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f7) {
        if (f7 > 0.0f) {
            this.f16938j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.f16934e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16940l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16932b, this.f16931a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public h(Object obj, i iVar) {
        this.f16931a = 0.0f;
        this.f16932b = Float.MAX_VALUE;
        this.f16933c = false;
        this.f16935f = false;
        this.f16936g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16937i = 0L;
        this.f16939k = new ArrayList();
        this.f16940l = new ArrayList();
        this.d = obj;
        this.f16934e = iVar;
        if (iVar != f16927q && iVar != f16928r && iVar != f16929s) {
            if (iVar == f16930t) {
                this.f16938j = 0.00390625f;
                return;
            } else if (iVar != f16925o && iVar != f16926p) {
                this.f16938j = 1.0f;
                return;
            } else {
                this.f16938j = 0.00390625f;
                return;
            }
        }
        this.f16938j = 0.1f;
    }
}
