package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16806m = new c(1);
    public static final c f16807n = new c(2);
    public static final c f16808o = new c(3);
    public static final c f16809p = new c(4);
    public static final c f16810q = new c(5);
    public static final c f16811r = new c(6);
    public static final c f16812s = new c(7);
    public static final c f16813t = new c(0);
    public float f16814a;
    public float f16815b;
    public boolean f16816c;
    public final Object d;
    public final i f16817e;
    public boolean f16818f;
    public float f16819g;
    public float h;
    public long f16820i;
    public float f16821j;
    public final ArrayList f16822k;
    public final ArrayList f16823l;

    public h(j jVar) {
        this.f16814a = 0.0f;
        this.f16815b = Float.MAX_VALUE;
        this.f16816c = false;
        this.f16818f = false;
        this.f16819g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16820i = 0L;
        this.f16822k = new ArrayList();
        this.f16823l = new ArrayList();
        this.d = null;
        this.f16817e = new d(jVar, 0);
        this.f16821j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16822k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16818f) {
            ArrayList arrayList = this.f16823l;
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
            if (this.f16818f) {
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
        this.f16818f = false;
        ThreadLocal threadLocal = b.f16796f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16797a.remove(this);
        ArrayList arrayList2 = bVar.f16798b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16800e = true;
        }
        this.f16820i = 0L;
        this.f16816c = false;
        while (true) {
            arrayList = this.f16822k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16815b, this.f16814a);
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
        this.f16817e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16823l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16815b, this.f16814a);
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
        this.f16814a = 0.0f;
        this.f16815b = Float.MAX_VALUE;
        this.f16816c = false;
        this.f16818f = false;
        this.f16819g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16820i = 0L;
        this.f16822k = new ArrayList();
        this.f16823l = new ArrayList();
        this.d = obj;
        this.f16817e = iVar;
        if (iVar != f16810q && iVar != f16811r && iVar != f16812s) {
            if (iVar == f16813t) {
                this.f16821j = 0.00390625f;
                return;
            } else if (iVar != f16808o && iVar != f16809p) {
                this.f16821j = 1.0f;
                return;
            } else {
                this.f16821j = 0.00390625f;
                return;
            }
        }
        this.f16821j = 0.1f;
    }
}
