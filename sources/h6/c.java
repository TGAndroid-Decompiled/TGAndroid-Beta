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
    public long f13581b;
    public final h f13582c;
    public ArrayList d;
    public final SparseIntArray f13583e;
    public final s f13584f;
    public final ArrayList f13585g;
    public final ArrayDeque h;
    public final y f13586i;
    public final r f13587j;
    public BasePendingResult f13588k;
    public BasePendingResult f13589l;
    public final Set f13590m = DesugarCollections.synchronizedSet(new HashSet());
    public final j6.b f13580a = new j6.b("MediaQueue", null);

    public c(h hVar) {
        this.f13582c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f13583e = new SparseIntArray();
        this.f13585g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f13586i = new y(Looper.getMainLooper(), 0);
        this.f13587j = new r(this, 0);
        hVar.p(new c0(this, 1));
        this.f13584f = new s(this);
        this.f13581b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f13590m) {
            try {
                Iterator it = cVar.f13590m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f13583e;
        sparseIntArray.clear();
        for (int i7 = 0; i7 < cVar.d.size(); i7++) {
            sparseIntArray.put(((Integer) cVar.d.get(i7)).intValue(), i7);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f13583e.clear();
        this.f13584f.evictAll();
        this.f13585g.clear();
        this.f13586i.removeCallbacks(this.f13587j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f13589l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f13589l = null;
        }
        BasePendingResult basePendingResult2 = this.f13588k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f13588k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        q6.m.d("Must be called from the main thread.");
        if (this.f13581b != 0 && (basePendingResult = this.f13589l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f13589l = null;
            }
            BasePendingResult basePendingResult3 = this.f13588k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f13588k = null;
            }
            h hVar = this.f13582c;
            hVar.getClass();
            q6.m.d("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f13589l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i7;
        f6.q e10 = this.f13582c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f11123a;
            if (mediaInfo == null) {
                i7 = -1;
            } else {
                i7 = mediaInfo.f5877b;
            }
            int i10 = e10.f11126e;
            int i11 = e10.f11127f;
            int i12 = e10.f11132x;
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
            return e10.f11124b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f13590m) {
            try {
                Iterator it = this.f13590m.iterator();
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
        synchronized (this.f13590m) {
            try {
                Iterator it = this.f13590m.iterator();
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
        synchronized (this.f13590m) {
            try {
                Iterator it = this.f13590m.iterator();
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
