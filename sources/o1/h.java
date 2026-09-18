package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15472m = new c(1);
    public static final c f15473n = new c(2);
    public static final c f15474o = new c(3);
    public static final c f15475p = new c(4);
    public static final c f15476q = new c(5);
    public static final c f15477r = new c(6);
    public static final c f15478s = new c(7);
    public static final c f15479t = new c(0);
    public float f15480a;
    public float f15481b;
    public boolean f15482c;
    public final Object d;
    public final i e;
    public boolean f15483f;
    public float f15484g;
    public float h;
    public long f15485i;
    public float f15486j;
    public final ArrayList f15487k;
    public final ArrayList f15488l;

    public h(j jVar) {
        this.f15480a = 0.0f;
        this.f15481b = Float.MAX_VALUE;
        this.f15482c = false;
        this.f15483f = false;
        this.f15484g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15485i = 0L;
        this.f15487k = new ArrayList();
        this.f15488l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15486j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15487k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15483f) {
            ArrayList arrayList = this.f15488l;
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
            if (this.f15483f) {
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
        this.f15483f = false;
        ThreadLocal threadLocal = b.f15463f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15464a.remove(this);
        ArrayList arrayList2 = bVar.f15465b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15485i = 0L;
        this.f15482c = false;
        while (true) {
            arrayList = this.f15487k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15481b, this.f15480a);
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
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f15488l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15481b, this.f15480a);
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
        this.f15480a = 0.0f;
        this.f15481b = Float.MAX_VALUE;
        this.f15482c = false;
        this.f15483f = false;
        this.f15484g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15485i = 0L;
        this.f15487k = new ArrayList();
        this.f15488l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15476q && iVar != f15477r && iVar != f15478s) {
            if (iVar == f15479t) {
                this.f15486j = 0.00390625f;
                return;
            } else if (iVar != f15474o && iVar != f15475p) {
                this.f15486j = 1.0f;
                return;
            } else {
                this.f15486j = 0.00390625f;
                return;
            }
        }
        this.f15486j = 0.1f;
    }
}
