package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16974m = new c(1);
    public static final c f16975n = new c(2);
    public static final c f16976o = new c(3);
    public static final c f16977p = new c(4);
    public static final c f16978q = new c(5);
    public static final c f16979r = new c(6);
    public static final c f16980s = new c(7);
    public static final c f16981t = new c(0);
    public float f16982a;
    public float f16983b;
    public boolean f16984c;
    public final Object d;
    public final i f16985e;
    public boolean f16986f;
    public float f16987g;
    public float h;
    public long f16988i;
    public float f16989j;
    public final ArrayList f16990k;
    public final ArrayList f16991l;

    public h(j jVar) {
        this.f16982a = 0.0f;
        this.f16983b = Float.MAX_VALUE;
        this.f16984c = false;
        this.f16986f = false;
        this.f16987g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16988i = 0L;
        this.f16990k = new ArrayList();
        this.f16991l = new ArrayList();
        this.d = null;
        this.f16985e = new d(jVar, 0);
        this.f16989j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16990k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16986f) {
            ArrayList arrayList = this.f16991l;
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
            if (this.f16986f) {
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
        this.f16986f = false;
        ThreadLocal threadLocal = b.f16964f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16965a.remove(this);
        ArrayList arrayList2 = bVar.f16966b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16968e = true;
        }
        this.f16988i = 0L;
        this.f16984c = false;
        while (true) {
            arrayList = this.f16990k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16983b, this.f16982a);
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
        this.f16985e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16991l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16983b, this.f16982a);
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
        this.f16982a = 0.0f;
        this.f16983b = Float.MAX_VALUE;
        this.f16984c = false;
        this.f16986f = false;
        this.f16987g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16988i = 0L;
        this.f16990k = new ArrayList();
        this.f16991l = new ArrayList();
        this.d = obj;
        this.f16985e = iVar;
        if (iVar != f16978q && iVar != f16979r && iVar != f16980s) {
            if (iVar == f16981t) {
                this.f16989j = 0.00390625f;
                return;
            } else if (iVar != f16976o && iVar != f16977p) {
                this.f16989j = 1.0f;
                return;
            } else {
                this.f16989j = 0.00390625f;
                return;
            }
        }
        this.f16989j = 0.1f;
    }
}
