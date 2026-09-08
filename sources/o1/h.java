package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16833m = new c(1);
    public static final c f16834n = new c(2);
    public static final c f16835o = new c(3);
    public static final c f16836p = new c(4);
    public static final c f16837q = new c(5);
    public static final c f16838r = new c(6);
    public static final c f16839s = new c(7);
    public static final c f16840t = new c(0);
    public float f16841a;
    public float f16842b;
    public boolean f16843c;
    public final Object d;
    public final i f16844e;
    public boolean f16845f;
    public float f16846g;
    public float h;
    public long f16847i;
    public float f16848j;
    public final ArrayList f16849k;
    public final ArrayList f16850l;

    public h(j jVar) {
        this.f16841a = 0.0f;
        this.f16842b = Float.MAX_VALUE;
        this.f16843c = false;
        this.f16845f = false;
        this.f16846g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16847i = 0L;
        this.f16849k = new ArrayList();
        this.f16850l = new ArrayList();
        this.d = null;
        this.f16844e = new d(jVar, 0);
        this.f16848j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16849k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16845f) {
            ArrayList arrayList = this.f16850l;
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
            if (this.f16845f) {
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
        this.f16845f = false;
        ThreadLocal threadLocal = b.f16823f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16824a.remove(this);
        ArrayList arrayList2 = bVar.f16825b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16827e = true;
        }
        this.f16847i = 0L;
        this.f16843c = false;
        while (true) {
            arrayList = this.f16849k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16842b, this.f16841a);
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
        this.f16844e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16850l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16842b, this.f16841a);
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
        this.f16841a = 0.0f;
        this.f16842b = Float.MAX_VALUE;
        this.f16843c = false;
        this.f16845f = false;
        this.f16846g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16847i = 0L;
        this.f16849k = new ArrayList();
        this.f16850l = new ArrayList();
        this.d = obj;
        this.f16844e = iVar;
        if (iVar != f16837q && iVar != f16838r && iVar != f16839s) {
            if (iVar == f16840t) {
                this.f16848j = 0.00390625f;
                return;
            } else if (iVar != f16835o && iVar != f16836p) {
                this.f16848j = 1.0f;
                return;
            } else {
                this.f16848j = 0.00390625f;
                return;
            }
        }
        this.f16848j = 0.1f;
    }
}
