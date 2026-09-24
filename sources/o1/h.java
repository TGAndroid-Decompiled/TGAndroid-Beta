package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15500m = new c(1);
    public static final c f15501n = new c(2);
    public static final c f15502o = new c(3);
    public static final c f15503p = new c(4);
    public static final c f15504q = new c(5);
    public static final c f15505r = new c(6);
    public static final c f15506s = new c(7);
    public static final c f15507t = new c(0);
    public float f15508a;
    public float f15509b;
    public boolean f15510c;
    public final Object d;
    public final i e;
    public boolean f15511f;
    public float f15512g;
    public float h;
    public long f15513i;
    public float f15514j;
    public final ArrayList f15515k;
    public final ArrayList f15516l;

    public h(j jVar) {
        this.f15508a = 0.0f;
        this.f15509b = Float.MAX_VALUE;
        this.f15510c = false;
        this.f15511f = false;
        this.f15512g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15513i = 0L;
        this.f15515k = new ArrayList();
        this.f15516l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15514j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15515k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15511f) {
            ArrayList arrayList = this.f15516l;
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
            if (this.f15511f) {
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
        this.f15511f = false;
        ThreadLocal threadLocal = b.f15491f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15492a.remove(this);
        ArrayList arrayList2 = bVar.f15493b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15513i = 0L;
        this.f15510c = false;
        while (true) {
            arrayList = this.f15515k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15509b, this.f15508a);
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
            arrayList = this.f15516l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15509b, this.f15508a);
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
        this.f15508a = 0.0f;
        this.f15509b = Float.MAX_VALUE;
        this.f15510c = false;
        this.f15511f = false;
        this.f15512g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15513i = 0L;
        this.f15515k = new ArrayList();
        this.f15516l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15504q && iVar != f15505r && iVar != f15506s) {
            if (iVar == f15507t) {
                this.f15514j = 0.00390625f;
                return;
            } else if (iVar != f15502o && iVar != f15503p) {
                this.f15514j = 1.0f;
                return;
            } else {
                this.f15514j = 0.00390625f;
                return;
            }
        }
        this.f15514j = 0.1f;
    }
}
