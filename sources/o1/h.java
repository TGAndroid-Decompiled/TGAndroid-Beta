package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f16161m = new c(1);
    public static final c f16162n = new c(2);
    public static final c f16163o = new c(3);
    public static final c f16164p = new c(4);
    public static final c f16165q = new c(5);
    public static final c f16166r = new c(6);
    public static final c f16167s = new c(7);
    public static final c f16168t = new c(0);
    public float f16169a;
    public float f16170b;
    public boolean f16171c;
    public final Object d;
    public final i e;
    public boolean f16172f;
    public float f16173g;
    public float h;
    public long f16174i;
    public float f16175j;
    public final ArrayList f16176k;
    public final ArrayList f16177l;

    public h(kb.a aVar) {
        this.f16169a = 0.0f;
        this.f16170b = Float.MAX_VALUE;
        this.f16171c = false;
        this.f16172f = false;
        this.f16173g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16174i = 0L;
        this.f16176k = new ArrayList();
        this.f16177l = new ArrayList();
        this.d = null;
        this.e = new d(aVar, 0);
        this.f16175j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f16176k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f16172f) {
            ArrayList arrayList = this.f16177l;
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
            if (this.f16172f) {
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
        this.f16172f = false;
        ThreadLocal threadLocal = b.f16152f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f16153a.remove(this);
        ArrayList arrayList2 = bVar.f16154b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f16174i = 0L;
        this.f16171c = false;
        while (true) {
            arrayList = this.f16176k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z4, this.f16170b, this.f16169a);
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
            arrayList = this.f16177l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f16170b, this.f16169a);
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
        this.f16169a = 0.0f;
        this.f16170b = Float.MAX_VALUE;
        this.f16171c = false;
        this.f16172f = false;
        this.f16173g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f16174i = 0L;
        this.f16176k = new ArrayList();
        this.f16177l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f16165q && iVar != f16166r && iVar != f16167s) {
            if (iVar == f16168t) {
                this.f16175j = 0.00390625f;
                return;
            } else if (iVar != f16163o && iVar != f16164p) {
                this.f16175j = 1.0f;
                return;
            } else {
                this.f16175j = 0.00390625f;
                return;
            }
        }
        this.f16175j = 0.1f;
    }
}
