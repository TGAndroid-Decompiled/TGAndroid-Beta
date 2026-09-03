package f0;

import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f5.u;
import g5.q;
import h5.d0;
import h5.j;
import h5.y;
import j3.c1;
import j3.e1;
import j3.f2;
import j3.m0;
import j3.n;
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
import org.telegram.ui.Components.tc0;
import s5.m;
public final class d implements f3.f, j3.f, ba.a, c2, tc0, Continuation, r8.i, r8.e, j {
    public final int f5630a;

    public d(int i10) {
        this.f5630a = i10;
    }

    public static ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static OnBackInvokedDispatcher g(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class i() {
        return ShortcutManager.class;
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f5630a) {
            case 1:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        m a2 = y2.i.a();
                        a2.n(rawQuery.getString(1));
                        a2.d = i3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f44154c = decode;
                        arrayList.add(a2.f());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                return new k3.f((y) obj);
        }
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
        switch (this.f5630a) {
            case 2:
                Bundle bundle2 = bundle.getBundle(u.f5954c);
                bundle2.getClass();
                s0 s0Var = (s0) s0.f16399n.c(bundle2);
                int[] intArray = bundle.getIntArray(u.d);
                intArray.getClass();
                if (intArray.length == 0) {
                    aVar = Collections.EMPTY_LIST;
                } else {
                    aVar = new u8.a(0, intArray.length, intArray);
                }
                return new u(s0Var, aVar);
            case 18:
                return new i5.b(bundle.getInt(i5.b.h, -1), bundle.getInt(i5.b.f7240n, -1), bundle.getInt(i5.b.f7241r, -1), bundle.getByteArray(i5.b.f7242s));
            case 27:
                n0 n0Var = n0.Z;
                m0 m0Var = new m0();
                if (bundle != null) {
                    ClassLoader classLoader = h5.a.class.getClassLoader();
                    int i11 = d0.f6924a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(n0.f8692a0);
                String str = n0Var.f8717a;
                if (string == null) {
                    string = str;
                }
                m0Var.f8655a = string;
                String string2 = bundle.getString(n0.f8693b0);
                String str2 = n0Var.f8718b;
                if (string2 == null) {
                    string2 = str2;
                }
                m0Var.f8656b = string2;
                String string3 = bundle.getString(n0.f8694c0);
                String str3 = n0Var.f8719c;
                if (string3 == null) {
                    string3 = str3;
                }
                m0Var.f8657c = string3;
                m0Var.d = bundle.getInt(n0.f8695d0, n0Var.d);
                m0Var.e = bundle.getInt(n0.f8696e0, n0Var.e);
                m0Var.f8658f = bundle.getInt(n0.f8697f0, n0Var.f8720f);
                m0Var.f8659g = bundle.getInt(n0.f8698g0, n0Var.h);
                String string4 = bundle.getString(n0.f8699h0);
                String str4 = n0Var.f8722r;
                if (string4 == null) {
                    string4 = str4;
                }
                m0Var.h = string4;
                e4.c cVar = (e4.c) bundle.getParcelable(n0.f8700i0);
                e4.c cVar2 = n0Var.f8723s;
                if (cVar == null) {
                    cVar = cVar2;
                }
                m0Var.f8660i = cVar;
                String string5 = bundle.getString(n0.f8701j0);
                String str5 = n0Var.B;
                if (string5 == null) {
                    string5 = str5;
                }
                m0Var.f8665n = string5;
                String string6 = bundle.getString(n0.f8702k0);
                String str6 = n0Var.C;
                if (string6 == null) {
                    string6 = str6;
                }
                m0Var.f8666o = string6;
                m0Var.f8667p = bundle.getInt(n0.f8703l0, n0Var.D);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(n0.m0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        m0Var.f8668q = arrayList;
                        m0Var.f8669r = (o3.h) bundle.getParcelable(n0.f8704n0);
                        m0Var.f8670s = bundle.getLong(n0.f8705o0, n0Var.G);
                        m0Var.f8671t = bundle.getInt(n0.f8706p0, n0Var.H);
                        m0Var.f8672u = bundle.getInt(n0.f8707q0, n0Var.I);
                        m0Var.v = bundle.getFloat(n0.f8708r0, n0Var.J);
                        m0Var.f8673w = bundle.getInt(n0.f8709s0, n0Var.K);
                        m0Var.f8674x = bundle.getFloat(n0.f8710t0, n0Var.L);
                        m0Var.f8675y = bundle.getByteArray(n0.f8711u0);
                        m0Var.f8676z = bundle.getInt(n0.f8712v0, n0Var.N);
                        Bundle bundle3 = bundle.getBundle(n0.f8713w0);
                        if (bundle3 != null) {
                            m0Var.A = (i5.b) i5.b.v.c(bundle3);
                        }
                        m0Var.B = bundle.getInt(n0.f8714x0, n0Var.P);
                        m0Var.C = bundle.getInt(n0.f8715y0, n0Var.Q);
                        m0Var.D = bundle.getInt(n0.f8716z0, n0Var.R);
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
                if (bundle.getInt(f2.f8564a, -1) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.f(z4);
                if (bundle.getBoolean(o0.e, false)) {
                    return new o0(bundle.getBoolean(o0.f8743f, false));
                }
                return new o0();
            default:
                String string7 = bundle.getString(c1.f8424n, "");
                string7.getClass();
                Bundle bundle4 = bundle.getBundle(c1.f8425r);
                if (bundle4 == null) {
                    x0Var = x0.f8857f;
                } else {
                    x0Var = (x0) x0.f8861w.c(bundle4);
                }
                x0 x0Var2 = x0Var;
                Bundle bundle5 = bundle.getBundle(c1.f8426s);
                if (bundle5 == null) {
                    e1Var = e1.V;
                } else {
                    e1Var = (e1) e1.D0.c(bundle5);
                }
                e1 e1Var2 = e1Var;
                Bundle bundle6 = bundle.getBundle(c1.v);
                if (bundle6 == null) {
                    u0Var = u0.f8812x;
                } else {
                    u0Var = (u0) t0.f8805w.c(bundle6);
                }
                u0 u0Var2 = u0Var;
                Bundle bundle7 = bundle.getBundle(c1.f8427w);
                if (bundle7 == null) {
                    z0Var = z0.f8878c;
                } else {
                    z0Var = (z0) z0.h.c(bundle7);
                }
                z0 z0Var2 = z0Var;
                Bundle bundle8 = bundle.getBundle(c1.f8428x);
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
        switch (this.f5630a) {
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
        return new j3.j(new q(), 2500, 5000);
    }

    @Override
    public void invoke(Object obj) {
        y1 y1Var = (y1) obj;
        switch (this.f5630a) {
            case 23:
                y1Var.onPlayerError(new n(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                y1Var.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f5630a) {
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
            f9.b bVar2 = f9.b.f6095a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f7357b);
            z4 = true;
            if (bVar.f7358c.delete()) {
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

    public d(a9.a aVar) {
        this.f5630a = 20;
    }

    private final void m(d2 d2Var, int i10) {
    }
}
