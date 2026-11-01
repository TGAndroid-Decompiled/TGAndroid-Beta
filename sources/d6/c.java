package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final g6.b f5763m = new g6.b("CastSession", null);
    public final Context f5764c;
    public final HashSet d;
    public final q e;
    public final b f5765f;
    public final com.google.android.gms.internal.cast.q f5766g;
    public final f6.i h;
    public e0 f5767i;
    public e6.h f5768j;
    public CastDevice f5769k;
    public m4 f5770l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.q qVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f5764c = context.getApplicationContext();
        this.f5765f = bVar;
        this.f5766g = qVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.d.f4635a;
        q qVar2 = null;
        if (f7 != null) {
            try {
                qVar2 = com.google.android.gms.internal.cast.d.b(context).X0(bVar, f7, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.d.f4635a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.e = qVar2;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f6956q) {
            iVar.f6956q = false;
            e6.h hVar = iVar.f6953n;
            if (hVar != null) {
                c0 c0Var = iVar.f6952m;
                n6.l.d("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f6290i.remove(c0Var);
                }
            }
            iVar.f6945c.M0(null);
            bh.d dVar = iVar.h;
            if (dVar != null) {
                dVar.N();
                dVar.e = null;
            }
            bh.d dVar2 = iVar.f6948i;
            if (dVar2 != null) {
                dVar2.N();
                dVar2.e = null;
            }
            android.support.v4.media.session.a0 a0Var = iVar.f6955p;
            if (a0Var != null) {
                a0Var.z(null, null);
                iVar.f6955p.B(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = iVar.f6955p;
            if (a0Var2 != null) {
                a0Var2.x(false);
                iVar.f6955p.u();
                iVar.f6955p = null;
            }
            iVar.f6953n = null;
            iVar.f6954o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f5767i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.f4496c = c6.z.f3958b;
            b10.f4494a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = za.c.k(e0Var.f4524f, e0Var.f3867k, "castDeviceControllerListenerKey").f4459c;
            n6.l.h(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f5767i = null;
        }
        cVar.f5769k = null;
        e6.h hVar2 = cVar.f5768j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f5768j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f5763m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f7404a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f5768j = hVar;
                    hVar.v(cVar.f5767i);
                    cVar.f5768j.p(new c0(cVar, 0));
                    cVar.f5768j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f5768j;
                    n6.l.d("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f5769k);
                    c6.d dVar = tVar.f7405b;
                    n6.l.g(dVar);
                    String str2 = tVar.f7406c;
                    String str3 = tVar.d;
                    n6.l.g(str3);
                    boolean z10 = tVar.e;
                    o oVar = (o) qVar;
                    Parcel P0 = oVar.P0();
                    com.google.android.gms.internal.cast.u.c(P0, dVar);
                    P0.writeString(str2);
                    P0.writeString(str3);
                    P0.writeInt(z10 ? 1 : 0);
                    oVar.T0(P0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i10 = status.f4334a;
                o oVar2 = (o) qVar;
                Parcel P02 = oVar2.P0();
                P02.writeInt(i10);
                oVar2.T0(P02, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof com.google.android.gms.common.api.f) {
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar3 = (o) qVar;
                Parcel P03 = oVar3.P0();
                P03.writeInt(statusCode);
                oVar3.T0(P03, 5);
                return;
            }
            o oVar4 = (o) qVar;
            Parcel P04 = oVar4.P0();
            P04.writeInt(2476);
            oVar4.T0(P04, 5);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r12) {
        throw new UnsupportedOperationException("Method not decompiled: d6.c.i(android.os.Bundle):void");
    }
}
