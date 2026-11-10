package h6;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.y;
import fi.h2;
import g6.c0;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f14224b;
    public final h f14225c;
    public ArrayList d;
    public final SparseIntArray f14226e;
    public final r f14227f;
    public final ArrayList f14228g;
    public final ArrayDeque h;
    public final y f14229i;
    public final h2 f14230j;
    public BasePendingResult f14231k;
    public BasePendingResult f14232l;
    public final Set f14233m = DesugarCollections.synchronizedSet(new HashSet());
    public final j6.b f14223a = new j6.b("MediaQueue", null);

    public c(h hVar) {
        this.f14225c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f14226e = new SparseIntArray();
        this.f14228g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f14229i = new y(Looper.getMainLooper(), 0);
        this.f14230j = new h2(this, 1);
        hVar.p(new c0(this, 1));
        this.f14227f = new r(this);
        this.f14224b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f14233m) {
            try {
                Iterator it = cVar.f14233m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f14226e;
        sparseIntArray.clear();
        for (int i7 = 0; i7 < cVar.d.size(); i7++) {
            sparseIntArray.put(((Integer) cVar.d.get(i7)).intValue(), i7);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f14226e.clear();
        this.f14227f.evictAll();
        this.f14228g.clear();
        this.f14229i.removeCallbacks(this.f14230j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f14232l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f14232l = null;
        }
        BasePendingResult basePendingResult2 = this.f14231k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f14231k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        q6.m.d("Must be called from the main thread.");
        if (this.f14224b != 0 && (basePendingResult = this.f14232l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f14232l = null;
            }
            BasePendingResult basePendingResult3 = this.f14231k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f14231k = null;
            }
            h hVar = this.f14225c;
            hVar.getClass();
            q6.m.d("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f14232l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i7;
        f6.q e10 = this.f14225c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f11314a;
            if (mediaInfo == null) {
                i7 = -1;
            } else {
                i7 = mediaInfo.f6498b;
            }
            int i10 = e10.f11317e;
            int i11 = e10.f11318f;
            int i12 = e10.f11323x;
            if (i10 == 1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return 0L;
                        }
                    } else if (i7 != 2) {
                        return 0L;
                    }
                }
                if (i12 == 0) {
                    return 0L;
                }
            }
            return e10.f11315b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f14233m) {
            try {
                Iterator it = this.f14233m.iterator();
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
        synchronized (this.f14233m) {
            try {
                Iterator it = this.f14233m.iterator();
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
        synchronized (this.f14233m) {
            try {
                Iterator it = this.f14233m.iterator();
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
