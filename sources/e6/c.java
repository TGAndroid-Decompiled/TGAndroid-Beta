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
    public long f8646b;
    public final h f8647c;
    public ArrayList d;
    public final SparseIntArray f8648e;
    public final s f8649f;
    public final ArrayList f8650g;
    public final ArrayDeque h;
    public final a0 f8651i;
    public final n2 f8652j;
    public BasePendingResult f8653k;
    public BasePendingResult f8654l;
    public final Set f8655m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f8645a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f8647c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f8648e = new SparseIntArray();
        this.f8650g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f8651i = new a0(Looper.getMainLooper(), 0);
        this.f8652j = new n2(this, 1);
        hVar.p(new c0(this, 1));
        this.f8649f = new s(this);
        this.f8646b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f8655m) {
            try {
                Iterator it = cVar.f8655m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f8648e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f8648e.clear();
        this.f8649f.evictAll();
        this.f8650g.clear();
        this.f8651i.removeCallbacks(this.f8652j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f8654l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f8654l = null;
        }
        BasePendingResult basePendingResult2 = this.f8653k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f8653k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.l.e("Must be called from the main thread.");
        if (this.f8646b != 0 && (basePendingResult = this.f8654l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f8654l = null;
            }
            BasePendingResult basePendingResult3 = this.f8653k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f8653k = null;
            }
            h hVar = this.f8647c;
            hVar.getClass();
            n6.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f8654l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e7 = this.f8647c.e();
        if (e7 != null) {
            MediaInfo mediaInfo = e7.f4407a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f6491b;
            }
            int i11 = e7.f4410e;
            int i12 = e7.f4411f;
            int i13 = e7.f4415w;
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
            return e7.f4408b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f8655m) {
            try {
                Iterator it = this.f8655m.iterator();
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
        synchronized (this.f8655m) {
            try {
                Iterator it = this.f8655m.iterator();
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
        synchronized (this.f8655m) {
            try {
                Iterator it = this.f8655m.iterator();
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
