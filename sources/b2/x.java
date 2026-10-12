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
import v7.u6;
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
    public static final String f2479a0 = Integer.toString(4, 36);
    public static final String f2480b0 = Integer.toString(5, 36);
    public static final String f2481c0 = Integer.toString(6, 36);
    public static final String f2482d0 = Integer.toString(7, 36);
    public static final String f2483e0;
    public static final String f2484f0;
    public static final String f2485g0;
    public static final String f2486h0;
    public static final String f2487i0;
    public static final String f2488j0;
    public static final String f2489k0;
    public static final String f2490l0;
    public static final String m0;
    public static final String f2491n0;
    public static final String f2492o0;
    public static final String f2493p0;
    public static final String f2494q0;
    public static final String f2495r0;
    public static final String f2496s0;
    public static final String f2497t0;
    public static final String f2498u0;
    public static final String f2499v0;
    public static final String f2500w0;
    public static final String f2501x0;
    public static final String f2502y0;
    public static final String f2503z0;
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
    public final String f2504a;
    public final String f2505b;
    public final e9.n0 f2506c;
    public final String d;
    public final int e;
    public final int f2507f;
    public final int f2508g;
    public final int h;
    public final int f2509i;
    public final int f2510j;
    public final String f2511k;
    public final u0 f2512l;
    public final String f2513m;
    public boolean f2514n;
    public long f2515o;
    public int f2516p;
    public String f2517q;
    public final String f2518r;
    public final String f2519s;
    public final int f2520t;
    public final int f2521u;
    public final List v;
    public final t f2522w;
    public final long f2523x;
    public final boolean f2524y;
    public final int f2525z;

    static {
        Integer.toString(8, 36);
        f2483e0 = Integer.toString(9, 36);
        f2484f0 = Integer.toString(10, 36);
        f2485g0 = Integer.toString(11, 36);
        f2486h0 = Integer.toString(12, 36);
        f2487i0 = Integer.toString(13, 36);
        f2488j0 = Integer.toString(14, 36);
        f2489k0 = Integer.toString(15, 36);
        f2490l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f2491n0 = Integer.toString(18, 36);
        f2492o0 = Integer.toString(19, 36);
        f2493p0 = Integer.toString(20, 36);
        f2494q0 = Integer.toString(21, 36);
        f2495r0 = Integer.toString(22, 36);
        f2496s0 = Integer.toString(23, 36);
        f2497t0 = Integer.toString(24, 36);
        f2498u0 = Integer.toString(25, 36);
        f2499v0 = Integer.toString(26, 36);
        f2500w0 = Integer.toString(27, 36);
        f2501x0 = Integer.toString(28, 36);
        f2502y0 = Integer.toString(29, 36);
        f2503z0 = Integer.toString(30, 36);
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
        this.f2504a = wVar.f2452a;
        String T = e2.m0.T(wVar.d);
        this.d = T;
        if (wVar.f2454c.isEmpty() && wVar.f2453b != null) {
            this.f2506c = e9.n0.y(new b0(T, wVar.f2453b));
            this.f2505b = wVar.f2453b;
        } else if (!wVar.f2454c.isEmpty() && wVar.f2453b == null) {
            e9.n0 n0Var = wVar.f2454c;
            this.f2506c = n0Var;
            int size = n0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = n0Var.get(i10);
                    i10++;
                    b0 b0Var = (b0) obj;
                    if (TextUtils.equals(b0Var.f2077a, T)) {
                        str = b0Var.f2078b;
                        break;
                    }
                } else {
                    str = ((b0) n0Var.get(0)).f2078b;
                    break;
                }
            }
            this.f2505b = str;
        } else {
            if (!wVar.f2454c.isEmpty() || wVar.f2453b != null) {
                for (int i11 = 0; i11 < wVar.f2454c.size(); i11++) {
                    if (!((b0) wVar.f2454c.get(i11)).f2078b.equals(wVar.f2453b)) {
                    }
                }
                z10 = false;
                u6.p(z10);
                this.f2506c = wVar.f2454c;
                this.f2505b = wVar.f2453b;
            }
            z10 = true;
            u6.p(z10);
            this.f2506c = wVar.f2454c;
            this.f2505b = wVar.f2453b;
        }
        this.e = wVar.e;
        if (wVar.f2456g != 0 && (wVar.f2455f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u6.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f2507f = wVar.f2455f;
        this.f2508g = wVar.f2456g;
        int i12 = wVar.h;
        this.h = i12;
        int i13 = wVar.f2457i;
        this.f2509i = i13;
        this.f2510j = i13 != -1 ? i13 : i12;
        this.f2511k = wVar.f2458j;
        this.f2512l = wVar.f2459k;
        this.f2513m = wVar.f2460l;
        this.f2514n = wVar.f2461m;
        this.f2515o = wVar.f2462n;
        this.f2516p = wVar.f2464p;
        this.f2517q = wVar.f2463o;
        this.f2518r = wVar.f2465q;
        this.f2519s = wVar.f2466r;
        this.f2520t = wVar.f2467s;
        this.f2521u = wVar.f2468t;
        List list = wVar.f2469u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        t tVar = wVar.v;
        this.f2522w = tVar;
        this.f2523x = wVar.f2470w;
        this.f2524y = wVar.f2471x;
        this.f2525z = wVar.f2472y;
        this.A = wVar.f2473z;
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
        e9.n0 n0Var = xVar.f2506c;
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
        int i18 = xVar.f2525z;
        t tVar = xVar.f2522w;
        String str5 = xVar.f2511k;
        int i19 = xVar.f2510j;
        String str6 = xVar.f2513m;
        String str7 = xVar.f2518r;
        int i20 = xVar.f2507f;
        d9.l lVar = new d9.l(String.valueOf(','));
        StringBuilder u10 = a1.g.u("id=");
        u10.append(xVar.f2504a);
        u10.append(", mimeType=");
        u10.append(xVar.f2519s);
        if (str7 != null) {
            u10.append(", container=");
            u10.append(str7);
        }
        if (str6 != null) {
            u10.append(", primaryGroupId=");
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
        if (tVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i21 = 0; i21 < tVar.d; i21++) {
                UUID uuid = tVar.f2370a[i21].f2321b;
                if (uuid.equals(n.f2218c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(n.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(n.f2219f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(n.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(n.f2217b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            c10 = 0;
            u10.append(", drm=[");
            lVar.a(u10, linkedHashSet.iterator());
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
        int i22 = g9.c.f10034a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str8 = e2.m0.f8372a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (oVar != null) {
            int i23 = oVar.f2236f;
            int i24 = oVar.e;
            if ((i24 != -1 && i23 != -1) || oVar.d()) {
                u10.append(", color=");
                if (oVar.d()) {
                    String b10 = o.b(oVar.f2233a);
                    String a2 = o.a(oVar.f2234b);
                    String c11 = o.c(oVar.f2235c);
                    String str9 = e2.m0.f8372a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i24 != -1 && i23 != -1) {
                    str3 = a1.g.k(i24, i23, "/");
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
        if (!n0Var.isEmpty()) {
            u10.append(", labels=[");
            lVar.a(u10, e9.s.x(n0Var, new aa.a(17)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str10 = e2.m0.f8372a;
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
            lVar.a(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i20 != 0) {
            u10.append(", roleFlags=[");
            String str11 = e2.m0.f8372a;
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
            lVar.a(u10, arrayList2.iterator());
            u10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i25 = xVar.f2508g;
            String str12 = e2.m0.f8372a;
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

    public final w a() {
        ?? obj = new Object();
        obj.f2452a = this.f2504a;
        obj.f2453b = this.f2505b;
        obj.f2454c = this.f2506c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f2455f = this.f2507f;
        obj.h = this.h;
        obj.f2457i = this.f2509i;
        obj.f2458j = this.f2511k;
        obj.f2459k = this.f2512l;
        obj.f2460l = this.f2513m;
        obj.f2465q = this.f2518r;
        obj.f2466r = this.f2519s;
        obj.f2467s = this.f2520t;
        obj.f2468t = this.f2521u;
        obj.f2469u = this.v;
        obj.v = this.f2522w;
        obj.f2470w = this.f2523x;
        obj.f2471x = this.f2524y;
        obj.f2472y = this.f2525z;
        obj.f2473z = this.A;
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
        obj.f2461m = this.f2514n;
        obj.f2462n = this.f2515o;
        obj.f2464p = this.f2516p;
        obj.f2463o = this.f2517q;
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
        int h = w0.h(this.f2519s);
        String str3 = xVar.f2504a;
        u0 u0Var = xVar.f2512l;
        e9.n0 n0Var = xVar.f2506c;
        int i12 = xVar.R;
        int i13 = xVar.S;
        String str4 = xVar.f2505b;
        if (str4 == null) {
            str4 = this.f2505b;
        }
        if (n0Var.isEmpty()) {
            n0Var = this.f2506c;
        }
        if ((h != 3 && h != 1) || (str = xVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = xVar.h;
        }
        int i15 = this.f2509i;
        if (i15 == -1) {
            i15 = xVar.f2509i;
        }
        String str5 = this.f2511k;
        if (str5 == null) {
            String w9 = e2.m0.w(h, xVar.f2511k);
            if (e2.m0.d0(w9).length == 1) {
                str5 = w9;
            }
        }
        String str6 = this.f2513m;
        if (str6 == null) {
            str6 = xVar.f2513m;
        }
        u0 u0Var2 = this.f2512l;
        if (u0Var2 != null) {
            u0Var = u0Var2.b(u0Var);
        }
        float f7 = this.D;
        if (f7 == -1.0f && h == 2) {
            f7 = xVar.D;
        }
        int i16 = this.e | xVar.e;
        e9.n0 n0Var2 = n0Var;
        int i17 = xVar.f2507f | this.f2507f;
        t tVar2 = xVar.f2522w;
        ArrayList arrayList = new ArrayList();
        if (tVar2 != null) {
            String str7 = tVar2.f2372c;
            s[] sVarArr = tVar2.f2370a;
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
        t tVar3 = this.f2522w;
        if (tVar3 != null) {
            if (str2 == null) {
                str2 = tVar3.f2372c;
            }
            int size = arrayList.size();
            s[] sVarArr2 = tVar3.f2370a;
            String str8 = str2;
            int length2 = sVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                s sVar2 = sVarArr2[i22];
                int i23 = length2;
                if (sVar2.e != null) {
                    UUID uuid = sVar2.f2321b;
                    i11 = i12;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((s) arrayList.get(i24)).f2321b.equals(uuid)) {
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
        a2.f2452a = str3;
        a2.f2453b = str4;
        a2.f2454c = e9.n0.u(n0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f2455f = i17;
        a2.h = i14;
        a2.f2457i = i15;
        a2.f2458j = str5;
        a2.f2459k = u0Var;
        a2.f2460l = str6;
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
            if ((i11 == 0 || (i10 = xVar.U) == 0 || i11 == i10) && this.e == xVar.e && this.f2507f == xVar.f2507f && this.f2508g == xVar.f2508g && this.h == xVar.h && this.f2509i == xVar.f2509i && this.f2520t == xVar.f2520t && this.f2523x == xVar.f2523x && this.f2525z == xVar.f2525z && this.A == xVar.A && this.B == xVar.B && this.C == xVar.C && this.E == xVar.E && this.H == xVar.H && this.J == xVar.J && this.K == xVar.K && this.L == xVar.L && this.M == xVar.M && this.N == xVar.N && this.O == xVar.O && this.P == xVar.P && this.R == xVar.R && this.S == xVar.S && this.T == xVar.T && Float.compare(this.D, xVar.D) == 0 && Float.compare(this.F, xVar.F) == 0 && Objects.equals(this.f2504a, xVar.f2504a) && Objects.equals(this.f2505b, xVar.f2505b) && this.f2506c.equals(xVar.f2506c) && Objects.equals(this.f2511k, xVar.f2511k) && Objects.equals(this.f2513m, xVar.f2513m) && Objects.equals(this.f2518r, xVar.f2518r) && Objects.equals(this.f2519s, xVar.f2519s) && Objects.equals(this.d, xVar.d) && Arrays.equals(this.G, xVar.G) && Objects.equals(this.f2512l, xVar.f2512l) && Objects.equals(this.I, xVar.I) && Objects.equals(this.f2522w, xVar.f2522w) && b(xVar)) {
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
            String str = this.f2504a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f2505b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f2506c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode8 + hashCode3) * 31) + this.e) * 31) + this.f2507f) * 31) + this.f2508g) * 31) + this.h) * 31) + this.f2509i) * 31;
            String str4 = this.f2511k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            u0 u0Var = this.f2512l;
            if (u0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = u0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f2513m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f2518r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i16 = (i15 + hashCode7) * 31;
            String str7 = this.f2519s;
            if (str7 != null) {
                i10 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i16 + i10) * 31) + this.f2520t) * 31) + ((int) this.f2523x)) * 31) + this.f2525z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f2504a);
        sb2.append(", ");
        sb2.append(this.f2505b);
        sb2.append(", ");
        sb2.append(this.f2518r);
        sb2.append(", ");
        sb2.append(this.f2519s);
        sb2.append(", ");
        sb2.append(this.f2511k);
        sb2.append(", ");
        sb2.append(this.f2510j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f2525z);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.K);
        sb2.append(", ");
        return a1.g.n(this.L, "])", sb2);
    }
}
