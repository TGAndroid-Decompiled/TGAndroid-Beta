package ci;

import a8.r7;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import c8.k1;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import di.f6;
import di.mb;
import di.w8;
import e2.f1;
import e2.m1;
import e2.n1;
import h9.t1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.bb1;
public final class v implements w10, r1, r6, s6, ot0, g9.k, u9.d, NativeInstance.AudioLevelsCallback {
    public final int f5795a;

    public v(int i7) {
        this.f5795a = i7;
    }

    public static OnBackInvokedDispatcher g(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public Object apply(Object obj) {
        t1 f10;
        t1 b10;
        int i7 = 0;
        switch (this.f5795a) {
            case 8:
                e2.x xVar = (e2.x) obj;
                return xVar.f10793a + ": " + xVar.f10794b;
            case 9:
                f1 f1Var = (f1) obj;
                f1Var.getClass();
                Bundle bundle = new Bundle();
                int i10 = f1Var.f10398a;
                if (i10 != 0) {
                    bundle.putInt(f1.d, i10);
                }
                int i11 = f1Var.f10399b;
                if (i11 != 0) {
                    bundle.putInt(f1.f10396e, i11);
                }
                int i12 = f1Var.f10400c;
                if (i12 != 0) {
                    bundle.putInt(f1.f10397f, i12);
                }
                return bundle;
            case 10:
                e2.k0 k0Var = (e2.k0) obj;
                k0Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(e2.k0.h, k0Var.f10460a);
                String str = k0Var.f10461b;
                if (str != null) {
                    bundle2.putString(e2.k0.f10454i, str);
                }
                String str2 = k0Var.f10462c;
                if (str2 != null) {
                    bundle2.putString(e2.k0.f10455j, str2);
                }
                int i13 = k0Var.d;
                if (i13 != 0) {
                    bundle2.putInt(e2.k0.f10456k, i13);
                }
                int i14 = k0Var.f10463e;
                if (i14 != 0) {
                    bundle2.putInt(e2.k0.f10457l, i14);
                }
                String str3 = k0Var.f10464f;
                if (str3 != null) {
                    bundle2.putString(e2.k0.f10458m, str3);
                }
                String str4 = k0Var.f10465g;
                if (str4 != null) {
                    bundle2.putString(e2.k0.f10459n, str4);
                }
                return bundle2;
            case 11:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(e2.k0.h);
                uri.getClass();
                String string = bundle3.getString(e2.k0.f10454i);
                String string2 = bundle3.getString(e2.k0.f10455j);
                int i15 = bundle3.getInt(e2.k0.f10456k, 0);
                int i16 = bundle3.getInt(e2.k0.f10457l, 0);
                String string3 = bundle3.getString(e2.k0.f10458m);
                String string4 = bundle3.getString(e2.k0.f10459n);
                ?? obj2 = new Object();
                obj2.f10441c = uri;
                obj2.d = e2.s0.n(string);
                obj2.f10442e = string2;
                obj2.f10439a = i15;
                obj2.f10440b = i16;
                obj2.f10443f = string3;
                obj2.f10444g = string4;
                return new e2.k0(obj2);
            case 12:
                Bundle bundle4 = (Bundle) obj;
                e2.u uVar = e2.u.V;
                e2.t tVar = new e2.t();
                if (bundle4 != null) {
                    ClassLoader classLoader = h2.e.class.getClassLoader();
                    String str5 = h2.l0.f13783a;
                    bundle4.setClassLoader(classLoader);
                }
                String string5 = bundle4.getString(e2.u.W);
                String str6 = uVar.f10750a;
                if (string5 == null) {
                    string5 = str6;
                }
                tVar.f10699a = string5;
                String string6 = bundle4.getString(e2.u.X);
                String str7 = uVar.f10751b;
                if (string6 == null) {
                    string6 = str7;
                }
                tVar.f10700b = string6;
                ArrayList parcelableArrayList = bundle4.getParcelableArrayList(e2.u.B0);
                if (parcelableArrayList == null) {
                    f10 = t1.f14071e;
                } else {
                    h9.f0 p10 = h9.i0.p();
                    for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                        Bundle bundle5 = (Bundle) parcelableArrayList.get(i17);
                        bundle5.getClass();
                        String string7 = bundle5.getString(e2.x.f10792c);
                        String string8 = bundle5.getString(e2.x.d);
                        string8.getClass();
                        p10.c(new e2.x(string7, string8));
                    }
                    f10 = p10.f();
                }
                tVar.f10701c = h9.i0.q(f10);
                String string9 = bundle4.getString(e2.u.Y);
                String str8 = uVar.d;
                if (string9 == null) {
                    string9 = str8;
                }
                tVar.d = string9;
                tVar.f10702e = bundle4.getInt(e2.u.Z, uVar.f10753e);
                tVar.f10703f = bundle4.getInt(e2.u.f10725a0, uVar.f10754f);
                tVar.f10704g = bundle4.getInt(e2.u.C0, uVar.f10755g);
                tVar.h = bundle4.getInt(e2.u.f10726b0, uVar.h);
                tVar.f10705i = bundle4.getInt(e2.u.f10727c0, uVar.f10756i);
                String string10 = bundle4.getString(e2.u.f10728d0);
                String str9 = uVar.f10758k;
                if (string10 == null) {
                    string10 = str9;
                }
                tVar.f10706j = string10;
                String string11 = bundle4.getString(e2.u.G0);
                String str10 = uVar.f10760m;
                if (string11 == null) {
                    string11 = str10;
                }
                tVar.f10708l = string11;
                String string12 = bundle4.getString(e2.u.f10729e0);
                String str11 = uVar.f10765r;
                if (string12 == null) {
                    string12 = str11;
                }
                tVar.f10713q = e2.s0.n(string12);
                String string13 = bundle4.getString(e2.u.f10730f0);
                String str12 = uVar.f10766s;
                if (string13 == null) {
                    string13 = str12;
                }
                tVar.f10714r = e2.s0.n(string13);
                tVar.f10715s = bundle4.getInt(e2.u.f10731g0, uVar.f10767t);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle4.getByteArray(e2.u.f10732h0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        tVar.f10717u = arrayList;
                        tVar.v = (e2.r) bundle4.getParcelable(e2.u.f10733i0);
                        tVar.f10718w = bundle4.getLong(e2.u.f10734j0, uVar.f10770x);
                        tVar.f10720y = bundle4.getInt(e2.u.f10735k0, uVar.f10772z);
                        tVar.f10721z = bundle4.getInt(e2.u.f10736l0, uVar.A);
                        tVar.A = bundle4.getInt(e2.u.E0, uVar.B);
                        tVar.B = bundle4.getInt(e2.u.F0, uVar.C);
                        tVar.C = bundle4.getFloat(e2.u.m0, uVar.D);
                        tVar.D = bundle4.getInt(e2.u.f10737n0, uVar.E);
                        tVar.E = bundle4.getFloat(e2.u.f10738o0, uVar.F);
                        tVar.F = bundle4.getByteArray(e2.u.f10739p0);
                        tVar.G = bundle4.getInt(e2.u.f10740q0, uVar.H);
                        tVar.I = bundle4.getInt(e2.u.D0, uVar.J);
                        Bundle bundle6 = bundle4.getBundle(e2.u.f10741r0);
                        if (bundle6 != null) {
                            tVar.H = new e2.m(bundle6.getInt(e2.m.f10508i, -1), bundle6.getInt(e2.m.f10509j, -1), bundle6.getInt(e2.m.f10510k, -1), bundle6.getByteArray(e2.m.f10511l), bundle6.getInt(e2.m.f10512m, -1), bundle6.getInt(e2.m.f10513n, -1));
                        }
                        tVar.J = bundle4.getInt(e2.u.f10742s0, uVar.K);
                        tVar.K = bundle4.getInt(e2.u.f10743t0, uVar.L);
                        tVar.L = bundle4.getInt(e2.u.f10744u0, uVar.M);
                        tVar.M = bundle4.getInt(e2.u.f10745v0, uVar.N);
                        tVar.N = bundle4.getInt(e2.u.f10746w0, uVar.O);
                        tVar.O = bundle4.getInt(e2.u.f10747x0, uVar.P);
                        tVar.Q = bundle4.getInt(e2.u.f10749z0, uVar.R);
                        tVar.R = bundle4.getInt(e2.u.A0, uVar.S);
                        tVar.S = bundle4.getInt(e2.u.f10748y0, uVar.T);
                        return new e2.u(tVar);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case 13:
                Bundle bundle7 = (Bundle) obj;
                Bundle bundle8 = bundle7.getBundle(n1.f10551c);
                bundle8.getClass();
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(m1.f10522f);
                if (parcelableArrayList2 == null) {
                    h9.g0 g0Var = h9.i0.f14003b;
                    b10 = t1.f14071e;
                } else {
                    b10 = h2.e.b(new v(12), parcelableArrayList2);
                }
                m1 m1Var = new m1(bundle8.getString(m1.f10523g, ""), (e2.u[]) b10.toArray(new e2.u[0]));
                int[] intArray = bundle7.getIntArray(n1.d);
                intArray.getClass();
                return new n1(m1Var, k1.a(intArray));
            default:
                e2.r1 r1Var = (e2.r1) obj;
                r1Var.getClass();
                Bundle bundle9 = new Bundle();
                bundle9.putBundle(e2.r1.f10686f, r1Var.f10690b.c());
                bundle9.putIntArray(e2.r1.f10687g, r1Var.d);
                bundle9.putBooleanArray(e2.r1.h, r1Var.f10692e);
                bundle9.putBoolean(e2.r1.f10688i, r1Var.f10691c);
                return bundle9;
        }
    }

    public Constructor b() {
        switch (this.f5795a) {
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
    public void d(int i7, View view) {
        ((w8) view).setColor(i7);
    }

    @Override
    public Object e(r7 r7Var) {
        return FirebasePhoneNumberVerificationRegistrar.a(r7Var);
    }

    @Override
    public int f(View view) {
        return ((w8) view).f9973y;
    }

    @Override
    public void h(u1 u1Var, int i7) {
        switch (this.f5795a) {
            case 2:
                int i10 = f6.f8767z3;
                return;
            case 3:
                f6.p2(new bb1(6, null));
                return;
            case 26:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public RecyclerView n(View view) {
        return ((mb) view).f9334a;
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    public v(fs fsVar, int i7) {
        this.f5795a = i7;
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
