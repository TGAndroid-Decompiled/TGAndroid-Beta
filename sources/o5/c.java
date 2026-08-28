package o5;

import android.os.Looper;
import android.util.SparseIntArray;
import c2.u0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kh.j2;
import n5.d0;
public final class c {
    public long f18959b;
    public final h f18960c;
    public ArrayList d;
    public final SparseIntArray f18961e;
    public final r f18962f;
    public final ArrayList f18963g;
    public final ArrayDeque h;
    public final u0 f18964i;
    public final j2 f18965j;
    public BasePendingResult f18966k;
    public BasePendingResult f18967l;
    public final Set f18968m = DesugarCollections.synchronizedSet(new HashSet());
    public final q5.b f18958a = new q5.b("MediaQueue", null);

    public c(h hVar) {
        this.f18960c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f18961e = new SparseIntArray();
        this.f18963g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f18964i = new u0(Looper.getMainLooper(), 1);
        this.f18965j = new j2(this, 1);
        hVar.p(new d0(this, 1));
        this.f18962f = new r(this);
        this.f18959b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f18968m) {
            try {
                Iterator it = cVar.f18968m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.f18961e;
        sparseIntArray.clear();
        for (int i9 = 0; i9 < cVar.d.size(); i9++) {
            sparseIntArray.put(((Integer) cVar.d.get(i9)).intValue(), i9);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f18961e.clear();
        this.f18962f.evictAll();
        this.f18963g.clear();
        this.f18964i.removeCallbacks(this.f18965j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f18967l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f18967l = null;
        }
        BasePendingResult basePendingResult2 = this.f18966k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f18966k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        x5.l.e("Must be called from the main thread.");
        if (this.f18959b != 0 && (basePendingResult = this.f18967l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f18967l = null;
            }
            BasePendingResult basePendingResult3 = this.f18966k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f18966k = null;
            }
            h hVar = this.f18960c;
            hVar.getClass();
            x5.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f18967l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i9;
        m5.q e10 = this.f18960c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f17453a;
            if (mediaInfo == null) {
                i9 = -1;
            } else {
                i9 = mediaInfo.f2707b;
            }
            int i10 = e10.f17456e;
            int i11 = e10.f17457f;
            int i12 = e10.f17461w;
            if (i10 == 1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return 0L;
                        }
                    } else if (i9 != 2) {
                        return 0L;
                    }
                }
                if (i12 == 0) {
                    return 0L;
                }
            }
            return e10.f17454b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f18968m) {
            try {
                Iterator it = this.f18968m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f18968m) {
            try {
                Iterator it = this.f18968m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f18968m) {
            try {
                Iterator it = this.f18968m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
