package lf;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import java.util.LinkedHashSet;
public final class j implements Choreographer.FrameCallback {
    public static j f12025s;
    public final Choreographer f12026a;
    public final LinkedHashSet f12027b;
    public final SparseArray f12028c;
    public final be.b d;
    public final be.b e;
    public final be.b f12029f;
    public long h;
    public long f12030n;
    public int f12031r;

    public j() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f12026a = choreographer;
        this.f12027b = new LinkedHashSet();
        this.f12028c = new SparseArray();
        this.d = new be.b(true);
        this.e = new be.b(true);
        this.f12029f = new be.b(true);
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
        if (f12025s == null) {
            f12025s = new j();
        }
        return f12025s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        f(runnable);
        e(max).e.add(runnable);
    }

    public final void b(i iVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(iVar);
        e(max).d.add(iVar);
    }

    @Override
    public final void doFrame(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: lf.j.doFrame(long):void");
    }

    public final h e(int i10) {
        int i11;
        SparseArray sparseArray = this.f12028c;
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
                SparseArray sparseArray = this.f12028c;
                if (i10 < sparseArray.size() && !((h) sparseArray.valueAt(i10)).e.remove(runnable)) {
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
                SparseArray sparseArray = this.f12028c;
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
                SparseArray sparseArray = this.f12028c;
                if (i10 < sparseArray.size()) {
                    be.b bVar = ((h) sparseArray.valueAt(i10)).f12013f;
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
