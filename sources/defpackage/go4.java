package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
public final class go4 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final go4 Z = new go4(new fo4());
    public static final String a0 = "0";
    public static final String b0 = "1";
    public static final String c0 = "2";
    public static final String d0 = "3";
    public static final String e0 = "4";
    public static final String f0 = "5";
    public static final String g0 = "6";
    public static final String h0 = "7";
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final float F;
    public final int G;
    public final boolean H;
    public final float I;
    public final byte[] J;
    public final int K;
    public final tm2 L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public int Y;
    public final String a;
    public final String b;
    public final mo5 c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final nf7 m;
    public final String n;
    public boolean o;
    public long p;
    public int q;
    public String r;
    public final String s;
    public final String t;
    public final int u;
    public final int v;
    public final List w;
    public final as3 x;
    public final long y;
    public final boolean z;

    static {
        String str = hac.a;
        i0 = "9";
        j0 = "a";
        k0 = "b";
        l0 = "c";
        m0 = "d";
        n0 = "e";
        o0 = "f";
        p0 = "g";
        q0 = "h";
        r0 = "i";
        s0 = "j";
        t0 = "k";
        u0 = "l";
        v0 = "m";
        w0 = "n";
        x0 = "o";
        y0 = "p";
        z0 = "q";
        A0 = "r";
        B0 = "s";
        C0 = "t";
        D0 = "u";
        E0 = "v";
        F0 = "w";
        G0 = "x";
        H0 = "y";
        I0 = "z";
        J0 = "10";
        K0 = "11";
        L0 = "12";
        M0 = "13";
        N0 = "14";
        O0 = "15";
    }

    public go4(fo4 fo4Var) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        this.a = fo4Var.a;
        String U = hac.U(fo4Var.d);
        this.d = U;
        if (fo4Var.c.isEmpty() && fo4Var.b != null) {
            this.c = mo5.u(new sy5(U, fo4Var.b));
            this.b = fo4Var.b;
        } else if (!fo4Var.c.isEmpty() && fo4Var.b == null) {
            mo5 mo5Var = fo4Var.c;
            this.c = mo5Var;
            int size = mo5Var.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = mo5Var.get(i);
                    i++;
                    sy5 sy5Var = (sy5) obj;
                    if (TextUtils.equals(sy5Var.a, U)) {
                        str = sy5Var.b;
                        break;
                    }
                } else {
                    str = ((sy5) mo5Var.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!fo4Var.c.isEmpty() || fo4Var.b != null) {
                for (int i2 = 0; i2 < fo4Var.c.size(); i2++) {
                    if (!((sy5) fo4Var.c.get(i2)).b.equals(fo4Var.b)) {
                    }
                }
                z = false;
                jte.p(z);
                this.c = fo4Var.c;
                this.b = fo4Var.b;
            }
            z = true;
            jte.p(z);
            this.c = fo4Var.c;
            this.b = fo4Var.b;
        }
        this.e = fo4Var.e;
        if (fo4Var.h != 0 && (fo4Var.f & 32768) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        jte.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = fo4Var.f;
        this.g = fo4Var.g;
        this.h = fo4Var.h;
        int i3 = fo4Var.i;
        this.i = i3;
        int i4 = fo4Var.j;
        this.j = i4;
        this.k = i4 != -1 ? i4 : i3;
        this.l = fo4Var.k;
        this.m = fo4Var.l;
        this.n = fo4Var.m;
        this.o = fo4Var.n;
        this.p = fo4Var.o;
        this.q = fo4Var.q;
        this.r = fo4Var.p;
        this.s = fo4Var.r;
        this.t = fo4Var.s;
        this.u = fo4Var.t;
        this.v = fo4Var.u;
        List list = fo4Var.v;
        this.w = list == null ? Collections.EMPTY_LIST : list;
        as3 as3Var = fo4Var.w;
        this.x = as3Var;
        this.y = fo4Var.x;
        this.z = fo4Var.y;
        this.A = fo4Var.z;
        this.B = fo4Var.A;
        this.C = fo4Var.B;
        this.D = fo4Var.C;
        this.E = fo4Var.D;
        this.F = fo4Var.E;
        int i5 = fo4Var.F;
        this.G = i5 == -1 ? 0 : i5;
        this.H = fo4Var.G;
        float f = fo4Var.H;
        this.I = f == -1.0f ? 1.0f : f;
        this.J = fo4Var.I;
        this.K = fo4Var.J;
        this.L = fo4Var.K;
        this.M = fo4Var.L;
        int i6 = fo4Var.M;
        this.N = i6;
        int i7 = fo4Var.N;
        this.O = i7;
        if (i6 != -1 && i7 != -1) {
            if (Integer.bitCount(i7) == i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                dq9.m(pwe.a("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i6), Integer.valueOf(i7)));
                throw null;
            }
        }
        this.P = fo4Var.O;
        this.Q = fo4Var.P;
        int i8 = fo4Var.Q;
        this.R = i8 == -1 ? 0 : i8;
        int i9 = fo4Var.R;
        this.S = i9 != -1 ? i9 : 0;
        this.T = fo4Var.S;
        this.U = fo4Var.T;
        this.V = fo4Var.U;
        this.W = fo4Var.V;
        int i10 = fo4Var.W;
        if (i10 == 0 && as3Var != null) {
            this.X = 1;
        } else {
            this.X = i10;
        }
    }

    public static String c(go4 go4Var) {
        float f;
        int i;
        String str;
        String str2;
        String str3;
        float f2;
        if (go4Var == null) {
            return "null";
        }
        int i2 = go4Var.e;
        mo5 mo5Var = go4Var.c;
        String str4 = go4Var.d;
        int i3 = go4Var.P;
        int i4 = go4Var.O;
        int i5 = go4Var.N;
        int i6 = go4Var.M;
        int i7 = go4Var.G;
        float f3 = go4Var.F;
        int i8 = go4Var.C;
        tm2 tm2Var = go4Var.L;
        float f4 = go4Var.I;
        int i9 = go4Var.E;
        int i10 = go4Var.D;
        int i11 = go4Var.B;
        int i12 = go4Var.A;
        as3 as3Var = go4Var.x;
        String str5 = go4Var.l;
        float f5 = go4Var.g;
        int i13 = go4Var.k;
        String str6 = go4Var.n;
        String str7 = go4Var.s;
        int i14 = go4Var.f;
        jw5 jw5Var = new jw5(String.valueOf(','), (byte) 0);
        StringBuilder s = td4.s("id=");
        s.append(go4Var.a);
        s.append(", mimeType=");
        s.append(go4Var.t);
        if (str7 != null) {
            s.append(", container=");
            s.append(str7);
        }
        if (str6 != null) {
            s.append(", primaryGroupId=");
            s.append(str6);
        }
        if (i13 != -1) {
            s.append(", bitrate=");
            s.append(i13);
        }
        float f6 = -1.0f;
        if (f5 != -1.0f) {
            s.append(", selectionPriority=");
            s.append(f5);
        }
        if (str5 != null) {
            s.append(", codecs=");
            s.append(str5);
        }
        if (as3Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < as3Var.d) {
                UUID uuid = as3Var.a[i15].b;
                if (uuid.equals(n61.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(n61.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(n61.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(n61.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(n61.b)) {
                    linkedHashSet.add("universal");
                } else {
                    f2 = f6;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i15++;
                    f6 = f2;
                }
                f2 = f6;
                i15++;
                f6 = f2;
            }
            f = f6;
            s.append(", drm=[");
            jw5Var.a(s, linkedHashSet.iterator());
            s.append(']');
        } else {
            f = -1.0f;
        }
        if (i12 != -1 && i11 != -1) {
            s.append(", res=");
            s.append(i12);
            s.append("x");
            s.append(i11);
        }
        if (i10 != -1 && i9 != -1) {
            s.append(", decRes=");
            s.append(i10);
            s.append("x");
            s.append(i9);
        }
        double d = f4;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d) {
            Double.isNaN(d);
            s.append(", par=");
            Object[] objArr = {Float.valueOf(f4)};
            String str8 = hac.a;
            s.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (tm2Var != null) {
            int i16 = tm2Var.f;
            int i17 = tm2Var.e;
            if ((i17 != -1 && i16 != -1) || tm2Var.d()) {
                s.append(", color=");
                if (tm2Var.d()) {
                    String b = tm2.b(tm2Var.a);
                    String a = tm2.a(tm2Var.b);
                    String c = tm2.c(tm2Var.c);
                    String str9 = hac.a;
                    Locale locale = Locale.US;
                    str2 = b10.i(b, "/", a, "/", c);
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i17 != -1 && i16 != -1) {
                    str3 = td4.n(i17, i16, "/");
                } else {
                    str3 = "NA/NA";
                }
                s.append(str2 + "/" + str3);
            }
        }
        if (i8 != -1) {
            s.append(", pixelFormat=");
            s.append(i8);
        }
        if (f3 != f) {
            s.append(", fps=");
            s.append(f3);
        }
        if (i7 != 0) {
            s.append(", rotation=");
            s.append(i7);
        }
        if (go4Var.H) {
            s.append(", mirrorHorizontal");
        }
        if (i6 != -1) {
            s.append(", maxSubLayers=");
            s.append(i6);
        }
        if (i5 != -1) {
            s.append(", channels=");
            s.append(i5);
        }
        if (i4 != -1) {
            s.append(", channel_mask=");
            s.append(i4);
        }
        if (i3 != -1) {
            s.append(", sample_rate=");
            s.append(i3);
        }
        if (str4 != null) {
            s.append(", language=");
            s.append(str4);
        }
        if (!mo5Var.isEmpty()) {
            s.append(", labels=[");
            jw5Var.a(s, wpe.b(mo5Var, new o41((byte) 7)).iterator());
            s.append("]");
        }
        if (i2 != 0) {
            s.append(", selectionFlags=[");
            String str10 = hac.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            jw5Var.a(s, arrayList.iterator());
            s.append("]");
        }
        if (i14 != 0) {
            s.append(", roleFlags=[");
            String str11 = hac.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i14;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            jw5Var.a(s, arrayList2.iterator());
            s.append("]");
        } else {
            i = i14;
        }
        if ((i & 32768) != 0) {
            s.append(", auxiliaryTrackType=");
            int i18 = go4Var.h;
            String str12 = hac.a;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 == 4) {
                                str = "depth metadata";
                            } else {
                                dq9.m("Unsupported auxiliary track type");
                                return null;
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
            s.append(str);
        }
        return s.toString();
    }

    public final fo4 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
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
        obj.T = this.U;
        obj.U = this.V;
        obj.V = this.W;
        obj.W = this.X;
        obj.n = this.o;
        obj.o = this.p;
        obj.q = this.q;
        obj.p = this.r;
        return obj;
    }

    public final boolean b(go4 go4Var) {
        List list = this.w;
        if (list.size() != go4Var.w.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) go4Var.w.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final go4 d(go4 go4Var) {
        go4 go4Var2;
        String str;
        mo5 mo5Var;
        String str2;
        as3 as3Var;
        int i;
        float f;
        if (this == go4Var) {
            return this;
        }
        int h = wf7.h(this.t);
        String str3 = go4Var.a;
        float f2 = go4Var.g;
        int i2 = go4Var.V;
        int i3 = go4Var.W;
        String str4 = go4Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (!go4Var.c.isEmpty()) {
            go4Var2 = go4Var;
        } else {
            go4Var2 = this;
        }
        mo5 mo5Var2 = go4Var2.c;
        if ((h != 3 && h != 1) || (str = go4Var.d) == null) {
            str = this.d;
        }
        int i4 = this.i;
        if (i4 == -1) {
            i4 = go4Var.i;
        }
        int i5 = this.j;
        if (i5 == -1) {
            i5 = go4Var.j;
        }
        String str5 = this.l;
        if (str5 == null) {
            String w = hac.w(h, go4Var.l);
            if (hac.e0(w).length == 1) {
                str5 = w;
            }
        }
        String str6 = this.n;
        if (str6 == null) {
            str6 = go4Var.n;
        }
        nf7 nf7Var = go4Var.m;
        nf7 nf7Var2 = this.m;
        if (nf7Var2 != null) {
            nf7Var = nf7Var2.b(nf7Var);
        }
        float f3 = this.F;
        if (f3 == -1.0f) {
            mo5Var = mo5Var2;
            if (h == 2) {
                f3 = go4Var.F;
            }
        } else {
            mo5Var = mo5Var2;
        }
        int i6 = this.e | go4Var.e;
        int i7 = this.f | go4Var.f;
        as3 as3Var2 = go4Var.x;
        ArrayList arrayList = new ArrayList();
        if (as3Var2 != null) {
            String str7 = as3Var2.c;
            zr3[] zr3VarArr = as3Var2.a;
            int length = zr3VarArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8;
                zr3 zr3Var = zr3VarArr[i9];
                int i10 = length;
                if (zr3Var.e != null) {
                    arrayList.add(zr3Var);
                }
                i8 = i9 + 1;
                length = i10;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        as3 as3Var3 = this.x;
        if (as3Var3 != null) {
            if (str2 == null) {
                str2 = as3Var3.c;
            }
            int size = arrayList.size();
            zr3[] zr3VarArr2 = as3Var3.a;
            String str8 = str2;
            int length2 = zr3VarArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11;
                zr3 zr3Var2 = zr3VarArr2[i12];
                int i13 = length2;
                if (zr3Var2.e != null) {
                    UUID uuid = zr3Var2.b;
                    f = f3;
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            i = size;
                            if (!((zr3) arrayList.get(i14)).b.equals(uuid)) {
                                i14++;
                                size = i;
                            }
                        } else {
                            i = size;
                            arrayList.add(zr3Var2);
                            break;
                        }
                    }
                } else {
                    i = size;
                    f = f3;
                }
                i11 = i12 + 1;
                length2 = i13;
                f3 = f;
                size = i;
            }
            str2 = str8;
        }
        float f4 = f3;
        if (arrayList.isEmpty()) {
            as3Var = null;
        } else {
            as3Var = new as3(str2, arrayList);
        }
        fo4 a = a();
        a.a = str3;
        a.b = str4;
        a.c = mo5.q(mo5Var);
        a.d = str;
        a.e = i6;
        a.f = i7;
        a.g = f2;
        a.i = i4;
        a.j = i5;
        a.k = str5;
        a.l = nf7Var;
        a.m = str6;
        a.w = as3Var;
        a.a(f4);
        a.U = i2;
        a.V = i3;
        return new go4(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && go4.class == obj.getClass()) {
            go4 go4Var = (go4) obj;
            int i2 = this.Y;
            if ((i2 == 0 || (i = go4Var.Y) == 0 || i2 == i) && this.e == go4Var.e && this.f == go4Var.f && this.h == go4Var.h && this.i == go4Var.i && this.j == go4Var.j && this.u == go4Var.u && this.y == go4Var.y && this.A == go4Var.A && this.B == go4Var.B && this.C == go4Var.C && this.D == go4Var.D && this.E == go4Var.E && this.G == go4Var.G && this.H == go4Var.H && this.K == go4Var.K && this.M == go4Var.M && this.N == go4Var.N && this.O == go4Var.O && this.P == go4Var.P && this.Q == go4Var.Q && this.R == go4Var.R && this.S == go4Var.S && this.T == go4Var.T && this.V == go4Var.V && this.W == go4Var.W && this.X == go4Var.X && Float.compare(this.F, go4Var.F) == 0 && Float.compare(this.g, go4Var.g) == 0 && Float.compare(this.I, go4Var.I) == 0 && Objects.equals(this.a, go4Var.a) && Objects.equals(this.b, go4Var.b) && this.c.equals(go4Var.c) && Objects.equals(this.l, go4Var.l) && Objects.equals(this.n, go4Var.n) && Objects.equals(this.s, go4Var.s) && Objects.equals(this.t, go4Var.t) && Objects.equals(this.d, go4Var.d) && Arrays.equals(this.J, go4Var.J) && Objects.equals(this.m, go4Var.m) && Objects.equals(this.L, go4Var.L) && Objects.equals(this.x, go4Var.x) && b(go4Var)) {
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
        int i = this.Y;
        if (i == 0) {
            int i2 = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (527 + hashCode) * 31;
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.c.hashCode() + ((i3 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int floatToIntBits = (((((((Float.floatToIntBits(this.g) + ((((((hashCode8 + hashCode3) * 31) + this.e) * 31) + this.f) * 31)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
            String str4 = this.l;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i4 = (floatToIntBits + hashCode4) * 31;
            nf7 nf7Var = this.m;
            if (nf7Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = nf7Var.hashCode();
            }
            int i5 = (i4 + hashCode5) * 961;
            String str5 = this.n;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str6 = this.s;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            String str7 = this.t;
            if (str7 != null) {
                i2 = str7.hashCode();
            }
            int floatToIntBits2 = ((((((((((((((((((((((((Float.floatToIntBits(this.I) + ((((((Float.floatToIntBits(this.F) + ((((((((((((((((i7 + i2) * 31) + this.u) * 31) + ((int) this.y)) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31)) * 31) + this.G) * 31) + (this.H ? 1 : 0)) * 31)) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.V) * 31) + this.W) * 31) + this.X;
            this.Y = floatToIntBits2;
            return floatToIntBits2;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.A);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.F);
        sb.append(", ");
        sb.append(this.L);
        sb.append("], [");
        sb.append(this.N);
        sb.append(", ");
        sb.append(this.O);
        sb.append(", ");
        return hg9.k(sb, this.P, "])");
    }
}
