package e6;

import android.os.Looper;
import android.util.SparseIntArray;
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
    public long f8347b;
    public final h f8348c;
    public ArrayList d;
    public final SparseIntArray e;
    public final s f8349f;
    public final ArrayList f8350g;
    public final ArrayDeque h;
    public final a0 f8351i;
    public final r f8352j;
    public BasePendingResult f8353k;
    public BasePendingResult f8354l;
    public final Set f8355m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f8346a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f8348c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.f8350g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f8351i = new a0(Looper.getMainLooper(), 0);
        this.f8352j = new r(this, 0);
        hVar.p(new c0(this, 1));
        this.f8349f = new s(this);
        this.f8347b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f8355m) {
            try {
                Iterator it = cVar.f8355m.iterator();
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
        this.f8349f.evictAll();
        this.f8350g.clear();
        this.f8351i.removeCallbacks(this.f8352j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f8354l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f8354l = null;
        }
        BasePendingResult basePendingResult2 = this.f8353k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f8353k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.l.e("Must be called from the main thread.");
        if (this.f8347b != 0 && (basePendingResult = this.f8354l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f8354l = null;
            }
            BasePendingResult basePendingResult3 = this.f8353k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f8353k = null;
            }
            h hVar = this.f8348c;
            hVar.getClass();
            n6.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f8354l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e = this.f8348c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.f4893a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f6314b;
            }
            int i11 = e.e;
            int i12 = e.f4896f;
            int i13 = e.f4900w;
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
            return e.f4894b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f8355m) {
            try {
                Iterator it = this.f8355m.iterator();
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
        synchronized (this.f8355m) {
            try {
                Iterator it = this.f8355m.iterator();
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
        synchronized (this.f8355m) {
            try {
                Iterator it = this.f8355m.iterator();
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
