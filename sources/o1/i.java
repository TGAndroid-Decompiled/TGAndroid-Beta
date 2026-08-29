package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class i {
    public static final d f19027m = new d(1);
    public static final d f19028n = new d(2);
    public static final d f19029o = new d(3);
    public static final d f19030p = new d(4);
    public static final d f19031q = new d(5);
    public static final d f19032r = new d(6);
    public static final d f19033s = new d(7);
    public static final d f19034t = new d(0);
    public float f19035a;
    public float f19036b;
    public boolean f19037c;
    public final Object d;
    public final j f19038e;
    public boolean f19039f;
    public float f19040g;
    public float h;
    public long f19041i;
    public float f19042j;
    public final ArrayList f19043k;
    public final ArrayList f19044l;

    public i(ib.a aVar) {
        this.f19035a = 0.0f;
        this.f19036b = Float.MAX_VALUE;
        this.f19037c = false;
        this.f19039f = false;
        this.f19040g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f19041i = 0L;
        this.f19043k = new ArrayList();
        this.f19044l = new ArrayList();
        this.d = null;
        this.f19038e = new e(aVar, 0);
        this.f19042j = 1.0f;
    }

    public final void a(g gVar) {
        ArrayList arrayList = this.f19043k;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
    }

    public final void b(h hVar) {
        if (!this.f19039f) {
            ArrayList arrayList = this.f19044l;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f19039f) {
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
        this.f19039f = false;
        ThreadLocal threadLocal = c.f19017f;
        if (threadLocal.get() == null) {
            threadLocal.set(new c());
        }
        c cVar = (c) threadLocal.get();
        cVar.f19018a.remove(this);
        ArrayList arrayList2 = cVar.f19019b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            cVar.f19021e = true;
        }
        this.f19041i = 0L;
        this.f19037c = false;
        while (true) {
            arrayList = this.f19043k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, z10, this.f19036b, this.f19035a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f9) {
        ArrayList arrayList;
        this.f19038e.b(this.d, f9);
        int i10 = 0;
        while (true) {
            arrayList = this.f19044l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((h) arrayList.get(i10)).a(this, this.f19036b, this.f19035a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public i(Object obj, j jVar) {
        this.f19035a = 0.0f;
        this.f19036b = Float.MAX_VALUE;
        this.f19037c = false;
        this.f19039f = false;
        this.f19040g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f19041i = 0L;
        this.f19043k = new ArrayList();
        this.f19044l = new ArrayList();
        this.d = obj;
        this.f19038e = jVar;
        if (jVar != f19031q && jVar != f19032r && jVar != f19033s) {
            if (jVar == f19034t) {
                this.f19042j = 0.00390625f;
                return;
            } else if (jVar != f19029o && jVar != f19030p) {
                this.f19042j = 1.0f;
                return;
            } else {
                this.f19042j = 0.00390625f;
                return;
            }
        }
        this.f19042j = 0.1f;
    }
}
