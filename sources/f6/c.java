package f6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import b8.ke;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final i6.b f11467m = new i6.b("CastSession", null);
    public final Context f11468c;
    public final HashSet d;
    public final q f11469e;
    public final b f11470f;
    public final com.google.android.gms.internal.cast.q f11471g;
    public final h6.h h;
    public e6.e0 f11472i;
    public g6.h f11473j;
    public CastDevice f11474k;
    public m4 f11475l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.q qVar, h6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f11468c = context.getApplicationContext();
        this.f11470f = bVar;
        this.f11471g = qVar;
        this.h = hVar;
        z6.a f10 = f();
        j jVar = new j(this);
        i6.b bVar2 = com.google.android.gms.internal.cast.d.f6891a;
        q qVar2 = null;
        if (f10 != null) {
            try {
                qVar2 = com.google.android.gms.internal.cast.d.b(context).X0(bVar, f10, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.d.f6891a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.f11469e = qVar2;
    }

    public static void g(c cVar, int i3) {
        h6.h hVar = cVar.h;
        if (hVar.f14346q) {
            hVar.f14346q = false;
            g6.h hVar2 = hVar.f14343n;
            if (hVar2 != null) {
                d0 d0Var = hVar.f14342m;
                p6.m.d("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.f12013i.remove(d0Var);
                }
            }
            hVar.f14334c.M0(null);
            ke keVar = hVar.h;
            if (keVar != null) {
                keVar.N();
                keVar.f2719f = null;
            }
            ke keVar2 = hVar.f14338i;
            if (keVar2 != null) {
                keVar2.N();
                keVar2.f2719f = null;
            }
            android.support.v4.media.session.a0 a0Var = hVar.f14345p;
            if (a0Var != null) {
                a0Var.r(null, null);
                hVar.f14345p.s(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = hVar.f14345p;
            if (a0Var2 != null) {
                a0Var2.q(false);
                hVar.f14345p.o();
                hVar.f14345p = null;
            }
            hVar.f14343n = null;
            hVar.f14344o = null;
            hVar.h();
            if (i3 == 0) {
                hVar.i();
            }
        }
        e6.e0 e0Var = cVar.f11472i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
            b10.f6737c = e6.z.f9792b;
            b10.f6735a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.m mVar = c6.i.x(e0Var.f6777g, e0Var.f9693l, "castDeviceControllerListenerKey").f6726b;
            p6.m.h(mVar, "Key must not be null");
            e0Var.c(mVar, 8415);
            cVar.f11472i = null;
        }
        cVar.f11474k = null;
        g6.h hVar3 = cVar.f11473j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f11473j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        i6.b bVar = f11467m;
        q qVar = cVar.f11469e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                i6.t tVar = (i6.t) task.getResult();
                Status status = tVar.f14659a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    g6.h hVar = new g6.h(new i6.m());
                    cVar.f11473j = hVar;
                    hVar.v(cVar.f11472i);
                    cVar.f11473j.p(new d0(cVar, 0));
                    cVar.f11473j.u();
                    h6.h hVar2 = cVar.h;
                    g6.h hVar3 = cVar.f11473j;
                    p6.m.d("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f11474k);
                    e6.d dVar = tVar.f14660b;
                    p6.m.g(dVar);
                    String str2 = tVar.f14661c;
                    String str3 = tVar.d;
                    p6.m.g(str3);
                    boolean z10 = tVar.f14662e;
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
                int i3 = status.f6581a;
                o oVar2 = (o) qVar;
                Parcel P02 = oVar2.P0();
                P02.writeInt(i3);
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
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: f6.c.i(android.os.Bundle):void");
    }
}
