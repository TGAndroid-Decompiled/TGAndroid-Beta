package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16919m = new c(1);
    public static final c f16920n = new c(2);
    public static final c f16921o = new c(3);
    public static final c f16922p = new c(4);
    public static final c f16923q = new c(5);
    public static final c f16924r = new c(6);
    public static final c f16925s = new c(7);
    public static final c f16926t = new c(0);
    public float f16927a;
    public float f16928b;
    public boolean f16929c;
    public final Object d;
    public final i f16930e;
    public boolean f16931f;
    public float f16932g;
    public float h;
    public long f16933i;
    public float f16934j;
    public final ArrayList f16935k;
    public final ArrayList f16936l;

    public h(j jVar) {
        this.f16927a = 0.0f;
        this.f16928b = Float.MAX_VALUE;
        this.f16929c = false;
        this.f16931f = false;
        this.f16932g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16933i = 0L;
        this.f16935k = new ArrayList();
        this.f16936l = new ArrayList();
        this.d = null;
        this.f16930e = new d(jVar, 0);
        this.f16934j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16935k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16931f) {
            ArrayList arrayList = this.f16936l;
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
            if (this.f16931f) {
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
        this.f16931f = false;
        ThreadLocal threadLocal = b.f16909f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16910a.remove(this);
        ArrayList arrayList2 = bVar.f16911b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16913e = true;
        }
        this.f16933i = 0L;
        this.f16929c = false;
        while (true) {
            arrayList = this.f16935k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16928b, this.f16927a);
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
            this.f16934j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.f16930e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16936l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16928b, this.f16927a);
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
        this.f16927a = 0.0f;
        this.f16928b = Float.MAX_VALUE;
        this.f16929c = false;
        this.f16931f = false;
        this.f16932g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16933i = 0L;
        this.f16935k = new ArrayList();
        this.f16936l = new ArrayList();
        this.d = obj;
        this.f16930e = iVar;
        if (iVar != f16923q && iVar != f16924r && iVar != f16925s) {
            if (iVar == f16926t) {
                this.f16934j = 0.00390625f;
                return;
            } else if (iVar != f16921o && iVar != f16922p) {
                this.f16934j = 1.0f;
                return;
            } else {
                this.f16934j = 0.00390625f;
                return;
            }
        }
        this.f16934j = 0.1f;
    }
}
