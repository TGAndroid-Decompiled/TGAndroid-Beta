package e2;

import a8.la;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
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
    public static final String f10754a0 = Integer.toString(4, 36);
    public static final String f10755b0 = Integer.toString(5, 36);
    public static final String f10756c0 = Integer.toString(6, 36);
    public static final String f10757d0 = Integer.toString(7, 36);
    public static final String f10758e0;
    public static final String f10759f0;
    public static final String f10760g0;
    public static final String f10761h0;
    public static final String f10762i0;
    public static final String f10763j0;
    public static final String f10764k0;
    public static final String f10765l0;
    public static final String m0;
    public static final String f10766n0;
    public static final String f10767o0;
    public static final String f10768p0;
    public static final String f10769q0;
    public static final String f10770r0;
    public static final String f10771s0;
    public static final String f10772t0;
    public static final String f10773u0;
    public static final String f10774v0;
    public static final String f10775w0;
    public static final String f10776x0;
    public static final String f10777y0;
    public static final String f10778z0;
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
    public final String f10779a;
    public final String f10780b;
    public final h9.i0 f10781c;
    public final String d;
    public final int f10782e;
    public final int f10783f;
    public final int f10784g;
    public final int h;
    public final int f10785i;
    public final int f10786j;
    public final String f10787k;
    public final q0 f10788l;
    public final String f10789m;
    public boolean f10790n;
    public long f10791o;
    public int f10792p;
    public String f10793q;
    public final String f10794r;
    public final String f10795s;
    public final int f10796t;
    public final int f10797u;
    public final List v;
    public final r f10798w;
    public final long f10799x;
    public final boolean f10800y;
    public final int f10801z;

    static {
        Integer.toString(8, 36);
        f10758e0 = Integer.toString(9, 36);
        f10759f0 = Integer.toString(10, 36);
        f10760g0 = Integer.toString(11, 36);
        f10761h0 = Integer.toString(12, 36);
        f10762i0 = Integer.toString(13, 36);
        f10763j0 = Integer.toString(14, 36);
        f10764k0 = Integer.toString(15, 36);
        f10765l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f10766n0 = Integer.toString(18, 36);
        f10767o0 = Integer.toString(19, 36);
        f10768p0 = Integer.toString(20, 36);
        f10769q0 = Integer.toString(21, 36);
        f10770r0 = Integer.toString(22, 36);
        f10771s0 = Integer.toString(23, 36);
        f10772t0 = Integer.toString(24, 36);
        f10773u0 = Integer.toString(25, 36);
        f10774v0 = Integer.toString(26, 36);
        f10775w0 = Integer.toString(27, 36);
        f10776x0 = Integer.toString(28, 36);
        f10777y0 = Integer.toString(29, 36);
        f10778z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
    }

    public u(t tVar) {
        boolean z10;
        String str;
        boolean z11;
        this.f10779a = tVar.f10728a;
        String T = h2.l0.T(tVar.d);
        this.d = T;
        if (tVar.f10730c.isEmpty() && tVar.f10729b != null) {
            this.f10781c = h9.i0.u(new x(T, tVar.f10729b));
            this.f10780b = tVar.f10729b;
        } else if (!tVar.f10730c.isEmpty() && tVar.f10729b == null) {
            h9.i0 i0Var = tVar.f10730c;
            this.f10781c = i0Var;
            int size = i0Var.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = i0Var.get(i7);
                    i7++;
                    x xVar = (x) obj;
                    if (TextUtils.equals(xVar.f10822a, T)) {
                        str = xVar.f10823b;
                        break;
                    }
                } else {
                    str = ((x) i0Var.get(0)).f10823b;
                    break;
                }
            }
            this.f10780b = str;
        } else {
            if (!tVar.f10730c.isEmpty() || tVar.f10729b != null) {
                for (int i10 = 0; i10 < tVar.f10730c.size(); i10++) {
                    if (!((x) tVar.f10730c.get(i10)).f10823b.equals(tVar.f10729b)) {
                    }
                }
                z10 = false;
                la.p(z10);
                this.f10781c = tVar.f10730c;
                this.f10780b = tVar.f10729b;
            }
            z10 = true;
            la.p(z10);
            this.f10781c = tVar.f10730c;
            this.f10780b = tVar.f10729b;
        }
        this.f10782e = tVar.f10731e;
        if (tVar.f10733g != 0 && (tVar.f10732f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        la.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f10783f = tVar.f10732f;
        this.f10784g = tVar.f10733g;
        int i11 = tVar.h;
        this.h = i11;
        int i12 = tVar.f10734i;
        this.f10785i = i12;
        this.f10786j = i12 != -1 ? i12 : i11;
        this.f10787k = tVar.f10735j;
        this.f10788l = tVar.f10736k;
        this.f10789m = tVar.f10737l;
        this.f10790n = tVar.f10738m;
        this.f10791o = tVar.f10739n;
        this.f10792p = tVar.f10741p;
        this.f10793q = tVar.f10740o;
        this.f10794r = tVar.f10742q;
        this.f10795s = tVar.f10743r;
        this.f10796t = tVar.f10744s;
        this.f10797u = tVar.f10745t;
        List list = tVar.f10746u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        r rVar = tVar.v;
        this.f10798w = rVar;
        this.f10799x = tVar.f10747w;
        this.f10800y = tVar.f10748x;
        this.f10801z = tVar.f10749y;
        this.A = tVar.f10750z;
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
        char c10;
        int i7;
        String str;
        String str2;
        String str3;
        if (uVar == null) {
            return "null";
        }
        int i10 = uVar.f10782e;
        h9.i0 i0Var = uVar.f10781c;
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
        int i17 = uVar.f10801z;
        r rVar = uVar.f10798w;
        String str5 = uVar.f10787k;
        int i18 = uVar.f10786j;
        String str6 = uVar.f10789m;
        String str7 = uVar.f10794r;
        int i19 = uVar.f10783f;
        f5.g gVar = new f5.g(String.valueOf(','));
        StringBuilder m10 = e2.m("id=");
        m10.append(uVar.f10779a);
        m10.append(", mimeType=");
        m10.append(uVar.f10795s);
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
                UUID uuid = rVar.f10710a[i20].f10661b;
                if (uuid.equals(l.f10520c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(l.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(l.f10522f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(l.f10521e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(l.f10519b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            c10 = 0;
            m10.append(", drm=[");
            gVar.a(m10, linkedHashSet.iterator());
            m10.append(']');
        } else {
            c10 = 0;
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
        int i21 = j9.c.f17361a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            m10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f11);
            String str8 = h2.l0.f13812a;
            m10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (mVar != null) {
            int i22 = mVar.f10547f;
            int i23 = mVar.f10546e;
            if ((i23 != -1 && i22 != -1) || mVar.d()) {
                m10.append(", color=");
                if (mVar.d()) {
                    String b10 = m.b(mVar.f10543a);
                    String a10 = m.a(mVar.f10544b);
                    String c11 = m.c(mVar.f10545c);
                    String str9 = h2.l0.f13812a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a10 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i23 != -1 && i22 != -1) {
                    str3 = e2.j(i23, "/", i22);
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
            gVar.a(m10, h9.o.y(i0Var, new ci.v(8)).iterator());
            m10.append("]");
        }
        if (i10 != 0) {
            m10.append(", selectionFlags=[");
            String str10 = h2.l0.f13812a;
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
            gVar.a(m10, arrayList.iterator());
            m10.append("]");
        }
        if (i19 != 0) {
            m10.append(", roleFlags=[");
            String str11 = h2.l0.f13812a;
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
            gVar.a(m10, arrayList2.iterator());
            m10.append("]");
        } else {
            i7 = i19;
        }
        if ((i7 & 32768) != 0) {
            m10.append(", auxiliaryTrackType=");
            int i24 = uVar.f10784g;
            String str12 = h2.l0.f13812a;
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
        obj.f10728a = this.f10779a;
        obj.f10729b = this.f10780b;
        obj.f10730c = this.f10781c;
        obj.d = this.d;
        obj.f10731e = this.f10782e;
        obj.f10732f = this.f10783f;
        obj.h = this.h;
        obj.f10734i = this.f10785i;
        obj.f10735j = this.f10787k;
        obj.f10736k = this.f10788l;
        obj.f10737l = this.f10789m;
        obj.f10742q = this.f10794r;
        obj.f10743r = this.f10795s;
        obj.f10744s = this.f10796t;
        obj.f10745t = this.f10797u;
        obj.f10746u = this.v;
        obj.v = this.f10798w;
        obj.f10747w = this.f10799x;
        obj.f10748x = this.f10800y;
        obj.f10749y = this.f10801z;
        obj.f10750z = this.A;
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
        obj.f10738m = this.f10790n;
        obj.f10739n = this.f10791o;
        obj.f10741p = this.f10792p;
        obj.f10740o = this.f10793q;
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
        int h = s0.h(this.f10795s);
        String str3 = uVar.f10779a;
        q0 q0Var = uVar.f10788l;
        h9.i0 i0Var = uVar.f10781c;
        int i11 = uVar.R;
        int i12 = uVar.S;
        String str4 = uVar.f10780b;
        if (str4 == null) {
            str4 = this.f10780b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f10781c;
        }
        if ((h != 3 && h != 1) || (str = uVar.d) == null) {
            str = this.d;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = uVar.h;
        }
        int i14 = this.f10785i;
        if (i14 == -1) {
            i14 = uVar.f10785i;
        }
        String str5 = this.f10787k;
        if (str5 == null) {
            String w10 = h2.l0.w(h, uVar.f10787k);
            if (h2.l0.d0(w10).length == 1) {
                str5 = w10;
            }
        }
        String str6 = this.f10789m;
        if (str6 == null) {
            str6 = uVar.f10789m;
        }
        q0 q0Var2 = this.f10788l;
        if (q0Var2 != null) {
            q0Var = q0Var2.b(q0Var);
        }
        float f10 = this.D;
        if (f10 == -1.0f && h == 2) {
            f10 = uVar.D;
        }
        int i15 = this.f10782e | uVar.f10782e;
        h9.i0 i0Var2 = i0Var;
        int i16 = uVar.f10783f | this.f10783f;
        r rVar2 = uVar.f10798w;
        ArrayList arrayList = new ArrayList();
        if (rVar2 != null) {
            String str7 = rVar2.f10712c;
            q[] qVarArr = rVar2.f10710a;
            int length = qVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                q qVar = qVarArr[i18];
                int i19 = length;
                if (qVar.f10663e != null) {
                    arrayList.add(qVar);
                }
                i17 = i18 + 1;
                length = i19;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        r rVar3 = this.f10798w;
        if (rVar3 != null) {
            if (str2 == null) {
                str2 = rVar3.f10712c;
            }
            int size = arrayList.size();
            q[] qVarArr2 = rVar3.f10710a;
            String str8 = str2;
            int length2 = qVarArr2.length;
            int i20 = 0;
            while (i20 < length2) {
                int i21 = i20;
                q qVar2 = qVarArr2[i21];
                int i22 = length2;
                if (qVar2.f10663e != null) {
                    UUID uuid = qVar2.f10661b;
                    i10 = i11;
                    int i23 = 0;
                    while (true) {
                        if (i23 < size) {
                            i7 = size;
                            if (((q) arrayList.get(i23)).f10661b.equals(uuid)) {
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
        a10.f10728a = str3;
        a10.f10729b = str4;
        a10.f10730c = h9.i0.q(i0Var2);
        a10.d = str;
        a10.f10731e = i15;
        a10.f10732f = i16;
        a10.h = i13;
        a10.f10734i = i14;
        a10.f10735j = str5;
        a10.f10736k = q0Var;
        a10.f10737l = str6;
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
            if ((i10 == 0 || (i7 = uVar.U) == 0 || i10 == i7) && this.f10782e == uVar.f10782e && this.f10783f == uVar.f10783f && this.f10784g == uVar.f10784g && this.h == uVar.h && this.f10785i == uVar.f10785i && this.f10796t == uVar.f10796t && this.f10799x == uVar.f10799x && this.f10801z == uVar.f10801z && this.A == uVar.A && this.B == uVar.B && this.C == uVar.C && this.E == uVar.E && this.H == uVar.H && this.J == uVar.J && this.K == uVar.K && this.L == uVar.L && this.M == uVar.M && this.N == uVar.N && this.O == uVar.O && this.P == uVar.P && this.R == uVar.R && this.S == uVar.S && this.T == uVar.T && Float.compare(this.D, uVar.D) == 0 && Float.compare(this.F, uVar.F) == 0 && Objects.equals(this.f10779a, uVar.f10779a) && Objects.equals(this.f10780b, uVar.f10780b) && this.f10781c.equals(uVar.f10781c) && Objects.equals(this.f10787k, uVar.f10787k) && Objects.equals(this.f10789m, uVar.f10789m) && Objects.equals(this.f10794r, uVar.f10794r) && Objects.equals(this.f10795s, uVar.f10795s) && Objects.equals(this.d, uVar.d) && Arrays.equals(this.G, uVar.G) && Objects.equals(this.f10788l, uVar.f10788l) && Objects.equals(this.I, uVar.I) && Objects.equals(this.f10798w, uVar.f10798w) && b(uVar)) {
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
            String str = this.f10779a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (527 + hashCode) * 31;
            String str2 = this.f10780b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f10781c.hashCode() + ((i10 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (((((((((((hashCode8 + hashCode3) * 31) + this.f10782e) * 31) + this.f10783f) * 31) + this.f10784g) * 31) + this.h) * 31) + this.f10785i) * 31;
            String str4 = this.f10787k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            q0 q0Var = this.f10788l;
            if (q0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = q0Var.hashCode();
            }
            int i13 = (i12 + hashCode5) * 961;
            String str5 = this.f10789m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str6 = this.f10794r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str7 = this.f10795s;
            if (str7 != null) {
                i7 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i15 + i7) * 31) + this.f10796t) * 31) + ((int) this.f10799x)) * 31) + this.f10801z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f10779a);
        sb2.append(", ");
        sb2.append(this.f10780b);
        sb2.append(", ");
        sb2.append(this.f10794r);
        sb2.append(", ");
        sb2.append(this.f10795s);
        sb2.append(", ");
        sb2.append(this.f10787k);
        sb2.append(", ");
        sb2.append(this.f10786j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f10801z);
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
