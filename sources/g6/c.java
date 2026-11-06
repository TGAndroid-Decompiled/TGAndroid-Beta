package g6;

import a8.r7;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
public final class c extends f {
    public static final j6.b f13543m = new j6.b("CastSession", null);
    public final Context f13544c;
    public final HashSet d;
    public final q f13545e;
    public final b f13546f;
    public final com.google.android.gms.internal.cast.p f13547g;
    public final i6.h h;
    public f6.e0 f13548i;
    public h6.h f13549j;
    public CastDevice f13550k;
    public l4 f13551l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, i6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f13544c = context.getApplicationContext();
        this.f13546f = bVar;
        this.f13547g = pVar;
        this.h = hVar;
        a7.a f10 = f();
        j jVar = new j(this);
        j6.b bVar2 = com.google.android.gms.internal.cast.d.f6837a;
        q qVar = null;
        if (f10 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).X0(bVar, f10, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.d.f6837a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.f13545e = qVar;
    }

    public static void g(c cVar, int i7) {
        i6.h hVar = cVar.h;
        if (hVar.f15389q) {
            hVar.f15389q = false;
            h6.h hVar2 = hVar.f15386n;
            if (hVar2 != null) {
                c0 c0Var = hVar.f15385m;
                q6.m.d("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.f14253i.remove(c0Var);
                }
            }
            hVar.f15377c.M0(null);
            r7 r7Var = hVar.h;
            if (r7Var != null) {
                r7Var.J();
                r7Var.f617f = null;
            }
            r7 r7Var2 = hVar.f15381i;
            if (r7Var2 != null) {
                r7Var2.J();
                r7Var2.f617f = null;
            }
            android.support.v4.media.session.a0 a0Var = hVar.f15388p;
            if (a0Var != null) {
                a0Var.s(null, null);
                hVar.f15388p.t(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = hVar.f15388p;
            if (a0Var2 != null) {
                a0Var2.r(false);
                hVar.f15388p.q();
                hVar.f15388p = null;
            }
            hVar.f15386n = null;
            hVar.f15387o = null;
            hVar.h();
            if (i7 == 0) {
                hVar.i();
            }
        }
        f6.e0 e0Var = cVar.f13548i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
            b10.f6682c = f6.z.f11349b;
            b10.f6680a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.m mVar = cb.c.o(e0Var.f6720g, e0Var.f11250l, "castDeviceControllerListenerKey").f6671b;
            q6.m.h(mVar, "Key must not be null");
            e0Var.c(mVar, 8415);
            cVar.f13548i = null;
        }
        cVar.f13550k = null;
        h6.h hVar3 = cVar.f13549j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f13549j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        j6.b bVar = f13543m;
        q qVar = cVar.f13545e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                j6.t tVar = (j6.t) task.getResult();
                Status status = tVar.f16544a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    h6.h hVar = new h6.h(new j6.m());
                    cVar.f13549j = hVar;
                    hVar.v(cVar.f13548i);
                    cVar.f13549j.p(new c0(cVar, 0));
                    cVar.f13549j.u();
                    i6.h hVar2 = cVar.h;
                    h6.h hVar3 = cVar.f13549j;
                    q6.m.d("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f13550k);
                    f6.d dVar = tVar.f16545b;
                    q6.m.g(dVar);
                    String str2 = tVar.f16546c;
                    String str3 = tVar.d;
                    q6.m.g(str3);
                    boolean z9 = tVar.f16547e;
                    o oVar = (o) qVar;
                    Parcel P0 = oVar.P0();
                    com.google.android.gms.internal.cast.t.c(P0, dVar);
                    P0.writeString(str2);
                    P0.writeString(str3);
                    P0.writeInt(z9 ? 1 : 0);
                    oVar.T0(P0, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i7 = status.f6529a;
                o oVar2 = (o) qVar;
                Parcel P02 = oVar2.P0();
                P02.writeInt(i7);
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
        throw new UnsupportedOperationException("Method not decompiled: g6.c.i(android.os.Bundle):void");
    }
}
