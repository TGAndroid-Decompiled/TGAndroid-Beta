package ff;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import java.util.LinkedHashSet;
public final class k implements Choreographer.FrameCallback {
    public static k f6223s;
    public final Choreographer f6224a;
    public final LinkedHashSet f6225b;
    public final SparseArray f6226c;
    public final xd.b d;
    public final xd.b f6227e;
    public final xd.b f6228f;
    public long h;
    public long f6229n;
    public int f6230r;

    public k() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f6224a = choreographer;
        this.f6225b = new LinkedHashSet();
        this.f6226c = new SparseArray();
        this.d = new xd.b(true);
        this.f6227e = new xd.b(true);
        this.f6228f = new xd.b(true);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static k d() {
        c();
        if (f6223s == null) {
            f6223s = new k();
        }
        return f6223s;
    }

    public final void a(int i9, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i9, 60));
        g(runnable);
        e(max).f6208e.add(runnable);
    }

    public final void b(j jVar, int i9) {
        c();
        int max = Math.max(1, Math.min(i9, 60));
        f(jVar);
        e(max).d.add(jVar);
    }

    @Override
    public final void doFrame(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: ff.k.doFrame(long):void");
    }

    public final i e(int i9) {
        int i10;
        SparseArray sparseArray = this.f6226c;
        i iVar = (i) sparseArray.get(i9);
        if (iVar == null) {
            long j10 = 1000000000 / i9;
            if (60 % i9 == 0) {
                i10 = 60 / i9;
            } else {
                i10 = 0;
            }
            i iVar2 = new i(j10, i10);
            sparseArray.put(i9, iVar2);
            return iVar2;
        }
        return iVar;
    }

    public final void f(j jVar) {
        c();
        if (jVar != null) {
            int i9 = 0;
            while (true) {
                SparseArray sparseArray = this.f6226c;
                if (i9 < sparseArray.size() && !((i) sparseArray.valueAt(i9)).d.remove(jVar)) {
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(Runnable runnable) {
        c();
        if (runnable != null) {
            int i9 = 0;
            while (true) {
                SparseArray sparseArray = this.f6226c;
                if (i9 < sparseArray.size() && !((i) sparseArray.valueAt(i9)).f6208e.remove(runnable)) {
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i9 = 0;
            while (true) {
                SparseArray sparseArray = this.f6226c;
                if (i9 < sparseArray.size()) {
                    xd.b bVar = ((i) sparseArray.valueAt(i9)).f6209f;
                    if (bVar == null || !bVar.remove(runnable)) {
                        i9++;
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
