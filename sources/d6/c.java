package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import c6.e0;
import ci.u5;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final g6.b f8175m = new g6.b("CastSession", null);
    public final Context f8176c;
    public final HashSet d;
    public final q f8177e;
    public final b f8178f;
    public final com.google.android.gms.internal.cast.r f8179g;
    public final f6.i h;
    public e0 f8180i;
    public e6.h f8181j;
    public CastDevice f8182k;
    public o4 f8183l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f8176c = context.getApplicationContext();
        this.f8178f = bVar;
        this.f8179g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f6860a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).V0(bVar, f7, jVar);
            } catch (RemoteException | d e7) {
                com.google.android.gms.internal.cast.e.f6860a.a(e7, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f8177e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f9792q) {
            iVar.f9792q = false;
            e6.h hVar = iVar.f9789n;
            if (hVar != null) {
                c0 c0Var = iVar.f9788m;
                n6.m.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f8674i.remove(c0Var);
                }
            }
            iVar.f9780c.K0(null);
            u5 u5Var = iVar.h;
            if (u5Var != null) {
                u5Var.D();
                u5Var.f6066e = null;
            }
            u5 u5Var2 = iVar.f9784i;
            if (u5Var2 != null) {
                u5Var2.D();
                u5Var2.f6066e = null;
            }
            android.support.v4.media.session.a0 a0Var = iVar.f9791p;
            if (a0Var != null) {
                a0Var.d(null, null);
                iVar.f9791p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = iVar.f9791p;
            if (a0Var2 != null) {
                a0Var2.c(false);
                iVar.f9791p.b();
                iVar.f9791p = null;
            }
            iVar.f9789n = null;
            iVar.f9790o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f8180i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
            e7.f6694c = c6.z.f4444b;
            e7.f6692a = 8403;
            e0Var.e(1, e7.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a6.i.s(e0Var.f6726f, e0Var.f4345k, "castDeviceControllerListenerKey").f6653c;
            n6.m.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f8180i = null;
        }
        cVar.f8182k = null;
        e6.h hVar2 = cVar.f8181j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f8181j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f8175m;
        q qVar = cVar.f8177e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f10360a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f8181j = hVar;
                    hVar.v(cVar.f8180i);
                    cVar.f8181j.p(new c0(cVar, 0));
                    cVar.f8181j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f8181j;
                    n6.m.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f8182k);
                    c6.d dVar = tVar.f10361b;
                    n6.m.h(dVar);
                    String str2 = tVar.f10362c;
                    String str3 = tVar.d;
                    n6.m.h(str3);
                    boolean z10 = tVar.f10363e;
                    o oVar = (o) qVar;
                    Parcel N0 = oVar.N0();
                    com.google.android.gms.internal.cast.v.c(N0, dVar);
                    N0.writeString(str2);
                    N0.writeString(str3);
                    N0.writeInt(z10 ? 1 : 0);
                    oVar.R0(N0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i10 = status.f6523a;
                o oVar2 = (o) qVar;
                Parcel N02 = oVar2.N0();
                N02.writeInt(i10);
                oVar2.R0(N02, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof com.google.android.gms.common.api.f) {
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar3 = (o) qVar;
                Parcel N03 = oVar3.N0();
                N03.writeInt(statusCode);
                oVar3.R0(N03, 5);
                return;
            }
            o oVar4 = (o) qVar;
            Parcel N04 = oVar4.N0();
            N04.writeInt(2476);
            oVar4.R0(N04, 5);
        } catch (RemoteException e7) {
            bVar.a(e7, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: d6.c.i(android.os.Bundle):void");
    }
}
