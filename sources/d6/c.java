package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import bi.u6;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final g6.b f6304m = new g6.b("CastSession", null);
    public final Context f6305c;
    public final HashSet d;
    public final q e;
    public final b f6306f;
    public final com.google.android.gms.internal.cast.r f6307g;
    public final f6.i h;
    public e0 f6308i;
    public e6.h f6309j;
    public CastDevice f6310k;
    public q4 f6311l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f6305c = context.getApplicationContext();
        this.f6306f = bVar;
        this.f6307g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f5103a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).W0(bVar, f7, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.e.f5103a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f7888q) {
            iVar.f7888q = false;
            e6.h hVar = iVar.f7885n;
            if (hVar != null) {
                c0 c0Var = iVar.f7884m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f7319i.remove(c0Var);
                }
            }
            iVar.f7877c.L0(null);
            u6 u6Var = iVar.h;
            if (u6Var != null) {
                u6Var.C();
                u6Var.e = null;
            }
            u6 u6Var2 = iVar.f7880i;
            if (u6Var2 != null) {
                u6Var2.C();
                u6Var2.e = null;
            }
            android.support.v4.media.session.b0 b0Var = iVar.f7887p;
            if (b0Var != null) {
                b0Var.d(null, null);
                iVar.f7887p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.b0 b0Var2 = iVar.f7887p;
            if (b0Var2 != null) {
                b0Var2.c(false);
                iVar.f7887p.b();
                iVar.f7887p = null;
            }
            iVar.f7885n = null;
            iVar.f7886o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f6308i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
            e.f4957c = c6.z.f4484b;
            e.f4955a = 8403;
            e0Var.e(1, e.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a4.m.Q(e0Var.f4986f, e0Var.f4394k, "castDeviceControllerListenerKey").f4919c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f6308i = null;
        }
        cVar.f6310k = null;
        e6.h hVar2 = cVar.f6309j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f6309j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f6304m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f8594a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f6309j = hVar;
                    hVar.v(cVar.f6308i);
                    cVar.f6309j.p(new c0(cVar, 0));
                    cVar.f6309j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f6309j;
                    n6.l.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f6310k);
                    c6.d dVar = tVar.f8595b;
                    n6.l.h(dVar);
                    String str2 = tVar.f8596c;
                    String str3 = tVar.d;
                    n6.l.h(str3);
                    boolean z10 = tVar.e;
                    o oVar = (o) qVar;
                    Parcel O0 = oVar.O0();
                    com.google.android.gms.internal.cast.v.c(O0, dVar);
                    O0.writeString(str2);
                    O0.writeString(str3);
                    O0.writeInt(z10 ? 1 : 0);
                    oVar.S0(O0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i10 = status.f4796a;
                o oVar2 = (o) qVar;
                Parcel O02 = oVar2.O0();
                O02.writeInt(i10);
                oVar2.S0(O02, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof com.google.android.gms.common.api.f) {
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar3 = (o) qVar;
                Parcel O03 = oVar3.O0();
                O03.writeInt(statusCode);
                oVar3.S0(O03, 5);
                return;
            }
            o oVar4 = (o) qVar;
            Parcel O04 = oVar4.O0();
            O04.writeInt(2476);
            oVar4.S0(O04, 5);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: d6.c.i(android.os.Bundle):void");
    }
}
