package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
public abstract class h {
    public static final c f15554m = new c(1);
    public static final c f15555n = new c(2);
    public static final c f15556o = new c(3);
    public static final c f15557p = new c(4);
    public static final c f15558q = new c(5);
    public static final c f15559r = new c(6);
    public static final c f15560s = new c(7);
    public static final c f15561t = new c(0);
    public float f15562a;
    public float f15563b;
    public boolean f15564c;
    public final Object d;
    public final i e;
    public boolean f15565f;
    public float f15566g;
    public float h;
    public long f15567i;
    public float f15568j;
    public final ArrayList f15569k;
    public final ArrayList f15570l;

    public h(j jVar) {
        this.f15562a = 0.0f;
        this.f15563b = Float.MAX_VALUE;
        this.f15564c = false;
        this.f15565f = false;
        this.f15566g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15567i = 0L;
        this.f15569k = new ArrayList();
        this.f15570l = new ArrayList();
        this.d = null;
        this.e = new d(jVar, 0);
        this.f15568j = 1.0f;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.f15569k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void b(g gVar) {
        if (!this.f15565f) {
            ArrayList arrayList = this.f15570l;
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
            if (this.f15565f) {
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
        this.f15565f = false;
        ThreadLocal threadLocal = b.f15545f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.f15546a.remove(this);
        ArrayList arrayList2 = bVar.f15547b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.f15567i = 0L;
        this.f15564c = false;
        while (true) {
            arrayList = this.f15569k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.f15563b, this.f15562a);
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
            arrayList = this.f15570l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.f15563b, this.f15562a);
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
        this.f15562a = 0.0f;
        this.f15563b = Float.MAX_VALUE;
        this.f15564c = false;
        this.f15565f = false;
        this.f15566g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f15567i = 0L;
        this.f15569k = new ArrayList();
        this.f15570l = new ArrayList();
        this.d = obj;
        this.e = iVar;
        if (iVar != f15558q && iVar != f15559r && iVar != f15560s) {
            if (iVar == f15561t) {
                this.f15568j = 0.00390625f;
                return;
            } else if (iVar != f15556o && iVar != f15557p) {
                this.f15568j = 1.0f;
                return;
            } else {
                this.f15568j = 0.00390625f;
                return;
            }
        }
        this.f15568j = 0.1f;
    }
}
