package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
public final class fkd implements h89, v76, OnCompleteListener, m8a {
    public final byte a;
    public final Object b;

    public fkd(ua4 ua4Var, String[] strArr) {
        this.a = (byte) 3;
        this.b = strArr;
    }

    @Override
    public final void B(f7a f7aVar, boolean z) {
        hue.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hueVar.c();
        ite.h(hueVar.g);
        y5f b = hueVar.c.b(hueVar.g);
        m5f m = n5f.m(b.d());
        m.c();
        n5f.p((n5f) m.b, z);
        b.c();
        a6f.p((a6f) b.b, (n5f) m.a());
        hueVar.a.a((a6f) b.a(), 227);
        hue.b(hueVar);
        hueVar.e();
    }

    @Override
    public final void C(f7a f7aVar, int i) {
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hue.a(hueVar, i);
    }

    @Override
    public final void L(f7a f7aVar, int i) {
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hue.a(hueVar, i);
    }

    @Override
    public final void P(defpackage.f7a r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkd.P(f7a, java.lang.String):void");
    }

    @Override
    public final void R(f7a f7aVar, String str) {
        hue.j.b("onSessionStarted with sessionId = %s", str);
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hueVar.c();
        pye pyeVar = hueVar.g;
        pyeVar.f = str;
        hueVar.a.a((a6f) hueVar.c.b(pyeVar).a(), 222);
        hue.b(hueVar);
        hueVar.e();
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                b5f b5fVar = (b5f) ((tpd) obj).k();
                jmd jmdVar = new jmd((TaskCompletionSource) obj2, (byte) 1);
                Parcel R = b5fVar.R();
                int i = sid.a;
                R.writeInt(1);
                ((id6) obj3).writeToParcel(R, 0);
                sid.c(R, jmdVar);
                R.writeString(null);
                b5fVar.V(R, 63);
                return;
            case 1:
            case 2:
            default:
                pr5 pr5Var = new pr5((TaskCompletionSource) obj2, (byte) 1);
                hp hpVar = new hp(new uq2(-1, -1, 0, true), false);
                hpVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = rid.a;
                obtain.writeStrongBinder(pr5Var);
                rid.b(obtain, (GetCredentialRequest) obj3);
                rid.b(obtain, hpVar);
                ((hj5) ((jj5) ((zl5) obj).k())).a(obtain, 1);
                return;
            case 3:
                fue fueVar = new fue((TaskCompletionSource) obj2, (byte) 0);
                p9d p9dVar = (p9d) ((g7f) obj).k();
                Parcel R2 = p9dVar.R();
                kid.d(R2, fueVar);
                R2.writeStringArray((String[]) obj3);
                p9dVar.W(R2, 5);
                return;
            case 4:
                voe voeVar = new voe((TaskCompletionSource) obj2, (byte) 1);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i3 = zid.a;
                obtain2.writeStrongBinder(voeVar);
                obtain2.writeInt(1);
                ((mp5) obj3).writeToParcel(obtain2, 0);
                ((s0e) ((b2f) obj).k()).a(obtain2, 1);
                return;
        }
    }

    @Override
    public final void c(Object obj) {
        u76 u76Var;
        m05 m05Var = (m05) obj;
        ry ryVar = ((god) this.b).b;
        synchronized (ryVar) {
            ryVar.b = false;
            u76Var = ((w76) ryVar.c).b;
        }
        if (u76Var != null) {
            ((ua4) ryVar.d).c(u76Var, 2441);
        }
    }

    @Override
    public final void l(f7a f7aVar, int i) {
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hue.a(hueVar, i);
    }

    @Override
    public final void o(f7a f7aVar) {
        ce6 ce6Var = hue.j;
        ce6Var.b("onSessionStarting", new Object[0]);
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        if (hueVar.g != null) {
            Log.w(ce6Var.a, ce6Var.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        hueVar.d();
        g2f g2fVar = hueVar.c;
        pye pyeVar = hueVar.g;
        y5f b = g2fVar.b(pyeVar);
        if (pyeVar.j == 1) {
            m5f m = n5f.m(b.d());
            m.c();
            n5f.r((n5f) m.b, 17);
            b.e((n5f) m.a());
        }
        hueVar.a.a((a6f) b.a(), 221);
    }

    @Override
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ((CountDownLatch) obj).countDown();
                return;
            default:
                me1.h((me1) ((t7d) obj).c, "joinApplication", task);
                return;
        }
    }

    @Override
    public final void q(f7a f7aVar, int i) {
        hue.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
        hue hueVar = (hue) this.b;
        hueVar.h = (me1) f7aVar;
        hueVar.c();
        ite.h(hueVar.g);
        hueVar.a.a(hueVar.c.a(hueVar.g, i), 225);
        hue.b(hueVar);
        hueVar.e.removeCallbacks(hueVar.d);
    }

    @Override
    public final void z(f7a f7aVar) {
        ((hue) this.b).h = (me1) f7aVar;
    }

    public fkd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
