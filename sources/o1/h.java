package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f18782m = new c(1);
    public static final c f18783n = new c(2);
    public static final c f18784o = new c(3);
    public static final c f18785p = new c(4);
    public static final c f18786q = new c(5);
    public static final c f18787r = new c(6);
    public static final c f18788s = new c(7);
    public static final c f18789t = new c(0);
    public float f18790a;
    public float f18791b;
    public boolean f18792c;
    public final Object d;
    public final i f18793e;
    public boolean f18794f;
    public float f18795g;
    public float h;
    public long f18796i;
    public float f18797j;
    public final ArrayList f18798k;
    public final ArrayList f18799l;

    public h(gb.a aVar) {
        this.f18790a = 0.0f;
        this.f18791b = Float.MAX_VALUE;
        this.f18792c = false;
        this.f18794f = false;
        this.f18795g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f18796i = 0L;
        this.f18798k = new ArrayList();
        this.f18799l = new ArrayList();
        this.d = null;
        this.f18793e = new d(aVar, 0);
        this.f18797j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f18798k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f18794f) {
            ArrayList arrayList = this.f18799l;
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
            if (this.f18794f) {
                d(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void d(boolean z10) {
        ArrayList arrayList;
        int i9 = 0;
        this.f18794f = false;
        ThreadLocal threadLocal = b.f18772f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f18773a.remove(this);
        ArrayList arrayList2 = bVar.f18774b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f18776e = true;
        }
        this.f18796i = 0L;
        this.f18792c = false;
        while (true) {
            arrayList = this.f18798k;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                ((f) arrayList.get(i9)).a(this, z10, this.f18791b, this.f18790a);
            }
            i9++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f10) {
        ArrayList arrayList;
        this.f18793e.b(this.d, f10);
        int i9 = 0;
        while (true) {
            arrayList = this.f18799l;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                ((g) arrayList.get(i9)).a(this, this.f18791b, this.f18790a);
            }
            i9++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public h(Object obj, i iVar) {
        this.f18790a = 0.0f;
        this.f18791b = Float.MAX_VALUE;
        this.f18792c = false;
        this.f18794f = false;
        this.f18795g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f18796i = 0L;
        this.f18798k = new ArrayList();
        this.f18799l = new ArrayList();
        this.d = obj;
        this.f18793e = iVar;
        if (iVar != f18786q && iVar != f18787r && iVar != f18788s) {
            if (iVar == f18789t) {
                this.f18797j = 0.00390625f;
                return;
            } else if (iVar != f18784o && iVar != f18785p) {
                this.f18797j = 1.0f;
                return;
            } else {
                this.f18797j = 0.00390625f;
                return;
            }
        }
        this.f18797j = 0.1f;
    }
}
