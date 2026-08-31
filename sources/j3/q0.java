package j3;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import mh.c3;
public final class q0 implements f, j4.g, c9.e, h5.j {
    public final int f9382a;

    public q0(int i10) {
        this.f9382a = i10;
    }

    @Override
    public g c(Bundle bundle) {
        boolean z4;
        s8.x a2;
        w0 w0Var;
        s8.i0 s6;
        s8.i0 s9;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        p4.b bVar;
        c1 c1Var;
        byte[] bArr = null;
        x0 x0Var = null;
        byte[] bArr2 = null;
        r0 r0Var = null;
        boolean z10 = true;
        switch (this.f9382a) {
            case 0:
                Uri uri = (Uri) bundle.getParcelable(r0.f9398b);
                uri.getClass();
                ?? obj = new Object();
                obj.f9988a = uri;
                return new r0(obj);
            case 1:
                s0 s0Var = new s0();
                String str = t0.h;
                u0 u0Var = t0.f9412f;
                long j10 = bundle.getLong(str, u0Var.f9417a);
                if (j10 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.f(z4);
                s0Var.f9405a = j10;
                long j11 = bundle.getLong(t0.f9413n, u0Var.f9418b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    z10 = false;
                }
                h5.a.f(z10);
                s0Var.f9406b = j11;
                s0Var.f9407c = bundle.getBoolean(t0.f9414r, u0Var.f9419c);
                s0Var.d = bundle.getBoolean(t0.f9415s, u0Var.d);
                s0Var.f9408e = bundle.getBoolean(t0.v, u0Var.f9420e);
                return new t0(s0Var);
            case 2:
                String string = bundle.getString(w0.f9458r);
                string.getClass();
                UUID fromString = UUID.fromString(string);
                Uri uri2 = (Uri) bundle.getParcelable(w0.f9459s);
                String str2 = w0.v;
                Bundle bundle4 = Bundle.EMPTY;
                Bundle bundle5 = bundle.getBundle(str2);
                if (bundle5 == null) {
                    bundle5 = bundle4;
                }
                s8.n0 n0Var = s8.n0.h;
                if (bundle5 == bundle4) {
                    a2 = n0Var;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle5 != bundle4) {
                        for (String str3 : bundle5.keySet()) {
                            String string2 = bundle5.getString(str3);
                            if (string2 != null) {
                                hashMap.put(str3, string2);
                            }
                        }
                    }
                    a2 = s8.x.a(hashMap);
                }
                boolean z11 = bundle.getBoolean(w0.f9460w, false);
                boolean z12 = bundle.getBoolean(w0.f9461x, false);
                boolean z13 = bundle.getBoolean(w0.f9462y, false);
                String str4 = w0.B;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                s8.v t6 = s8.v.t(arrayList);
                byte[] byteArray = bundle.getByteArray(w0.C);
                ?? obj2 = new Object();
                obj2.f9446a = fromString;
                obj2.f9448c = n0Var;
                obj2.f9451g = s8.i0.f47108e;
                obj2.f9447b = uri2;
                obj2.f9448c = s8.x.a(a2);
                obj2.d = z11;
                obj2.f9450f = z13;
                obj2.f9449e = z12;
                obj2.f9451g = s8.v.t(t6);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                }
                obj2.h = bArr;
                return new w0(obj2);
            case 3:
                return new x0(bundle.getLong(x0.h, -9223372036854775807L), bundle.getLong(x0.f9473n, -9223372036854775807L), bundle.getLong(x0.f9474r, -9223372036854775807L), bundle.getFloat(x0.f9475s, -3.4028235E38f), bundle.getFloat(x0.v, -3.4028235E38f));
            case 4:
                Bundle bundle6 = bundle.getBundle(y0.v);
                if (bundle6 == null) {
                    w0Var = null;
                } else {
                    w0Var = (w0) w0.D.c(bundle6);
                }
                Bundle bundle7 = bundle.getBundle(y0.f9484w);
                if (bundle7 != null) {
                    r0Var = (r0) r0.f9399c.c(bundle7);
                }
                r0 r0Var2 = r0Var;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(y0.f9485x);
                if (parcelableArrayList == null) {
                    s8.t tVar = s8.v.f47143b;
                    s6 = s8.i0.f47108e;
                } else {
                    s6 = h5.a.s(new q0(5), parcelableArrayList);
                }
                s8.i0 i0Var = s6;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(y0.B);
                if (parcelableArrayList2 == null) {
                    s8.t tVar2 = s8.v.f47143b;
                    s9 = s8.i0.f47108e;
                } else {
                    s9 = h5.a.s(b1.B, parcelableArrayList2);
                }
                s8.i0 i0Var2 = s9;
                Uri uri3 = (Uri) bundle.getParcelable(y0.f9482r);
                uri3.getClass();
                return new y0(uri3, bundle.getString(y0.f9483s), w0Var, r0Var2, i0Var, bundle.getString(y0.f9486y), i0Var2, null);
            case 5:
                return new n4.b(bundle.getInt(n4.b.d, 0), bundle.getInt(n4.b.f15237e, 0), bundle.getInt(n4.b.f15238f, 0));
            case 6:
                androidx.biometric.e eVar = new androidx.biometric.e(19, false);
                eVar.f527b = (Uri) bundle.getParcelable(z0.d);
                eVar.f528c = bundle.getString(z0.f9496e);
                eVar.d = bundle.getBundle(z0.f9497f);
                return new z0(eVar);
            case 7:
                Uri uri4 = (Uri) bundle.getParcelable(b1.f8987n);
                uri4.getClass();
                String string3 = bundle.getString(b1.f8988r);
                String string4 = bundle.getString(b1.f8989s);
                int i10 = bundle.getInt(b1.v, 0);
                int i11 = bundle.getInt(b1.f8990w, 0);
                String string5 = bundle.getString(b1.f8991x);
                String string6 = bundle.getString(b1.f8992y);
                ?? obj3 = new Object();
                obj3.d = uri4;
                obj3.f2330a = string3;
                obj3.f2333e = string4;
                obj3.f2331b = i10;
                obj3.f2332c = i11;
                obj3.f2334f = string5;
                obj3.f2335g = string6;
                return new b1(obj3);
            case 8:
                ?? obj4 = new Object();
                obj4.f9027a = bundle.getCharSequence(e1.W);
                obj4.f9028b = bundle.getCharSequence(e1.X);
                obj4.f9029c = bundle.getCharSequence(e1.Y);
                obj4.d = bundle.getCharSequence(e1.Z);
                obj4.f9030e = bundle.getCharSequence(e1.f9064a0);
                obj4.f9031f = bundle.getCharSequence(e1.f9065b0);
                obj4.f9032g = bundle.getCharSequence(e1.f9066c0);
                byte[] byteArray2 = bundle.getByteArray(e1.f9069f0);
                String str5 = e1.f9087y0;
                if (bundle.containsKey(str5)) {
                    num = Integer.valueOf(bundle.getInt(str5));
                } else {
                    num = null;
                }
                if (byteArray2 != null) {
                    bArr2 = (byte[]) byteArray2.clone();
                }
                obj4.f9034j = bArr2;
                obj4.f9035k = num;
                obj4.f9036l = (Uri) bundle.getParcelable(e1.f9070g0);
                obj4.f9047x = bundle.getCharSequence(e1.f9080r0);
                obj4.f9048y = bundle.getCharSequence(e1.f9081s0);
                obj4.f9049z = bundle.getCharSequence(e1.f9082t0);
                obj4.C = bundle.getCharSequence(e1.f9085w0);
                obj4.D = bundle.getCharSequence(e1.f9086x0);
                obj4.E = bundle.getCharSequence(e1.f9088z0);
                obj4.G = bundle.getBundle(e1.C0);
                String str6 = e1.f9067d0;
                if (bundle.containsKey(str6) && (bundle3 = bundle.getBundle(str6)) != null) {
                    obj4.h = (f2) f2.f9151b.c(bundle3);
                }
                String str7 = e1.f9068e0;
                if (bundle.containsKey(str7) && (bundle2 = bundle.getBundle(str7)) != null) {
                    obj4.f9033i = (f2) f2.f9151b.c(bundle2);
                }
                String str8 = e1.f9071h0;
                if (bundle.containsKey(str8)) {
                    obj4.f9037m = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = e1.f9072i0;
                if (bundle.containsKey(str9)) {
                    obj4.f9038n = Integer.valueOf(bundle.getInt(str9));
                }
                String str10 = e1.f9073j0;
                if (bundle.containsKey(str10)) {
                    obj4.f9039o = Integer.valueOf(bundle.getInt(str10));
                }
                String str11 = e1.B0;
                if (bundle.containsKey(str11)) {
                    obj4.f9040p = Boolean.valueOf(bundle.getBoolean(str11));
                }
                String str12 = e1.f9074k0;
                if (bundle.containsKey(str12)) {
                    obj4.f9041q = Boolean.valueOf(bundle.getBoolean(str12));
                }
                String str13 = e1.f9075l0;
                if (bundle.containsKey(str13)) {
                    obj4.f9042r = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = e1.m0;
                if (bundle.containsKey(str14)) {
                    obj4.f9043s = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = e1.f9076n0;
                if (bundle.containsKey(str15)) {
                    obj4.f9044t = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = e1.f9077o0;
                if (bundle.containsKey(str16)) {
                    obj4.f9045u = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = e1.f9078p0;
                if (bundle.containsKey(str17)) {
                    obj4.v = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = e1.f9079q0;
                if (bundle.containsKey(str18)) {
                    obj4.f9046w = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = e1.f9083u0;
                if (bundle.containsKey(str19)) {
                    obj4.A = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = e1.f9084v0;
                if (bundle.containsKey(str20)) {
                    obj4.B = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = e1.A0;
                if (bundle.containsKey(str21)) {
                    obj4.F = Integer.valueOf(bundle.getInt(str21));
                }
                return new e1(obj4);
            case 9:
                if (bundle.getInt(f2.f9150a, -1) != 1) {
                    z10 = false;
                }
                h5.a.f(z10);
                float f10 = bundle.getFloat(s1.d, -1.0f);
                if (f10 == -1.0f) {
                    return new s1();
                }
                return new s1(f10);
            case 10:
                int i12 = bundle.getInt(f2.f9150a, -1);
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                return (f2) k2.h.c(bundle);
                            }
                            throw new IllegalArgumentException(l.d.j(i12, "Unknown RatingType: "));
                        }
                        return (f2) j2.h.c(bundle);
                    }
                    return (f2) s1.f9409e.c(bundle);
                }
                return (f2) o0.h.c(bundle);
            case 11:
                if (bundle.getInt(f2.f9150a, -1) != 2) {
                    z10 = false;
                }
                h5.a.f(z10);
                int i13 = bundle.getInt(j2.f9214e, 5);
                float f11 = bundle.getFloat(j2.f9215f, -1.0f);
                if (f11 == -1.0f) {
                    return new j2(i13);
                }
                return new j2(i13, f11);
            case 12:
                if (bundle.getInt(f2.f9150a, -1) != 3) {
                    z10 = false;
                }
                h5.a.f(z10);
                if (bundle.getBoolean(k2.f9239e, false)) {
                    return new k2(bundle.getBoolean(k2.f9240f, false));
                }
                return new k2();
            case 13:
                int i14 = bundle.getInt(m2.f9279n, 0);
                long j12 = bundle.getLong(m2.f9280r, -9223372036854775807L);
                long j13 = bundle.getLong(m2.f9281s, 0L);
                boolean z14 = bundle.getBoolean(m2.v, false);
                Bundle bundle8 = bundle.getBundle(m2.f9282w);
                if (bundle8 != null) {
                    bVar = (p4.b) p4.b.f44202w.c(bundle8);
                } else {
                    bVar = p4.b.f44198f;
                }
                p4.b bVar2 = bVar;
                m2 m2Var = new m2();
                m2Var.i(null, null, i14, j12, j13, bVar2, z14);
                return m2Var;
            case 14:
                Bundle bundle9 = bundle.getBundle(n2.H);
                if (bundle9 != null) {
                    c1Var = (c1) c1.f9006y.c(bundle9);
                } else {
                    c1Var = c1.h;
                }
                c1 c1Var2 = c1Var;
                long j14 = bundle.getLong(n2.I, -9223372036854775807L);
                long j15 = bundle.getLong(n2.J, -9223372036854775807L);
                long j16 = bundle.getLong(n2.K, -9223372036854775807L);
                boolean z15 = bundle.getBoolean(n2.L, false);
                boolean z16 = bundle.getBoolean(n2.M, false);
                Bundle bundle10 = bundle.getBundle(n2.N);
                if (bundle10 != null) {
                    x0Var = (x0) x0.f9476w.c(bundle10);
                }
                boolean z17 = bundle.getBoolean(n2.O, false);
                long j17 = bundle.getLong(n2.P, 0L);
                long j18 = bundle.getLong(n2.Q, -9223372036854775807L);
                int i15 = bundle.getInt(n2.R, 0);
                int i16 = bundle.getInt(n2.S, 0);
                long j19 = bundle.getLong(n2.T, 0L);
                n2 n2Var = new n2();
                n2Var.b(n2.F, c1Var2, null, j14, j15, j16, z15, z16, x0Var, j17, j18, i15, i16, j19);
                n2Var.f9342w = z17;
                return n2Var;
            default:
                c3 c3Var = o4.s0.f16570n;
                Bundle bundle11 = bundle.getBundle(p2.f9375f);
                bundle11.getClass();
                o4.s0 s0Var2 = (o4.s0) c3Var.c(bundle11);
                int[] intArray = bundle.getIntArray(p2.h);
                int i17 = s0Var2.f16571a;
                int[] iArr = new int[i17];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(p2.f9376n);
                boolean[] zArr = new boolean[i17];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new p2(s0Var2, bundle.getBoolean(p2.f9377r, false), intArray, booleanArray);
        }
    }

    @Override
    public boolean d(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public Object e0(c5.j jVar) {
        Set w10 = jVar.w(ja.a.class);
        ja.c cVar = ja.c.f9987b;
        if (cVar == null) {
            synchronized (ja.c.class) {
                try {
                    cVar = ja.c.f9987b;
                    if (cVar == null) {
                        cVar = new ja.c(0);
                        ja.c.f9987b = cVar;
                    }
                } finally {
                }
            }
        }
        return new ja.b(w10, cVar);
    }

    @Override
    public void invoke(Object obj) {
        k3.b bVar = (k3.b) obj;
        switch (this.f9382a) {
            case 18:
                bVar.getClass();
                return;
            case 19:
                bVar.getClass();
                return;
            case 20:
                bVar.getClass();
                return;
            case 21:
                bVar.getClass();
                return;
            case 22:
                bVar.getClass();
                return;
            case 23:
                bVar.getClass();
                return;
            case 24:
                bVar.getClass();
                return;
            case 25:
                bVar.getClass();
                return;
            case 26:
                bVar.getClass();
                return;
            case 27:
                bVar.getClass();
                return;
            case 28:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public q0(k3.a aVar, int i10, int i11) {
        this.f9382a = 27;
    }

    public q0(k3.a aVar, g gVar, int i10) {
        this.f9382a = i10;
    }

    public q0(k3.a aVar, c1 c1Var, int i10) {
        this.f9382a = 28;
    }

    public q0(k3.a aVar, Object obj, Object obj2, int i10) {
        this.f9382a = i10;
    }

    public q0(k3.a aVar, boolean z4) {
        this.f9382a = 19;
    }

    public q0(k3.a aVar, boolean z4, int i10, int i11) {
        this.f9382a = i11;
    }
}
