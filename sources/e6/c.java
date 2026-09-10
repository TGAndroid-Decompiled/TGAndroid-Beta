package e6;

import android.os.Looper;
import android.util.SparseIntArray;
import bi.b3;
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
    public long f7291b;
    public final h f7292c;
    public ArrayList d;
    public final SparseIntArray e;
    public final s f7293f;
    public final ArrayList f7294g;
    public final ArrayDeque h;
    public final c0 f7295i;
    public final b3 f7296j;
    public BasePendingResult f7297k;
    public BasePendingResult f7298l;
    public final Set f7299m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b f7290a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.f7292c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.f7294g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f7295i = new c0(Looper.getMainLooper(), 0);
        this.f7296j = new b3(this, 1);
        hVar.p(new d6.c0(this, 1));
        this.f7293f = new s(this);
        this.f7291b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f7299m) {
            try {
                Iterator it = cVar.f7299m.iterator();
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
        this.f7293f.evictAll();
        this.f7294g.clear();
        this.f7295i.removeCallbacks(this.f7296j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f7298l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f7298l = null;
        }
        BasePendingResult basePendingResult2 = this.f7297k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f7297k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        n6.l.e("Must be called from the main thread.");
        if (this.f7291b != 0 && (basePendingResult = this.f7298l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f7298l = null;
            }
            BasePendingResult basePendingResult3 = this.f7297k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f7297k = null;
            }
            h hVar = this.f7292c;
            hVar.getClass();
            n6.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f7298l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        int i10;
        c6.q e = this.f7292c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.f4448a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f4765b;
            }
            int i11 = e.e;
            int i12 = e.f4451f;
            int i13 = e.f4455w;
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
            return e.f4449b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f7299m) {
            try {
                Iterator it = this.f7299m.iterator();
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
        synchronized (this.f7299m) {
            try {
                Iterator it = this.f7299m.iterator();
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
        synchronized (this.f7299m) {
            try {
                Iterator it = this.f7299m.iterator();
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
