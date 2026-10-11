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
    public static final g6.b f8177m = new g6.b("CastSession", null);
    public final Context f8178c;
    public final HashSet d;
    public final q f8179e;
    public final b f8180f;
    public final com.google.android.gms.internal.cast.r f8181g;
    public final f6.i h;
    public e0 f8182i;
    public e6.h f8183j;
    public CastDevice f8184k;
    public o4 f8185l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f8178c = context.getApplicationContext();
        this.f8180f = bVar;
        this.f8181g = rVar;
        this.h = iVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f6861a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).V0(bVar, f7, jVar);
            } catch (RemoteException | d e7) {
                com.google.android.gms.internal.cast.e.f6861a.a(e7, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f8179e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.i iVar = cVar.h;
        if (iVar.f9794q) {
            iVar.f9794q = false;
            e6.h hVar = iVar.f9791n;
            if (hVar != null) {
                c0 c0Var = iVar.f9790m;
                n6.m.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f8676i.remove(c0Var);
                }
            }
            iVar.f9782c.K0(null);
            u5 u5Var = iVar.h;
            if (u5Var != null) {
                u5Var.D();
                u5Var.f6067e = null;
            }
            u5 u5Var2 = iVar.f9786i;
            if (u5Var2 != null) {
                u5Var2.D();
                u5Var2.f6067e = null;
            }
            android.support.v4.media.session.a0 a0Var = iVar.f9793p;
            if (a0Var != null) {
                a0Var.d(null, null);
                iVar.f9793p.e(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = iVar.f9793p;
            if (a0Var2 != null) {
                a0Var2.c(false);
                iVar.f9793p.b();
                iVar.f9793p = null;
            }
            iVar.f9791n = null;
            iVar.f9792o = null;
            iVar.h();
            if (i10 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f8182i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
            e7.f6695c = c6.z.f4445b;
            e7.f6693a = 8403;
            e0Var.e(1, e7.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a6.i.u(e0Var.f6727f, e0Var.f4346k, "castDeviceControllerListenerKey").f6654c;
            n6.m.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f8182i = null;
        }
        cVar.f8184k = null;
        e6.h hVar2 = cVar.f8183j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f8183j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f8177m;
        q qVar = cVar.f8179e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f10361a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f8183j = hVar;
                    hVar.v(cVar.f8182i);
                    cVar.f8183j.p(new c0(cVar, 0));
                    cVar.f8183j.u();
                    f6.i iVar = cVar.h;
                    e6.h hVar2 = cVar.f8183j;
                    n6.m.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f8184k);
                    c6.d dVar = tVar.f10362b;
                    n6.m.h(dVar);
                    String str2 = tVar.f10363c;
                    String str3 = tVar.d;
                    n6.m.h(str3);
                    boolean z10 = tVar.f10364e;
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
                int i10 = status.f6524a;
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
