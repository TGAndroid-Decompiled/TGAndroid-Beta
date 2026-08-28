package n5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final q5.b f18475m = new q5.b("CastSession", null);
    public final Context f18476c;
    public final HashSet d;
    public final q f18477e;
    public final b f18478f;
    public final com.google.android.gms.internal.cast.q f18479g;
    public final p5.h h;
    public m5.f0 f18480i;
    public o5.h f18481j;
    public CastDevice f18482k;
    public o4 f18483l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.q qVar, p5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f18476c = context.getApplicationContext();
        this.f18478f = bVar;
        this.f18479g = qVar;
        this.h = hVar;
        h6.a f10 = f();
        j jVar = new j(this);
        q5.b bVar2 = com.google.android.gms.internal.cast.e.f3087a;
        q qVar2 = null;
        if (f10 != null) {
            try {
                qVar2 = com.google.android.gms.internal.cast.e.b(context).U0(bVar, f10, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.e.f3087a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f18477e = qVar2;
    }

    public static void g(c cVar, int i9) {
        p5.h hVar = cVar.h;
        if (hVar.f45496q) {
            hVar.f45496q = false;
            o5.h hVar2 = hVar.f45493n;
            if (hVar2 != null) {
                d0 d0Var = hVar.f45492m;
                x5.l.e("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.f18990i.remove(d0Var);
                }
            }
            hVar.f45484c.J0(null);
            b3.b bVar = hVar.h;
            if (bVar != null) {
                bVar.C();
                bVar.f1416e = null;
            }
            b3.b bVar2 = hVar.f45488i;
            if (bVar2 != null) {
                bVar2.C();
                bVar2.f1416e = null;
            }
            android.support.v4.media.session.d0 d0Var2 = hVar.f45495p;
            if (d0Var2 != null) {
                d0Var2.d(null, null);
                hVar.f45495p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.d0 d0Var3 = hVar.f45495p;
            if (d0Var3 != null) {
                d0Var3.c(false);
                hVar.f45495p.b();
                hVar.f45495p = null;
            }
            hVar.f45493n = null;
            hVar.f45494o = null;
            hVar.h();
            if (i9 == 0) {
                hVar.i();
            }
        }
        m5.f0 f0Var = cVar.f18480i;
        if (f0Var != null) {
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.f2914c = m5.z.f17492b;
            b10.f2912a = 8403;
            f0Var.e(1, b10.b());
            f0Var.h();
            com.google.android.gms.common.api.internal.n nVar = fa.c.D(f0Var.f2946f, f0Var.f17393k, "castDeviceControllerListenerKey").f2873c;
            x5.l.i(nVar, "Key must not be null");
            f0Var.c(nVar, 8415);
            cVar.f18480i = null;
        }
        cVar.f18482k = null;
        o5.h hVar3 = cVar.f18481j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f18481j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        q5.b bVar = f18475m;
        q qVar = cVar.f18477e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                q5.u uVar = (q5.u) task.getResult();
                Status status = uVar.f46051a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    o5.h hVar = new o5.h(new q5.n());
                    cVar.f18481j = hVar;
                    hVar.v(cVar.f18480i);
                    cVar.f18481j.p(new d0(cVar, 0));
                    cVar.f18481j.u();
                    p5.h hVar2 = cVar.h;
                    o5.h hVar3 = cVar.f18481j;
                    x5.l.e("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f18482k);
                    m5.d dVar = uVar.f46052b;
                    x5.l.h(dVar);
                    String str2 = uVar.f46053c;
                    String str3 = uVar.d;
                    x5.l.h(str3);
                    boolean z10 = uVar.f46054e;
                    o oVar = (o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.u.c(M0, dVar);
                    M0.writeString(str2);
                    M0.writeString(str3);
                    M0.writeInt(z10 ? 1 : 0);
                    oVar.Q0(M0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i9 = status.f2741a;
                o oVar2 = (o) qVar;
                Parcel M02 = oVar2.M0();
                M02.writeInt(i9);
                oVar2.Q0(M02, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof com.google.android.gms.common.api.f) {
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar3 = (o) qVar;
                Parcel M03 = oVar3.M0();
                M03.writeInt(statusCode);
                oVar3.Q0(M03, 5);
                return;
            }
            o oVar4 = (o) qVar;
            Parcel M04 = oVar4.M0();
            M04.writeInt(2476);
            oVar4.Q0(M04, 5);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: n5.c.i(android.os.Bundle):void");
    }
}
