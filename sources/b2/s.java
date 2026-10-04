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
    public static final String f3524a0 = Integer.toString(5, 36);
    public static final String f3525b0 = Integer.toString(6, 36);
    public static final String f3526c0 = Integer.toString(7, 36);
    public static final String f3527d0;
    public static final String f3528e0;
    public static final String f3529f0;
    public static final String f3530g0;
    public static final String f3531h0;
    public static final String f3532i0;
    public static final String f3533j0;
    public static final String f3534k0;
    public static final String f3535l0;
    public static final String m0;
    public static final String f3536n0;
    public static final String f3537o0;
    public static final String f3538p0;
    public static final String f3539q0;
    public static final String f3540r0;
    public static final String f3541s0;
    public static final String f3542t0;
    public static final String f3543u0;
    public static final String f3544v0;
    public static final String f3545w0;
    public static final String f3546x0;
    public static final String f3547y0;
    public static final String f3548z0;
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
    public final String f3549a;
    public final String f3550b;
    public final e9.i0 f3551c;
    public final String d;
    public final int f3552e;
    public final int f3553f;
    public final int f3554g;
    public final int h;
    public final int f3555i;
    public final int f3556j;
    public final String f3557k;
    public final p0 f3558l;
    public boolean f3559m;
    public long f3560n;
    public int f3561o;
    public String f3562p;
    public final String f3563q;
    public final String f3564r;
    public final int f3565s;
    public final int f3566t;
    public final List f3567u;
    public final o v;
    public final long f3568w;
    public final boolean f3569x;
    public final int f3570y;
    public final int f3571z;

    static {
        e2.d0.J(8);
        f3527d0 = Integer.toString(9, 36);
        f3528e0 = Integer.toString(10, 36);
        f3529f0 = Integer.toString(11, 36);
        f3530g0 = Integer.toString(12, 36);
        f3531h0 = Integer.toString(13, 36);
        f3532i0 = Integer.toString(14, 36);
        f3533j0 = Integer.toString(15, 36);
        f3534k0 = Integer.toString(16, 36);
        f3535l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f3536n0 = Integer.toString(19, 36);
        f3537o0 = Integer.toString(20, 36);
        f3538p0 = Integer.toString(21, 36);
        f3539q0 = Integer.toString(22, 36);
        f3540r0 = Integer.toString(23, 36);
        f3541s0 = Integer.toString(24, 36);
        f3542t0 = Integer.toString(25, 36);
        f3543u0 = Integer.toString(26, 36);
        f3544v0 = Integer.toString(27, 36);
        f3545w0 = Integer.toString(28, 36);
        f3546x0 = Integer.toString(29, 36);
        f3547y0 = Integer.toString(30, 36);
        f3548z0 = Integer.toString(31, 36);
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
        this.f3549a = rVar.f3492a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f3494c.isEmpty() && rVar.f3493b != null) {
            this.f3551c = e9.i0.z(new w(R, rVar.f3493b));
            this.f3550b = rVar.f3493b;
        } else if (!rVar.f3494c.isEmpty() && rVar.f3493b == null) {
            e9.i0 i0Var = rVar.f3494c;
            this.f3551c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f3599a, R)) {
                        str = wVar.f3600b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f3600b;
                    break;
                }
            }
            this.f3550b = str;
        } else {
            if (!rVar.f3494c.isEmpty() || rVar.f3493b != null) {
                for (int i11 = 0; i11 < rVar.f3494c.size(); i11++) {
                    if (!((w) rVar.f3494c.get(i11)).f3600b.equals(rVar.f3493b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f3551c = rVar.f3494c;
                this.f3550b = rVar.f3493b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f3551c = rVar.f3494c;
            this.f3550b = rVar.f3493b;
        }
        this.f3552e = rVar.f3495e;
        if (rVar.f3497g != 0 && (rVar.f3496f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f3553f = rVar.f3496f;
        this.f3554g = rVar.f3497g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f3498i;
        this.f3555i = i13;
        this.f3556j = i13 != -1 ? i13 : i12;
        this.f3557k = rVar.f3499j;
        this.f3558l = rVar.f3500k;
        this.f3559m = rVar.f3501l;
        this.f3560n = rVar.f3502m;
        this.f3561o = rVar.f3504o;
        this.f3562p = rVar.f3503n;
        this.f3563q = rVar.f3505p;
        this.f3564r = rVar.f3506q;
        this.f3565s = rVar.f3507r;
        this.f3566t = rVar.f3508s;
        List list = rVar.f3509t;
        this.f3567u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f3510u;
        this.v = oVar;
        this.f3568w = rVar.v;
        this.f3569x = rVar.f3511w;
        this.f3570y = rVar.f3512x;
        this.f3571z = rVar.f3513y;
        this.A = rVar.f3514z;
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
        char c10;
        int i10;
        String str;
        String str2;
        String str3;
        o oVar;
        if (sVar == null) {
            return "null";
        }
        int i11 = sVar.f3552e;
        e9.i0 i0Var = sVar.f3551c;
        String str4 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.f3571z;
        int i18 = sVar.f3570y;
        o oVar2 = sVar.v;
        String str5 = sVar.f3557k;
        int i19 = sVar.f3556j;
        String str6 = sVar.f3563q;
        int i20 = sVar.f3553f;
        xa.c cVar = new xa.c(String.valueOf(','));
        StringBuilder v = a4.a.v("id=");
        v.append(sVar.f3549a);
        v.append(", mimeType=");
        v.append(sVar.f3564r);
        if (str6 != null) {
            v.append(", container=");
            v.append(str6);
        }
        if (i19 != -1) {
            v.append(", bitrate=");
            v.append(i19);
        }
        if (str5 != null) {
            v.append(", codecs=");
            v.append(str5);
        }
        if (oVar2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i21 = 0;
            c10 = 0;
            while (i21 < oVar2.d) {
                UUID uuid = oVar2.f3416a[i21].f3368b;
                if (uuid.equals(i.f3255b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f3256c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.f3257e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f3254a)) {
                    linkedHashSet.add("universal");
                } else {
                    oVar = oVar2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i21++;
                    oVar2 = oVar;
                }
                oVar = oVar2;
                i21++;
                oVar2 = oVar;
            }
            v.append(", drm=[");
            cVar.k(v, linkedHashSet.iterator());
            v.append(']');
        } else {
            c10 = 0;
        }
        if (i18 != -1 && i17 != -1) {
            v.append(", res=");
            v.append(i18);
            v.append("x");
            v.append(i17);
        }
        if (i16 != -1 && i15 != -1) {
            v.append(", decRes=");
            v.append(i16);
            v.append("x");
            v.append(i15);
        }
        double d = f10;
        int i22 = g9.c.f10358a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            v.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.d0.f8538a;
            v.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f3277f;
            int i24 = jVar.f3276e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                v.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f3273a);
                    String a2 = j.a(jVar.f3274b);
                    String c11 = j.c(jVar.f3275c);
                    String str8 = e2.d0.f8538a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i24 != -1 && i23 != -1) {
                    str3 = a4.a.l(i24, i23, "/");
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
        if (i14 != -1) {
            v.append(", maxSubLayers=");
            v.append(i14);
        }
        if (i13 != -1) {
            v.append(", channels=");
            v.append(i13);
        }
        if (i12 != -1) {
            v.append(", sample_rate=");
            v.append(i12);
        }
        if (str4 != null) {
            v.append(", language=");
            v.append(str4);
        }
        if (!i0Var.isEmpty()) {
            v.append(", labels=[");
            cVar.k(v, e9.q.w(i0Var, new ai.w1(10)).iterator());
            v.append("]");
        }
        if (i11 != 0) {
            v.append(", selectionFlags=[");
            String str9 = e2.d0.f8538a;
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
            cVar.k(v, arrayList.iterator());
            v.append("]");
        }
        if (i20 != 0) {
            v.append(", roleFlags=[");
            String str10 = e2.d0.f8538a;
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
            cVar.k(v, arrayList2.iterator());
            v.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            v.append(", auxiliaryTrackType=");
            int i25 = sVar.f3554g;
            String str11 = e2.d0.f8538a;
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
            v.append(str);
        }
        return v.toString();
    }

    public final r a() {
        ?? obj = new Object();
        obj.f3492a = this.f3549a;
        obj.f3493b = this.f3550b;
        obj.f3494c = this.f3551c;
        obj.d = this.d;
        obj.f3495e = this.f3552e;
        obj.f3496f = this.f3553f;
        obj.h = this.h;
        obj.f3498i = this.f3555i;
        obj.f3499j = this.f3557k;
        obj.f3500k = this.f3558l;
        obj.f3505p = this.f3563q;
        obj.f3506q = this.f3564r;
        obj.f3507r = this.f3565s;
        obj.f3508s = this.f3566t;
        obj.f3509t = this.f3567u;
        obj.f3510u = this.v;
        obj.v = this.f3568w;
        obj.f3511w = this.f3569x;
        obj.f3512x = this.f3570y;
        obj.f3513y = this.f3571z;
        obj.f3514z = this.A;
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
        obj.f3501l = this.f3559m;
        obj.f3502m = this.f3560n;
        obj.f3504o = this.f3561o;
        obj.f3503n = this.f3562p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f3567u;
        if (list.size() != sVar.f3567u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f3567u.get(i10))) {
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
        int h = r0.h(this.f3564r);
        String str3 = sVar.f3549a;
        p0 p0Var = sVar.f3558l;
        e9.i0 i0Var = sVar.f3551c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f3550b;
        if (str4 == null) {
            str4 = this.f3550b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f3551c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f3555i;
        if (i15 == -1) {
            i15 = sVar.f3555i;
        }
        String str5 = this.f3557k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f3557k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f3558l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.f3552e | sVar.f3552e;
        int i17 = this.f3553f | sVar.f3553f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f3418c;
            n[] nVarArr = oVar2.f3416a;
            int length = nVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                n nVar = nVarArr[i19];
                int i20 = length;
                if (nVar.f3370e != null) {
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
                str2 = oVar3.f3418c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f3416a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.f3370e != null) {
                    UUID uuid = nVar2.f3368b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f3368b.equals(uuid)) {
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
        a2.f3492a = str3;
        a2.f3493b = str4;
        a2.f3494c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.f3495e = i16;
        a2.f3496f = i17;
        a2.h = i14;
        a2.f3498i = i15;
        a2.f3499j = str5;
        a2.f3500k = p0Var;
        a2.f3510u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.f3552e == sVar.f3552e && this.f3553f == sVar.f3553f && this.f3554g == sVar.f3554g && this.h == sVar.h && this.f3555i == sVar.f3555i && this.f3565s == sVar.f3565s && this.f3568w == sVar.f3568w && this.f3570y == sVar.f3570y && this.f3571z == sVar.f3571z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f3549a, sVar.f3549a) && Objects.equals(this.f3550b, sVar.f3550b) && this.f3551c.equals(sVar.f3551c) && Objects.equals(this.f3557k, sVar.f3557k) && Objects.equals(this.f3563q, sVar.f3563q) && Objects.equals(this.f3564r, sVar.f3564r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f3558l, sVar.f3558l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f3549a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f3550b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f3551c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.f3552e) * 31) + this.f3553f) * 31) + this.f3554g) * 31) + this.h) * 31) + this.f3555i) * 31;
            String str4 = this.f3557k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f3558l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f3563q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f3564r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f3565s) * 31) + ((int) this.f3568w)) * 31) + this.f3570y) * 31) + this.f3571z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3549a);
        sb2.append(", ");
        sb2.append(this.f3550b);
        sb2.append(", ");
        sb2.append(this.f3563q);
        sb2.append(", ");
        sb2.append(this.f3564r);
        sb2.append(", ");
        sb2.append(this.f3557k);
        sb2.append(", ");
        sb2.append(this.f3556j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f3570y);
        sb2.append(", ");
        sb2.append(this.f3571z);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append("], [");
        sb2.append(this.J);
        sb2.append(", ");
        return a4.a.o(this.K, "])", sb2);
    }
}
