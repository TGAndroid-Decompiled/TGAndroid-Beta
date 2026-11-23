package ci;

import a8.r7;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import c8.l1;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import di.f6;
import di.mb;
import di.x8;
import e2.f1;
import e2.m1;
import e2.n1;
import e2.r1;
import h9.s1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.za1;
public final class v implements v10, q1, r6, s6, qt0, g9.k, u9.d, NativeInstance.AudioLevelsCallback {
    public final int f5790a;

    public v(int i7) {
        this.f5790a = i7;
    }

    public static OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public Object apply(Object obj) {
        s1 f10;
        s1 b10;
        int i7 = 0;
        switch (this.f5790a) {
            case 8:
                e2.x xVar = (e2.x) obj;
                return xVar.f10786a + ": " + xVar.f10787b;
            case 9:
                f1 f1Var = (f1) obj;
                f1Var.getClass();
                Bundle bundle = new Bundle();
                int i10 = f1Var.f10391a;
                if (i10 != 0) {
                    bundle.putInt(f1.d, i10);
                }
                int i11 = f1Var.f10392b;
                if (i11 != 0) {
                    bundle.putInt(f1.f10389e, i11);
                }
                int i12 = f1Var.f10393c;
                if (i12 != 0) {
                    bundle.putInt(f1.f10390f, i12);
                }
                return bundle;
            case 10:
                e2.k0 k0Var = (e2.k0) obj;
                k0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(e2.k0.h, k0Var.f10453a);
                String str = k0Var.f10454b;
                if (str != null) {
                    bundle2.putString(e2.k0.f10447i, str);
                }
                String str2 = k0Var.f10455c;
                if (str2 != null) {
                    bundle2.putString(e2.k0.f10448j, str2);
                }
                int i13 = k0Var.d;
                if (i13 != 0) {
                    bundle2.putInt(e2.k0.f10449k, i13);
                }
                int i14 = k0Var.f10456e;
                if (i14 != 0) {
                    bundle2.putInt(e2.k0.f10450l, i14);
                }
                String str3 = k0Var.f10457f;
                if (str3 != null) {
                    bundle2.putString(e2.k0.f10451m, str3);
                }
                String str4 = k0Var.f10458g;
                if (str4 != null) {
                    bundle2.putString(e2.k0.f10452n, str4);
                }
                return bundle2;
            case 11:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(e2.k0.h);
                uri.getClass();
                String string = bundle3.getString(e2.k0.f10447i);
                String string2 = bundle3.getString(e2.k0.f10448j);
                int i15 = bundle3.getInt(e2.k0.f10449k, 0);
                int i16 = bundle3.getInt(e2.k0.f10450l, 0);
                String string3 = bundle3.getString(e2.k0.f10451m);
                String string4 = bundle3.getString(e2.k0.f10452n);
                ?? obj2 = new Object();
                obj2.f10434c = uri;
                obj2.d = e2.s0.n(string);
                obj2.f10435e = string2;
                obj2.f10432a = i15;
                obj2.f10433b = i16;
                obj2.f10436f = string3;
                obj2.f10437g = string4;
                return new e2.k0(obj2);
            case 12:
                Bundle bundle4 = (Bundle) obj;
                e2.u uVar = e2.u.V;
                e2.t tVar = new e2.t();
                if (bundle4 != null) {
                    ClassLoader classLoader = h2.e.class.getClassLoader();
                    String str5 = h2.l0.f13778a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(e2.u.W);
                String str6 = uVar.f10743a;
                if (string5 == null) {
                    string5 = str6;
                }
                tVar.f10692a = string5;
                String string6 = bundle4.getString(e2.u.X);
                String str7 = uVar.f10744b;
                if (string6 == null) {
                    string6 = str7;
                }
                tVar.f10693b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(e2.u.B0);
                if (parcelableArrayList == null) {
                    f10 = s1.f14058e;
                } else {
                    h9.f0 p10 = h9.i0.p();
                    for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i17);
                        bundle5.getClass();
                        String string7 = bundle5.getString(e2.x.f10785c);
                        String string8 = bundle5.getString(e2.x.d);
                        string8.getClass();
                        p10.c(new e2.x(string7, string8));
                    }
                    f10 = p10.f();
                }
                tVar.f10694c = h9.i0.q(f10);
                String string9 = bundle4.getString(e2.u.Y);
                String str8 = uVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                tVar.d = string9;
                tVar.f10695e = bundle4.getInt(e2.u.Z, uVar.f10746e);
                tVar.f10696f = bundle4.getInt(e2.u.f10718a0, uVar.f10747f);
                tVar.f10697g = bundle4.getInt(e2.u.C0, uVar.f10748g);
                tVar.h = bundle4.getInt(e2.u.f10719b0, uVar.h);
                tVar.f10698i = bundle4.getInt(e2.u.f10720c0, uVar.f10749i);
                String string10 = bundle4.getString(e2.u.f10721d0);
                String str9 = uVar.f10751k;
                if (string10 == null) {
                    string10 = str9;
                }
                tVar.f10699j = string10;
                String string11 = bundle4.getString(e2.u.G0);
                String str10 = uVar.f10753m;
                if (string11 == null) {
                    string11 = str10;
                }
                tVar.f10701l = string11;
                String string12 = bundle4.getString(e2.u.f10722e0);
                String str11 = uVar.f10758r;
                if (string12 == null) {
                    string12 = str11;
                }
                tVar.f10706q = e2.s0.n(string12);
                String string13 = bundle4.getString(e2.u.f10723f0);
                String str12 = uVar.f10759s;
                if (string13 == null) {
                    string13 = str12;
                }
                tVar.f10707r = e2.s0.n(string13);
                tVar.f10708s = bundle4.getInt(e2.u.f10724g0, uVar.f10760t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(e2.u.f10725h0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        tVar.f10710u = arrayList;
                        tVar.v = (e2.r) bundle4.getParcelable(e2.u.f10726i0);
                        tVar.f10711w = bundle4.getLong(e2.u.f10727j0, uVar.f10763x);
                        tVar.f10713y = bundle4.getInt(e2.u.f10728k0, uVar.f10765z);
                        tVar.f10714z = bundle4.getInt(e2.u.f10729l0, uVar.A);
                        tVar.A = bundle4.getInt(e2.u.E0, uVar.B);
                        tVar.B = bundle4.getInt(e2.u.F0, uVar.C);
                        tVar.C = bundle4.getFloat(e2.u.m0, uVar.D);
                        tVar.D = bundle4.getInt(e2.u.f10730n0, uVar.E);
                        tVar.E = bundle4.getFloat(e2.u.f10731o0, uVar.F);
                        tVar.F = bundle4.getByteArray(e2.u.f10732p0);
                        tVar.G = bundle4.getInt(e2.u.f10733q0, uVar.H);
                        tVar.I = bundle4.getInt(e2.u.D0, uVar.J);
                        Bundle bundle6 = bundle4.getBundle(e2.u.f10734r0);
                        if (bundle6 != null) {
                            tVar.H = new e2.m(bundle6.getInt(e2.m.f10501i, -1), bundle6.getInt(e2.m.f10502j, -1), bundle6.getInt(e2.m.f10503k, -1), bundle6.getByteArray(e2.m.f10504l), bundle6.getInt(e2.m.f10505m, -1), bundle6.getInt(e2.m.f10506n, -1));
                        }
                        tVar.J = bundle4.getInt(e2.u.f10735s0, uVar.K);
                        tVar.K = bundle4.getInt(e2.u.f10736t0, uVar.L);
                        tVar.L = bundle4.getInt(e2.u.f10737u0, uVar.M);
                        tVar.M = bundle4.getInt(e2.u.f10738v0, uVar.N);
                        tVar.N = bundle4.getInt(e2.u.f10739w0, uVar.O);
                        tVar.O = bundle4.getInt(e2.u.f10740x0, uVar.P);
                        tVar.Q = bundle4.getInt(e2.u.f10742z0, uVar.R);
                        tVar.R = bundle4.getInt(e2.u.A0, uVar.S);
                        tVar.S = bundle4.getInt(e2.u.f10741y0, uVar.T);
                        return new e2.u(tVar);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case 13:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(n1.f10544c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(m1.f10515f);
                if (parcelableArrayList2 == null) {
                    h9.g0 g0Var = h9.i0.f13995b;
                    b10 = s1.f14058e;
                } else {
                    b10 = h2.e.b(new v(12), parcelableArrayList2);
                }
                m1 m1Var = new m1(bundle8.getString(m1.f10516g, ""), (e2.u[]) b10.toArray(new e2.u[0]));
                int[] intArray = bundle7.getIntArray(n1.d);
                intArray.getClass();
                return new n1(m1Var, l1.a(intArray));
            default:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(r1.f10679f, r1Var.f10683b.c());
                bundle9.putIntArray(r1.f10680g, r1Var.d);
                bundle9.putBooleanArray(r1.h, r1Var.f10685e);
                bundle9.putBoolean(r1.f10681i, r1Var.f10684c);
                return bundle9;
        }
    }

    public Constructor b() {
        switch (this.f5790a) {
            case 23:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(f3.o.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(f3.o.class).getConstructor(null);
        }
    }

    @Override
    public Object c(r7 r7Var) {
        return FirebasePhoneNumberVerificationRegistrar.a(r7Var);
    }

    @Override
    public void g(int i7, View view) {
        ((x8) view).setColor(i7);
    }

    @Override
    public void i(t1 t1Var, int i7) {
        switch (this.f5790a) {
            case 2:
                int i10 = f6.f8755z3;
                return;
            case 3:
                f6.p2(new za1(6, null));
                return;
            case 26:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public int k(View view) {
        return ((x8) view).f10010y;
    }

    @Override
    public RecyclerView l(View view) {
        return ((mb) view).f9322a;
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    public v(fs fsVar, int i7) {
        this.f5790a = i7;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
