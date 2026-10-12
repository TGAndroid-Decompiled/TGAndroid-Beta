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
    public static final String f3601a0 = Integer.toString(5, 36);
    public static final String f3602b0 = Integer.toString(6, 36);
    public static final String f3603c0 = Integer.toString(7, 36);
    public static final String f3604d0;
    public static final String f3605e0;
    public static final String f3606f0;
    public static final String f3607g0;
    public static final String f3608h0;
    public static final String f3609i0;
    public static final String f3610j0;
    public static final String f3611k0;
    public static final String f3612l0;
    public static final String m0;
    public static final String f3613n0;
    public static final String f3614o0;
    public static final String f3615p0;
    public static final String f3616q0;
    public static final String f3617r0;
    public static final String f3618s0;
    public static final String f3619t0;
    public static final String f3620u0;
    public static final String f3621v0;
    public static final String f3622w0;
    public static final String f3623x0;
    public static final String f3624y0;
    public static final String f3625z0;
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
    public final String f3626a;
    public final String f3627b;
    public final e9.i0 f3628c;
    public final String d;
    public final int f3629e;
    public final int f3630f;
    public final int f3631g;
    public final int h;
    public final int f3632i;
    public final int f3633j;
    public final String f3634k;
    public final p0 f3635l;
    public boolean f3636m;
    public long f3637n;
    public int f3638o;
    public String f3639p;
    public final String f3640q;
    public final String f3641r;
    public final int f3642s;
    public final int f3643t;
    public final List f3644u;
    public final o v;
    public final long f3645w;
    public final boolean f3646x;
    public final int f3647y;
    public final int f3648z;

    static {
        e2.d0.I(8);
        f3604d0 = Integer.toString(9, 36);
        f3605e0 = Integer.toString(10, 36);
        f3606f0 = Integer.toString(11, 36);
        f3607g0 = Integer.toString(12, 36);
        f3608h0 = Integer.toString(13, 36);
        f3609i0 = Integer.toString(14, 36);
        f3610j0 = Integer.toString(15, 36);
        f3611k0 = Integer.toString(16, 36);
        f3612l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f3613n0 = Integer.toString(19, 36);
        f3614o0 = Integer.toString(20, 36);
        f3615p0 = Integer.toString(21, 36);
        f3616q0 = Integer.toString(22, 36);
        f3617r0 = Integer.toString(23, 36);
        f3618s0 = Integer.toString(24, 36);
        f3619t0 = Integer.toString(25, 36);
        f3620u0 = Integer.toString(26, 36);
        f3621v0 = Integer.toString(27, 36);
        f3622w0 = Integer.toString(28, 36);
        f3623x0 = Integer.toString(29, 36);
        f3624y0 = Integer.toString(30, 36);
        f3625z0 = Integer.toString(31, 36);
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
        this.f3626a = rVar.f3569a;
        String Q = e2.d0.Q(rVar.d);
        this.d = Q;
        if (rVar.f3571c.isEmpty() && rVar.f3570b != null) {
            this.f3628c = e9.i0.z(new w(Q, rVar.f3570b));
            this.f3627b = rVar.f3570b;
        } else if (!rVar.f3571c.isEmpty() && rVar.f3570b == null) {
            e9.i0 i0Var = rVar.f3571c;
            this.f3628c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f3676a, Q)) {
                        str = wVar.f3677b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f3677b;
                    break;
                }
            }
            this.f3627b = str;
        } else {
            if (!rVar.f3571c.isEmpty() || rVar.f3570b != null) {
                for (int i11 = 0; i11 < rVar.f3571c.size(); i11++) {
                    if (!((w) rVar.f3571c.get(i11)).f3677b.equals(rVar.f3570b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f3628c = rVar.f3571c;
                this.f3627b = rVar.f3570b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f3628c = rVar.f3571c;
            this.f3627b = rVar.f3570b;
        }
        this.f3629e = rVar.f3572e;
        if (rVar.f3574g != 0 && (rVar.f3573f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f3630f = rVar.f3573f;
        this.f3631g = rVar.f3574g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f3575i;
        this.f3632i = i13;
        this.f3633j = i13 != -1 ? i13 : i12;
        this.f3634k = rVar.f3576j;
        this.f3635l = rVar.f3577k;
        this.f3636m = rVar.f3578l;
        this.f3637n = rVar.f3579m;
        this.f3638o = rVar.f3581o;
        this.f3639p = rVar.f3580n;
        this.f3640q = rVar.f3582p;
        this.f3641r = rVar.f3583q;
        this.f3642s = rVar.f3584r;
        this.f3643t = rVar.f3585s;
        List list = rVar.f3586t;
        this.f3644u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f3587u;
        this.v = oVar;
        this.f3645w = rVar.v;
        this.f3646x = rVar.f3588w;
        this.f3647y = rVar.f3589x;
        this.f3648z = rVar.f3590y;
        this.A = rVar.f3591z;
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
        int i12 = sVar.f3629e;
        e9.i0 i0Var = sVar.f3628c;
        String str4 = sVar.d;
        int i13 = sVar.K;
        int i14 = sVar.J;
        int i15 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i16 = sVar.B;
        int i17 = sVar.A;
        int i18 = sVar.f3648z;
        int i19 = sVar.f3647y;
        o oVar = sVar.v;
        String str5 = sVar.f3634k;
        int i20 = sVar.f3633j;
        String str6 = sVar.f3640q;
        int i21 = sVar.f3630f;
        d9.f fVar = new d9.f(String.valueOf(','), 0);
        StringBuilder v = a1.g.v("id=");
        v.append(sVar.f3626a);
        v.append(", mimeType=");
        v.append(sVar.f3641r);
        if (str6 != null) {
            v.append(", container=");
            v.append(str6);
        }
        if (i20 != -1) {
            v.append(", bitrate=");
            v.append(i20);
        }
        if (str5 != null) {
            v.append(", codecs=");
            v.append(str5);
        }
        if (oVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i22 = 0;
            while (i22 < oVar.d) {
                UUID uuid = oVar.f3493a[i22].f3445b;
                if (uuid.equals(i.f3332b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f3333c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.f3334e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f3331a)) {
                    linkedHashSet.add("universal");
                } else {
                    i11 = i22;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i22 = i11 + 1;
                }
                i11 = i22;
                i22 = i11 + 1;
            }
            v.append(", drm=[");
            fVar.a(v, linkedHashSet.iterator());
            v.append(']');
        }
        if (i19 != -1 && i18 != -1) {
            v.append(", res=");
            v.append(i19);
            v.append("x");
            v.append(i18);
        }
        if (i17 != -1 && i16 != -1) {
            v.append(", decRes=");
            v.append(i17);
            v.append("x");
            v.append(i16);
        }
        double d = f10;
        int i23 = g9.c.f10429a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            v.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str7 = e2.d0.f8529a;
            v.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i24 = jVar.f3354f;
            int i25 = jVar.f3353e;
            if ((i25 != -1 && i24 != -1) || jVar.d()) {
                v.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f3350a);
                    String a2 = j.a(jVar.f3351b);
                    String c10 = j.c(jVar.f3352c);
                    String str8 = e2.d0.f8529a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c10;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i25 != -1 && i24 != -1) {
                    str3 = a1.g.l(i25, i24, "/");
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
        if (i15 != -1) {
            v.append(", maxSubLayers=");
            v.append(i15);
        }
        if (i14 != -1) {
            v.append(", channels=");
            v.append(i14);
        }
        if (i13 != -1) {
            v.append(", sample_rate=");
            v.append(i13);
        }
        if (str4 != null) {
            v.append(", language=");
            v.append(str4);
        }
        if (!i0Var.isEmpty()) {
            v.append(", labels=[");
            fVar.a(v, e9.q.w(i0Var, new ai.w1(10)).iterator());
            v.append("]");
        }
        if (i12 != 0) {
            v.append(", selectionFlags=[");
            String str9 = e2.d0.f8529a;
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
            fVar.a(v, arrayList.iterator());
            v.append("]");
        }
        if (i21 != 0) {
            v.append(", roleFlags=[");
            String str10 = e2.d0.f8529a;
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
            fVar.a(v, arrayList2.iterator());
            v.append("]");
        } else {
            i10 = i21;
        }
        if ((i10 & 32768) != 0) {
            v.append(", auxiliaryTrackType=");
            int i26 = sVar.f3631g;
            String str11 = e2.d0.f8529a;
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
            v.append(str);
        }
        return v.toString();
    }

    public final r a() {
        ?? obj = new Object();
        obj.f3569a = this.f3626a;
        obj.f3570b = this.f3627b;
        obj.f3571c = this.f3628c;
        obj.d = this.d;
        obj.f3572e = this.f3629e;
        obj.f3573f = this.f3630f;
        obj.h = this.h;
        obj.f3575i = this.f3632i;
        obj.f3576j = this.f3634k;
        obj.f3577k = this.f3635l;
        obj.f3582p = this.f3640q;
        obj.f3583q = this.f3641r;
        obj.f3584r = this.f3642s;
        obj.f3585s = this.f3643t;
        obj.f3586t = this.f3644u;
        obj.f3587u = this.v;
        obj.v = this.f3645w;
        obj.f3588w = this.f3646x;
        obj.f3589x = this.f3647y;
        obj.f3590y = this.f3648z;
        obj.f3591z = this.A;
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
        obj.f3578l = this.f3636m;
        obj.f3579m = this.f3637n;
        obj.f3581o = this.f3638o;
        obj.f3580n = this.f3639p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f3644u;
        if (list.size() != sVar.f3644u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f3644u.get(i10))) {
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
        int h = r0.h(this.f3641r);
        String str3 = sVar.f3626a;
        p0 p0Var = sVar.f3635l;
        e9.i0 i0Var = sVar.f3628c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f3627b;
        if (str4 == null) {
            str4 = this.f3627b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f3628c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f3632i;
        if (i15 == -1) {
            i15 = sVar.f3632i;
        }
        String str5 = this.f3634k;
        if (str5 == null) {
            String u10 = e2.d0.u(h, sVar.f3634k);
            if (e2.d0.a0(u10).length == 1) {
                str5 = u10;
            }
        }
        p0 p0Var2 = this.f3635l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.f3629e | sVar.f3629e;
        int i17 = this.f3630f | sVar.f3630f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f3495c;
            n[] nVarArr = oVar2.f3493a;
            int length = nVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                n nVar = nVarArr[i19];
                int i20 = length;
                if (nVar.f3447e != null) {
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
                str2 = oVar3.f3495c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f3493a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.f3447e != null) {
                    UUID uuid = nVar2.f3445b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f3445b.equals(uuid)) {
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
        a2.f3569a = str3;
        a2.f3570b = str4;
        a2.f3571c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.f3572e = i16;
        a2.f3573f = i17;
        a2.h = i14;
        a2.f3575i = i15;
        a2.f3576j = str5;
        a2.f3577k = p0Var;
        a2.f3587u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.f3629e == sVar.f3629e && this.f3630f == sVar.f3630f && this.f3631g == sVar.f3631g && this.h == sVar.h && this.f3632i == sVar.f3632i && this.f3642s == sVar.f3642s && this.f3645w == sVar.f3645w && this.f3647y == sVar.f3647y && this.f3648z == sVar.f3648z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f3626a, sVar.f3626a) && Objects.equals(this.f3627b, sVar.f3627b) && this.f3628c.equals(sVar.f3628c) && Objects.equals(this.f3634k, sVar.f3634k) && Objects.equals(this.f3640q, sVar.f3640q) && Objects.equals(this.f3641r, sVar.f3641r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f3635l, sVar.f3635l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f3626a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f3627b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f3628c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.f3629e) * 31) + this.f3630f) * 31) + this.f3631g) * 31) + this.h) * 31) + this.f3632i) * 31;
            String str4 = this.f3634k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f3635l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f3640q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f3641r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((Float.floatToIntBits(this.C) + ((((((((((((((i15 + i10) * 31) + this.f3642s) * 31) + ((int) this.f3645w)) * 31) + this.f3647y) * 31) + this.f3648z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3626a);
        sb2.append(", ");
        sb2.append(this.f3627b);
        sb2.append(", ");
        sb2.append(this.f3640q);
        sb2.append(", ");
        sb2.append(this.f3641r);
        sb2.append(", ");
        sb2.append(this.f3634k);
        sb2.append(", ");
        sb2.append(this.f3633j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f3647y);
        sb2.append(", ");
        sb2.append(this.f3648z);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append("], [");
        sb2.append(this.J);
        sb2.append(", ");
        return a1.g.o(this.K, "])", sb2);
    }
}
