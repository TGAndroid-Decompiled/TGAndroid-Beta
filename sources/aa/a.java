package aa;

import android.net.Uri;
import android.os.Bundle;
import b2.b0;
import b2.i1;
import b2.o0;
import b2.p1;
import b2.q1;
import b2.v0;
import b2.v1;
import b2.w;
import b2.x;
import bb.g0;
import bb.m;
import bb.m0;
import bb.q0;
import bb.t;
import c3.o;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d9.k;
import db.h;
import e2.e;
import e2.l0;
import e9.k0;
import e9.n0;
import e9.x1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.u1;
import r9.d;
import v7.c8;
public final class a implements u1, k, d {
    public final int f360a;

    public a(int i10) {
        this.f360a = i10;
    }

    @Override
    public Object K(bh.d dVar) {
        m m9getComponents$lambda0;
        m0 m10getComponents$lambda1;
        g0 m11getComponents$lambda2;
        h m12getComponents$lambda3;
        t m13getComponents$lambda4;
        q0 m14getComponents$lambda5;
        switch (this.f360a) {
            case 21:
                m9getComponents$lambda0 = FirebaseSessionsRegistrar.m9getComponents$lambda0(dVar);
                return m9getComponents$lambda0;
            case 22:
                m10getComponents$lambda1 = FirebaseSessionsRegistrar.m10getComponents$lambda1(dVar);
                return m10getComponents$lambda1;
            case 23:
                m11getComponents$lambda2 = FirebaseSessionsRegistrar.m11getComponents$lambda2(dVar);
                return m11getComponents$lambda2;
            case 24:
                m12getComponents$lambda3 = FirebaseSessionsRegistrar.m12getComponents$lambda3(dVar);
                return m12getComponents$lambda3;
            case 25:
                m13getComponents$lambda4 = FirebaseSessionsRegistrar.m13getComponents$lambda4(dVar);
                return m13getComponents$lambda4;
            default:
                m14getComponents$lambda5 = FirebaseSessionsRegistrar.m14getComponents$lambda5(dVar);
                return m14getComponents$lambda5;
        }
    }

    public Constructor a() {
        switch (this.f360a) {
            case 28:
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
        switch (this.f360a) {
            case 13:
                b0 b0Var = (b0) obj;
                return b0Var.f1980a + ": " + b0Var.f1981b;
            case 14:
                i1 i1Var = (i1) obj;
                i1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = i1Var.f2068a;
                if (i11 != 0) {
                    bundle.putInt(i1.d, i11);
                }
                int i12 = i1Var.f2069b;
                if (i12 != 0) {
                    bundle.putInt(i1.e, i12);
                }
                int i13 = i1Var.f2070c;
                if (i13 != 0) {
                    bundle.putInt(i1.f2067f, i13);
                }
                return bundle;
            case 15:
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(o0.h, o0Var.f2167a);
                String str = o0Var.f2168b;
                if (str != null) {
                    bundle2.putString(o0.f2161i, str);
                }
                String str2 = o0Var.f2169c;
                if (str2 != null) {
                    bundle2.putString(o0.f2162j, str2);
                }
                int i14 = o0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(o0.f2163k, i14);
                }
                int i15 = o0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(o0.f2164l, i15);
                }
                String str3 = o0Var.f2170f;
                if (str3 != null) {
                    bundle2.putString(o0.f2165m, str3);
                }
                String str4 = o0Var.f2171g;
                if (str4 != null) {
                    bundle2.putString(o0.f2166n, str4);
                }
                return bundle2;
            case 16:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(o0.h);
                uri.getClass();
                String string = bundle3.getString(o0.f2161i);
                String string2 = bundle3.getString(o0.f2162j);
                int i16 = bundle3.getInt(o0.f2163k, 0);
                int i17 = bundle3.getInt(o0.f2164l, 0);
                String string3 = bundle3.getString(o0.f2165m);
                String string4 = bundle3.getString(o0.f2166n);
                ?? obj2 = new Object();
                obj2.f2125c = uri;
                obj2.d = v0.n(string);
                obj2.e = string2;
                obj2.f2123a = i16;
                obj2.f2124b = i17;
                obj2.f2126f = string3;
                obj2.f2127g = string4;
                return new o0(obj2);
            case 17:
                Bundle bundle4 = (Bundle) obj;
                x xVar = x.V;
                w wVar = new w();
                if (bundle4 != null) {
                    ClassLoader classLoader = e.class.getClassLoader();
                    String str5 = l0.f6165a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(x.W);
                String str6 = xVar.f2408a;
                if (string5 == null) {
                    string5 = str6;
                }
                wVar.f2356a = string5;
                String string6 = bundle4.getString(x.X);
                String str7 = xVar.f2409b;
                if (string6 == null) {
                    string6 = str7;
                }
                wVar.f2357b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(x.B0);
                if (parcelableArrayList == null) {
                    f7 = x1.e;
                } else {
                    k0 t10 = n0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b0.f1979c);
                        String string8 = bundle5.getString(b0.d);
                        string8.getClass();
                        t10.c(new b0(string7, string8));
                    }
                    f7 = t10.f();
                }
                wVar.f2358c = n0.u(f7);
                String string9 = bundle4.getString(x.Y);
                String str8 = xVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                wVar.d = string9;
                wVar.e = bundle4.getInt(x.Z, xVar.e);
                wVar.f2359f = bundle4.getInt(x.f2383a0, xVar.f2411f);
                wVar.f2360g = bundle4.getInt(x.C0, xVar.f2412g);
                wVar.h = bundle4.getInt(x.f2384b0, xVar.h);
                wVar.f2361i = bundle4.getInt(x.f2385c0, xVar.f2413i);
                String string10 = bundle4.getString(x.f2386d0);
                String str9 = xVar.f2415k;
                if (string10 == null) {
                    string10 = str9;
                }
                wVar.f2362j = string10;
                String string11 = bundle4.getString(x.G0);
                String str10 = xVar.f2417m;
                if (string11 == null) {
                    string11 = str10;
                }
                wVar.f2364l = string11;
                String string12 = bundle4.getString(x.f2387e0);
                String str11 = xVar.f2422r;
                if (string12 == null) {
                    string12 = str11;
                }
                wVar.f2369q = v0.n(string12);
                String string13 = bundle4.getString(x.f2388f0);
                String str12 = xVar.f2423s;
                if (string13 == null) {
                    string13 = str12;
                }
                wVar.f2370r = v0.n(string13);
                wVar.f2371s = bundle4.getInt(x.f2389g0, xVar.f2424t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(x.f2390h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        wVar.f2373u = arrayList;
                        wVar.v = (b2.t) bundle4.getParcelable(x.f2391i0);
                        wVar.f2374w = bundle4.getLong(x.f2392j0, xVar.f2427x);
                        wVar.f2376y = bundle4.getInt(x.f2393k0, xVar.f2429z);
                        wVar.f2377z = bundle4.getInt(x.f2394l0, xVar.A);
                        wVar.A = bundle4.getInt(x.E0, xVar.B);
                        wVar.B = bundle4.getInt(x.F0, xVar.C);
                        wVar.C = bundle4.getFloat(x.m0, xVar.D);
                        wVar.D = bundle4.getInt(x.f2395n0, xVar.E);
                        wVar.E = bundle4.getFloat(x.f2396o0, xVar.F);
                        wVar.F = bundle4.getByteArray(x.f2397p0);
                        wVar.G = bundle4.getInt(x.f2398q0, xVar.H);
                        wVar.I = bundle4.getInt(x.D0, xVar.J);
                        Bundle bundle6 = bundle4.getBundle(x.f2399r0);
                        if (bundle6 != null) {
                            wVar.H = new b2.o(bundle6.getInt(b2.o.f2150i, -1), bundle6.getInt(b2.o.f2151j, -1), bundle6.getInt(b2.o.f2152k, -1), bundle6.getByteArray(b2.o.f2153l), bundle6.getInt(b2.o.f2154m, -1), bundle6.getInt(b2.o.f2155n, -1));
                        }
                        wVar.J = bundle4.getInt(x.f2400s0, xVar.K);
                        wVar.K = bundle4.getInt(x.f2401t0, xVar.L);
                        wVar.L = bundle4.getInt(x.f2402u0, xVar.M);
                        wVar.M = bundle4.getInt(x.f2403v0, xVar.N);
                        wVar.N = bundle4.getInt(x.f2404w0, xVar.O);
                        wVar.O = bundle4.getInt(x.f2405x0, xVar.P);
                        wVar.Q = bundle4.getInt(x.f2407z0, xVar.R);
                        wVar.R = bundle4.getInt(x.A0, xVar.S);
                        wVar.S = bundle4.getInt(x.f2406y0, xVar.T);
                        return new x(wVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 18:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(q1.f2195c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(p1.f2185f);
                if (parcelableArrayList2 == null) {
                    e9.l0 l0Var = n0.f6390b;
                    b10 = x1.e;
                } else {
                    b10 = e.b(new a(17), parcelableArrayList2);
                }
                p1 p1Var = new p1(bundle8.getString(p1.f2186g, ""), (x[]) b10.toArray(new x[0]));
                int[] intArray = bundle7.getIntArray(q1.d);
                intArray.getClass();
                return new q1(p1Var, c8.a(intArray));
            default:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(v1.f2350f, v1Var.f2354b.c());
                bundle9.putIntArray(v1.f2351g, v1Var.d);
                bundle9.putBooleanArray(v1.h, v1Var.e);
                bundle9.putBoolean(v1.f2352i, v1Var.f2355c);
                return bundle9;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f360a) {
            case 6:
                x1Var.dismiss();
                return;
            default:
                x1Var.dismiss();
                return;
        }
    }
}
