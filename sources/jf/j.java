package jf;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import java.util.LinkedHashSet;
public final class j implements Choreographer.FrameCallback {
    public static j f11637s;
    public final Choreographer f11638a;
    public final LinkedHashSet f11639b;
    public final SparseArray f11640c;
    public final zd.b d;
    public final zd.b f11641e;
    public final zd.b f11642f;
    public long h;
    public long f11643n;
    public int f11644r;

    public j() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f11638a = choreographer;
        this.f11639b = new LinkedHashSet();
        this.f11640c = new SparseArray();
        this.d = new zd.b(true);
        this.f11641e = new zd.b(true);
        this.f11642f = new zd.b(true);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static j d() {
        c();
        if (f11637s == null) {
            f11637s = new j();
        }
        return f11637s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        f(runnable);
        e(max).f11622e.add(runnable);
    }

    public final void b(i iVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(iVar);
        e(max).d.add(iVar);
    }

    @Override
    public final void doFrame(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: jf.j.doFrame(long):void");
    }

    public final h e(int i10) {
        int i11;
        SparseArray sparseArray = this.f11640c;
        h hVar = (h) sparseArray.get(i10);
        if (hVar == null) {
            long j10 = 1000000000 / i10;
            if (60 % i10 == 0) {
                i11 = 60 / i10;
            } else {
                i11 = 0;
            }
            h hVar2 = new h(j10, i11);
            sparseArray.put(i10, hVar2);
            return hVar2;
        }
        return hVar;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f11640c;
                if (i10 < sparseArray.size() && !((h) sparseArray.valueAt(i10)).f11622e.remove(runnable)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(i iVar) {
        c();
        if (iVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f11640c;
                if (i10 < sparseArray.size() && !((h) sparseArray.valueAt(i10)).d.remove(iVar)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f11640c;
                if (i10 < sparseArray.size()) {
                    zd.b bVar = ((h) sparseArray.valueAt(i10)).f11623f;
                    if (bVar == null || !bVar.remove(runnable)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
