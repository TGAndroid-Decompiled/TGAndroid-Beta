package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15531m = new c(1);
    public static final c f15532n = new c(2);
    public static final c f15533o = new c(3);
    public static final c f15534p = new c(4);
    public static final c f15535q = new c(5);
    public static final c f15536r = new c(6);
    public static final c f15537s = new c(7);
    public static final c f15538t = new c(0);
    public float f15539a;
    public float f15540b;
    public boolean f15541c;
    public final Object d;
    public final i e;
    public boolean f15542f;
    public float f15543g;
    public float h;
    public long f15544i;
    public float f15545j;
    public final ArrayList f15546k;
    public final ArrayList f15547l;

    public h(j jVar) {
        this.f15539a = 0.0f;
        this.f15540b = Float.MAX_VALUE;
        this.f15541c = false;
        this.f15542f = false;
        this.f15543g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15544i = 0L;
        this.f15546k = new ArrayList();
        this.f15547l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15545j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15546k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15542f) {
            ArrayList arrayList = this.f15547l;
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
            if (this.f15542f) {
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
        this.f15542f = false;
        ThreadLocal threadLocal = b.f15522f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15523a.remove(this);
        ArrayList arrayList2 = bVar.f15524b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15544i = 0L;
        this.f15541c = false;
        while (true) {
            arrayList = this.f15546k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15540b, this.f15539a);
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
            arrayList = this.f15547l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15540b, this.f15539a);
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
        this.f15539a = 0.0f;
        this.f15540b = Float.MAX_VALUE;
        this.f15541c = false;
        this.f15542f = false;
        this.f15543g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15544i = 0L;
        this.f15546k = new ArrayList();
        this.f15547l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15535q && iVar != f15536r && iVar != f15537s) {
            if (iVar == f15538t) {
                this.f15545j = 0.00390625f;
                return;
            } else if (iVar != f15533o && iVar != f15534p) {
                this.f15545j = 1.0f;
                return;
            } else {
                this.f15545j = 0.00390625f;
                return;
            }
        }
        this.f15545j = 0.1f;
    }
}
