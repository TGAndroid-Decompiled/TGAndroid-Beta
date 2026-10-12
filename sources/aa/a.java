package aa;

import ab.g0;
import ab.m;
import ab.r0;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import b2.b0;
import b2.j1;
import b2.o;
import b2.o0;
import b2.q1;
import b2.r1;
import b2.t;
import b2.v1;
import b2.w;
import b2.w0;
import b2.x;
import bi.b2;
import cb.h;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d9.k;
import e2.e;
import e2.m0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import r9.d;
import v7.b8;
public final class a implements d, k, NativeInstance.AudioLevelsCallback, fw0, gw0, z1 {
    public final int f358a;

    public a(int i10) {
        this.f358a = i10;
    }

    @Override
    public Object apply(Object obj) {
        x1 f7;
        x1 b10;
        int i10 = 0;
        switch (this.f358a) {
            case 17:
                b0 b0Var = (b0) obj;
                return b0Var.f2077a + ": " + b0Var.f2078b;
            case 18:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                Bundle bundle = new Bundle();
                int i11 = j1Var.f2176a;
                if (i11 != 0) {
                    bundle.putInt(j1.d, i11);
                }
                int i12 = j1Var.f2177b;
                if (i12 != 0) {
                    bundle.putInt(j1.e, i12);
                }
                int i13 = j1Var.f2178c;
                if (i13 != 0) {
                    bundle.putInt(j1.f2175f, i13);
                }
                return bundle;
            case 19:
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(o0.h, o0Var.f2244a);
                String str = o0Var.f2245b;
                if (str != null) {
                    bundle2.putString(o0.f2238i, str);
                }
                String str2 = o0Var.f2246c;
                if (str2 != null) {
                    bundle2.putString(o0.f2239j, str2);
                }
                int i14 = o0Var.d;
                if (i14 != 0) {
                    bundle2.putInt(o0.f2240k, i14);
                }
                int i15 = o0Var.e;
                if (i15 != 0) {
                    bundle2.putInt(o0.f2241l, i15);
                }
                String str3 = o0Var.f2247f;
                if (str3 != null) {
                    bundle2.putString(o0.f2242m, str3);
                }
                String str4 = o0Var.f2248g;
                if (str4 != null) {
                    bundle2.putString(o0.f2243n, str4);
                }
                return bundle2;
            case 20:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(o0.h);
                uri.getClass();
                String string = bundle3.getString(o0.f2238i);
                String string2 = bundle3.getString(o0.f2239j);
                int i16 = bundle3.getInt(o0.f2240k, 0);
                int i17 = bundle3.getInt(o0.f2241l, 0);
                String string3 = bundle3.getString(o0.f2242m);
                String string4 = bundle3.getString(o0.f2243n);
                ?? obj2 = new Object();
                obj2.f2222c = uri;
                obj2.d = w0.n(string);
                obj2.e = string2;
                obj2.f2220a = i16;
                obj2.f2221b = i17;
                obj2.f2223f = string3;
                obj2.f2224g = string4;
                return new o0(obj2);
            case 21:
                Bundle bundle4 = (Bundle) obj;
                x xVar = x.V;
                w wVar = new w();
                if (bundle4 != null) {
                    ClassLoader classLoader = e.class.getClassLoader();
                    String str5 = m0.f8372a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(x.W);
                String str6 = xVar.f2504a;
                if (string5 == null) {
                    string5 = str6;
                }
                wVar.f2452a = string5;
                String string6 = bundle4.getString(x.X);
                String str7 = xVar.f2505b;
                if (string6 == null) {
                    string6 = str7;
                }
                wVar.f2453b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(x.B0);
                if (parcelableArrayList == null) {
                    f7 = x1.e;
                } else {
                    k0 t10 = n0.t();
                    for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i18);
                        bundle5.getClass();
                        String string7 = bundle5.getString(b0.f2076c);
                        String string8 = bundle5.getString(b0.d);
                        string8.getClass();
                        t10.c(new b0(string7, string8));
                    }
                    f7 = t10.f();
                }
                wVar.f2454c = n0.u(f7);
                String string9 = bundle4.getString(x.Y);
                String str8 = xVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                wVar.d = string9;
                wVar.e = bundle4.getInt(x.Z, xVar.e);
                wVar.f2455f = bundle4.getInt(x.f2479a0, xVar.f2507f);
                wVar.f2456g = bundle4.getInt(x.C0, xVar.f2508g);
                wVar.h = bundle4.getInt(x.f2480b0, xVar.h);
                wVar.f2457i = bundle4.getInt(x.f2481c0, xVar.f2509i);
                String string10 = bundle4.getString(x.f2482d0);
                String str9 = xVar.f2511k;
                if (string10 == null) {
                    string10 = str9;
                }
                wVar.f2458j = string10;
                String string11 = bundle4.getString(x.G0);
                String str10 = xVar.f2513m;
                if (string11 == null) {
                    string11 = str10;
                }
                wVar.f2460l = string11;
                String string12 = bundle4.getString(x.f2483e0);
                String str11 = xVar.f2518r;
                if (string12 == null) {
                    string12 = str11;
                }
                wVar.f2465q = w0.n(string12);
                String string13 = bundle4.getString(x.f2484f0);
                String str12 = xVar.f2519s;
                if (string13 == null) {
                    string13 = str12;
                }
                wVar.f2466r = w0.n(string13);
                wVar.f2467s = bundle4.getInt(x.f2485g0, xVar.f2520t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(x.f2486h0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        wVar.f2469u = arrayList;
                        wVar.v = (t) bundle4.getParcelable(x.f2487i0);
                        wVar.f2470w = bundle4.getLong(x.f2488j0, xVar.f2523x);
                        wVar.f2472y = bundle4.getInt(x.f2489k0, xVar.f2525z);
                        wVar.f2473z = bundle4.getInt(x.f2490l0, xVar.A);
                        wVar.A = bundle4.getInt(x.E0, xVar.B);
                        wVar.B = bundle4.getInt(x.F0, xVar.C);
                        wVar.C = bundle4.getFloat(x.m0, xVar.D);
                        wVar.D = bundle4.getInt(x.f2491n0, xVar.E);
                        wVar.E = bundle4.getFloat(x.f2492o0, xVar.F);
                        wVar.F = bundle4.getByteArray(x.f2493p0);
                        wVar.G = bundle4.getInt(x.f2494q0, xVar.H);
                        wVar.I = bundle4.getInt(x.D0, xVar.J);
                        Bundle bundle6 = bundle4.getBundle(x.f2495r0);
                        if (bundle6 != null) {
                            wVar.H = new o(bundle6.getInt(o.f2227i, -1), bundle6.getInt(o.f2228j, -1), bundle6.getInt(o.f2229k, -1), bundle6.getByteArray(o.f2230l), bundle6.getInt(o.f2231m, -1), bundle6.getInt(o.f2232n, -1));
                        }
                        wVar.J = bundle4.getInt(x.f2496s0, xVar.K);
                        wVar.K = bundle4.getInt(x.f2497t0, xVar.L);
                        wVar.L = bundle4.getInt(x.f2498u0, xVar.M);
                        wVar.M = bundle4.getInt(x.f2499v0, xVar.N);
                        wVar.N = bundle4.getInt(x.f2500w0, xVar.O);
                        wVar.O = bundle4.getInt(x.f2501x0, xVar.P);
                        wVar.Q = bundle4.getInt(x.f2503z0, xVar.R);
                        wVar.R = bundle4.getInt(x.A0, xVar.S);
                        wVar.S = bundle4.getInt(x.f2502y0, xVar.T);
                        return new x(wVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 22:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(r1.f2317c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(q1.f2289f);
                if (parcelableArrayList2 == null) {
                    l0 l0Var = n0.f8592b;
                    b10 = x1.e;
                } else {
                    b10 = e.b(new a(21), parcelableArrayList2);
                }
                q1 q1Var = new q1(bundle8.getString(q1.f2290g, ""), (x[]) b10.toArray(new x[0]));
                int[] intArray = bundle7.getIntArray(r1.d);
                intArray.getClass();
                return new r1(q1Var, b8.a(intArray));
            default:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(v1.f2446f, v1Var.f2450b.c());
                bundle9.putIntArray(v1.f2447g, v1Var.d);
                bundle9.putBooleanArray(v1.h, v1Var.e);
                bundle9.putBoolean(v1.f2448i, v1Var.f2451c);
                return bundle9;
        }
    }

    @Override
    public void b(Object obj, float f7) {
        b2 b2Var = (b2) obj;
        switch (this.f358a) {
            case 26:
                WindowManager.LayoutParams layoutParams = b2Var.f2855c;
                b2Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(b2Var.f2854b, b2Var.d, layoutParams);
                return;
            default:
                WindowManager.LayoutParams layoutParams2 = b2Var.f2855c;
                b2Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(b2Var.f2854b, b2Var.d, layoutParams2);
                return;
        }
    }

    @Override
    public void g(a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override
    public float get(Object obj) {
        b2 b2Var = (b2) obj;
        switch (this.f358a) {
            case 25:
                return b2Var.N;
            default:
                return b2Var.O;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        m m9getComponents$lambda0;
        ab.m0 m10getComponents$lambda1;
        g0 m11getComponents$lambda2;
        h m12getComponents$lambda3;
        ab.t m13getComponents$lambda4;
        r0 m14getComponents$lambda5;
        switch (this.f358a) {
            case 7:
                m9getComponents$lambda0 = FirebaseSessionsRegistrar.m9getComponents$lambda0(z5Var);
                return m9getComponents$lambda0;
            case 8:
                m10getComponents$lambda1 = FirebaseSessionsRegistrar.m10getComponents$lambda1(z5Var);
                return m10getComponents$lambda1;
            case 9:
                m11getComponents$lambda2 = FirebaseSessionsRegistrar.m11getComponents$lambda2(z5Var);
                return m11getComponents$lambda2;
            case 10:
                m12getComponents$lambda3 = FirebaseSessionsRegistrar.m12getComponents$lambda3(z5Var);
                return m12getComponents$lambda3;
            case 11:
                m13getComponents$lambda4 = FirebaseSessionsRegistrar.m13getComponents$lambda4(z5Var);
                return m13getComponents$lambda4;
            default:
                m14getComponents$lambda5 = FirebaseSessionsRegistrar.m14getComponents$lambda5(z5Var);
                return m14getComponents$lambda5;
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
