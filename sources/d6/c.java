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
    public static final g6.b f8129m = new g6.b("CastSession", null);
    public final Context f8130c;
    public final HashSet d;
    public final q f8131e;
    public final b f8132f;
    public final com.google.android.gms.internal.cast.r f8133g;
    public final f6.i h;
    public e0 f8134i;
    public e6.h f8135j;
    public CastDevice f8136k;
    public q4 f8137l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f8130c = context.getApplicationContext();
        this.f8132f = bVar;
        this.f8133g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f6804a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).W0(bVar, f7, jVar);
            } catch (RemoteException | d e7) {
                com.google.android.gms.internal.cast.e.f6804a.a(e7, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f8131e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f9784q) {
            iVar.f9784q = false;
            e6.h hVar = iVar.f9781n;
            if (hVar != null) {
                c0 c0Var = iVar.f9780m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f8683i.remove(c0Var);
                }
            }
            iVar.f9772c.L0(null);
            cf.c cVar2 = iVar.h;
            if (cVar2 != null) {
                cVar2.A();
                cVar2.f4606e = null;
            }
            cf.c cVar3 = iVar.f9776i;
            if (cVar3 != null) {
                cVar3.A();
                cVar3.f4606e = null;
            }
            android.support.v4.media.session.b0 b0Var = iVar.f9783p;
            if (b0Var != null) {
                b0Var.d(null, null);
                iVar.f9783p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.b0 b0Var2 = iVar.f9783p;
            if (b0Var2 != null) {
                b0Var2.c(false);
                iVar.f9783p.b();
                iVar.f9783p = null;
            }
            iVar.f9781n = null;
            iVar.f9782o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f8134i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
            e7.f6644c = c6.z.f4396b;
            e7.f6642a = 8403;
            e0Var.e(1, e7.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = xa.c.D(e0Var.f6676f, e0Var.f4297k, "castDeviceControllerListenerKey").f6603c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f8134i = null;
        }
        cVar.f8136k = null;
        e6.h hVar2 = cVar.f8135j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f8135j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f8129m;
        q qVar = cVar.f8131e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f10289a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f8135j = hVar;
                    hVar.v(cVar.f8134i);
                    cVar.f8135j.p(new c0(cVar, 0));
                    cVar.f8135j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f8135j;
                    n6.l.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f8136k);
                    c6.d dVar = tVar.f10290b;
                    n6.l.h(dVar);
                    String str2 = tVar.f10291c;
                    String str3 = tVar.d;
                    n6.l.h(str3);
                    boolean z10 = tVar.f10292e;
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
                int i10 = status.f6473a;
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
        } catch (RemoteException e7) {
            bVar.a(e7, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: d6.c.i(android.os.Bundle):void");
    }
}
