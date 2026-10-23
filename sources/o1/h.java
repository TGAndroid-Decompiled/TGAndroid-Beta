package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f17604m = new c(1);
    public static final c f17605n = new c(2);
    public static final c f17606o = new c(3);
    public static final c f17607p = new c(4);
    public static final c f17608q = new c(5);
    public static final c f17609r = new c(6);
    public static final c f17610s = new c(7);
    public static final c f17611t = new c(0);
    public float f17612a;
    public float f17613b;
    public boolean f17614c;
    public final Object d;
    public final i e;
    public boolean f17615f;
    public float f17616g;
    public float h;
    public long f17617i;
    public float f17618j;
    public final ArrayList f17619k;
    public final ArrayList f17620l;

    public h(j jVar) {
        this.f17612a = 0.0f;
        this.f17613b = Float.MAX_VALUE;
        this.f17614c = false;
        this.f17615f = false;
        this.f17616g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17617i = 0L;
        this.f17619k = new ArrayList();
        this.f17620l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f17618j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f17619k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f17615f) {
            ArrayList arrayList = this.f17620l;
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
            if (this.f17615f) {
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
        this.f17615f = false;
        ThreadLocal threadLocal = b.f17595f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f17596a.remove(this);
        ArrayList arrayList2 = bVar.f17597b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f17617i = 0L;
        this.f17614c = false;
        while (true) {
            arrayList = this.f17619k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f17613b, this.f17612a);
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
        if (f7 > 0.0f) {
            this.f17618j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f17620l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f17613b, this.f17612a);
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
        this.f17612a = 0.0f;
        this.f17613b = Float.MAX_VALUE;
        this.f17614c = false;
        this.f17615f = false;
        this.f17616g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17617i = 0L;
        this.f17619k = new ArrayList();
        this.f17620l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f17608q && iVar != f17609r && iVar != f17610s) {
            if (iVar == f17611t) {
                this.f17618j = 0.00390625f;
                return;
            } else if (iVar != f17606o && iVar != f17607p) {
                this.f17618j = 1.0f;
                return;
            } else {
                this.f17618j = 0.00390625f;
                return;
            }
        }
        this.f17618j = 0.1f;
    }
}
