package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16969m = new c(1);
    public static final c f16970n = new c(2);
    public static final c f16971o = new c(3);
    public static final c f16972p = new c(4);
    public static final c f16973q = new c(5);
    public static final c f16974r = new c(6);
    public static final c f16975s = new c(7);
    public static final c f16976t = new c(0);
    public float f16977a;
    public float f16978b;
    public boolean f16979c;
    public final Object d;
    public final i f16980e;
    public boolean f16981f;
    public float f16982g;
    public float h;
    public long f16983i;
    public float f16984j;
    public final ArrayList f16985k;
    public final ArrayList f16986l;

    public h(j jVar) {
        this.f16977a = 0.0f;
        this.f16978b = Float.MAX_VALUE;
        this.f16979c = false;
        this.f16981f = false;
        this.f16982g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16983i = 0L;
        this.f16985k = new ArrayList();
        this.f16986l = new ArrayList();
        this.d = null;
        this.f16980e = new d(jVar, 0);
        this.f16984j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16985k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16981f) {
            ArrayList arrayList = this.f16986l;
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
            if (this.f16981f) {
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
        this.f16981f = false;
        ThreadLocal threadLocal = b.f16959f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16960a.remove(this);
        ArrayList arrayList2 = bVar.f16961b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.f16963e = true;
        }
        this.f16983i = 0L;
        this.f16979c = false;
        while (true) {
            arrayList = this.f16985k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f16978b, this.f16977a);
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
        this.f16980e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f16986l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16978b, this.f16977a);
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
        this.f16977a = 0.0f;
        this.f16978b = Float.MAX_VALUE;
        this.f16979c = false;
        this.f16981f = false;
        this.f16982g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16983i = 0L;
        this.f16985k = new ArrayList();
        this.f16986l = new ArrayList();
        this.d = obj;
        this.f16980e = iVar;
        if (iVar != f16973q && iVar != f16974r && iVar != f16975s) {
            if (iVar == f16976t) {
                this.f16984j = 0.00390625f;
                return;
            } else if (iVar != f16971o && iVar != f16972p) {
                this.f16984j = 1.0f;
                return;
            } else {
                this.f16984j = 0.00390625f;
                return;
            }
        }
        this.f16984j = 0.1f;
    }
}
