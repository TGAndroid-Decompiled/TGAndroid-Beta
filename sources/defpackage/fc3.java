package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public final class fc3 implements ga6 {
    public static final wa3 N = new wa3((byte) 7);
    public mo5 E;
    public mo5 F;
    public mo5 G;
    public mo5 H;
    public Uri I;
    public ch5 J;
    public Uri K;
    public boolean L;
    public final k6d a;
    public final kh5 b;
    public final k4f c;
    public kq f;
    public mx6 h;
    public Handler n;
    public dh5 r;
    public eb3 s;
    public gh5 w;
    public bx7 x;
    public rg5 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long M = -9223372036854775807L;

    public fc3(k6d k6dVar, k4f k4fVar, kh5 kh5Var) {
        this.a = k6dVar;
        this.b = kh5Var;
        this.c = k4fVar;
    }

    @Override
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        dx7 dx7Var = (dx7) ja6Var;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        if (i != 0) {
            c0b c0bVar = dx7Var.d;
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
        }
        this.f.u(new ea6(da6Var), dx7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final void a(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            nh5 nh5Var = (nh5) list.get(i);
            ec3 ec3Var = new ec3(this, nh5Var, z);
            v7c n = yo5.q(nh5Var.b.values()).n();
            while (n.hasNext()) {
                this.d.put((Uri) n.next(), ec3Var);
            }
        }
    }

    public final ch5 b(Uri uri, boolean z) {
        HashMap hashMap = this.d;
        ec3 ec3Var = (ec3) hashMap.get(uri);
        if (ec3Var == null) {
            return null;
        }
        ch5 b = ec3Var.b(uri);
        if (b != null && z) {
            h(uri, false);
            ec3 ec3Var2 = (ec3) hashMap.get(uri);
            ec3Var2.getClass();
            HashMap hashMap2 = ec3Var2.b;
            jte.p(hashMap2.containsKey(uri));
            dc3 dc3Var = (dc3) hashMap2.get(uri);
            dc3Var.getClass();
            if (!dc3Var.x) {
                jte.p(hashMap2.containsKey(uri));
                dc3 dc3Var2 = (dc3) hashMap2.get(uri);
                dc3Var2.getClass();
                dc3Var2.x = true;
                ch5 b2 = ec3Var2.b(uri);
                if (b2 != null && !b2.o) {
                    ec3Var2.e(uri, true);
                }
            }
        }
        return b;
    }

    public final mo5 c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.H;
                }
                return this.G;
            }
            return this.F;
        }
        return this.E;
    }

    public final Uri d(Uri uri) {
        yg5 yg5Var;
        ch5 ch5Var = this.J;
        if (ch5Var != null && ch5Var.v.e && (yg5Var = (yg5) ch5Var.t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(yg5Var.b));
            int i = yg5Var.c;
            if (i != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(long j, Uri uri) {
        ec3 ec3Var = (ec3) this.d.get(uri);
        if (ec3Var != null) {
            return ec3Var.c(j, uri);
        }
        return false;
    }

    public final boolean f(nh5 nh5Var, long j) {
        boolean z;
        ec3 ec3Var = (ec3) this.d.get(nh5Var.b());
        if (ec3Var == null) {
            return false;
        }
        Iterator it = ec3Var.b.values().iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            if (j <= ((dc3) it.next()).r) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return z2;
    }

    @Override
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        long min;
        dx7 dx7Var = (dx7) ja6Var;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        byte b = dx7Var.c;
        this.c.getClass();
        Throwable th = iOException;
        while (true) {
            z = true;
            if (th != null) {
                if ((th instanceof bx7) || (th instanceof FileNotFoundException) || (th instanceof hi5) || (th instanceof la6) || ((th instanceof d83) && ((d83) th).a == 2008)) {
                    break;
                }
                th = th.getCause();
            } else {
                min = Math.min((i - 1) * 1000, 5000);
                break;
            }
        }
        min = -9223372036854775807L;
        if (min != -9223372036854775807L) {
            z = false;
        }
        this.f.s(ea6Var, b, iOException, z);
        if (z) {
            return mx6.E;
        }
        return new ha6(0, min);
    }

    public final boolean g(Uri uri) {
        byte b;
        ec3 ec3Var = (ec3) this.d.get(uri);
        if (ec3Var != null) {
            HashMap hashMap = ec3Var.b;
            jte.p(hashMap.containsKey(uri));
            dc3 dc3Var = (dc3) hashMap.get(uri);
            dc3Var.getClass();
            if (dc3Var.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, hac.i0(dc3Var.e.u));
                ch5 ch5Var = dc3Var.e;
                if (ch5Var.o || (b = ch5Var.d) == 2 || b == 1 || dc3Var.f + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        gh5 gh5Var;
        dx7 dx7Var = (dx7) ja6Var;
        hh5 hh5Var = (hh5) dx7Var.f;
        boolean z = hh5Var instanceof ch5;
        if (z) {
            String str = hh5Var.a;
            gh5 gh5Var2 = gh5.o;
            Uri parse = Uri.parse(str);
            fo4 fo4Var = new fo4();
            fo4Var.a = "0";
            fo4Var.r = wf7.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new fh5(parse, new go4(fo4Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            gh5Var = new gh5("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list, null);
        } else {
            gh5Var = (gh5) hh5Var;
        }
        this.w = gh5Var;
        r58 r58Var = new r58(gh5Var);
        try {
            r58Var.d();
            this.E = (mo5) r58Var.f;
            this.F = r58Var.c(1);
            this.G = r58Var.c(2);
            this.H = r58Var.c(3);
            mj4 mj4Var = this.w.n;
            if (mj4Var != null) {
                k6d k6dVar = this.a;
                nl9 nl9Var = new nl9(this, (byte) 26);
                eb3 eb3Var = this.s;
                eb3Var.getClass();
                rg5 rg5Var = new rg5(k6dVar, this, nl9Var, eb3Var);
                this.y = rg5Var;
                Uri uri = (Uri) mj4Var.b;
                String str2 = (String) mj4Var.c;
                kq kqVar = this.f;
                if (str2 != null) {
                    jte.p(rg5Var.h.contains(str2));
                    rg5Var.l = str2;
                }
                rg5Var.k = true;
                rg5Var.c(-9223372036854775807L);
                dx8 dx8Var = rg5Var.a;
                k44 k44Var = new k44(rg5Var, (byte) 9);
                dx8Var.e = uri;
                dx8Var.f = k44Var;
                dx8Var.g = kqVar;
                dx8Var.i = new dfb(new Handler(hac.z(), null));
                dx8Var.j = new mx6("SteeringManifestTracker");
                dx8Var.a = true;
                dx8Var.b();
            }
            this.I = ((nh5) this.E.get(0)).b();
            this.e.add(new cc3(this));
            a(this.E, true);
            a(this.F, false);
            a(this.G, false);
            a(this.H, false);
            da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
            c0b c0bVar = dx7Var.d;
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
            ea6 ea6Var = new ea6(da6Var);
            ec3 ec3Var = (ec3) this.d.get(this.I);
            ec3Var.getClass();
            if (z) {
                Uri uri2 = dx7Var.d.c;
                HashMap hashMap = ec3Var.b;
                jte.p(hashMap.containsKey(uri2));
                dc3 dc3Var = (dc3) hashMap.get(uri2);
                dc3Var.getClass();
                dc3Var.d((ch5) hh5Var, ea6Var);
            } else {
                ec3Var.e(this.I, false);
            }
            this.c.getClass();
            this.f.p(ea6Var, 4);
        } catch (bx7 e) {
            this.x = e;
        }
    }

    public final void h(Uri uri, boolean z) {
        boolean z2;
        if (!uri.equals(this.I)) {
            HashMap hashMap = this.d;
            ec3 ec3Var = (ec3) hashMap.get(uri);
            boolean z3 = false;
            if (ec3Var != null) {
                z2 = ec3Var.c;
            } else {
                z2 = false;
            }
            if (z2) {
                ch5 ch5Var = this.J;
                if (ch5Var == null || !ch5Var.o) {
                    ec3 ec3Var2 = (ec3) hashMap.get(uri);
                    ec3Var2.getClass();
                    ch5 b = ec3Var2.b(uri);
                    if (b != null && b.o) {
                        z3 = true;
                    }
                    if (!z3 && z) {
                        ec3Var2.d(uri, d(uri));
                        this.K = uri;
                        return;
                    }
                    this.I = uri;
                    if (z3) {
                        this.J = b;
                        this.r.v(b);
                        return;
                    }
                    ec3Var2.d(uri, d(uri));
                }
            }
        }
    }

    public final void i(Uri uri) {
        ec3 ec3Var = (ec3) this.d.get(uri);
        if (ec3Var != null) {
            HashMap hashMap = ec3Var.b;
            jte.p(hashMap.containsKey(uri));
            dc3 dc3Var = (dc3) hashMap.get(uri);
            dc3Var.getClass();
            dc3Var.c.d();
            IOException iOException = dc3Var.w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        dx7 dx7Var = (dx7) ja6Var;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.c.getClass();
        this.f.o(ea6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
