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
    public static final String f3267a0 = Integer.toString(5, 36);
    public static final String f3268b0 = Integer.toString(6, 36);
    public static final String f3269c0 = Integer.toString(7, 36);
    public static final String f3270d0;
    public static final String f3271e0;
    public static final String f3272f0;
    public static final String f3273g0;
    public static final String f3274h0;
    public static final String f3275i0;
    public static final String f3276j0;
    public static final String f3277k0;
    public static final String f3278l0;
    public static final String m0;
    public static final String f3279n0;
    public static final String f3280o0;
    public static final String f3281p0;
    public static final String f3282q0;
    public static final String f3283r0;
    public static final String f3284s0;
    public static final String f3285t0;
    public static final String f3286u0;
    public static final String f3287v0;
    public static final String f3288w0;
    public static final String f3289x0;
    public static final String f3290y0;
    public static final String f3291z0;
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
    public final String f3292a;
    public final String f3293b;
    public final e9.i0 f3294c;
    public final String d;
    public final int e;
    public final int f3295f;
    public final int f3296g;
    public final int h;
    public final int f3297i;
    public final int f3298j;
    public final String f3299k;
    public final p0 f3300l;
    public boolean f3301m;
    public long f3302n;
    public int f3303o;
    public String f3304p;
    public final String f3305q;
    public final String f3306r;
    public final int f3307s;
    public final int f3308t;
    public final List f3309u;
    public final o v;
    public final long f3310w;
    public final boolean f3311x;
    public final int f3312y;
    public final int f3313z;

    static {
        e2.d0.J(8);
        f3270d0 = Integer.toString(9, 36);
        f3271e0 = Integer.toString(10, 36);
        f3272f0 = Integer.toString(11, 36);
        f3273g0 = Integer.toString(12, 36);
        f3274h0 = Integer.toString(13, 36);
        f3275i0 = Integer.toString(14, 36);
        f3276j0 = Integer.toString(15, 36);
        f3277k0 = Integer.toString(16, 36);
        f3278l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        f3279n0 = Integer.toString(19, 36);
        f3280o0 = Integer.toString(20, 36);
        f3281p0 = Integer.toString(21, 36);
        f3282q0 = Integer.toString(22, 36);
        f3283r0 = Integer.toString(23, 36);
        f3284s0 = Integer.toString(24, 36);
        f3285t0 = Integer.toString(25, 36);
        f3286u0 = Integer.toString(26, 36);
        f3287v0 = Integer.toString(27, 36);
        f3288w0 = Integer.toString(28, 36);
        f3289x0 = Integer.toString(29, 36);
        f3290y0 = Integer.toString(30, 36);
        f3291z0 = Integer.toString(31, 36);
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
        this.f3292a = rVar.f3237a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.f3239c.isEmpty() && rVar.f3238b != null) {
            this.f3294c = e9.i0.z(new w(R, rVar.f3238b));
            this.f3293b = rVar.f3238b;
        } else if (!rVar.f3239c.isEmpty() && rVar.f3238b == null) {
            e9.i0 i0Var = rVar.f3239c;
            this.f3294c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = i0Var.get(i10);
                    i10++;
                    w wVar = (w) obj;
                    if (TextUtils.equals(wVar.f3338a, R)) {
                        str = wVar.f3339b;
                        break;
                    }
                } else {
                    str = ((w) i0Var.get(0)).f3339b;
                    break;
                }
            }
            this.f3293b = str;
        } else {
            if (!rVar.f3239c.isEmpty() || rVar.f3238b != null) {
                for (int i11 = 0; i11 < rVar.f3239c.size(); i11++) {
                    if (!((w) rVar.f3239c.get(i11)).f3339b.equals(rVar.f3238b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.f3294c = rVar.f3239c;
                this.f3293b = rVar.f3238b;
            }
            z10 = true;
            e2.d.g(z10);
            this.f3294c = rVar.f3239c;
            this.f3293b = rVar.f3238b;
        }
        this.e = rVar.e;
        if (rVar.f3241g != 0 && (rVar.f3240f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f3295f = rVar.f3240f;
        this.f3296g = rVar.f3241g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.f3242i;
        this.f3297i = i13;
        this.f3298j = i13 != -1 ? i13 : i12;
        this.f3299k = rVar.f3243j;
        this.f3300l = rVar.f3244k;
        this.f3301m = rVar.f3245l;
        this.f3302n = rVar.f3246m;
        this.f3303o = rVar.f3248o;
        this.f3304p = rVar.f3247n;
        this.f3305q = rVar.f3249p;
        this.f3306r = rVar.f3250q;
        this.f3307s = rVar.f3251r;
        this.f3308t = rVar.f3252s;
        List list = rVar.f3253t;
        this.f3309u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.f3254u;
        this.v = oVar;
        this.f3310w = rVar.v;
        this.f3311x = rVar.f3255w;
        this.f3312y = rVar.f3256x;
        this.f3313z = rVar.f3257y;
        this.A = rVar.f3258z;
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
        int i11 = sVar.e;
        e9.i0 i0Var = sVar.f3294c;
        String str4 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.f3313z;
        int i18 = sVar.f3312y;
        o oVar2 = sVar.v;
        String str5 = sVar.f3299k;
        int i19 = sVar.f3298j;
        String str6 = sVar.f3305q;
        int i20 = sVar.f3295f;
        xa.c cVar = new xa.c(String.valueOf(','));
        StringBuilder v = a4.a.v("id=");
        v.append(sVar.f3292a);
        v.append(", mimeType=");
        v.append(sVar.f3306r);
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
                UUID uuid = oVar2.f3164a[i21].f3118b;
                if (uuid.equals(i.f3015b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f3016c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f3014a)) {
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
            cVar.j(v, linkedHashSet.iterator());
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
        int i22 = g9.c.f9527a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            v.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.d0.f7885a;
            v.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f3033f;
            int i24 = jVar.e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                v.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.f3030a);
                    String a2 = j.a(jVar.f3031b);
                    String c11 = j.c(jVar.f3032c);
                    String str8 = e2.d0.f7885a;
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
            cVar.j(v, e9.q.w(i0Var, new ai.w1(10)).iterator());
            v.append("]");
        }
        if (i11 != 0) {
            v.append(", selectionFlags=[");
            String str9 = e2.d0.f7885a;
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
            cVar.j(v, arrayList.iterator());
            v.append("]");
        }
        if (i20 != 0) {
            v.append(", roleFlags=[");
            String str10 = e2.d0.f7885a;
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
            cVar.j(v, arrayList2.iterator());
            v.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            v.append(", auxiliaryTrackType=");
            int i25 = sVar.f3296g;
            String str11 = e2.d0.f7885a;
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
        obj.f3237a = this.f3292a;
        obj.f3238b = this.f3293b;
        obj.f3239c = this.f3294c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3240f = this.f3295f;
        obj.h = this.h;
        obj.f3242i = this.f3297i;
        obj.f3243j = this.f3299k;
        obj.f3244k = this.f3300l;
        obj.f3249p = this.f3305q;
        obj.f3250q = this.f3306r;
        obj.f3251r = this.f3307s;
        obj.f3252s = this.f3308t;
        obj.f3253t = this.f3309u;
        obj.f3254u = this.v;
        obj.v = this.f3310w;
        obj.f3255w = this.f3311x;
        obj.f3256x = this.f3312y;
        obj.f3257y = this.f3313z;
        obj.f3258z = this.A;
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
        obj.f3245l = this.f3301m;
        obj.f3246m = this.f3302n;
        obj.f3248o = this.f3303o;
        obj.f3247n = this.f3304p;
        return obj;
    }

    public final boolean b(s sVar) {
        List list = this.f3309u;
        if (list.size() != sVar.f3309u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.f3309u.get(i10))) {
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
        int h = r0.h(this.f3306r);
        String str3 = sVar.f3292a;
        p0 p0Var = sVar.f3300l;
        e9.i0 i0Var = sVar.f3294c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.f3293b;
        if (str4 == null) {
            str4 = this.f3293b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f3294c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.f3297i;
        if (i15 == -1) {
            i15 = sVar.f3297i;
        }
        String str5 = this.f3299k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.f3299k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.f3300l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.e | sVar.e;
        int i17 = this.f3295f | sVar.f3295f;
        o oVar2 = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar2 != null) {
            String str6 = oVar2.f3166c;
            n[] nVarArr = oVar2.f3164a;
            int length = nVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                n nVar = nVarArr[i19];
                int i20 = length;
                if (nVar.e != null) {
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
                str2 = oVar3.f3166c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar3.f3164a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.e != null) {
                    UUID uuid = nVar2.f3118b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i10 = size;
                            if (((n) arrayList.get(i24)).f3118b.equals(uuid)) {
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
        a2.f3237a = str3;
        a2.f3238b = str4;
        a2.f3239c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f3240f = i17;
        a2.h = i14;
        a2.f3242i = i15;
        a2.f3243j = str5;
        a2.f3244k = p0Var;
        a2.f3254u = oVar;
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
            if ((i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.e == sVar.e && this.f3295f == sVar.f3295f && this.f3296g == sVar.f3296g && this.h == sVar.h && this.f3297i == sVar.f3297i && this.f3307s == sVar.f3307s && this.f3310w == sVar.f3310w && this.f3312y == sVar.f3312y && this.f3313z == sVar.f3313z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.f3292a, sVar.f3292a) && Objects.equals(this.f3293b, sVar.f3293b) && this.f3294c.equals(sVar.f3294c) && Objects.equals(this.f3299k, sVar.f3299k) && Objects.equals(this.f3305q, sVar.f3305q) && Objects.equals(this.f3306r, sVar.f3306r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.f3300l, sVar.f3300l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar)) {
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
            String str = this.f3292a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f3293b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f3294c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((((hashCode7 + hashCode3) * 31) + this.e) * 31) + this.f3295f) * 31) + this.f3296g) * 31) + this.h) * 31) + this.f3297i) * 31;
            String str4 = this.f3299k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f3300l;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 961;
            String str5 = this.f3305q;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f3306r;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.C);
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((floatToIntBits + ((((((((((((((i15 + i10) * 31) + this.f3307s) * 31) + ((int) this.f3310w)) * 31) + this.f3312y) * 31) + this.f3313z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f3292a);
        sb2.append(", ");
        sb2.append(this.f3293b);
        sb2.append(", ");
        sb2.append(this.f3305q);
        sb2.append(", ");
        sb2.append(this.f3306r);
        sb2.append(", ");
        sb2.append(this.f3299k);
        sb2.append(", ");
        sb2.append(this.f3298j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f3312y);
        sb2.append(", ");
        sb2.append(this.f3313z);
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
