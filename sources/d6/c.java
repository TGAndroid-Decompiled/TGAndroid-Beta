package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final g6.b f7850m = new g6.b("CastSession", null);
    public final Context f7851c;
    public final HashSet d;
    public final q e;
    public final b f7852f;
    public final com.google.android.gms.internal.cast.r f7853g;
    public final f6.h h;
    public e0 f7854i;
    public e6.h f7855j;
    public CastDevice f7856k;
    public o4 f7857l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.r rVar, f6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f7851c = context.getApplicationContext();
        this.f7852f = bVar;
        this.f7853g = rVar;
        this.h = hVar;
        x6.a f7 = f();
        j jVar = new j(this);
        g6.b bVar2 = com.google.android.gms.internal.cast.e.f6659a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.e.b(context).V0(bVar, f7, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.e.f6659a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        f6.h hVar = cVar.h;
        if (hVar.f10499q) {
            hVar.f10499q = false;
            e6.h hVar2 = hVar.f10496n;
            if (hVar2 != null) {
                c0 c0Var = hVar.f10495m;
                n6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.f8375i.remove(c0Var);
                }
            }
            hVar.f10488c.K0(null);
            z5 z5Var = hVar.h;
            if (z5Var != null) {
                z5Var.C();
                z5Var.e = null;
            }
            z5 z5Var2 = hVar.f10491i;
            if (z5Var2 != null) {
                z5Var2.C();
                z5Var2.e = null;
            }
            android.support.v4.media.session.b0 b0Var = hVar.f10498p;
            if (b0Var != null) {
                b0Var.d(null, null);
                hVar.f10498p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.b0 b0Var2 = hVar.f10498p;
            if (b0Var2 != null) {
                b0Var2.c(false);
                hVar.f10498p.b();
                hVar.f10498p = null;
            }
            hVar.f10496n = null;
            hVar.f10497o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        e0 e0Var = cVar.f7854i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
            b10.f6498c = c6.z.f4929b;
            b10.f6496a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a6.m.d(e0Var.f6531f, e0Var.f4839k, "castDeviceControllerListenerKey").f6478c;
            n6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f7854i = null;
        }
        cVar.f7856k = null;
        e6.h hVar3 = cVar.f7855j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f7855j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        g6.b bVar = f7850m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                g6.t tVar = (g6.t) task.getResult();
                Status status = tVar.f10879a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    e6.h hVar = new e6.h(new g6.m());
                    cVar.f7855j = hVar;
                    hVar.v(cVar.f7854i);
                    cVar.f7855j.p(new c0(cVar, 0));
                    cVar.f7855j.u();
                    f6.h hVar2 = cVar.h;
                    e6.h hVar3 = cVar.f7855j;
                    n6.l.e("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f7856k);
                    c6.d dVar = tVar.f10880b;
                    n6.l.h(dVar);
                    String str2 = tVar.f10881c;
                    String str3 = tVar.d;
                    n6.l.h(str3);
                    boolean z10 = tVar.e;
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
                int i10 = status.f6345a;
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
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: d6.c.i(android.os.Bundle):void");
    }
}
