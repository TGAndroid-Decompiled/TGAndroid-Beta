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
public final class mb3 implements la6 {
    public static final da3 N = new da3((byte) 12);
    public po5 E;
    public po5 F;
    public po5 G;
    public po5 H;
    public Uri I;
    public fh5 J;
    public Uri K;
    public boolean L;
    public final z8d a;
    public final nh5 b;
    public final z6f c;
    public lp f;
    public rx6 h;
    public Handler n;
    public gh5 r;
    public la3 s;
    public jh5 w;
    public hy7 x;
    public ug5 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long M = -9223372036854775807L;

    public mb3(z8d z8dVar, z6f z6fVar, nh5 nh5Var) {
        this.a = z8dVar;
        this.b = nh5Var;
        this.c = z6fVar;
    }

    @Override
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        jy7 jy7Var = (jy7) oa6Var;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        if (i != 0) {
            b2b b2bVar = jy7Var.d;
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
        }
        this.f.v(new ja6(ia6Var), jy7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final void a(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            qh5 qh5Var = (qh5) list.get(i);
            lb3 lb3Var = new lb3(this, qh5Var, z);
            v9c n = bp5.q(qh5Var.b.values()).n();
            while (n.hasNext()) {
                this.d.put((Uri) n.next(), lb3Var);
            }
        }
    }

    public final fh5 b(Uri uri, boolean z) {
        HashMap hashMap = this.d;
        lb3 lb3Var = (lb3) hashMap.get(uri);
        if (lb3Var == null) {
            return null;
        }
        fh5 b = lb3Var.b(uri);
        if (b != null && z) {
            i(uri, false);
            lb3 lb3Var2 = (lb3) hashMap.get(uri);
            lb3Var2.getClass();
            HashMap hashMap2 = lb3Var2.b;
            yve.p(hashMap2.containsKey(uri));
            kb3 kb3Var = (kb3) hashMap2.get(uri);
            kb3Var.getClass();
            if (!kb3Var.x) {
                yve.p(hashMap2.containsKey(uri));
                kb3 kb3Var2 = (kb3) hashMap2.get(uri);
                kb3Var2.getClass();
                kb3Var2.x = true;
                fh5 b2 = lb3Var2.b(uri);
                if (b2 != null && !b2.o) {
                    lb3Var2.e(uri, true);
                }
            }
        }
        return b;
    }

    public final po5 c(int i) {
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

    @Override
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        long min;
        jy7 jy7Var = (jy7) oa6Var;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        byte b = jy7Var.c;
        this.c.getClass();
        Throwable th = iOException;
        while (true) {
            z = true;
            if (th != null) {
                if ((th instanceof hy7) || (th instanceof FileNotFoundException) || (th instanceof ki5) || (th instanceof qa6) || ((th instanceof k73) && ((k73) th).a == 2008)) {
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
        this.f.s(ja6Var, b, iOException, z);
        if (z) {
            return rx6.E;
        }
        return new ma6(0, min);
    }

    public final Uri d(Uri uri) {
        bh5 bh5Var;
        fh5 fh5Var = this.J;
        if (fh5Var != null && fh5Var.v.e && (bh5Var = (bh5) fh5Var.t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bh5Var.b));
            int i = bh5Var.c;
            if (i != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(long j, Uri uri) {
        lb3 lb3Var = (lb3) this.d.get(uri);
        if (lb3Var != null) {
            return lb3Var.c(j, uri);
        }
        return false;
    }

    @Override
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        jy7 jy7Var = (jy7) oa6Var;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.c.getClass();
        this.f.o(ja6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void f0(oa6 oa6Var, long j, long j2) {
        jh5 jh5Var;
        jy7 jy7Var = (jy7) oa6Var;
        kh5 kh5Var = (kh5) jy7Var.f;
        boolean z = kh5Var instanceof fh5;
        if (z) {
            String str = kh5Var.a;
            jh5 jh5Var2 = jh5.o;
            Uri parse = Uri.parse(str);
            jo4 jo4Var = new jo4();
            jo4Var.a = "0";
            jo4Var.r = dg7.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new ih5(parse, new ko4(jo4Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            jh5Var = new jh5("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list, null);
        } else {
            jh5Var = (jh5) kh5Var;
        }
        this.w = jh5Var;
        f78 f78Var = new f78(jh5Var);
        try {
            f78Var.d();
            this.E = (po5) f78Var.f;
            this.F = f78Var.c(1);
            this.G = f78Var.c(2);
            this.H = f78Var.c(3);
            ym4 ym4Var = this.w.n;
            if (ym4Var != null) {
                z8d z8dVar = this.a;
                zm9 zm9Var = new zm9(this, (byte) 26);
                la3 la3Var = this.s;
                la3Var.getClass();
                ug5 ug5Var = new ug5(z8dVar, this, zm9Var, la3Var);
                this.y = ug5Var;
                Uri uri = (Uri) ym4Var.b;
                String str2 = (String) ym4Var.c;
                lp lpVar = this.f;
                if (str2 != null) {
                    yve.p(ug5Var.h.contains(str2));
                    ug5Var.l = str2;
                }
                ug5Var.k = true;
                ug5Var.c(-9223372036854775807L);
                ny8 ny8Var = ug5Var.a;
                v34 v34Var = new v34(ug5Var, (byte) 8);
                ny8Var.e = uri;
                ny8Var.f = v34Var;
                ny8Var.g = lpVar;
                ny8Var.i = new xgb(new Handler(gcc.z(), null));
                ny8Var.j = new rx6("SteeringManifestTracker");
                ny8Var.a = true;
                ny8Var.b();
            }
            this.I = ((qh5) this.E.get(0)).b();
            this.e.add(new jb3(this));
            a(this.E, true);
            a(this.F, false);
            a(this.G, false);
            a(this.H, false);
            ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
            b2b b2bVar = jy7Var.d;
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
            ja6 ja6Var = new ja6(ia6Var);
            lb3 lb3Var = (lb3) this.d.get(this.I);
            lb3Var.getClass();
            if (z) {
                Uri uri2 = jy7Var.d.c;
                HashMap hashMap = lb3Var.b;
                yve.p(hashMap.containsKey(uri2));
                kb3 kb3Var = (kb3) hashMap.get(uri2);
                kb3Var.getClass();
                kb3Var.d((fh5) kh5Var, ja6Var);
            } else {
                lb3Var.e(this.I, false);
            }
            this.c.getClass();
            this.f.p(ja6Var, 4);
        } catch (hy7 e) {
            this.x = e;
        }
    }

    public final boolean g(qh5 qh5Var, long j) {
        boolean z;
        lb3 lb3Var = (lb3) this.d.get(qh5Var.b());
        if (lb3Var == null) {
            return false;
        }
        Iterator it = lb3Var.b.values().iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            if (j <= ((kb3) it.next()).r) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return z2;
    }

    public final boolean h(Uri uri) {
        byte b;
        lb3 lb3Var = (lb3) this.d.get(uri);
        if (lb3Var != null) {
            HashMap hashMap = lb3Var.b;
            yve.p(hashMap.containsKey(uri));
            kb3 kb3Var = (kb3) hashMap.get(uri);
            kb3Var.getClass();
            if (kb3Var.e != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(30000L, gcc.i0(kb3Var.e.u));
                fh5 fh5Var = kb3Var.e;
                if (fh5Var.o || (b = fh5Var.d) == 2 || b == 1 || kb3Var.f + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void i(Uri uri, boolean z) {
        boolean z2;
        if (!uri.equals(this.I)) {
            HashMap hashMap = this.d;
            lb3 lb3Var = (lb3) hashMap.get(uri);
            boolean z3 = false;
            if (lb3Var != null) {
                z2 = lb3Var.c;
            } else {
                z2 = false;
            }
            if (z2) {
                fh5 fh5Var = this.J;
                if (fh5Var == null || !fh5Var.o) {
                    lb3 lb3Var2 = (lb3) hashMap.get(uri);
                    lb3Var2.getClass();
                    fh5 b = lb3Var2.b(uri);
                    if (b != null && b.o) {
                        z3 = true;
                    }
                    if (!z3 && z) {
                        lb3Var2.d(uri, d(uri));
                        this.K = uri;
                        return;
                    }
                    this.I = uri;
                    if (z3) {
                        this.J = b;
                        this.r.v(b);
                        return;
                    }
                    lb3Var2.d(uri, d(uri));
                }
            }
        }
    }

    public final void j(Uri uri) {
        lb3 lb3Var = (lb3) this.d.get(uri);
        if (lb3Var != null) {
            HashMap hashMap = lb3Var.b;
            yve.p(hashMap.containsKey(uri));
            kb3 kb3Var = (kb3) hashMap.get(uri);
            kb3Var.getClass();
            kb3Var.c.g();
            IOException iOException = kb3Var.w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }
}
