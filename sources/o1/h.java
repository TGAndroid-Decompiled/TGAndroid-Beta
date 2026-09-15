package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15333m = new c(1);
    public static final c f15334n = new c(2);
    public static final c f15335o = new c(3);
    public static final c f15336p = new c(4);
    public static final c f15337q = new c(5);
    public static final c f15338r = new c(6);
    public static final c f15339s = new c(7);
    public static final c f15340t = new c(0);
    public float f15341a;
    public float f15342b;
    public boolean f15343c;
    public final Object d;
    public final i e;
    public boolean f15344f;
    public float f15345g;
    public float h;
    public long f15346i;
    public float f15347j;
    public final ArrayList f15348k;
    public final ArrayList f15349l;

    public h(j jVar) {
        this.f15341a = 0.0f;
        this.f15342b = Float.MAX_VALUE;
        this.f15343c = false;
        this.f15344f = false;
        this.f15345g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15346i = 0L;
        this.f15348k = new ArrayList();
        this.f15349l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15347j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15348k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15344f) {
            ArrayList arrayList = this.f15349l;
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
            if (this.f15344f) {
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
        this.f15344f = false;
        ThreadLocal threadLocal = b.f15324f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15325a.remove(this);
        ArrayList arrayList2 = bVar.f15326b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15346i = 0L;
        this.f15343c = false;
        while (true) {
            arrayList = this.f15348k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15342b, this.f15341a);
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
            arrayList = this.f15349l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15342b, this.f15341a);
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
        this.f15341a = 0.0f;
        this.f15342b = Float.MAX_VALUE;
        this.f15343c = false;
        this.f15344f = false;
        this.f15345g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15346i = 0L;
        this.f15348k = new ArrayList();
        this.f15349l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15337q && iVar != f15338r && iVar != f15339s) {
            if (iVar == f15340t) {
                this.f15347j = 0.00390625f;
                return;
            } else if (iVar != f15335o && iVar != f15336p) {
                this.f15347j = 1.0f;
                return;
            } else {
                this.f15347j = 0.00390625f;
                return;
            }
        }
        this.f15347j = 0.1f;
    }
}
