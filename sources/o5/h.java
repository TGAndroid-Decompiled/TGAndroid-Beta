package o5;

import android.os.Looper;
import android.text.TextUtils;
import c2.u0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.a0;
import m5.f0;
import m5.g0;
public final class h implements m5.f {
    public static final q5.b f18983k = new q5.b("RemoteMediaClient", null);
    public final Object f18984a;
    public final u0 f18985b;
    public final q5.n f18986c;
    public final j4.c d;
    public final c f18987e;
    public g0 f18988f;
    public TaskCompletionSource f18989g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f18990i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f18991j;

    static {
        String str = q5.n.v;
    }

    public h(q5.n nVar) {
        new ConcurrentHashMap();
        this.f18991j = new ConcurrentHashMap();
        this.f18984a = new Object();
        this.f18985b = new u0(Looper.getMainLooper(), 1);
        j4.c cVar = new j4.c(this);
        this.d = cVar;
        this.f18986c = nVar;
        nVar.h = new n2.p(this, 5);
        nVar.f46047c = cVar;
        this.f18987e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new m(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(n nVar) {
        try {
            nVar.p();
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (Throwable unused) {
            nVar.a(new m(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o6;
        synchronized (this.f18984a) {
            x5.l.e("Must be called from the main thread.");
            o6 = this.f18986c.o();
        }
        return o6;
    }

    public final int b() {
        int i9;
        synchronized (this.f18984a) {
            try {
                x5.l.e("Must be called from the main thread.");
                m5.q e10 = e();
                if (e10 != null) {
                    i9 = e10.f17457f;
                } else {
                    i9 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9;
    }

    public final m5.o c() {
        x5.l.e("Must be called from the main thread.");
        m5.q e10 = e();
        if (e10 == null) {
            return null;
        }
        Integer num = (Integer) e10.J.get(e10.f17461w);
        if (num == null) {
            return null;
        }
        return (m5.o) e10.C.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f18984a) {
            x5.l.e("Must be called from the main thread.");
            m5.q qVar = this.f18986c.f46023f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f17453a;
            }
        }
        return mediaInfo;
    }

    public final m5.q e() {
        m5.q qVar;
        synchronized (this.f18984a) {
            x5.l.e("Must be called from the main thread.");
            qVar = this.f18986c.f46023f;
        }
        return qVar;
    }

    public final int f() {
        int i9;
        synchronized (this.f18984a) {
            try {
                x5.l.e("Must be called from the main thread.");
                m5.q e10 = e();
                if (e10 != null) {
                    i9 = e10.f17456e;
                } else {
                    i9 = 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j10;
        synchronized (this.f18984a) {
            x5.l.e("Must be called from the main thread.");
            m5.q qVar = this.f18986c.f46023f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f17453a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.f2709e;
            } else {
                j10 = 0;
            }
        }
        return j10;
    }

    public final boolean h() {
        x5.l.e("Must be called from the main thread.");
        if (!i()) {
            x5.l.e("Must be called from the main thread.");
            m5.q e10 = e();
            if ((e10 == null || e10.f17456e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        x5.l.e("Must be called from the main thread.");
        m5.q e10 = e();
        if (e10 != null && e10.f17456e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        x5.l.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f2707b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        x5.l.e("Must be called from the main thread.");
        m5.q e10 = e();
        if (e10 != null && e10.f17461w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        x5.l.e("Must be called from the main thread.");
        m5.q e10 = e();
        if (e10 == null) {
            return false;
        }
        if (e10.f17456e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        x5.l.e("Must be called from the main thread.");
        m5.q e10 = e();
        if (e10 != null && e10.f17456e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        x5.l.e("Must be called from the main thread.");
        m5.q e10 = e();
        if (e10 != null && e10.D) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: o5.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        x5.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f18990i.add(gVar);
        }
    }

    public final BasePendingResult q(m5.p pVar) {
        x5.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        x5.l.e("Must be called from the main thread.");
        int f10 = f();
        if (f10 != 4 && f10 != 2) {
            x5.l.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new i(this, 6));
                return;
            }
        }
        x5.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 5));
        }
    }

    public final int s() {
        m5.o c10;
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
            if (k() && (c10 = c()) != null && c10.f17445a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        g0 g0Var = this.f18988f;
        if (g0Var == null) {
            return;
        }
        x5.l.e("Must be called from the main thread.");
        String str = this.f18986c.f46046b;
        f0 f0Var = (f0) g0Var;
        q5.a.b(str);
        synchronized (f0Var.C) {
            f0Var.C.put(str, this);
        }
        v b10 = w.b();
        b10.f2914c = new a0(f0Var, str, this);
        b10.f2912a = 8413;
        f0Var.e(1, b10.b());
        x5.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(f0 f0Var) {
        m5.f fVar;
        g0 g0Var = this.f18988f;
        if (g0Var != f0Var) {
            if (g0Var != null) {
                this.f18986c.n();
                this.f18987e.c();
                x5.l.e("Must be called from the main thread.");
                String str = this.f18986c.f46046b;
                f0 f0Var2 = (f0) g0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (f0Var2.C) {
                        fVar = (m5.f) f0Var2.C.remove(str);
                    }
                    v b10 = w.b();
                    b10.f2914c = new a0(f0Var2, fVar, str);
                    b10.f2912a = 8414;
                    f0Var2.e(1, b10.b());
                    this.d.f13431b = null;
                    this.f18985b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f18988f = f0Var;
            if (f0Var != null) {
                this.d.f13431b = f0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f18988f != null) {
            return true;
        }
        return false;
    }
}
