package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16143m = new c(1);
    public static final c f16144n = new c(2);
    public static final c f16145o = new c(3);
    public static final c f16146p = new c(4);
    public static final c f16147q = new c(5);
    public static final c f16148r = new c(6);
    public static final c f16149s = new c(7);
    public static final c f16150t = new c(0);
    public float f16151a;
    public float f16152b;
    public boolean f16153c;
    public final Object d;
    public final i e;
    public boolean f16154f;
    public float f16155g;
    public float h;
    public long f16156i;
    public float f16157j;
    public final ArrayList f16158k;
    public final ArrayList f16159l;

    public h(j jVar) {
        this.f16151a = 0.0f;
        this.f16152b = Float.MAX_VALUE;
        this.f16153c = false;
        this.f16154f = false;
        this.f16155g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16156i = 0L;
        this.f16158k = new ArrayList();
        this.f16159l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f16157j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16158k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16154f) {
            ArrayList arrayList = this.f16159l;
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
            if (this.f16154f) {
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
        this.f16154f = false;
        ThreadLocal threadLocal = b.f16134f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16135a.remove(this);
        ArrayList arrayList2 = bVar.f16136b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f16156i = 0L;
        this.f16153c = false;
        while (true) {
            arrayList = this.f16158k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16152b, this.f16151a);
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
            this.f16157j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16159l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16152b, this.f16151a);
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
        this.f16151a = 0.0f;
        this.f16152b = Float.MAX_VALUE;
        this.f16153c = false;
        this.f16154f = false;
        this.f16155g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16156i = 0L;
        this.f16158k = new ArrayList();
        this.f16159l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f16147q && iVar != f16148r && iVar != f16149s) {
            if (iVar == f16150t) {
                this.f16157j = 0.00390625f;
                return;
            } else if (iVar != f16145o && iVar != f16146p) {
                this.f16157j = 1.0f;
                return;
            } else {
                this.f16157j = 0.00390625f;
                return;
            }
        }
        this.f16157j = 0.1f;
    }
}
