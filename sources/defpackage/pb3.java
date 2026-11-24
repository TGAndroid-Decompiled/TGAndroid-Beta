package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
public final class pb3 implements is3 {
    public final Set E;
    public int F;
    public t64 G;
    public mb3 H;
    public mb3 I;
    public Looper J;
    public Handler K;
    public byte[] L;
    public we8 M;
    public volatile c1 N;
    public final UUID a;
    public final zo4 b;
    public final yh4 c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final hi2 n;
    public final k4f r;
    public final ni6 s;
    public final int w;
    public final ArrayList x;
    public final Set y;

    public pb3(UUID uuid, yh4 yh4Var, HashMap hashMap, boolean z, int[] iArr, boolean z2, k4f k4fVar) {
        uuid.getClass();
        jte.e("Use C.CLEARKEY_UUID instead", !n61.c.equals(uuid));
        this.a = uuid;
        this.b = nr4.d;
        this.c = yh4Var;
        this.d = hashMap;
        this.e = z;
        this.f = iArr;
        this.h = z2;
        this.r = k4fVar;
        this.n = new hi2((byte) 21);
        this.s = new ni6(this, (byte) 25);
        this.x = new ArrayList();
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.E = Collections.newSetFromMap(new IdentityHashMap());
        this.w = 300000;
    }

    public static boolean c(mb3 mb3Var) {
        mb3Var.p();
        if (mb3Var.p == 1) {
            bs3 g = mb3Var.g();
            g.getClass();
            Throwable cause = g.getCause();
            if ((cause instanceof ResourceBusyException) || sge.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList h(as3 as3Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(as3Var.d);
        for (int i = 0; i < as3Var.d; i++) {
            zr3 zr3Var = as3Var.a[i];
            if ((zr3Var.a(uuid) || (n61.d.equals(uuid) && zr3Var.a(n61.c))) && (zr3Var.e != null || z)) {
                arrayList.add(zr3Var);
            }
        }
        return arrayList;
    }

    @Override
    public final void a() {
        t64 dhfVar;
        j(true);
        int i = this.F;
        this.F = i + 1;
        if (i == 0) {
            if (this.G == null) {
                UUID uuid = this.a;
                this.b.getClass();
                try {
                    try {
                        dhfVar = new nr4(uuid);
                    } catch (h8c unused) {
                        ncd.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        dhfVar = new dhf((byte) 18);
                    }
                    this.G = dhfVar;
                    dhfVar.m(new sz4(this));
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e2) {
                    throw new Exception(e2);
                }
            } else if (this.w != -9223372036854775807L) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.x;
                    if (i2 < arrayList.size()) {
                        ((mb3) arrayList.get(i2)).d(null);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final defpackage.cs3 b(android.os.Looper r7, defpackage.fs3 r8, defpackage.go4 r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb3.b(android.os.Looper, fs3, go4, boolean):cs3");
    }

    @Override
    public final cs3 d(fs3 fs3Var, go4 go4Var) {
        boolean z = false;
        j(false);
        if (this.F > 0) {
            z = true;
        }
        jte.p(z);
        this.J.getClass();
        return b(this.J, fs3Var, go4Var, true);
    }

    public final mb3 e(List list, boolean z, fs3 fs3Var) {
        this.G.getClass();
        t64 t64Var = this.G;
        byte[] bArr = this.L;
        Looper looper = this.J;
        looper.getClass();
        we8 we8Var = this.M;
        we8Var.getClass();
        mb3 mb3Var = new mb3(this.a, t64Var, this.n, this.s, list, this.h | z, z, bArr, this.d, this.c, looper, this.r, we8Var);
        mb3Var.d(fs3Var);
        if (this.w != -9223372036854775807L) {
            mb3Var.d(null);
        }
        return mb3Var;
    }

    public final mb3 f(List list, boolean z, fs3 fs3Var, boolean z2) {
        mb3 e = e(list, z, fs3Var);
        boolean c = c(e);
        int i = this.w;
        Set set = this.E;
        if (c && !set.isEmpty()) {
            v7c n = yo5.q(set).n();
            while (n.hasNext()) {
                ((cs3) n.next()).c(null);
            }
            e.c(fs3Var);
            if (i != -9223372036854775807L) {
                e.c(null);
            }
            e = e(list, z, fs3Var);
        }
        if (c(e) && z2) {
            Set set2 = this.y;
            if (!set2.isEmpty()) {
                v7c n2 = yo5.q(set2).n();
                while (n2.hasNext()) {
                    ((ob3) n2.next()).release();
                }
                if (!set.isEmpty()) {
                    v7c n3 = yo5.q(set).n();
                    while (n3.hasNext()) {
                        ((cs3) n3.next()).c(null);
                    }
                }
                e.c(fs3Var);
                if (i != -9223372036854775807L) {
                    e.c(null);
                }
                return e(list, z, fs3Var);
            }
        }
        return e;
    }

    @Override
    public final hs3 g(fs3 fs3Var, go4 go4Var) {
        boolean z;
        if (this.F > 0) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        this.J.getClass();
        ob3 ob3Var = new ob3(this, fs3Var);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new mv2(ob3Var, go4Var, (byte) 28));
        return ob3Var;
    }

    public final void i() {
        if (this.G != null && this.F == 0 && this.x.isEmpty() && this.y.isEmpty()) {
            t64 t64Var = this.G;
            t64Var.getClass();
            t64Var.release();
            this.G = null;
        }
    }

    public final void j(boolean z) {
        if (z && this.J == null) {
            ncd.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.J;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            ncd.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.J.getThread().getName(), new IllegalStateException());
        }
    }

    @Override
    public final void release() {
        j(true);
        int i = this.F - 1;
        this.F = i;
        if (i != 0) {
            return;
        }
        if (this.w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.x);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((mb3) arrayList.get(i2)).c(null);
            }
        }
        v7c n = yo5.q(this.y).n();
        while (n.hasNext()) {
            ((ob3) n.next()).release();
        }
        i();
    }

    @Override
    public final void w(Looper looper, we8 we8Var) {
        boolean z;
        synchronized (this) {
            Looper looper2 = this.J;
            if (looper2 == null) {
                this.J = looper;
                this.K = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z = true;
                } else {
                    z = false;
                }
                jte.p(z);
                this.K.getClass();
            }
        }
        this.M = we8Var;
    }

    @Override
    public final int x(go4 go4Var) {
        j(false);
        t64 t64Var = this.G;
        t64Var.getClass();
        int r = t64Var.r();
        as3 as3Var = go4Var.x;
        if (as3Var == null) {
            int h = wf7.h(go4Var.t);
            int i = 0;
            while (true) {
                int[] iArr = this.f;
                if (i < iArr.length) {
                    if (iArr[i] == h) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.L == null) {
            UUID uuid = this.a;
            if (h(as3Var, uuid, true).isEmpty()) {
                if (as3Var.d == 1 && as3Var.a[0].a(n61.c)) {
                    ncd.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = as3Var.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return r;
    }
}
