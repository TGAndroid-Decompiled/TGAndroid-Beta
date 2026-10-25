package e6;

import a8.me;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.tasks.Task;
import d6.e0;
import java.util.HashSet;
public final class c extends f {
    public static final h6.b f9803m = new h6.b("CastSession", null);
    public final Context f9804c;
    public final HashSet d;
    public final q e;
    public final b f9805f;
    public final com.google.android.gms.internal.cast.p f9806g;
    public final g6.h h;
    public e0 f9807i;
    public f6.h f9808j;
    public CastDevice f9809k;
    public l4 f9810l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, g6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f9804c = context.getApplicationContext();
        this.f9805f = bVar;
        this.f9806g = pVar;
        this.h = hVar;
        y6.a f7 = f();
        j jVar = new j(this);
        h6.b bVar2 = com.google.android.gms.internal.cast.d.f6761a;
        q qVar = null;
        if (f7 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).V0(bVar, f7, jVar);
            } catch (RemoteException | d e) {
                com.google.android.gms.internal.cast.d.f6761a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.e = qVar;
    }

    public static void g(c cVar, int i10) {
        g6.h hVar = cVar.h;
        if (hVar.f12390q) {
            hVar.f12390q = false;
            f6.h hVar2 = hVar.f12387n;
            if (hVar2 != null) {
                c0 c0Var = hVar.f12386m;
                o6.l.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.f10219i.remove(c0Var);
                }
            }
            hVar.f12379c.K0(null);
            me meVar = hVar.h;
            if (meVar != null) {
                meVar.C();
                meVar.e = null;
            }
            me meVar2 = hVar.f12382i;
            if (meVar2 != null) {
                meVar2.C();
                meVar2.e = null;
            }
            android.support.v4.media.session.b0 b0Var = hVar.f12389p;
            if (b0Var != null) {
                b0Var.d(null, null);
                hVar.f12389p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.b0 b0Var2 = hVar.f12389p;
            if (b0Var2 != null) {
                b0Var2.c(false);
                hVar.f12389p.b();
                hVar.f12389p = null;
            }
            hVar.f12387n = null;
            hVar.f12388o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        e0 e0Var = cVar.f9807i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
            b10.f6622c = d6.z.f8154b;
            b10.f6620a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.n nVar = za.c.l(e0Var.f6655f, e0Var.f8064k, "castDeviceControllerListenerKey").f6599c;
            o6.l.i(nVar, "Key must not be null");
            e0Var.c(nVar, 8415);
            cVar.f9807i = null;
        }
        cVar.f9809k = null;
        f6.h hVar3 = cVar.f9808j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f9808j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        h6.b bVar = f9803m;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                h6.t tVar = (h6.t) task.getResult();
                Status status = tVar.f12657a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    f6.h hVar = new f6.h(new h6.m());
                    cVar.f9808j = hVar;
                    hVar.v(cVar.f9807i);
                    cVar.f9808j.p(new c0(cVar, 0));
                    cVar.f9808j.u();
                    g6.h hVar2 = cVar.h;
                    f6.h hVar3 = cVar.f9808j;
                    o6.l.e("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f9809k);
                    d6.d dVar = tVar.f12658b;
                    o6.l.h(dVar);
                    String str2 = tVar.f12659c;
                    String str3 = tVar.d;
                    o6.l.h(str3);
                    boolean z10 = tVar.e;
                    o oVar = (o) qVar;
                    Parcel N0 = oVar.N0();
                    com.google.android.gms.internal.cast.t.c(N0, dVar);
                    N0.writeString(str2);
                    N0.writeString(str3);
                    N0.writeInt(z10 ? 1 : 0);
                    oVar.R0(N0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i10 = status.f6466a;
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
        throw new UnsupportedOperationException("Method not decompiled: e6.c.i(android.os.Bundle):void");
    }
}
