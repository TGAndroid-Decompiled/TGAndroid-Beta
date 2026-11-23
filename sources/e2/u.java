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
    public static final String f10757a0 = Integer.toString(4, 36);
    public static final String f10758b0 = Integer.toString(5, 36);
    public static final String f10759c0 = Integer.toString(6, 36);
    public static final String f10760d0 = Integer.toString(7, 36);
    public static final String f10761e0;
    public static final String f10762f0;
    public static final String f10763g0;
    public static final String f10764h0;
    public static final String f10765i0;
    public static final String f10766j0;
    public static final String f10767k0;
    public static final String f10768l0;
    public static final String m0;
    public static final String f10769n0;
    public static final String f10770o0;
    public static final String f10771p0;
    public static final String f10772q0;
    public static final String f10773r0;
    public static final String f10774s0;
    public static final String f10775t0;
    public static final String f10776u0;
    public static final String f10777v0;
    public static final String f10778w0;
    public static final String f10779x0;
    public static final String f10780y0;
    public static final String f10781z0;
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
    public final String f10782a;
    public final String f10783b;
    public final h9.i0 f10784c;
    public final String d;
    public final int f10785e;
    public final int f10786f;
    public final int f10787g;
    public final int h;
    public final int f10788i;
    public final int f10789j;
    public final String f10790k;
    public final q0 f10791l;
    public final String f10792m;
    public boolean f10793n;
    public long f10794o;
    public int f10795p;
    public String f10796q;
    public final String f10797r;
    public final String f10798s;
    public final int f10799t;
    public final int f10800u;
    public final List v;
    public final r f10801w;
    public final long f10802x;
    public final boolean f10803y;
    public final int f10804z;

    static {
        Integer.toString(8, 36);
        f10761e0 = Integer.toString(9, 36);
        f10762f0 = Integer.toString(10, 36);
        f10763g0 = Integer.toString(11, 36);
        f10764h0 = Integer.toString(12, 36);
        f10765i0 = Integer.toString(13, 36);
        f10766j0 = Integer.toString(14, 36);
        f10767k0 = Integer.toString(15, 36);
        f10768l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f10769n0 = Integer.toString(18, 36);
        f10770o0 = Integer.toString(19, 36);
        f10771p0 = Integer.toString(20, 36);
        f10772q0 = Integer.toString(21, 36);
        f10773r0 = Integer.toString(22, 36);
        f10774s0 = Integer.toString(23, 36);
        f10775t0 = Integer.toString(24, 36);
        f10776u0 = Integer.toString(25, 36);
        f10777v0 = Integer.toString(26, 36);
        f10778w0 = Integer.toString(27, 36);
        f10779x0 = Integer.toString(28, 36);
        f10780y0 = Integer.toString(29, 36);
        f10781z0 = Integer.toString(30, 36);
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
        this.f10782a = tVar.f10731a;
        String T = h2.l0.T(tVar.d);
        this.d = T;
        if (tVar.f10733c.isEmpty() && tVar.f10732b != null) {
            this.f10784c = h9.i0.u(new x(T, tVar.f10732b));
            this.f10783b = tVar.f10732b;
        } else if (!tVar.f10733c.isEmpty() && tVar.f10732b == null) {
            h9.i0 i0Var = tVar.f10733c;
            this.f10784c = i0Var;
            int size = i0Var.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    Object obj = i0Var.get(i7);
                    i7++;
                    x xVar = (x) obj;
                    if (TextUtils.equals(xVar.f10825a, T)) {
                        str = xVar.f10826b;
                        break;
                    }
                } else {
                    str = ((x) i0Var.get(0)).f10826b;
                    break;
                }
            }
            this.f10783b = str;
        } else {
            if (!tVar.f10733c.isEmpty() || tVar.f10732b != null) {
                for (int i10 = 0; i10 < tVar.f10733c.size(); i10++) {
                    if (!((x) tVar.f10733c.get(i10)).f10826b.equals(tVar.f10732b)) {
                    }
                }
                z10 = false;
                la.p(z10);
                this.f10784c = tVar.f10733c;
                this.f10783b = tVar.f10732b;
            }
            z10 = true;
            la.p(z10);
            this.f10784c = tVar.f10733c;
            this.f10783b = tVar.f10732b;
        }
        this.f10785e = tVar.f10734e;
        if (tVar.f10736g != 0 && (tVar.f10735f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        la.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f10786f = tVar.f10735f;
        this.f10787g = tVar.f10736g;
        int i11 = tVar.h;
        this.h = i11;
        int i12 = tVar.f10737i;
        this.f10788i = i12;
        this.f10789j = i12 != -1 ? i12 : i11;
        this.f10790k = tVar.f10738j;
        this.f10791l = tVar.f10739k;
        this.f10792m = tVar.f10740l;
        this.f10793n = tVar.f10741m;
        this.f10794o = tVar.f10742n;
        this.f10795p = tVar.f10744p;
        this.f10796q = tVar.f10743o;
        this.f10797r = tVar.f10745q;
        this.f10798s = tVar.f10746r;
        this.f10799t = tVar.f10747s;
        this.f10800u = tVar.f10748t;
        List list = tVar.f10749u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        r rVar = tVar.v;
        this.f10801w = rVar;
        this.f10802x = tVar.f10750w;
        this.f10803y = tVar.f10751x;
        this.f10804z = tVar.f10752y;
        this.A = tVar.f10753z;
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
        int i10 = uVar.f10785e;
        h9.i0 i0Var = uVar.f10784c;
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
        int i17 = uVar.f10804z;
        r rVar = uVar.f10801w;
        String str5 = uVar.f10790k;
        int i18 = uVar.f10789j;
        String str6 = uVar.f10792m;
        String str7 = uVar.f10797r;
        int i19 = uVar.f10786f;
        f5.g gVar = new f5.g(String.valueOf(','));
        StringBuilder m10 = e2.m("id=");
        m10.append(uVar.f10782a);
        m10.append(", mimeType=");
        m10.append(uVar.f10798s);
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
                UUID uuid = rVar.f10713a[i20].f10664b;
                if (uuid.equals(l.f10523c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(l.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(l.f10525f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(l.f10524e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(l.f10522b)) {
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
        int i21 = j9.c.f17364a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            m10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f11);
            String str8 = h2.l0.f13815a;
            m10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (mVar != null) {
            int i22 = mVar.f10550f;
            int i23 = mVar.f10549e;
            if ((i23 != -1 && i22 != -1) || mVar.d()) {
                m10.append(", color=");
                if (mVar.d()) {
                    String b10 = m.b(mVar.f10546a);
                    String a10 = m.a(mVar.f10547b);
                    String c11 = m.c(mVar.f10548c);
                    String str9 = h2.l0.f13815a;
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
            String str10 = h2.l0.f13815a;
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
            String str11 = h2.l0.f13815a;
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
            int i24 = uVar.f10787g;
            String str12 = h2.l0.f13815a;
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
        obj.f10731a = this.f10782a;
        obj.f10732b = this.f10783b;
        obj.f10733c = this.f10784c;
        obj.d = this.d;
        obj.f10734e = this.f10785e;
        obj.f10735f = this.f10786f;
        obj.h = this.h;
        obj.f10737i = this.f10788i;
        obj.f10738j = this.f10790k;
        obj.f10739k = this.f10791l;
        obj.f10740l = this.f10792m;
        obj.f10745q = this.f10797r;
        obj.f10746r = this.f10798s;
        obj.f10747s = this.f10799t;
        obj.f10748t = this.f10800u;
        obj.f10749u = this.v;
        obj.v = this.f10801w;
        obj.f10750w = this.f10802x;
        obj.f10751x = this.f10803y;
        obj.f10752y = this.f10804z;
        obj.f10753z = this.A;
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
        obj.f10741m = this.f10793n;
        obj.f10742n = this.f10794o;
        obj.f10744p = this.f10795p;
        obj.f10743o = this.f10796q;
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
        int h = s0.h(this.f10798s);
        String str3 = uVar.f10782a;
        q0 q0Var = uVar.f10791l;
        h9.i0 i0Var = uVar.f10784c;
        int i11 = uVar.R;
        int i12 = uVar.S;
        String str4 = uVar.f10783b;
        if (str4 == null) {
            str4 = this.f10783b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f10784c;
        }
        if ((h != 3 && h != 1) || (str = uVar.d) == null) {
            str = this.d;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = uVar.h;
        }
        int i14 = this.f10788i;
        if (i14 == -1) {
            i14 = uVar.f10788i;
        }
        String str5 = this.f10790k;
        if (str5 == null) {
            String w10 = h2.l0.w(h, uVar.f10790k);
            if (h2.l0.d0(w10).length == 1) {
                str5 = w10;
            }
        }
        String str6 = this.f10792m;
        if (str6 == null) {
            str6 = uVar.f10792m;
        }
        q0 q0Var2 = this.f10791l;
        if (q0Var2 != null) {
            q0Var = q0Var2.b(q0Var);
        }
        float f10 = this.D;
        if (f10 == -1.0f && h == 2) {
            f10 = uVar.D;
        }
        int i15 = this.f10785e | uVar.f10785e;
        h9.i0 i0Var2 = i0Var;
        int i16 = uVar.f10786f | this.f10786f;
        r rVar2 = uVar.f10801w;
        ArrayList arrayList = new ArrayList();
        if (rVar2 != null) {
            String str7 = rVar2.f10715c;
            q[] qVarArr = rVar2.f10713a;
            int length = qVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                q qVar = qVarArr[i18];
                int i19 = length;
                if (qVar.f10666e != null) {
                    arrayList.add(qVar);
                }
                i17 = i18 + 1;
                length = i19;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        r rVar3 = this.f10801w;
        if (rVar3 != null) {
            if (str2 == null) {
                str2 = rVar3.f10715c;
            }
            int size = arrayList.size();
            q[] qVarArr2 = rVar3.f10713a;
            String str8 = str2;
            int length2 = qVarArr2.length;
            int i20 = 0;
            while (i20 < length2) {
                int i21 = i20;
                q qVar2 = qVarArr2[i21];
                int i22 = length2;
                if (qVar2.f10666e != null) {
                    UUID uuid = qVar2.f10664b;
                    i10 = i11;
                    int i23 = 0;
                    while (true) {
                        if (i23 < size) {
                            i7 = size;
                            if (((q) arrayList.get(i23)).f10664b.equals(uuid)) {
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
        a10.f10731a = str3;
        a10.f10732b = str4;
        a10.f10733c = h9.i0.q(i0Var2);
        a10.d = str;
        a10.f10734e = i15;
        a10.f10735f = i16;
        a10.h = i13;
        a10.f10737i = i14;
        a10.f10738j = str5;
        a10.f10739k = q0Var;
        a10.f10740l = str6;
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
            if ((i10 == 0 || (i7 = uVar.U) == 0 || i10 == i7) && this.f10785e == uVar.f10785e && this.f10786f == uVar.f10786f && this.f10787g == uVar.f10787g && this.h == uVar.h && this.f10788i == uVar.f10788i && this.f10799t == uVar.f10799t && this.f10802x == uVar.f10802x && this.f10804z == uVar.f10804z && this.A == uVar.A && this.B == uVar.B && this.C == uVar.C && this.E == uVar.E && this.H == uVar.H && this.J == uVar.J && this.K == uVar.K && this.L == uVar.L && this.M == uVar.M && this.N == uVar.N && this.O == uVar.O && this.P == uVar.P && this.R == uVar.R && this.S == uVar.S && this.T == uVar.T && Float.compare(this.D, uVar.D) == 0 && Float.compare(this.F, uVar.F) == 0 && Objects.equals(this.f10782a, uVar.f10782a) && Objects.equals(this.f10783b, uVar.f10783b) && this.f10784c.equals(uVar.f10784c) && Objects.equals(this.f10790k, uVar.f10790k) && Objects.equals(this.f10792m, uVar.f10792m) && Objects.equals(this.f10797r, uVar.f10797r) && Objects.equals(this.f10798s, uVar.f10798s) && Objects.equals(this.d, uVar.d) && Arrays.equals(this.G, uVar.G) && Objects.equals(this.f10791l, uVar.f10791l) && Objects.equals(this.I, uVar.I) && Objects.equals(this.f10801w, uVar.f10801w) && b(uVar)) {
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
            String str = this.f10782a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (527 + hashCode) * 31;
            String str2 = this.f10783b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f10784c.hashCode() + ((i10 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (((((((((((hashCode8 + hashCode3) * 31) + this.f10785e) * 31) + this.f10786f) * 31) + this.f10787g) * 31) + this.h) * 31) + this.f10788i) * 31;
            String str4 = this.f10790k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            q0 q0Var = this.f10791l;
            if (q0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = q0Var.hashCode();
            }
            int i13 = (i12 + hashCode5) * 961;
            String str5 = this.f10792m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str6 = this.f10797r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str7 = this.f10798s;
            if (str7 != null) {
                i7 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i15 + i7) * 31) + this.f10799t) * 31) + ((int) this.f10802x)) * 31) + this.f10804z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f10782a);
        sb2.append(", ");
        sb2.append(this.f10783b);
        sb2.append(", ");
        sb2.append(this.f10797r);
        sb2.append(", ");
        sb2.append(this.f10798s);
        sb2.append(", ");
        sb2.append(this.f10790k);
        sb2.append(", ");
        sb2.append(this.f10789j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f10804z);
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
