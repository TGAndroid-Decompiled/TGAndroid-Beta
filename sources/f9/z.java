package f9;

import android.content.pm.ShortcutManager;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d5.g0;
import gh.x5;
import h3.b1;
import h3.d1;
import h3.f1;
import h3.g1;
import h3.g2;
import h3.h1;
import h3.l2;
import h3.n2;
import h3.p2;
import h3.s0;
import h3.t0;
import h3.u1;
import h3.v0;
import h3.x0;
import h3.y0;
import h3.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;

public final class z implements Continuation, z8.d, Vector.TLDeserializer, a2, GenericProvider, o8.e, d5.k, h3.f {

    public final int f6014a;

    public z(int i10) {
        this.f6014a = i10;
    }

    public static ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static FingerprintManager c(Object obj) {
        return (FingerprintManager) obj;
    }

    public static OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class g() {
        return ShortcutManager.class;
    }

    @Override
    public h3.g a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        boolean z10 = true;
        int i10 = 0;
        Object[] objArr = 0;
        switch (this.f6014a) {
            case 18:
                t0 t0Var = t0.Y;
                s0 s0Var = new s0();
                if (bundle != null) {
                    ClassLoader classLoader = d5.a.class.getClassLoader();
                    int i11 = g0.f4795a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(t0.Z);
                String str = t0Var.f8184a;
                if (string == null) {
                    string = str;
                }
                s0Var.f8123a = string;
                String string2 = bundle.getString(t0.f8159a0);
                String str2 = t0Var.f8185b;
                if (string2 == null) {
                    string2 = str2;
                }
                s0Var.f8124b = string2;
                String string3 = bundle.getString(t0.f8160b0);
                String str3 = t0Var.f8186c;
                if (string3 == null) {
                    string3 = str3;
                }
                s0Var.f8125c = string3;
                s0Var.d = bundle.getInt(t0.f8161c0, t0Var.d);
                s0Var.f8126e = bundle.getInt(t0.f8162d0, t0Var.f8187e);
                s0Var.f8127f = bundle.getInt(t0.f8163e0, t0Var.f8188f);
                s0Var.f8128g = bundle.getInt(t0.f8164f0, t0Var.h);
                String string4 = bundle.getString(t0.f8165g0);
                String str4 = t0Var.f8190r;
                if (string4 == null) {
                    string4 = str4;
                }
                s0Var.h = string4;
                z3.c cVar = (z3.c) bundle.getParcelable(t0.f8166h0);
                z3.c cVar2 = t0Var.f8191s;
                if (cVar == null) {
                    cVar = cVar2;
                }
                s0Var.f8129i = cVar;
                String string5 = bundle.getString(t0.f8167i0);
                String str5 = t0Var.A;
                if (string5 == null) {
                    string5 = str5;
                }
                s0Var.f8134n = string5;
                String string6 = bundle.getString(t0.f8168j0);
                String str6 = t0Var.B;
                if (string6 == null) {
                    string6 = str6;
                }
                s0Var.f8135o = string6;
                s0Var.f8136p = bundle.getInt(t0.f8169k0, t0Var.C);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(t0.f8170l0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        s0Var.f8137q = arrayList;
                        s0Var.f8138r = (l3.d) bundle.getParcelable(t0.m0);
                        s0Var.f8139s = bundle.getLong(t0.f8171n0, t0Var.F);
                        s0Var.f8140t = bundle.getInt(t0.f8172o0, t0Var.G);
                        s0Var.f8141u = bundle.getInt(t0.f8173p0, t0Var.H);
                        s0Var.v = bundle.getFloat(t0.f8174q0, t0Var.I);
                        s0Var.f8142w = bundle.getInt(t0.f8175r0, t0Var.J);
                        s0Var.f8143x = bundle.getFloat(t0.f8176s0, t0Var.K);
                        s0Var.f8144y = bundle.getByteArray(t0.f8177t0);
                        s0Var.f8145z = bundle.getInt(t0.f8178u0, t0Var.M);
                        Bundle bundle4 = bundle.getBundle(t0.f8179v0);
                        if (bundle4 != null) {
                            s0Var.A = (e5.b) e5.b.f5230s.a(bundle4);
                        }
                        s0Var.B = bundle.getInt(t0.f8180w0, t0Var.O);
                        s0Var.C = bundle.getInt(t0.f8181x0, t0Var.P);
                        s0Var.D = bundle.getInt(t0.f8182y0, t0Var.Q);
                        s0Var.E = bundle.getInt(t0.f8183z0, t0Var.R);
                        s0Var.F = bundle.getInt(t0.A0, t0Var.S);
                        s0Var.G = bundle.getInt(t0.B0, t0Var.T);
                        s0Var.H = bundle.getInt(t0.D0, t0Var.U);
                        s0Var.I = bundle.getInt(t0.E0, t0Var.V);
                        s0Var.J = bundle.getInt(t0.C0, t0Var.W);
                        return new t0(s0Var);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
                break;
            case 19:
                d5.a.f(bundle.getInt(g2.f7864a, -1) == 0);
                return bundle.getBoolean(v0.f8213e, false) ? new v0(bundle.getBoolean(v0.f8214f, false)) : new v0();
            case 20:
                String string7 = bundle.getString(f1.f7824n, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(f1.f7825r);
                b1 b1Var = bundle5 == null ? b1.f7777f : (b1) b1.f7781w.a(bundle5);
                Bundle bundle6 = bundle.getBundle(f1.f7826s);
                h1 h1Var = bundle6 == null ? h1.U : (h1) h1.C0.a(bundle6);
                Bundle bundle7 = bundle.getBundle(f1.v);
                z0 z0Var = bundle7 == null ? z0.f8260x : (z0) y0.f8251w.a(bundle7);
                Bundle bundle8 = bundle.getBundle(f1.f7827w);
                return new f1(string7, z0Var, null, b1Var, h1Var, bundle8 == null ? d1.f7806c : (d1) d1.h.a(bundle8));
            case 21:
                x0 x0Var = new x0();
                String str7 = y0.h;
                z0 z0Var2 = y0.f8247f;
                long j10 = bundle.getLong(str7, z0Var2.f8252a);
                d5.a.f(j10 >= 0);
                x0Var.f8238a = j10;
                long j11 = bundle.getLong(y0.f8248n, z0Var2.f8253b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    z10 = false;
                }
                d5.a.f(z10);
                x0Var.f8239b = j11;
                x0Var.f8240c = bundle.getBoolean(y0.f8249r, z0Var2.f8254c);
                x0Var.d = bundle.getBoolean(y0.f8250s, z0Var2.d);
                x0Var.f8241e = bundle.getBoolean(y0.v, z0Var2.f8255e);
                return new z0(x0Var);
            case 22:
                return new b1(bundle.getLong(b1.h, -9223372036854775807L), bundle.getLong(b1.f7778n, -9223372036854775807L), bundle.getLong(b1.f7779r, -9223372036854775807L), bundle.getFloat(b1.f7780s, -3.4028235E38f), bundle.getFloat(b1.v, -3.4028235E38f));
            case 23:
                a5.n nVar = new a5.n(18, (boolean) (objArr == true ? 1 : 0));
                nVar.f100b = (Uri) bundle.getParcelable(d1.d);
                nVar.f101c = bundle.getString(d1.f7807e);
                nVar.d = bundle.getBundle(d1.f7808f);
                return new d1(nVar);
            case 24:
                g1 g1Var = new g1();
                g1Var.f7841a = bundle.getCharSequence(h1.V);
                g1Var.f7842b = bundle.getCharSequence(h1.W);
                g1Var.f7843c = bundle.getCharSequence(h1.X);
                g1Var.d = bundle.getCharSequence(h1.Y);
                g1Var.f7844e = bundle.getCharSequence(h1.Z);
                g1Var.f7845f = bundle.getCharSequence(h1.f7871a0);
                g1Var.f7846g = bundle.getCharSequence(h1.f7872b0);
                byte[] byteArray2 = bundle.getByteArray(h1.f7875e0);
                String str8 = h1.f7893x0;
                Integer numValueOf = bundle.containsKey(str8) ? Integer.valueOf(bundle.getInt(str8)) : null;
                g1Var.f7848j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                g1Var.f7849k = numValueOf;
                g1Var.f7850l = (Uri) bundle.getParcelable(h1.f7876f0);
                g1Var.f7861x = bundle.getCharSequence(h1.f7886q0);
                g1Var.f7862y = bundle.getCharSequence(h1.f7887r0);
                g1Var.f7863z = bundle.getCharSequence(h1.f7888s0);
                g1Var.C = bundle.getCharSequence(h1.f7891v0);
                g1Var.D = bundle.getCharSequence(h1.f7892w0);
                g1Var.E = bundle.getCharSequence(h1.f7894y0);
                g1Var.G = bundle.getBundle(h1.B0);
                String str9 = h1.f7873c0;
                if (bundle.containsKey(str9) && (bundle3 = bundle.getBundle(str9)) != null) {
                    g1Var.h = (g2) g2.f7865b.a(bundle3);
                }
                String str10 = h1.f7874d0;
                if (bundle.containsKey(str10) && (bundle2 = bundle.getBundle(str10)) != null) {
                    g1Var.f7847i = (g2) g2.f7865b.a(bundle2);
                }
                String str11 = h1.f7877g0;
                if (bundle.containsKey(str11)) {
                    g1Var.f7851m = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = h1.f7878h0;
                if (bundle.containsKey(str12)) {
                    g1Var.f7852n = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = h1.f7879i0;
                if (bundle.containsKey(str13)) {
                    g1Var.f7853o = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = h1.A0;
                if (bundle.containsKey(str14)) {
                    g1Var.f7854p = Boolean.valueOf(bundle.getBoolean(str14));
                }
                String str15 = h1.f7880j0;
                if (bundle.containsKey(str15)) {
                    g1Var.f7855q = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = h1.f7881k0;
                if (bundle.containsKey(str16)) {
                    g1Var.f7856r = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = h1.f7882l0;
                if (bundle.containsKey(str17)) {
                    g1Var.f7857s = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = h1.m0;
                if (bundle.containsKey(str18)) {
                    g1Var.f7858t = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = h1.f7883n0;
                if (bundle.containsKey(str19)) {
                    g1Var.f7859u = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = h1.f7884o0;
                if (bundle.containsKey(str20)) {
                    g1Var.v = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = h1.f7885p0;
                if (bundle.containsKey(str21)) {
                    g1Var.f7860w = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = h1.f7889t0;
                if (bundle.containsKey(str22)) {
                    g1Var.A = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = h1.f7890u0;
                if (bundle.containsKey(str23)) {
                    g1Var.B = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = h1.f7895z0;
                if (bundle.containsKey(str24)) {
                    g1Var.F = Integer.valueOf(bundle.getInt(str24));
                }
                return new h1(g1Var);
            case 25:
                d5.a.f(bundle.getInt(g2.f7864a, -1) == 1);
                float f10 = bundle.getFloat(u1.d, -1.0f);
                return f10 == -1.0f ? new u1() : new u1(f10);
            case 26:
                int i12 = bundle.getInt(g2.f7864a, -1);
                if (i12 == 0) {
                    return (g2) v0.h.a(bundle);
                }
                if (i12 == 1) {
                    return (g2) u1.f8208e.a(bundle);
                }
                if (i12 == 2) {
                    return (g2) l2.h.a(bundle);
                }
                if (i12 == 3) {
                    return (g2) n2.h.a(bundle);
                }
                throw new IllegalArgumentException(i0.a.k(i12, "Unknown RatingType: "));
            case 27:
                d5.a.f(bundle.getInt(g2.f7864a, -1) == 2);
                int i13 = bundle.getInt(l2.f8012e, 5);
                float f11 = bundle.getFloat(l2.f8013f, -1.0f);
                return f11 == -1.0f ? new l2(i13) : new l2(i13, f11);
            case 28:
                d5.a.f(bundle.getInt(g2.f7864a, -1) == 3);
                return bundle.getBoolean(n2.f8040e, false) ? new n2(bundle.getBoolean(n2.f8041f, false)) : new n2();
            default:
                int i14 = bundle.getInt(p2.f8063n, 0);
                long j12 = bundle.getLong(p2.f8064r, -9223372036854775807L);
                long j13 = bundle.getLong(p2.f8065s, 0L);
                boolean z11 = bundle.getBoolean(p2.v, false);
                Bundle bundle9 = bundle.getBundle(p2.f8066w);
                k4.b bVar = bundle9 != null ? (k4.b) k4.b.f14452w.a(bundle9) : k4.b.f14448f;
                p2 p2Var = new p2();
                p2Var.h(null, null, i14, j12, j13, bVar, z11);
                return p2Var;
        }
    }

    @Override
    public Object apply(Object obj) {
        return new i3.f((d5.b0) obj);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f6014a) {
            case 9:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        h3.a2 a2Var = (h3.a2) obj;
        switch (this.f6014a) {
            case 13:
                a2Var.onPlayerError(new h3.n(2, new a7.c("Player release timed out."), 1003));
                break;
            case 14:
                a2Var.onSeekProcessed();
                break;
            default:
                a2Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        int i10 = x5.f7625g0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            b bVar = (b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.f5924b;
            c9.c cVar = c9.c.f2568a;
            cVar.b(str);
            File file = bVar.f5925c;
            z10 = true;
            if (file.delete()) {
                cVar.b("Deleted report file: " + file.getPath());
            } else {
                cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public Object u0(af.h hVar) {
        Set setY = hVar.y(ga.a.class);
        ga.c cVar = ga.c.f6832c;
        if (cVar == null) {
            synchronized (ga.c.class) {
                try {
                    cVar = ga.c.f6832c;
                    if (cVar == null) {
                        cVar = new ga.c(0);
                        ga.c.f6832c = cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new ga.b(setY, cVar);
    }

    public z(com.google.firebase.messaging.m mVar) {
        this.f6014a = 0;
    }
}
