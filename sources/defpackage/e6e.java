package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class e6e implements f69, k6a, OnCompleteListener {
    public final byte a;
    public final Object b;

    public e6e(u84 u84Var, String[] strArr) {
        this.a = (byte) 0;
        this.b = strArr;
    }

    @Override
    public final void E(d5a d5aVar, boolean z) {
        ese.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        eseVar.c();
        fre.h(eseVar.g);
        w3f b = eseVar.c.b(eseVar.g);
        k3f m = l3f.m(b.d());
        m.c();
        l3f.p((l3f) m.b, z);
        b.c();
        y3f.p((y3f) b.b, (l3f) m.a());
        eseVar.a.a((y3f) b.a(), 227);
        ese.b(eseVar);
        eseVar.e();
    }

    @Override
    public final void F(d5a d5aVar, int i) {
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        ese.a(eseVar, i);
    }

    @Override
    public final void L(d5a d5aVar, int i) {
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        ese.a(eseVar, i);
    }

    @Override
    public final void R(defpackage.d5a r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6e.R(d5a, java.lang.String):void");
    }

    @Override
    public final void T(d5a d5aVar, String str) {
        ese.j.b("onSessionStarted with sessionId = %s", str);
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        eseVar.c();
        nwe nweVar = eseVar.g;
        nweVar.f = str;
        eseVar.a.a((y3f) eseVar.c.b(nweVar).a(), 222);
        ese.b(eseVar);
        eseVar.e();
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                cse cseVar = new cse((TaskCompletionSource) obj2, (byte) 0);
                n7d n7dVar = (n7d) ((e5f) obj).k();
                Parcel R = n7dVar.R();
                jgd.d(R, cseVar);
                R.writeStringArray((String[]) obj3);
                n7dVar.W(R, 5);
                return;
            case 1:
                sme smeVar = new sme((TaskCompletionSource) obj2, (byte) 1);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i = ygd.a;
                obtain.writeStrongBinder(smeVar);
                obtain.writeInt(1);
                ((mn5) obj3).writeToParcel(obtain, 0);
                ((pyd) ((zze) obj).k()).a(obtain, 1);
                return;
            default:
                pp5 pp5Var = new pp5((TaskCompletionSource) obj2, (byte) 1);
                ho hoVar = new ho(new jp2(-1, -1, 0, true), false);
                hoVar.c = false;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = qgd.a;
                obtain2.writeStrongBinder(pp5Var);
                qgd.b(obtain2, (GetCredentialRequest) obj3);
                qgd.b(obtain2, hoVar);
                ((ih5) ((kh5) ((zj5) obj).k())).a(obtain2, 1);
                return;
        }
    }

    @Override
    public final void n(d5a d5aVar, int i) {
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        ese.a(eseVar, i);
    }

    @Override
    public final void onComplete(Task task) {
        ed1.h((ed1) ((r5d) this.b).c, "joinApplication", task);
    }

    @Override
    public final void p(d5a d5aVar) {
        dc6 dc6Var = ese.j;
        dc6Var.b("onSessionStarting", new Object[0]);
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        if (eseVar.g != null) {
            Log.w(dc6Var.a, dc6Var.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        eseVar.d();
        e0f e0fVar = eseVar.c;
        nwe nweVar = eseVar.g;
        w3f b = e0fVar.b(nweVar);
        if (nweVar.j == 1) {
            k3f m = l3f.m(b.d());
            m.c();
            l3f.r((l3f) m.b, 17);
            b.e((l3f) m.a());
        }
        eseVar.a.a((y3f) b.a(), 221);
    }

    @Override
    public final void q(d5a d5aVar, int i) {
        ese.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
        ese eseVar = (ese) this.b;
        eseVar.h = (ed1) d5aVar;
        eseVar.c();
        fre.h(eseVar.g);
        eseVar.a.a(eseVar.c.a(eseVar.g, i), 225);
        ese.b(eseVar);
        eseVar.e.removeCallbacks(eseVar.d);
    }

    @Override
    public final void y(d5a d5aVar) {
        ((ese) this.b).h = (ed1) d5aVar;
    }

    public e6e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
