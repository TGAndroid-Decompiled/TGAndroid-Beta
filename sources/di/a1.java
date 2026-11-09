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
    public final int f8795a;

    public a1(int i7) {
        this.f8795a = i7;
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
        switch (this.f8795a) {
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
        switch (this.f8795a) {
            case 4:
                e2.x xVar = (e2.x) obj;
                return xVar.f10642a + ": " + xVar.f10643b;
            case 5:
                e2.f1 f1Var = (e2.f1) obj;
                f1Var.getClass();
                Bundle bundle = new Bundle();
                int i10 = f1Var.f10247a;
                if (i10 != 0) {
                    bundle.putInt(e2.f1.d, i10);
                }
                int i11 = f1Var.f10248b;
                if (i11 != 0) {
                    bundle.putInt(e2.f1.f10245e, i11);
                }
                int i12 = f1Var.f10249c;
                if (i12 != 0) {
                    bundle.putInt(e2.f1.f10246f, i12);
                }
                return bundle;
            case 6:
                e2.k0 k0Var = (e2.k0) obj;
                k0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(e2.k0.h, k0Var.f10309a);
                String str = k0Var.f10310b;
                if (str != null) {
                    bundle2.putString(e2.k0.f10303i, str);
                }
                String str2 = k0Var.f10311c;
                if (str2 != null) {
                    bundle2.putString(e2.k0.f10304j, str2);
                }
                int i13 = k0Var.d;
                if (i13 != 0) {
                    bundle2.putInt(e2.k0.f10305k, i13);
                }
                int i14 = k0Var.f10312e;
                if (i14 != 0) {
                    bundle2.putInt(e2.k0.f10306l, i14);
                }
                String str3 = k0Var.f10313f;
                if (str3 != null) {
                    bundle2.putString(e2.k0.f10307m, str3);
                }
                String str4 = k0Var.f10314g;
                if (str4 != null) {
                    bundle2.putString(e2.k0.f10308n, str4);
                }
                return bundle2;
            case 7:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(e2.k0.h);
                uri.getClass();
                String string = bundle3.getString(e2.k0.f10303i);
                String string2 = bundle3.getString(e2.k0.f10304j);
                int i15 = bundle3.getInt(e2.k0.f10305k, 0);
                int i16 = bundle3.getInt(e2.k0.f10306l, 0);
                String string3 = bundle3.getString(e2.k0.f10307m);
                String string4 = bundle3.getString(e2.k0.f10308n);
                ?? obj2 = new Object();
                obj2.f10290c = uri;
                obj2.d = e2.s0.n(string);
                obj2.f10291e = string2;
                obj2.f10288a = i15;
                obj2.f10289b = i16;
                obj2.f10292f = string3;
                obj2.f10293g = string4;
                return new e2.k0(obj2);
            case 8:
                Bundle bundle4 = (Bundle) obj;
                e2.u uVar = e2.u.V;
                e2.t tVar = new e2.t();
                if (bundle4 != null) {
                    ClassLoader classLoader = h2.e.class.getClassLoader();
                    String str5 = h2.m0.f14112a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(e2.u.W);
                String str6 = uVar.f10599a;
                if (string5 == null) {
                    string5 = str6;
                }
                tVar.f10548a = string5;
                String string6 = bundle4.getString(e2.u.X);
                String str7 = uVar.f10600b;
                if (string6 == null) {
                    string6 = str7;
                }
                tVar.f10549b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(e2.u.B0);
                if (parcelableArrayList == null) {
                    f10 = h9.t1.f14397e;
                } else {
                    h9.f0 p10 = h9.i0.p();
                    for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i17);
                        bundle5.getClass();
                        String string7 = bundle5.getString(e2.x.f10641c);
                        String string8 = bundle5.getString(e2.x.d);
                        string8.getClass();
                        p10.c(new e2.x(string7, string8));
                    }
                    f10 = p10.f();
                }
                tVar.f10550c = h9.i0.q(f10);
                String string9 = bundle4.getString(e2.u.Y);
                String str8 = uVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                tVar.d = string9;
                tVar.f10551e = bundle4.getInt(e2.u.Z, uVar.f10602e);
                tVar.f10552f = bundle4.getInt(e2.u.f10574a0, uVar.f10603f);
                tVar.f10553g = bundle4.getInt(e2.u.C0, uVar.f10604g);
                tVar.h = bundle4.getInt(e2.u.f10575b0, uVar.h);
                tVar.f10554i = bundle4.getInt(e2.u.f10576c0, uVar.f10605i);
                String string10 = bundle4.getString(e2.u.f10577d0);
                String str9 = uVar.f10607k;
                if (string10 == null) {
                    string10 = str9;
                }
                tVar.f10555j = string10;
                String string11 = bundle4.getString(e2.u.G0);
                String str10 = uVar.f10609m;
                if (string11 == null) {
                    string11 = str10;
                }
                tVar.f10557l = string11;
                String string12 = bundle4.getString(e2.u.f10578e0);
                String str11 = uVar.f10614r;
                if (string12 == null) {
                    string12 = str11;
                }
                tVar.f10562q = e2.s0.n(string12);
                String string13 = bundle4.getString(e2.u.f10579f0);
                String str12 = uVar.f10615s;
                if (string13 == null) {
                    string13 = str12;
                }
                tVar.f10563r = e2.s0.n(string13);
                tVar.f10564s = bundle4.getInt(e2.u.f10580g0, uVar.f10616t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(e2.u.f10581h0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        tVar.f10566u = arrayList;
                        tVar.v = (e2.r) bundle4.getParcelable(e2.u.f10582i0);
                        tVar.f10567w = bundle4.getLong(e2.u.f10583j0, uVar.f10619x);
                        tVar.f10569y = bundle4.getInt(e2.u.f10584k0, uVar.f10621z);
                        tVar.f10570z = bundle4.getInt(e2.u.f10585l0, uVar.A);
                        tVar.A = bundle4.getInt(e2.u.E0, uVar.B);
                        tVar.B = bundle4.getInt(e2.u.F0, uVar.C);
                        tVar.C = bundle4.getFloat(e2.u.m0, uVar.D);
                        tVar.D = bundle4.getInt(e2.u.f10586n0, uVar.E);
                        tVar.E = bundle4.getFloat(e2.u.f10587o0, uVar.F);
                        tVar.F = bundle4.getByteArray(e2.u.f10588p0);
                        tVar.G = bundle4.getInt(e2.u.f10589q0, uVar.H);
                        tVar.I = bundle4.getInt(e2.u.D0, uVar.J);
                        Bundle bundle6 = bundle4.getBundle(e2.u.f10590r0);
                        if (bundle6 != null) {
                            tVar.H = new e2.m(bundle6.getInt(e2.m.f10357i, -1), bundle6.getInt(e2.m.f10358j, -1), bundle6.getInt(e2.m.f10359k, -1), bundle6.getByteArray(e2.m.f10360l), bundle6.getInt(e2.m.f10361m, -1), bundle6.getInt(e2.m.f10362n, -1));
                        }
                        tVar.J = bundle4.getInt(e2.u.f10591s0, uVar.K);
                        tVar.K = bundle4.getInt(e2.u.f10592t0, uVar.L);
                        tVar.L = bundle4.getInt(e2.u.f10593u0, uVar.M);
                        tVar.M = bundle4.getInt(e2.u.f10594v0, uVar.N);
                        tVar.N = bundle4.getInt(e2.u.f10595w0, uVar.O);
                        tVar.O = bundle4.getInt(e2.u.f10596x0, uVar.P);
                        tVar.Q = bundle4.getInt(e2.u.f10598z0, uVar.R);
                        tVar.R = bundle4.getInt(e2.u.A0, uVar.S);
                        tVar.S = bundle4.getInt(e2.u.f10597y0, uVar.T);
                        return new e2.u(tVar);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case 9:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(e2.n1.f10400c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(e2.m1.f10371f);
                if (parcelableArrayList2 == null) {
                    h9.g0 g0Var = h9.i0.f14329b;
                    b10 = h9.t1.f14397e;
                } else {
                    b10 = h2.e.b(new a1(8), parcelableArrayList2);
                }
                e2.m1 m1Var = new e2.m1(bundle8.getString(e2.m1.f10372g, ""), (e2.u[]) b10.toArray(new e2.u[0]));
                int[] intArray = bundle7.getIntArray(e2.n1.d);
                intArray.getClass();
                return new e2.n1(m1Var, c8.e1.a(intArray));
            default:
                e2.r1 r1Var = (e2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(e2.r1.f10535f, r1Var.f10539b.c());
                bundle9.putIntArray(e2.r1.f10536g, r1Var.d);
                bundle9.putBooleanArray(e2.r1.h, r1Var.f10541e);
                bundle9.putBoolean(e2.r1.f10537i, r1Var.f10540c);
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
        switch (this.f8795a) {
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
        we weVar = fi.f3.f11955j0;
        return 0;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
