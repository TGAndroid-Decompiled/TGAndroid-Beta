package defpackage;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class bu6 {
    public long b;
    public final v99 c;
    public final tff f;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = DesugarCollections.synchronizedSet(new HashSet());
    public final he6 a = new he6("MediaQueue", null);
    public ArrayList d = new ArrayList();
    public final SparseIntArray e = new SparseIntArray();
    public final ArrayList g = new ArrayList();
    public final ArrayDeque h = new ArrayDeque(20);
    public final b99 i = new b99(Looper.getMainLooper(), (byte) 3);
    public final vw3 j = new vw3(this, (byte) 4);

    public bu6(v99 v99Var) {
        this.c = v99Var;
        v99Var.p(new sff(this, (byte) 1));
        this.f = new tff(this);
        this.b = d();
        c();
    }

    public static void a(bu6 bu6Var) {
        SparseIntArray sparseIntArray = bu6Var.e;
        sparseIntArray.clear();
        for (int i = 0; i < bu6Var.d.size(); i++) {
            sparseIntArray.put(((Integer) bu6Var.d.get(i)).intValue(), i);
        }
    }

    public final void b() {
        h();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.i.removeCallbacks(this.j);
        this.h.clear();
        BasePendingResult basePendingResult = this.l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.k = null;
        }
        f();
        e();
    }

    public final void c() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        xve.e("Must be called from the main thread.");
        if (this.b != 0 && (basePendingResult = this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.k = null;
            }
            v99 v99Var = this.c;
            v99Var.getClass();
            xve.e("Must be called from the main thread.");
            if (!v99Var.w()) {
                basePendingResult2 = v99.t();
            } else {
                qad qadVar = new qad(v99Var);
                v99.x(qadVar);
                basePendingResult2 = qadVar;
            }
            this.l = basePendingResult2;
            basePendingResult2.i(new baf(this, (byte) 0));
        }
    }

    public final long d() {
        int i;
        j07 e = this.c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.a;
            if (mediaInfo == null) {
                i = -1;
            } else {
                i = mediaInfo.b;
            }
            int i2 = e.e;
            int i3 = e.f;
            int i4 = e.x;
            if (i2 == 1) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            return 0L;
                        }
                    } else if (i != 2) {
                        return 0L;
                    }
                }
                if (i4 == 0) {
                    return 0L;
                }
            }
            return e.b;
        }
        return 0L;
    }

    public final void e() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }

    public final void f() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }

    public final void g() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }

    public final void h() {
        synchronized (this.m) {
            Iterator it = this.m.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }
}
