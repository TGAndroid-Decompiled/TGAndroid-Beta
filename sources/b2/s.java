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
    public static final String f2357a0 = Integer.toString(5, 36);
    public static final String f2358b0 = Integer.toString(6, 36);
    public static final String f2359c0 = Integer.toString(7, 36);
    public static final String f2360d0;
    public static final String f2361e0;
    public static final String f2362f0;
    public static final String f2363g0;
    public static final String f2364h0;
    public static final String f2365i0;
    public static final String f2366j0;
    public static final String f2367k0;
    public static final String f2368l0;
    public static final String m0;
    public static final String f2369n0;
    public static final String f2370o0;
    public static final String f2371p0;
    public static final String f2372q0;
    public static final String f2373r0;
    public static final String f2374s0;
    public static final String f2375t0;
    public static final String f2376u0;
    public static final String f2377v0;
    public static final String f2378w0;
    public static final String f2379x0;
    public static final String f2380y0;
    public static final String f2381z0;
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
    public final String f2382a;
    public final String f2383b;
    public final e9.i0 f2384c;
    public final String d;
    public final int f2385e;
    public final int f2386f;
    public final int f2387g;
    public final int h;
    public final int f2388i;
    public final int f2389j;
    public final String f2390k;
    public final p0 f2391l;
    public boolean f2392m;
    public long f2393n;
    public int f2394o;
    public String f2395p;
    public final String f2396q;
    public final String f2397r;
    public final int f2398s;
    public final int f2399t;
    public final List f2400u;
    public final o v;
    public final long f2401w;
    public final boolean f2402x;
    public final int f2403y;
    public final int f2404z;

    static {
        e2.d0.J(8);
        f2360d0 = Integer.toString(9, 36);
        f2361e0 = Integer.toString(10, 36);
        f2362f0 = Integer.toString(11, 36);
        f2363g0 = Integer.toString(12, 36);
        f2364h0 = Integer.toString(13, 36);
        f2365i0 = Integer.toString(14, 36);
        f2366j0 = Integer.toString(15, 36);
        f2367k0 = Integer.toString(16, 36);
        f2368l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f2369n0 = Integer.toString(19, 36);
        f2370o0 = Integer.toString(20, 36);
        f2371p0 = Integer.toString(21, 36);
        f2372q0 = Integer.toString(22, 36);
        f2373r0 = Integer.toString(23, 36);
        f2374s0 = Integer.toString(24, 36);
        f2375t0 = Integer.toString(25, 36);
        f2376u0 = Integer.toString(26, 36);
        f2377v0 = Integer.toString(27, 36);
        f2378w0 = Integer.toString(28, 36);
        f2379x0 = Integer.toString(29, 36);
        f2380y0 = Integer.toString(30, 36);
        f2381z0 = Integer.toString(31, 36);
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
        this.f2382a = rVar.f2325a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f2327c.isEmpty() && rVar.f2326b != null) {
            this.f2384c = e9.i0.z(new w(R, rVar.f2326b));
            this.f2383b = rVar.f2326b;
        } else if (!rVar.f2327c.isEmpty() && rVar.f2326b == null) {
            e9.i0 i0Var = rVar.f2327c;
            this.f2384c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f2432a, R)) {
                        str = wVar.f2433b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f2433b;
                    break;
                }
            }
            this.f2383b = str;
        } else {
            if (!rVar.f2327c.isEmpty() || rVar.f2326b != null) {
                for (int i11 = 0; i11 < rVar.f2327c.size(); i11++) {
                    if (!((w) rVar.f2327c.get(i11)).f2433b.equals(rVar.f2326b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f2384c = rVar.f2327c;
                this.f2383b = rVar.f2326b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f2384c = rVar.f2327c;
            this.f2383b = rVar.f2326b;
        }
        this.f2385e = rVar.f2328e;
        if (rVar.f2330g != 0 && (rVar.f2329f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f2386f = rVar.f2329f;
        this.f2387g = rVar.f2330g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f2331i;
        this.f2388i = i13;
        this.f2389j = i13 != -1 ? i13 : i12;
        this.f2390k = rVar.f2332j;
        this.f2391l = rVar.f2333k;
        this.f2392m = rVar.f2334l;
        this.f2393n = rVar.f2335m;
        this.f2394o = rVar.f2337o;
        this.f2395p = rVar.f2336n;
        this.f2396q = rVar.f2338p;
        this.f2397r = rVar.f2339q;
        this.f2398s = rVar.f2340r;
        this.f2399t = rVar.f2341s;
        List list = rVar.f2342t;
        this.f2400u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f2343u;
        this.v = oVar;
        this.f2401w = rVar.v;
        this.f2402x = rVar.f2344w;
        this.f2403y = rVar.f2345x;
        this.f2404z = rVar.f2346y;
        this.A = rVar.f2347z;
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
        int i11 = sVar.f2385e;
        e9.i0 i0Var = sVar.f2384c;
        String str4 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.f2404z;
        int i18 = sVar.f2403y;
        o oVar2 = sVar.v;
        String str5 = sVar.f2390k;
        int i19 = sVar.f2389j;
        String str6 = sVar.f2396q;
        int i20 = sVar.f2386f;
        d9.f fVar = new d9.f(String.valueOf(','));
        StringBuilder u10 = a4.a.u("id=");
        u10.append(sVar.f2382a);
        u10.append(", mimeType=");
        u10.append(sVar.f2397r);
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
                UUID uuid = oVar2.f2249a[i21].f2201b;
                if (uuid.equals(i.f2088b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f2089c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.f2090e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f2087a)) {
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
            fVar.a(u10, linkedHashSet.iterator());
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
        int i22 = g9.c.f10522a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.d0.f8765a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f2110f;
            int i24 = jVar.f2109e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                u10.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f2106a);
                    String a2 = j.a(jVar.f2107b);
                    String c11 = j.c(jVar.f2108c);
                    String str8 = e2.d0.f8765a;
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
            fVar.a(u10, e9.q.w(i0Var, new androidx.emoji2.text.w(3)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str9 = e2.d0.f8765a;
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
            fVar.a(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i20 != 0) {
            u10.append(", roleFlags=[");
            String str10 = e2.d0.f8765a;
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
            fVar.a(u10, arrayList2.iterator());
            u10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i25 = sVar.f2387g;
            String str11 = e2.d0.f8765a;
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
        obj.f2325a = this.f2382a;
        obj.f2326b = this.f2383b;
        obj.f2327c = this.f2384c;
        obj.d = this.d;
        obj.f2328e = this.f2385e;
        obj.f2329f = this.f2386f;
        obj.h = this.h;
        obj.f2331i = this.f2388i;
        obj.f2332j = this.f2390k;
        obj.f2333k = this.f2391l;
        obj.f2338p = this.f2396q;
        obj.f2339q = this.f2397r;
        obj.f2340r = this.f2398s;
        obj.f2341s = this.f2399t;
        obj.f2342t = this.f2400u;
        obj.f2343u = this.v;
        obj.v = this.f2401w;
        obj.f2344w = this.f2402x;
        obj.f2345x = this.f2403y;
        obj.f2346y = this.f2404z;
        obj.f2347z = this.A;
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
        obj.f2334l = this.f2392m;
        obj.f2335m = this.f2393n;
        obj.f2337o = this.f2394o;
        obj.f2336n = this.f2395p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f2400u;
        if (list.size() != sVar.f2400u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f2400u.get(i10))) {
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
        int h = r0.h(this.f2397r);
        String str3 = sVar.f2382a;
        p0 p0Var = sVar.f2391l;
        e9.i0 i0Var = sVar.f2384c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f2383b;
        if (str4 == null) {
            str4 = this.f2383b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f2384c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f2388i;
        if (i15 == -1) {
            i15 = sVar.f2388i;
        }
        String str5 = this.f2390k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f2390k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f2391l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.f2385e | sVar.f2385e;
        int i17 = this.f2386f | sVar.f2386f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f2251c;
            n[] nVarArr = oVar2.f2249a;
            int length = nVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                n nVar = nVarArr[i19];
                int i20 = length;
                if (nVar.f2203e != null) {
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
                str2 = oVar3.f2251c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f2249a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.f2203e != null) {
                    UUID uuid = nVar2.f2201b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f2201b.equals(uuid)) {
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
        a2.f2325a = str3;
        a2.f2326b = str4;
        a2.f2327c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.f2328e = i16;
        a2.f2329f = i17;
        a2.h = i14;
        a2.f2331i = i15;
        a2.f2332j = str5;
        a2.f2333k = p0Var;
        a2.f2343u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.f2385e == sVar.f2385e && this.f2386f == sVar.f2386f && this.f2387g == sVar.f2387g && this.h == sVar.h && this.f2388i == sVar.f2388i && this.f2398s == sVar.f2398s && this.f2401w == sVar.f2401w && this.f2403y == sVar.f2403y && this.f2404z == sVar.f2404z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f2382a, sVar.f2382a) && Objects.equals(this.f2383b, sVar.f2383b) && this.f2384c.equals(sVar.f2384c) && Objects.equals(this.f2390k, sVar.f2390k) && Objects.equals(this.f2396q, sVar.f2396q) && Objects.equals(this.f2397r, sVar.f2397r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f2391l, sVar.f2391l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f2382a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f2383b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f2384c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.f2385e) * 31) + this.f2386f) * 31) + this.f2387g) * 31) + this.h) * 31) + this.f2388i) * 31;
            String str4 = this.f2390k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f2391l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f2396q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f2397r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f2398s) * 31) + ((int) this.f2401w)) * 31) + this.f2403y) * 31) + this.f2404z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f2382a);
        sb2.append(", ");
        sb2.append(this.f2383b);
        sb2.append(", ");
        sb2.append(this.f2396q);
        sb2.append(", ");
        sb2.append(this.f2397r);
        sb2.append(", ");
        sb2.append(this.f2390k);
        sb2.append(", ");
        sb2.append(this.f2389j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f2403y);
        sb2.append(", ");
        sb2.append(this.f2404z);
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
