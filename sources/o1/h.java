package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f14116m = new c(1);
    public static final c f14117n = new c(2);
    public static final c f14118o = new c(3);
    public static final c f14119p = new c(4);
    public static final c f14120q = new c(5);
    public static final c f14121r = new c(6);
    public static final c f14122s = new c(7);
    public static final c f14123t = new c(0);
    public float f14124a;
    public float f14125b;
    public boolean f14126c;
    public final Object d;
    public final i e;
    public boolean f14127f;
    public float f14128g;
    public float h;
    public long f14129i;
    public float f14130j;
    public final ArrayList f14131k;
    public final ArrayList f14132l;

    public h(j jVar) {
        this.f14124a = 0.0f;
        this.f14125b = Float.MAX_VALUE;
        this.f14126c = false;
        this.f14127f = false;
        this.f14128g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f14129i = 0L;
        this.f14131k = new ArrayList();
        this.f14132l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f14130j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f14131k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f14127f) {
            ArrayList arrayList = this.f14132l;
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
            if (this.f14127f) {
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
        this.f14127f = false;
        ThreadLocal threadLocal = b.f14107f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f14108a.remove(this);
        ArrayList arrayList2 = bVar.f14109b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f14129i = 0L;
        this.f14126c = false;
        while (true) {
            arrayList = this.f14131k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f14125b, this.f14124a);
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
            arrayList = this.f14132l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f14125b, this.f14124a);
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
        this.f14124a = 0.0f;
        this.f14125b = Float.MAX_VALUE;
        this.f14126c = false;
        this.f14127f = false;
        this.f14128g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f14129i = 0L;
        this.f14131k = new ArrayList();
        this.f14132l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f14120q && iVar != f14121r && iVar != f14122s) {
            if (iVar == f14123t) {
                this.f14130j = 0.00390625f;
                return;
            } else if (iVar != f14118o && iVar != f14119p) {
                this.f14130j = 1.0f;
                return;
            } else {
                this.f14130j = 0.00390625f;
                return;
            }
        }
        this.f14130j = 0.1f;
    }
}
