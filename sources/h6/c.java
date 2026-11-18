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
    public long f13893b;
    public final h f13894c;
    public ArrayList d;
    public final SparseIntArray f13895e;
    public final s f13896f;
    public final ArrayList f13897g;
    public final ArrayDeque h;
    public final y f13898i;
    public final r f13899j;
    public BasePendingResult f13900k;
    public BasePendingResult f13901l;
    public final Set f13902m = DesugarCollections.synchronizedSet(new HashSet());
    public final j6.b f13892a = new j6.b("MediaQueue", null);

    public c(h hVar) {
        this.f13894c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f13895e = new SparseIntArray();
        this.f13897g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f13898i = new y(Looper.getMainLooper(), 0);
        this.f13899j = new r(this, 0);
        hVar.p(new c0(this, 1));
        this.f13896f = new s(this);
        this.f13893b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f13902m) {
            try {
                Iterator it = cVar.f13902m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f13895e;
        sparseIntArray.clear();
        for (int i7 = 0; i7 < cVar.d.size(); i7++) {
            sparseIntArray.put(((Integer) cVar.d.get(i7)).intValue(), i7);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f13895e.clear();
        this.f13896f.evictAll();
        this.f13897g.clear();
        this.f13898i.removeCallbacks(this.f13899j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f13901l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f13901l = null;
        }
        BasePendingResult basePendingResult2 = this.f13900k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f13900k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        q6.m.e("Must be called from the main thread.");
        if (this.f13893b != 0 && (basePendingResult = this.f13901l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f13901l = null;
            }
            BasePendingResult basePendingResult3 = this.f13900k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f13900k = null;
            }
            h hVar = this.f13894c;
            hVar.getClass();
            q6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f13901l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i7;
        f6.q e10 = this.f13894c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f11440a;
            if (mediaInfo == null) {
                i7 = -1;
            } else {
                i7 = mediaInfo.f6160b;
            }
            int i10 = e10.f11443e;
            int i11 = e10.f11444f;
            int i12 = e10.f11449x;
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
            return e10.f11441b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f13902m) {
            try {
                Iterator it = this.f13902m.iterator();
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
        synchronized (this.f13902m) {
            try {
                Iterator it = this.f13902m.iterator();
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
        synchronized (this.f13902m) {
            try {
                Iterator it = this.f13902m.iterator();
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
