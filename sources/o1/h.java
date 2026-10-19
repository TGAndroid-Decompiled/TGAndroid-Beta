package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f17541m = new c(1);
    public static final c f17542n = new c(2);
    public static final c f17543o = new c(3);
    public static final c f17544p = new c(4);
    public static final c f17545q = new c(5);
    public static final c f17546r = new c(6);
    public static final c f17547s = new c(7);
    public static final c f17548t = new c(0);
    public float f17549a;
    public float f17550b;
    public boolean f17551c;
    public final Object d;
    public final i e;
    public boolean f17552f;
    public float f17553g;
    public float h;
    public long f17554i;
    public float f17555j;
    public final ArrayList f17556k;
    public final ArrayList f17557l;

    public h(j jVar) {
        this.f17549a = 0.0f;
        this.f17550b = Float.MAX_VALUE;
        this.f17551c = false;
        this.f17552f = false;
        this.f17553g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17554i = 0L;
        this.f17556k = new ArrayList();
        this.f17557l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f17555j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f17556k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f17552f) {
            ArrayList arrayList = this.f17557l;
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
            if (this.f17552f) {
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
        this.f17552f = false;
        ThreadLocal threadLocal = b.f17532f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f17533a.remove(this);
        ArrayList arrayList2 = bVar.f17534b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f17554i = 0L;
        this.f17551c = false;
        while (true) {
            arrayList = this.f17556k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f17550b, this.f17549a);
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
            this.f17555j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f17557l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f17550b, this.f17549a);
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
        this.f17549a = 0.0f;
        this.f17550b = Float.MAX_VALUE;
        this.f17551c = false;
        this.f17552f = false;
        this.f17553g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17554i = 0L;
        this.f17556k = new ArrayList();
        this.f17557l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f17545q && iVar != f17546r && iVar != f17547s) {
            if (iVar == f17548t) {
                this.f17555j = 0.00390625f;
                return;
            } else if (iVar != f17543o && iVar != f17544p) {
                this.f17555j = 1.0f;
                return;
            } else {
                this.f17555j = 0.00390625f;
                return;
            }
        }
        this.f17555j = 0.1f;
    }
}
