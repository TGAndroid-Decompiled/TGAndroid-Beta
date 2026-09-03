package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16320m = new c(1);
    public static final c f16321n = new c(2);
    public static final c f16322o = new c(3);
    public static final c f16323p = new c(4);
    public static final c f16324q = new c(5);
    public static final c f16325r = new c(6);
    public static final c f16326s = new c(7);
    public static final c f16327t = new c(0);
    public float f16328a;
    public float f16329b;
    public boolean f16330c;
    public final Object d;
    public final i f16331e;
    public boolean f16332f;
    public float f16333g;
    public float h;
    public long f16334i;
    public float f16335j;
    public final ArrayList f16336k;
    public final ArrayList f16337l;

    public h(kb.a aVar) {
        this.f16328a = 0.0f;
        this.f16329b = Float.MAX_VALUE;
        this.f16330c = false;
        this.f16332f = false;
        this.f16333g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16334i = 0L;
        this.f16336k = new ArrayList();
        this.f16337l = new ArrayList();
        this.d = null;
        this.f16331e = new d(aVar, 0);
        this.f16335j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16336k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16332f) {
            ArrayList arrayList = this.f16337l;
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
            if (this.f16332f) {
                d(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void d(boolean z4) {
        ArrayList arrayList;
        int i10 = 0;
        this.f16332f = false;
        ThreadLocal threadLocal = b.f16310f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16311a.remove(this);
        ArrayList arrayList2 = bVar.f16312b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16314e = true;
        }
        this.f16334i = 0L;
        this.f16330c = false;
        while (true) {
            arrayList = this.f16336k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z4, this.f16329b, this.f16328a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f10) {
        ArrayList arrayList;
        this.f16331e.b(this.d, f10);
        int i10 = 0;
        while (true) {
            arrayList = this.f16337l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16329b, this.f16328a);
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
        this.f16328a = 0.0f;
        this.f16329b = Float.MAX_VALUE;
        this.f16330c = false;
        this.f16332f = false;
        this.f16333g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16334i = 0L;
        this.f16336k = new ArrayList();
        this.f16337l = new ArrayList();
        this.d = obj;
        this.f16331e = iVar;
        if (iVar != f16324q && iVar != f16325r && iVar != f16326s) {
            if (iVar == f16327t) {
                this.f16335j = 0.00390625f;
                return;
            } else if (iVar != f16322o && iVar != f16323p) {
                this.f16335j = 1.0f;
                return;
            } else {
                this.f16335j = 0.00390625f;
                return;
            }
        }
        this.f16335j = 0.1f;
    }
}
