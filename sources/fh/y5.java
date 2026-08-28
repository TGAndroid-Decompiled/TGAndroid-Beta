package fh;

import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ag1;
public final class y5 implements GenericProvider, org.telegram.ui.ActionBar.b2, n8.e, d5.k, h3.f, h9.b {
    public final int f6891a;

    public y5(int i9) {
        this.f6891a = i9;
    }

    public static ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class g() {
        return ShortcutManager.class;
    }

    @Override
    public Object a(JsonReader jsonReader) {
        String str = "";
        String str2 = null;
        switch (this.f6891a) {
            case 28:
                jsonReader.beginObject();
                String str3 = null;
                String str4 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            str3 = jsonReader.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null libraryName");
                            }
                        case 1:
                            str2 = jsonReader.nextString();
                            if (str2 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null arch");
                            }
                        case 2:
                            str4 = jsonReader.nextString();
                            if (str4 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null buildId");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str2 == null) {
                    str = " arch";
                }
                if (str3 == null) {
                    str = str.concat(" libraryName");
                }
                if (str4 == null) {
                    str = ta.b.j(str, " buildId");
                }
                if (str.isEmpty()) {
                    return new g9.c0(str2, str3, str4);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            default:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("filename")) {
                        if (!nextName2.equals("contents")) {
                            jsonReader.skipValue();
                        } else {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        }
                    } else {
                        str2 = jsonReader.nextString();
                        if (str2 == null) {
                            throw new NullPointerException("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                if (str2 == null) {
                    str = " filename";
                }
                if (bArr == null) {
                    str = str.concat(" contents");
                }
                if (str.isEmpty()) {
                    return new g9.f0(str2, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    @Override
    public Object apply(Object obj) {
        return new i3.f((d5.a0) obj);
    }

    @Override
    public h3.g c(Bundle bundle) {
        h3.b1 b1Var;
        h3.h1 h1Var;
        h3.z0 z0Var;
        h3.d1 d1Var;
        boolean z10;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        k4.b bVar;
        h3.f1 f1Var;
        byte[] bArr = null;
        h3.b1 b1Var2 = null;
        boolean z11 = true;
        int i9 = 0;
        switch (this.f6891a) {
            case 14:
                h3.t0 t0Var = h3.t0.Y;
                h3.s0 s0Var = new h3.s0();
                if (bundle != null) {
                    ClassLoader classLoader = d5.a.class.getClassLoader();
                    int i10 = d5.f0.f4349a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(h3.t0.Z);
                String str = t0Var.f9760a;
                if (string == null) {
                    string = str;
                }
                s0Var.f9693a = string;
                String string2 = bundle.getString(h3.t0.f9735a0);
                String str2 = t0Var.f9761b;
                if (string2 == null) {
                    string2 = str2;
                }
                s0Var.f9694b = string2;
                String string3 = bundle.getString(h3.t0.f9736b0);
                String str3 = t0Var.f9762c;
                if (string3 == null) {
                    string3 = str3;
                }
                s0Var.f9695c = string3;
                s0Var.d = bundle.getInt(h3.t0.f9737c0, t0Var.d);
                s0Var.f9696e = bundle.getInt(h3.t0.f9738d0, t0Var.f9763e);
                s0Var.f9697f = bundle.getInt(h3.t0.f9739e0, t0Var.f9764f);
                s0Var.f9698g = bundle.getInt(h3.t0.f9740f0, t0Var.h);
                String string4 = bundle.getString(h3.t0.f9741g0);
                String str4 = t0Var.f9766r;
                if (string4 == null) {
                    string4 = str4;
                }
                s0Var.h = string4;
                z3.c cVar = (z3.c) bundle.getParcelable(h3.t0.f9742h0);
                z3.c cVar2 = t0Var.f9767s;
                if (cVar == null) {
                    cVar = cVar2;
                }
                s0Var.f9699i = cVar;
                String string5 = bundle.getString(h3.t0.f9743i0);
                String str5 = t0Var.A;
                if (string5 == null) {
                    string5 = str5;
                }
                s0Var.f9704n = string5;
                String string6 = bundle.getString(h3.t0.f9744j0);
                String str6 = t0Var.B;
                if (string6 == null) {
                    string6 = str6;
                }
                s0Var.f9705o = string6;
                s0Var.f9706p = bundle.getInt(h3.t0.f9745k0, t0Var.C);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(h3.t0.f9746l0 + "_" + Integer.toString(i9, 36));
                    if (byteArray == null) {
                        s0Var.f9707q = arrayList;
                        s0Var.f9708r = (l3.c) bundle.getParcelable(h3.t0.m0);
                        s0Var.f9709s = bundle.getLong(h3.t0.f9747n0, t0Var.F);
                        s0Var.f9710t = bundle.getInt(h3.t0.f9748o0, t0Var.G);
                        s0Var.f9711u = bundle.getInt(h3.t0.f9749p0, t0Var.H);
                        s0Var.v = bundle.getFloat(h3.t0.f9750q0, t0Var.I);
                        s0Var.f9712w = bundle.getInt(h3.t0.f9751r0, t0Var.J);
                        s0Var.f9713x = bundle.getFloat(h3.t0.f9752s0, t0Var.K);
                        s0Var.f9714y = bundle.getByteArray(h3.t0.f9753t0);
                        s0Var.f9715z = bundle.getInt(h3.t0.f9754u0, t0Var.M);
                        Bundle bundle4 = bundle.getBundle(h3.t0.f9755v0);
                        if (bundle4 != null) {
                            s0Var.A = (e5.b) e5.b.f4871s.c(bundle4);
                        }
                        s0Var.B = bundle.getInt(h3.t0.f9756w0, t0Var.O);
                        s0Var.C = bundle.getInt(h3.t0.f9757x0, t0Var.P);
                        s0Var.D = bundle.getInt(h3.t0.f9758y0, t0Var.Q);
                        s0Var.E = bundle.getInt(h3.t0.f9759z0, t0Var.R);
                        s0Var.F = bundle.getInt(h3.t0.A0, t0Var.S);
                        s0Var.G = bundle.getInt(h3.t0.B0, t0Var.T);
                        s0Var.H = bundle.getInt(h3.t0.D0, t0Var.U);
                        s0Var.I = bundle.getInt(h3.t0.E0, t0Var.V);
                        s0Var.J = bundle.getInt(h3.t0.C0, t0Var.W);
                        return new h3.t0(s0Var);
                    }
                    arrayList.add(byteArray);
                    i9++;
                }
            case 15:
                if (bundle.getInt(h3.g2.f9434a, -1) != 0) {
                    z11 = false;
                }
                d5.a.f(z11);
                if (bundle.getBoolean(h3.v0.f9782e, false)) {
                    return new h3.v0(bundle.getBoolean(h3.v0.f9783f, false));
                }
                return new h3.v0();
            case 16:
                String string7 = bundle.getString(h3.f1.f9393n, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(h3.f1.f9394r);
                if (bundle5 == null) {
                    b1Var = h3.b1.f9342f;
                } else {
                    b1Var = (h3.b1) h3.b1.f9346w.c(bundle5);
                }
                h3.b1 b1Var3 = b1Var;
                Bundle bundle6 = bundle.getBundle(h3.f1.f9395s);
                if (bundle6 == null) {
                    h1Var = h3.h1.U;
                } else {
                    h1Var = (h3.h1) h3.h1.C0.c(bundle6);
                }
                h3.h1 h1Var2 = h1Var;
                Bundle bundle7 = bundle.getBundle(h3.f1.v);
                if (bundle7 == null) {
                    z0Var = h3.z0.f9830x;
                } else {
                    z0Var = (h3.z0) h3.y0.f9821w.c(bundle7);
                }
                h3.z0 z0Var2 = z0Var;
                Bundle bundle8 = bundle.getBundle(h3.f1.f9396w);
                if (bundle8 == null) {
                    d1Var = h3.d1.f9375c;
                } else {
                    d1Var = (h3.d1) h3.d1.h.c(bundle8);
                }
                return new h3.f1(string7, z0Var2, null, b1Var3, h1Var2, d1Var);
            case 17:
                h3.x0 x0Var = new h3.x0();
                String str7 = h3.y0.h;
                h3.z0 z0Var3 = h3.y0.f9817f;
                long j10 = bundle.getLong(str7, z0Var3.f9822a);
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.f(z10);
                x0Var.f9807a = j10;
                long j11 = bundle.getLong(h3.y0.f9818n, z0Var3.f9823b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    z11 = false;
                }
                d5.a.f(z11);
                x0Var.f9808b = j11;
                x0Var.f9809c = bundle.getBoolean(h3.y0.f9819r, z0Var3.f9824c);
                x0Var.d = bundle.getBoolean(h3.y0.f9820s, z0Var3.d);
                x0Var.f9810e = bundle.getBoolean(h3.y0.v, z0Var3.f9825e);
                return new h3.y0(x0Var);
            case 18:
                return new h3.b1(bundle.getLong(h3.b1.h, -9223372036854775807L), bundle.getLong(h3.b1.f9343n, -9223372036854775807L), bundle.getLong(h3.b1.f9344r, -9223372036854775807L), bundle.getFloat(h3.b1.f9345s, -3.4028235E38f), bundle.getFloat(h3.b1.v, -3.4028235E38f));
            case 19:
                a5.m mVar = new a5.m(20, false);
                mVar.f98b = (Uri) bundle.getParcelable(h3.d1.d);
                mVar.f99c = bundle.getString(h3.d1.f9376e);
                mVar.d = bundle.getBundle(h3.d1.f9377f);
                return new h3.d1(mVar);
            case 20:
                ?? obj = new Object();
                obj.f9411a = bundle.getCharSequence(h3.h1.V);
                obj.f9412b = bundle.getCharSequence(h3.h1.W);
                obj.f9413c = bundle.getCharSequence(h3.h1.X);
                obj.d = bundle.getCharSequence(h3.h1.Y);
                obj.f9414e = bundle.getCharSequence(h3.h1.Z);
                obj.f9415f = bundle.getCharSequence(h3.h1.f9441a0);
                obj.f9416g = bundle.getCharSequence(h3.h1.f9442b0);
                byte[] byteArray2 = bundle.getByteArray(h3.h1.f9445e0);
                String str8 = h3.h1.f9463x0;
                if (bundle.containsKey(str8)) {
                    num = Integer.valueOf(bundle.getInt(str8));
                } else {
                    num = null;
                }
                if (byteArray2 != null) {
                    bArr = (byte[]) byteArray2.clone();
                }
                obj.f9418j = bArr;
                obj.f9419k = num;
                obj.f9420l = (Uri) bundle.getParcelable(h3.h1.f9446f0);
                obj.f9431x = bundle.getCharSequence(h3.h1.f9456q0);
                obj.f9432y = bundle.getCharSequence(h3.h1.f9457r0);
                obj.f9433z = bundle.getCharSequence(h3.h1.f9458s0);
                obj.C = bundle.getCharSequence(h3.h1.f9461v0);
                obj.D = bundle.getCharSequence(h3.h1.f9462w0);
                obj.E = bundle.getCharSequence(h3.h1.f9464y0);
                obj.G = bundle.getBundle(h3.h1.B0);
                String str9 = h3.h1.f9443c0;
                if (bundle.containsKey(str9) && (bundle3 = bundle.getBundle(str9)) != null) {
                    obj.h = (h3.g2) h3.g2.f9435b.c(bundle3);
                }
                String str10 = h3.h1.f9444d0;
                if (bundle.containsKey(str10) && (bundle2 = bundle.getBundle(str10)) != null) {
                    obj.f9417i = (h3.g2) h3.g2.f9435b.c(bundle2);
                }
                String str11 = h3.h1.f9447g0;
                if (bundle.containsKey(str11)) {
                    obj.f9421m = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = h3.h1.f9448h0;
                if (bundle.containsKey(str12)) {
                    obj.f9422n = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = h3.h1.f9449i0;
                if (bundle.containsKey(str13)) {
                    obj.f9423o = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = h3.h1.A0;
                if (bundle.containsKey(str14)) {
                    obj.f9424p = Boolean.valueOf(bundle.getBoolean(str14));
                }
                String str15 = h3.h1.f9450j0;
                if (bundle.containsKey(str15)) {
                    obj.f9425q = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = h3.h1.f9451k0;
                if (bundle.containsKey(str16)) {
                    obj.f9426r = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = h3.h1.f9452l0;
                if (bundle.containsKey(str17)) {
                    obj.f9427s = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = h3.h1.m0;
                if (bundle.containsKey(str18)) {
                    obj.f9428t = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = h3.h1.f9453n0;
                if (bundle.containsKey(str19)) {
                    obj.f9429u = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = h3.h1.f9454o0;
                if (bundle.containsKey(str20)) {
                    obj.v = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = h3.h1.f9455p0;
                if (bundle.containsKey(str21)) {
                    obj.f9430w = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = h3.h1.f9459t0;
                if (bundle.containsKey(str22)) {
                    obj.A = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = h3.h1.f9460u0;
                if (bundle.containsKey(str23)) {
                    obj.B = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = h3.h1.f9465z0;
                if (bundle.containsKey(str24)) {
                    obj.F = Integer.valueOf(bundle.getInt(str24));
                }
                return new h3.h1(obj);
            case 21:
                if (bundle.getInt(h3.g2.f9434a, -1) != 1) {
                    z11 = false;
                }
                d5.a.f(z11);
                float f10 = bundle.getFloat(h3.u1.d, -1.0f);
                if (f10 == -1.0f) {
                    return new h3.u1();
                }
                return new h3.u1(f10);
            case 22:
                int i11 = bundle.getInt(h3.g2.f9434a, -1);
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                return (h3.g2) h3.n2.h.c(bundle);
                            }
                            throw new IllegalArgumentException(j3.r0.l(i11, "Unknown RatingType: "));
                        }
                        return (h3.g2) h3.l2.h.c(bundle);
                    }
                    return (h3.g2) h3.u1.f9779e.c(bundle);
                }
                return (h3.g2) h3.v0.h.c(bundle);
            case 23:
                if (bundle.getInt(h3.g2.f9434a, -1) != 2) {
                    z11 = false;
                }
                d5.a.f(z11);
                int i12 = bundle.getInt(h3.l2.f9582e, 5);
                float f11 = bundle.getFloat(h3.l2.f9583f, -1.0f);
                if (f11 == -1.0f) {
                    return new h3.l2(i12);
                }
                return new h3.l2(i12, f11);
            case 24:
                if (bundle.getInt(h3.g2.f9434a, -1) != 3) {
                    z11 = false;
                }
                d5.a.f(z11);
                if (bundle.getBoolean(h3.n2.f9610e, false)) {
                    return new h3.n2(bundle.getBoolean(h3.n2.f9611f, false));
                }
                return new h3.n2();
            case 25:
                int i13 = bundle.getInt(h3.p2.f9633n, 0);
                long j12 = bundle.getLong(h3.p2.f9634r, -9223372036854775807L);
                long j13 = bundle.getLong(h3.p2.f9635s, 0L);
                boolean z12 = bundle.getBoolean(h3.p2.v, false);
                Bundle bundle9 = bundle.getBundle(h3.p2.f9636w);
                if (bundle9 != null) {
                    bVar = (k4.b) k4.b.f14631w.c(bundle9);
                } else {
                    bVar = k4.b.f14627f;
                }
                k4.b bVar2 = bVar;
                h3.p2 p2Var = new h3.p2();
                p2Var.h(null, null, i13, j12, j13, bVar2, z12);
                return p2Var;
            case 26:
                Bundle bundle10 = bundle.getBundle(h3.q2.G);
                if (bundle10 != null) {
                    f1Var = (h3.f1) h3.f1.f9397x.c(bundle10);
                } else {
                    f1Var = h3.f1.h;
                }
                h3.f1 f1Var2 = f1Var;
                long j14 = bundle.getLong(h3.q2.H, -9223372036854775807L);
                long j15 = bundle.getLong(h3.q2.I, -9223372036854775807L);
                long j16 = bundle.getLong(h3.q2.J, -9223372036854775807L);
                boolean z13 = bundle.getBoolean(h3.q2.K, false);
                boolean z14 = bundle.getBoolean(h3.q2.L, false);
                Bundle bundle11 = bundle.getBundle(h3.q2.M);
                if (bundle11 != null) {
                    b1Var2 = (h3.b1) h3.b1.f9346w.c(bundle11);
                }
                boolean z15 = bundle.getBoolean(h3.q2.N, false);
                long j17 = bundle.getLong(h3.q2.O, 0L);
                long j18 = bundle.getLong(h3.q2.P, -9223372036854775807L);
                int i14 = bundle.getInt(h3.q2.Q, 0);
                int i15 = bundle.getInt(h3.q2.R, 0);
                long j19 = bundle.getLong(h3.q2.S, 0L);
                h3.q2 q2Var = new h3.q2();
                q2Var.b(h3.q2.E, f1Var2, null, j14, j15, j16, z13, z14, b1Var2, j17, j18, i14, i15, j19);
                q2Var.f9666w = z15;
                return q2Var;
            default:
                i3.i iVar = j4.i1.f13480n;
                Bundle bundle12 = bundle.getBundle(h3.s2.f9726f);
                bundle12.getClass();
                j4.i1 i1Var = (j4.i1) iVar.c(bundle12);
                int[] intArray = bundle.getIntArray(h3.s2.h);
                int i16 = i1Var.f13481a;
                int[] iArr = new int[i16];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(h3.s2.f9727n);
                boolean[] zArr = new boolean[i16];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new h3.s2(i1Var, bundle.getBoolean(h3.s2.f9728r, false), intArray, booleanArray);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f6891a) {
            case 6:
                gh.k5.d2(new ag1(6, null));
                return;
            default:
                int i10 = gh.k5.f8396m1;
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        h3.a2 a2Var = (h3.a2) obj;
        switch (this.f6891a) {
            case 9:
                a2Var.onPlayerError(new h3.n(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 10:
                a2Var.onSeekProcessed();
                return;
            default:
                a2Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i9 = f6.f6459g0;
        return 0;
    }

    public y5(gh.k5 k5Var) {
        this.f6891a = 6;
    }
}
