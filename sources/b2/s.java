package b2;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
public final class s {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final s U = new s(new r());
    public static final String V = Integer.toString(0, 36);
    public static final String W = Integer.toString(1, 36);
    public static final String X = Integer.toString(2, 36);
    public static final String Y = Integer.toString(3, 36);
    public static final String Z = Integer.toString(4, 36);
    public static final String f1963a0 = Integer.toString(5, 36);
    public static final String f1964b0 = Integer.toString(6, 36);
    public static final String f1965c0 = Integer.toString(7, 36);
    public static final String f1966d0;
    public static final String f1967e0;
    public static final String f1968f0;
    public static final String f1969g0;
    public static final String f1970h0;
    public static final String f1971i0;
    public static final String f1972j0;
    public static final String f1973k0;
    public static final String f1974l0;
    public static final String m0;
    public static final String f1975n0;
    public static final String f1976o0;
    public static final String f1977p0;
    public static final String f1978q0;
    public static final String f1979r0;
    public static final String f1980s0;
    public static final String f1981t0;
    public static final String f1982u0;
    public static final String f1983v0;
    public static final String f1984w0;
    public static final String f1985x0;
    public static final String f1986y0;
    public static final String f1987z0;
    public final int A;
    public final int B;
    public final float C;
    public final int D;
    public final float E;
    public final byte[] F;
    public final int G;
    public final j H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public int T;
    public final String f1988a;
    public final String f1989b;
    public final e9.i0 f1990c;
    public final String d;
    public final int e;
    public final int f1991f;
    public final int f1992g;
    public final int h;
    public final int f1993i;
    public final int f1994j;
    public final String f1995k;
    public final p0 f1996l;
    public boolean f1997m;
    public long f1998n;
    public int f1999o;
    public String f2000p;
    public final String f2001q;
    public final String f2002r;
    public final int f2003s;
    public final int f2004t;
    public final List f2005u;
    public final o v;
    public final long f2006w;
    public final boolean f2007x;
    public final int f2008y;
    public final int f2009z;

    static {
        e2.d0.J(8);
        f1966d0 = Integer.toString(9, 36);
        f1967e0 = Integer.toString(10, 36);
        f1968f0 = Integer.toString(11, 36);
        f1969g0 = Integer.toString(12, 36);
        f1970h0 = Integer.toString(13, 36);
        f1971i0 = Integer.toString(14, 36);
        f1972j0 = Integer.toString(15, 36);
        f1973k0 = Integer.toString(16, 36);
        f1974l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f1975n0 = Integer.toString(19, 36);
        f1976o0 = Integer.toString(20, 36);
        f1977p0 = Integer.toString(21, 36);
        f1978q0 = Integer.toString(22, 36);
        f1979r0 = Integer.toString(23, 36);
        f1980s0 = Integer.toString(24, 36);
        f1981t0 = Integer.toString(25, 36);
        f1982u0 = Integer.toString(26, 36);
        f1983v0 = Integer.toString(27, 36);
        f1984w0 = Integer.toString(28, 36);
        f1985x0 = Integer.toString(29, 36);
        f1986y0 = Integer.toString(30, 36);
        f1987z0 = Integer.toString(31, 36);
        A0 = Integer.toString(32, 36);
        B0 = Integer.toString(33, 36);
        C0 = Integer.toString(34, 36);
        D0 = Integer.toString(35, 36);
        E0 = Integer.toString(36, 36);
    }

    public s(r rVar) {
        boolean z10;
        String str;
        boolean z11;
        this.f1988a = rVar.f1933a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f1935c.isEmpty() && rVar.f1934b != null) {
            this.f1990c = e9.i0.z(new w(R, rVar.f1934b));
            this.f1989b = rVar.f1934b;
        } else if (!rVar.f1935c.isEmpty() && rVar.f1934b == null) {
            e9.i0 i0Var = rVar.f1935c;
            this.f1990c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f2034a, R)) {
                        str = wVar.f2035b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f2035b;
                    break;
                }
            }
            this.f1989b = str;
        } else {
            if (!rVar.f1935c.isEmpty() || rVar.f1934b != null) {
                for (int i11 = 0; i11 < rVar.f1935c.size(); i11++) {
                    if (!((w) rVar.f1935c.get(i11)).f2035b.equals(rVar.f1934b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f1990c = rVar.f1935c;
                this.f1989b = rVar.f1934b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f1990c = rVar.f1935c;
            this.f1989b = rVar.f1934b;
        }
        this.e = rVar.e;
        if (rVar.f1937g != 0 && (rVar.f1936f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f1991f = rVar.f1936f;
        this.f1992g = rVar.f1937g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f1938i;
        this.f1993i = i13;
        this.f1994j = i13 != -1 ? i13 : i12;
        this.f1995k = rVar.f1939j;
        this.f1996l = rVar.f1940k;
        this.f1997m = rVar.f1941l;
        this.f1998n = rVar.f1942m;
        this.f1999o = rVar.f1944o;
        this.f2000p = rVar.f1943n;
        this.f2001q = rVar.f1945p;
        this.f2002r = rVar.f1946q;
        this.f2003s = rVar.f1947r;
        this.f2004t = rVar.f1948s;
        List list = rVar.f1949t;
        this.f2005u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f1950u;
        this.v = oVar;
        this.f2006w = rVar.v;
        this.f2007x = rVar.f1951w;
        this.f2008y = rVar.f1952x;
        this.f2009z = rVar.f1953y;
        this.A = rVar.f1954z;
        this.B = rVar.A;
        this.C = rVar.B;
        int i14 = rVar.C;
        this.D = i14 == -1 ? 0 : i14;
        float f7 = rVar.D;
        this.E = f7 == -1.0f ? 1.0f : f7;
        this.F = rVar.E;
        this.G = rVar.F;
        this.H = rVar.G;
        this.I = rVar.H;
        this.J = rVar.I;
        this.K = rVar.J;
        this.L = rVar.K;
        int i15 = rVar.L;
        this.M = i15 == -1 ? 0 : i15;
        int i16 = rVar.M;
        this.N = i16 != -1 ? i16 : 0;
        this.O = rVar.N;
        this.P = rVar.O;
        this.Q = rVar.P;
        this.R = rVar.Q;
        int i17 = rVar.R;
        if (i17 == 0 && oVar != null) {
            this.S = 1;
        } else {
            this.S = i17;
        }
    }

    public static String c(s sVar) {
        char c10;
        int i10;
        String str;
        String str2;
        String str3;
        o oVar;
        if (sVar == null) {
            return "null";
        }
        int i11 = sVar.e;
        e9.i0 i0Var = sVar.f1990c;
        String str4 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.f2009z;
        int i18 = sVar.f2008y;
        o oVar2 = sVar.v;
        String str5 = sVar.f1995k;
        int i19 = sVar.f1994j;
        String str6 = sVar.f2001q;
        int i20 = sVar.f1991f;
        a4.m mVar = new a4.m(String.valueOf(','));
        StringBuilder u10 = a4.a.u("id=");
        u10.append(sVar.f1988a);
        u10.append(", mimeType=");
        u10.append(sVar.f2002r);
        if (str6 != null) {
            u10.append(", container=");
            u10.append(str6);
        }
        if (i19 != -1) {
            u10.append(", bitrate=");
            u10.append(i19);
        }
        if (str5 != null) {
            u10.append(", codecs=");
            u10.append(str5);
        }
        if (oVar2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i21 = 0;
            c10 = 0;
            while (i21 < oVar2.d) {
                UUID uuid = oVar2.f1860a[i21].f1814b;
                if (uuid.equals(i.f1711b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f1712c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f1710a)) {
                    linkedHashSet.add("universal");
                } else {
                    oVar = oVar2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i21++;
                    oVar2 = oVar;
                }
                oVar = oVar2;
                i21++;
                oVar2 = oVar;
            }
            u10.append(", drm=[");
            mVar.O(u10, linkedHashSet.iterator());
            u10.append(']');
        } else {
            c10 = 0;
        }
        if (i18 != -1 && i17 != -1) {
            u10.append(", res=");
            u10.append(i18);
            u10.append("x");
            u10.append(i17);
        }
        if (i16 != -1 && i15 != -1) {
            u10.append(", decRes=");
            u10.append(i16);
            u10.append("x");
            u10.append(i15);
        }
        double d = f10;
        int i22 = g9.c.f8658a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.d0.f7188a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f1729f;
            int i24 = jVar.e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                u10.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f1726a);
                    String a2 = j.a(jVar.f1727b);
                    String c11 = j.c(jVar.f1728c);
                    String str8 = e2.d0.f7188a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i24 != -1 && i23 != -1) {
                    str3 = a4.a.k(i24, i23, "/");
                } else {
                    str3 = "NA/NA";
                }
                u10.append(str2 + "/" + str3);
            }
        }
        if (f7 != -1.0f) {
            u10.append(", fps=");
            u10.append(f7);
        }
        if (i14 != -1) {
            u10.append(", maxSubLayers=");
            u10.append(i14);
        }
        if (i13 != -1) {
            u10.append(", channels=");
            u10.append(i13);
        }
        if (i12 != -1) {
            u10.append(", sample_rate=");
            u10.append(i12);
        }
        if (str4 != null) {
            u10.append(", language=");
            u10.append(str4);
        }
        if (!i0Var.isEmpty()) {
            u10.append(", labels=[");
            mVar.O(u10, e9.q.w(i0Var, new androidx.emoji2.text.w(3)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str9 = e2.d0.f7188a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            mVar.O(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i20 != 0) {
            u10.append(", roleFlags=[");
            String str10 = e2.d0.f7188a;
            ArrayList arrayList2 = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i20 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i20 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i20 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i20 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i20 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i20 & 64) != 0) {
                arrayList2.add("caption");
            }
            i10 = i20;
            if ((i10 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i10 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i10 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i10 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i10 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i10 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i10 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i10 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i10 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            mVar.O(u10, arrayList2.iterator());
            u10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i25 = sVar.f1992g;
            String str11 = e2.d0.f7188a;
            if (i25 != 0) {
                if (i25 != 1) {
                    if (i25 != 2) {
                        if (i25 != 3) {
                            if (i25 == 4) {
                                str = "depth metadata";
                            } else {
                                throw new IllegalStateException("Unsupported auxiliary track type");
                            }
                        } else {
                            str = "depth-inverse";
                        }
                    } else {
                        str = "depth-linear";
                    }
                } else {
                    str = "original";
                }
            } else {
                str = "undefined";
            }
            u10.append(str);
        }
        return u10.toString();
    }

    public final r a() {
        ?? obj = new Object();
        obj.f1933a = this.f1988a;
        obj.f1934b = this.f1989b;
        obj.f1935c = this.f1990c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f1936f = this.f1991f;
        obj.h = this.h;
        obj.f1938i = this.f1993i;
        obj.f1939j = this.f1995k;
        obj.f1940k = this.f1996l;
        obj.f1945p = this.f2001q;
        obj.f1946q = this.f2002r;
        obj.f1947r = this.f2003s;
        obj.f1948s = this.f2004t;
        obj.f1949t = this.f2005u;
        obj.f1950u = this.v;
        obj.v = this.f2006w;
        obj.f1951w = this.f2007x;
        obj.f1952x = this.f2008y;
        obj.f1953y = this.f2009z;
        obj.f1954z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        obj.K = this.L;
        obj.L = this.M;
        obj.M = this.N;
        obj.N = this.O;
        obj.O = this.P;
        obj.P = this.Q;
        obj.Q = this.R;
        obj.R = this.S;
        obj.f1941l = this.f1997m;
        obj.f1942m = this.f1998n;
        obj.f1944o = this.f1999o;
        obj.f1943n = this.f2000p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f2005u;
        if (list.size() != sVar.f2005u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f2005u.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final s d(s sVar) {
        String str;
        String str2;
        o oVar;
        int i10;
        int i11;
        if (this == sVar) {
            return this;
        }
        int h = r0.h(this.f2002r);
        String str3 = sVar.f1988a;
        p0 p0Var = sVar.f1996l;
        e9.i0 i0Var = sVar.f1990c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f1989b;
        if (str4 == null) {
            str4 = this.f1989b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f1990c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f1993i;
        if (i15 == -1) {
            i15 = sVar.f1993i;
        }
        String str5 = this.f1995k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f1995k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f1996l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.e | sVar.e;
        int i17 = this.f1991f | sVar.f1991f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f1862c;
            n[] nVarArr = oVar2.f1860a;
            int length = nVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                n nVar = nVarArr[i19];
                int i20 = length;
                if (nVar.e != null) {
                    arrayList.add(nVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        o oVar3 = this.v;
        if (oVar3 != null) {
            if (str2 == null) {
                str2 = oVar3.f1862c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f1860a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.e != null) {
                    UUID uuid = nVar2.f1814b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f1814b.equals(uuid)) {
                                break;
                            }
                            i24++;
                            size = i10;
                        } else {
                            i10 = size;
                            arrayList.add(nVar2);
                            break;
                        }
                    }
                } else {
                    i10 = size;
                    i11 = i13;
                }
                i21 = i22 + 1;
                length2 = i23;
                i13 = i11;
                size = i10;
            }
            str2 = str7;
        }
        int i25 = i13;
        if (arrayList.isEmpty()) {
            oVar = null;
        } else {
            oVar = new o(str2, arrayList);
        }
        r a2 = a();
        a2.f1933a = str3;
        a2.f1934b = str4;
        a2.f1935c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f1936f = i17;
        a2.h = i14;
        a2.f1938i = i15;
        a2.f1939j = str5;
        a2.f1940k = p0Var;
        a2.f1950u = oVar;
        a2.B = f7;
        a2.P = i12;
        a2.Q = i25;
        return new s(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            int i11 = this.T;
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.e == sVar.e && this.f1991f == sVar.f1991f && this.f1992g == sVar.f1992g && this.h == sVar.h && this.f1993i == sVar.f1993i && this.f2003s == sVar.f2003s && this.f2006w == sVar.f2006w && this.f2008y == sVar.f2008y && this.f2009z == sVar.f2009z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f1988a, sVar.f1988a) && Objects.equals(this.f1989b, sVar.f1989b) && this.f1990c.equals(sVar.f1990c) && Objects.equals(this.f1995k, sVar.f1995k) && Objects.equals(this.f2001q, sVar.f2001q) && Objects.equals(this.f2002r, sVar.f2002r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f1996l, sVar.f1996l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.T == 0) {
            int i10 = 0;
            String str = this.f1988a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f1989b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f1990c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.e) * 31) + this.f1991f) * 31) + this.f1992g) * 31) + this.h) * 31) + this.f1993i) * 31;
            String str4 = this.f1995k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f1996l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f2001q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f2002r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f2003s) * 31) + ((int) this.f2006w)) * 31) + this.f2008y) * 31) + this.f2009z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f1988a);
        sb2.append(", ");
        sb2.append(this.f1989b);
        sb2.append(", ");
        sb2.append(this.f2001q);
        sb2.append(", ");
        sb2.append(this.f2002r);
        sb2.append(", ");
        sb2.append(this.f1995k);
        sb2.append(", ");
        sb2.append(this.f1994j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f2008y);
        sb2.append(", ");
        sb2.append(this.f2009z);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append("], [");
        sb2.append(this.J);
        sb2.append(", ");
        return a4.a.n(this.K, "])", sb2);
    }
}
