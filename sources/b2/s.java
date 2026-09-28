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
    public static final String f3262a0 = Integer.toString(5, 36);
    public static final String f3263b0 = Integer.toString(6, 36);
    public static final String f3264c0 = Integer.toString(7, 36);
    public static final String f3265d0;
    public static final String f3266e0;
    public static final String f3267f0;
    public static final String f3268g0;
    public static final String f3269h0;
    public static final String f3270i0;
    public static final String f3271j0;
    public static final String f3272k0;
    public static final String f3273l0;
    public static final String m0;
    public static final String f3274n0;
    public static final String f3275o0;
    public static final String f3276p0;
    public static final String f3277q0;
    public static final String f3278r0;
    public static final String f3279s0;
    public static final String f3280t0;
    public static final String f3281u0;
    public static final String f3282v0;
    public static final String f3283w0;
    public static final String f3284x0;
    public static final String f3285y0;
    public static final String f3286z0;
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
    public final String f3287a;
    public final String f3288b;
    public final e9.i0 f3289c;
    public final String d;
    public final int e;
    public final int f3290f;
    public final int f3291g;
    public final int h;
    public final int f3292i;
    public final int f3293j;
    public final String f3294k;
    public final p0 f3295l;
    public boolean f3296m;
    public long f3297n;
    public int f3298o;
    public String f3299p;
    public final String f3300q;
    public final String f3301r;
    public final int f3302s;
    public final int f3303t;
    public final List f3304u;
    public final o v;
    public final long f3305w;
    public final boolean f3306x;
    public final int f3307y;
    public final int f3308z;

    static {
        e2.d0.J(8);
        f3265d0 = Integer.toString(9, 36);
        f3266e0 = Integer.toString(10, 36);
        f3267f0 = Integer.toString(11, 36);
        f3268g0 = Integer.toString(12, 36);
        f3269h0 = Integer.toString(13, 36);
        f3270i0 = Integer.toString(14, 36);
        f3271j0 = Integer.toString(15, 36);
        f3272k0 = Integer.toString(16, 36);
        f3273l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f3274n0 = Integer.toString(19, 36);
        f3275o0 = Integer.toString(20, 36);
        f3276p0 = Integer.toString(21, 36);
        f3277q0 = Integer.toString(22, 36);
        f3278r0 = Integer.toString(23, 36);
        f3279s0 = Integer.toString(24, 36);
        f3280t0 = Integer.toString(25, 36);
        f3281u0 = Integer.toString(26, 36);
        f3282v0 = Integer.toString(27, 36);
        f3283w0 = Integer.toString(28, 36);
        f3284x0 = Integer.toString(29, 36);
        f3285y0 = Integer.toString(30, 36);
        f3286z0 = Integer.toString(31, 36);
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
        this.f3287a = rVar.f3232a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f3234c.isEmpty() && rVar.f3233b != null) {
            this.f3289c = e9.i0.z(new w(R, rVar.f3233b));
            this.f3288b = rVar.f3233b;
        } else if (!rVar.f3234c.isEmpty() && rVar.f3233b == null) {
            e9.i0 i0Var = rVar.f3234c;
            this.f3289c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f3333a, R)) {
                        str = wVar.f3334b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f3334b;
                    break;
                }
            }
            this.f3288b = str;
        } else {
            if (!rVar.f3234c.isEmpty() || rVar.f3233b != null) {
                for (int i11 = 0; i11 < rVar.f3234c.size(); i11++) {
                    if (!((w) rVar.f3234c.get(i11)).f3334b.equals(rVar.f3233b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f3289c = rVar.f3234c;
                this.f3288b = rVar.f3233b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f3289c = rVar.f3234c;
            this.f3288b = rVar.f3233b;
        }
        this.e = rVar.e;
        if (rVar.f3236g != 0 && (rVar.f3235f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f3290f = rVar.f3235f;
        this.f3291g = rVar.f3236g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f3237i;
        this.f3292i = i13;
        this.f3293j = i13 != -1 ? i13 : i12;
        this.f3294k = rVar.f3238j;
        this.f3295l = rVar.f3239k;
        this.f3296m = rVar.f3240l;
        this.f3297n = rVar.f3241m;
        this.f3298o = rVar.f3243o;
        this.f3299p = rVar.f3242n;
        this.f3300q = rVar.f3244p;
        this.f3301r = rVar.f3245q;
        this.f3302s = rVar.f3246r;
        this.f3303t = rVar.f3247s;
        List list = rVar.f3248t;
        this.f3304u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f3249u;
        this.v = oVar;
        this.f3305w = rVar.v;
        this.f3306x = rVar.f3250w;
        this.f3307y = rVar.f3251x;
        this.f3308z = rVar.f3252y;
        this.A = rVar.f3253z;
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
        e9.i0 i0Var = sVar.f3289c;
        String str4 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.f3308z;
        int i18 = sVar.f3307y;
        o oVar2 = sVar.v;
        String str5 = sVar.f3294k;
        int i19 = sVar.f3293j;
        String str6 = sVar.f3300q;
        int i20 = sVar.f3290f;
        xa.c cVar = new xa.c(String.valueOf(','));
        StringBuilder v = a4.a.v("id=");
        v.append(sVar.f3287a);
        v.append(", mimeType=");
        v.append(sVar.f3301r);
        if (str6 != null) {
            v.append(", container=");
            v.append(str6);
        }
        if (i19 != -1) {
            v.append(", bitrate=");
            v.append(i19);
        }
        if (str5 != null) {
            v.append(", codecs=");
            v.append(str5);
        }
        if (oVar2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i21 = 0;
            c10 = 0;
            while (i21 < oVar2.d) {
                UUID uuid = oVar2.f3159a[i21].f3113b;
                if (uuid.equals(i.f3010b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f3011c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f3009a)) {
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
            v.append(", drm=[");
            cVar.p(v, linkedHashSet.iterator());
            v.append(']');
        } else {
            c10 = 0;
        }
        if (i18 != -1 && i17 != -1) {
            v.append(", res=");
            v.append(i18);
            v.append("x");
            v.append(i17);
        }
        if (i16 != -1 && i15 != -1) {
            v.append(", decRes=");
            v.append(i16);
            v.append("x");
            v.append(i15);
        }
        double d = f10;
        int i22 = g9.c.f9512a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            v.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.d0.f7870a;
            v.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f3028f;
            int i24 = jVar.e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                v.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f3025a);
                    String a2 = j.a(jVar.f3026b);
                    String c11 = j.c(jVar.f3027c);
                    String str8 = e2.d0.f7870a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i24 != -1 && i23 != -1) {
                    str3 = a4.a.l(i24, i23, "/");
                } else {
                    str3 = "NA/NA";
                }
                v.append(str2 + "/" + str3);
            }
        }
        if (f7 != -1.0f) {
            v.append(", fps=");
            v.append(f7);
        }
        if (i14 != -1) {
            v.append(", maxSubLayers=");
            v.append(i14);
        }
        if (i13 != -1) {
            v.append(", channels=");
            v.append(i13);
        }
        if (i12 != -1) {
            v.append(", sample_rate=");
            v.append(i12);
        }
        if (str4 != null) {
            v.append(", language=");
            v.append(str4);
        }
        if (!i0Var.isEmpty()) {
            v.append(", labels=[");
            cVar.p(v, e9.q.w(i0Var, new ai.w1(10)).iterator());
            v.append("]");
        }
        if (i11 != 0) {
            v.append(", selectionFlags=[");
            String str9 = e2.d0.f7870a;
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
            cVar.p(v, arrayList.iterator());
            v.append("]");
        }
        if (i20 != 0) {
            v.append(", roleFlags=[");
            String str10 = e2.d0.f7870a;
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
            cVar.p(v, arrayList2.iterator());
            v.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            v.append(", auxiliaryTrackType=");
            int i25 = sVar.f3291g;
            String str11 = e2.d0.f7870a;
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
            v.append(str);
        }
        return v.toString();
    }

    public final r a() {
        ?? obj = new Object();
        obj.f3232a = this.f3287a;
        obj.f3233b = this.f3288b;
        obj.f3234c = this.f3289c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3235f = this.f3290f;
        obj.h = this.h;
        obj.f3237i = this.f3292i;
        obj.f3238j = this.f3294k;
        obj.f3239k = this.f3295l;
        obj.f3244p = this.f3300q;
        obj.f3245q = this.f3301r;
        obj.f3246r = this.f3302s;
        obj.f3247s = this.f3303t;
        obj.f3248t = this.f3304u;
        obj.f3249u = this.v;
        obj.v = this.f3305w;
        obj.f3250w = this.f3306x;
        obj.f3251x = this.f3307y;
        obj.f3252y = this.f3308z;
        obj.f3253z = this.A;
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
        obj.f3240l = this.f3296m;
        obj.f3241m = this.f3297n;
        obj.f3243o = this.f3298o;
        obj.f3242n = this.f3299p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f3304u;
        if (list.size() != sVar.f3304u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f3304u.get(i10))) {
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
        int h = r0.h(this.f3301r);
        String str3 = sVar.f3287a;
        p0 p0Var = sVar.f3295l;
        e9.i0 i0Var = sVar.f3289c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f3288b;
        if (str4 == null) {
            str4 = this.f3288b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f3289c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f3292i;
        if (i15 == -1) {
            i15 = sVar.f3292i;
        }
        String str5 = this.f3294k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f3294k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f3295l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.e | sVar.e;
        int i17 = this.f3290f | sVar.f3290f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f3161c;
            n[] nVarArr = oVar2.f3159a;
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
                str2 = oVar3.f3161c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f3159a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.e != null) {
                    UUID uuid = nVar2.f3113b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f3113b.equals(uuid)) {
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
        a2.f3232a = str3;
        a2.f3233b = str4;
        a2.f3234c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f3235f = i17;
        a2.h = i14;
        a2.f3237i = i15;
        a2.f3238j = str5;
        a2.f3239k = p0Var;
        a2.f3249u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.e == sVar.e && this.f3290f == sVar.f3290f && this.f3291g == sVar.f3291g && this.h == sVar.h && this.f3292i == sVar.f3292i && this.f3302s == sVar.f3302s && this.f3305w == sVar.f3305w && this.f3307y == sVar.f3307y && this.f3308z == sVar.f3308z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f3287a, sVar.f3287a) && Objects.equals(this.f3288b, sVar.f3288b) && this.f3289c.equals(sVar.f3289c) && Objects.equals(this.f3294k, sVar.f3294k) && Objects.equals(this.f3300q, sVar.f3300q) && Objects.equals(this.f3301r, sVar.f3301r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f3295l, sVar.f3295l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f3287a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f3288b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f3289c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.e) * 31) + this.f3290f) * 31) + this.f3291g) * 31) + this.h) * 31) + this.f3292i) * 31;
            String str4 = this.f3294k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f3295l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f3300q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f3301r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f3302s) * 31) + ((int) this.f3305w)) * 31) + this.f3307y) * 31) + this.f3308z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3287a);
        sb2.append(", ");
        sb2.append(this.f3288b);
        sb2.append(", ");
        sb2.append(this.f3300q);
        sb2.append(", ");
        sb2.append(this.f3301r);
        sb2.append(", ");
        sb2.append(this.f3294k);
        sb2.append(", ");
        sb2.append(this.f3293j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f3307y);
        sb2.append(", ");
        sb2.append(this.f3308z);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append("], [");
        sb2.append(this.J);
        sb2.append(", ");
        return a4.a.o(this.K, "])", sb2);
    }
}
