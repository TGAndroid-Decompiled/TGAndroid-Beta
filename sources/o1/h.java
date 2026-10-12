package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16450m = new c(1);
    public static final c f16451n = new c(2);
    public static final c f16452o = new c(3);
    public static final c f16453p = new c(4);
    public static final c f16454q = new c(5);
    public static final c f16455r = new c(6);
    public static final c f16456s = new c(7);
    public static final c f16457t = new c(0);
    public float f16458a;
    public float f16459b;
    public boolean f16460c;
    public final Object d;
    public final i e;
    public boolean f16461f;
    public float f16462g;
    public float h;
    public long f16463i;
    public float f16464j;
    public final ArrayList f16465k;
    public final ArrayList f16466l;

    public h(j jVar) {
        this.f16458a = 0.0f;
        this.f16459b = Float.MAX_VALUE;
        this.f16460c = false;
        this.f16461f = false;
        this.f16462g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16463i = 0L;
        this.f16465k = new ArrayList();
        this.f16466l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f16464j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16465k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16461f) {
            ArrayList arrayList = this.f16466l;
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
            if (this.f16461f) {
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
        this.f16461f = false;
        ThreadLocal threadLocal = b.f16441f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16442a.remove(this);
        ArrayList arrayList2 = bVar.f16443b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f16463i = 0L;
        this.f16460c = false;
        while (true) {
            arrayList = this.f16465k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16459b, this.f16458a);
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
            this.f16464j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16466l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16459b, this.f16458a);
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
        this.f16458a = 0.0f;
        this.f16459b = Float.MAX_VALUE;
        this.f16460c = false;
        this.f16461f = false;
        this.f16462g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16463i = 0L;
        this.f16465k = new ArrayList();
        this.f16466l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f16454q && iVar != f16455r && iVar != f16456s) {
            if (iVar == f16457t) {
                this.f16464j = 0.00390625f;
                return;
            } else if (iVar != f16452o && iVar != f16453p) {
                this.f16464j = 1.0f;
                return;
            } else {
                this.f16464j = 0.00390625f;
                return;
            }
        }
        this.f16464j = 0.1f;
    }
}
