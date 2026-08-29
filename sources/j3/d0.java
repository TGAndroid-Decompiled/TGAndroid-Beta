package j3;

import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.ArrayList;
import jh.h5;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.cg1;
public final class d0 implements f5.j, f, a9.e, Vector.TLDeserializer, org.telegram.ui.ActionBar.b2 {
    public final int f10412a;

    public d0(int i10) {
        this.f10412a = i10;
    }

    @Override
    public Object I0(a5.j jVar) {
        switch (this.f10412a) {
            case 22:
                return FirebaseSessionsRegistrar.e(jVar);
            case 23:
                return FirebaseSessionsRegistrar.f(jVar);
            case 24:
                return FirebaseSessionsRegistrar.a(jVar);
            case 25:
                return FirebaseSessionsRegistrar.b(jVar);
            case 26:
                return FirebaseSessionsRegistrar.d(jVar);
            default:
                return FirebaseSessionsRegistrar.c(jVar);
        }
    }

    @Override
    public g c(Bundle bundle) {
        b1 b1Var;
        h1 h1Var;
        z0 z0Var;
        d1 d1Var;
        boolean z10;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        m4.c cVar;
        f1 f1Var;
        byte[] bArr = null;
        b1 b1Var2 = null;
        boolean z11 = true;
        int i10 = 0;
        switch (this.f10412a) {
            case 1:
                t0 t0Var = t0.Y;
                s0 s0Var = new s0();
                if (bundle != null) {
                    ClassLoader classLoader = f5.a.class.getClassLoader();
                    int i11 = f5.d0.f6579a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(t0.Z);
                String str = t0Var.f10797a;
                if (string == null) {
                    string = str;
                }
                s0Var.f10730a = string;
                String string2 = bundle.getString(t0.f10772a0);
                String str2 = t0Var.f10798b;
                if (string2 == null) {
                    string2 = str2;
                }
                s0Var.f10731b = string2;
                String string3 = bundle.getString(t0.f10773b0);
                String str3 = t0Var.f10799c;
                if (string3 == null) {
                    string3 = str3;
                }
                s0Var.f10732c = string3;
                s0Var.d = bundle.getInt(t0.f10774c0, t0Var.d);
                s0Var.f10733e = bundle.getInt(t0.f10775d0, t0Var.f10800e);
                s0Var.f10734f = bundle.getInt(t0.f10776e0, t0Var.f10801f);
                s0Var.f10735g = bundle.getInt(t0.f10777f0, t0Var.h);
                String string4 = bundle.getString(t0.f10778g0);
                String str4 = t0Var.f10803r;
                if (string4 == null) {
                    string4 = str4;
                }
                s0Var.h = string4;
                b4.c cVar2 = (b4.c) bundle.getParcelable(t0.f10779h0);
                b4.c cVar3 = t0Var.f10804s;
                if (cVar2 == null) {
                    cVar2 = cVar3;
                }
                s0Var.f10736i = cVar2;
                String string5 = bundle.getString(t0.f10780i0);
                String str5 = t0Var.A;
                if (string5 == null) {
                    string5 = str5;
                }
                s0Var.f10741n = string5;
                String string6 = bundle.getString(t0.f10781j0);
                String str6 = t0Var.B;
                if (string6 == null) {
                    string6 = str6;
                }
                s0Var.f10742o = string6;
                s0Var.f10743p = bundle.getInt(t0.f10782k0, t0Var.C);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(t0.f10783l0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        s0Var.f10744q = arrayList;
                        s0Var.f10745r = (n3.c) bundle.getParcelable(t0.m0);
                        s0Var.f10746s = bundle.getLong(t0.f10784n0, t0Var.F);
                        s0Var.f10747t = bundle.getInt(t0.f10785o0, t0Var.G);
                        s0Var.f10748u = bundle.getInt(t0.f10786p0, t0Var.H);
                        s0Var.v = bundle.getFloat(t0.f10787q0, t0Var.I);
                        s0Var.f10749w = bundle.getInt(t0.f10788r0, t0Var.J);
                        s0Var.f10750x = bundle.getFloat(t0.f10789s0, t0Var.K);
                        s0Var.f10751y = bundle.getByteArray(t0.f10790t0);
                        s0Var.f10752z = bundle.getInt(t0.f10791u0, t0Var.M);
                        Bundle bundle4 = bundle.getBundle(t0.f10792v0);
                        if (bundle4 != null) {
                            s0Var.A = (g5.b) g5.b.f7027s.c(bundle4);
                        }
                        s0Var.B = bundle.getInt(t0.f10793w0, t0Var.O);
                        s0Var.C = bundle.getInt(t0.f10794x0, t0Var.P);
                        s0Var.D = bundle.getInt(t0.f10795y0, t0Var.Q);
                        s0Var.E = bundle.getInt(t0.f10796z0, t0Var.R);
                        s0Var.F = bundle.getInt(t0.A0, t0Var.S);
                        s0Var.G = bundle.getInt(t0.B0, t0Var.T);
                        s0Var.H = bundle.getInt(t0.D0, t0Var.U);
                        s0Var.I = bundle.getInt(t0.E0, t0Var.V);
                        s0Var.J = bundle.getInt(t0.C0, t0Var.W);
                        return new t0(s0Var);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 2:
                if (bundle.getInt(g2.f10471a, -1) != 0) {
                    z11 = false;
                }
                f5.a.f(z11);
                if (bundle.getBoolean(v0.f10819e, false)) {
                    return new v0(bundle.getBoolean(v0.f10820f, false));
                }
                return new v0();
            case 3:
                String string7 = bundle.getString(f1.f10431n, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(f1.f10432r);
                if (bundle5 == null) {
                    b1Var = b1.f10381f;
                } else {
                    b1Var = (b1) b1.f10385w.c(bundle5);
                }
                b1 b1Var3 = b1Var;
                Bundle bundle6 = bundle.getBundle(f1.f10433s);
                if (bundle6 == null) {
                    h1Var = h1.U;
                } else {
                    h1Var = (h1) h1.C0.c(bundle6);
                }
                h1 h1Var2 = h1Var;
                Bundle bundle7 = bundle.getBundle(f1.v);
                if (bundle7 == null) {
                    z0Var = z0.f10867x;
                } else {
                    z0Var = (z0) y0.f10858w.c(bundle7);
                }
                z0 z0Var2 = z0Var;
                Bundle bundle8 = bundle.getBundle(f1.f10434w);
                if (bundle8 == null) {
                    d1Var = d1.f10413c;
                } else {
                    d1Var = (d1) d1.h.c(bundle8);
                }
                return new f1(string7, z0Var2, null, b1Var3, h1Var2, d1Var);
            case 4:
                x0 x0Var = new x0();
                String str7 = y0.h;
                z0 z0Var3 = y0.f10854f;
                long j10 = bundle.getLong(str7, z0Var3.f10859a);
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.f(z10);
                x0Var.f10844a = j10;
                long j11 = bundle.getLong(y0.f10855n, z0Var3.f10860b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    z11 = false;
                }
                f5.a.f(z11);
                x0Var.f10845b = j11;
                x0Var.f10846c = bundle.getBoolean(y0.f10856r, z0Var3.f10861c);
                x0Var.d = bundle.getBoolean(y0.f10857s, z0Var3.d);
                x0Var.f10847e = bundle.getBoolean(y0.v, z0Var3.f10862e);
                return new y0(x0Var);
            case 5:
                return new b1(bundle.getLong(b1.h, -9223372036854775807L), bundle.getLong(b1.f10382n, -9223372036854775807L), bundle.getLong(b1.f10383r, -9223372036854775807L), bundle.getFloat(b1.f10384s, -3.4028235E38f), bundle.getFloat(b1.v, -3.4028235E38f));
            case 6:
                androidx.biometric.e eVar = new androidx.biometric.e(20, false);
                eVar.f1030b = (Uri) bundle.getParcelable(d1.d);
                eVar.f1031c = bundle.getString(d1.f10414e);
                eVar.d = bundle.getBundle(d1.f10415f);
                return new d1(eVar);
            case 7:
                ?? obj = new Object();
                obj.f10448a = bundle.getCharSequence(h1.V);
                obj.f10449b = bundle.getCharSequence(h1.W);
                obj.f10450c = bundle.getCharSequence(h1.X);
                obj.d = bundle.getCharSequence(h1.Y);
                obj.f10451e = bundle.getCharSequence(h1.Z);
                obj.f10452f = bundle.getCharSequence(h1.f10478a0);
                obj.f10453g = bundle.getCharSequence(h1.f10479b0);
                byte[] byteArray2 = bundle.getByteArray(h1.f10482e0);
                String str8 = h1.f10500x0;
                if (bundle.containsKey(str8)) {
                    num = Integer.valueOf(bundle.getInt(str8));
                } else {
                    num = null;
                }
                if (byteArray2 != null) {
                    bArr = (byte[]) byteArray2.clone();
                }
                obj.f10455j = bArr;
                obj.f10456k = num;
                obj.f10457l = (Uri) bundle.getParcelable(h1.f10483f0);
                obj.f10468x = bundle.getCharSequence(h1.f10493q0);
                obj.f10469y = bundle.getCharSequence(h1.f10494r0);
                obj.f10470z = bundle.getCharSequence(h1.f10495s0);
                obj.C = bundle.getCharSequence(h1.f10498v0);
                obj.D = bundle.getCharSequence(h1.f10499w0);
                obj.E = bundle.getCharSequence(h1.f10501y0);
                obj.G = bundle.getBundle(h1.B0);
                String str9 = h1.f10480c0;
                if (bundle.containsKey(str9) && (bundle3 = bundle.getBundle(str9)) != null) {
                    obj.h = (g2) g2.f10472b.c(bundle3);
                }
                String str10 = h1.f10481d0;
                if (bundle.containsKey(str10) && (bundle2 = bundle.getBundle(str10)) != null) {
                    obj.f10454i = (g2) g2.f10472b.c(bundle2);
                }
                String str11 = h1.f10484g0;
                if (bundle.containsKey(str11)) {
                    obj.f10458m = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = h1.f10485h0;
                if (bundle.containsKey(str12)) {
                    obj.f10459n = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = h1.f10486i0;
                if (bundle.containsKey(str13)) {
                    obj.f10460o = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = h1.A0;
                if (bundle.containsKey(str14)) {
                    obj.f10461p = Boolean.valueOf(bundle.getBoolean(str14));
                }
                String str15 = h1.f10487j0;
                if (bundle.containsKey(str15)) {
                    obj.f10462q = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = h1.f10488k0;
                if (bundle.containsKey(str16)) {
                    obj.f10463r = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = h1.f10489l0;
                if (bundle.containsKey(str17)) {
                    obj.f10464s = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = h1.m0;
                if (bundle.containsKey(str18)) {
                    obj.f10465t = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = h1.f10490n0;
                if (bundle.containsKey(str19)) {
                    obj.f10466u = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = h1.f10491o0;
                if (bundle.containsKey(str20)) {
                    obj.v = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = h1.f10492p0;
                if (bundle.containsKey(str21)) {
                    obj.f10467w = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = h1.f10496t0;
                if (bundle.containsKey(str22)) {
                    obj.A = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = h1.f10497u0;
                if (bundle.containsKey(str23)) {
                    obj.B = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = h1.f10502z0;
                if (bundle.containsKey(str24)) {
                    obj.F = Integer.valueOf(bundle.getInt(str24));
                }
                return new h1(obj);
            case 8:
                if (bundle.getInt(g2.f10471a, -1) != 1) {
                    z11 = false;
                }
                f5.a.f(z11);
                float f9 = bundle.getFloat(u1.d, -1.0f);
                if (f9 == -1.0f) {
                    return new u1();
                }
                return new u1(f9);
            case 9:
                int i12 = bundle.getInt(g2.f10471a, -1);
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                return (g2) n2.h.c(bundle);
                            }
                            throw new IllegalArgumentException(j7.l1.k(i12, "Unknown RatingType: "));
                        }
                        return (g2) l2.h.c(bundle);
                    }
                    return (g2) u1.f10816e.c(bundle);
                }
                return (g2) v0.h.c(bundle);
            case 10:
                if (bundle.getInt(g2.f10471a, -1) != 2) {
                    z11 = false;
                }
                f5.a.f(z11);
                int i13 = bundle.getInt(l2.f10619e, 5);
                float f10 = bundle.getFloat(l2.f10620f, -1.0f);
                if (f10 == -1.0f) {
                    return new l2(i13);
                }
                return new l2(i13, f10);
            case 11:
                if (bundle.getInt(g2.f10471a, -1) != 3) {
                    z11 = false;
                }
                f5.a.f(z11);
                if (bundle.getBoolean(n2.f10647e, false)) {
                    return new n2(bundle.getBoolean(n2.f10648f, false));
                }
                return new n2();
            case 12:
                int i14 = bundle.getInt(p2.f10670n, 0);
                long j12 = bundle.getLong(p2.f10671r, -9223372036854775807L);
                long j13 = bundle.getLong(p2.f10672s, 0L);
                boolean z12 = bundle.getBoolean(p2.v, false);
                Bundle bundle9 = bundle.getBundle(p2.f10673w);
                if (bundle9 != null) {
                    cVar = (m4.c) m4.c.f16852w.c(bundle9);
                } else {
                    cVar = m4.c.f16848f;
                }
                m4.c cVar4 = cVar;
                p2 p2Var = new p2();
                p2Var.h(null, null, i14, j12, j13, cVar4, z12);
                return p2Var;
            case 13:
                Bundle bundle10 = bundle.getBundle(q2.G);
                if (bundle10 != null) {
                    f1Var = (f1) f1.f10435x.c(bundle10);
                } else {
                    f1Var = f1.h;
                }
                f1 f1Var2 = f1Var;
                long j14 = bundle.getLong(q2.H, -9223372036854775807L);
                long j15 = bundle.getLong(q2.I, -9223372036854775807L);
                long j16 = bundle.getLong(q2.J, -9223372036854775807L);
                boolean z13 = bundle.getBoolean(q2.K, false);
                boolean z14 = bundle.getBoolean(q2.L, false);
                Bundle bundle11 = bundle.getBundle(q2.M);
                if (bundle11 != null) {
                    b1Var2 = (b1) b1.f10385w.c(bundle11);
                }
                boolean z15 = bundle.getBoolean(q2.N, false);
                long j17 = bundle.getLong(q2.O, 0L);
                long j18 = bundle.getLong(q2.P, -9223372036854775807L);
                int i15 = bundle.getInt(q2.Q, 0);
                int i16 = bundle.getInt(q2.R, 0);
                long j19 = bundle.getLong(q2.S, 0L);
                q2 q2Var = new q2();
                q2Var.b(q2.E, f1Var2, null, j14, j15, j16, z13, z14, b1Var2, j17, j18, i15, i16, j19);
                q2Var.f10703w = z15;
                return q2Var;
            default:
                k3.d dVar = l4.j1.f14346n;
                Bundle bundle12 = bundle.getBundle(s2.f10763f);
                bundle12.getClass();
                l4.j1 j1Var = (l4.j1) dVar.c(bundle12);
                int[] intArray = bundle.getIntArray(s2.h);
                int i17 = j1Var.f14347a;
                int[] iArr = new int[i17];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(s2.f10764n);
                boolean[] zArr = new boolean[i17];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new s2(j1Var, bundle.getBoolean(s2.f10765r, false), intArray, booleanArray);
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        h5.d2(new cg1(6, null));
    }

    @Override
    public void invoke(Object obj) {
        ((a2) obj).onRenderedFirstFrame();
    }

    public d0(h5 h5Var) {
        this.f10412a = 29;
    }
}
