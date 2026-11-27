package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class uae implements s99, caa, OnCompleteListener {
    public final byte a;
    public final Object b;

    public uae(qa4 qa4Var, String[] strArr) {
        this.a = (byte) 0;
        this.b = strArr;
    }

    @Override
    public final void B(v8a v8aVar) {
        ((vwe) this.b).h = (md1) v8aVar;
    }

    @Override
    public final void C(v8a v8aVar, boolean z) {
        vwe.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vweVar.c();
        xve.h(vweVar.g);
        n8f b = vweVar.c.b(vweVar.g);
        b8f m = c8f.m(b.d());
        m.c();
        c8f.p((c8f) m.b, z);
        b.c();
        p8f.p((p8f) b.b, (c8f) m.a());
        vweVar.a.a((p8f) b.a(), 227);
        vwe.b(vweVar);
        vweVar.e();
    }

    @Override
    public final void D(v8a v8aVar, int i) {
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vwe.a(vweVar, i);
    }

    @Override
    public final void J(v8a v8aVar, int i) {
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vwe.a(vweVar, i);
    }

    @Override
    public final void N(defpackage.v8a r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uae.N(v8a, java.lang.String):void");
    }

    @Override
    public final void P(v8a v8aVar, String str) {
        vwe.j.b("onSessionStarted with sessionId = %s", str);
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vweVar.c();
        e1f e1fVar = vweVar.g;
        e1fVar.f = str;
        vweVar.a.a((p8f) vweVar.c.b(e1fVar).a(), 222);
        vwe.b(vweVar);
        vweVar.e();
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                twe tweVar = new twe((TaskCompletionSource) obj2, (byte) 0);
                gcd gcdVar = (gcd) ((v9f) obj).k();
                Parcel R = gcdVar.R();
                ald.d(R, tweVar);
                R.writeStringArray((String[]) obj3);
                gcdVar.W(R, 5);
                return;
            case 1:
                jre jreVar = new jre((TaskCompletionSource) obj2, (byte) 1);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i = pld.a;
                obtain.writeStrongBinder(jreVar);
                obtain.writeInt(1);
                ((pp5) obj3).writeToParcel(obtain, 0);
                ((f3e) ((q4f) obj).k()).a(obtain, 1);
                return;
            default:
                sr5 sr5Var = new sr5((TaskCompletionSource) obj2, (byte) 1);
                io ioVar = new io(new cq2(-1, -1, 0, true), false);
                ioVar.c = false;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = hld.a;
                obtain2.writeStrongBinder(sr5Var);
                hld.b(obtain2, (GetCredentialRequest) obj3);
                hld.b(obtain2, ioVar);
                ((kj5) ((mj5) ((cm5) obj).k())).a(obtain2, 1);
                return;
        }
    }

    @Override
    public final void m(v8a v8aVar, int i) {
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vwe.a(vweVar, i);
    }

    @Override
    public final void n(v8a v8aVar) {
        he6 he6Var = vwe.j;
        he6Var.b("onSessionStarting", new Object[0]);
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        if (vweVar.g != null) {
            Log.w(he6Var.a, he6Var.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        vweVar.d();
        v4f v4fVar = vweVar.c;
        e1f e1fVar = vweVar.g;
        n8f b = v4fVar.b(e1fVar);
        if (e1fVar.j == 1) {
            b8f m = c8f.m(b.d());
            m.c();
            c8f.r((c8f) m.b, 17);
            b.e((c8f) m.a());
        }
        vweVar.a.a((p8f) b.a(), 221);
    }

    @Override
    public final void onComplete(Task task) {
        md1.h((md1) ((kad) this.b).c, "joinApplication", task);
    }

    @Override
    public final void p(v8a v8aVar, int i) {
        vwe.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
        vwe vweVar = (vwe) this.b;
        vweVar.h = (md1) v8aVar;
        vweVar.c();
        xve.h(vweVar.g);
        vweVar.a.a(vweVar.c.a(vweVar.g, i), 225);
        vwe.b(vweVar);
        vweVar.e.removeCallbacks(vweVar.d);
    }

    public uae(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
