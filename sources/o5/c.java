package o5;

import android.os.Looper;
import android.util.SparseIntArray;
import c2.t0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lh.h2;
import m5.r;
import n5.d0;

public final class c {

    public long f19306b;

    public final h f19307c;
    public ArrayList d;

    public final SparseIntArray f19308e;

    public final q f19309f;

    public final ArrayList f19310g;
    public final ArrayDeque h;

    public final t0 f19311i;

    public final h2 f19312j;

    public BasePendingResult f19313k;

    public BasePendingResult f19314l;

    public final Set f19315m = DesugarCollections.synchronizedSet(new HashSet());

    public final r5.b f19305a = new r5.b("MediaQueue", null);

    public c(h hVar) {
        this.f19307c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f19308e = new SparseIntArray();
        this.f19310g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f19311i = new t0(Looper.getMainLooper(), 1);
        int i10 = 1;
        this.f19312j = new h2(this, i10);
        hVar.p(new d0(this, i10));
        this.f19309f = new q(this);
        this.f19306b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f19315m) {
            try {
                Iterator it = cVar.f19315m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.f19308e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f19308e.clear();
        this.f19309f.evictAll();
        this.f19310g.clear();
        this.f19311i.removeCallbacks(this.f19312j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f19314l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f19314l = null;
        }
        BasePendingResult basePendingResult2 = this.f19313k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f19313k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResultT;
        y5.l.e("Must be called from the main thread.");
        if (this.f19306b != 0 && (basePendingResult = this.f19314l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f19314l = null;
            }
            BasePendingResult basePendingResult2 = this.f19313k;
            if (basePendingResult2 != null) {
                basePendingResult2.c();
                this.f19313k = null;
            }
            h hVar = this.f19307c;
            hVar.getClass();
            y5.l.e("Must be called from the main thread.");
            if (hVar.w()) {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResultT = iVar;
            } else {
                basePendingResultT = h.t();
            }
            this.f19314l = basePendingResultT;
            basePendingResultT.i(new p(this, 0));
        }
    }

    public final long e() {
        r rVarE = this.f19307c.e();
        if (rVarE == null) {
            return 0L;
        }
        MediaInfo mediaInfo = rVarE.f17832a;
        int i10 = mediaInfo == null ? -1 : mediaInfo.f3144b;
        int i11 = rVarE.f17835e;
        int i12 = rVarE.f17836f;
        int i13 = rVarE.f17840w;
        if (i11 == 1) {
            if (i12 == 1) {
                if (i13 == 0) {
                    return 0L;
                }
            } else if (i12 != 2) {
                if (i12 != 3) {
                    return 0L;
                }
                if (i13 == 0) {
                    return 0L;
                }
            } else if (i10 != 2) {
                return 0L;
            }
        }
        return rVarE.f17833b;
    }

    public final void f() {
        synchronized (this.f19315m) {
            try {
                Iterator it = this.f19315m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f19315m) {
            try {
                Iterator it = this.f19315m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f19315m) {
            try {
                Iterator it = this.f19315m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
