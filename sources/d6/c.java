package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final g6.b f7532m = new g6.b("CastSession", null);
    public final Context f7533c;
    public final HashSet d;
    public final q e;
    public final b f7534f;
    public final com.google.android.gms.internal.cast.r f7535g;
    public final f6.i h;
    public e0 f7536i;
    public e6.h f7537j;
    public CastDevice f7538k;
    public q4 f7539l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f7533c = context.getApplicationContext();
        this.f7534f = bVar;
        this.f7535g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f6329a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).W0(bVar, f7, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.e.f6329a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f9006q) {
            iVar.f9006q = false;
            e6.h hVar = iVar.f9003n;
            if (hVar != null) {
                c0 c0Var = iVar.f9002m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f8019i.remove(c0Var);
                }
            }
            iVar.f8995c.L0(null);
            cf.c cVar2 = iVar.h;
            if (cVar2 != null) {
                cVar2.B();
                cVar2.e = null;
            }
            cf.c cVar3 = iVar.f8998i;
            if (cVar3 != null) {
                cVar3.B();
                cVar3.e = null;
            }
            android.support.v4.media.session.b0 b0Var = iVar.f9005p;
            if (b0Var != null) {
                b0Var.d(null, null);
                iVar.f9005p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.b0 b0Var2 = iVar.f9005p;
            if (b0Var2 != null) {
                b0Var2.c(false);
                iVar.f9005p.b();
                iVar.f9005p = null;
            }
            iVar.f9003n = null;
            iVar.f9004o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f7536i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
            e.f6183c = c6.z.f4070b;
            e.f6181a = 8403;
            e0Var.e(1, e.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = xa.c.o(e0Var.f6212f, e0Var.f3980k, "castDeviceControllerListenerKey").f6145c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f7536i = null;
        }
        cVar.f7538k = null;
        e6.h hVar2 = cVar.f7537j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f7537j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f7532m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f9466a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f7537j = hVar;
                    hVar.v(cVar.f7536i);
                    cVar.f7537j.p(new c0(cVar, 0));
                    cVar.f7537j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f7537j;
                    n6.l.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f7538k);
                    c6.d dVar = tVar.f9467b;
                    n6.l.h(dVar);
                    String str2 = tVar.f9468c;
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
                int i10 = status.f6022a;
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
