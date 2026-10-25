package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f18952m = new c(1);
    public static final c f18953n = new c(2);
    public static final c f18954o = new c(3);
    public static final c f18955p = new c(4);
    public static final c f18956q = new c(5);
    public static final c f18957r = new c(6);
    public static final c f18958s = new c(7);
    public static final c f18959t = new c(0);
    public float f18960a;
    public float f18961b;
    public boolean f18962c;
    public final Object d;
    public final i e;
    public boolean f18963f;
    public float f18964g;
    public float h;
    public long f18965i;
    public float f18966j;
    public final ArrayList f18967k;
    public final ArrayList f18968l;

    public h(ac.a aVar) {
        this.f18960a = 0.0f;
        this.f18961b = Float.MAX_VALUE;
        this.f18962c = false;
        this.f18963f = false;
        this.f18964g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f18965i = 0L;
        this.f18967k = new ArrayList();
        this.f18968l = new ArrayList();
        this.d = null;
        this.e = new d(aVar, 0);
        this.f18966j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f18967k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f18963f) {
            ArrayList arrayList = this.f18968l;
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
            if (this.f18963f) {
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
        this.f18963f = false;
        ThreadLocal threadLocal = b.f18943f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f18944a.remove(this);
        ArrayList arrayList2 = bVar.f18945b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f18965i = 0L;
        this.f18962c = false;
        while (true) {
            arrayList = this.f18967k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f18961b, this.f18960a);
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
            this.f18966j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void f(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f18968l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f18961b, this.f18960a);
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
        this.f18960a = 0.0f;
        this.f18961b = Float.MAX_VALUE;
        this.f18962c = false;
        this.f18963f = false;
        this.f18964g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f18965i = 0L;
        this.f18967k = new ArrayList();
        this.f18968l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f18956q && iVar != f18957r && iVar != f18958s) {
            if (iVar == f18959t) {
                this.f18966j = 0.00390625f;
                return;
            } else if (iVar != f18954o && iVar != f18955p) {
                this.f18966j = 1.0f;
                return;
            } else {
                this.f18966j = 0.00390625f;
                return;
            }
        }
        this.f18966j = 0.1f;
    }
}
