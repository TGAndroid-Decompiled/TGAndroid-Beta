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
import v7.t6;
public final class x {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final x V = new x(new w());
    public static final String W = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);
    public static final String f2383a0 = Integer.toString(4, 36);
    public static final String f2384b0 = Integer.toString(5, 36);
    public static final String f2385c0 = Integer.toString(6, 36);
    public static final String f2386d0 = Integer.toString(7, 36);
    public static final String f2387e0;
    public static final String f2388f0;
    public static final String f2389g0;
    public static final String f2390h0;
    public static final String f2391i0;
    public static final String f2392j0;
    public static final String f2393k0;
    public static final String f2394l0;
    public static final String m0;
    public static final String f2395n0;
    public static final String f2396o0;
    public static final String f2397p0;
    public static final String f2398q0;
    public static final String f2399r0;
    public static final String f2400s0;
    public static final String f2401t0;
    public static final String f2402u0;
    public static final String f2403v0;
    public static final String f2404w0;
    public static final String f2405x0;
    public static final String f2406y0;
    public static final String f2407z0;
    public final int A;
    public final int B;
    public final int C;
    public final float D;
    public final int E;
    public final float F;
    public final byte[] G;
    public final int H;
    public final o I;
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
    public final int T;
    public int U;
    public final String f2408a;
    public final String f2409b;
    public final e9.n0 f2410c;
    public final String d;
    public final int e;
    public final int f2411f;
    public final int f2412g;
    public final int h;
    public final int f2413i;
    public final int f2414j;
    public final String f2415k;
    public final u0 f2416l;
    public final String f2417m;
    public boolean f2418n;
    public long f2419o;
    public int f2420p;
    public String f2421q;
    public final String f2422r;
    public final String f2423s;
    public final int f2424t;
    public final int f2425u;
    public final List v;
    public final t f2426w;
    public final long f2427x;
    public final boolean f2428y;
    public final int f2429z;

    static {
        Integer.toString(8, 36);
        f2387e0 = Integer.toString(9, 36);
        f2388f0 = Integer.toString(10, 36);
        f2389g0 = Integer.toString(11, 36);
        f2390h0 = Integer.toString(12, 36);
        f2391i0 = Integer.toString(13, 36);
        f2392j0 = Integer.toString(14, 36);
        f2393k0 = Integer.toString(15, 36);
        f2394l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f2395n0 = Integer.toString(18, 36);
        f2396o0 = Integer.toString(19, 36);
        f2397p0 = Integer.toString(20, 36);
        f2398q0 = Integer.toString(21, 36);
        f2399r0 = Integer.toString(22, 36);
        f2400s0 = Integer.toString(23, 36);
        f2401t0 = Integer.toString(24, 36);
        f2402u0 = Integer.toString(25, 36);
        f2403v0 = Integer.toString(26, 36);
        f2404w0 = Integer.toString(27, 36);
        f2405x0 = Integer.toString(28, 36);
        f2406y0 = Integer.toString(29, 36);
        f2407z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
    }

    public x(w wVar) {
        boolean z10;
        String str;
        boolean z11;
        this.f2408a = wVar.f2356a;
        String T = e2.l0.T(wVar.d);
        this.d = T;
        if (wVar.f2358c.isEmpty() && wVar.f2357b != null) {
            this.f2410c = e9.n0.y(new b0(T, wVar.f2357b));
            this.f2409b = wVar.f2357b;
        } else if (!wVar.f2358c.isEmpty() && wVar.f2357b == null) {
            e9.n0 n0Var = wVar.f2358c;
            this.f2410c = n0Var;
            int size = n0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = n0Var.get(i10);
                    i10++;
                    b0 b0Var = (b0) obj;
                    if (TextUtils.equals(b0Var.f1980a, T)) {
                        str = b0Var.f1981b;
                        break;
                    }
                } else {
                    str = ((b0) n0Var.get(0)).f1981b;
                    break;
                }
            }
            this.f2409b = str;
        } else {
            if (!wVar.f2358c.isEmpty() || wVar.f2357b != null) {
                for (int i11 = 0; i11 < wVar.f2358c.size(); i11++) {
                    if (!((b0) wVar.f2358c.get(i11)).f1981b.equals(wVar.f2357b)) {
                    }
                }
                z10 = false;
                t6.p(z10);
                this.f2410c = wVar.f2358c;
                this.f2409b = wVar.f2357b;
            }
            z10 = true;
            t6.p(z10);
            this.f2410c = wVar.f2358c;
            this.f2409b = wVar.f2357b;
        }
        this.e = wVar.e;
        if (wVar.f2360g != 0 && (wVar.f2359f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        t6.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f2411f = wVar.f2359f;
        this.f2412g = wVar.f2360g;
        int i12 = wVar.h;
        this.h = i12;
        int i13 = wVar.f2361i;
        this.f2413i = i13;
        this.f2414j = i13 != -1 ? i13 : i12;
        this.f2415k = wVar.f2362j;
        this.f2416l = wVar.f2363k;
        this.f2417m = wVar.f2364l;
        this.f2418n = wVar.f2365m;
        this.f2419o = wVar.f2366n;
        this.f2420p = wVar.f2368p;
        this.f2421q = wVar.f2367o;
        this.f2422r = wVar.f2369q;
        this.f2423s = wVar.f2370r;
        this.f2424t = wVar.f2371s;
        this.f2425u = wVar.f2372t;
        List list = wVar.f2373u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        t tVar = wVar.v;
        this.f2426w = tVar;
        this.f2427x = wVar.f2374w;
        this.f2428y = wVar.f2375x;
        this.f2429z = wVar.f2376y;
        this.A = wVar.f2377z;
        this.B = wVar.A;
        this.C = wVar.B;
        this.D = wVar.C;
        int i14 = wVar.D;
        this.E = i14 == -1 ? 0 : i14;
        float f7 = wVar.E;
        this.F = f7 == -1.0f ? 1.0f : f7;
        this.G = wVar.F;
        this.H = wVar.G;
        this.I = wVar.H;
        this.J = wVar.I;
        this.K = wVar.J;
        this.L = wVar.K;
        this.M = wVar.L;
        int i15 = wVar.M;
        this.N = i15 == -1 ? 0 : i15;
        int i16 = wVar.N;
        this.O = i16 != -1 ? i16 : 0;
        this.P = wVar.O;
        this.Q = wVar.P;
        this.R = wVar.Q;
        this.S = wVar.R;
        int i17 = wVar.S;
        if (i17 == 0 && tVar != null) {
            this.T = 1;
        } else {
            this.T = i17;
        }
    }

    public static String c(x xVar) {
        char c10;
        int i10;
        String str;
        String str2;
        String str3;
        if (xVar == null) {
            return "null";
        }
        int i11 = xVar.e;
        e9.n0 n0Var = xVar.f2410c;
        String str4 = xVar.d;
        int i12 = xVar.L;
        int i13 = xVar.K;
        int i14 = xVar.J;
        float f7 = xVar.D;
        o oVar = xVar.I;
        float f10 = xVar.F;
        int i15 = xVar.C;
        int i16 = xVar.B;
        int i17 = xVar.A;
        int i18 = xVar.f2429z;
        t tVar = xVar.f2426w;
        String str5 = xVar.f2415k;
        int i19 = xVar.f2414j;
        String str6 = xVar.f2417m;
        String str7 = xVar.f2422r;
        int i20 = xVar.f2411f;
        com.google.android.gms.internal.clearcut.e eVar = new com.google.android.gms.internal.clearcut.e(String.valueOf(','), 1);
        StringBuilder t10 = a1.g.t("id=");
        t10.append(xVar.f2408a);
        t10.append(", mimeType=");
        t10.append(xVar.f2423s);
        if (str7 != null) {
            t10.append(", container=");
            t10.append(str7);
        }
        if (str6 != null) {
            t10.append(", primaryGroupId=");
            t10.append(str6);
        }
        if (i19 != -1) {
            t10.append(", bitrate=");
            t10.append(i19);
        }
        if (str5 != null) {
            t10.append(", codecs=");
            t10.append(str5);
        }
        if (tVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i21 = 0; i21 < tVar.d; i21++) {
                UUID uuid = tVar.f2274a[i21].f2225b;
                if (uuid.equals(n.f2121c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(n.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(n.f2122f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(n.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(n.f2120b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            c10 = 0;
            t10.append(", drm=[");
            eVar.a(t10, linkedHashSet.iterator());
            t10.append(']');
        } else {
            c10 = 0;
        }
        if (i18 != -1 && i17 != -1) {
            t10.append(", res=");
            t10.append(i18);
            t10.append("x");
            t10.append(i17);
        }
        if (i16 != -1 && i15 != -1) {
            t10.append(", decRes=");
            t10.append(i16);
            t10.append("x");
            t10.append(i15);
        }
        double d = f10;
        int i22 = g9.c.f7466a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            t10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str8 = e2.l0.f6165a;
            t10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (oVar != null) {
            int i23 = oVar.f2159f;
            int i24 = oVar.e;
            if ((i24 != -1 && i23 != -1) || oVar.d()) {
                t10.append(", color=");
                if (oVar.d()) {
                    String b10 = o.b(oVar.f2156a);
                    String a2 = o.a(oVar.f2157b);
                    String c11 = o.c(oVar.f2158c);
                    String str9 = e2.l0.f6165a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i24 != -1 && i23 != -1) {
                    str3 = a1.g.i(i24, i23, "/");
                } else {
                    str3 = "NA/NA";
                }
                t10.append(str2 + "/" + str3);
            }
        }
        if (f7 != -1.0f) {
            t10.append(", fps=");
            t10.append(f7);
        }
        if (i14 != -1) {
            t10.append(", maxSubLayers=");
            t10.append(i14);
        }
        if (i13 != -1) {
            t10.append(", channels=");
            t10.append(i13);
        }
        if (i12 != -1) {
            t10.append(", sample_rate=");
            t10.append(i12);
        }
        if (str4 != null) {
            t10.append(", language=");
            t10.append(str4);
        }
        if (!n0Var.isEmpty()) {
            t10.append(", labels=[");
            eVar.a(t10, e9.s.x(n0Var, new aa.a(13)).iterator());
            t10.append("]");
        }
        if (i11 != 0) {
            t10.append(", selectionFlags=[");
            String str10 = e2.l0.f6165a;
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
            eVar.a(t10, arrayList.iterator());
            t10.append("]");
        }
        if (i20 != 0) {
            t10.append(", roleFlags=[");
            String str11 = e2.l0.f6165a;
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
            eVar.a(t10, arrayList2.iterator());
            t10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            t10.append(", auxiliaryTrackType=");
            int i25 = xVar.f2412g;
            String str12 = e2.l0.f6165a;
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
            t10.append(str);
        }
        return t10.toString();
    }

    public final w a() {
        ?? obj = new Object();
        obj.f2356a = this.f2408a;
        obj.f2357b = this.f2409b;
        obj.f2358c = this.f2410c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f2359f = this.f2411f;
        obj.h = this.h;
        obj.f2361i = this.f2413i;
        obj.f2362j = this.f2415k;
        obj.f2363k = this.f2416l;
        obj.f2364l = this.f2417m;
        obj.f2369q = this.f2422r;
        obj.f2370r = this.f2423s;
        obj.f2371s = this.f2424t;
        obj.f2372t = this.f2425u;
        obj.f2373u = this.v;
        obj.v = this.f2426w;
        obj.f2374w = this.f2427x;
        obj.f2375x = this.f2428y;
        obj.f2376y = this.f2429z;
        obj.f2377z = this.A;
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
        obj.S = this.T;
        obj.f2365m = this.f2418n;
        obj.f2366n = this.f2419o;
        obj.f2368p = this.f2420p;
        obj.f2367o = this.f2421q;
        return obj;
    }

    public final boolean b(x xVar) {
        List list = this.v;
        if (list.size() != xVar.v.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) xVar.v.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final x d(x xVar) {
        String str;
        String str2;
        t tVar;
        int i10;
        int i11;
        if (this == xVar) {
            return this;
        }
        int h = v0.h(this.f2423s);
        String str3 = xVar.f2408a;
        u0 u0Var = xVar.f2416l;
        e9.n0 n0Var = xVar.f2410c;
        int i12 = xVar.R;
        int i13 = xVar.S;
        String str4 = xVar.f2409b;
        if (str4 == null) {
            str4 = this.f2409b;
        }
        if (n0Var.isEmpty()) {
            n0Var = this.f2410c;
        }
        if ((h != 3 && h != 1) || (str = xVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = xVar.h;
        }
        int i15 = this.f2413i;
        if (i15 == -1) {
            i15 = xVar.f2413i;
        }
        String str5 = this.f2415k;
        if (str5 == null) {
            String w9 = e2.l0.w(h, xVar.f2415k);
            if (e2.l0.d0(w9).length == 1) {
                str5 = w9;
            }
        }
        String str6 = this.f2417m;
        if (str6 == null) {
            str6 = xVar.f2417m;
        }
        u0 u0Var2 = this.f2416l;
        if (u0Var2 != null) {
            u0Var = u0Var2.b(u0Var);
        }
        float f7 = this.D;
        if (f7 == -1.0f && h == 2) {
            f7 = xVar.D;
        }
        int i16 = this.e | xVar.e;
        e9.n0 n0Var2 = n0Var;
        int i17 = xVar.f2411f | this.f2411f;
        t tVar2 = xVar.f2426w;
        ArrayList arrayList = new ArrayList();
        if (tVar2 != null) {
            String str7 = tVar2.f2276c;
            s[] sVarArr = tVar2.f2274a;
            int length = sVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                s sVar = sVarArr[i19];
                int i20 = length;
                if (sVar.e != null) {
                    arrayList.add(sVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        t tVar3 = this.f2426w;
        if (tVar3 != null) {
            if (str2 == null) {
                str2 = tVar3.f2276c;
            }
            int size = arrayList.size();
            s[] sVarArr2 = tVar3.f2274a;
            String str8 = str2;
            int length2 = sVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                s sVar2 = sVarArr2[i22];
                int i23 = length2;
                if (sVar2.e != null) {
                    UUID uuid = sVar2.f2225b;
                    i11 = i12;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((s) arrayList.get(i24)).f2225b.equals(uuid)) {
                                break;
                            }
                            i24++;
                            size = i10;
                        } else {
                            i10 = size;
                            arrayList.add(sVar2);
                            break;
                        }
                    }
                } else {
                    i10 = size;
                    i11 = i12;
                }
                i21 = i22 + 1;
                length2 = i23;
                i12 = i11;
                size = i10;
            }
            str2 = str8;
        }
        int i25 = i12;
        if (arrayList.isEmpty()) {
            tVar = null;
        } else {
            tVar = new t(str2, arrayList);
        }
        w a2 = a();
        a2.f2356a = str3;
        a2.f2357b = str4;
        a2.f2358c = e9.n0.u(n0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f2359f = i17;
        a2.h = i14;
        a2.f2361i = i15;
        a2.f2362j = str5;
        a2.f2363k = u0Var;
        a2.f2364l = str6;
        a2.v = tVar;
        a2.C = f7;
        a2.Q = i25;
        a2.R = i13;
        return new x(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            int i11 = this.U;
            if ((i11 == 0 || (i10 = xVar.U) == 0 || i11 == i10) && this.e == xVar.e && this.f2411f == xVar.f2411f && this.f2412g == xVar.f2412g && this.h == xVar.h && this.f2413i == xVar.f2413i && this.f2424t == xVar.f2424t && this.f2427x == xVar.f2427x && this.f2429z == xVar.f2429z && this.A == xVar.A && this.B == xVar.B && this.C == xVar.C && this.E == xVar.E && this.H == xVar.H && this.J == xVar.J && this.K == xVar.K && this.L == xVar.L && this.M == xVar.M && this.N == xVar.N && this.O == xVar.O && this.P == xVar.P && this.R == xVar.R && this.S == xVar.S && this.T == xVar.T && Float.compare(this.D, xVar.D) == 0 && Float.compare(this.F, xVar.F) == 0 && Objects.equals(this.f2408a, xVar.f2408a) && Objects.equals(this.f2409b, xVar.f2409b) && this.f2410c.equals(xVar.f2410c) && Objects.equals(this.f2415k, xVar.f2415k) && Objects.equals(this.f2417m, xVar.f2417m) && Objects.equals(this.f2422r, xVar.f2422r) && Objects.equals(this.f2423s, xVar.f2423s) && Objects.equals(this.d, xVar.d) && Arrays.equals(this.G, xVar.G) && Objects.equals(this.f2416l, xVar.f2416l) && Objects.equals(this.I, xVar.I) && Objects.equals(this.f2426w, xVar.f2426w) && b(xVar)) {
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
        int hashCode7;
        if (this.U == 0) {
            int i10 = 0;
            String str = this.f2408a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f2409b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f2410c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode8 + hashCode3) * 31) + this.e) * 31) + this.f2411f) * 31) + this.f2412g) * 31) + this.h) * 31) + this.f2413i) * 31;
            String str4 = this.f2415k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            u0 u0Var = this.f2416l;
            if (u0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = u0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f2417m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f2422r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i16 = (i15 + hashCode7) * 31;
            String str7 = this.f2423s;
            if (str7 != null) {
                i10 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i16 + i10) * 31) + this.f2424t) * 31) + ((int) this.f2427x)) * 31) + this.f2429z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f2408a);
        sb2.append(", ");
        sb2.append(this.f2409b);
        sb2.append(", ");
        sb2.append(this.f2422r);
        sb2.append(", ");
        sb2.append(this.f2423s);
        sb2.append(", ");
        sb2.append(this.f2415k);
        sb2.append(", ");
        sb2.append(this.f2414j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f2429z);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.K);
        sb2.append(", ");
        return a1.g.p(sb2, this.L, "])");
    }
}
