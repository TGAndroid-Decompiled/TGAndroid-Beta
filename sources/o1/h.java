package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15331m = new c(1);
    public static final c f15332n = new c(2);
    public static final c f15333o = new c(3);
    public static final c f15334p = new c(4);
    public static final c f15335q = new c(5);
    public static final c f15336r = new c(6);
    public static final c f15337s = new c(7);
    public static final c f15338t = new c(0);
    public float f15339a;
    public float f15340b;
    public boolean f15341c;
    public final Object d;
    public final i e;
    public boolean f15342f;
    public float f15343g;
    public float h;
    public long f15344i;
    public float f15345j;
    public final ArrayList f15346k;
    public final ArrayList f15347l;

    public h(j jVar) {
        this.f15339a = 0.0f;
        this.f15340b = Float.MAX_VALUE;
        this.f15341c = false;
        this.f15342f = false;
        this.f15343g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15344i = 0L;
        this.f15346k = new ArrayList();
        this.f15347l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15345j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15346k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15342f) {
            ArrayList arrayList = this.f15347l;
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
            if (this.f15342f) {
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
        this.f15342f = false;
        ThreadLocal threadLocal = b.f15322f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15323a.remove(this);
        ArrayList arrayList2 = bVar.f15324b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15344i = 0L;
        this.f15341c = false;
        while (true) {
            arrayList = this.f15346k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15340b, this.f15339a);
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
            arrayList = this.f15347l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15340b, this.f15339a);
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
        this.f15339a = 0.0f;
        this.f15340b = Float.MAX_VALUE;
        this.f15341c = false;
        this.f15342f = false;
        this.f15343g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15344i = 0L;
        this.f15346k = new ArrayList();
        this.f15347l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15335q && iVar != f15336r && iVar != f15337s) {
            if (iVar == f15338t) {
                this.f15345j = 0.00390625f;
                return;
            } else if (iVar != f15333o && iVar != f15334p) {
                this.f15345j = 1.0f;
                return;
            } else {
                this.f15345j = 0.00390625f;
                return;
            }
        }
        this.f15345j = 0.1f;
    }
}
