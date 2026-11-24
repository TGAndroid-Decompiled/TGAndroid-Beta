package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class qb3 implements qx6 {
    public final gl2 a;
    public final tg2 b;
    public eef c;

    public qb3(Context context, ka3 ka3Var) {
        tg2 tg2Var = new tg2(context);
        eef eefVar = new eef((byte) 17);
        this.b = tg2Var;
        this.c = eefVar;
        gl2 gl2Var = new gl2(ka3Var, eefVar);
        this.a = gl2Var;
        if (tg2Var != ((tg2) gl2Var.e)) {
            gl2Var.e = tg2Var;
            ((HashMap) gl2Var.c).clear();
            ((HashMap) gl2Var.d).clear();
        }
    }

    public static qx6 e(Class cls, tg2 tg2Var) {
        try {
            return (qx6) cls.getConstructor(m63.class).newInstance(tg2Var);
        } catch (Exception e) {
            ho9.n(e);
            return null;
        }
    }

    @Override
    public final qx6 a() {
        gl2 gl2Var = this.a;
        synchronized (((ka3) gl2Var.b)) {
        }
        for (qx6 qx6Var : ((HashMap) gl2Var.d).values()) {
            qx6Var.a();
        }
        return this;
    }

    @Override
    public final qx6 b() {
        synchronized (((ka3) this.a.b)) {
        }
        return this;
    }

    @Override
    public final qx6 c(eef eefVar) {
        this.c = eefVar;
        gl2 gl2Var = this.a;
        gl2Var.f = eefVar;
        ka3 ka3Var = (ka3) gl2Var.b;
        synchronized (ka3Var) {
            ka3Var.b = eefVar;
        }
        for (qx6 qx6Var : ((HashMap) gl2Var.d).values()) {
            qx6Var.c(eefVar);
        }
        return this;
    }

    @Override
    public final qg0 d(br6 br6Var) {
        xq6 xq6Var;
        boolean z;
        int i;
        Uri parse;
        boolean z2;
        xq6 xq6Var2;
        uq6 uq6Var;
        xq6 xq6Var3;
        long j;
        Uri uri;
        String str;
        oq6 oq6Var;
        String str2;
        boolean z3;
        xq6 xq6Var4;
        uq6 uq6Var2;
        tq6 tq6Var;
        br6 br6Var2 = br6Var;
        br6Var2.b.getClass();
        String scheme = br6Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(br6Var2.b.b, "application/x-image-uri");
        xq6 xq6Var5 = br6Var2.b;
        if (!equals) {
            int M = g8c.M(xq6Var5.a, xq6Var5.b);
            if (br6Var2.b.h != -9223372036854775807L) {
                ka3 ka3Var = (ka3) this.a.b;
                synchronized (ka3Var) {
                    ka3Var.c = true;
                }
                this.a.N();
            }
            try {
                gl2 gl2Var = this.a;
                HashMap hashMap = (HashMap) gl2Var.d;
                qx6 qx6Var = (qx6) hashMap.get(Integer.valueOf(M));
                if (qx6Var == null) {
                    qx6Var = (qx6) gl2Var.y(M).get();
                    qx6Var.c((eef) gl2Var.f);
                    qx6Var.a();
                    qx6Var.b();
                    hashMap.put(Integer.valueOf(M), qx6Var);
                }
                vq6 a = br6Var2.c.a();
                wq6 wq6Var = br6Var2.c;
                if (wq6Var.a == -9223372036854775807L) {
                    a.a = -9223372036854775807L;
                }
                if (wq6Var.d == -3.4028235E38f) {
                    a.d = -3.4028235E38f;
                }
                if (wq6Var.e == -3.4028235E38f) {
                    a.e = -3.4028235E38f;
                }
                if (wq6Var.b == -9223372036854775807L) {
                    a.b = -9223372036854775807L;
                }
                if (wq6Var.c == -9223372036854775807L) {
                    a.c = -9223372036854775807L;
                }
                wq6 wq6Var2 = new wq6(a);
                if (!wq6Var2.equals(br6Var2.c)) {
                    tq6 tq6Var2 = new tq6();
                    List list = Collections.EMPTY_LIST;
                    km5 km5Var = mm5.b;
                    mm5 mm5Var = w59.e;
                    yq6 yq6Var = yq6.d;
                    qq6 a2 = br6Var2.e.a();
                    String str3 = br6Var2.a;
                    jr6 jr6Var = br6Var2.d;
                    br6Var2.c.a();
                    yq6 yq6Var2 = br6Var2.f;
                    xq6 xq6Var6 = br6Var2.b;
                    if (xq6Var6 != null) {
                        String str4 = xq6Var6.f;
                        String str5 = xq6Var6.b;
                        Uri uri2 = xq6Var6.a;
                        list = xq6Var6.e;
                        mm5Var = xq6Var6.g;
                        xq6Var3 = null;
                        uq6 uq6Var3 = xq6Var6.c;
                        if (uq6Var3 != null) {
                            i = 0;
                            ?? obj = new Object();
                            z = true;
                            obj.a = uq6Var3.a;
                            obj.b = uq6Var3.b;
                            obj.c = uq6Var3.c;
                            obj.d = uq6Var3.d;
                            obj.e = uq6Var3.e;
                            obj.f = uq6Var3.f;
                            obj.g = uq6Var3.g;
                            obj.h = uq6Var3.h;
                            tq6Var = obj;
                        } else {
                            z = true;
                            i = 0;
                            tq6Var = new tq6();
                        }
                        oq6 oq6Var2 = xq6Var6.d;
                        j = xq6Var6.h;
                        tq6Var2 = tq6Var;
                        oq6Var = oq6Var2;
                        str = str5;
                        uri = uri2;
                        str2 = str4;
                    } else {
                        xq6Var3 = null;
                        z = true;
                        i = 0;
                        j = -9223372036854775807L;
                        uri = null;
                        str = null;
                        oq6Var = null;
                        str2 = null;
                    }
                    List list2 = list;
                    mm5 mm5Var2 = mm5Var;
                    vq6 a3 = wq6Var2.a();
                    if (tq6Var2.b != null && tq6Var2.a == null) {
                        z3 = i;
                    } else {
                        z3 = z;
                    }
                    gre.p(z3);
                    if (uri != null) {
                        if (tq6Var2.a != null) {
                            uq6Var2 = new uq6(tq6Var2);
                        } else {
                            uq6Var2 = xq6Var3;
                        }
                        xq6Var4 = new xq6(uri, str, uq6Var2, oq6Var, list2, str2, mm5Var2, j);
                    } else {
                        xq6Var4 = xq6Var3;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str6 = str3;
                    ?? rq6Var = new rq6(a2);
                    wq6 wq6Var3 = new wq6(a3);
                    if (jr6Var == null) {
                        jr6Var = jr6.M;
                    }
                    br6Var2 = new br6(str6, rq6Var, xq6Var4, wq6Var3, jr6Var, yq6Var2);
                    xq6Var = xq6Var3;
                } else {
                    xq6Var = null;
                    z = true;
                    i = 0;
                }
                qg0 d = qx6Var.d(br6Var2);
                mm5 mm5Var3 = br6Var2.b.g;
                if (!mm5Var3.isEmpty()) {
                    qg0[] qg0VarArr = new qg0[mm5Var3.size() + 1];
                    qg0VarArr[i] = d;
                    for (int i2 = i; i2 < mm5Var3.size(); i2++) {
                        em4 em4Var = new em4();
                        em4Var.s = ud7.n(((ar6) mm5Var3.get(i2)).b);
                        em4Var.d = ((ar6) mm5Var3.get(i2)).c;
                        em4Var.e = ((ar6) mm5Var3.get(i2)).d;
                        em4Var.f = ((ar6) mm5Var3.get(i2)).e;
                        em4Var.b = ((ar6) mm5Var3.get(i2)).f;
                        em4Var.a = ((ar6) mm5Var3.get(i2)).g;
                        fm4 fm4Var = new fm4(em4Var);
                        v82 v82Var = new v82(this, fm4Var, (byte) 18);
                        tg2 tg2Var = this.b;
                        k88 k88Var = new k88(v82Var, (byte) 14);
                        mv6 mv6Var = new mv6();
                        i2f i2fVar = new i2f((byte) 17);
                        if (this.c.h(fm4Var)) {
                            em4 a4 = fm4Var.a();
                            a4.s = ud7.n("application/x-media3-cues");
                            a4.k = fm4Var.t;
                            a4.T = this.c.y(fm4Var);
                            fm4Var = new fm4(a4);
                        }
                        fm4 fm4Var2 = fm4Var;
                        int i3 = i2 + 1;
                        String uri3 = ((ar6) mm5Var3.get(i2)).a.toString();
                        qq6 qq6Var = new qq6();
                        tq6 tq6Var3 = new tq6();
                        List list3 = Collections.EMPTY_LIST;
                        km5 km5Var2 = mm5.b;
                        w59 w59Var = w59.e;
                        vq6 vq6Var = new vq6();
                        yq6 yq6Var3 = yq6.d;
                        if (uri3 == null) {
                            parse = xq6Var;
                        } else {
                            parse = Uri.parse(uri3);
                        }
                        if (tq6Var3.b != null && tq6Var3.a == null) {
                            z2 = i;
                        } else {
                            z2 = z;
                        }
                        gre.p(z2);
                        if (parse != null) {
                            if (tq6Var3.a != null) {
                                uq6Var = new uq6(tq6Var3);
                            } else {
                                uq6Var = xq6Var;
                            }
                            xq6Var2 = new xq6(parse, null, uq6Var, null, list3, null, w59Var, -9223372036854775807L);
                        } else {
                            xq6Var2 = xq6Var;
                        }
                        br6 br6Var3 = new br6("", new rq6(qq6Var), xq6Var2, new wq6(vq6Var), jr6.M, yq6Var3);
                        br6Var3.b.getClass();
                        qg0VarArr[i3] = new vs8(br6Var3, tg2Var, k88Var, mv6Var.F(br6Var3), i2fVar, 1048576, fm4Var2);
                    }
                    d = new b17(qg0VarArr);
                }
                sq6 sq6Var = br6Var2.e;
                if (sq6Var.b != 0 || sq6Var.d != Long.MIN_VALUE || sq6Var.f) {
                    qx qxVar = new qx(d);
                    sq6 sq6Var2 = br6Var2.e;
                    gre.p(!qxVar.b);
                    qxVar.d = sq6Var2.a();
                    gre.p(!qxVar.b);
                    qxVar.b = z;
                    d = new si2(qxVar);
                }
                br6Var2.b.getClass();
                if (br6Var2.b.d == null) {
                    return d;
                }
                lad.f("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return d;
            } catch (ClassNotFoundException e) {
                ho9.n(e);
                return null;
            }
        }
        long j2 = xq6Var5.h;
        String str7 = g8c.a;
        throw null;
    }
}
