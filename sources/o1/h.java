package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f17005m = new c(1);
    public static final c f17006n = new c(2);
    public static final c f17007o = new c(3);
    public static final c f17008p = new c(4);
    public static final c f17009q = new c(5);
    public static final c f17010r = new c(6);
    public static final c f17011s = new c(7);
    public static final c f17012t = new c(0);
    public float f17013a;
    public float f17014b;
    public boolean f17015c;
    public final Object d;
    public final i f17016e;
    public boolean f17017f;
    public float f17018g;
    public float h;
    public long f17019i;
    public float f17020j;
    public final ArrayList f17021k;
    public final ArrayList f17022l;

    public h(j jVar) {
        this.f17013a = 0.0f;
        this.f17014b = Float.MAX_VALUE;
        this.f17015c = false;
        this.f17017f = false;
        this.f17018g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17019i = 0L;
        this.f17021k = new ArrayList();
        this.f17022l = new ArrayList();
        this.d = null;
        this.f17016e = new d(jVar, 0);
        this.f17020j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f17021k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f17017f) {
            ArrayList arrayList = this.f17022l;
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
            if (this.f17017f) {
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
        this.f17017f = false;
        ThreadLocal threadLocal = b.f16995f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16996a.remove(this);
        ArrayList arrayList2 = bVar.f16997b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16999e = true;
        }
        this.f17019i = 0L;
        this.f17015c = false;
        while (true) {
            arrayList = this.f17021k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f17014b, this.f17013a);
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
            this.f17020j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.f17016e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f17022l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f17014b, this.f17013a);
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
        this.f17013a = 0.0f;
        this.f17014b = Float.MAX_VALUE;
        this.f17015c = false;
        this.f17017f = false;
        this.f17018g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17019i = 0L;
        this.f17021k = new ArrayList();
        this.f17022l = new ArrayList();
        this.d = obj;
        this.f17016e = iVar;
        if (iVar != f17009q && iVar != f17010r && iVar != f17011s) {
            if (iVar == f17012t) {
                this.f17020j = 0.00390625f;
                return;
            } else if (iVar != f17007o && iVar != f17008p) {
                this.f17020j = 1.0f;
                return;
            } else {
                this.f17020j = 0.00390625f;
                return;
            }
        }
        this.f17020j = 0.1f;
    }
}
