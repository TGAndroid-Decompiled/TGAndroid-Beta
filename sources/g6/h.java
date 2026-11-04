package g6;

import android.os.Looper;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.e0;
import e6.f0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h implements e6.f {
    public static final i6.b f12006k = new i6.b("RemoteMediaClient", null);
    public final Object f12007a;
    public final z f12008b;
    public final i6.m f12009c;
    public final a0 d;
    public final c f12010e;
    public f0 f12011f;
    public TaskCompletionSource f12012g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f12013i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f12014j;

    static {
        String str = i6.m.v;
    }

    public h(i6.m mVar) {
        new ConcurrentHashMap();
        this.f12014j = new ConcurrentHashMap();
        this.f12007a = new Object();
        this.f12008b = new z(Looper.getMainLooper(), 0);
        a0 a0Var = new a0(this);
        this.d = a0Var;
        this.f12009c = mVar;
        mVar.h = new android.support.v4.media.c(this, 24);
        mVar.f14655c = a0Var;
        this.f12010e = new c(this);
    }

    public static com.google.android.gms.common.api.internal.r t() {
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(null, 1);
        rVar.a(new m(new Status(17, null, null, null), 0));
        return rVar;
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
        long o10;
        synchronized (this.f12007a) {
            p6.m.d("Must be called from the main thread.");
            o10 = this.f12009c.o();
        }
        return o10;
    }

    public final int b() {
        int i3;
        synchronized (this.f12007a) {
            try {
                p6.m.d("Must be called from the main thread.");
                e6.q e10 = e();
                if (e10 != null) {
                    i3 = e10.f9756f;
                } else {
                    i3 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i3;
    }

    public final e6.o c() {
        p6.m.d("Must be called from the main thread.");
        e6.q e10 = e();
        if (e10 == null) {
            return null;
        }
        Integer num = (Integer) e10.O.get(e10.f9761x);
        if (num == null) {
            return null;
        }
        return (e6.o) e10.H.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f12007a) {
            p6.m.d("Must be called from the main thread.");
            e6.q qVar = this.f12009c.f14631f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f9752a;
            }
        }
        return mediaInfo;
    }

    public final e6.q e() {
        e6.q qVar;
        synchronized (this.f12007a) {
            p6.m.d("Must be called from the main thread.");
            qVar = this.f12009c.f14631f;
        }
        return qVar;
    }

    public final int f() {
        int i3;
        synchronized (this.f12007a) {
            try {
                p6.m.d("Must be called from the main thread.");
                e6.q e10 = e();
                if (e10 != null) {
                    i3 = e10.f9755e;
                } else {
                    i3 = 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i3;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j10;
        synchronized (this.f12007a) {
            p6.m.d("Must be called from the main thread.");
            e6.q qVar = this.f12009c.f14631f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f9752a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.f6549e;
            } else {
                j10 = 0;
            }
        }
        return j10;
    }

    public final boolean h() {
        p6.m.d("Must be called from the main thread.");
        if (!i()) {
            p6.m.d("Must be called from the main thread.");
            e6.q e10 = e();
            if ((e10 == null || e10.f9755e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        p6.m.d("Must be called from the main thread.");
        e6.q e10 = e();
        if (e10 != null && e10.f9755e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        p6.m.d("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f6547b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        p6.m.d("Must be called from the main thread.");
        e6.q e10 = e();
        if (e10 != null && e10.f9761x != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        p6.m.d("Must be called from the main thread.");
        e6.q e10 = e();
        if (e10 == null) {
            return false;
        }
        if (e10.f9755e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        p6.m.d("Must be called from the main thread.");
        e6.q e10 = e();
        if (e10 != null && e10.f9755e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        p6.m.d("Must be called from the main thread.");
        e6.q e10 = e();
        if (e10 != null && e10.I) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: g6.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        p6.m.d("Must be called from the main thread.");
        if (gVar != null) {
            this.f12013i.add(gVar);
        }
    }

    public final BasePendingResult q(e6.p pVar) {
        p6.m.d("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        p6.m.d("Must be called from the main thread.");
        int f10 = f();
        if (f10 != 4 && f10 != 2) {
            p6.m.d("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new i(this, 6));
                return;
            }
        }
        p6.m.d("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 5));
        }
    }

    public final int s() {
        e6.o c2;
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
            if (k() && (c2 = c()) != null && c2.f9744a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f12011f;
        if (f0Var == null) {
            return;
        }
        p6.m.d("Must be called from the main thread.");
        String str = this.f12009c.f14654b;
        e0 e0Var = (e0) f0Var;
        i6.a.b(str);
        synchronized (e0Var.D) {
            e0Var.D.put(str, this);
        }
        s b10 = t.b();
        b10.f6737c = new e6.a0(e0Var, str, this);
        b10.f6735a = 8413;
        e0Var.e(1, b10.a());
        p6.m.d("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(e0 e0Var) {
        e6.f fVar;
        f0 f0Var = this.f12011f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f12009c.n();
                this.f12010e.c();
                p6.m.d("Must be called from the main thread.");
                String str = this.f12009c.f14654b;
                e0 e0Var2 = (e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.D) {
                        fVar = (e6.f) e0Var2.D.remove(str);
                    }
                    s b10 = t.b();
                    b10.f6737c = new e6.a0(e0Var2, fVar, str);
                    b10.f6735a = 8414;
                    e0Var2.e(1, b10.a());
                    this.d.f1186b = null;
                    this.f12008b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f12011f = e0Var;
            if (e0Var != null) {
                this.d.f1186b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f12011f != null) {
            return true;
        }
        return false;
    }
}
