package di;

import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.xa1;
public final class o implements y10, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.n6, org.telegram.ui.ActionBar.o6, gt0, g9.k, u9.d, NativeInstance.AudioLevelsCallback {
    public final int f9127a;

    public o(int i7) {
        this.f9127a = i7;
    }

    public static OnBackInvokedDispatcher c(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class d() {
        return ShortcutManager.class;
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public Object apply(Object obj) {
        h9.s1 f10;
        h9.s1 b10;
        int i7 = 0;
        switch (this.f9127a) {
            case 7:
                e2.x xVar = (e2.x) obj;
                return xVar.f10478a + ": " + xVar.f10479b;
            case 8:
                e2.f1 f1Var = (e2.f1) obj;
                f1Var.getClass();
                Bundle bundle = new Bundle();
                int i10 = f1Var.f10083a;
                if (i10 != 0) {
                    bundle.putInt(e2.f1.d, i10);
                }
                int i11 = f1Var.f10084b;
                if (i11 != 0) {
                    bundle.putInt(e2.f1.f10081e, i11);
                }
                int i12 = f1Var.f10085c;
                if (i12 != 0) {
                    bundle.putInt(e2.f1.f10082f, i12);
                }
                return bundle;
            case 9:
                e2.k0 k0Var = (e2.k0) obj;
                k0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(e2.k0.h, k0Var.f10145a);
                String str = k0Var.f10146b;
                if (str != null) {
                    bundle2.putString(e2.k0.f10139i, str);
                }
                String str2 = k0Var.f10147c;
                if (str2 != null) {
                    bundle2.putString(e2.k0.f10140j, str2);
                }
                int i13 = k0Var.d;
                if (i13 != 0) {
                    bundle2.putInt(e2.k0.f10141k, i13);
                }
                int i14 = k0Var.f10148e;
                if (i14 != 0) {
                    bundle2.putInt(e2.k0.f10142l, i14);
                }
                String str3 = k0Var.f10149f;
                if (str3 != null) {
                    bundle2.putString(e2.k0.f10143m, str3);
                }
                String str4 = k0Var.f10150g;
                if (str4 != null) {
                    bundle2.putString(e2.k0.f10144n, str4);
                }
                return bundle2;
            case 10:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(e2.k0.h);
                uri.getClass();
                String string = bundle3.getString(e2.k0.f10139i);
                String string2 = bundle3.getString(e2.k0.f10140j);
                int i15 = bundle3.getInt(e2.k0.f10141k, 0);
                int i16 = bundle3.getInt(e2.k0.f10142l, 0);
                String string3 = bundle3.getString(e2.k0.f10143m);
                String string4 = bundle3.getString(e2.k0.f10144n);
                ?? obj2 = new Object();
                obj2.f10126c = uri;
                obj2.d = e2.s0.n(string);
                obj2.f10127e = string2;
                obj2.f10124a = i15;
                obj2.f10125b = i16;
                obj2.f10128f = string3;
                obj2.f10129g = string4;
                return new e2.k0(obj2);
            case 11:
                Bundle bundle4 = (Bundle) obj;
                e2.u uVar = e2.u.V;
                e2.t tVar = new e2.t();
                if (bundle4 != null) {
                    ClassLoader classLoader = h2.e.class.getClassLoader();
                    String str5 = h2.l0.f13471a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(e2.u.W);
                String str6 = uVar.f10435a;
                if (string5 == null) {
                    string5 = str6;
                }
                tVar.f10384a = string5;
                String string6 = bundle4.getString(e2.u.X);
                String str7 = uVar.f10436b;
                if (string6 == null) {
                    string6 = str7;
                }
                tVar.f10385b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(e2.u.B0);
                if (parcelableArrayList == null) {
                    f10 = h9.s1.f13749e;
                } else {
                    h9.f0 p10 = h9.i0.p();
                    for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i17);
                        bundle5.getClass();
                        String string7 = bundle5.getString(e2.x.f10477c);
                        String string8 = bundle5.getString(e2.x.d);
                        string8.getClass();
                        p10.c(new e2.x(string7, string8));
                    }
                    f10 = p10.f();
                }
                tVar.f10386c = h9.i0.q(f10);
                String string9 = bundle4.getString(e2.u.Y);
                String str8 = uVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                tVar.d = string9;
                tVar.f10387e = bundle4.getInt(e2.u.Z, uVar.f10438e);
                tVar.f10388f = bundle4.getInt(e2.u.f10410a0, uVar.f10439f);
                tVar.f10389g = bundle4.getInt(e2.u.C0, uVar.f10440g);
                tVar.h = bundle4.getInt(e2.u.f10411b0, uVar.h);
                tVar.f10390i = bundle4.getInt(e2.u.f10412c0, uVar.f10441i);
                String string10 = bundle4.getString(e2.u.f10413d0);
                String str9 = uVar.f10443k;
                if (string10 == null) {
                    string10 = str9;
                }
                tVar.f10391j = string10;
                String string11 = bundle4.getString(e2.u.G0);
                String str10 = uVar.f10445m;
                if (string11 == null) {
                    string11 = str10;
                }
                tVar.f10393l = string11;
                String string12 = bundle4.getString(e2.u.f10414e0);
                String str11 = uVar.f10450r;
                if (string12 == null) {
                    string12 = str11;
                }
                tVar.f10398q = e2.s0.n(string12);
                String string13 = bundle4.getString(e2.u.f10415f0);
                String str12 = uVar.f10451s;
                if (string13 == null) {
                    string13 = str12;
                }
                tVar.f10399r = e2.s0.n(string13);
                tVar.f10400s = bundle4.getInt(e2.u.f10416g0, uVar.f10452t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(e2.u.f10417h0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        tVar.f10402u = arrayList;
                        tVar.v = (e2.r) bundle4.getParcelable(e2.u.f10418i0);
                        tVar.f10403w = bundle4.getLong(e2.u.f10419j0, uVar.f10455x);
                        tVar.f10405y = bundle4.getInt(e2.u.f10420k0, uVar.f10457z);
                        tVar.f10406z = bundle4.getInt(e2.u.f10421l0, uVar.A);
                        tVar.A = bundle4.getInt(e2.u.E0, uVar.B);
                        tVar.B = bundle4.getInt(e2.u.F0, uVar.C);
                        tVar.C = bundle4.getFloat(e2.u.m0, uVar.D);
                        tVar.D = bundle4.getInt(e2.u.f10422n0, uVar.E);
                        tVar.E = bundle4.getFloat(e2.u.f10423o0, uVar.F);
                        tVar.F = bundle4.getByteArray(e2.u.f10424p0);
                        tVar.G = bundle4.getInt(e2.u.f10425q0, uVar.H);
                        tVar.I = bundle4.getInt(e2.u.D0, uVar.J);
                        Bundle bundle6 = bundle4.getBundle(e2.u.f10426r0);
                        if (bundle6 != null) {
                            tVar.H = new e2.m(bundle6.getInt(e2.m.f10193i, -1), bundle6.getInt(e2.m.f10194j, -1), bundle6.getInt(e2.m.f10195k, -1), bundle6.getByteArray(e2.m.f10196l), bundle6.getInt(e2.m.f10197m, -1), bundle6.getInt(e2.m.f10198n, -1));
                        }
                        tVar.J = bundle4.getInt(e2.u.f10427s0, uVar.K);
                        tVar.K = bundle4.getInt(e2.u.f10428t0, uVar.L);
                        tVar.L = bundle4.getInt(e2.u.f10429u0, uVar.M);
                        tVar.M = bundle4.getInt(e2.u.f10430v0, uVar.N);
                        tVar.N = bundle4.getInt(e2.u.f10431w0, uVar.O);
                        tVar.O = bundle4.getInt(e2.u.f10432x0, uVar.P);
                        tVar.Q = bundle4.getInt(e2.u.f10434z0, uVar.R);
                        tVar.R = bundle4.getInt(e2.u.A0, uVar.S);
                        tVar.S = bundle4.getInt(e2.u.f10433y0, uVar.T);
                        return new e2.u(tVar);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case 12:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(e2.n1.f10236c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(e2.m1.f10207f);
                if (parcelableArrayList2 == null) {
                    h9.g0 g0Var = h9.i0.f13686b;
                    b10 = h9.s1.f13749e;
                } else {
                    b10 = h2.e.b(new o(11), parcelableArrayList2);
                }
                e2.m1 m1Var = new e2.m1(bundle8.getString(e2.m1.f10208g, ""), (e2.u[]) b10.toArray(new e2.u[0]));
                int[] intArray = bundle7.getIntArray(e2.n1.d);
                intArray.getClass();
                return new e2.n1(m1Var, c8.g1.a(intArray));
            default:
                e2.r1 r1Var = (e2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(e2.r1.f10371f, r1Var.f10375b.c());
                bundle9.putIntArray(e2.r1.f10372g, r1Var.d);
                bundle9.putBooleanArray(e2.r1.h, r1Var.f10377e);
                bundle9.putBoolean(e2.r1.f10373i, r1Var.f10376c);
                return bundle9;
        }
    }

    public Constructor b() {
        switch (this.f9127a) {
            case 22:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(f3.o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(f3.o.class).getConstructor(null);
        }
    }

    @Override
    public void f(int i7, View view) {
        ((t8) view).setColor(i7);
    }

    @Override
    public int g(View view) {
        return ((t8) view).f9475y;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f9127a) {
            case 1:
                int i10 = c6.f8307w3;
                return;
            case 2:
                c6.d2(new xa1(6, null));
                return;
            case 25:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public Object i(a8.r7 r7Var) {
        db.a components$lambda$0;
        components$lambda$0 = FirebasePhoneNumberVerificationRegistrar.getComponents$lambda$0(r7Var);
        return components$lambda$0;
    }

    @Override
    public float k(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.y0.c(recyclerView);
    }

    @Override
    public RecyclerView n(View view) {
        return ((ib) view).f8816a;
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.y0.b(recyclerView);
    }

    public o(is isVar, int i7) {
        this.f9127a = i7;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
