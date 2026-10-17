package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f17537m = new c(1);
    public static final c f17538n = new c(2);
    public static final c f17539o = new c(3);
    public static final c f17540p = new c(4);
    public static final c f17541q = new c(5);
    public static final c f17542r = new c(6);
    public static final c f17543s = new c(7);
    public static final c f17544t = new c(0);
    public float f17545a;
    public float f17546b;
    public boolean f17547c;
    public final Object d;
    public final i e;
    public boolean f17548f;
    public float f17549g;
    public float h;
    public long f17550i;
    public float f17551j;
    public final ArrayList f17552k;
    public final ArrayList f17553l;

    public h(j jVar) {
        this.f17545a = 0.0f;
        this.f17546b = Float.MAX_VALUE;
        this.f17547c = false;
        this.f17548f = false;
        this.f17549g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17550i = 0L;
        this.f17552k = new ArrayList();
        this.f17553l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f17551j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f17552k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f17548f) {
            ArrayList arrayList = this.f17553l;
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
            if (this.f17548f) {
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
        this.f17548f = false;
        ThreadLocal threadLocal = b.f17528f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f17529a.remove(this);
        ArrayList arrayList2 = bVar.f17530b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f17550i = 0L;
        this.f17547c = false;
        while (true) {
            arrayList = this.f17552k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f17546b, this.f17545a);
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
            this.f17551j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f17553l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f17546b, this.f17545a);
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
        this.f17545a = 0.0f;
        this.f17546b = Float.MAX_VALUE;
        this.f17547c = false;
        this.f17548f = false;
        this.f17549g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17550i = 0L;
        this.f17552k = new ArrayList();
        this.f17553l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f17541q && iVar != f17542r && iVar != f17543s) {
            if (iVar == f17544t) {
                this.f17551j = 0.00390625f;
                return;
            } else if (iVar != f17539o && iVar != f17540p) {
                this.f17551j = 1.0f;
                return;
            } else {
                this.f17551j = 0.00390625f;
                return;
            }
        }
        this.f17551j = 0.1f;
    }
}
