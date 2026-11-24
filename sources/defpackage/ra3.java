package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class ra3 implements h86 {
    public final Uri a;
    public final HashSet b;
    public final mv6 c;
    public final o63 d;
    public df5 e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException w;
    public boolean x;
    public final ta3 y;

    public ra3(ta3 ta3Var, Uri uri, String str) {
        this.y = ta3Var;
        this.a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new mv6("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.d = ((m63) ta3Var.a.b).createDataSource();
    }

    @Override
    public final void C0(k86 k86Var, long j, long j2, int i) {
        cv7 cv7Var = (cv7) k86Var;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        if (i != 0) {
            zxa zxaVar = cv7Var.d;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.y.f.u(new f86(e86Var), cv7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override
    public final void U(k86 k86Var, long j, long j2) {
        cv7 cv7Var = (cv7) k86Var;
        if5 if5Var = (if5) cv7Var.f;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        if (if5Var instanceof df5) {
            d((df5) if5Var, f86Var);
            this.y.f.p(f86Var, 4);
        } else {
            av7 b = av7.b("Loaded playlist has unexpected type.", null);
            this.w = b;
            this.y.f.s(f86Var, 4, b, true);
        }
        this.y.c.getClass();
    }

    public final Uri a() {
        String str;
        df5 df5Var = this.e;
        Uri uri = this.a;
        if (df5Var != null) {
            cf5 cf5Var = df5Var.v;
            if (cf5Var.a != -9223372036854775807L || cf5Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                df5 df5Var2 = this.e;
                if (df5Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(df5Var2.k + df5Var2.r.size()));
                    df5 df5Var3 = this.e;
                    if (df5Var3.n != -9223372036854775807L) {
                        mm5 mm5Var = df5Var3.s;
                        int size = mm5Var.size();
                        if (!mm5Var.isEmpty() && ((ye5) jle.b(mm5Var)).y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                cf5 cf5Var2 = this.e.v;
                if (cf5Var2.a != -9223372036854775807L) {
                    if (cf5Var2.b) {
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
        ta3 ta3Var = this.y;
        bv7 d = ta3Var.b.d(ta3Var.w, this.e);
        Map map = Collections.EMPTY_MAP;
        gre.l(uri, "The uri must be set.");
        c5a c5aVar = new c5a(this.d, new u63(uri, 1, null, map, 0L, -1L, null, 1), d);
        se5 se5Var = ta3Var.y;
        String str = null;
        if (se5Var != null && se5Var.k) {
            sa3 sa3Var = (sa3) ta3Var.d.get(this.a);
            HashSet hashSet = this.b;
            if (sa3Var != null) {
                String str2 = sa3Var.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                }
            }
            str = (String) jle.a(hashSet, null);
        }
        c5aVar.b = str;
        cv7 cv7Var = new cv7(c5aVar);
        this.c.r0(cv7Var, this, ta3Var.c.v3(cv7Var.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (!this.s) {
            mv6 mv6Var = this.c;
            if (!mv6Var.W() && !mv6Var.S()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.n;
                if (elapsedRealtime < j) {
                    this.s = true;
                    this.y.n.postDelayed(new gu2(this, uri, (byte) 28), j - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(defpackage.df5 r74, defpackage.f86 r75) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra3.d(df5, f86):void");
    }

    @Override
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        cv7 cv7Var = (cv7) k86Var;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        ta3 ta3Var = this.y;
        ta3Var.c.getClass();
        ta3Var.f.o(f86Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        int i2;
        i86 i86Var;
        cv7 cv7Var = (cv7) k86Var;
        i86 i86Var2 = mv6.y;
        long j3 = cv7Var.a;
        byte b = cv7Var.c;
        e86 e86Var = new e86(j3, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        if (zxaVar.c.getQueryParameter("_HLS_msn") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = iOException instanceof jf5;
        Uri uri = this.a;
        ta3 ta3Var = this.y;
        if (z || z2) {
            if (iOException instanceof lg5) {
                i2 = ((lg5) iOException).c;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (z2 || i2 == 400 || i2 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri);
                kp kpVar = ta3Var.f;
                String str = g8c.a;
                kpVar.s(f86Var, b, iOException, true);
                return i86Var2;
            }
        }
        dd ddVar = new dd(iOException, i, (byte) 8);
        Iterator it = ta3Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((mf5) it.next()).b(uri, ddVar, false);
        }
        i2f i2fVar = ta3Var.c;
        if (z3) {
            i2fVar.getClass();
            long w3 = i2f.w3(ddVar);
            if (w3 != -9223372036854775807L) {
                i86Var = new i86(0, w3);
            } else {
                i86Var = mv6.E;
            }
            i86Var2 = i86Var;
        }
        boolean a = i86Var2.a();
        ta3Var.f.s(f86Var, b, iOException, !a);
        if (!a) {
            i2fVar.getClass();
        }
        return i86Var2;
    }
}
