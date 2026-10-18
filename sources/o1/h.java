package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f17540m = new c(1);
    public static final c f17541n = new c(2);
    public static final c f17542o = new c(3);
    public static final c f17543p = new c(4);
    public static final c f17544q = new c(5);
    public static final c f17545r = new c(6);
    public static final c f17546s = new c(7);
    public static final c f17547t = new c(0);
    public float f17548a;
    public float f17549b;
    public boolean f17550c;
    public final Object d;
    public final i e;
    public boolean f17551f;
    public float f17552g;
    public float h;
    public long f17553i;
    public float f17554j;
    public final ArrayList f17555k;
    public final ArrayList f17556l;

    public h(j jVar) {
        this.f17548a = 0.0f;
        this.f17549b = Float.MAX_VALUE;
        this.f17550c = false;
        this.f17551f = false;
        this.f17552g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17553i = 0L;
        this.f17555k = new ArrayList();
        this.f17556l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f17554j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f17555k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f17551f) {
            ArrayList arrayList = this.f17556l;
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
            if (this.f17551f) {
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
        this.f17551f = false;
        ThreadLocal threadLocal = b.f17531f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f17532a.remove(this);
        ArrayList arrayList2 = bVar.f17533b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f17553i = 0L;
        this.f17550c = false;
        while (true) {
            arrayList = this.f17555k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f17549b, this.f17548a);
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
            this.f17554j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f17556l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f17549b, this.f17548a);
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
        this.f17548a = 0.0f;
        this.f17549b = Float.MAX_VALUE;
        this.f17550c = false;
        this.f17551f = false;
        this.f17552g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17553i = 0L;
        this.f17555k = new ArrayList();
        this.f17556l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f17544q && iVar != f17545r && iVar != f17546s) {
            if (iVar == f17547t) {
                this.f17554j = 0.00390625f;
                return;
            } else if (iVar != f17542o && iVar != f17543p) {
                this.f17554j = 1.0f;
                return;
            } else {
                this.f17554j = 0.00390625f;
                return;
            }
        }
        this.f17554j = 0.1f;
    }
}
