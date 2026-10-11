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
    public long f8645b;
    public final h f8646c;
    public ArrayList d;
    public final SparseIntArray f8647e;
    public final s f8648f;
    public final ArrayList f8649g;
    public final ArrayDeque h;
    public final a0 f8650i;
    public final n2 f8651j;
    public BasePendingResult f8652k;
    public BasePendingResult f8653l;
    public final Set f8654m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f8644a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f8646c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f8647e = new SparseIntArray();
        this.f8649g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f8650i = new a0(Looper.getMainLooper(), 0);
        this.f8651j = new n2(this, 1);
        hVar.p(new c0(this, 1));
        this.f8648f = new s(this);
        this.f8645b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f8654m) {
            try {
                Iterator it = cVar.f8654m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f8647e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f8647e.clear();
        this.f8648f.evictAll();
        this.f8649g.clear();
        this.f8650i.removeCallbacks(this.f8651j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f8653l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f8653l = null;
        }
        BasePendingResult basePendingResult2 = this.f8652k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f8652k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.m.e("Must be called from the main thread.");
        if (this.f8645b != 0 && (basePendingResult = this.f8653l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f8653l = null;
            }
            BasePendingResult basePendingResult3 = this.f8652k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f8652k = null;
            }
            h hVar = this.f8646c;
            hVar.getClass();
            n6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f8653l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e7 = this.f8646c.e();
        if (e7 != null) {
            MediaInfo mediaInfo = e7.f4406a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f6490b;
            }
            int i11 = e7.f4409e;
            int i12 = e7.f4410f;
            int i13 = e7.f4414w;
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
            return e7.f4407b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f8654m) {
            try {
                Iterator it = this.f8654m.iterator();
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
        synchronized (this.f8654m) {
            try {
                Iterator it = this.f8654m.iterator();
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
        synchronized (this.f8654m) {
            try {
                Iterator it = this.f8654m.iterator();
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
