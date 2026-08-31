package f5;

import android.content.pm.ShortcutManager;
import android.graphics.Insets;
import android.os.Bundle;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import h5.d0;
import j3.c1;
import j3.e1;
import j3.f2;
import j3.m0;
import j3.n0;
import j3.o0;
import j3.t0;
import j3.u0;
import j3.x0;
import j3.y0;
import j3.y1;
import j3.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o4.s0;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.uc0;
public final class u implements j3.f, ba.a, c2, uc0, Continuation, r8.i, r8.e, h5.j {
    public final int f6069a;

    public u(int i10) {
        this.f6069a = i10;
    }

    public static int a(Insets insets) {
        return insets.left;
    }

    public static ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher g(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class h() {
        return ShortcutManager.class;
    }

    public static int k(Insets insets) {
        return insets.right;
    }

    public static int l(Insets insets) {
        return insets.bottom;
    }

    @Override
    public Object apply(Object obj) {
        return new k3.f((h5.y) obj);
    }

    @Override
    public j3.g c(Bundle bundle) {
        List aVar;
        boolean z4;
        x0 x0Var;
        e1 e1Var;
        u0 u0Var;
        z0 z0Var;
        y0 y0Var;
        int i10 = 0;
        switch (this.f6069a) {
            case 0:
                Bundle bundle2 = bundle.getBundle(v.f6070c);
                bundle2.getClass();
                s0 s0Var = (s0) s0.f16570n.c(bundle2);
                int[] intArray = bundle.getIntArray(v.d);
                intArray.getClass();
                if (intArray.length == 0) {
                    aVar = Collections.EMPTY_LIST;
                } else {
                    aVar = new u8.a(0, intArray.length, intArray);
                }
                return new v(s0Var, aVar);
            case 18:
                return new i5.b(bundle.getInt(i5.b.h, -1), bundle.getInt(i5.b.f7805n, -1), bundle.getInt(i5.b.f7806r, -1), bundle.getByteArray(i5.b.f7807s));
            case 27:
                n0 n0Var = n0.Z;
                m0 m0Var = new m0();
                if (bundle != null) {
                    ClassLoader classLoader = h5.a.class.getClassLoader();
                    int i11 = d0.f7237a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(n0.f9293a0);
                String str = n0Var.f9318a;
                if (string == null) {
                    string = str;
                }
                m0Var.f9253a = string;
                String string2 = bundle.getString(n0.f9294b0);
                String str2 = n0Var.f9319b;
                if (string2 == null) {
                    string2 = str2;
                }
                m0Var.f9254b = string2;
                String string3 = bundle.getString(n0.f9295c0);
                String str3 = n0Var.f9320c;
                if (string3 == null) {
                    string3 = str3;
                }
                m0Var.f9255c = string3;
                m0Var.d = bundle.getInt(n0.f9296d0, n0Var.d);
                m0Var.f9256e = bundle.getInt(n0.f9297e0, n0Var.f9321e);
                m0Var.f9257f = bundle.getInt(n0.f9298f0, n0Var.f9322f);
                m0Var.f9258g = bundle.getInt(n0.f9299g0, n0Var.h);
                String string4 = bundle.getString(n0.f9300h0);
                String str4 = n0Var.f9324r;
                if (string4 == null) {
                    string4 = str4;
                }
                m0Var.h = string4;
                e4.c cVar = (e4.c) bundle.getParcelable(n0.f9301i0);
                e4.c cVar2 = n0Var.f9325s;
                if (cVar == null) {
                    cVar = cVar2;
                }
                m0Var.f9259i = cVar;
                String string5 = bundle.getString(n0.f9302j0);
                String str5 = n0Var.B;
                if (string5 == null) {
                    string5 = str5;
                }
                m0Var.f9264n = string5;
                String string6 = bundle.getString(n0.f9303k0);
                String str6 = n0Var.C;
                if (string6 == null) {
                    string6 = str6;
                }
                m0Var.f9265o = string6;
                m0Var.f9266p = bundle.getInt(n0.f9304l0, n0Var.D);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(n0.m0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        m0Var.f9267q = arrayList;
                        m0Var.f9268r = (o3.g) bundle.getParcelable(n0.f9305n0);
                        m0Var.f9269s = bundle.getLong(n0.f9306o0, n0Var.G);
                        m0Var.f9270t = bundle.getInt(n0.f9307p0, n0Var.H);
                        m0Var.f9271u = bundle.getInt(n0.f9308q0, n0Var.I);
                        m0Var.v = bundle.getFloat(n0.f9309r0, n0Var.J);
                        m0Var.f9272w = bundle.getInt(n0.f9310s0, n0Var.K);
                        m0Var.f9273x = bundle.getFloat(n0.f9311t0, n0Var.L);
                        m0Var.f9274y = bundle.getByteArray(n0.f9312u0);
                        m0Var.f9275z = bundle.getInt(n0.f9313v0, n0Var.N);
                        Bundle bundle3 = bundle.getBundle(n0.f9314w0);
                        if (bundle3 != null) {
                            m0Var.A = (i5.b) i5.b.v.c(bundle3);
                        }
                        m0Var.B = bundle.getInt(n0.f9315x0, n0Var.P);
                        m0Var.C = bundle.getInt(n0.f9316y0, n0Var.Q);
                        m0Var.D = bundle.getInt(n0.f9317z0, n0Var.R);
                        m0Var.E = bundle.getInt(n0.A0, n0Var.S);
                        m0Var.F = bundle.getInt(n0.B0, n0Var.T);
                        m0Var.G = bundle.getInt(n0.C0, n0Var.U);
                        m0Var.H = bundle.getInt(n0.E0, n0Var.V);
                        m0Var.I = bundle.getInt(n0.F0, n0Var.W);
                        m0Var.J = bundle.getInt(n0.D0, n0Var.X);
                        return new n0(m0Var);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 28:
                if (bundle.getInt(f2.f9150a, -1) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.f(z4);
                if (bundle.getBoolean(o0.f9347e, false)) {
                    return new o0(bundle.getBoolean(o0.f9348f, false));
                }
                return new o0();
            default:
                String string7 = bundle.getString(c1.f9001n, "");
                string7.getClass();
                Bundle bundle4 = bundle.getBundle(c1.f9002r);
                if (bundle4 == null) {
                    x0Var = x0.f9472f;
                } else {
                    x0Var = (x0) x0.f9476w.c(bundle4);
                }
                x0 x0Var2 = x0Var;
                Bundle bundle5 = bundle.getBundle(c1.f9003s);
                if (bundle5 == null) {
                    e1Var = e1.V;
                } else {
                    e1Var = (e1) e1.D0.c(bundle5);
                }
                e1 e1Var2 = e1Var;
                Bundle bundle6 = bundle.getBundle(c1.v);
                if (bundle6 == null) {
                    u0Var = u0.f9424x;
                } else {
                    u0Var = (u0) t0.f9416w.c(bundle6);
                }
                u0 u0Var2 = u0Var;
                Bundle bundle7 = bundle.getBundle(c1.f9004w);
                if (bundle7 == null) {
                    z0Var = z0.f9495c;
                } else {
                    z0Var = (z0) z0.h.c(bundle7);
                }
                z0 z0Var2 = z0Var;
                Bundle bundle8 = bundle.getBundle(c1.f9005x);
                if (bundle8 == null) {
                    y0Var = null;
                } else {
                    y0Var = (y0) y0.C.c(bundle8);
                }
                return new c1(string7, u0Var2, y0Var, x0Var2, e1Var2, z0Var2);
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f6069a) {
            case 10:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void f(ba.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public Object get() {
        return new j3.j(new g5.q(), 2500, 5000);
    }

    @Override
    public void invoke(Object obj) {
        y1 y1Var = (y1) obj;
        switch (this.f6069a) {
            case 23:
                y1Var.onPlayerError(new j3.n(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                y1Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f6069a) {
            case 2:
                d2Var.dismiss();
                return;
            case 3:
                d2Var.dismiss();
                return;
            case 9:
                return;
            case 12:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public Object then(Task task) {
        boolean z4;
        File file;
        if (task.isSuccessful()) {
            i9.b bVar = (i9.b) task.getResult();
            f9.b bVar2 = f9.b.f6225a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f7938b);
            z4 = true;
            if (bVar.f7939c.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    public u(a9.a aVar) {
        this.f6069a = 20;
    }

    private final void m(d2 d2Var, int i10) {
    }
}
