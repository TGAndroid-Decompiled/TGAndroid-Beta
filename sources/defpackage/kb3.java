package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class kb3 implements la6 {
    public final Uri a;
    public final HashSet b;
    public final rx6 c;
    public final h73 d;
    public fh5 e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException w;
    public boolean x;
    public final mb3 y;

    public kb3(mb3 mb3Var, Uri uri, String str) {
        this.y = mb3Var;
        this.a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new rx6("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.d = ((f73) mb3Var.a.b).createDataSource();
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
        this.y.f.v(new ja6(ia6Var), jy7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Uri a() {
        String str;
        fh5 fh5Var = this.e;
        Uri uri = this.a;
        if (fh5Var != null) {
            eh5 eh5Var = fh5Var.v;
            if (eh5Var.a != -9223372036854775807L || eh5Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                fh5 fh5Var2 = this.e;
                if (fh5Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fh5Var2.k + fh5Var2.r.size()));
                    fh5 fh5Var3 = this.e;
                    if (fh5Var3.n != -9223372036854775807L) {
                        po5 po5Var = fh5Var3.s;
                        int size = po5Var.size();
                        if (!po5Var.isEmpty() && ((ah5) dqe.b(po5Var)).y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                eh5 eh5Var2 = this.e.v;
                if (eh5Var2.a != -9223372036854775807L) {
                    if (eh5Var2.b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        mb3 mb3Var = this.y;
        iy7 a = mb3Var.b.a(mb3Var.w, this.e);
        Map map = Collections.EMPTY_MAP;
        yve.l(uri, "The uri must be set.");
        lyc lycVar = new lyc(this.d, new n73(uri, 1, null, map, 0L, -1L, null, 1), a);
        ug5 ug5Var = mb3Var.y;
        String str = null;
        if (ug5Var != null && ug5Var.k) {
            lb3 lb3Var = (lb3) mb3Var.d.get(this.a);
            HashSet hashSet = this.b;
            if (lb3Var != null) {
                String str2 = lb3Var.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                }
            }
            str = (String) dqe.a(hashSet, null);
        }
        lycVar.e = str;
        jy7 jy7Var = new jy7(lycVar);
        this.c.w0(jy7Var, this, mb3Var.c.v3(jy7Var.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (!this.s) {
            rx6 rx6Var = this.c;
            if (!rx6Var.Z() && !rx6Var.U()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.n;
                if (elapsedRealtime < j) {
                    this.s = true;
                    this.y.n.postDelayed(new bv2(this, uri, (byte) 27), j - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    @Override
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        int i2;
        ma6 ma6Var;
        jy7 jy7Var = (jy7) oa6Var;
        ma6 ma6Var2 = rx6.y;
        long j3 = jy7Var.a;
        byte b = jy7Var.c;
        ia6 ia6Var = new ia6(j3, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        if (b2bVar.c.getQueryParameter("_HLS_msn") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = iOException instanceof lh5;
        Uri uri = this.a;
        mb3 mb3Var = this.y;
        if (z || z2) {
            if (iOException instanceof ni5) {
                i2 = ((ni5) iOException).c;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (z2 || i2 == 400 || i2 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri);
                lp lpVar = mb3Var.f;
                String str = gcc.a;
                lpVar.s(ja6Var, b, iOException, true);
                return ma6Var2;
            }
        }
        ed edVar = new ed(iOException, i, (byte) 8);
        Iterator it = mb3Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((oh5) it.next()).b(uri, edVar, false);
        }
        z6f z6fVar = mb3Var.c;
        if (z3) {
            z6fVar.getClass();
            long w3 = z6f.w3(edVar);
            if (w3 != -9223372036854775807L) {
                ma6Var = new ma6(0, w3);
            } else {
                ma6Var = rx6.E;
            }
            ma6Var2 = ma6Var;
        }
        boolean a = ma6Var2.a();
        mb3Var.f.s(ja6Var, b, iOException, !a);
        if (!a) {
            z6fVar.getClass();
        }
        return ma6Var2;
    }

    public final void d(defpackage.fh5 r74, defpackage.ja6 r75) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb3.d(fh5, ja6):void");
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
        mb3 mb3Var = this.y;
        mb3Var.c.getClass();
        mb3Var.f.o(ja6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void f0(oa6 oa6Var, long j, long j2) {
        jy7 jy7Var = (jy7) oa6Var;
        kh5 kh5Var = (kh5) jy7Var.f;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        if (kh5Var instanceof fh5) {
            d((fh5) kh5Var, ja6Var);
            this.y.f.p(ja6Var, 4);
        } else {
            hy7 b = hy7.b("Loaded playlist has unexpected type.", null);
            this.w = b;
            this.y.f.s(ja6Var, 4, b, true);
        }
        this.y.c.getClass();
    }
}
