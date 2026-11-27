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
public final class ko4 {
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
    public static final ko4 Z = new ko4(new jo4());
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
    public final bm2 L;
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
    public final po5 c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final uf7 m;
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
    public final hr3 x;
    public final long y;
    public final boolean z;

    static {
        String str = gcc.a;
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

    public ko4(jo4 jo4Var) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        this.a = jo4Var.a;
        String U = gcc.U(jo4Var.d);
        this.d = U;
        if (jo4Var.c.isEmpty() && jo4Var.b != null) {
            this.c = po5.u(new xy5(U, jo4Var.b));
            this.b = jo4Var.b;
        } else if (!jo4Var.c.isEmpty() && jo4Var.b == null) {
            po5 po5Var = jo4Var.c;
            this.c = po5Var;
            int size = po5Var.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = po5Var.get(i);
                    i++;
                    xy5 xy5Var = (xy5) obj;
                    if (TextUtils.equals(xy5Var.a, U)) {
                        str = xy5Var.b;
                        break;
                    }
                } else {
                    str = ((xy5) po5Var.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!jo4Var.c.isEmpty() || jo4Var.b != null) {
                for (int i2 = 0; i2 < jo4Var.c.size(); i2++) {
                    if (!((xy5) jo4Var.c.get(i2)).b.equals(jo4Var.b)) {
                    }
                }
                z = false;
                yve.p(z);
                this.c = jo4Var.c;
                this.b = jo4Var.b;
            }
            z = true;
            yve.p(z);
            this.c = jo4Var.c;
            this.b = jo4Var.b;
        }
        this.e = jo4Var.e;
        if (jo4Var.h != 0 && (jo4Var.f & 32768) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        yve.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = jo4Var.f;
        this.g = jo4Var.g;
        this.h = jo4Var.h;
        int i3 = jo4Var.i;
        this.i = i3;
        int i4 = jo4Var.j;
        this.j = i4;
        this.k = i4 != -1 ? i4 : i3;
        this.l = jo4Var.k;
        this.m = jo4Var.l;
        this.n = jo4Var.m;
        this.o = jo4Var.n;
        this.p = jo4Var.o;
        this.q = jo4Var.q;
        this.r = jo4Var.p;
        this.s = jo4Var.r;
        this.t = jo4Var.s;
        this.u = jo4Var.t;
        this.v = jo4Var.u;
        List list = jo4Var.v;
        this.w = list == null ? Collections.EMPTY_LIST : list;
        hr3 hr3Var = jo4Var.w;
        this.x = hr3Var;
        this.y = jo4Var.x;
        this.z = jo4Var.y;
        this.A = jo4Var.z;
        this.B = jo4Var.A;
        this.C = jo4Var.B;
        this.D = jo4Var.C;
        this.E = jo4Var.D;
        this.F = jo4Var.E;
        int i5 = jo4Var.F;
        this.G = i5 == -1 ? 0 : i5;
        this.H = jo4Var.G;
        float f = jo4Var.H;
        this.I = f == -1.0f ? 1.0f : f;
        this.J = jo4Var.I;
        this.K = jo4Var.J;
        this.L = jo4Var.K;
        this.M = jo4Var.L;
        int i6 = jo4Var.M;
        this.N = i6;
        int i7 = jo4Var.N;
        this.O = i7;
        if (i6 != -1 && i7 != -1) {
            if (Integer.bitCount(i7) == i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                grb.i(fze.a("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i6), Integer.valueOf(i7)));
                throw null;
            }
        }
        this.P = jo4Var.O;
        this.Q = jo4Var.P;
        int i8 = jo4Var.Q;
        this.R = i8 == -1 ? 0 : i8;
        int i9 = jo4Var.R;
        this.S = i9 != -1 ? i9 : 0;
        this.T = jo4Var.S;
        this.U = jo4Var.T;
        this.V = jo4Var.U;
        this.W = jo4Var.V;
        int i10 = jo4Var.W;
        if (i10 == 0 && hr3Var != null) {
            this.X = 1;
        } else {
            this.X = i10;
        }
    }

    public static String c(ko4 ko4Var) {
        float f;
        int i;
        String str;
        String str2;
        String str3;
        float f2;
        if (ko4Var == null) {
            return "null";
        }
        int i2 = ko4Var.e;
        po5 po5Var = ko4Var.c;
        String str4 = ko4Var.d;
        int i3 = ko4Var.P;
        int i4 = ko4Var.O;
        int i5 = ko4Var.N;
        int i6 = ko4Var.M;
        int i7 = ko4Var.G;
        float f3 = ko4Var.F;
        int i8 = ko4Var.C;
        bm2 bm2Var = ko4Var.L;
        float f4 = ko4Var.I;
        int i9 = ko4Var.E;
        int i10 = ko4Var.D;
        int i11 = ko4Var.B;
        int i12 = ko4Var.A;
        hr3 hr3Var = ko4Var.x;
        String str5 = ko4Var.l;
        float f5 = ko4Var.g;
        int i13 = ko4Var.k;
        String str6 = ko4Var.n;
        String str7 = ko4Var.s;
        int i14 = ko4Var.f;
        ow5 ow5Var = new ow5(String.valueOf(','), (byte) 0);
        StringBuilder r = qd4.r("id=");
        r.append(ko4Var.a);
        r.append(", mimeType=");
        r.append(ko4Var.t);
        if (str7 != null) {
            r.append(", container=");
            r.append(str7);
        }
        if (str6 != null) {
            r.append(", primaryGroupId=");
            r.append(str6);
        }
        if (i13 != -1) {
            r.append(", bitrate=");
            r.append(i13);
        }
        float f6 = -1.0f;
        if (f5 != -1.0f) {
            r.append(", selectionPriority=");
            r.append(f5);
        }
        if (str5 != null) {
            r.append(", codecs=");
            r.append(str5);
        }
        if (hr3Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < hr3Var.d) {
                UUID uuid = hr3Var.a[i15].b;
                if (uuid.equals(o51.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(o51.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(o51.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(o51.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(o51.b)) {
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
            r.append(", drm=[");
            ow5Var.a(r, linkedHashSet.iterator());
            r.append(']');
        } else {
            f = -1.0f;
        }
        if (i12 != -1 && i11 != -1) {
            r.append(", res=");
            r.append(i12);
            r.append("x");
            r.append(i11);
        }
        if (i10 != -1 && i9 != -1) {
            r.append(", decRes=");
            r.append(i10);
            r.append("x");
            r.append(i9);
        }
        double d = f4;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d) {
            Double.isNaN(d);
            r.append(", par=");
            Object[] objArr = {Float.valueOf(f4)};
            String str8 = gcc.a;
            r.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (bm2Var != null) {
            int i16 = bm2Var.f;
            int i17 = bm2Var.e;
            if ((i17 != -1 && i16 != -1) || bm2Var.d()) {
                r.append(", color=");
                if (bm2Var.d()) {
                    String b = bm2.b(bm2Var.a);
                    String a = bm2.a(bm2Var.b);
                    String c = bm2.c(bm2Var.c);
                    String str9 = gcc.a;
                    Locale locale = Locale.US;
                    str2 = c00.j(b, "/", a, "/", c);
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i17 != -1 && i16 != -1) {
                    str3 = qd4.m(i17, i16, "/");
                } else {
                    str3 = "NA/NA";
                }
                r.append(str2 + "/" + str3);
            }
        }
        if (i8 != -1) {
            r.append(", pixelFormat=");
            r.append(i8);
        }
        if (f3 != f) {
            r.append(", fps=");
            r.append(f3);
        }
        if (i7 != 0) {
            r.append(", rotation=");
            r.append(i7);
        }
        if (ko4Var.H) {
            r.append(", mirrorHorizontal");
        }
        if (i6 != -1) {
            r.append(", maxSubLayers=");
            r.append(i6);
        }
        if (i5 != -1) {
            r.append(", channels=");
            r.append(i5);
        }
        if (i4 != -1) {
            r.append(", channel_mask=");
            r.append(i4);
        }
        if (i3 != -1) {
            r.append(", sample_rate=");
            r.append(i3);
        }
        if (str4 != null) {
            r.append(", language=");
            r.append(str4);
        }
        if (!po5Var.isEmpty()) {
            r.append(", labels=[");
            ow5Var.a(r, ose.b(po5Var, new p31((byte) 7)).iterator());
            r.append("]");
        }
        if (i2 != 0) {
            r.append(", selectionFlags=[");
            String str10 = gcc.a;
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
            ow5Var.a(r, arrayList.iterator());
            r.append("]");
        }
        if (i14 != 0) {
            r.append(", roleFlags=[");
            String str11 = gcc.a;
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
            ow5Var.a(r, arrayList2.iterator());
            r.append("]");
        } else {
            i = i14;
        }
        if ((i & 32768) != 0) {
            r.append(", auxiliaryTrackType=");
            int i18 = ko4Var.h;
            String str12 = gcc.a;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 == 4) {
                                str = "depth metadata";
                            } else {
                                grb.i("Unsupported auxiliary track type");
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
            r.append(str);
        }
        return r.toString();
    }

    public final jo4 a() {
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

    public final boolean b(ko4 ko4Var) {
        List list = this.w;
        if (list.size() != ko4Var.w.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) ko4Var.w.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final ko4 d(ko4 ko4Var) {
        ko4 ko4Var2;
        String str;
        po5 po5Var;
        String str2;
        hr3 hr3Var;
        int i;
        float f;
        if (this == ko4Var) {
            return this;
        }
        int h = dg7.h(this.t);
        String str3 = ko4Var.a;
        float f2 = ko4Var.g;
        int i2 = ko4Var.V;
        int i3 = ko4Var.W;
        String str4 = ko4Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (!ko4Var.c.isEmpty()) {
            ko4Var2 = ko4Var;
        } else {
            ko4Var2 = this;
        }
        po5 po5Var2 = ko4Var2.c;
        if ((h != 3 && h != 1) || (str = ko4Var.d) == null) {
            str = this.d;
        }
        int i4 = this.i;
        if (i4 == -1) {
            i4 = ko4Var.i;
        }
        int i5 = this.j;
        if (i5 == -1) {
            i5 = ko4Var.j;
        }
        String str5 = this.l;
        if (str5 == null) {
            String w = gcc.w(h, ko4Var.l);
            if (gcc.e0(w).length == 1) {
                str5 = w;
            }
        }
        String str6 = this.n;
        if (str6 == null) {
            str6 = ko4Var.n;
        }
        uf7 uf7Var = ko4Var.m;
        uf7 uf7Var2 = this.m;
        if (uf7Var2 != null) {
            uf7Var = uf7Var2.b(uf7Var);
        }
        float f3 = this.F;
        if (f3 == -1.0f) {
            po5Var = po5Var2;
            if (h == 2) {
                f3 = ko4Var.F;
            }
        } else {
            po5Var = po5Var2;
        }
        int i6 = this.e | ko4Var.e;
        int i7 = this.f | ko4Var.f;
        hr3 hr3Var2 = ko4Var.x;
        ArrayList arrayList = new ArrayList();
        if (hr3Var2 != null) {
            String str7 = hr3Var2.c;
            gr3[] gr3VarArr = hr3Var2.a;
            int length = gr3VarArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8;
                gr3 gr3Var = gr3VarArr[i9];
                int i10 = length;
                if (gr3Var.e != null) {
                    arrayList.add(gr3Var);
                }
                i8 = i9 + 1;
                length = i10;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        hr3 hr3Var3 = this.x;
        if (hr3Var3 != null) {
            if (str2 == null) {
                str2 = hr3Var3.c;
            }
            int size = arrayList.size();
            gr3[] gr3VarArr2 = hr3Var3.a;
            String str8 = str2;
            int length2 = gr3VarArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11;
                gr3 gr3Var2 = gr3VarArr2[i12];
                int i13 = length2;
                if (gr3Var2.e != null) {
                    UUID uuid = gr3Var2.b;
                    f = f3;
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            i = size;
                            if (!((gr3) arrayList.get(i14)).b.equals(uuid)) {
                                i14++;
                                size = i;
                            }
                        } else {
                            i = size;
                            arrayList.add(gr3Var2);
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
            hr3Var = null;
        } else {
            hr3Var = new hr3(str2, arrayList);
        }
        jo4 a = a();
        a.a = str3;
        a.b = str4;
        a.c = po5.q(po5Var);
        a.d = str;
        a.e = i6;
        a.f = i7;
        a.g = f2;
        a.i = i4;
        a.j = i5;
        a.k = str5;
        a.l = uf7Var;
        a.m = str6;
        a.w = hr3Var;
        a.a(f4);
        a.U = i2;
        a.V = i3;
        return new ko4(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && ko4.class == obj.getClass()) {
            ko4 ko4Var = (ko4) obj;
            int i2 = this.Y;
            if ((i2 == 0 || (i = ko4Var.Y) == 0 || i2 == i) && this.e == ko4Var.e && this.f == ko4Var.f && this.h == ko4Var.h && this.i == ko4Var.i && this.j == ko4Var.j && this.u == ko4Var.u && this.y == ko4Var.y && this.A == ko4Var.A && this.B == ko4Var.B && this.C == ko4Var.C && this.D == ko4Var.D && this.E == ko4Var.E && this.G == ko4Var.G && this.H == ko4Var.H && this.K == ko4Var.K && this.M == ko4Var.M && this.N == ko4Var.N && this.O == ko4Var.O && this.P == ko4Var.P && this.Q == ko4Var.Q && this.R == ko4Var.R && this.S == ko4Var.S && this.T == ko4Var.T && this.V == ko4Var.V && this.W == ko4Var.W && this.X == ko4Var.X && Float.compare(this.F, ko4Var.F) == 0 && Float.compare(this.g, ko4Var.g) == 0 && Float.compare(this.I, ko4Var.I) == 0 && Objects.equals(this.a, ko4Var.a) && Objects.equals(this.b, ko4Var.b) && this.c.equals(ko4Var.c) && Objects.equals(this.l, ko4Var.l) && Objects.equals(this.n, ko4Var.n) && Objects.equals(this.s, ko4Var.s) && Objects.equals(this.t, ko4Var.t) && Objects.equals(this.d, ko4Var.d) && Arrays.equals(this.J, ko4Var.J) && Objects.equals(this.m, ko4Var.m) && Objects.equals(this.L, ko4Var.L) && Objects.equals(this.x, ko4Var.x) && b(ko4Var)) {
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
            uf7 uf7Var = this.m;
            if (uf7Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = uf7Var.hashCode();
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
        return uh9.l(sb, this.P, "])");
    }
}
