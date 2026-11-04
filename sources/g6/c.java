package g6;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.z;
import f6.d0;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f11981b;
    public final h f11982c;
    public ArrayList d;
    public final SparseIntArray f11983e;
    public final r f11984f;
    public final ArrayList f11985g;
    public final ArrayDeque h;
    public final z f11986i;
    public final q f11987j;
    public BasePendingResult f11988k;
    public BasePendingResult f11989l;
    public final Set f11990m = DesugarCollections.synchronizedSet(new HashSet());
    public final i6.b f11980a = new i6.b("MediaQueue", null);

    public c(h hVar) {
        this.f11982c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f11983e = new SparseIntArray();
        this.f11985g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f11986i = new z(Looper.getMainLooper(), 0);
        this.f11987j = new q(this, 0);
        hVar.p(new d0(this, 1));
        this.f11984f = new r(this);
        this.f11981b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f11990m) {
            try {
                Iterator it = cVar.f11990m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f11983e;
        sparseIntArray.clear();
        for (int i3 = 0; i3 < cVar.d.size(); i3++) {
            sparseIntArray.put(((Integer) cVar.d.get(i3)).intValue(), i3);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f11983e.clear();
        this.f11984f.evictAll();
        this.f11985g.clear();
        this.f11986i.removeCallbacks(this.f11987j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f11989l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f11989l = null;
        }
        BasePendingResult basePendingResult2 = this.f11988k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f11988k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        p6.m.d("Must be called from the main thread.");
        if (this.f11981b != 0 && (basePendingResult = this.f11989l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f11989l = null;
            }
            BasePendingResult basePendingResult3 = this.f11988k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f11988k = null;
            }
            h hVar = this.f11982c;
            hVar.getClass();
            p6.m.d("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f11989l = basePendingResult2;
            basePendingResult2.i(new p(this, 0));
        }
    }

    public final long e() {
        int i3;
        e6.q e10 = this.f11982c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f9752a;
            if (mediaInfo == null) {
                i3 = -1;
            } else {
                i3 = mediaInfo.f6547b;
            }
            int i10 = e10.f9755e;
            int i11 = e10.f9756f;
            int i12 = e10.f9761x;
            if (i10 == 1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return 0L;
                        }
                    } else if (i3 != 2) {
                        return 0L;
                    }
                }
                if (i12 == 0) {
                    return 0L;
                }
            }
            return e10.f9753b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f11990m) {
            try {
                Iterator it = this.f11990m.iterator();
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
        synchronized (this.f11990m) {
            try {
                Iterator it = this.f11990m.iterator();
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
        synchronized (this.f11990m) {
            try {
                Iterator it = this.f11990m.iterator();
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
