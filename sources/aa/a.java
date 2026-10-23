package aa;

import ab.g0;
import ab.m;
import ab.r0;
import ab.t;
import ai.ga;
import ai.l7;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import b2.a0;
import b2.i1;
import b2.n0;
import b2.p1;
import b2.q1;
import b2.s;
import b2.u1;
import b2.v;
import b2.v0;
import b2.w;
import c3.n;
import c3.q;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.bg1;
import r9.d;
import v7.b8;
public final class a implements d, z1, o6, p6, k, n {
    public final int f360a;

    public a(int i10) {
        this.f360a = i10;
    }

    @Override
    public Constructor a() {
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(q.class).getConstructor(Integer.TYPE);
    }

    @Override
    public Object apply(Object obj) {
        x1 f7;
        x1 b10;
        int i10 = 0;
        switch (this.f360a) {
            case 21:
                a0 a0Var = (a0) obj;
                return a0Var.f3694a + ": " + a0Var.f3695b;
            case 22:
                i1 i1Var = (i1) obj;
                i1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = i1Var.f3792a;
                if (i11 != 0) {
                    bundle.putInt(i1.d, i11);
                }
                int i12 = i1Var.f3793b;
                if (i12 != 0) {
                    bundle.putInt(i1.e, i12);
                }
                int i13 = i1Var.f3794c;
                if (i13 != 0) {
                    bundle.putInt(i1.f3791f, i13);
                }
                return bundle;
            case 23:
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(n0.h, n0Var.f3860a);
                String str = n0Var.f3861b;
                if (str != null) {
                    bundle2.putString(n0.f3854i, str);
                }
                String str2 = n0Var.f3862c;
                if (str2 != null) {
                    bundle2.putString(n0.f3855j, str2);
                }
                int i14 = n0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(n0.f3856k, i14);
                }
                int i15 = n0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(n0.f3857l, i15);
                }
                String str3 = n0Var.f3863f;
                if (str3 != null) {
                    bundle2.putString(n0.f3858m, str3);
                }
                String str4 = n0Var.f3864g;
                if (str4 != null) {
                    bundle2.putString(n0.f3859n, str4);
                }
                return bundle2;
            case 24:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(n0.h);
                uri.getClass();
                String string = bundle3.getString(n0.f3854i);
                String string2 = bundle3.getString(n0.f3855j);
                int i16 = bundle3.getInt(n0.f3856k, 0);
                int i17 = bundle3.getInt(n0.f3857l, 0);
                String string3 = bundle3.getString(n0.f3858m);
                String string4 = bundle3.getString(n0.f3859n);
                ?? obj2 = new Object();
                obj2.f3838c = uri;
                obj2.d = v0.n(string);
                obj2.e = string2;
                obj2.f3836a = i16;
                obj2.f3837b = i17;
                obj2.f3839f = string3;
                obj2.f3840g = string4;
                return new n0(obj2);
            case 25:
                Bundle bundle4 = (Bundle) obj;
                w wVar = w.V;
                v vVar = new v();
                if (bundle4 != null) {
                    ClassLoader classLoader = e.class.getClassLoader();
                    String str5 = m0.f8259a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(w.W);
                String str6 = wVar.f4120a;
                if (string5 == null) {
                    string5 = str6;
                }
                vVar.f4068a = string5;
                String string6 = bundle4.getString(w.X);
                String str7 = wVar.f4121b;
                if (string6 == null) {
                    string6 = str7;
                }
                vVar.f4069b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(w.B0);
                if (parcelableArrayList == null) {
                    f7 = x1.e;
                } else {
                    k0 t10 = e9.n0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(a0.f3693c);
                        String string8 = bundle5.getString(a0.d);
                        string8.getClass();
                        t10.c(new a0(string7, string8));
                    }
                    f7 = t10.f();
                }
                vVar.f4070c = e9.n0.u(f7);
                String string9 = bundle4.getString(w.Y);
                String str8 = wVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                vVar.d = string9;
                vVar.e = bundle4.getInt(w.Z, wVar.e);
                vVar.f4071f = bundle4.getInt(w.f4095a0, wVar.f4123f);
                vVar.f4072g = bundle4.getInt(w.C0, wVar.f4124g);
                vVar.h = bundle4.getInt(w.f4096b0, wVar.h);
                vVar.f4073i = bundle4.getInt(w.f4097c0, wVar.f4125i);
                String string10 = bundle4.getString(w.f4098d0);
                String str9 = wVar.f4127k;
                if (string10 == null) {
                    string10 = str9;
                }
                vVar.f4074j = string10;
                String string11 = bundle4.getString(w.G0);
                String str10 = wVar.f4129m;
                if (string11 == null) {
                    string11 = str10;
                }
                vVar.f4076l = string11;
                String string12 = bundle4.getString(w.f4099e0);
                String str11 = wVar.f4134r;
                if (string12 == null) {
                    string12 = str11;
                }
                vVar.f4081q = v0.n(string12);
                String string13 = bundle4.getString(w.f4100f0);
                String str12 = wVar.f4135s;
                if (string13 == null) {
                    string13 = str12;
                }
                vVar.f4082r = v0.n(string13);
                vVar.f4083s = bundle4.getInt(w.f4101g0, wVar.f4136t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(w.f4102h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        vVar.f4085u = arrayList;
                        vVar.v = (s) bundle4.getParcelable(w.f4103i0);
                        vVar.f4086w = bundle4.getLong(w.f4104j0, wVar.f4139x);
                        vVar.f4088y = bundle4.getInt(w.f4105k0, wVar.f4141z);
                        vVar.f4089z = bundle4.getInt(w.f4106l0, wVar.A);
                        vVar.A = bundle4.getInt(w.E0, wVar.B);
                        vVar.B = bundle4.getInt(w.F0, wVar.C);
                        vVar.C = bundle4.getFloat(w.m0, wVar.D);
                        vVar.D = bundle4.getInt(w.f4107n0, wVar.E);
                        vVar.E = bundle4.getFloat(w.f4108o0, wVar.F);
                        vVar.F = bundle4.getByteArray(w.f4109p0);
                        vVar.G = bundle4.getInt(w.f4110q0, wVar.H);
                        vVar.I = bundle4.getInt(w.D0, wVar.J);
                        Bundle bundle6 = bundle4.getBundle(w.f4111r0);
                        if (bundle6 != null) {
                            vVar.H = new b2.n(bundle6.getInt(b2.n.f3843i, -1), bundle6.getInt(b2.n.f3844j, -1), bundle6.getInt(b2.n.f3845k, -1), bundle6.getByteArray(b2.n.f3846l), bundle6.getInt(b2.n.f3847m, -1), bundle6.getInt(b2.n.f3848n, -1));
                        }
                        vVar.J = bundle4.getInt(w.f4112s0, wVar.K);
                        vVar.K = bundle4.getInt(w.f4113t0, wVar.L);
                        vVar.L = bundle4.getInt(w.f4114u0, wVar.M);
                        vVar.M = bundle4.getInt(w.f4115v0, wVar.N);
                        vVar.N = bundle4.getInt(w.f4116w0, wVar.O);
                        vVar.O = bundle4.getInt(w.f4117x0, wVar.P);
                        vVar.Q = bundle4.getInt(w.f4119z0, wVar.R);
                        vVar.R = bundle4.getInt(w.A0, wVar.S);
                        vVar.S = bundle4.getInt(w.f4118y0, wVar.T);
                        return new w(vVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 26:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(q1.f3933c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(p1.f3905f);
                if (parcelableArrayList2 == null) {
                    l0 l0Var = e9.n0.f8481b;
                    b10 = x1.e;
                } else {
                    b10 = e.b(new a(25), parcelableArrayList2);
                }
                p1 p1Var = new p1(bundle8.getString(p1.f3906g, ""), (w[]) b10.toArray(new w[0]));
                int[] intArray = bundle7.getIntArray(q1.d);
                intArray.getClass();
                return new q1(p1Var, b8.a(intArray));
            default:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(u1.f4062f, u1Var.f4066b.c());
                bundle9.putIntArray(u1.f4063g, u1Var.d);
                bundle9.putBooleanArray(u1.h, u1Var.e);
                bundle9.putBoolean(u1.f4064i, u1Var.f4067c);
                return bundle9;
        }
    }

    @Override
    public void d(int i10, View view) {
        ((ga) view).setColor(i10);
    }

    @Override
    public int f(View view) {
        return ((ga) view).f1360x;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f360a) {
            case 13:
                int i11 = l7.A1;
                return;
            default:
                l7.D2(new bg1(6, null));
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
        switch (this.f360a) {
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

    public a(l7 l7Var) {
        this.f360a = 14;
    }
}
