package aa;

import ab.g0;
import ab.m;
import ab.r0;
import ab.t;
import ai.k7;
import android.net.Uri;
import android.os.Bundle;
import b2.a0;
import b2.i1;
import b2.n;
import b2.n0;
import b2.p1;
import b2.q1;
import b2.s;
import b2.u1;
import b2.v;
import b2.v0;
import b2.w;
import c3.o;
import cb.h;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d9.k;
import e2.e;
import e2.m0;
import e9.k0;
import e9.l0;
import e9.x1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.xf1;
import r9.d;
import v7.b8;
public final class a implements d, a2, k, NativeInstance.AudioLevelsCallback {
    public final int f361a;

    public a(int i10) {
        this.f361a = i10;
    }

    public Constructor a() {
        switch (this.f361a) {
            case 27:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(o.class).getConstructor(null);
        }
    }

    @Override
    public Object apply(Object obj) {
        x1 f7;
        x1 b10;
        int i10 = 0;
        switch (this.f361a) {
            case 19:
                a0 a0Var = (a0) obj;
                return a0Var.f3691a + ": " + a0Var.f3692b;
            case 20:
                i1 i1Var = (i1) obj;
                i1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = i1Var.f3789a;
                if (i11 != 0) {
                    bundle.putInt(i1.d, i11);
                }
                int i12 = i1Var.f3790b;
                if (i12 != 0) {
                    bundle.putInt(i1.e, i12);
                }
                int i13 = i1Var.f3791c;
                if (i13 != 0) {
                    bundle.putInt(i1.f3788f, i13);
                }
                return bundle;
            case 21:
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(n0.h, n0Var.f3857a);
                String str = n0Var.f3858b;
                if (str != null) {
                    bundle2.putString(n0.f3851i, str);
                }
                String str2 = n0Var.f3859c;
                if (str2 != null) {
                    bundle2.putString(n0.f3852j, str2);
                }
                int i14 = n0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(n0.f3853k, i14);
                }
                int i15 = n0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(n0.f3854l, i15);
                }
                String str3 = n0Var.f3860f;
                if (str3 != null) {
                    bundle2.putString(n0.f3855m, str3);
                }
                String str4 = n0Var.f3861g;
                if (str4 != null) {
                    bundle2.putString(n0.f3856n, str4);
                }
                return bundle2;
            case 22:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(n0.h);
                uri.getClass();
                String string = bundle3.getString(n0.f3851i);
                String string2 = bundle3.getString(n0.f3852j);
                int i16 = bundle3.getInt(n0.f3853k, 0);
                int i17 = bundle3.getInt(n0.f3854l, 0);
                String string3 = bundle3.getString(n0.f3855m);
                String string4 = bundle3.getString(n0.f3856n);
                ?? obj2 = new Object();
                obj2.f3835c = uri;
                obj2.d = v0.n(string);
                obj2.e = string2;
                obj2.f3833a = i16;
                obj2.f3834b = i17;
                obj2.f3836f = string3;
                obj2.f3837g = string4;
                return new n0(obj2);
            case 23:
                Bundle bundle4 = (Bundle) obj;
                w wVar = w.V;
                v vVar = new v();
                if (bundle4 != null) {
                    ClassLoader classLoader = e.class.getClassLoader();
                    String str5 = m0.f8253a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(w.W);
                String str6 = wVar.f4117a;
                if (string5 == null) {
                    string5 = str6;
                }
                vVar.f4065a = string5;
                String string6 = bundle4.getString(w.X);
                String str7 = wVar.f4118b;
                if (string6 == null) {
                    string6 = str7;
                }
                vVar.f4066b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(w.B0);
                if (parcelableArrayList == null) {
                    f7 = x1.e;
                } else {
                    k0 t10 = e9.n0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(a0.f3690c);
                        String string8 = bundle5.getString(a0.d);
                        string8.getClass();
                        t10.c(new a0(string7, string8));
                    }
                    f7 = t10.f();
                }
                vVar.f4067c = e9.n0.u(f7);
                String string9 = bundle4.getString(w.Y);
                String str8 = wVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                vVar.d = string9;
                vVar.e = bundle4.getInt(w.Z, wVar.e);
                vVar.f4068f = bundle4.getInt(w.f4092a0, wVar.f4120f);
                vVar.f4069g = bundle4.getInt(w.C0, wVar.f4121g);
                vVar.h = bundle4.getInt(w.f4093b0, wVar.h);
                vVar.f4070i = bundle4.getInt(w.f4094c0, wVar.f4122i);
                String string10 = bundle4.getString(w.f4095d0);
                String str9 = wVar.f4124k;
                if (string10 == null) {
                    string10 = str9;
                }
                vVar.f4071j = string10;
                String string11 = bundle4.getString(w.G0);
                String str10 = wVar.f4126m;
                if (string11 == null) {
                    string11 = str10;
                }
                vVar.f4073l = string11;
                String string12 = bundle4.getString(w.f4096e0);
                String str11 = wVar.f4131r;
                if (string12 == null) {
                    string12 = str11;
                }
                vVar.f4078q = v0.n(string12);
                String string13 = bundle4.getString(w.f4097f0);
                String str12 = wVar.f4132s;
                if (string13 == null) {
                    string13 = str12;
                }
                vVar.f4079r = v0.n(string13);
                vVar.f4080s = bundle4.getInt(w.f4098g0, wVar.f4133t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(w.f4099h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        vVar.f4082u = arrayList;
                        vVar.v = (s) bundle4.getParcelable(w.f4100i0);
                        vVar.f4083w = bundle4.getLong(w.f4101j0, wVar.f4136x);
                        vVar.f4085y = bundle4.getInt(w.f4102k0, wVar.f4138z);
                        vVar.f4086z = bundle4.getInt(w.f4103l0, wVar.A);
                        vVar.A = bundle4.getInt(w.E0, wVar.B);
                        vVar.B = bundle4.getInt(w.F0, wVar.C);
                        vVar.C = bundle4.getFloat(w.m0, wVar.D);
                        vVar.D = bundle4.getInt(w.f4104n0, wVar.E);
                        vVar.E = bundle4.getFloat(w.f4105o0, wVar.F);
                        vVar.F = bundle4.getByteArray(w.f4106p0);
                        vVar.G = bundle4.getInt(w.f4107q0, wVar.H);
                        vVar.I = bundle4.getInt(w.D0, wVar.J);
                        Bundle bundle6 = bundle4.getBundle(w.f4108r0);
                        if (bundle6 != null) {
                            vVar.H = new n(bundle6.getInt(n.f3840i, -1), bundle6.getInt(n.f3841j, -1), bundle6.getInt(n.f3842k, -1), bundle6.getByteArray(n.f3843l), bundle6.getInt(n.f3844m, -1), bundle6.getInt(n.f3845n, -1));
                        }
                        vVar.J = bundle4.getInt(w.f4109s0, wVar.K);
                        vVar.K = bundle4.getInt(w.f4110t0, wVar.L);
                        vVar.L = bundle4.getInt(w.f4111u0, wVar.M);
                        vVar.M = bundle4.getInt(w.f4112v0, wVar.N);
                        vVar.N = bundle4.getInt(w.f4113w0, wVar.O);
                        vVar.O = bundle4.getInt(w.f4114x0, wVar.P);
                        vVar.Q = bundle4.getInt(w.f4116z0, wVar.R);
                        vVar.R = bundle4.getInt(w.A0, wVar.S);
                        vVar.S = bundle4.getInt(w.f4115y0, wVar.T);
                        return new w(vVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 24:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(q1.f3930c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(p1.f3902f);
                if (parcelableArrayList2 == null) {
                    l0 l0Var = e9.n0.f8475b;
                    b10 = x1.e;
                } else {
                    b10 = e.b(new a(23), parcelableArrayList2);
                }
                p1 p1Var = new p1(bundle8.getString(p1.f3903g, ""), (w[]) b10.toArray(new w[0]));
                int[] intArray = bundle7.getIntArray(q1.d);
                intArray.getClass();
                return new q1(p1Var, b8.a(intArray));
            default:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(u1.f4059f, u1Var.f4063b.c());
                bundle9.putIntArray(u1.f4060g, u1Var.d);
                bundle9.putBooleanArray(u1.h, u1Var.e);
                bundle9.putBoolean(u1.f4061i, u1Var.f4064c);
                return bundle9;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f361a) {
            case 13:
                int i11 = k7.A1;
                return;
            default:
                k7.x2(new xf1(6, null));
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        m m10getComponents$lambda0;
        ab.m0 m11getComponents$lambda1;
        g0 m12getComponents$lambda2;
        h m13getComponents$lambda3;
        t m14getComponents$lambda4;
        r0 m15getComponents$lambda5;
        switch (this.f361a) {
            case 7:
                m10getComponents$lambda0 = FirebaseSessionsRegistrar.m10getComponents$lambda0(z5Var);
                return m10getComponents$lambda0;
            case 8:
                m11getComponents$lambda1 = FirebaseSessionsRegistrar.m11getComponents$lambda1(z5Var);
                return m11getComponents$lambda1;
            case 9:
                m12getComponents$lambda2 = FirebaseSessionsRegistrar.m12getComponents$lambda2(z5Var);
                return m12getComponents$lambda2;
            case 10:
                m13getComponents$lambda3 = FirebaseSessionsRegistrar.m13getComponents$lambda3(z5Var);
                return m13getComponents$lambda3;
            case 11:
                m14getComponents$lambda4 = FirebaseSessionsRegistrar.m14getComponents$lambda4(z5Var);
                return m14getComponents$lambda4;
            default:
                m15getComponents$lambda5 = FirebaseSessionsRegistrar.m15getComponents$lambda5(z5Var);
                return m15getComponents$lambda5;
        }
    }

    public a(k7 k7Var) {
        this.f361a = 14;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
