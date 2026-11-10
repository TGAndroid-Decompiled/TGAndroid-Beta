package di;

import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.id;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;
public final class a1 implements NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.r1, g9.k, u9.d, org.telegram.messenger.k9, w10, e20 {
    public final int f8800a;

    public a1(int i7) {
        this.f8800a = i7;
    }

    public static ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher c(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class f() {
        return ShortcutManager.class;
    }

    public Constructor a() {
        switch (this.f8800a) {
            case 19:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(f3.o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(f3.o.class).getConstructor(null);
        }
    }

    @Override
    public Object apply(Object obj) {
        h9.t1 f10;
        h9.t1 b10;
        int i7 = 0;
        switch (this.f8800a) {
            case 4:
                e2.x xVar = (e2.x) obj;
                return xVar.f10647a + ": " + xVar.f10648b;
            case 5:
                e2.f1 f1Var = (e2.f1) obj;
                f1Var.getClass();
                Bundle bundle = new Bundle();
                int i10 = f1Var.f10252a;
                if (i10 != 0) {
                    bundle.putInt(e2.f1.d, i10);
                }
                int i11 = f1Var.f10253b;
                if (i11 != 0) {
                    bundle.putInt(e2.f1.f10250e, i11);
                }
                int i12 = f1Var.f10254c;
                if (i12 != 0) {
                    bundle.putInt(e2.f1.f10251f, i12);
                }
                return bundle;
            case 6:
                e2.k0 k0Var = (e2.k0) obj;
                k0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(e2.k0.h, k0Var.f10314a);
                String str = k0Var.f10315b;
                if (str != null) {
                    bundle2.putString(e2.k0.f10308i, str);
                }
                String str2 = k0Var.f10316c;
                if (str2 != null) {
                    bundle2.putString(e2.k0.f10309j, str2);
                }
                int i13 = k0Var.d;
                if (i13 != 0) {
                    bundle2.putInt(e2.k0.f10310k, i13);
                }
                int i14 = k0Var.f10317e;
                if (i14 != 0) {
                    bundle2.putInt(e2.k0.f10311l, i14);
                }
                String str3 = k0Var.f10318f;
                if (str3 != null) {
                    bundle2.putString(e2.k0.f10312m, str3);
                }
                String str4 = k0Var.f10319g;
                if (str4 != null) {
                    bundle2.putString(e2.k0.f10313n, str4);
                }
                return bundle2;
            case 7:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(e2.k0.h);
                uri.getClass();
                String string = bundle3.getString(e2.k0.f10308i);
                String string2 = bundle3.getString(e2.k0.f10309j);
                int i15 = bundle3.getInt(e2.k0.f10310k, 0);
                int i16 = bundle3.getInt(e2.k0.f10311l, 0);
                String string3 = bundle3.getString(e2.k0.f10312m);
                String string4 = bundle3.getString(e2.k0.f10313n);
                ?? obj2 = new Object();
                obj2.f10295c = uri;
                obj2.d = e2.s0.n(string);
                obj2.f10296e = string2;
                obj2.f10293a = i15;
                obj2.f10294b = i16;
                obj2.f10297f = string3;
                obj2.f10298g = string4;
                return new e2.k0(obj2);
            case 8:
                Bundle bundle4 = (Bundle) obj;
                e2.u uVar = e2.u.V;
                e2.t tVar = new e2.t();
                if (bundle4 != null) {
                    ClassLoader classLoader = h2.e.class.getClassLoader();
                    String str5 = h2.m0.f14114a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(e2.u.W);
                String str6 = uVar.f10604a;
                if (string5 == null) {
                    string5 = str6;
                }
                tVar.f10553a = string5;
                String string6 = bundle4.getString(e2.u.X);
                String str7 = uVar.f10605b;
                if (string6 == null) {
                    string6 = str7;
                }
                tVar.f10554b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(e2.u.B0);
                if (parcelableArrayList == null) {
                    f10 = h9.t1.f14399e;
                } else {
                    h9.f0 p10 = h9.i0.p();
                    for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i17);
                        bundle5.getClass();
                        String string7 = bundle5.getString(e2.x.f10646c);
                        String string8 = bundle5.getString(e2.x.d);
                        string8.getClass();
                        p10.c(new e2.x(string7, string8));
                    }
                    f10 = p10.f();
                }
                tVar.f10555c = h9.i0.q(f10);
                String string9 = bundle4.getString(e2.u.Y);
                String str8 = uVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                tVar.d = string9;
                tVar.f10556e = bundle4.getInt(e2.u.Z, uVar.f10607e);
                tVar.f10557f = bundle4.getInt(e2.u.f10579a0, uVar.f10608f);
                tVar.f10558g = bundle4.getInt(e2.u.C0, uVar.f10609g);
                tVar.h = bundle4.getInt(e2.u.f10580b0, uVar.h);
                tVar.f10559i = bundle4.getInt(e2.u.f10581c0, uVar.f10610i);
                String string10 = bundle4.getString(e2.u.f10582d0);
                String str9 = uVar.f10612k;
                if (string10 == null) {
                    string10 = str9;
                }
                tVar.f10560j = string10;
                String string11 = bundle4.getString(e2.u.G0);
                String str10 = uVar.f10614m;
                if (string11 == null) {
                    string11 = str10;
                }
                tVar.f10562l = string11;
                String string12 = bundle4.getString(e2.u.f10583e0);
                String str11 = uVar.f10619r;
                if (string12 == null) {
                    string12 = str11;
                }
                tVar.f10567q = e2.s0.n(string12);
                String string13 = bundle4.getString(e2.u.f10584f0);
                String str12 = uVar.f10620s;
                if (string13 == null) {
                    string13 = str12;
                }
                tVar.f10568r = e2.s0.n(string13);
                tVar.f10569s = bundle4.getInt(e2.u.f10585g0, uVar.f10621t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(e2.u.f10586h0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        tVar.f10571u = arrayList;
                        tVar.v = (e2.r) bundle4.getParcelable(e2.u.f10587i0);
                        tVar.f10572w = bundle4.getLong(e2.u.f10588j0, uVar.f10624x);
                        tVar.f10574y = bundle4.getInt(e2.u.f10589k0, uVar.f10626z);
                        tVar.f10575z = bundle4.getInt(e2.u.f10590l0, uVar.A);
                        tVar.A = bundle4.getInt(e2.u.E0, uVar.B);
                        tVar.B = bundle4.getInt(e2.u.F0, uVar.C);
                        tVar.C = bundle4.getFloat(e2.u.m0, uVar.D);
                        tVar.D = bundle4.getInt(e2.u.f10591n0, uVar.E);
                        tVar.E = bundle4.getFloat(e2.u.f10592o0, uVar.F);
                        tVar.F = bundle4.getByteArray(e2.u.f10593p0);
                        tVar.G = bundle4.getInt(e2.u.f10594q0, uVar.H);
                        tVar.I = bundle4.getInt(e2.u.D0, uVar.J);
                        Bundle bundle6 = bundle4.getBundle(e2.u.f10595r0);
                        if (bundle6 != null) {
                            tVar.H = new e2.m(bundle6.getInt(e2.m.f10362i, -1), bundle6.getInt(e2.m.f10363j, -1), bundle6.getInt(e2.m.f10364k, -1), bundle6.getByteArray(e2.m.f10365l), bundle6.getInt(e2.m.f10366m, -1), bundle6.getInt(e2.m.f10367n, -1));
                        }
                        tVar.J = bundle4.getInt(e2.u.f10596s0, uVar.K);
                        tVar.K = bundle4.getInt(e2.u.f10597t0, uVar.L);
                        tVar.L = bundle4.getInt(e2.u.f10598u0, uVar.M);
                        tVar.M = bundle4.getInt(e2.u.f10599v0, uVar.N);
                        tVar.N = bundle4.getInt(e2.u.f10600w0, uVar.O);
                        tVar.O = bundle4.getInt(e2.u.f10601x0, uVar.P);
                        tVar.Q = bundle4.getInt(e2.u.f10603z0, uVar.R);
                        tVar.R = bundle4.getInt(e2.u.A0, uVar.S);
                        tVar.S = bundle4.getInt(e2.u.f10602y0, uVar.T);
                        return new e2.u(tVar);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case 9:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(e2.n1.f10405c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(e2.m1.f10376f);
                if (parcelableArrayList2 == null) {
                    h9.g0 g0Var = h9.i0.f14331b;
                    b10 = h9.t1.f14399e;
                } else {
                    b10 = h2.e.b(new a1(8), parcelableArrayList2);
                }
                e2.m1 m1Var = new e2.m1(bundle8.getString(e2.m1.f10377g, ""), (e2.u[]) b10.toArray(new e2.u[0]));
                int[] intArray = bundle7.getIntArray(e2.n1.d);
                intArray.getClass();
                return new e2.n1(m1Var, c8.e1.a(intArray));
            default:
                e2.r1 r1Var = (e2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(e2.r1.f10540f, r1Var.f10544b.c());
                bundle9.putIntArray(e2.r1.f10541g, r1Var.d);
                bundle9.putBooleanArray(e2.r1.h, r1Var.f10546e);
                bundle9.putBoolean(e2.r1.f10542i, r1Var.f10545c);
                return bundle9;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            if (num.intValue() == 0) {
                return id.M0(2131748805, null);
            }
            return id.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public Object e(a8.r7 r7Var) {
        db.a components$lambda$0;
        components$lambda$0 = FirebasePhoneNumberVerificationRegistrar.getComponents$lambda$0(r7Var);
        return components$lambda$0;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f8800a) {
            case 1:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public Object j(Object obj) {
        Integer num = (Integer) obj;
        we weVar = fi.f3.f11959j0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
