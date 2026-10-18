package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f17544m = new c(1);
    public static final c f17545n = new c(2);
    public static final c f17546o = new c(3);
    public static final c f17547p = new c(4);
    public static final c f17548q = new c(5);
    public static final c f17549r = new c(6);
    public static final c f17550s = new c(7);
    public static final c f17551t = new c(0);
    public float f17552a;
    public float f17553b;
    public boolean f17554c;
    public final Object d;
    public final i e;
    public boolean f17555f;
    public float f17556g;
    public float h;
    public long f17557i;
    public float f17558j;
    public final ArrayList f17559k;
    public final ArrayList f17560l;

    public h(j jVar) {
        this.f17552a = 0.0f;
        this.f17553b = Float.MAX_VALUE;
        this.f17554c = false;
        this.f17555f = false;
        this.f17556g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17557i = 0L;
        this.f17559k = new ArrayList();
        this.f17560l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f17558j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f17559k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f17555f) {
            ArrayList arrayList = this.f17560l;
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
            if (this.f17555f) {
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
        this.f17555f = false;
        ThreadLocal threadLocal = b.f17535f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f17536a.remove(this);
        ArrayList arrayList2 = bVar.f17537b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f17557i = 0L;
        this.f17554c = false;
        while (true) {
            arrayList = this.f17559k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f17553b, this.f17552a);
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
            this.f17558j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f17560l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f17553b, this.f17552a);
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
        this.f17552a = 0.0f;
        this.f17553b = Float.MAX_VALUE;
        this.f17554c = false;
        this.f17555f = false;
        this.f17556g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f17557i = 0L;
        this.f17559k = new ArrayList();
        this.f17560l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f17548q && iVar != f17549r && iVar != f17550s) {
            if (iVar == f17551t) {
                this.f17558j = 0.00390625f;
                return;
            } else if (iVar != f17546o && iVar != f17547p) {
                this.f17558j = 1.0f;
                return;
            } else {
                this.f17558j = 0.00390625f;
                return;
            }
        }
        this.f17558j = 0.1f;
    }
}
