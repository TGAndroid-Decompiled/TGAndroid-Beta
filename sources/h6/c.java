package h6;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.y;
import g6.c0;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f13896b;
    public final h f13897c;
    public ArrayList d;
    public final SparseIntArray f13898e;
    public final s f13899f;
    public final ArrayList f13900g;
    public final ArrayDeque h;
    public final y f13901i;
    public final r f13902j;
    public BasePendingResult f13903k;
    public BasePendingResult f13904l;
    public final Set f13905m = DesugarCollections.synchronizedSet(new HashSet());
    public final j6.b f13895a = new j6.b("MediaQueue", null);

    public c(h hVar) {
        this.f13897c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f13898e = new SparseIntArray();
        this.f13900g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f13901i = new y(Looper.getMainLooper(), 0);
        this.f13902j = new r(this, 0);
        hVar.p(new c0(this, 1));
        this.f13899f = new s(this);
        this.f13896b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f13905m) {
            try {
                Iterator it = cVar.f13905m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f13898e;
        sparseIntArray.clear();
        for (int i7 = 0; i7 < cVar.d.size(); i7++) {
            sparseIntArray.put(((Integer) cVar.d.get(i7)).intValue(), i7);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f13898e.clear();
        this.f13899f.evictAll();
        this.f13900g.clear();
        this.f13901i.removeCallbacks(this.f13902j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f13904l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f13904l = null;
        }
        BasePendingResult basePendingResult2 = this.f13903k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f13903k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        q6.m.e("Must be called from the main thread.");
        if (this.f13896b != 0 && (basePendingResult = this.f13904l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f13904l = null;
            }
            BasePendingResult basePendingResult3 = this.f13903k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f13903k = null;
            }
            h hVar = this.f13897c;
            hVar.getClass();
            q6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f13904l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i7;
        f6.q e10 = this.f13897c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f11443a;
            if (mediaInfo == null) {
                i7 = -1;
            } else {
                i7 = mediaInfo.f6163b;
            }
            int i10 = e10.f11446e;
            int i11 = e10.f11447f;
            int i12 = e10.f11452x;
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
            return e10.f11444b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f13905m) {
            try {
                Iterator it = this.f13905m.iterator();
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
        synchronized (this.f13905m) {
            try {
                Iterator it = this.f13905m.iterator();
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
        synchronized (this.f13905m) {
            try {
                Iterator it = this.f13905m.iterator();
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
