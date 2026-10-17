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
public final class w {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final w V = new w(new v());
    public static final String W = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);
    public static final String f4091a0 = Integer.toString(4, 36);
    public static final String f4092b0 = Integer.toString(5, 36);
    public static final String f4093c0 = Integer.toString(6, 36);
    public static final String f4094d0 = Integer.toString(7, 36);
    public static final String f4095e0;
    public static final String f4096f0;
    public static final String f4097g0;
    public static final String f4098h0;
    public static final String f4099i0;
    public static final String f4100j0;
    public static final String f4101k0;
    public static final String f4102l0;
    public static final String m0;
    public static final String f4103n0;
    public static final String f4104o0;
    public static final String f4105p0;
    public static final String f4106q0;
    public static final String f4107r0;
    public static final String f4108s0;
    public static final String f4109t0;
    public static final String f4110u0;
    public static final String f4111v0;
    public static final String f4112w0;
    public static final String f4113x0;
    public static final String f4114y0;
    public static final String f4115z0;
    public final int A;
    public final int B;
    public final int C;
    public final float D;
    public final int E;
    public final float F;
    public final byte[] G;
    public final int H;
    public final n I;
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
    public final String f4116a;
    public final String f4117b;
    public final e9.n0 f4118c;
    public final String d;
    public final int e;
    public final int f4119f;
    public final int f4120g;
    public final int h;
    public final int f4121i;
    public final int f4122j;
    public final String f4123k;
    public final t0 f4124l;
    public final String f4125m;
    public boolean f4126n;
    public long f4127o;
    public int f4128p;
    public String f4129q;
    public final String f4130r;
    public final String f4131s;
    public final int f4132t;
    public final int f4133u;
    public final List v;
    public final s f4134w;
    public final long f4135x;
    public final boolean f4136y;
    public final int f4137z;

    static {
        Integer.toString(8, 36);
        f4095e0 = Integer.toString(9, 36);
        f4096f0 = Integer.toString(10, 36);
        f4097g0 = Integer.toString(11, 36);
        f4098h0 = Integer.toString(12, 36);
        f4099i0 = Integer.toString(13, 36);
        f4100j0 = Integer.toString(14, 36);
        f4101k0 = Integer.toString(15, 36);
        f4102l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f4103n0 = Integer.toString(18, 36);
        f4104o0 = Integer.toString(19, 36);
        f4105p0 = Integer.toString(20, 36);
        f4106q0 = Integer.toString(21, 36);
        f4107r0 = Integer.toString(22, 36);
        f4108s0 = Integer.toString(23, 36);
        f4109t0 = Integer.toString(24, 36);
        f4110u0 = Integer.toString(25, 36);
        f4111v0 = Integer.toString(26, 36);
        f4112w0 = Integer.toString(27, 36);
        f4113x0 = Integer.toString(28, 36);
        f4114y0 = Integer.toString(29, 36);
        f4115z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
    }

    public w(v vVar) {
        boolean z10;
        String str;
        boolean z11;
        this.f4116a = vVar.f4064a;
        String T = e2.m0.T(vVar.d);
        this.d = T;
        if (vVar.f4066c.isEmpty() && vVar.f4065b != null) {
            this.f4118c = e9.n0.y(new a0(T, vVar.f4065b));
            this.f4117b = vVar.f4065b;
        } else if (!vVar.f4066c.isEmpty() && vVar.f4065b == null) {
            e9.n0 n0Var = vVar.f4066c;
            this.f4118c = n0Var;
            int size = n0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = n0Var.get(i10);
                    i10++;
                    a0 a0Var = (a0) obj;
                    if (TextUtils.equals(a0Var.f3690a, T)) {
                        str = a0Var.f3691b;
                        break;
                    }
                } else {
                    str = ((a0) n0Var.get(0)).f3691b;
                    break;
                }
            }
            this.f4117b = str;
        } else {
            if (!vVar.f4066c.isEmpty() || vVar.f4065b != null) {
                for (int i11 = 0; i11 < vVar.f4066c.size(); i11++) {
                    if (!((a0) vVar.f4066c.get(i11)).f3691b.equals(vVar.f4065b)) {
                    }
                }
                z10 = false;
                u6.p(z10);
                this.f4118c = vVar.f4066c;
                this.f4117b = vVar.f4065b;
            }
            z10 = true;
            u6.p(z10);
            this.f4118c = vVar.f4066c;
            this.f4117b = vVar.f4065b;
        }
        this.e = vVar.e;
        if (vVar.f4068g != 0 && (vVar.f4067f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u6.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f4119f = vVar.f4067f;
        this.f4120g = vVar.f4068g;
        int i12 = vVar.h;
        this.h = i12;
        int i13 = vVar.f4069i;
        this.f4121i = i13;
        this.f4122j = i13 != -1 ? i13 : i12;
        this.f4123k = vVar.f4070j;
        this.f4124l = vVar.f4071k;
        this.f4125m = vVar.f4072l;
        this.f4126n = vVar.f4073m;
        this.f4127o = vVar.f4074n;
        this.f4128p = vVar.f4076p;
        this.f4129q = vVar.f4075o;
        this.f4130r = vVar.f4077q;
        this.f4131s = vVar.f4078r;
        this.f4132t = vVar.f4079s;
        this.f4133u = vVar.f4080t;
        List list = vVar.f4081u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        s sVar = vVar.v;
        this.f4134w = sVar;
        this.f4135x = vVar.f4082w;
        this.f4136y = vVar.f4083x;
        this.f4137z = vVar.f4084y;
        this.A = vVar.f4085z;
        this.B = vVar.A;
        this.C = vVar.B;
        this.D = vVar.C;
        int i14 = vVar.D;
        this.E = i14 == -1 ? 0 : i14;
        float f7 = vVar.E;
        this.F = f7 == -1.0f ? 1.0f : f7;
        this.G = vVar.F;
        this.H = vVar.G;
        this.I = vVar.H;
        this.J = vVar.I;
        this.K = vVar.J;
        this.L = vVar.K;
        this.M = vVar.L;
        int i15 = vVar.M;
        this.N = i15 == -1 ? 0 : i15;
        int i16 = vVar.N;
        this.O = i16 != -1 ? i16 : 0;
        this.P = vVar.O;
        this.Q = vVar.P;
        this.R = vVar.Q;
        this.S = vVar.R;
        int i17 = vVar.S;
        if (i17 == 0 && sVar != null) {
            this.T = 1;
        } else {
            this.T = i17;
        }
    }

    public static String c(w wVar) {
        char c10;
        int i10;
        String str;
        String str2;
        String str3;
        if (wVar == null) {
            return "null";
        }
        int i11 = wVar.e;
        e9.n0 n0Var = wVar.f4118c;
        String str4 = wVar.d;
        int i12 = wVar.L;
        int i13 = wVar.K;
        int i14 = wVar.J;
        float f7 = wVar.D;
        n nVar = wVar.I;
        float f10 = wVar.F;
        int i15 = wVar.C;
        int i16 = wVar.B;
        int i17 = wVar.A;
        int i18 = wVar.f4137z;
        s sVar = wVar.f4134w;
        String str5 = wVar.f4123k;
        int i19 = wVar.f4122j;
        String str6 = wVar.f4125m;
        String str7 = wVar.f4130r;
        int i20 = wVar.f4119f;
        d9.l lVar = new d9.l(String.valueOf(','));
        StringBuilder u10 = a1.g.u("id=");
        u10.append(wVar.f4116a);
        u10.append(", mimeType=");
        u10.append(wVar.f4131s);
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
        if (sVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i21 = 0; i21 < sVar.d; i21++) {
                UUID uuid = sVar.f3982a[i21].f3933b;
                if (uuid.equals(m.f3830c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(m.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(m.f3831f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(m.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(m.f3829b)) {
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
        int i22 = g9.c.f10943a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str8 = e2.m0.f8254a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (nVar != null) {
            int i23 = nVar.f3848f;
            int i24 = nVar.e;
            if ((i24 != -1 && i23 != -1) || nVar.d()) {
                u10.append(", color=");
                if (nVar.d()) {
                    String b10 = n.b(nVar.f3845a);
                    String a2 = n.a(nVar.f3846b);
                    String c11 = n.c(nVar.f3847c);
                    String str9 = e2.m0.f8254a;
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
            lVar.a(u10, e9.s.x(n0Var, new aa.a(19)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str10 = e2.m0.f8254a;
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
            String str11 = e2.m0.f8254a;
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
            int i25 = wVar.f4120g;
            String str12 = e2.m0.f8254a;
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

    public final v a() {
        ?? obj = new Object();
        obj.f4064a = this.f4116a;
        obj.f4065b = this.f4117b;
        obj.f4066c = this.f4118c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f4067f = this.f4119f;
        obj.h = this.h;
        obj.f4069i = this.f4121i;
        obj.f4070j = this.f4123k;
        obj.f4071k = this.f4124l;
        obj.f4072l = this.f4125m;
        obj.f4077q = this.f4130r;
        obj.f4078r = this.f4131s;
        obj.f4079s = this.f4132t;
        obj.f4080t = this.f4133u;
        obj.f4081u = this.v;
        obj.v = this.f4134w;
        obj.f4082w = this.f4135x;
        obj.f4083x = this.f4136y;
        obj.f4084y = this.f4137z;
        obj.f4085z = this.A;
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
        obj.f4073m = this.f4126n;
        obj.f4074n = this.f4127o;
        obj.f4076p = this.f4128p;
        obj.f4075o = this.f4129q;
        return obj;
    }

    public final boolean b(w wVar) {
        List list = this.v;
        if (list.size() != wVar.v.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) wVar.v.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final w d(w wVar) {
        String str;
        String str2;
        s sVar;
        int i10;
        int i11;
        if (this == wVar) {
            return this;
        }
        int h = v0.h(this.f4131s);
        String str3 = wVar.f4116a;
        t0 t0Var = wVar.f4124l;
        e9.n0 n0Var = wVar.f4118c;
        int i12 = wVar.R;
        int i13 = wVar.S;
        String str4 = wVar.f4117b;
        if (str4 == null) {
            str4 = this.f4117b;
        }
        if (n0Var.isEmpty()) {
            n0Var = this.f4118c;
        }
        if ((h != 3 && h != 1) || (str = wVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = wVar.h;
        }
        int i15 = this.f4121i;
        if (i15 == -1) {
            i15 = wVar.f4121i;
        }
        String str5 = this.f4123k;
        if (str5 == null) {
            String w9 = e2.m0.w(h, wVar.f4123k);
            if (e2.m0.d0(w9).length == 1) {
                str5 = w9;
            }
        }
        String str6 = this.f4125m;
        if (str6 == null) {
            str6 = wVar.f4125m;
        }
        t0 t0Var2 = this.f4124l;
        if (t0Var2 != null) {
            t0Var = t0Var2.b(t0Var);
        }
        float f7 = this.D;
        if (f7 == -1.0f && h == 2) {
            f7 = wVar.D;
        }
        int i16 = this.e | wVar.e;
        e9.n0 n0Var2 = n0Var;
        int i17 = wVar.f4119f | this.f4119f;
        s sVar2 = wVar.f4134w;
        ArrayList arrayList = new ArrayList();
        if (sVar2 != null) {
            String str7 = sVar2.f3984c;
            r[] rVarArr = sVar2.f3982a;
            int length = rVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                r rVar = rVarArr[i19];
                int i20 = length;
                if (rVar.e != null) {
                    arrayList.add(rVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        s sVar3 = this.f4134w;
        if (sVar3 != null) {
            if (str2 == null) {
                str2 = sVar3.f3984c;
            }
            int size = arrayList.size();
            r[] rVarArr2 = sVar3.f3982a;
            String str8 = str2;
            int length2 = rVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                r rVar2 = rVarArr2[i22];
                int i23 = length2;
                if (rVar2.e != null) {
                    UUID uuid = rVar2.f3933b;
                    i11 = i12;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((r) arrayList.get(i24)).f3933b.equals(uuid)) {
                                break;
                            }
                            i24++;
                            size = i10;
                        } else {
                            i10 = size;
                            arrayList.add(rVar2);
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
            sVar = null;
        } else {
            sVar = new s(str2, arrayList);
        }
        v a2 = a();
        a2.f4064a = str3;
        a2.f4065b = str4;
        a2.f4066c = e9.n0.u(n0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f4067f = i17;
        a2.h = i14;
        a2.f4069i = i15;
        a2.f4070j = str5;
        a2.f4071k = t0Var;
        a2.f4072l = str6;
        a2.v = sVar;
        a2.C = f7;
        a2.Q = i25;
        a2.R = i13;
        return new w(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            int i11 = this.U;
            if ((i11 == 0 || (i10 = wVar.U) == 0 || i11 == i10) && this.e == wVar.e && this.f4119f == wVar.f4119f && this.f4120g == wVar.f4120g && this.h == wVar.h && this.f4121i == wVar.f4121i && this.f4132t == wVar.f4132t && this.f4135x == wVar.f4135x && this.f4137z == wVar.f4137z && this.A == wVar.A && this.B == wVar.B && this.C == wVar.C && this.E == wVar.E && this.H == wVar.H && this.J == wVar.J && this.K == wVar.K && this.L == wVar.L && this.M == wVar.M && this.N == wVar.N && this.O == wVar.O && this.P == wVar.P && this.R == wVar.R && this.S == wVar.S && this.T == wVar.T && Float.compare(this.D, wVar.D) == 0 && Float.compare(this.F, wVar.F) == 0 && Objects.equals(this.f4116a, wVar.f4116a) && Objects.equals(this.f4117b, wVar.f4117b) && this.f4118c.equals(wVar.f4118c) && Objects.equals(this.f4123k, wVar.f4123k) && Objects.equals(this.f4125m, wVar.f4125m) && Objects.equals(this.f4130r, wVar.f4130r) && Objects.equals(this.f4131s, wVar.f4131s) && Objects.equals(this.d, wVar.d) && Arrays.equals(this.G, wVar.G) && Objects.equals(this.f4124l, wVar.f4124l) && Objects.equals(this.I, wVar.I) && Objects.equals(this.f4134w, wVar.f4134w) && b(wVar)) {
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
            String str = this.f4116a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f4117b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f4118c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode8 + hashCode3) * 31) + this.e) * 31) + this.f4119f) * 31) + this.f4120g) * 31) + this.h) * 31) + this.f4121i) * 31;
            String str4 = this.f4123k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            t0 t0Var = this.f4124l;
            if (t0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = t0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f4125m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f4130r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i16 = (i15 + hashCode7) * 31;
            String str7 = this.f4131s;
            if (str7 != null) {
                i10 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i16 + i10) * 31) + this.f4132t) * 31) + ((int) this.f4135x)) * 31) + this.f4137z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f4116a);
        sb2.append(", ");
        sb2.append(this.f4117b);
        sb2.append(", ");
        sb2.append(this.f4130r);
        sb2.append(", ");
        sb2.append(this.f4131s);
        sb2.append(", ");
        sb2.append(this.f4123k);
        sb2.append(", ");
        sb2.append(this.f4122j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f4137z);
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
