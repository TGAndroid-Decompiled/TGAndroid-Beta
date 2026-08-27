package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

public abstract class h {

    public static final c f19129m = new c(1);

    public static final c f19130n = new c(2);

    public static final c f19131o = new c(3);

    public static final c f19132p = new c(4);

    public static final c f19133q = new c(5);

    public static final c f19134r = new c(6);

    public static final c f19135s = new c(7);

    public static final c f19136t = new c(0);

    public float f19137a;

    public float f19138b;

    public boolean f19139c;
    public final Object d;

    public final i f19140e;

    public boolean f19141f;

    public float f19142g;
    public float h;

    public long f19143i;

    public float f19144j;

    public final ArrayList f19145k;

    public final ArrayList f19146l;

    public h(hb.a aVar) {
        this.f19137a = 0.0f;
        this.f19138b = Float.MAX_VALUE;
        this.f19139c = false;
        this.f19141f = false;
        this.f19142g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f19143i = 0L;
        this.f19145k = new ArrayList();
        this.f19146l = new ArrayList();
        this.d = null;
        this.f19140e = new d(aVar, 0);
        this.f19144j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f19145k;
        if (arrayList.contains(fVar)) {
            return;
        }
        arrayList.add(fVar);
    }

    public final void b(g gVar) {
        if (this.f19141f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = this.f19146l;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f19141f) {
            d(true);
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList;
        int i10 = 0;
        this.f19141f = false;
        ThreadLocal threadLocal = b.f19119f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f19120a.remove(this);
        ArrayList arrayList2 = bVar.f19121b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            bVar.f19123e = true;
        }
        this.f19143i = 0L;
        this.f19139c = false;
        while (true) {
            arrayList = this.f19145k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f19138b, this.f19137a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f10) {
        ArrayList arrayList;
        this.f19140e.b(this.d, f10);
        int i10 = 0;
        while (true) {
            arrayList = this.f19146l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f19138b, this.f19137a);
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
        this.f19137a = 0.0f;
        this.f19138b = Float.MAX_VALUE;
        this.f19139c = false;
        this.f19141f = false;
        this.f19142g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f19143i = 0L;
        this.f19145k = new ArrayList();
        this.f19146l = new ArrayList();
        this.d = obj;
        this.f19140e = iVar;
        if (iVar != f19133q && iVar != f19134r && iVar != f19135s) {
            if (iVar == f19136t) {
                this.f19144j = 0.00390625f;
                return;
            } else if (iVar != f19131o && iVar != f19132p) {
                this.f19144j = 1.0f;
                return;
            } else {
                this.f19144j = 0.00390625f;
                return;
            }
        }
        this.f19144j = 0.1f;
    }
}
