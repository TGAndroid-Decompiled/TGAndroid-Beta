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
public final class fm4 {
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
    public static final fm4 Z = new fm4(new em4());
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
    public final hl2 L;
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
    public final mm5 c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final ld7 m;
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
    public final qq3 x;
    public final long y;
    public final boolean z;

    static {
        String str = g8c.a;
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

    public fm4(em4 em4Var) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        this.a = em4Var.a;
        String U = g8c.U(em4Var.d);
        this.d = U;
        if (em4Var.c.isEmpty() && em4Var.b != null) {
            this.c = mm5.u(new sw5(U, em4Var.b));
            this.b = em4Var.b;
        } else if (!em4Var.c.isEmpty() && em4Var.b == null) {
            mm5 mm5Var = em4Var.c;
            this.c = mm5Var;
            int size = mm5Var.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = mm5Var.get(i);
                    i++;
                    sw5 sw5Var = (sw5) obj;
                    if (TextUtils.equals(sw5Var.a, U)) {
                        str = sw5Var.b;
                        break;
                    }
                } else {
                    str = ((sw5) mm5Var.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!em4Var.c.isEmpty() || em4Var.b != null) {
                for (int i2 = 0; i2 < em4Var.c.size(); i2++) {
                    if (!((sw5) em4Var.c.get(i2)).b.equals(em4Var.b)) {
                    }
                }
                z = false;
                gre.p(z);
                this.c = em4Var.c;
                this.b = em4Var.b;
            }
            z = true;
            gre.p(z);
            this.c = em4Var.c;
            this.b = em4Var.b;
        }
        this.e = em4Var.e;
        if (em4Var.h != 0 && (em4Var.f & 32768) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        gre.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = em4Var.f;
        this.g = em4Var.g;
        this.h = em4Var.h;
        int i3 = em4Var.i;
        this.i = i3;
        int i4 = em4Var.j;
        this.j = i4;
        this.k = i4 != -1 ? i4 : i3;
        this.l = em4Var.k;
        this.m = em4Var.l;
        this.n = em4Var.m;
        this.o = em4Var.n;
        this.p = em4Var.o;
        this.q = em4Var.q;
        this.r = em4Var.p;
        this.s = em4Var.r;
        this.t = em4Var.s;
        this.u = em4Var.t;
        this.v = em4Var.u;
        List list = em4Var.v;
        this.w = list == null ? Collections.EMPTY_LIST : list;
        qq3 qq3Var = em4Var.w;
        this.x = qq3Var;
        this.y = em4Var.x;
        this.z = em4Var.y;
        this.A = em4Var.z;
        this.B = em4Var.A;
        this.C = em4Var.B;
        this.D = em4Var.C;
        this.E = em4Var.D;
        this.F = em4Var.E;
        int i5 = em4Var.F;
        this.G = i5 == -1 ? 0 : i5;
        this.H = em4Var.G;
        float f = em4Var.H;
        this.I = f == -1.0f ? 1.0f : f;
        this.J = em4Var.I;
        this.K = em4Var.J;
        this.L = em4Var.K;
        this.M = em4Var.L;
        int i6 = em4Var.M;
        this.N = i6;
        int i7 = em4Var.N;
        this.O = i7;
        if (i6 != -1 && i7 != -1) {
            if (Integer.bitCount(i7) == i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                sc8.j(nue.a("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i6), Integer.valueOf(i7)));
                throw null;
            }
        }
        this.P = em4Var.O;
        this.Q = em4Var.P;
        int i8 = em4Var.Q;
        this.R = i8 == -1 ? 0 : i8;
        int i9 = em4Var.R;
        this.S = i9 != -1 ? i9 : 0;
        this.T = em4Var.S;
        this.U = em4Var.T;
        this.V = em4Var.U;
        this.W = em4Var.V;
        int i10 = em4Var.W;
        if (i10 == 0 && qq3Var != null) {
            this.X = 1;
        } else {
            this.X = i10;
        }
    }

    public static String c(fm4 fm4Var) {
        float f;
        char c;
        int i;
        String str;
        String str2;
        String str3;
        float f2;
        if (fm4Var == null) {
            return "null";
        }
        int i2 = fm4Var.e;
        mm5 mm5Var = fm4Var.c;
        String str4 = fm4Var.d;
        int i3 = fm4Var.P;
        int i4 = fm4Var.O;
        int i5 = fm4Var.N;
        int i6 = fm4Var.M;
        int i7 = fm4Var.G;
        float f3 = fm4Var.F;
        int i8 = fm4Var.C;
        hl2 hl2Var = fm4Var.L;
        float f4 = fm4Var.I;
        int i9 = fm4Var.E;
        int i10 = fm4Var.D;
        int i11 = fm4Var.B;
        int i12 = fm4Var.A;
        qq3 qq3Var = fm4Var.x;
        String str5 = fm4Var.l;
        float f5 = fm4Var.g;
        int i13 = fm4Var.k;
        String str6 = fm4Var.n;
        String str7 = fm4Var.s;
        int i14 = fm4Var.f;
        zb3 zb3Var = new zb3(String.valueOf(','));
        StringBuilder r = tb4.r("id=");
        r.append(fm4Var.a);
        r.append(", mimeType=");
        r.append(fm4Var.t);
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
        if (qq3Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < qq3Var.d) {
                UUID uuid = qq3Var.a[i15].b;
                if (uuid.equals(g51.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(g51.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(g51.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(g51.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(g51.b)) {
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
            c = 0;
            r.append(", drm=[");
            zb3Var.a(r, linkedHashSet.iterator());
            r.append(']');
        } else {
            f = -1.0f;
            c = 0;
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
            Object[] objArr = new Object[1];
            objArr[c] = Float.valueOf(f4);
            String str8 = g8c.a;
            r.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (hl2Var != null) {
            int i16 = hl2Var.f;
            int i17 = hl2Var.e;
            if ((i17 != -1 && i16 != -1) || hl2Var.d()) {
                r.append(", color=");
                if (hl2Var.d()) {
                    String b = hl2.b(hl2Var.a);
                    String a = hl2.a(hl2Var.b);
                    String c2 = hl2.c(hl2Var.c);
                    String str9 = g8c.a;
                    Locale locale = Locale.US;
                    str2 = b00.i(b, "/", a, "/", c2);
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i17 != -1 && i16 != -1) {
                    str3 = tb4.m(i17, i16, "/");
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
        if (fm4Var.H) {
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
        if (!mm5Var.isEmpty()) {
            r.append(", labels=[");
            zb3Var.a(r, tne.b(mm5Var, new g31((byte) 7)).iterator());
            r.append("]");
        }
        if (i2 != 0) {
            r.append(", selectionFlags=[");
            String str10 = g8c.a;
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
            zb3Var.a(r, arrayList.iterator());
            r.append("]");
        }
        if (i14 != 0) {
            r.append(", roleFlags=[");
            String str11 = g8c.a;
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
            zb3Var.a(r, arrayList2.iterator());
            r.append("]");
        } else {
            i = i14;
        }
        if ((i & 32768) != 0) {
            r.append(", auxiliaryTrackType=");
            int i18 = fm4Var.h;
            String str12 = g8c.a;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 == 4) {
                                str = "depth metadata";
                            } else {
                                sc8.j("Unsupported auxiliary track type");
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

    public final em4 a() {
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

    public final boolean b(fm4 fm4Var) {
        List list = this.w;
        if (list.size() != fm4Var.w.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) fm4Var.w.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final fm4 d(fm4 fm4Var) {
        fm4 fm4Var2;
        String str;
        mm5 mm5Var;
        String str2;
        qq3 qq3Var;
        int i;
        float f;
        if (this == fm4Var) {
            return this;
        }
        int h = ud7.h(this.t);
        String str3 = fm4Var.a;
        float f2 = fm4Var.g;
        int i2 = fm4Var.V;
        int i3 = fm4Var.W;
        String str4 = fm4Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (!fm4Var.c.isEmpty()) {
            fm4Var2 = fm4Var;
        } else {
            fm4Var2 = this;
        }
        mm5 mm5Var2 = fm4Var2.c;
        if ((h != 3 && h != 1) || (str = fm4Var.d) == null) {
            str = this.d;
        }
        int i4 = this.i;
        if (i4 == -1) {
            i4 = fm4Var.i;
        }
        int i5 = this.j;
        if (i5 == -1) {
            i5 = fm4Var.j;
        }
        String str5 = this.l;
        if (str5 == null) {
            String w = g8c.w(h, fm4Var.l);
            if (g8c.e0(w).length == 1) {
                str5 = w;
            }
        }
        String str6 = this.n;
        if (str6 == null) {
            str6 = fm4Var.n;
        }
        ld7 ld7Var = fm4Var.m;
        ld7 ld7Var2 = this.m;
        if (ld7Var2 != null) {
            ld7Var = ld7Var2.b(ld7Var);
        }
        float f3 = this.F;
        if (f3 == -1.0f) {
            mm5Var = mm5Var2;
            if (h == 2) {
                f3 = fm4Var.F;
            }
        } else {
            mm5Var = mm5Var2;
        }
        int i6 = this.e | fm4Var.e;
        int i7 = this.f | fm4Var.f;
        qq3 qq3Var2 = fm4Var.x;
        ArrayList arrayList = new ArrayList();
        if (qq3Var2 != null) {
            String str7 = qq3Var2.c;
            pq3[] pq3VarArr = qq3Var2.a;
            int length = pq3VarArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8;
                pq3 pq3Var = pq3VarArr[i9];
                int i10 = length;
                if (pq3Var.e != null) {
                    arrayList.add(pq3Var);
                }
                i8 = i9 + 1;
                length = i10;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        qq3 qq3Var3 = this.x;
        if (qq3Var3 != null) {
            if (str2 == null) {
                str2 = qq3Var3.c;
            }
            int size = arrayList.size();
            pq3[] pq3VarArr2 = qq3Var3.a;
            String str8 = str2;
            int length2 = pq3VarArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11;
                pq3 pq3Var2 = pq3VarArr2[i12];
                int i13 = length2;
                if (pq3Var2.e != null) {
                    UUID uuid = pq3Var2.b;
                    f = f3;
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            i = size;
                            if (!((pq3) arrayList.get(i14)).b.equals(uuid)) {
                                i14++;
                                size = i;
                            }
                        } else {
                            i = size;
                            arrayList.add(pq3Var2);
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
            qq3Var = null;
        } else {
            qq3Var = new qq3(str2, arrayList);
        }
        em4 a = a();
        a.a = str3;
        a.b = str4;
        a.c = mm5.q(mm5Var);
        a.d = str;
        a.e = i6;
        a.f = i7;
        a.g = f2;
        a.i = i4;
        a.j = i5;
        a.k = str5;
        a.l = ld7Var;
        a.m = str6;
        a.w = qq3Var;
        a.a(f4);
        a.U = i2;
        a.V = i3;
        return new fm4(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && fm4.class == obj.getClass()) {
            fm4 fm4Var = (fm4) obj;
            int i2 = this.Y;
            if ((i2 == 0 || (i = fm4Var.Y) == 0 || i2 == i) && this.e == fm4Var.e && this.f == fm4Var.f && this.h == fm4Var.h && this.i == fm4Var.i && this.j == fm4Var.j && this.u == fm4Var.u && this.y == fm4Var.y && this.A == fm4Var.A && this.B == fm4Var.B && this.C == fm4Var.C && this.D == fm4Var.D && this.E == fm4Var.E && this.G == fm4Var.G && this.H == fm4Var.H && this.K == fm4Var.K && this.M == fm4Var.M && this.N == fm4Var.N && this.O == fm4Var.O && this.P == fm4Var.P && this.Q == fm4Var.Q && this.R == fm4Var.R && this.S == fm4Var.S && this.T == fm4Var.T && this.V == fm4Var.V && this.W == fm4Var.W && this.X == fm4Var.X && Float.compare(this.F, fm4Var.F) == 0 && Float.compare(this.g, fm4Var.g) == 0 && Float.compare(this.I, fm4Var.I) == 0 && Objects.equals(this.a, fm4Var.a) && Objects.equals(this.b, fm4Var.b) && this.c.equals(fm4Var.c) && Objects.equals(this.l, fm4Var.l) && Objects.equals(this.n, fm4Var.n) && Objects.equals(this.s, fm4Var.s) && Objects.equals(this.t, fm4Var.t) && Objects.equals(this.d, fm4Var.d) && Arrays.equals(this.J, fm4Var.J) && Objects.equals(this.m, fm4Var.m) && Objects.equals(this.L, fm4Var.L) && Objects.equals(this.x, fm4Var.x) && b(fm4Var)) {
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
            ld7 ld7Var = this.m;
            if (ld7Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = ld7Var.hashCode();
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
        return de9.l(sb, this.P, "])");
    }
}
