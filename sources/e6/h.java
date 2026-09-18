package e6;

import android.os.Looper;
import android.text.TextUtils;
import c6.a0;
import c6.e0;
import c6.f0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h implements c6.f {
    public static final g6.b f8012k = new g6.b("RemoteMediaClient", null);
    public final Object f8013a;
    public final c0 f8014b;
    public final g6.m f8015c;
    public final aa.a d;
    public final c e;
    public f0 f8016f;
    public TaskCompletionSource f8017g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f8018i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f8019j;

    static {
        String str = g6.m.v;
    }

    public h(g6.m mVar) {
        new ConcurrentHashMap();
        this.f8019j = new ConcurrentHashMap();
        this.f8013a = new Object();
        this.f8014b = new c0(Looper.getMainLooper(), 0);
        aa.a aVar = new aa.a(this);
        this.d = aVar;
        this.f8015c = mVar;
        mVar.h = new xa.c(this, 17);
        mVar.f9461c = aVar;
        this.e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new o(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(p pVar) {
        try {
            pVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            pVar.a(new o(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o9;
        synchronized (this.f8013a) {
            n6.l.e("Must be called from the main thread.");
            o9 = this.f8015c.o();
        }
        return o9;
    }

    public final int b() {
        int i10;
        synchronized (this.f8013a) {
            try {
                n6.l.e("Must be called from the main thread.");
                c6.q e = e();
                if (e != null) {
                    i10 = e.f4037f;
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final c6.o c() {
        n6.l.e("Must be called from the main thread.");
        c6.q e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.N.get(e.f4041w);
        if (num == null) {
            return null;
        }
        return (c6.o) e.G.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f8013a) {
            n6.l.e("Must be called from the main thread.");
            c6.q qVar = this.f8015c.f9438f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f4034a;
            }
        }
        return mediaInfo;
    }

    public final c6.q e() {
        c6.q qVar;
        synchronized (this.f8013a) {
            n6.l.e("Must be called from the main thread.");
            qVar = this.f8015c.f9438f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f8013a) {
            try {
                n6.l.e("Must be called from the main thread.");
                c6.q e = e();
                if (e != null) {
                    i10 = e.e;
                } else {
                    i10 = 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j3;
        synchronized (this.f8013a) {
            n6.l.e("Must be called from the main thread.");
            c6.q qVar = this.f8015c.f9438f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f4034a;
            }
            if (mediaInfo != null) {
                j3 = mediaInfo.e;
            } else {
                j3 = 0;
            }
        }
        return j3;
    }

    public final boolean h() {
        n6.l.e("Must be called from the main thread.");
        if (!i()) {
            n6.l.e("Must be called from the main thread.");
            c6.q e = e();
            if ((e == null || e.e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        n6.l.e("Must be called from the main thread.");
        c6.q e = e();
        if (e != null && e.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        n6.l.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f5991b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        n6.l.e("Must be called from the main thread.");
        c6.q e = e();
        if (e != null && e.f4041w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        n6.l.e("Must be called from the main thread.");
        c6.q e = e();
        if (e == null) {
            return false;
        }
        if (e.e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        n6.l.e("Must be called from the main thread.");
        c6.q e = e();
        if (e != null && e.e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        n6.l.e("Must be called from the main thread.");
        c6.q e = e();
        if (e != null && e.H) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: e6.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        n6.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f8018i.add(gVar);
        }
    }

    public final BasePendingResult q(c6.p pVar) {
        n6.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        k kVar = new k(this, pVar, 2);
        x(kVar);
        return kVar;
    }

    public final void r() {
        n6.l.e("Must be called from the main thread.");
        int f7 = f();
        if (f7 != 4 && f7 != 2) {
            n6.l.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new j(this, 6));
                return;
            }
        }
        n6.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new j(this, 5));
        }
    }

    public final int s() {
        c6.o c10;
        if (d() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (c10 = c()) != null && c10.f4027a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f8016f;
        if (f0Var == null) {
            return;
        }
        n6.l.e("Must be called from the main thread.");
        String str = this.f8015c.f9460b;
        e0 e0Var = (e0) f0Var;
        g6.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        v e = w.e();
        e.f6183c = new a0(e0Var, str, this);
        e.f6181a = 8413;
        e0Var.e(1, e.a());
        n6.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new j(this, 0));
        }
    }

    public final void v(e0 e0Var) {
        c6.f fVar;
        f0 f0Var = this.f8016f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f8015c.n();
                this.e.c();
                n6.l.e("Must be called from the main thread.");
                String str = this.f8015c.f9460b;
                e0 e0Var2 = (e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.C) {
                        fVar = (c6.f) e0Var2.C.remove(str);
                    }
                    v e = w.e();
                    e.f6183c = new a0(e0Var2, fVar, str);
                    e.f6181a = 8414;
                    e0Var2.e(1, e.a());
                    this.d.f359b = null;
                    this.f8014b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f8016f = e0Var;
            if (e0Var != null) {
                this.d.f359b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f8016f != null) {
            return true;
        }
        return false;
    }
}
