package e6;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.z;
import d6.c0;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f6262b;
    public final h f6263c;
    public ArrayList d;
    public final SparseIntArray e;
    public final s f6264f;
    public final ArrayList f6265g;
    public final ArrayDeque h;
    public final z f6266i;
    public final r f6267j;
    public BasePendingResult f6268k;
    public BasePendingResult f6269l;
    public final Set f6270m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f6261a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f6263c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.f6265g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f6266i = new z(Looper.getMainLooper(), 0);
        this.f6267j = new r(this, 0);
        hVar.p(new c0(this, 1));
        this.f6264f = new s(this);
        this.f6262b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f6270m) {
            try {
                Iterator it = cVar.f6270m.iterator();
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
        SparseIntArray sparseIntArray = cVar.e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.e.clear();
        this.f6264f.evictAll();
        this.f6265g.clear();
        this.f6266i.removeCallbacks(this.f6267j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f6269l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f6269l = null;
        }
        BasePendingResult basePendingResult2 = this.f6268k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f6268k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.l.d("Must be called from the main thread.");
        if (this.f6262b != 0 && (basePendingResult = this.f6269l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f6269l = null;
            }
            BasePendingResult basePendingResult3 = this.f6268k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f6268k = null;
            }
            h hVar = this.f6263c;
            hVar.getClass();
            n6.l.d("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f6269l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e = this.f6263c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.f3921a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f4303b;
            }
            int i11 = e.e;
            int i12 = e.f3924f;
            int i13 = e.f3929x;
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
            return e.f3922b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f6270m) {
            try {
                Iterator it = this.f6270m.iterator();
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
        synchronized (this.f6270m) {
            try {
                Iterator it = this.f6270m.iterator();
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
        synchronized (this.f6270m) {
            try {
                Iterator it = this.f6270m.iterator();
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
