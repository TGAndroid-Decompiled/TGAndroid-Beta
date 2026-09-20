package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15504m = new c(1);
    public static final c f15505n = new c(2);
    public static final c f15506o = new c(3);
    public static final c f15507p = new c(4);
    public static final c f15508q = new c(5);
    public static final c f15509r = new c(6);
    public static final c f15510s = new c(7);
    public static final c f15511t = new c(0);
    public float f15512a;
    public float f15513b;
    public boolean f15514c;
    public final Object d;
    public final i e;
    public boolean f15515f;
    public float f15516g;
    public float h;
    public long f15517i;
    public float f15518j;
    public final ArrayList f15519k;
    public final ArrayList f15520l;

    public h(j jVar) {
        this.f15512a = 0.0f;
        this.f15513b = Float.MAX_VALUE;
        this.f15514c = false;
        this.f15515f = false;
        this.f15516g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15517i = 0L;
        this.f15519k = new ArrayList();
        this.f15520l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15518j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15519k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15515f) {
            ArrayList arrayList = this.f15520l;
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
            if (this.f15515f) {
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
        this.f15515f = false;
        ThreadLocal threadLocal = b.f15495f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15496a.remove(this);
        ArrayList arrayList2 = bVar.f15497b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15517i = 0L;
        this.f15514c = false;
        while (true) {
            arrayList = this.f15519k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15513b, this.f15512a);
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
            arrayList = this.f15520l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15513b, this.f15512a);
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
        this.f15512a = 0.0f;
        this.f15513b = Float.MAX_VALUE;
        this.f15514c = false;
        this.f15515f = false;
        this.f15516g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15517i = 0L;
        this.f15519k = new ArrayList();
        this.f15520l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15508q && iVar != f15509r && iVar != f15510s) {
            if (iVar == f15511t) {
                this.f15518j = 0.00390625f;
                return;
            } else if (iVar != f15506o && iVar != f15507p) {
                this.f15518j = 1.0f;
                return;
            } else {
                this.f15518j = 0.00390625f;
                return;
            }
        }
        this.f15518j = 0.1f;
    }
}
