package e6;

import android.os.Looper;
import android.util.SparseIntArray;
import ci.o2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.c0;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f7974b;
    public final h f7975c;
    public ArrayList d;
    public final SparseIntArray e;
    public final s f7976f;
    public final ArrayList f7977g;
    public final ArrayDeque h;
    public final c0 f7978i;
    public final o2 f7979j;
    public BasePendingResult f7980k;
    public BasePendingResult f7981l;
    public final Set f7982m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f7973a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f7975c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.f7977g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f7978i = new c0(Looper.getMainLooper(), 0);
        this.f7979j = new o2(this, 1);
        hVar.p(new d6.c0(this, 1));
        this.f7976f = new s(this);
        this.f7974b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f7982m) {
            try {
                Iterator it = cVar.f7982m.iterator();
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
        this.f7976f.evictAll();
        this.f7977g.clear();
        this.f7978i.removeCallbacks(this.f7979j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f7981l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f7981l = null;
        }
        BasePendingResult basePendingResult2 = this.f7980k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f7980k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.l.e("Must be called from the main thread.");
        if (this.f7974b != 0 && (basePendingResult = this.f7981l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f7981l = null;
            }
            BasePendingResult basePendingResult3 = this.f7980k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f7980k = null;
            }
            h hVar = this.f7975c;
            hVar.getClass();
            n6.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f7981l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e = this.f7975c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.f4026a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f5974b;
            }
            int i11 = e.e;
            int i12 = e.f4029f;
            int i13 = e.f4033w;
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
            return e.f4027b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f7982m) {
            try {
                Iterator it = this.f7982m.iterator();
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
        synchronized (this.f7982m) {
            try {
                Iterator it = this.f7982m.iterator();
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
        synchronized (this.f7982m) {
            try {
                Iterator it = this.f7982m.iterator();
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
