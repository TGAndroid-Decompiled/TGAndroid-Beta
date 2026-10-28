package f6;

import a8.h0;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.a0;
import d6.e0;
import d6.f0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h implements d6.f {
    public static final h6.b f10212k = new h6.b("RemoteMediaClient", null);
    public final Object f10213a;
    public final y f10214b;
    public final h6.m f10215c;
    public final h0 d;
    public final c e;
    public f0 f10216f;
    public TaskCompletionSource f10217g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f10218i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f10219j;

    static {
        String str = h6.m.v;
    }

    public h(h6.m mVar) {
        new ConcurrentHashMap();
        this.f10219j = new ConcurrentHashMap();
        this.f10213a = new Object();
        this.f10214b = new y(Looper.getMainLooper(), 0);
        h0 h0Var = new h0(this);
        this.d = h0Var;
        this.f10215c = mVar;
        mVar.h = new rb.c(this, 19);
        mVar.f12652c = h0Var;
        this.e = new c(this);
    }

    public static t t() {
        t tVar = new t(null, 1);
        tVar.a(new n(new Status(17, null, null, null), 0));
        return tVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.f10213a) {
            o6.l.e("Must be called from the main thread.");
            o10 = this.f10215c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.f10213a) {
            try {
                o6.l.e("Must be called from the main thread.");
                d6.q e = e();
                if (e != null) {
                    i10 = e.f8121f;
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final d6.o c() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.N.get(e.f8125w);
        if (num == null) {
            return null;
        }
        return (d6.o) e.G.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f10213a) {
            o6.l.e("Must be called from the main thread.");
            d6.q qVar = this.f10215c.f12629f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f8118a;
            }
        }
        return mediaInfo;
    }

    public final d6.q e() {
        d6.q qVar;
        synchronized (this.f10213a) {
            o6.l.e("Must be called from the main thread.");
            qVar = this.f10215c.f12629f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f10213a) {
            try {
                o6.l.e("Must be called from the main thread.");
                d6.q e = e();
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
        long j10;
        synchronized (this.f10213a) {
            o6.l.e("Must be called from the main thread.");
            d6.q qVar = this.f10215c.f12629f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f8118a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.e;
            } else {
                j10 = 0;
            }
        }
        return j10;
    }

    public final boolean h() {
        o6.l.e("Must be called from the main thread.");
        if (!i()) {
            o6.l.e("Must be called from the main thread.");
            d6.q e = e();
            if ((e == null || e.e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        if (e != null && e.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        o6.l.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f6435b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        if (e != null && e.f8125w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
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
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        if (e != null && e.e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        if (e != null && e.H) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: f6.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        o6.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f10218i.add(gVar);
        }
    }

    public final BasePendingResult q(d6.p pVar) {
        o6.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        k kVar = new k(this, pVar, 2);
        x(kVar);
        return kVar;
    }

    public final void r() {
        o6.l.e("Must be called from the main thread.");
        int f7 = f();
        if (f7 != 4 && f7 != 2) {
            o6.l.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new j(this, 6));
                return;
            }
        }
        o6.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new j(this, 5));
        }
    }

    public final int s() {
        d6.o c10;
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
            if (k() && (c10 = c()) != null && c10.f8111a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f10216f;
        if (f0Var == null) {
            return;
        }
        o6.l.e("Must be called from the main thread.");
        String str = this.f10215c.f12651b;
        e0 e0Var = (e0) f0Var;
        h6.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        u b10 = v.b();
        b10.f6622c = new a0(e0Var, str, this);
        b10.f6620a = 8413;
        e0Var.e(1, b10.a());
        o6.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new j(this, 0));
        }
    }

    public final void v(e0 e0Var) {
        d6.f fVar;
        f0 f0Var = this.f10216f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f10215c.n();
                this.e.c();
                o6.l.e("Must be called from the main thread.");
                String str = this.f10215c.f12651b;
                e0 e0Var2 = (e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.C) {
                        fVar = (d6.f) e0Var2.C.remove(str);
                    }
                    u b10 = v.b();
                    b10.f6622c = new a0(e0Var2, fVar, str);
                    b10.f6620a = 8414;
                    e0Var2.e(1, b10.a());
                    this.d.f511b = null;
                    this.f10214b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f10216f = e0Var;
            if (e0Var != null) {
                this.d.f511b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f10216f != null) {
            return true;
        }
        return false;
    }
}
