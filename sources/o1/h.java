package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16181m = new c(1);
    public static final c f16182n = new c(2);
    public static final c f16183o = new c(3);
    public static final c f16184p = new c(4);
    public static final c f16185q = new c(5);
    public static final c f16186r = new c(6);
    public static final c f16187s = new c(7);
    public static final c f16188t = new c(0);
    public float f16189a;
    public float f16190b;
    public boolean f16191c;
    public final Object d;
    public final i e;
    public boolean f16192f;
    public float f16193g;
    public float h;
    public long f16194i;
    public float f16195j;
    public final ArrayList f16196k;
    public final ArrayList f16197l;

    public h(kb.a aVar) {
        this.f16189a = 0.0f;
        this.f16190b = Float.MAX_VALUE;
        this.f16191c = false;
        this.f16192f = false;
        this.f16193g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16194i = 0L;
        this.f16196k = new ArrayList();
        this.f16197l = new ArrayList();
        this.d = null;
        this.e = new d(aVar, 0);
        this.f16195j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16196k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16192f) {
            ArrayList arrayList = this.f16197l;
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
            if (this.f16192f) {
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
        this.f16192f = false;
        ThreadLocal threadLocal = b.f16172f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16173a.remove(this);
        ArrayList arrayList2 = bVar.f16174b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f16194i = 0L;
        this.f16191c = false;
        while (true) {
            arrayList = this.f16196k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z4, this.f16190b, this.f16189a);
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
        this.e.b(this.d, f10);
        int i10 = 0;
        while (true) {
            arrayList = this.f16197l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16190b, this.f16189a);
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
        this.f16189a = 0.0f;
        this.f16190b = Float.MAX_VALUE;
        this.f16191c = false;
        this.f16192f = false;
        this.f16193g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16194i = 0L;
        this.f16196k = new ArrayList();
        this.f16197l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f16185q && iVar != f16186r && iVar != f16187s) {
            if (iVar == f16188t) {
                this.f16195j = 0.00390625f;
                return;
            } else if (iVar != f16183o && iVar != f16184p) {
                this.f16195j = 1.0f;
                return;
            } else {
                this.f16195j = 0.00390625f;
                return;
            }
        }
        this.f16195j = 0.1f;
    }
}
