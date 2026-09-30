package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15516m = new c(1);
    public static final c f15517n = new c(2);
    public static final c f15518o = new c(3);
    public static final c f15519p = new c(4);
    public static final c f15520q = new c(5);
    public static final c f15521r = new c(6);
    public static final c f15522s = new c(7);
    public static final c f15523t = new c(0);
    public float f15524a;
    public float f15525b;
    public boolean f15526c;
    public final Object d;
    public final i e;
    public boolean f15527f;
    public float f15528g;
    public float h;
    public long f15529i;
    public float f15530j;
    public final ArrayList f15531k;
    public final ArrayList f15532l;

    public h(j jVar) {
        this.f15524a = 0.0f;
        this.f15525b = Float.MAX_VALUE;
        this.f15526c = false;
        this.f15527f = false;
        this.f15528g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15529i = 0L;
        this.f15531k = new ArrayList();
        this.f15532l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15530j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15531k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15527f) {
            ArrayList arrayList = this.f15532l;
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
            if (this.f15527f) {
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
        this.f15527f = false;
        ThreadLocal threadLocal = b.f15507f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15508a.remove(this);
        ArrayList arrayList2 = bVar.f15509b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15529i = 0L;
        this.f15526c = false;
        while (true) {
            arrayList = this.f15531k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15525b, this.f15524a);
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
            arrayList = this.f15532l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15525b, this.f15524a);
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
        this.f15524a = 0.0f;
        this.f15525b = Float.MAX_VALUE;
        this.f15526c = false;
        this.f15527f = false;
        this.f15528g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15529i = 0L;
        this.f15531k = new ArrayList();
        this.f15532l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15520q && iVar != f15521r && iVar != f15522s) {
            if (iVar == f15523t) {
                this.f15530j = 0.00390625f;
                return;
            } else if (iVar != f15518o && iVar != f15519p) {
                this.f15530j = 1.0f;
                return;
            } else {
                this.f15530j = 0.00390625f;
                return;
            }
        }
        this.f15530j = 0.1f;
    }
}
