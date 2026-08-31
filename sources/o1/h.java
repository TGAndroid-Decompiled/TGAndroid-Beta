package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16318m = new c(1);
    public static final c f16319n = new c(2);
    public static final c f16320o = new c(3);
    public static final c f16321p = new c(4);
    public static final c f16322q = new c(5);
    public static final c f16323r = new c(6);
    public static final c f16324s = new c(7);
    public static final c f16325t = new c(0);
    public float f16326a;
    public float f16327b;
    public boolean f16328c;
    public final Object d;
    public final i f16329e;
    public boolean f16330f;
    public float f16331g;
    public float h;
    public long f16332i;
    public float f16333j;
    public final ArrayList f16334k;
    public final ArrayList f16335l;

    public h(kb.a aVar) {
        this.f16326a = 0.0f;
        this.f16327b = Float.MAX_VALUE;
        this.f16328c = false;
        this.f16330f = false;
        this.f16331g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16332i = 0L;
        this.f16334k = new ArrayList();
        this.f16335l = new ArrayList();
        this.d = null;
        this.f16329e = new d(aVar, 0);
        this.f16333j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16334k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16330f) {
            ArrayList arrayList = this.f16335l;
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
            if (this.f16330f) {
                d(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void d(boolean z4) {
        ArrayList arrayList;
        int i10 = 0;
        this.f16330f = false;
        ThreadLocal threadLocal = b.f16308f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16309a.remove(this);
        ArrayList arrayList2 = bVar.f16310b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16312e = true;
        }
        this.f16332i = 0L;
        this.f16328c = false;
        while (true) {
            arrayList = this.f16334k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z4, this.f16327b, this.f16326a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f10) {
        ArrayList arrayList;
        this.f16329e.b(this.d, f10);
        int i10 = 0;
        while (true) {
            arrayList = this.f16335l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16327b, this.f16326a);
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
        this.f16326a = 0.0f;
        this.f16327b = Float.MAX_VALUE;
        this.f16328c = false;
        this.f16330f = false;
        this.f16331g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16332i = 0L;
        this.f16334k = new ArrayList();
        this.f16335l = new ArrayList();
        this.d = obj;
        this.f16329e = iVar;
        if (iVar != f16322q && iVar != f16323r && iVar != f16324s) {
            if (iVar == f16325t) {
                this.f16333j = 0.00390625f;
                return;
            } else if (iVar != f16320o && iVar != f16321p) {
                this.f16333j = 1.0f;
                return;
            } else {
                this.f16333j = 0.00390625f;
                return;
            }
        }
        this.f16333j = 0.1f;
    }
}
