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
    public static final String f2330a0 = Integer.toString(5, 36);
    public static final String f2331b0 = Integer.toString(6, 36);
    public static final String f2332c0 = Integer.toString(7, 36);
    public static final String f2333d0;
    public static final String f2334e0;
    public static final String f2335f0;
    public static final String f2336g0;
    public static final String f2337h0;
    public static final String f2338i0;
    public static final String f2339j0;
    public static final String f2340k0;
    public static final String f2341l0;
    public static final String m0;
    public static final String f2342n0;
    public static final String f2343o0;
    public static final String f2344p0;
    public static final String f2345q0;
    public static final String f2346r0;
    public static final String f2347s0;
    public static final String f2348t0;
    public static final String f2349u0;
    public static final String f2350v0;
    public static final String f2351w0;
    public static final String f2352x0;
    public static final String f2353y0;
    public static final String f2354z0;
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
    public final String f2355a;
    public final String f2356b;
    public final e9.i0 f2357c;
    public final String d;
    public final int f2358e;
    public final int f2359f;
    public final int f2360g;
    public final int h;
    public final int f2361i;
    public final int f2362j;
    public final String f2363k;
    public final p0 f2364l;
    public boolean f2365m;
    public long f2366n;
    public int f2367o;
    public String f2368p;
    public final String f2369q;
    public final String f2370r;
    public final int f2371s;
    public final int f2372t;
    public final List f2373u;
    public final o v;
    public final long f2374w;
    public final boolean f2375x;
    public final int f2376y;
    public final int f2377z;

    static {
        e2.d0.J(8);
        f2333d0 = Integer.toString(9, 36);
        f2334e0 = Integer.toString(10, 36);
        f2335f0 = Integer.toString(11, 36);
        f2336g0 = Integer.toString(12, 36);
        f2337h0 = Integer.toString(13, 36);
        f2338i0 = Integer.toString(14, 36);
        f2339j0 = Integer.toString(15, 36);
        f2340k0 = Integer.toString(16, 36);
        f2341l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f2342n0 = Integer.toString(19, 36);
        f2343o0 = Integer.toString(20, 36);
        f2344p0 = Integer.toString(21, 36);
        f2345q0 = Integer.toString(22, 36);
        f2346r0 = Integer.toString(23, 36);
        f2347s0 = Integer.toString(24, 36);
        f2348t0 = Integer.toString(25, 36);
        f2349u0 = Integer.toString(26, 36);
        f2350v0 = Integer.toString(27, 36);
        f2351w0 = Integer.toString(28, 36);
        f2352x0 = Integer.toString(29, 36);
        f2353y0 = Integer.toString(30, 36);
        f2354z0 = Integer.toString(31, 36);
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
        this.f2355a = rVar.f2298a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f2300c.isEmpty() && rVar.f2299b != null) {
            this.f2357c = e9.i0.z(new w(R, rVar.f2299b));
            this.f2356b = rVar.f2299b;
        } else if (!rVar.f2300c.isEmpty() && rVar.f2299b == null) {
            e9.i0 i0Var = rVar.f2300c;
            this.f2357c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f2405a, R)) {
                        str = wVar.f2406b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f2406b;
                    break;
                }
            }
            this.f2356b = str;
        } else {
            if (!rVar.f2300c.isEmpty() || rVar.f2299b != null) {
                for (int i11 = 0; i11 < rVar.f2300c.size(); i11++) {
                    if (!((w) rVar.f2300c.get(i11)).f2406b.equals(rVar.f2299b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f2357c = rVar.f2300c;
                this.f2356b = rVar.f2299b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f2357c = rVar.f2300c;
            this.f2356b = rVar.f2299b;
        }
        this.f2358e = rVar.f2301e;
        if (rVar.f2303g != 0 && (rVar.f2302f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f2359f = rVar.f2302f;
        this.f2360g = rVar.f2303g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f2304i;
        this.f2361i = i13;
        this.f2362j = i13 != -1 ? i13 : i12;
        this.f2363k = rVar.f2305j;
        this.f2364l = rVar.f2306k;
        this.f2365m = rVar.f2307l;
        this.f2366n = rVar.f2308m;
        this.f2367o = rVar.f2310o;
        this.f2368p = rVar.f2309n;
        this.f2369q = rVar.f2311p;
        this.f2370r = rVar.f2312q;
        this.f2371s = rVar.f2313r;
        this.f2372t = rVar.f2314s;
        List list = rVar.f2315t;
        this.f2373u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f2316u;
        this.v = oVar;
        this.f2374w = rVar.v;
        this.f2375x = rVar.f2317w;
        this.f2376y = rVar.f2318x;
        this.f2377z = rVar.f2319y;
        this.A = rVar.f2320z;
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
        int i11 = sVar.f2358e;
        e9.i0 i0Var = sVar.f2357c;
        String str4 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.f2377z;
        int i18 = sVar.f2376y;
        o oVar2 = sVar.v;
        String str5 = sVar.f2363k;
        int i19 = sVar.f2362j;
        String str6 = sVar.f2369q;
        int i20 = sVar.f2359f;
        d9.f fVar = new d9.f(String.valueOf(','));
        StringBuilder u10 = a4.a.u("id=");
        u10.append(sVar.f2355a);
        u10.append(", mimeType=");
        u10.append(sVar.f2370r);
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
                UUID uuid = oVar2.f2222a[i21].f2174b;
                if (uuid.equals(i.f2061b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f2062c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.f2063e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f2060a)) {
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
        int i22 = g9.c.f10494a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.d0.f8737a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f2083f;
            int i24 = jVar.f2082e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                u10.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f2079a);
                    String a2 = j.a(jVar.f2080b);
                    String c11 = j.c(jVar.f2081c);
                    String str8 = e2.d0.f8737a;
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
            String str9 = e2.d0.f8737a;
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
            String str10 = e2.d0.f8737a;
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
            int i25 = sVar.f2360g;
            String str11 = e2.d0.f8737a;
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
        obj.f2298a = this.f2355a;
        obj.f2299b = this.f2356b;
        obj.f2300c = this.f2357c;
        obj.d = this.d;
        obj.f2301e = this.f2358e;
        obj.f2302f = this.f2359f;
        obj.h = this.h;
        obj.f2304i = this.f2361i;
        obj.f2305j = this.f2363k;
        obj.f2306k = this.f2364l;
        obj.f2311p = this.f2369q;
        obj.f2312q = this.f2370r;
        obj.f2313r = this.f2371s;
        obj.f2314s = this.f2372t;
        obj.f2315t = this.f2373u;
        obj.f2316u = this.v;
        obj.v = this.f2374w;
        obj.f2317w = this.f2375x;
        obj.f2318x = this.f2376y;
        obj.f2319y = this.f2377z;
        obj.f2320z = this.A;
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
        obj.f2307l = this.f2365m;
        obj.f2308m = this.f2366n;
        obj.f2310o = this.f2367o;
        obj.f2309n = this.f2368p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f2373u;
        if (list.size() != sVar.f2373u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f2373u.get(i10))) {
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
        int h = r0.h(this.f2370r);
        String str3 = sVar.f2355a;
        p0 p0Var = sVar.f2364l;
        e9.i0 i0Var = sVar.f2357c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f2356b;
        if (str4 == null) {
            str4 = this.f2356b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f2357c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f2361i;
        if (i15 == -1) {
            i15 = sVar.f2361i;
        }
        String str5 = this.f2363k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f2363k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f2364l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.f2358e | sVar.f2358e;
        int i17 = this.f2359f | sVar.f2359f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f2224c;
            n[] nVarArr = oVar2.f2222a;
            int length = nVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                n nVar = nVarArr[i19];
                int i20 = length;
                if (nVar.f2176e != null) {
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
                str2 = oVar3.f2224c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f2222a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.f2176e != null) {
                    UUID uuid = nVar2.f2174b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f2174b.equals(uuid)) {
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
        a2.f2298a = str3;
        a2.f2299b = str4;
        a2.f2300c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.f2301e = i16;
        a2.f2302f = i17;
        a2.h = i14;
        a2.f2304i = i15;
        a2.f2305j = str5;
        a2.f2306k = p0Var;
        a2.f2316u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.f2358e == sVar.f2358e && this.f2359f == sVar.f2359f && this.f2360g == sVar.f2360g && this.h == sVar.h && this.f2361i == sVar.f2361i && this.f2371s == sVar.f2371s && this.f2374w == sVar.f2374w && this.f2376y == sVar.f2376y && this.f2377z == sVar.f2377z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f2355a, sVar.f2355a) && Objects.equals(this.f2356b, sVar.f2356b) && this.f2357c.equals(sVar.f2357c) && Objects.equals(this.f2363k, sVar.f2363k) && Objects.equals(this.f2369q, sVar.f2369q) && Objects.equals(this.f2370r, sVar.f2370r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f2364l, sVar.f2364l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f2355a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f2356b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f2357c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.f2358e) * 31) + this.f2359f) * 31) + this.f2360g) * 31) + this.h) * 31) + this.f2361i) * 31;
            String str4 = this.f2363k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f2364l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f2369q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f2370r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f2371s) * 31) + ((int) this.f2374w)) * 31) + this.f2376y) * 31) + this.f2377z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f2355a);
        sb2.append(", ");
        sb2.append(this.f2356b);
        sb2.append(", ");
        sb2.append(this.f2369q);
        sb2.append(", ");
        sb2.append(this.f2370r);
        sb2.append(", ");
        sb2.append(this.f2363k);
        sb2.append(", ");
        sb2.append(this.f2362j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f2376y);
        sb2.append(", ");
        sb2.append(this.f2377z);
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
