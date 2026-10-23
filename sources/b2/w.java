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
    public static final String f4095a0 = Integer.toString(4, 36);
    public static final String f4096b0 = Integer.toString(5, 36);
    public static final String f4097c0 = Integer.toString(6, 36);
    public static final String f4098d0 = Integer.toString(7, 36);
    public static final String f4099e0;
    public static final String f4100f0;
    public static final String f4101g0;
    public static final String f4102h0;
    public static final String f4103i0;
    public static final String f4104j0;
    public static final String f4105k0;
    public static final String f4106l0;
    public static final String m0;
    public static final String f4107n0;
    public static final String f4108o0;
    public static final String f4109p0;
    public static final String f4110q0;
    public static final String f4111r0;
    public static final String f4112s0;
    public static final String f4113t0;
    public static final String f4114u0;
    public static final String f4115v0;
    public static final String f4116w0;
    public static final String f4117x0;
    public static final String f4118y0;
    public static final String f4119z0;
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
    public final String f4120a;
    public final String f4121b;
    public final e9.n0 f4122c;
    public final String d;
    public final int e;
    public final int f4123f;
    public final int f4124g;
    public final int h;
    public final int f4125i;
    public final int f4126j;
    public final String f4127k;
    public final t0 f4128l;
    public final String f4129m;
    public boolean f4130n;
    public long f4131o;
    public int f4132p;
    public String f4133q;
    public final String f4134r;
    public final String f4135s;
    public final int f4136t;
    public final int f4137u;
    public final List v;
    public final s f4138w;
    public final long f4139x;
    public final boolean f4140y;
    public final int f4141z;

    static {
        Integer.toString(8, 36);
        f4099e0 = Integer.toString(9, 36);
        f4100f0 = Integer.toString(10, 36);
        f4101g0 = Integer.toString(11, 36);
        f4102h0 = Integer.toString(12, 36);
        f4103i0 = Integer.toString(13, 36);
        f4104j0 = Integer.toString(14, 36);
        f4105k0 = Integer.toString(15, 36);
        f4106l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f4107n0 = Integer.toString(18, 36);
        f4108o0 = Integer.toString(19, 36);
        f4109p0 = Integer.toString(20, 36);
        f4110q0 = Integer.toString(21, 36);
        f4111r0 = Integer.toString(22, 36);
        f4112s0 = Integer.toString(23, 36);
        f4113t0 = Integer.toString(24, 36);
        f4114u0 = Integer.toString(25, 36);
        f4115v0 = Integer.toString(26, 36);
        f4116w0 = Integer.toString(27, 36);
        f4117x0 = Integer.toString(28, 36);
        f4118y0 = Integer.toString(29, 36);
        f4119z0 = Integer.toString(30, 36);
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
        this.f4120a = vVar.f4068a;
        String T = e2.m0.T(vVar.d);
        this.d = T;
        if (vVar.f4070c.isEmpty() && vVar.f4069b != null) {
            this.f4122c = e9.n0.y(new a0(T, vVar.f4069b));
            this.f4121b = vVar.f4069b;
        } else if (!vVar.f4070c.isEmpty() && vVar.f4069b == null) {
            e9.n0 n0Var = vVar.f4070c;
            this.f4122c = n0Var;
            int size = n0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = n0Var.get(i10);
                    i10++;
                    a0 a0Var = (a0) obj;
                    if (TextUtils.equals(a0Var.f3694a, T)) {
                        str = a0Var.f3695b;
                        break;
                    }
                } else {
                    str = ((a0) n0Var.get(0)).f3695b;
                    break;
                }
            }
            this.f4121b = str;
        } else {
            if (!vVar.f4070c.isEmpty() || vVar.f4069b != null) {
                for (int i11 = 0; i11 < vVar.f4070c.size(); i11++) {
                    if (!((a0) vVar.f4070c.get(i11)).f3695b.equals(vVar.f4069b)) {
                    }
                }
                z10 = false;
                u6.p(z10);
                this.f4122c = vVar.f4070c;
                this.f4121b = vVar.f4069b;
            }
            z10 = true;
            u6.p(z10);
            this.f4122c = vVar.f4070c;
            this.f4121b = vVar.f4069b;
        }
        this.e = vVar.e;
        if (vVar.f4072g != 0 && (vVar.f4071f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u6.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f4123f = vVar.f4071f;
        this.f4124g = vVar.f4072g;
        int i12 = vVar.h;
        this.h = i12;
        int i13 = vVar.f4073i;
        this.f4125i = i13;
        this.f4126j = i13 != -1 ? i13 : i12;
        this.f4127k = vVar.f4074j;
        this.f4128l = vVar.f4075k;
        this.f4129m = vVar.f4076l;
        this.f4130n = vVar.f4077m;
        this.f4131o = vVar.f4078n;
        this.f4132p = vVar.f4080p;
        this.f4133q = vVar.f4079o;
        this.f4134r = vVar.f4081q;
        this.f4135s = vVar.f4082r;
        this.f4136t = vVar.f4083s;
        this.f4137u = vVar.f4084t;
        List list = vVar.f4085u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        s sVar = vVar.v;
        this.f4138w = sVar;
        this.f4139x = vVar.f4086w;
        this.f4140y = vVar.f4087x;
        this.f4141z = vVar.f4088y;
        this.A = vVar.f4089z;
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
        int i10;
        String str;
        String str2;
        String str3;
        if (wVar == null) {
            return "null";
        }
        int i11 = wVar.e;
        e9.n0 n0Var = wVar.f4122c;
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
        int i18 = wVar.f4141z;
        s sVar = wVar.f4138w;
        String str5 = wVar.f4127k;
        int i19 = wVar.f4126j;
        String str6 = wVar.f4129m;
        String str7 = wVar.f4134r;
        int i20 = wVar.f4123f;
        d9.l lVar = new d9.l(String.valueOf(','), 0);
        StringBuilder u10 = a1.g.u("id=");
        u10.append(wVar.f4120a);
        u10.append(", mimeType=");
        u10.append(wVar.f4135s);
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
                UUID uuid = sVar.f3986a[i21].f3937b;
                if (uuid.equals(m.f3834c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(m.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(m.f3835f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(m.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(m.f3833b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            u10.append(", drm=[");
            lVar.a(u10, linkedHashSet.iterator());
            u10.append(']');
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
        int i22 = g9.c.f10961a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str8 = e2.m0.f8259a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (nVar != null) {
            int i23 = nVar.f3852f;
            int i24 = nVar.e;
            if ((i24 != -1 && i23 != -1) || nVar.d()) {
                u10.append(", color=");
                if (nVar.d()) {
                    String b10 = n.b(nVar.f3849a);
                    String a2 = n.a(nVar.f3850b);
                    String c10 = n.c(nVar.f3851c);
                    String str9 = e2.m0.f8259a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c10;
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
            lVar.a(u10, e9.s.x(n0Var, new aa.a(21)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str10 = e2.m0.f8259a;
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
            String str11 = e2.m0.f8259a;
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
            int i25 = wVar.f4124g;
            String str12 = e2.m0.f8259a;
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
        obj.f4068a = this.f4120a;
        obj.f4069b = this.f4121b;
        obj.f4070c = this.f4122c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f4071f = this.f4123f;
        obj.h = this.h;
        obj.f4073i = this.f4125i;
        obj.f4074j = this.f4127k;
        obj.f4075k = this.f4128l;
        obj.f4076l = this.f4129m;
        obj.f4081q = this.f4134r;
        obj.f4082r = this.f4135s;
        obj.f4083s = this.f4136t;
        obj.f4084t = this.f4137u;
        obj.f4085u = this.v;
        obj.v = this.f4138w;
        obj.f4086w = this.f4139x;
        obj.f4087x = this.f4140y;
        obj.f4088y = this.f4141z;
        obj.f4089z = this.A;
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
        obj.f4077m = this.f4130n;
        obj.f4078n = this.f4131o;
        obj.f4080p = this.f4132p;
        obj.f4079o = this.f4133q;
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
        int h = v0.h(this.f4135s);
        String str3 = wVar.f4120a;
        t0 t0Var = wVar.f4128l;
        e9.n0 n0Var = wVar.f4122c;
        int i12 = wVar.R;
        int i13 = wVar.S;
        String str4 = wVar.f4121b;
        if (str4 == null) {
            str4 = this.f4121b;
        }
        if (n0Var.isEmpty()) {
            n0Var = this.f4122c;
        }
        if ((h != 3 && h != 1) || (str = wVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = wVar.h;
        }
        int i15 = this.f4125i;
        if (i15 == -1) {
            i15 = wVar.f4125i;
        }
        String str5 = this.f4127k;
        if (str5 == null) {
            String w9 = e2.m0.w(h, wVar.f4127k);
            if (e2.m0.d0(w9).length == 1) {
                str5 = w9;
            }
        }
        String str6 = this.f4129m;
        if (str6 == null) {
            str6 = wVar.f4129m;
        }
        t0 t0Var2 = this.f4128l;
        if (t0Var2 != null) {
            t0Var = t0Var2.b(t0Var);
        }
        float f7 = this.D;
        if (f7 == -1.0f && h == 2) {
            f7 = wVar.D;
        }
        int i16 = this.e | wVar.e;
        e9.n0 n0Var2 = n0Var;
        int i17 = wVar.f4123f | this.f4123f;
        s sVar2 = wVar.f4138w;
        ArrayList arrayList = new ArrayList();
        if (sVar2 != null) {
            String str7 = sVar2.f3988c;
            r[] rVarArr = sVar2.f3986a;
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
        s sVar3 = this.f4138w;
        if (sVar3 != null) {
            if (str2 == null) {
                str2 = sVar3.f3988c;
            }
            int size = arrayList.size();
            r[] rVarArr2 = sVar3.f3986a;
            String str8 = str2;
            int length2 = rVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                r rVar2 = rVarArr2[i22];
                int i23 = length2;
                if (rVar2.e != null) {
                    UUID uuid = rVar2.f3937b;
                    i11 = i12;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((r) arrayList.get(i24)).f3937b.equals(uuid)) {
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
        a2.f4068a = str3;
        a2.f4069b = str4;
        a2.f4070c = e9.n0.u(n0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f4071f = i17;
        a2.h = i14;
        a2.f4073i = i15;
        a2.f4074j = str5;
        a2.f4075k = t0Var;
        a2.f4076l = str6;
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
            if ((i11 == 0 || (i10 = wVar.U) == 0 || i11 == i10) && this.e == wVar.e && this.f4123f == wVar.f4123f && this.f4124g == wVar.f4124g && this.h == wVar.h && this.f4125i == wVar.f4125i && this.f4136t == wVar.f4136t && this.f4139x == wVar.f4139x && this.f4141z == wVar.f4141z && this.A == wVar.A && this.B == wVar.B && this.C == wVar.C && this.E == wVar.E && this.H == wVar.H && this.J == wVar.J && this.K == wVar.K && this.L == wVar.L && this.M == wVar.M && this.N == wVar.N && this.O == wVar.O && this.P == wVar.P && this.R == wVar.R && this.S == wVar.S && this.T == wVar.T && Float.compare(this.D, wVar.D) == 0 && Float.compare(this.F, wVar.F) == 0 && Objects.equals(this.f4120a, wVar.f4120a) && Objects.equals(this.f4121b, wVar.f4121b) && this.f4122c.equals(wVar.f4122c) && Objects.equals(this.f4127k, wVar.f4127k) && Objects.equals(this.f4129m, wVar.f4129m) && Objects.equals(this.f4134r, wVar.f4134r) && Objects.equals(this.f4135s, wVar.f4135s) && Objects.equals(this.d, wVar.d) && Arrays.equals(this.G, wVar.G) && Objects.equals(this.f4128l, wVar.f4128l) && Objects.equals(this.I, wVar.I) && Objects.equals(this.f4138w, wVar.f4138w) && b(wVar)) {
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
            String str = this.f4120a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f4121b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f4122c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode8 + hashCode3) * 31) + this.e) * 31) + this.f4123f) * 31) + this.f4124g) * 31) + this.h) * 31) + this.f4125i) * 31;
            String str4 = this.f4127k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            t0 t0Var = this.f4128l;
            if (t0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = t0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f4129m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f4134r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i16 = (i15 + hashCode7) * 31;
            String str7 = this.f4135s;
            if (str7 != null) {
                i10 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i16 + i10) * 31) + this.f4136t) * 31) + ((int) this.f4139x)) * 31) + this.f4141z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f4120a);
        sb2.append(", ");
        sb2.append(this.f4121b);
        sb2.append(", ");
        sb2.append(this.f4134r);
        sb2.append(", ");
        sb2.append(this.f4135s);
        sb2.append(", ");
        sb2.append(this.f4127k);
        sb2.append(", ");
        sb2.append(this.f4126j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f4141z);
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
