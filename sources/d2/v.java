package d2;

import android.text.TextUtils;
import b8.zb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
public final class v {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final v V = new v(new u());
    public static final String W = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);
    public static final String f8448a0 = Integer.toString(4, 36);
    public static final String f8449b0 = Integer.toString(5, 36);
    public static final String f8450c0 = Integer.toString(6, 36);
    public static final String f8451d0 = Integer.toString(7, 36);
    public static final String f8452e0;
    public static final String f8453f0;
    public static final String f8454g0;
    public static final String f8455h0;
    public static final String f8456i0;
    public static final String f8457j0;
    public static final String f8458k0;
    public static final String f8459l0;
    public static final String m0;
    public static final String f8460n0;
    public static final String f8461o0;
    public static final String f8462p0;
    public static final String f8463q0;
    public static final String f8464r0;
    public static final String f8465s0;
    public static final String f8466t0;
    public static final String f8467u0;
    public static final String f8468v0;
    public static final String f8469w0;
    public static final String f8470x0;
    public static final String f8471y0;
    public static final String f8472z0;
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
    public final String f8473a;
    public final String f8474b;
    public final g9.i0 f8475c;
    public final String d;
    public final int f8476e;
    public final int f8477f;
    public final int f8478g;
    public final int h;
    public final int f8479i;
    public final int f8480j;
    public final String f8481k;
    public final s0 f8482l;
    public final String f8483m;
    public boolean f8484n;
    public long f8485o;
    public int f8486p;
    public String f8487q;
    public final String f8488r;
    public final String f8489s;
    public final int f8490t;
    public final int f8491u;
    public final List v;
    public final s f8492w;
    public final long f8493x;
    public final boolean f8494y;
    public final int f8495z;

    static {
        Integer.toString(8, 36);
        f8452e0 = Integer.toString(9, 36);
        f8453f0 = Integer.toString(10, 36);
        f8454g0 = Integer.toString(11, 36);
        f8455h0 = Integer.toString(12, 36);
        f8456i0 = Integer.toString(13, 36);
        f8457j0 = Integer.toString(14, 36);
        f8458k0 = Integer.toString(15, 36);
        f8459l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        f8460n0 = Integer.toString(18, 36);
        f8461o0 = Integer.toString(19, 36);
        f8462p0 = Integer.toString(20, 36);
        f8463q0 = Integer.toString(21, 36);
        f8464r0 = Integer.toString(22, 36);
        f8465s0 = Integer.toString(23, 36);
        f8466t0 = Integer.toString(24, 36);
        f8467u0 = Integer.toString(25, 36);
        f8468v0 = Integer.toString(26, 36);
        f8469w0 = Integer.toString(27, 36);
        f8470x0 = Integer.toString(28, 36);
        f8471y0 = Integer.toString(29, 36);
        f8472z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
    }

    public v(u uVar) {
        boolean z10;
        String str;
        boolean z11;
        this.f8473a = uVar.f8416a;
        String T = g2.n0.T(uVar.d);
        this.d = T;
        if (uVar.f8418c.isEmpty() && uVar.f8417b != null) {
            this.f8475c = g9.i0.u(new z(T, uVar.f8417b));
            this.f8474b = uVar.f8417b;
        } else if (!uVar.f8418c.isEmpty() && uVar.f8417b == null) {
            g9.i0 i0Var = uVar.f8418c;
            this.f8475c = i0Var;
            int size = i0Var.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object obj = i0Var.get(i3);
                    i3++;
                    z zVar = (z) obj;
                    if (TextUtils.equals(zVar.f8522a, T)) {
                        str = zVar.f8523b;
                        break;
                    }
                } else {
                    str = ((z) i0Var.get(0)).f8523b;
                    break;
                }
            }
            this.f8474b = str;
        } else {
            if (!uVar.f8418c.isEmpty() || uVar.f8417b != null) {
                for (int i10 = 0; i10 < uVar.f8418c.size(); i10++) {
                    if (!((z) uVar.f8418c.get(i10)).f8523b.equals(uVar.f8417b)) {
                    }
                }
                z10 = false;
                zb.p(z10);
                this.f8475c = uVar.f8418c;
                this.f8474b = uVar.f8417b;
            }
            z10 = true;
            zb.p(z10);
            this.f8475c = uVar.f8418c;
            this.f8474b = uVar.f8417b;
        }
        this.f8476e = uVar.f8419e;
        if (uVar.f8421g != 0 && (uVar.f8420f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        zb.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f8477f = uVar.f8420f;
        this.f8478g = uVar.f8421g;
        int i11 = uVar.h;
        this.h = i11;
        int i12 = uVar.f8422i;
        this.f8479i = i12;
        this.f8480j = i12 != -1 ? i12 : i11;
        this.f8481k = uVar.f8423j;
        this.f8482l = uVar.f8424k;
        this.f8483m = uVar.f8425l;
        this.f8484n = uVar.f8426m;
        this.f8485o = uVar.f8427n;
        this.f8486p = uVar.f8429p;
        this.f8487q = uVar.f8428o;
        this.f8488r = uVar.f8430q;
        this.f8489s = uVar.f8431r;
        this.f8490t = uVar.f8432s;
        this.f8491u = uVar.f8433t;
        List list = uVar.f8434u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        s sVar = uVar.v;
        this.f8492w = sVar;
        this.f8493x = uVar.f8435w;
        this.f8494y = uVar.f8436x;
        this.f8495z = uVar.f8437y;
        this.A = uVar.f8438z;
        this.B = uVar.A;
        this.C = uVar.B;
        this.D = uVar.C;
        int i13 = uVar.D;
        this.E = i13 == -1 ? 0 : i13;
        float f10 = uVar.E;
        this.F = f10 == -1.0f ? 1.0f : f10;
        this.G = uVar.F;
        this.H = uVar.G;
        this.I = uVar.H;
        this.J = uVar.I;
        this.K = uVar.J;
        this.L = uVar.K;
        this.M = uVar.L;
        int i14 = uVar.M;
        this.N = i14 == -1 ? 0 : i14;
        int i15 = uVar.N;
        this.O = i15 != -1 ? i15 : 0;
        this.P = uVar.O;
        this.Q = uVar.P;
        this.R = uVar.Q;
        this.S = uVar.R;
        int i16 = uVar.S;
        if (i16 == 0 && sVar != null) {
            this.T = 1;
        } else {
            this.T = i16;
        }
    }

    public static String c(v vVar) {
        char c2;
        int i3;
        String str;
        String str2;
        String str3;
        if (vVar == null) {
            return "null";
        }
        int i10 = vVar.f8476e;
        g9.i0 i0Var = vVar.f8475c;
        String str4 = vVar.d;
        int i11 = vVar.L;
        int i12 = vVar.K;
        int i13 = vVar.J;
        float f10 = vVar.D;
        n nVar = vVar.I;
        float f11 = vVar.F;
        int i14 = vVar.C;
        int i15 = vVar.B;
        int i16 = vVar.A;
        int i17 = vVar.f8495z;
        s sVar = vVar.f8492w;
        String str5 = vVar.f8481k;
        int i18 = vVar.f8480j;
        String str6 = vVar.f8483m;
        String str7 = vVar.f8488r;
        int i19 = vVar.f8477f;
        com.google.android.gms.internal.clearcut.e eVar = new com.google.android.gms.internal.clearcut.e(String.valueOf(','));
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("id=");
        l10.append(vVar.f8473a);
        l10.append(", mimeType=");
        l10.append(vVar.f8489s);
        if (str7 != null) {
            l10.append(", container=");
            l10.append(str7);
        }
        if (str6 != null) {
            l10.append(", primaryGroupId=");
            l10.append(str6);
        }
        if (i18 != -1) {
            l10.append(", bitrate=");
            l10.append(i18);
        }
        if (str5 != null) {
            l10.append(", codecs=");
            l10.append(str5);
        }
        if (sVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i20 = 0; i20 < sVar.d; i20++) {
                UUID uuid = sVar.f8363a[i20].f8337b;
                if (uuid.equals(m.f8184c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(m.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(m.f8186f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(m.f8185e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(m.f8183b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            c2 = 0;
            l10.append(", drm=[");
            eVar.a(l10, linkedHashSet.iterator());
            l10.append(']');
        } else {
            c2 = 0;
        }
        if (i17 != -1 && i16 != -1) {
            l10.append(", res=");
            l10.append(i17);
            l10.append("x");
            l10.append(i16);
        }
        if (i15 != -1 && i14 != -1) {
            l10.append(", decRes=");
            l10.append(i15);
            l10.append("x");
            l10.append(i14);
        }
        double d = f11;
        int i21 = i9.c.f14713a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            l10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c2] = Float.valueOf(f11);
            String str8 = g2.n0.f11873a;
            l10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (nVar != null) {
            int i22 = nVar.f8232f;
            int i23 = nVar.f8231e;
            if ((i23 != -1 && i22 != -1) || nVar.d()) {
                l10.append(", color=");
                if (nVar.d()) {
                    String b10 = n.b(nVar.f8228a);
                    String a10 = n.a(nVar.f8229b);
                    String c10 = n.c(nVar.f8230c);
                    String str9 = g2.n0.f11873a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a10 + "/" + c10;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i23 != -1 && i22 != -1) {
                    str3 = com.google.android.recaptcha.internal.a.i(i23, "/", i22);
                } else {
                    str3 = "NA/NA";
                }
                l10.append(str2 + "/" + str3);
            }
        }
        if (f10 != -1.0f) {
            l10.append(", fps=");
            l10.append(f10);
        }
        if (i13 != -1) {
            l10.append(", maxSubLayers=");
            l10.append(i13);
        }
        if (i12 != -1) {
            l10.append(", channels=");
            l10.append(i12);
        }
        if (i11 != -1) {
            l10.append(", sample_rate=");
            l10.append(i11);
        }
        if (str4 != null) {
            l10.append(", language=");
            l10.append(str4);
        }
        if (!i0Var.isEmpty()) {
            l10.append(", labels=[");
            eVar.a(l10, g9.o.y(i0Var, new a3.j(24)).iterator());
            l10.append("]");
        }
        if (i10 != 0) {
            l10.append(", selectionFlags=[");
            String str10 = g2.n0.f11873a;
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
            eVar.a(l10, arrayList.iterator());
            l10.append("]");
        }
        if (i19 != 0) {
            l10.append(", roleFlags=[");
            String str11 = g2.n0.f11873a;
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
            i3 = i19;
            if ((i3 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i3 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i3 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i3 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i3 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i3 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i3 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i3 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i3 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            eVar.a(l10, arrayList2.iterator());
            l10.append("]");
        } else {
            i3 = i19;
        }
        if ((i3 & 32768) != 0) {
            l10.append(", auxiliaryTrackType=");
            int i24 = vVar.f8478g;
            String str12 = g2.n0.f11873a;
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
            l10.append(str);
        }
        return l10.toString();
    }

    public final u a() {
        ?? obj = new Object();
        obj.f8416a = this.f8473a;
        obj.f8417b = this.f8474b;
        obj.f8418c = this.f8475c;
        obj.d = this.d;
        obj.f8419e = this.f8476e;
        obj.f8420f = this.f8477f;
        obj.h = this.h;
        obj.f8422i = this.f8479i;
        obj.f8423j = this.f8481k;
        obj.f8424k = this.f8482l;
        obj.f8425l = this.f8483m;
        obj.f8430q = this.f8488r;
        obj.f8431r = this.f8489s;
        obj.f8432s = this.f8490t;
        obj.f8433t = this.f8491u;
        obj.f8434u = this.v;
        obj.v = this.f8492w;
        obj.f8435w = this.f8493x;
        obj.f8436x = this.f8494y;
        obj.f8437y = this.f8495z;
        obj.f8438z = this.A;
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
        obj.f8426m = this.f8484n;
        obj.f8427n = this.f8485o;
        obj.f8429p = this.f8486p;
        obj.f8428o = this.f8487q;
        return obj;
    }

    public final boolean b(v vVar) {
        List list = this.v;
        if (list.size() != vVar.v.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) vVar.v.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final v d(v vVar) {
        String str;
        String str2;
        s sVar;
        int i3;
        int i10;
        if (this == vVar) {
            return this;
        }
        int h = u0.h(this.f8489s);
        String str3 = vVar.f8473a;
        s0 s0Var = vVar.f8482l;
        g9.i0 i0Var = vVar.f8475c;
        int i11 = vVar.R;
        int i12 = vVar.S;
        String str4 = vVar.f8474b;
        if (str4 == null) {
            str4 = this.f8474b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.f8475c;
        }
        if ((h != 3 && h != 1) || (str = vVar.d) == null) {
            str = this.d;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = vVar.h;
        }
        int i14 = this.f8479i;
        if (i14 == -1) {
            i14 = vVar.f8479i;
        }
        String str5 = this.f8481k;
        if (str5 == null) {
            String w10 = g2.n0.w(h, vVar.f8481k);
            if (g2.n0.d0(w10).length == 1) {
                str5 = w10;
            }
        }
        String str6 = this.f8483m;
        if (str6 == null) {
            str6 = vVar.f8483m;
        }
        s0 s0Var2 = this.f8482l;
        if (s0Var2 != null) {
            s0Var = s0Var2.b(s0Var);
        }
        float f10 = this.D;
        if (f10 == -1.0f && h == 2) {
            f10 = vVar.D;
        }
        int i15 = this.f8476e | vVar.f8476e;
        g9.i0 i0Var2 = i0Var;
        int i16 = vVar.f8477f | this.f8477f;
        s sVar2 = vVar.f8492w;
        ArrayList arrayList = new ArrayList();
        if (sVar2 != null) {
            String str7 = sVar2.f8365c;
            r[] rVarArr = sVar2.f8363a;
            int length = rVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                r rVar = rVarArr[i18];
                int i19 = length;
                if (rVar.f8339e != null) {
                    arrayList.add(rVar);
                }
                i17 = i18 + 1;
                length = i19;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        s sVar3 = this.f8492w;
        if (sVar3 != null) {
            if (str2 == null) {
                str2 = sVar3.f8365c;
            }
            int size = arrayList.size();
            r[] rVarArr2 = sVar3.f8363a;
            String str8 = str2;
            int length2 = rVarArr2.length;
            int i20 = 0;
            while (i20 < length2) {
                int i21 = i20;
                r rVar2 = rVarArr2[i21];
                int i22 = length2;
                if (rVar2.f8339e != null) {
                    UUID uuid = rVar2.f8337b;
                    i10 = i11;
                    int i23 = 0;
                    while (true) {
                        if (i23 < size) {
                            i3 = size;
                            if (((r) arrayList.get(i23)).f8337b.equals(uuid)) {
                                break;
                            }
                            i23++;
                            size = i3;
                        } else {
                            i3 = size;
                            arrayList.add(rVar2);
                            break;
                        }
                    }
                } else {
                    i3 = size;
                    i10 = i11;
                }
                i20 = i21 + 1;
                length2 = i22;
                i11 = i10;
                size = i3;
            }
            str2 = str8;
        }
        int i24 = i11;
        if (arrayList.isEmpty()) {
            sVar = null;
        } else {
            sVar = new s(str2, arrayList);
        }
        u a10 = a();
        a10.f8416a = str3;
        a10.f8417b = str4;
        a10.f8418c = g9.i0.q(i0Var2);
        a10.d = str;
        a10.f8419e = i15;
        a10.f8420f = i16;
        a10.h = i13;
        a10.f8422i = i14;
        a10.f8423j = str5;
        a10.f8424k = s0Var;
        a10.f8425l = str6;
        a10.v = sVar;
        a10.C = f10;
        a10.Q = i24;
        a10.R = i12;
        return new v(a10);
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            int i10 = this.U;
            if ((i10 == 0 || (i3 = vVar.U) == 0 || i10 == i3) && this.f8476e == vVar.f8476e && this.f8477f == vVar.f8477f && this.f8478g == vVar.f8478g && this.h == vVar.h && this.f8479i == vVar.f8479i && this.f8490t == vVar.f8490t && this.f8493x == vVar.f8493x && this.f8495z == vVar.f8495z && this.A == vVar.A && this.B == vVar.B && this.C == vVar.C && this.E == vVar.E && this.H == vVar.H && this.J == vVar.J && this.K == vVar.K && this.L == vVar.L && this.M == vVar.M && this.N == vVar.N && this.O == vVar.O && this.P == vVar.P && this.R == vVar.R && this.S == vVar.S && this.T == vVar.T && Float.compare(this.D, vVar.D) == 0 && Float.compare(this.F, vVar.F) == 0 && Objects.equals(this.f8473a, vVar.f8473a) && Objects.equals(this.f8474b, vVar.f8474b) && this.f8475c.equals(vVar.f8475c) && Objects.equals(this.f8481k, vVar.f8481k) && Objects.equals(this.f8483m, vVar.f8483m) && Objects.equals(this.f8488r, vVar.f8488r) && Objects.equals(this.f8489s, vVar.f8489s) && Objects.equals(this.d, vVar.d) && Arrays.equals(this.G, vVar.G) && Objects.equals(this.f8482l, vVar.f8482l) && Objects.equals(this.I, vVar.I) && Objects.equals(this.f8492w, vVar.f8492w) && b(vVar)) {
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
            int i3 = 0;
            String str = this.f8473a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (527 + hashCode) * 31;
            String str2 = this.f8474b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.f8475c.hashCode() + ((i10 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (((((((((((hashCode8 + hashCode3) * 31) + this.f8476e) * 31) + this.f8477f) * 31) + this.f8478g) * 31) + this.h) * 31) + this.f8479i) * 31;
            String str4 = this.f8481k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            s0 s0Var = this.f8482l;
            if (s0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = s0Var.hashCode();
            }
            int i13 = (i12 + hashCode5) * 961;
            String str5 = this.f8483m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str6 = this.f8488r;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str7 = this.f8489s;
            if (str7 != null) {
                i3 = str7.hashCode();
            }
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((i15 + i3) * 31) + this.f8490t) * 31) + ((int) this.f8493x)) * 31) + this.f8495z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f8473a);
        sb2.append(", ");
        sb2.append(this.f8474b);
        sb2.append(", ");
        sb2.append(this.f8488r);
        sb2.append(", ");
        sb2.append(this.f8489s);
        sb2.append(", ");
        sb2.append(this.f8481k);
        sb2.append(", ");
        sb2.append(this.f8480j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.f8495z);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.K);
        sb2.append(", ");
        return a1.g.o(this.L, "])", sb2);
    }
}
