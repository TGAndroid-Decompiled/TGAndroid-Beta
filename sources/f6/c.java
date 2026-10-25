package f6;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.y;
import e6.c0;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public final class c {
    public long f10191b;
    public final h f10192c;
    public ArrayList d;
    public final SparseIntArray e;
    public final s f10193f;
    public final ArrayList f10194g;
    public final ArrayDeque h;
    public final y f10195i;
    public final r f10196j;
    public BasePendingResult f10197k;
    public BasePendingResult f10198l;
    public final Set f10199m = DesugarCollections.synchronizedSet(new HashSet());
    public final h6.b f10190a = new h6.b("MediaQueue", null);

    public c(h hVar) {
        this.f10192c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.f10194g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f10195i = new y(Looper.getMainLooper(), 0);
        this.f10196j = new r(this, 0);
        hVar.p(new c0(this, 1));
        this.f10193f = new s(this);
        this.f10191b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f10199m) {
            try {
                Iterator it = cVar.f10199m.iterator();
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
        this.f10193f.evictAll();
        this.f10194g.clear();
        this.f10195i.removeCallbacks(this.f10196j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f10198l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f10198l = null;
        }
        BasePendingResult basePendingResult2 = this.f10197k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f10197k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        o6.l.e("Must be called from the main thread.");
        if (this.f10191b != 0 && (basePendingResult = this.f10198l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f10198l = null;
            }
            BasePendingResult basePendingResult3 = this.f10197k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f10197k = null;
            }
            h hVar = this.f10192c;
            hVar.getClass();
            o6.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            }
            this.f10198l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i10;
        d6.q e = this.f10192c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.f8118a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f6435b;
            }
            int i11 = e.e;
            int i12 = e.f8121f;
            int i13 = e.f8125w;
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
            return e.f8119b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f10199m) {
            try {
                Iterator it = this.f10199m.iterator();
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
        synchronized (this.f10199m) {
            try {
                Iterator it = this.f10199m.iterator();
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
        synchronized (this.f10199m) {
            try {
                Iterator it = this.f10199m.iterator();
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
