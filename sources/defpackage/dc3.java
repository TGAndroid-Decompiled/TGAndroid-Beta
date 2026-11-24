package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class dc3 implements ga6 {
    public final Uri a;
    public final HashSet b;
    public final mx6 c;
    public final a83 d;
    public ch5 e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException w;
    public boolean x;
    public final fc3 y;

    public dc3(fc3 fc3Var, Uri uri, String str) {
        this.y = fc3Var;
        this.a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new mx6("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.d = ((y73) fc3Var.a.b).createDataSource();
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
        this.y.f.u(new ea6(da6Var), dx7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Uri a() {
        String str;
        ch5 ch5Var = this.e;
        Uri uri = this.a;
        if (ch5Var != null) {
            bh5 bh5Var = ch5Var.v;
            if (bh5Var.a != -9223372036854775807L || bh5Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                ch5 ch5Var2 = this.e;
                if (ch5Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ch5Var2.k + ch5Var2.r.size()));
                    ch5 ch5Var3 = this.e;
                    if (ch5Var3.n != -9223372036854775807L) {
                        mo5 mo5Var = ch5Var3.s;
                        int size = mo5Var.size();
                        if (!mo5Var.isEmpty() && ((xg5) lne.b(mo5Var)).y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                bh5 bh5Var2 = this.e.v;
                if (bh5Var2.a != -9223372036854775807L) {
                    if (bh5Var2.b) {
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
        fc3 fc3Var = this.y;
        cx7 a = fc3Var.b.a(fc3Var.w, this.e);
        Map map = Collections.EMPTY_MAP;
        jte.l(uri, "The uri must be set.");
        xvc xvcVar = new xvc(this.d, new g83(uri, 1, null, map, 0L, -1L, null, 1), a);
        rg5 rg5Var = fc3Var.y;
        String str = null;
        if (rg5Var != null && rg5Var.k) {
            ec3 ec3Var = (ec3) fc3Var.d.get(this.a);
            HashSet hashSet = this.b;
            if (ec3Var != null) {
                String str2 = ec3Var.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                }
            }
            str = (String) lne.a(hashSet, null);
        }
        xvcVar.e = str;
        dx7 dx7Var = new dx7(xvcVar);
        this.c.v0(dx7Var, this, fc3Var.c.v3(dx7Var.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (!this.s) {
            mx6 mx6Var = this.c;
            if (!mx6Var.Y() && !mx6Var.U()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.n;
                if (elapsedRealtime < j) {
                    this.s = true;
                    this.y.n.postDelayed(new mv2(this, uri, (byte) 29), j - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(defpackage.ch5 r74, defpackage.ea6 r75) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc3.d(ch5, ea6):void");
    }

    @Override
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        int i2;
        ha6 ha6Var;
        dx7 dx7Var = (dx7) ja6Var;
        ha6 ha6Var2 = mx6.y;
        long j3 = dx7Var.a;
        byte b = dx7Var.c;
        da6 da6Var = new da6(j3, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        if (c0bVar.c.getQueryParameter("_HLS_msn") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = iOException instanceof ih5;
        Uri uri = this.a;
        fc3 fc3Var = this.y;
        if (z || z2) {
            if (iOException instanceof ki5) {
                i2 = ((ki5) iOException).c;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (z2 || i2 == 400 || i2 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri);
                kq kqVar = fc3Var.f;
                String str = hac.a;
                kqVar.s(ea6Var, b, iOException, true);
                return ha6Var2;
            }
        }
        de deVar = new de(iOException, i, (byte) 8);
        Iterator it = fc3Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((lh5) it.next()).b(uri, deVar, false);
        }
        k4f k4fVar = fc3Var.c;
        if (z3) {
            k4fVar.getClass();
            long w3 = k4f.w3(deVar);
            if (w3 != -9223372036854775807L) {
                ha6Var = new ha6(0, w3);
            } else {
                ha6Var = mx6.E;
            }
            ha6Var2 = ha6Var;
        }
        boolean a = ha6Var2.a();
        fc3Var.f.s(ea6Var, b, iOException, !a);
        if (!a) {
            k4fVar.getClass();
        }
        return ha6Var2;
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        dx7 dx7Var = (dx7) ja6Var;
        hh5 hh5Var = (hh5) dx7Var.f;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        if (hh5Var instanceof ch5) {
            d((ch5) hh5Var, ea6Var);
            this.y.f.p(ea6Var, 4);
        } else {
            bx7 b = bx7.b("Loaded playlist has unexpected type.", null);
            this.w = b;
            this.y.f.s(ea6Var, 4, b, true);
        }
        this.y.c.getClass();
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
        fc3 fc3Var = this.y;
        fc3Var.c.getClass();
        fc3Var.f.o(ea6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
