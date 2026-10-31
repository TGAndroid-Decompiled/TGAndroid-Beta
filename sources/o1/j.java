package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class j {
    public static final c f13941o = new c(1);
    public static final c f13942p = new c(2);
    public static final c f13943q = new c(3);
    public static final c f13944r = new c(4);
    public static final c f13945s = new c(5);
    public static final c f13946t = new c(6);
    public static final c f13947u = new c(7);
    public static final c v = new c(0);
    public float f13948a;
    public float f13949b;
    public boolean f13950c;
    public final Object d;
    public final h e;
    public boolean f13951f;
    public float f13952g;
    public float h;
    public long f13953i;
    public float f13954j;
    public final ArrayList f13955k;
    public final ArrayList f13956l;
    public k f13957m;
    public float f13958n;

    public j(Object obj, h hVar) {
        this(obj, hVar, 0);
        this.f13957m = null;
        this.f13958n = Float.MAX_VALUE;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f13955k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f13951f) {
            ArrayList arrayList = this.f13956l;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f7) {
        if (this.f13951f) {
            this.f13958n = f7;
            return;
        }
        if (this.f13957m == null) {
            this.f13957m = new k(f7);
        }
        this.f13957m.f13964i = f7;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f13951f) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void e(boolean z10) {
        ArrayList arrayList;
        int i10 = 0;
        this.f13951f = false;
        ThreadLocal threadLocal = b.f13931f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f13932a.remove(this);
        ArrayList arrayList2 = bVar.f13933b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f13953i = 0L;
        this.f13950c = false;
        while (true) {
            arrayList = this.f13955k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f13949b, this.f13948a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f7) {
        if (f7 > 0.0f) {
            this.f13954j = f7;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.f13956l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f13949b, this.f13948a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void h() {
        k kVar = this.f13957m;
        if (kVar != null) {
            double d = (float) kVar.f13964i;
            if (d <= this.f13952g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f13954j * 0.75f);
                    kVar.d = abs;
                    kVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f13951f;
                        if (!z10 && !z10) {
                            this.f13951f = true;
                            if (!this.f13950c) {
                                this.f13949b = this.e.a(this.d);
                            }
                            float f7 = this.f13949b;
                            if (f7 <= this.f13952g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f13931f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f13933b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new li.k(bVar.f13934c);
                                    }
                                    li.k kVar2 = bVar.d;
                                    ((Choreographer) kVar2.f12101c).postFrameCallback((a) kVar2.d);
                                }
                                if (!arrayList.contains(this)) {
                                    arrayList.add(this);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public j(Object obj, h hVar, float f7) {
        this(obj, hVar, 0);
        this.f13957m = null;
        this.f13958n = Float.MAX_VALUE;
        this.f13957m = new k(f7);
    }

    public j(i iVar) {
        this.f13948a = 0.0f;
        this.f13949b = Float.MAX_VALUE;
        this.f13950c = false;
        this.f13951f = false;
        this.f13952g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f13953i = 0L;
        this.f13955k = new ArrayList();
        this.f13956l = new ArrayList();
        this.d = null;
        this.e = new d(iVar, 0);
        this.f13954j = 1.0f;
        this.f13957m = null;
        this.f13958n = Float.MAX_VALUE;
    }

    public j(Object obj, h hVar, int i10) {
        this.f13948a = 0.0f;
        this.f13949b = Float.MAX_VALUE;
        this.f13950c = false;
        this.f13951f = false;
        this.f13952g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f13953i = 0L;
        this.f13955k = new ArrayList();
        this.f13956l = new ArrayList();
        this.d = obj;
        this.e = hVar;
        if (hVar != f13945s && hVar != f13946t && hVar != f13947u) {
            if (hVar == v) {
                this.f13954j = 0.00390625f;
                return;
            } else if (hVar != f13943q && hVar != f13944r) {
                this.f13954j = 1.0f;
                return;
            } else {
                this.f13954j = 0.00390625f;
                return;
            }
        }
        this.f13954j = 0.1f;
    }
}
