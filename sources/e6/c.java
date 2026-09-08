package e6;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.c0;
import di.p2;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f8879b;
    public final h f8880c;
    public ArrayList d;
    public final SparseIntArray f8881e;
    public final s f8882f;
    public final ArrayList f8883g;
    public final ArrayDeque h;
    public final c0 f8884i;
    public final p2 f8885j;
    public BasePendingResult f8886k;
    public BasePendingResult f8887l;
    public final Set f8888m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f8878a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f8880c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f8881e = new SparseIntArray();
        this.f8883g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f8884i = new c0(Looper.getMainLooper(), 0);
        this.f8885j = new p2(this, 1);
        hVar.p(new d6.c0(this, 1));
        this.f8882f = new s(this);
        this.f8879b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f8888m) {
            try {
                Iterator it = cVar.f8888m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.f8881e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f8881e.clear();
        this.f8882f.evictAll();
        this.f8883g.clear();
        this.f8884i.removeCallbacks(this.f8885j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f8887l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f8887l = null;
        }
        BasePendingResult basePendingResult2 = this.f8886k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f8886k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.l.e("Must be called from the main thread.");
        if (this.f8879b != 0 && (basePendingResult = this.f8887l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f8887l = null;
            }
            BasePendingResult basePendingResult3 = this.f8886k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f8886k = null;
            }
            h hVar = this.f8880c;
            hVar.getClass();
            n6.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f8887l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e7 = this.f8880c.e();
        if (e7 != null) {
            MediaInfo mediaInfo = e7.f4577a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f4939b;
            }
            int i11 = e7.f4580e;
            int i12 = e7.f4581f;
            int i13 = e7.f4585w;
            if (i11 == 1) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            return 0L;
                        }
                    } else if (i10 != 2) {
                        return 0L;
                    }
                }
                if (i13 == 0) {
                    return 0L;
                }
            }
            return e7.f4578b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f8888m) {
            try {
                Iterator it = this.f8888m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this.f8888m) {
            try {
                Iterator it = this.f8888m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f8888m) {
            try {
                Iterator it = this.f8888m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
