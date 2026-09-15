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
    public static final String f3265a0 = Integer.toString(5, 36);
    public static final String f3266b0 = Integer.toString(6, 36);
    public static final String f3267c0 = Integer.toString(7, 36);
    public static final String f3268d0;
    public static final String f3269e0;
    public static final String f3270f0;
    public static final String f3271g0;
    public static final String f3272h0;
    public static final String f3273i0;
    public static final String f3274j0;
    public static final String f3275k0;
    public static final String f3276l0;
    public static final String m0;
    public static final String f3277n0;
    public static final String f3278o0;
    public static final String f3279p0;
    public static final String f3280q0;
    public static final String f3281r0;
    public static final String f3282s0;
    public static final String f3283t0;
    public static final String f3284u0;
    public static final String f3285v0;
    public static final String f3286w0;
    public static final String f3287x0;
    public static final String f3288y0;
    public static final String f3289z0;
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
    public final String f3290a;
    public final String f3291b;
    public final e9.i0 f3292c;
    public final String d;
    public final int e;
    public final int f3293f;
    public final int f3294g;
    public final int h;
    public final int f3295i;
    public final int f3296j;
    public final String f3297k;
    public final p0 f3298l;
    public boolean f3299m;
    public long f3300n;
    public int f3301o;
    public String f3302p;
    public final String f3303q;
    public final String f3304r;
    public final int f3305s;
    public final int f3306t;
    public final List f3307u;
    public final o v;
    public final long f3308w;
    public final boolean f3309x;
    public final int f3310y;
    public final int f3311z;

    static {
        e2.d0.J(8);
        f3268d0 = Integer.toString(9, 36);
        f3269e0 = Integer.toString(10, 36);
        f3270f0 = Integer.toString(11, 36);
        f3271g0 = Integer.toString(12, 36);
        f3272h0 = Integer.toString(13, 36);
        f3273i0 = Integer.toString(14, 36);
        f3274j0 = Integer.toString(15, 36);
        f3275k0 = Integer.toString(16, 36);
        f3276l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f3277n0 = Integer.toString(19, 36);
        f3278o0 = Integer.toString(20, 36);
        f3279p0 = Integer.toString(21, 36);
        f3280q0 = Integer.toString(22, 36);
        f3281r0 = Integer.toString(23, 36);
        f3282s0 = Integer.toString(24, 36);
        f3283t0 = Integer.toString(25, 36);
        f3284u0 = Integer.toString(26, 36);
        f3285v0 = Integer.toString(27, 36);
        f3286w0 = Integer.toString(28, 36);
        f3287x0 = Integer.toString(29, 36);
        f3288y0 = Integer.toString(30, 36);
        f3289z0 = Integer.toString(31, 36);
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
        this.f3290a = rVar.f3235a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f3237c.isEmpty() && rVar.f3236b != null) {
            this.f3292c = e9.i0.z(new w(R, rVar.f3236b));
            this.f3291b = rVar.f3236b;
        } else if (!rVar.f3237c.isEmpty() && rVar.f3236b == null) {
            e9.i0 i0Var = rVar.f3237c;
            this.f3292c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f3336a, R)) {
                        str = wVar.f3337b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f3337b;
                    break;
                }
            }
            this.f3291b = str;
        } else {
            if (!rVar.f3237c.isEmpty() || rVar.f3236b != null) {
                for (int i11 = 0; i11 < rVar.f3237c.size(); i11++) {
                    if (!((w) rVar.f3237c.get(i11)).f3337b.equals(rVar.f3236b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f3292c = rVar.f3237c;
                this.f3291b = rVar.f3236b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f3292c = rVar.f3237c;
            this.f3291b = rVar.f3236b;
        }
        this.e = rVar.e;
        if (rVar.f3239g != 0 && (rVar.f3238f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f3293f = rVar.f3238f;
        this.f3294g = rVar.f3239g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f3240i;
        this.f3295i = i13;
        this.f3296j = i13 != -1 ? i13 : i12;
        this.f3297k = rVar.f3241j;
        this.f3298l = rVar.f3242k;
        this.f3299m = rVar.f3243l;
        this.f3300n = rVar.f3244m;
        this.f3301o = rVar.f3246o;
        this.f3302p = rVar.f3245n;
        this.f3303q = rVar.f3247p;
        this.f3304r = rVar.f3248q;
        this.f3305s = rVar.f3249r;
        this.f3306t = rVar.f3250s;
        List list = rVar.f3251t;
        this.f3307u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f3252u;
        this.v = oVar;
        this.f3308w = rVar.v;
        this.f3309x = rVar.f3253w;
        this.f3310y = rVar.f3254x;
        this.f3311z = rVar.f3255y;
        this.A = rVar.f3256z;
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
        e9.i0 i0Var = sVar.f3292c;
        String str4 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.f3311z;
        int i18 = sVar.f3310y;
        o oVar2 = sVar.v;
        String str5 = sVar.f3297k;
        int i19 = sVar.f3296j;
        String str6 = sVar.f3303q;
        int i20 = sVar.f3293f;
        xa.c cVar = new xa.c(String.valueOf(','));
        StringBuilder u10 = a4.a.u("id=");
        u10.append(sVar.f3290a);
        u10.append(", mimeType=");
        u10.append(sVar.f3304r);
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
                UUID uuid = oVar2.f3162a[i21].f3116b;
                if (uuid.equals(i.f3013b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f3014c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f3012a)) {
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
            cVar.j(u10, linkedHashSet.iterator());
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
        int i22 = g9.c.f9525a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.d0.f7883a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f3031f;
            int i24 = jVar.e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                u10.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f3028a);
                    String a2 = j.a(jVar.f3029b);
                    String c11 = j.c(jVar.f3030c);
                    String str8 = e2.d0.f7883a;
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
            cVar.j(u10, e9.q.w(i0Var, new ai.w1(10)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str9 = e2.d0.f7883a;
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
            cVar.j(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i20 != 0) {
            u10.append(", roleFlags=[");
            String str10 = e2.d0.f7883a;
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
            cVar.j(u10, arrayList2.iterator());
            u10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i25 = sVar.f3294g;
            String str11 = e2.d0.f7883a;
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
        obj.f3235a = this.f3290a;
        obj.f3236b = this.f3291b;
        obj.f3237c = this.f3292c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3238f = this.f3293f;
        obj.h = this.h;
        obj.f3240i = this.f3295i;
        obj.f3241j = this.f3297k;
        obj.f3242k = this.f3298l;
        obj.f3247p = this.f3303q;
        obj.f3248q = this.f3304r;
        obj.f3249r = this.f3305s;
        obj.f3250s = this.f3306t;
        obj.f3251t = this.f3307u;
        obj.f3252u = this.v;
        obj.v = this.f3308w;
        obj.f3253w = this.f3309x;
        obj.f3254x = this.f3310y;
        obj.f3255y = this.f3311z;
        obj.f3256z = this.A;
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
        obj.f3243l = this.f3299m;
        obj.f3244m = this.f3300n;
        obj.f3246o = this.f3301o;
        obj.f3245n = this.f3302p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f3307u;
        if (list.size() != sVar.f3307u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f3307u.get(i10))) {
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
        int h = r0.h(this.f3304r);
        String str3 = sVar.f3290a;
        p0 p0Var = sVar.f3298l;
        e9.i0 i0Var = sVar.f3292c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f3291b;
        if (str4 == null) {
            str4 = this.f3291b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f3292c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f3295i;
        if (i15 == -1) {
            i15 = sVar.f3295i;
        }
        String str5 = this.f3297k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f3297k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f3298l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.e | sVar.e;
        int i17 = this.f3293f | sVar.f3293f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f3164c;
            n[] nVarArr = oVar2.f3162a;
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
                str2 = oVar3.f3164c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f3162a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.e != null) {
                    UUID uuid = nVar2.f3116b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f3116b.equals(uuid)) {
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
        a2.f3235a = str3;
        a2.f3236b = str4;
        a2.f3237c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f3238f = i17;
        a2.h = i14;
        a2.f3240i = i15;
        a2.f3241j = str5;
        a2.f3242k = p0Var;
        a2.f3252u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.e == sVar.e && this.f3293f == sVar.f3293f && this.f3294g == sVar.f3294g && this.h == sVar.h && this.f3295i == sVar.f3295i && this.f3305s == sVar.f3305s && this.f3308w == sVar.f3308w && this.f3310y == sVar.f3310y && this.f3311z == sVar.f3311z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f3290a, sVar.f3290a) && Objects.equals(this.f3291b, sVar.f3291b) && this.f3292c.equals(sVar.f3292c) && Objects.equals(this.f3297k, sVar.f3297k) && Objects.equals(this.f3303q, sVar.f3303q) && Objects.equals(this.f3304r, sVar.f3304r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f3298l, sVar.f3298l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f3290a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f3291b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f3292c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.e) * 31) + this.f3293f) * 31) + this.f3294g) * 31) + this.h) * 31) + this.f3295i) * 31;
            String str4 = this.f3297k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f3298l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f3303q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f3304r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f3305s) * 31) + ((int) this.f3308w)) * 31) + this.f3310y) * 31) + this.f3311z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3290a);
        sb2.append(", ");
        sb2.append(this.f3291b);
        sb2.append(", ");
        sb2.append(this.f3303q);
        sb2.append(", ");
        sb2.append(this.f3304r);
        sb2.append(", ");
        sb2.append(this.f3297k);
        sb2.append(", ");
        sb2.append(this.f3296j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f3310y);
        sb2.append(", ");
        sb2.append(this.f3311z);
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
