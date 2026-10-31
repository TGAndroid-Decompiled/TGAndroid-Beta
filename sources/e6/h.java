package e6;

import android.os.Looper;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import c6.e0;
import c6.f0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h implements c6.f {
    public static final g6.b f6284k = new g6.b("RemoteMediaClient", null);
    public final Object f6285a;
    public final z f6286b;
    public final g6.m f6287c;
    public final a0 d;
    public final c e;
    public f0 f6288f;
    public TaskCompletionSource f6289g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f6290i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f6291j;

    static {
        String str = g6.m.v;
    }

    public h(g6.m mVar) {
        new ConcurrentHashMap();
        this.f6291j = new ConcurrentHashMap();
        this.f6285a = new Object();
        this.f6286b = new z(Looper.getMainLooper(), 0);
        a0 a0Var = new a0(this);
        this.d = a0Var;
        this.f6287c = mVar;
        mVar.h = new za.c(this, 17);
        mVar.f7399c = a0Var;
        this.e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new m(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(n nVar) {
        try {
            nVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            nVar.a(new m(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.f6285a) {
            n6.l.d("Must be called from the main thread.");
            o10 = this.f6287c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.f6285a) {
            try {
                n6.l.d("Must be called from the main thread.");
                c6.q e = e();
                if (e != null) {
                    i10 = e.f3924f;
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
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.N.get(e.f3929x);
        if (num == null) {
            return null;
        }
        return (c6.o) e.G.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f6285a) {
            n6.l.d("Must be called from the main thread.");
            c6.q qVar = this.f6287c.f7376f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f3921a;
            }
        }
        return mediaInfo;
    }

    public final c6.q e() {
        c6.q qVar;
        synchronized (this.f6285a) {
            n6.l.d("Must be called from the main thread.");
            qVar = this.f6287c.f7376f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f6285a) {
            try {
                n6.l.d("Must be called from the main thread.");
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
        long j10;
        synchronized (this.f6285a) {
            n6.l.d("Must be called from the main thread.");
            c6.q qVar = this.f6287c.f7376f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f3921a;
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
        n6.l.d("Must be called from the main thread.");
        if (!i()) {
            n6.l.d("Must be called from the main thread.");
            c6.q e = e();
            if ((e == null || e.e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        if (e != null && e.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        n6.l.d("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f4303b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        if (e != null && e.f3929x != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        n6.l.d("Must be called from the main thread.");
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
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        if (e != null && e.e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        n6.l.d("Must be called from the main thread.");
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
        n6.l.d("Must be called from the main thread.");
        if (gVar != null) {
            this.f6290i.add(gVar);
        }
    }

    public final BasePendingResult q(c6.p pVar) {
        n6.l.d("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        n6.l.d("Must be called from the main thread.");
        int f7 = f();
        if (f7 != 4 && f7 != 2) {
            n6.l.d("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new i(this, 6));
                return;
            }
        }
        n6.l.d("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 5));
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
            if (k() && (c10 = c()) != null && c10.f3914a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f6288f;
        if (f0Var == null) {
            return;
        }
        n6.l.d("Must be called from the main thread.");
        String str = this.f6287c.f7398b;
        e0 e0Var = (e0) f0Var;
        g6.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        v b10 = w.b();
        b10.f4496c = new c6.a0(e0Var, str, this);
        b10.f4494a = 8413;
        e0Var.e(1, b10.a());
        n6.l.d("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(e0 e0Var) {
        c6.f fVar;
        f0 f0Var = this.f6288f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f6287c.n();
                this.e.c();
                n6.l.d("Must be called from the main thread.");
                String str = this.f6287c.f7398b;
                e0 e0Var2 = (e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.C) {
                        fVar = (c6.f) e0Var2.C.remove(str);
                    }
                    v b10 = w.b();
                    b10.f4496c = new c6.a0(e0Var2, fVar, str);
                    b10.f4494a = 8414;
                    e0Var2.e(1, b10.a());
                    this.d.f875b = null;
                    this.f6286b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f6288f = e0Var;
            if (e0Var != null) {
                this.d.f875b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f6288f != null) {
            return true;
        }
        return false;
    }
}
