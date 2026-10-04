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
    public static final g6.b f8128m = new g6.b("CastSession", null);
    public final Context f8129c;
    public final HashSet d;
    public final q f8130e;
    public final b f8131f;
    public final com.google.android.gms.internal.cast.r f8132g;
    public final f6.i h;
    public e0 f8133i;
    public e6.h f8134j;
    public CastDevice f8135k;
    public q4 f8136l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f8129c = context.getApplicationContext();
        this.f8131f = bVar;
        this.f8132g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f6803a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).W0(bVar, f7, jVar);
            } catch (RemoteException | d e7) {
                com.google.android.gms.internal.cast.e.f6803a.a(e7, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f8130e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f9783q) {
            iVar.f9783q = false;
            e6.h hVar = iVar.f9780n;
            if (hVar != null) {
                c0 c0Var = iVar.f9779m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f8682i.remove(c0Var);
                }
            }
            iVar.f9771c.L0(null);
            cf.c cVar2 = iVar.h;
            if (cVar2 != null) {
                cVar2.A();
                cVar2.f4605e = null;
            }
            cf.c cVar3 = iVar.f9775i;
            if (cVar3 != null) {
                cVar3.A();
                cVar3.f4605e = null;
            }
            android.support.v4.media.session.b0 b0Var = iVar.f9782p;
            if (b0Var != null) {
                b0Var.d(null, null);
                iVar.f9782p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.b0 b0Var2 = iVar.f9782p;
            if (b0Var2 != null) {
                b0Var2.c(false);
                iVar.f9782p.b();
                iVar.f9782p = null;
            }
            iVar.f9780n = null;
            iVar.f9781o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f8133i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
            e7.f6643c = c6.z.f4395b;
            e7.f6641a = 8403;
            e0Var.e(1, e7.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = xa.c.D(e0Var.f6675f, e0Var.f4296k, "castDeviceControllerListenerKey").f6602c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f8133i = null;
        }
        cVar.f8135k = null;
        e6.h hVar2 = cVar.f8134j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f8134j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f8128m;
        q qVar = cVar.f8130e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f10288a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f8134j = hVar;
                    hVar.v(cVar.f8133i);
                    cVar.f8134j.p(new c0(cVar, 0));
                    cVar.f8134j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f8134j;
                    n6.l.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f8135k);
                    c6.d dVar = tVar.f10289b;
                    n6.l.h(dVar);
                    String str2 = tVar.f10290c;
                    String str3 = tVar.d;
                    n6.l.h(str3);
                    boolean z10 = tVar.f10291e;
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
                int i10 = status.f6472a;
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
