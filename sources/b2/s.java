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
    public static final String f3269a0 = Integer.toString(5, 36);
    public static final String f3270b0 = Integer.toString(6, 36);
    public static final String f3271c0 = Integer.toString(7, 36);
    public static final String f3272d0;
    public static final String f3273e0;
    public static final String f3274f0;
    public static final String f3275g0;
    public static final String f3276h0;
    public static final String f3277i0;
    public static final String f3278j0;
    public static final String f3279k0;
    public static final String f3280l0;
    public static final String m0;
    public static final String f3281n0;
    public static final String f3282o0;
    public static final String f3283p0;
    public static final String f3284q0;
    public static final String f3285r0;
    public static final String f3286s0;
    public static final String f3287t0;
    public static final String f3288u0;
    public static final String f3289v0;
    public static final String f3290w0;
    public static final String f3291x0;
    public static final String f3292y0;
    public static final String f3293z0;
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
    public final String f3294a;
    public final String f3295b;
    public final e9.i0 f3296c;
    public final String d;
    public final int e;
    public final int f3297f;
    public final int f3298g;
    public final int h;
    public final int f3299i;
    public final int f3300j;
    public final String f3301k;
    public final p0 f3302l;
    public boolean f3303m;
    public long f3304n;
    public int f3305o;
    public String f3306p;
    public final String f3307q;
    public final String f3308r;
    public final int f3309s;
    public final int f3310t;
    public final List f3311u;
    public final o v;
    public final long f3312w;
    public final boolean f3313x;
    public final int f3314y;
    public final int f3315z;

    static {
        e2.d0.J(8);
        f3272d0 = Integer.toString(9, 36);
        f3273e0 = Integer.toString(10, 36);
        f3274f0 = Integer.toString(11, 36);
        f3275g0 = Integer.toString(12, 36);
        f3276h0 = Integer.toString(13, 36);
        f3277i0 = Integer.toString(14, 36);
        f3278j0 = Integer.toString(15, 36);
        f3279k0 = Integer.toString(16, 36);
        f3280l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f3281n0 = Integer.toString(19, 36);
        f3282o0 = Integer.toString(20, 36);
        f3283p0 = Integer.toString(21, 36);
        f3284q0 = Integer.toString(22, 36);
        f3285r0 = Integer.toString(23, 36);
        f3286s0 = Integer.toString(24, 36);
        f3287t0 = Integer.toString(25, 36);
        f3288u0 = Integer.toString(26, 36);
        f3289v0 = Integer.toString(27, 36);
        f3290w0 = Integer.toString(28, 36);
        f3291x0 = Integer.toString(29, 36);
        f3292y0 = Integer.toString(30, 36);
        f3293z0 = Integer.toString(31, 36);
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
        this.f3294a = rVar.f3239a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f3241c.isEmpty() && rVar.f3240b != null) {
            this.f3296c = e9.i0.z(new w(R, rVar.f3240b));
            this.f3295b = rVar.f3240b;
        } else if (!rVar.f3241c.isEmpty() && rVar.f3240b == null) {
            e9.i0 i0Var = rVar.f3241c;
            this.f3296c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f3340a, R)) {
                        str = wVar.f3341b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f3341b;
                    break;
                }
            }
            this.f3295b = str;
        } else {
            if (!rVar.f3241c.isEmpty() || rVar.f3240b != null) {
                for (int i11 = 0; i11 < rVar.f3241c.size(); i11++) {
                    if (!((w) rVar.f3241c.get(i11)).f3341b.equals(rVar.f3240b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f3296c = rVar.f3241c;
                this.f3295b = rVar.f3240b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f3296c = rVar.f3241c;
            this.f3295b = rVar.f3240b;
        }
        this.e = rVar.e;
        if (rVar.f3243g != 0 && (rVar.f3242f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f3297f = rVar.f3242f;
        this.f3298g = rVar.f3243g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f3244i;
        this.f3299i = i13;
        this.f3300j = i13 != -1 ? i13 : i12;
        this.f3301k = rVar.f3245j;
        this.f3302l = rVar.f3246k;
        this.f3303m = rVar.f3247l;
        this.f3304n = rVar.f3248m;
        this.f3305o = rVar.f3250o;
        this.f3306p = rVar.f3249n;
        this.f3307q = rVar.f3251p;
        this.f3308r = rVar.f3252q;
        this.f3309s = rVar.f3253r;
        this.f3310t = rVar.f3254s;
        List list = rVar.f3255t;
        this.f3311u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f3256u;
        this.v = oVar;
        this.f3312w = rVar.v;
        this.f3313x = rVar.f3257w;
        this.f3314y = rVar.f3258x;
        this.f3315z = rVar.f3259y;
        this.A = rVar.f3260z;
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
        int i10;
        String str;
        String str2;
        String str3;
        int i11;
        if (sVar == null) {
            return "null";
        }
        int i12 = sVar.e;
        e9.i0 i0Var = sVar.f3296c;
        String str4 = sVar.d;
        int i13 = sVar.K;
        int i14 = sVar.J;
        int i15 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i16 = sVar.B;
        int i17 = sVar.A;
        int i18 = sVar.f3315z;
        int i19 = sVar.f3314y;
        o oVar = sVar.v;
        String str5 = sVar.f3301k;
        int i20 = sVar.f3300j;
        String str6 = sVar.f3307q;
        int i21 = sVar.f3297f;
        d9.f fVar = new d9.f(String.valueOf(','), 0);
        StringBuilder u10 = a4.a.u("id=");
        u10.append(sVar.f3294a);
        u10.append(", mimeType=");
        u10.append(sVar.f3308r);
        if (str6 != null) {
            u10.append(", container=");
            u10.append(str6);
        }
        if (i20 != -1) {
            u10.append(", bitrate=");
            u10.append(i20);
        }
        if (str5 != null) {
            u10.append(", codecs=");
            u10.append(str5);
        }
        if (oVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i22 = 0;
            while (i22 < oVar.d) {
                UUID uuid = oVar.f3166a[i22].f3120b;
                if (uuid.equals(i.f3017b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f3018c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f3016a)) {
                    linkedHashSet.add("universal");
                } else {
                    i11 = i22;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i22 = i11 + 1;
                }
                i11 = i22;
                i22 = i11 + 1;
            }
            u10.append(", drm=[");
            fVar.a(u10, linkedHashSet.iterator());
            u10.append(']');
        }
        if (i19 != -1 && i18 != -1) {
            u10.append(", res=");
            u10.append(i19);
            u10.append("x");
            u10.append(i18);
        }
        if (i17 != -1 && i16 != -1) {
            u10.append(", decRes=");
            u10.append(i17);
            u10.append("x");
            u10.append(i16);
        }
        double d = f10;
        int i23 = g9.c.f9530a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str7 = e2.d0.f7887a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i24 = jVar.f3035f;
            int i25 = jVar.e;
            if ((i25 != -1 && i24 != -1) || jVar.d()) {
                u10.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f3032a);
                    String a2 = j.a(jVar.f3033b);
                    String c10 = j.c(jVar.f3034c);
                    String str8 = e2.d0.f7887a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c10;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i25 != -1 && i24 != -1) {
                    str3 = a4.a.k(i25, i24, "/");
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
        if (i15 != -1) {
            u10.append(", maxSubLayers=");
            u10.append(i15);
        }
        if (i14 != -1) {
            u10.append(", channels=");
            u10.append(i14);
        }
        if (i13 != -1) {
            u10.append(", sample_rate=");
            u10.append(i13);
        }
        if (str4 != null) {
            u10.append(", language=");
            u10.append(str4);
        }
        if (!i0Var.isEmpty()) {
            u10.append(", labels=[");
            fVar.a(u10, e9.q.w(i0Var, new ai.w1(10)).iterator());
            u10.append("]");
        }
        if (i12 != 0) {
            u10.append(", selectionFlags=[");
            String str9 = e2.d0.f7887a;
            ArrayList arrayList = new ArrayList();
            if ((i12 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i12 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i12 & 2) != 0) {
                arrayList.add("forced");
            }
            fVar.a(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i21 != 0) {
            u10.append(", roleFlags=[");
            String str10 = e2.d0.f7887a;
            ArrayList arrayList2 = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i21 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i21 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i21 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i21 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i21 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i21 & 64) != 0) {
                arrayList2.add("caption");
            }
            i10 = i21;
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
            i10 = i21;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i26 = sVar.f3298g;
            String str11 = e2.d0.f7887a;
            if (i26 != 0) {
                if (i26 != 1) {
                    if (i26 != 2) {
                        if (i26 != 3) {
                            if (i26 == 4) {
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
        obj.f3239a = this.f3294a;
        obj.f3240b = this.f3295b;
        obj.f3241c = this.f3296c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3242f = this.f3297f;
        obj.h = this.h;
        obj.f3244i = this.f3299i;
        obj.f3245j = this.f3301k;
        obj.f3246k = this.f3302l;
        obj.f3251p = this.f3307q;
        obj.f3252q = this.f3308r;
        obj.f3253r = this.f3309s;
        obj.f3254s = this.f3310t;
        obj.f3255t = this.f3311u;
        obj.f3256u = this.v;
        obj.v = this.f3312w;
        obj.f3257w = this.f3313x;
        obj.f3258x = this.f3314y;
        obj.f3259y = this.f3315z;
        obj.f3260z = this.A;
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
        obj.f3247l = this.f3303m;
        obj.f3248m = this.f3304n;
        obj.f3250o = this.f3305o;
        obj.f3249n = this.f3306p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f3311u;
        if (list.size() != sVar.f3311u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f3311u.get(i10))) {
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
        int h = r0.h(this.f3308r);
        String str3 = sVar.f3294a;
        p0 p0Var = sVar.f3302l;
        e9.i0 i0Var = sVar.f3296c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f3295b;
        if (str4 == null) {
            str4 = this.f3295b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f3296c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f3299i;
        if (i15 == -1) {
            i15 = sVar.f3299i;
        }
        String str5 = this.f3301k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f3301k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f3302l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.e | sVar.e;
        int i17 = this.f3297f | sVar.f3297f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f3168c;
            n[] nVarArr = oVar2.f3166a;
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
                str2 = oVar3.f3168c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f3166a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.e != null) {
                    UUID uuid = nVar2.f3120b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f3120b.equals(uuid)) {
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
        a2.f3239a = str3;
        a2.f3240b = str4;
        a2.f3241c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f3242f = i17;
        a2.h = i14;
        a2.f3244i = i15;
        a2.f3245j = str5;
        a2.f3246k = p0Var;
        a2.f3256u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.e == sVar.e && this.f3297f == sVar.f3297f && this.f3298g == sVar.f3298g && this.h == sVar.h && this.f3299i == sVar.f3299i && this.f3309s == sVar.f3309s && this.f3312w == sVar.f3312w && this.f3314y == sVar.f3314y && this.f3315z == sVar.f3315z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f3294a, sVar.f3294a) && Objects.equals(this.f3295b, sVar.f3295b) && this.f3296c.equals(sVar.f3296c) && Objects.equals(this.f3301k, sVar.f3301k) && Objects.equals(this.f3307q, sVar.f3307q) && Objects.equals(this.f3308r, sVar.f3308r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f3302l, sVar.f3302l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f3294a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f3295b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f3296c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.e) * 31) + this.f3297f) * 31) + this.f3298g) * 31) + this.h) * 31) + this.f3299i) * 31;
            String str4 = this.f3301k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f3302l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f3307q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f3308r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f3309s) * 31) + ((int) this.f3312w)) * 31) + this.f3314y) * 31) + this.f3315z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3294a);
        sb2.append(", ");
        sb2.append(this.f3295b);
        sb2.append(", ");
        sb2.append(this.f3307q);
        sb2.append(", ");
        sb2.append(this.f3308r);
        sb2.append(", ");
        sb2.append(this.f3301k);
        sb2.append(", ");
        sb2.append(this.f3300j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f3314y);
        sb2.append(", ");
        sb2.append(this.f3315z);
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
