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
    public long f13888b;
    public final h f13889c;
    public ArrayList d;
    public final SparseIntArray f13890e;
    public final t f13891f;
    public final ArrayList f13892g;
    public final ArrayDeque h;
    public final y f13893i;
    public final s f13894j;
    public BasePendingResult f13895k;
    public BasePendingResult f13896l;
    public final Set f13897m = DesugarCollections.synchronizedSet(new HashSet());
    public final j6.b f13887a = new j6.b("MediaQueue", null);

    public c(h hVar) {
        this.f13889c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f13890e = new SparseIntArray();
        this.f13892g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f13893i = new y(Looper.getMainLooper(), 0);
        this.f13894j = new s(this, 0);
        hVar.p(new c0(this, 1));
        this.f13891f = new t(this);
        this.f13888b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f13897m) {
            try {
                Iterator it = cVar.f13897m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f13890e;
        sparseIntArray.clear();
        for (int i7 = 0; i7 < cVar.d.size(); i7++) {
            sparseIntArray.put(((Integer) cVar.d.get(i7)).intValue(), i7);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f13890e.clear();
        this.f13891f.evictAll();
        this.f13892g.clear();
        this.f13893i.removeCallbacks(this.f13894j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f13896l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f13896l = null;
        }
        BasePendingResult basePendingResult2 = this.f13895k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f13895k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        q6.m.e("Must be called from the main thread.");
        if (this.f13888b != 0 && (basePendingResult = this.f13896l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f13896l = null;
            }
            BasePendingResult basePendingResult3 = this.f13895k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f13895k = null;
            }
            h hVar = this.f13889c;
            hVar.getClass();
            q6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f13896l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        int i7;
        f6.q e10 = this.f13889c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f11434a;
            if (mediaInfo == null) {
                i7 = -1;
            } else {
                i7 = mediaInfo.f6155b;
            }
            int i10 = e10.f11437e;
            int i11 = e10.f11438f;
            int i12 = e10.f11443x;
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
            return e10.f11435b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f13897m) {
            try {
                Iterator it = this.f13897m.iterator();
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
        synchronized (this.f13897m) {
            try {
                Iterator it = this.f13897m.iterator();
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
        synchronized (this.f13897m) {
            try {
                Iterator it = this.f13897m.iterator();
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
