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
    public long f14222b;
    public final h f14223c;
    public ArrayList d;
    public final SparseIntArray f14224e;
    public final r f14225f;
    public final ArrayList f14226g;
    public final ArrayDeque h;
    public final y f14227i;
    public final h2 f14228j;
    public BasePendingResult f14229k;
    public BasePendingResult f14230l;
    public final Set f14231m = DesugarCollections.synchronizedSet(new HashSet());
    public final j6.b f14221a = new j6.b("MediaQueue", null);

    public c(h hVar) {
        this.f14223c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f14224e = new SparseIntArray();
        this.f14226g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f14227i = new y(Looper.getMainLooper(), 0);
        this.f14228j = new h2(this, 1);
        hVar.p(new c0(this, 1));
        this.f14225f = new r(this);
        this.f14222b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f14231m) {
            try {
                Iterator it = cVar.f14231m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f14224e;
        sparseIntArray.clear();
        for (int i7 = 0; i7 < cVar.d.size(); i7++) {
            sparseIntArray.put(((Integer) cVar.d.get(i7)).intValue(), i7);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f14224e.clear();
        this.f14225f.evictAll();
        this.f14226g.clear();
        this.f14227i.removeCallbacks(this.f14228j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f14230l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f14230l = null;
        }
        BasePendingResult basePendingResult2 = this.f14229k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f14229k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        q6.m.d("Must be called from the main thread.");
        if (this.f14222b != 0 && (basePendingResult = this.f14230l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f14230l = null;
            }
            BasePendingResult basePendingResult3 = this.f14229k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f14229k = null;
            }
            h hVar = this.f14223c;
            hVar.getClass();
            q6.m.d("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f14230l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i7;
        f6.q e10 = this.f14223c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f11309a;
            if (mediaInfo == null) {
                i7 = -1;
            } else {
                i7 = mediaInfo.f6493b;
            }
            int i10 = e10.f11312e;
            int i11 = e10.f11313f;
            int i12 = e10.f11318x;
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
            return e10.f11310b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f14231m) {
            try {
                Iterator it = this.f14231m.iterator();
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
        synchronized (this.f14231m) {
            try {
                Iterator it = this.f14231m.iterator();
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
        synchronized (this.f14231m) {
            try {
                Iterator it = this.f14231m.iterator();
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
