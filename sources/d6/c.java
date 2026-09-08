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
    public static final g6.b f6625m = new g6.b("CastSession", null);
    public final Context f6626c;
    public final HashSet d;
    public final q f6627e;
    public final b f6628f;
    public final com.google.android.gms.internal.cast.r f6629g;
    public final f6.i h;
    public e0 f6630i;
    public e6.h f6631j;
    public CastDevice f6632k;
    public q4 f6633l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f6626c = context.getApplicationContext();
        this.f6628f = bVar;
        this.f6629g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f5304a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).W0(bVar, f7, jVar);
            } catch (RemoteException | d e7) {
                com.google.android.gms.internal.cast.e.f5304a.a(e7, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f6627e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f9435q) {
            iVar.f9435q = false;
            e6.h hVar = iVar.f9432n;
            if (hVar != null) {
                c0 c0Var = iVar.f9431m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f8910i.remove(c0Var);
                }
            }
            iVar.f9423c.L0(null);
            cf.c cVar2 = iVar.h;
            if (cVar2 != null) {
                cVar2.x();
                cVar2.f4826e = null;
            }
            cf.c cVar3 = iVar.f9427i;
            if (cVar3 != null) {
                cVar3.x();
                cVar3.f4826e = null;
            }
            android.support.v4.media.session.c0 c0Var2 = iVar.f9434p;
            if (c0Var2 != null) {
                c0Var2.d(null, null);
                iVar.f9434p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.c0 c0Var3 = iVar.f9434p;
            if (c0Var3 != null) {
                c0Var3.c(false);
                iVar.f9434p.b();
                iVar.f9434p = null;
            }
            iVar.f9432n = null;
            iVar.f9433o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f6630i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
            e7.f5144c = c6.z.f4616b;
            e7.f5142a = 8403;
            e0Var.e(1, e7.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a6.m.U(e0Var.f5176f, e0Var.f4517k, "castDeviceControllerListenerKey").f5103c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f6630i = null;
        }
        cVar.f6632k = null;
        e6.h hVar2 = cVar.f6631j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f6631j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f6625m;
        q qVar = cVar.f6627e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f10453a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f6631j = hVar;
                    hVar.v(cVar.f6630i);
                    cVar.f6631j.p(new c0(cVar, 0));
                    cVar.f6631j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f6631j;
                    n6.l.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f6632k);
                    c6.d dVar = tVar.f10454b;
                    n6.l.h(dVar);
                    String str2 = tVar.f10455c;
                    String str3 = tVar.d;
                    n6.l.h(str3);
                    boolean z10 = tVar.f10456e;
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
                int i10 = status.f4973a;
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
