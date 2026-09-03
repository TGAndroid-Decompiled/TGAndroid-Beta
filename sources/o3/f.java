package o3;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m.j0;
import n7.qa;
import nh.n4;
import s8.i0;
import s8.u0;
public final class f implements p {
    public int B;
    public w C;
    public b D;
    public b E;
    public Looper F;
    public Handler G;
    public byte[] H;
    public k3.k I;
    public volatile androidx.mediarouter.app.d J;
    public final UUID f16232a;
    public final j0 f16233b;
    public final cb.m f16234c;
    public final HashMap d;
    public final boolean e;
    public final int[] f16235f;
    public final boolean h;
    public final qa f16236n;
    public final z9.d f16237r;
    public final ja.c f16238s;
    public final long v;
    public final ArrayList f16239w;
    public final Set f16240x;
    public final Set f16241y;

    public f(UUID uuid, cb.m mVar, HashMap hashMap, boolean z4, int[] iArr, boolean z10, z9.d dVar) {
        uuid.getClass();
        h5.a.e("Use C.CLEARKEY_UUID instead", !j3.h.f8576b.equals(uuid));
        this.f16232a = uuid;
        this.f16233b = a0.d;
        this.f16234c = mVar;
        this.d = hashMap;
        this.e = z4;
        this.f16235f = iArr;
        this.h = z10;
        this.f16237r = dVar;
        this.f16236n = new qa();
        this.f16238s = new ja.c(this, 24);
        this.f16239w = new ArrayList();
        this.f16240x = Collections.newSetFromMap(new IdentityHashMap());
        this.f16241y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.o();
        if (bVar.f16218o == 1) {
            if (h5.d0.f6924a >= 19) {
                i g10 = bVar.g();
                g10.getClass();
                if (!(g10.getCause() instanceof ResourceBusyException)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static ArrayList f(h hVar, UUID uuid, boolean z4) {
        ArrayList arrayList = new ArrayList(hVar.d);
        for (int i10 = 0; i10 < hVar.d; i10++) {
            g gVar = hVar.f16245a[i10];
            if ((gVar.a(uuid) || (j3.h.f8577c.equals(uuid) && gVar.a(j3.h.f8576b))) && (gVar.e != null || z4)) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    @Override
    public final o C(m mVar, n0 n0Var) {
        boolean z4;
        if (this.B > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        h5.a.j(this.F);
        e eVar = new e(this, mVar);
        Handler handler = this.G;
        handler.getClass();
        handler.post(new n4(21, eVar, n0Var));
        return eVar;
    }

    @Override
    public final j W1(m mVar, n0 n0Var) {
        boolean z4 = false;
        h(false);
        if (this.B > 0) {
            z4 = true;
        }
        h5.a.i(z4);
        h5.a.j(this.F);
        return a(this.F, mVar, n0Var, true);
    }

    public final j a(Looper looper, m mVar, n0 n0Var, boolean z4) {
        ArrayList arrayList;
        if (this.J == null) {
            this.J = new androidx.mediarouter.app.d(this, looper, 8);
        }
        h hVar = n0Var.F;
        int i10 = 0;
        b bVar = null;
        if (hVar == null) {
            int g10 = h5.o.g(n0Var.C);
            w wVar = this.C;
            wVar.getClass();
            if (wVar.h0() != 2 || !x.d) {
                int[] iArr = this.f16235f;
                while (true) {
                    if (i10 < iArr.length) {
                        if (iArr[i10] == g10) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != -1 && wVar.h0() != 1) {
                    b bVar2 = this.D;
                    if (bVar2 == null) {
                        s8.t tVar = s8.v.f44222b;
                        b e = e(i0.e, true, null, z4);
                        this.f16239w.add(e);
                        this.D = e;
                    } else {
                        bVar2.d(null);
                    }
                    return this.D;
                }
            }
            return null;
        }
        if (this.H == null) {
            arrayList = f(hVar, this.f16232a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f16232a);
                h5.a.p("DefaultDrmSessionMgr", "DRM error", exc);
                if (mVar != null) {
                    mVar.d(exc);
                }
                return new t(new i(exc, 6003));
            }
        } else {
            arrayList = null;
        }
        if (!this.e) {
            bVar = this.E;
        } else {
            ArrayList arrayList2 = this.f16239w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (h5.d0.a(bVar3.f16207a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e6 = e(arrayList, false, mVar, z4);
            if (!this.e) {
                this.E = e6;
            }
            this.f16239w.add(e6);
            return e6;
        }
        bVar.d(mVar);
        return bVar;
    }

    @Override
    public final void b() {
        w aVar;
        h(true);
        int i10 = this.B;
        this.B = i10 + 1;
        if (i10 == 0) {
            if (this.C == null) {
                UUID uuid = this.f16232a;
                this.f16233b.getClass();
                try {
                    try {
                        aVar = new a0(uuid);
                    } catch (d0 unused) {
                        h5.a.o("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        aVar = new db.a(14);
                    }
                    this.C = aVar;
                    aVar.C(new c(this, 0));
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e6) {
                    throw new Exception(e6);
                }
            } else if (this.v != -9223372036854775807L) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f16239w;
                    if (i11 < arrayList.size()) {
                        ((b) arrayList.get(i11)).d(null);
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final b d(List list, boolean z4, m mVar) {
        this.C.getClass();
        w wVar = this.C;
        byte[] bArr = this.H;
        Looper looper = this.F;
        looper.getClass();
        k3.k kVar = this.I;
        kVar.getClass();
        b bVar = new b(this.f16232a, wVar, this.f16236n, this.f16238s, list, this.h | z4, z4, bArr, this.d, this.f16234c, looper, this.f16237r, kVar);
        bVar.d(mVar);
        if (this.v != -9223372036854775807L) {
            bVar.d(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z4, m mVar, boolean z10) {
        b d = d(list, z4, mVar);
        boolean c3 = c(d);
        long j10 = this.v;
        Set set = this.f16241y;
        if (c3 && !set.isEmpty()) {
            u0 it = s8.z.u(set).iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(null);
            }
            d.c(mVar);
            if (j10 != -9223372036854775807L) {
                d.c(null);
            }
            d = d(list, z4, mVar);
        }
        if (c(d) && z10) {
            Set set2 = this.f16240x;
            if (!set2.isEmpty()) {
                u0 it2 = s8.z.u(set2).iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    u0 it3 = s8.z.u(set).iterator();
                    while (it3.hasNext()) {
                        ((j) it3.next()).c(null);
                    }
                }
                d.c(mVar);
                if (j10 != -9223372036854775807L) {
                    d.c(null);
                }
                return d(list, z4, mVar);
            }
        }
        return d;
    }

    @Override
    public final void e0(Looper looper, k3.k kVar) {
        boolean z4;
        synchronized (this) {
            try {
                Looper looper2 = this.F;
                if (looper2 == null) {
                    this.F = looper;
                    this.G = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.i(z4);
                    this.G.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.I = kVar;
    }

    public final void g() {
        if (this.C != null && this.B == 0 && this.f16239w.isEmpty() && this.f16240x.isEmpty()) {
            w wVar = this.C;
            wVar.getClass();
            wVar.release();
            this.C = null;
        }
    }

    public final void h(boolean z4) {
        if (z4 && this.F == null) {
            h5.a.L("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.F;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            h5.a.L("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.F.getThread().getName(), new IllegalStateException());
        }
    }

    @Override
    public final void release() {
        h(true);
        int i10 = this.B - 1;
        this.B = i10;
        if (i10 != 0) {
            return;
        }
        if (this.v != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f16239w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).c(null);
            }
        }
        u0 it = s8.z.u(this.f16240x).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        g();
    }

    @Override
    public final int z(n0 n0Var) {
        h(false);
        w wVar = this.C;
        wVar.getClass();
        int h02 = wVar.h0();
        h hVar = n0Var.F;
        if (hVar == null) {
            int g10 = h5.o.g(n0Var.C);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f16235f;
                if (i10 < iArr.length) {
                    if (iArr[i10] == g10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                return 0;
            }
        } else if (this.H == null) {
            UUID uuid = this.f16232a;
            if (f(hVar, uuid, true).isEmpty()) {
                if (hVar.d == 1 && hVar.f16245a[0].a(j3.h.f8576b)) {
                    h5.a.K("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = hVar.f16247c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : h5.d0.f6924a < 25)) {
                return 1;
            }
        }
        return h02;
    }
}
