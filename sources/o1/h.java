package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16965m = new c(1);
    public static final c f16966n = new c(2);
    public static final c f16967o = new c(3);
    public static final c f16968p = new c(4);
    public static final c f16969q = new c(5);
    public static final c f16970r = new c(6);
    public static final c f16971s = new c(7);
    public static final c f16972t = new c(0);
    public float f16973a;
    public float f16974b;
    public boolean f16975c;
    public final Object d;
    public final i f16976e;
    public boolean f16977f;
    public float f16978g;
    public float h;
    public long f16979i;
    public float f16980j;
    public final ArrayList f16981k;
    public final ArrayList f16982l;

    public h(j jVar) {
        this.f16973a = 0.0f;
        this.f16974b = Float.MAX_VALUE;
        this.f16975c = false;
        this.f16977f = false;
        this.f16978g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16979i = 0L;
        this.f16981k = new ArrayList();
        this.f16982l = new ArrayList();
        this.d = null;
        this.f16976e = new d(jVar, 0);
        this.f16980j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16981k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16977f) {
            ArrayList arrayList = this.f16982l;
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
            if (this.f16977f) {
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
        this.f16977f = false;
        ThreadLocal threadLocal = b.f16955f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16956a.remove(this);
        ArrayList arrayList2 = bVar.f16957b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16959e = true;
        }
        this.f16979i = 0L;
        this.f16975c = false;
        while (true) {
            arrayList = this.f16981k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16974b, this.f16973a);
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
        this.f16976e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16982l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16974b, this.f16973a);
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
        this.f16973a = 0.0f;
        this.f16974b = Float.MAX_VALUE;
        this.f16975c = false;
        this.f16977f = false;
        this.f16978g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16979i = 0L;
        this.f16981k = new ArrayList();
        this.f16982l = new ArrayList();
        this.d = obj;
        this.f16976e = iVar;
        if (iVar != f16969q && iVar != f16970r && iVar != f16971s) {
            if (iVar == f16972t) {
                this.f16980j = 0.00390625f;
                return;
            } else if (iVar != f16967o && iVar != f16968p) {
                this.f16980j = 1.0f;
                return;
            } else {
                this.f16980j = 0.00390625f;
                return;
            }
        }
        this.f16980j = 0.1f;
    }
}
