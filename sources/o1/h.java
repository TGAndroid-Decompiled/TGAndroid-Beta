package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f17543m = new c(1);
    public static final c f17544n = new c(2);
    public static final c f17545o = new c(3);
    public static final c f17546p = new c(4);
    public static final c f17547q = new c(5);
    public static final c f17548r = new c(6);
    public static final c f17549s = new c(7);
    public static final c f17550t = new c(0);
    public float f17551a;
    public float f17552b;
    public boolean f17553c;
    public final Object d;
    public final i e;
    public boolean f17554f;
    public float f17555g;
    public float h;
    public long f17556i;
    public float f17557j;
    public final ArrayList f17558k;
    public final ArrayList f17559l;

    public h(j jVar) {
        this.f17551a = 0.0f;
        this.f17552b = Float.MAX_VALUE;
        this.f17553c = false;
        this.f17554f = false;
        this.f17555g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17556i = 0L;
        this.f17558k = new ArrayList();
        this.f17559l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f17557j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f17558k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f17554f) {
            ArrayList arrayList = this.f17559l;
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
            if (this.f17554f) {
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
        this.f17554f = false;
        ThreadLocal threadLocal = b.f17534f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f17535a.remove(this);
        ArrayList arrayList2 = bVar.f17536b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f17556i = 0L;
        this.f17553c = false;
        while (true) {
            arrayList = this.f17558k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f17552b, this.f17551a);
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
            this.f17557j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f17559l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f17552b, this.f17551a);
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
        this.f17551a = 0.0f;
        this.f17552b = Float.MAX_VALUE;
        this.f17553c = false;
        this.f17554f = false;
        this.f17555g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17556i = 0L;
        this.f17558k = new ArrayList();
        this.f17559l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f17547q && iVar != f17548r && iVar != f17549s) {
            if (iVar == f17550t) {
                this.f17557j = 0.00390625f;
                return;
            } else if (iVar != f17545o && iVar != f17546p) {
                this.f17557j = 1.0f;
                return;
            } else {
                this.f17557j = 0.00390625f;
                return;
            }
        }
        this.f17557j = 0.1f;
    }
}
