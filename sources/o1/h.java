package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15519m = new c(1);
    public static final c f15520n = new c(2);
    public static final c f15521o = new c(3);
    public static final c f15522p = new c(4);
    public static final c f15523q = new c(5);
    public static final c f15524r = new c(6);
    public static final c f15525s = new c(7);
    public static final c f15526t = new c(0);
    public float f15527a;
    public float f15528b;
    public boolean f15529c;
    public final Object d;
    public final i e;
    public boolean f15530f;
    public float f15531g;
    public float h;
    public long f15532i;
    public float f15533j;
    public final ArrayList f15534k;
    public final ArrayList f15535l;

    public h(j jVar) {
        this.f15527a = 0.0f;
        this.f15528b = Float.MAX_VALUE;
        this.f15529c = false;
        this.f15530f = false;
        this.f15531g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15532i = 0L;
        this.f15534k = new ArrayList();
        this.f15535l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15533j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15534k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15530f) {
            ArrayList arrayList = this.f15535l;
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
            if (this.f15530f) {
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
        this.f15530f = false;
        ThreadLocal threadLocal = b.f15510f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15511a.remove(this);
        ArrayList arrayList2 = bVar.f15512b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15532i = 0L;
        this.f15529c = false;
        while (true) {
            arrayList = this.f15534k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15528b, this.f15527a);
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
            arrayList = this.f15535l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15528b, this.f15527a);
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
        this.f15527a = 0.0f;
        this.f15528b = Float.MAX_VALUE;
        this.f15529c = false;
        this.f15530f = false;
        this.f15531g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15532i = 0L;
        this.f15534k = new ArrayList();
        this.f15535l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15523q && iVar != f15524r && iVar != f15525s) {
            if (iVar == f15526t) {
                this.f15533j = 0.00390625f;
                return;
            } else if (iVar != f15521o && iVar != f15522p) {
                this.f15533j = 1.0f;
                return;
            } else {
                this.f15533j = 0.00390625f;
                return;
            }
        }
        this.f15533j = 0.1f;
    }
}
