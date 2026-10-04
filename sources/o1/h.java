package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16964m = new c(1);
    public static final c f16965n = new c(2);
    public static final c f16966o = new c(3);
    public static final c f16967p = new c(4);
    public static final c f16968q = new c(5);
    public static final c f16969r = new c(6);
    public static final c f16970s = new c(7);
    public static final c f16971t = new c(0);
    public float f16972a;
    public float f16973b;
    public boolean f16974c;
    public final Object d;
    public final i f16975e;
    public boolean f16976f;
    public float f16977g;
    public float h;
    public long f16978i;
    public float f16979j;
    public final ArrayList f16980k;
    public final ArrayList f16981l;

    public h(j jVar) {
        this.f16972a = 0.0f;
        this.f16973b = Float.MAX_VALUE;
        this.f16974c = false;
        this.f16976f = false;
        this.f16977g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16978i = 0L;
        this.f16980k = new ArrayList();
        this.f16981l = new ArrayList();
        this.d = null;
        this.f16975e = new d(jVar, 0);
        this.f16979j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16980k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16976f) {
            ArrayList arrayList = this.f16981l;
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
            if (this.f16976f) {
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
        this.f16976f = false;
        ThreadLocal threadLocal = b.f16954f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16955a.remove(this);
        ArrayList arrayList2 = bVar.f16956b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16958e = true;
        }
        this.f16978i = 0L;
        this.f16974c = false;
        while (true) {
            arrayList = this.f16980k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16973b, this.f16972a);
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
        this.f16975e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16981l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16973b, this.f16972a);
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
        this.f16972a = 0.0f;
        this.f16973b = Float.MAX_VALUE;
        this.f16974c = false;
        this.f16976f = false;
        this.f16977g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16978i = 0L;
        this.f16980k = new ArrayList();
        this.f16981l = new ArrayList();
        this.d = obj;
        this.f16975e = iVar;
        if (iVar != f16968q && iVar != f16969r && iVar != f16970s) {
            if (iVar == f16971t) {
                this.f16979j = 0.00390625f;
                return;
            } else if (iVar != f16966o && iVar != f16967p) {
                this.f16979j = 1.0f;
                return;
            } else {
                this.f16979j = 0.00390625f;
                return;
            }
        }
        this.f16979j = 0.1f;
    }
}
