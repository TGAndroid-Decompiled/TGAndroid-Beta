package e2;

import a8.ia;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
public final class u {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final u V = new u(new t());
    public static final String W = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);
    public static final String f10579a0 = Integer.toString(4, 36);
    public static final String f10580b0 = Integer.toString(5, 36);
    public static final String f10581c0 = Integer.toString(6, 36);
    public static final String f10582d0 = Integer.toString(7, 36);
    public static final String f10583e0;
    public static final String f10584f0;
    public static final String f10585g0;
    public static final String f10586h0;
    public static final String f10587i0;
    public static final String f10588j0;
    public static final String f10589k0;
    public static final String f10590l0;
    public static final String m0;
    public static final String f10591n0;
    public static final String f10592o0;
    public static final String f10593p0;
    public static final String f10594q0;
    public static final String f10595r0;
    public static final String f10596s0;
    public static final String f10597t0;
    public static final String f10598u0;
    public static final String f10599v0;
    public static final String f10600w0;
    public static final String f10601x0;
    public static final String f10602y0;
    public static final String f10603z0;
    public final int A;
    public final int B;
    public final int C;
    public final float D;
    public final int E;
    public final float F;
    public final byte[] G;
    public final int H;
    public final m I;
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
    public final String f10604a;
    public final String f10605b;
    public final h9.i0 f10606c;
    public final String d;
    public final int f10607e;
    public final int f10608f;
    public final int f10609g;
    public final int h;
    public final int f10610i;
    public final int f10611j;
    public final String f10612k;
    public final q0 f10613l;
    public final String f10614m;
    public boolean f10615n;
    public long f10616o;
    public int f10617p;
    public String f10618q;
    public final String f10619r;
    public final String f10620s;
    public final int f10621t;
    public final int f10622u;
    public final List v;
    public final r f10623w;
    public final long f10624x;
    public final boolean f10625y;
    public final int f10626z;

    static {
        Integer.toString(8, 36);
        f10583e0 = Integer.toString(9, 36);
        f10584f0 = Integer.toString(10, 36);
        f10585g0 = Integer.toString(11, 36);
        f10586h0 = Integer.toString(12, 36);
        f10587i0 = Integer.toString(13, 36);
        f10588j0 = Integer.toString(14, 36);
        f10589k0 = Integer.toString(15, 36);
        f10590l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f10591n0 = Integer.toString(18, 36);
        f10592o0 = Integer.toString(19, 36);
        f10593p0 = Integer.toString(20, 36);
        f10594q0 = Integer.toString(21, 36);
        f10595r0 = Integer.toString(22, 36);
        f10596s0 = Integer.toString(23, 36);
        f10597t0 = Integer.toString(24, 36);
        f10598u0 = Integer.toString(25, 36);
        f10599v0 = Integer.toString(26, 36);
        f10600w0 = Integer.toString(27, 36);
        f10601x0 = Integer.toString(28, 36);
        f10602y0 = Integer.toString(29, 36);
        f10603z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
    }

    public u(t tVar) {
        boolean z9;
        String str;
        boolean z10;
        this.f10604a = tVar.f10553a;
        String T = h2.m0.T(tVar.d);
        this.d = T;
        if (tVar.f10555c.isEmpty() && tVar.f10554b != null) {
            this.f10606c = h9.i0.u(new x(T, tVar.f10554b));
            this.f10605b = tVar.f10554b;
        } else if (!tVar.f10555c.isEmpty() && tVar.f10554b == null) {
            h9.i0 i0Var = tVar.f10555c;
            this.f10606c = i0Var;
            int size = i0Var.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = i0Var.get(i7);
                    i7++;
                    x xVar = (x) obj;
                    if (TextUtils.equals(xVar.f10647a, T)) {
                        str = xVar.f10648b;
                        break;
                    }
                } else {
                    str = ((x) i0Var.get(0)).f10648b;
                    break;
                }
            }
            this.f10605b = str;
        } else {
            if (!tVar.f10555c.isEmpty() || tVar.f10554b != null) {
                for (int i10 = 0; i10 < tVar.f10555c.size(); i10++) {
                    if (!((x) tVar.f10555c.get(i10)).f10648b.equals(tVar.f10554b)) {
                    }
                }
                z9 = false;
                ia.p(z9);
                this.f10606c = tVar.f10555c;
                this.f10605b = tVar.f10554b;
            }
            z9 = true;
            ia.p(z9);
            this.f10606c = tVar.f10555c;
            this.f10605b = tVar.f10554b;
        }
        this.f10607e = tVar.f10556e;
        if (tVar.f10558g != 0 && (tVar.f10557f & 32768) == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ia.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z10);
        this.f10608f = tVar.f10557f;
        this.f10609g = tVar.f10558g;
        int i11 = tVar.h;
        this.h = i11;
        int i12 = tVar.f10559i;
        this.f10610i = i12;
        this.f10611j = i12 != -1 ? i12 : i11;
        this.f10612k = tVar.f10560j;
        this.f10613l = tVar.f10561k;
        this.f10614m = tVar.f10562l;
        this.f10615n = tVar.f10563m;
        this.f10616o = tVar.f10564n;
        this.f10617p = tVar.f10566p;
        this.f10618q = tVar.f10565o;
        this.f10619r = tVar.f10567q;
        this.f10620s = tVar.f10568r;
        this.f10621t = tVar.f10569s;
        this.f10622u = tVar.f10570t;
        List list = tVar.f10571u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        r rVar = tVar.v;
        this.f10623w = rVar;
        this.f10624x = tVar.f10572w;
        this.f10625y = tVar.f10573x;
        this.f10626z = tVar.f10574y;
        this.A = tVar.f10575z;
        this.B = tVar.A;
        this.C = tVar.B;
        this.D = tVar.C;
        int i13 = tVar.D;
        this.E = i13 == -1 ? 0 : i13;
        float f10 = tVar.E;
        this.F = f10 == -1.0f ? 1.0f : f10;
        this.G = tVar.F;
        this.H = tVar.G;
        this.I = tVar.H;
        this.J = tVar.I;
        this.K = tVar.J;
        this.L = tVar.K;
        this.M = tVar.L;
        int i14 = tVar.M;
        this.N = i14 == -1 ? 0 : i14;
        int i15 = tVar.N;
        this.O = i15 != -1 ? i15 : 0;
        this.P = tVar.O;
        this.Q = tVar.P;
        this.R = tVar.Q;
        this.S = tVar.R;
        int i16 = tVar.S;
        if (i16 == 0 && rVar != null) {
            this.T = 1;
        } else {
            this.T = i16;
        }
    }

    public static String c(u uVar) {
        int i7;
        String str;
        String str2;
        String str3;
        if (uVar == null) {
            return "null";
        }
        int i10 = uVar.f10607e;
        h9.i0 i0Var = uVar.f10606c;
        String str4 = uVar.d;
        int i11 = uVar.L;
        int i12 = uVar.K;
        int i13 = uVar.J;
        float f10 = uVar.D;
        m mVar = uVar.I;
        float f11 = uVar.F;
        int i14 = uVar.C;
        int i15 = uVar.B;
        int i16 = uVar.A;
        int i17 = uVar.f10626z;
        r rVar = uVar.f10623w;
        String str5 = uVar.f10612k;
        int i18 = uVar.f10611j;
        String str6 = uVar.f10614m;
        String str7 = uVar.f10619r;
        int i19 = uVar.f10608f;
        g9.l lVar = new g9.l(String.valueOf(','), 0);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("id=");
        m10.append(uVar.f10604a);
        m10.append(", mimeType=");
        m10.append(uVar.f10620s);
        if (str7 != null) {
            m10.append(", container=");
            m10.append(str7);
        }
        if (str6 != null) {
            m10.append(", primaryGroupId=");
            m10.append(str6);
        }
        if (i18 != -1) {
            m10.append(", bitrate=");
            m10.append(i18);
        }
        if (str5 != null) {
            m10.append(", codecs=");
            m10.append(str5);
        }
        if (rVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i20 = 0; i20 < rVar.d; i20++) {
                UUID uuid = rVar.f10535a[i20].f10486b;
                if (uuid.equals(l.f10345c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(l.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(l.f10347f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(l.f10346e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(l.f10344b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            m10.append(", drm=[");
            lVar.a(m10, linkedHashSet.iterator());
            m10.append(']');
        }
        if (i17 != -1 && i16 != -1) {
            m10.append(", res=");
            m10.append(i17);
            m10.append("x");
            m10.append(i16);
        }
        if (i15 != -1 && i14 != -1) {
            m10.append(", decRes=");
            m10.append(i15);
            m10.append("x");
            m10.append(i14);
        }
        double d = f11;
        int i21 = j9.c.f16601a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            m10.append(", par=");
            Object[] objArr = {Float.valueOf(f11)};
            String str8 = h2.m0.f14114a;
            m10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (mVar != null) {
            int i22 = mVar.f10372f;
            int i23 = mVar.f10371e;
            if ((i23 != -1 && i22 != -1) || mVar.d()) {
                m10.append(", color=");
                if (mVar.d()) {
                    String b10 = m.b(mVar.f10368a);
                    String a10 = m.a(mVar.f10369b);
                    String c10 = m.c(mVar.f10370c);
                    String str9 = h2.m0.f14114a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a10 + "/" + c10;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i23 != -1 && i22 != -1) {
                    str3 = com.google.android.recaptcha.internal.a.j(i23, "/", i22);
                } else {
                    str3 = "NA/NA";
                }
                m10.append(str2 + "/" + str3);
            }
        }
        if (f10 != -1.0f) {
            m10.append(", fps=");
            m10.append(f10);
        }
        if (i13 != -1) {
            m10.append(", maxSubLayers=");
            m10.append(i13);
        }
        if (i12 != -1) {
            m10.append(", channels=");
            m10.append(i12);
        }
        if (i11 != -1) {
            m10.append(", sample_rate=");
            m10.append(i11);
        }
        if (str4 != null) {
            m10.append(", language=");
            m10.append(str4);
        }
        if (!i0Var.isEmpty()) {
            m10.append(", labels=[");
            lVar.a(m10, h9.o.y(i0Var, new di.a1(4)).iterator());
            m10.append("]");
        }
        if (i10 != 0) {
            m10.append(", selectionFlags=[");
            String str10 = h2.m0.f14114a;
            ArrayList arrayList = new ArrayList();
            if ((i10 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i10 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            lVar.a(m10, arrayList.iterator());
            m10.append("]");
        }
        if (i19 != 0) {
            m10.append(", roleFlags=[");
            String str11 = h2.m0.f14114a;
            ArrayList arrayList2 = new ArrayList();
            if ((i19 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i19 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i19 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i19 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i19 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i19 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i19 & 64) != 0) {
                arrayList2.add("caption");
            }
            i7 = i19;
            if ((i7 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i7 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i7 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i7 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i7 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i7 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i7 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i7 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i7 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            lVar.a(m10, arrayList2.iterator());
            m10.append("]");
        } else {
            i7 = i19;
        }
        if ((i7 & 32768) != 0) {
            m10.append(", auxiliaryTrackType=");
            int i24 = uVar.f10609g;
            String str12 = h2.m0.f14114a;
            if (i24 != 0) {
                if (i24 != 1) {
                    if (i24 != 2) {
                        if (i24 != 3) {
                            if (i24 == 4) {
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
            m10.append(str);
        }
        return m10.toString();
    }

    public final t a() {
        ?? obj = new Object();
        obj.f10553a = this.f10604a;
        obj.f10554b = this.f10605b;
        obj.f10555c = this.f10606c;
        obj.d = this.d;
        obj.f10556e = this.f10607e;
        obj.f10557f = this.f10608f;
        obj.h = this.h;
        obj.f10559i = this.f10610i;
        obj.f10560j = this.f10612k;
        obj.f10561k = this.f10613l;
        obj.f10562l = this.f10614m;
        obj.f10567q = this.f10619r;
        obj.f10568r = this.f10620s;
        obj.f10569s = this.f10621t;
        obj.f10570t = this.f10622u;
        obj.f10571u = this.v;
        obj.v = this.f10623w;
        obj.f10572w = this.f10624x;
        obj.f10573x = this.f10625y;
        obj.f10574y = this.f10626z;
        obj.f10575z = this.A;
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
        obj.f10563m = this.f10615n;
        obj.f10564n = this.f10616o;
        obj.f10566p = this.f10617p;
        obj.f10565o = this.f10618q;
        return obj;
    }

    public final boolean b(u uVar) {
        List list = this.v;
        if (list.size() != uVar.v.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) uVar.v.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final u d(u uVar) {
        String str;
        String str2;
        r rVar;
        int i7;
        int i10;
        if (this == uVar) {
            return this;
        }
        int h = s0.h(this.f10620s);
        String str3 = uVar.f10604a;
        q0 q0Var = uVar.f10613l;
        h9.i0 i0Var = uVar.f10606c;
        int i11 = uVar.R;
        int i12 = uVar.S;
        String str4 = uVar.f10605b;
        if (str4 == null) {
            str4 = this.f10605b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f10606c;
        }
        if ((h != 3 && h != 1) || (str = uVar.d) == null) {
            str = this.d;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = uVar.h;
        }
        int i14 = this.f10610i;
        if (i14 == -1) {
            i14 = uVar.f10610i;
        }
        String str5 = this.f10612k;
        if (str5 == null) {
            String w10 = h2.m0.w(h, uVar.f10612k);
            if (h2.m0.d0(w10).length == 1) {
                str5 = w10;
            }
        }
        String str6 = this.f10614m;
        if (str6 == null) {
            str6 = uVar.f10614m;
        }
        q0 q0Var2 = this.f10613l;
        if (q0Var2 != null) {
            q0Var = q0Var2.b(q0Var);
        }
        float f10 = this.D;
        if (f10 == -1.0f && h == 2) {
            f10 = uVar.D;
        }
        int i15 = this.f10607e | uVar.f10607e;
        h9.i0 i0Var2 = i0Var;
        int i16 = uVar.f10608f | this.f10608f;
        r rVar2 = uVar.f10623w;
        ArrayList arrayList = new ArrayList();
        if (rVar2 != null) {
            String str7 = rVar2.f10537c;
            q[] qVarArr = rVar2.f10535a;
            int length = qVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                q qVar = qVarArr[i18];
                int i19 = length;
                if (qVar.f10488e != null) {
                    arrayList.add(qVar);
                }
                i17 = i18 + 1;
                length = i19;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        r rVar3 = this.f10623w;
        if (rVar3 != null) {
            if (str2 == null) {
                str2 = rVar3.f10537c;
            }
            int size = arrayList.size();
            q[] qVarArr2 = rVar3.f10535a;
            String str8 = str2;
            int length2 = qVarArr2.length;
            int i20 = 0;
            while (i20 < length2) {
                int i21 = i20;
                q qVar2 = qVarArr2[i21];
                int i22 = length2;
                if (qVar2.f10488e != null) {
                    UUID uuid = qVar2.f10486b;
                    i10 = i11;
                    int i23 = 0;
                    while (true) {
                        if (i23 < size) {
                            i7 = size;
                            if (((q) arrayList.get(i23)).f10486b.equals(uuid)) {
                                break;
                            }
                            i23++;
                            size = i7;
                        } else {
                            i7 = size;
                            arrayList.add(qVar2);
                            break;
                        }
                    }
                } else {
                    i7 = size;
                    i10 = i11;
                }
                i20 = i21 + 1;
                length2 = i22;
                i11 = i10;
                size = i7;
            }
            str2 = str8;
        }
        int i24 = i11;
        if (arrayList.isEmpty()) {
            rVar = null;
        } else {
            rVar = new r(str2, arrayList);
        }
        t a10 = a();
        a10.f10553a = str3;
        a10.f10554b = str4;
        a10.f10555c = h9.i0.q(i0Var2);
        a10.d = str;
        a10.f10556e = i15;
        a10.f10557f = i16;
        a10.h = i13;
        a10.f10559i = i14;
        a10.f10560j = str5;
        a10.f10561k = q0Var;
        a10.f10562l = str6;
        a10.v = rVar;
        a10.C = f10;
        a10.Q = i24;
        a10.R = i12;
        return new u(a10);
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            int i10 = this.U;
            if ((i10 == 0 || (i7 = uVar.U) == 0 || i10 == i7) && this.f10607e == uVar.f10607e && this.f10608f == uVar.f10608f && this.f10609g == uVar.f10609g && this.h == uVar.h && this.f10610i == uVar.f10610i && this.f10621t == uVar.f10621t && this.f10624x == uVar.f10624x && this.f10626z == uVar.f10626z && this.A == uVar.A && this.B == uVar.B && this.C == uVar.C && this.E == uVar.E && this.H == uVar.H && this.J == uVar.J && this.K == uVar.K && this.L == uVar.L && this.M == uVar.M && this.N == uVar.N && this.O == uVar.O && this.P == uVar.P && this.R == uVar.R && this.S == uVar.S && this.T == uVar.T && Float.compare(this.D, uVar.D) == 0 && Float.compare(this.F, uVar.F) == 0 && Objects.equals(this.f10604a, uVar.f10604a) && Objects.equals(this.f10605b, uVar.f10605b) && this.f10606c.equals(uVar.f10606c) && Objects.equals(this.f10612k, uVar.f10612k) && Objects.equals(this.f10614m, uVar.f10614m) && Objects.equals(this.f10619r, uVar.f10619r) && Objects.equals(this.f10620s, uVar.f10620s) && Objects.equals(this.d, uVar.d) && Arrays.equals(this.G, uVar.G) && Objects.equals(this.f10613l, uVar.f10613l) && Objects.equals(this.I, uVar.I) && Objects.equals(this.f10623w, uVar.f10623w) && b(uVar)) {
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
            int i7 = 0;
            String str = this.f10604a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (527 + hashCode) * 31;
            String str2 = this.f10605b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f10606c.hashCode() + ((i10 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (((((((((((hashCode8 + hashCode3) * 31) + this.f10607e) * 31) + this.f10608f) * 31) + this.f10609g) * 31) + this.h) * 31) + this.f10610i) * 31;
            String str4 = this.f10612k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            q0 q0Var = this.f10613l;
            if (q0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = q0Var.hashCode();
            }
            int i13 = (i12 + hashCode5) * 961;
            String str5 = this.f10614m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str6 = this.f10619r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str7 = this.f10620s;
            if (str7 != null) {
                i7 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i15 + i7) * 31) + this.f10621t) * 31) + ((int) this.f10624x)) * 31) + this.f10626z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f10604a);
        sb2.append(", ");
        sb2.append(this.f10605b);
        sb2.append(", ");
        sb2.append(this.f10619r);
        sb2.append(", ");
        sb2.append(this.f10620s);
        sb2.append(", ");
        sb2.append(this.f10612k);
        sb2.append(", ");
        sb2.append(this.f10611j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f10626z);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.K);
        sb2.append(", ");
        return a8.p0.n(this.L, "])", sb2);
    }
}
