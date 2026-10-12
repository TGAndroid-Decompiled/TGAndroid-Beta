package e6;

import android.os.Looper;
import android.util.SparseIntArray;
import ci.n2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.a0;
import d6.c0;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f8643b;
    public final h f8644c;
    public ArrayList d;
    public final SparseIntArray f8645e;
    public final s f8646f;
    public final ArrayList f8647g;
    public final ArrayDeque h;
    public final a0 f8648i;
    public final n2 f8649j;
    public BasePendingResult f8650k;
    public BasePendingResult f8651l;
    public final Set f8652m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f8642a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f8644c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f8645e = new SparseIntArray();
        this.f8647g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f8648i = new a0(Looper.getMainLooper(), 0);
        this.f8649j = new n2(this, 1);
        hVar.p(new c0(this, 1));
        this.f8646f = new s(this);
        this.f8643b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f8652m) {
            try {
                Iterator it = cVar.f8652m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f8645e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f8645e.clear();
        this.f8646f.evictAll();
        this.f8647g.clear();
        this.f8648i.removeCallbacks(this.f8649j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f8651l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f8651l = null;
        }
        BasePendingResult basePendingResult2 = this.f8650k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f8650k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.m.e("Must be called from the main thread.");
        if (this.f8643b != 0 && (basePendingResult = this.f8651l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f8651l = null;
            }
            BasePendingResult basePendingResult3 = this.f8650k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f8650k = null;
            }
            h hVar = this.f8644c;
            hVar.getClass();
            n6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f8651l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e7 = this.f8644c.e();
        if (e7 != null) {
            MediaInfo mediaInfo = e7.f4405a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f6489b;
            }
            int i11 = e7.f4408e;
            int i12 = e7.f4409f;
            int i13 = e7.f4413w;
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
            return e7.f4406b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f8652m) {
            try {
                Iterator it = this.f8652m.iterator();
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
        synchronized (this.f8652m) {
            try {
                Iterator it = this.f8652m.iterator();
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
        synchronized (this.f8652m) {
            try {
                Iterator it = this.f8652m.iterator();
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
