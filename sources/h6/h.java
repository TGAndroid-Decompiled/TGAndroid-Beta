package h6;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.a0;
import f6.e0;
import f6.f0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h implements f6.f {
    public static final j6.b f13950k = new j6.b("RemoteMediaClient", null);
    public final Object f13951a;
    public final y f13952b;
    public final j6.m f13953c;
    public final m d;
    public final c f13954e;
    public f0 f13955f;
    public TaskCompletionSource f13956g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f13957i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f13958j;

    static {
        String str = j6.m.v;
    }

    public h(j6.m mVar) {
        new ConcurrentHashMap();
        this.f13958j = new ConcurrentHashMap();
        this.f13951a = new Object();
        this.f13952b = new y(Looper.getMainLooper(), 0);
        m mVar2 = new m(this);
        this.d = mVar2;
        this.f13953c = mVar;
        mVar.h = new d6.i(this, 27);
        mVar.f17306c = mVar2;
        this.f13954e = new c(this);
    }

    public static com.google.android.gms.common.api.internal.s t() {
        com.google.android.gms.common.api.internal.s sVar = new com.google.android.gms.common.api.internal.s(null, 1);
        sVar.a(new n(new Status(17, null, null, null), 0));
        return sVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o4;
        synchronized (this.f13951a) {
            q6.m.e("Must be called from the main thread.");
            o4 = this.f13953c.o();
        }
        return o4;
    }

    public final int b() {
        int i7;
        synchronized (this.f13951a) {
            try {
                q6.m.e("Must be called from the main thread.");
                f6.q e10 = e();
                if (e10 != null) {
                    i7 = e10.f11476f;
                } else {
                    i7 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i7;
    }

    public final f6.o c() {
        q6.m.e("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 == null) {
            return null;
        }
        Integer num = (Integer) e10.O.get(e10.f11481x);
        if (num == null) {
            return null;
        }
        return (f6.o) e10.H.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f13951a) {
            q6.m.e("Must be called from the main thread.");
            f6.q qVar = this.f13953c.f17280f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f11472a;
            }
        }
        return mediaInfo;
    }

    public final f6.q e() {
        f6.q qVar;
        synchronized (this.f13951a) {
            q6.m.e("Must be called from the main thread.");
            qVar = this.f13953c.f17280f;
        }
        return qVar;
    }

    public final int f() {
        int i7;
        synchronized (this.f13951a) {
            try {
                q6.m.e("Must be called from the main thread.");
                f6.q e10 = e();
                if (e10 != null) {
                    i7 = e10.f11475e;
                } else {
                    i7 = 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i7;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j3;
        synchronized (this.f13951a) {
            q6.m.e("Must be called from the main thread.");
            f6.q qVar = this.f13953c.f17280f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f11472a;
            }
            if (mediaInfo != null) {
                j3 = mediaInfo.f6194e;
            } else {
                j3 = 0;
            }
        }
        return j3;
    }

    public final boolean h() {
        q6.m.e("Must be called from the main thread.");
        if (!i()) {
            q6.m.e("Must be called from the main thread.");
            f6.q e10 = e();
            if ((e10 == null || e10.f11475e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        q6.m.e("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 != null && e10.f11475e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        q6.m.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f6192b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        q6.m.e("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 != null && e10.f11481x != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        q6.m.e("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 == null) {
            return false;
        }
        if (e10.f11475e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        q6.m.e("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 != null && e10.f11475e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        q6.m.e("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 != null && e10.I) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: h6.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        q6.m.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f13957i.add(gVar);
        }
    }

    public final BasePendingResult q(f6.p pVar) {
        q6.m.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        q6.m.e("Must be called from the main thread.");
        int f10 = f();
        if (f10 != 4 && f10 != 2) {
            q6.m.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new i(this, 6));
                return;
            }
        }
        q6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 5));
        }
    }

    public final int s() {
        f6.o c10;
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
            if (k() && (c10 = c()) != null && c10.f11464a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f13955f;
        if (f0Var == null) {
            return;
        }
        q6.m.e("Must be called from the main thread.");
        String str = this.f13953c.f17305b;
        e0 e0Var = (e0) f0Var;
        j6.a.b(str);
        synchronized (e0Var.D) {
            e0Var.D.put(str, this);
        }
        t b10 = u.b();
        b10.f6386c = new a0(e0Var, str, this);
        b10.f6384a = 8413;
        e0Var.e(1, b10.a());
        q6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(e0 e0Var) {
        f6.f fVar;
        f0 f0Var = this.f13955f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f13953c.n();
                this.f13954e.c();
                q6.m.e("Must be called from the main thread.");
                String str = this.f13953c.f17305b;
                e0 e0Var2 = (e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.D) {
                        fVar = (f6.f) e0Var2.D.remove(str);
                    }
                    t b10 = u.b();
                    b10.f6386c = new a0(e0Var2, fVar, str);
                    b10.f6384a = 8414;
                    e0Var2.e(1, b10.a());
                    this.d.f13968b = null;
                    this.f13952b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f13955f = e0Var;
            if (e0Var != null) {
                this.d.f13968b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f13955f != null) {
            return true;
        }
        return false;
    }
}
