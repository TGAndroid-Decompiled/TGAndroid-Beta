package n5;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import m5.f0;

public final class c extends g {

    public static final r5.b f18302m = new r5.b("CastSession", null);

    public final Context f18303c;
    public final HashSet d;

    public final r f18304e;

    public final b f18305f;

    public final com.google.android.gms.internal.cast.p f18306g;
    public final p5.h h;

    public f0 f18307i;

    public o5.h f18308j;

    public CastDevice f18309k;

    public m4 f18310l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, p5.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f18303c = context.getApplicationContext();
        this.f18305f = bVar;
        this.f18306g = pVar;
        this.h = hVar;
        i6.a aVarF = f();
        k kVar = new k(this);
        r5.b bVar2 = com.google.android.gms.internal.cast.e.f3517a;
        r rVarU0 = null;
        if (aVarF != null) {
            try {
                rVarU0 = com.google.android.gms.internal.cast.e.b(context).U0(bVar, aVarF, kVar);
            } catch (RemoteException | d e9) {
                com.google.android.gms.internal.cast.e.f3517a.a(e9, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.f18304e = rVarU0;
    }

    public static void g(c cVar, int i10) {
        p5.h hVar = cVar.h;
        if (hVar.f45502q) {
            hVar.f45502q = false;
            o5.h hVar2 = hVar.f45499n;
            if (hVar2 != null) {
                d0 d0Var = hVar.f45498m;
                y5.l.e("Must be called from the main thread.");
                if (d0Var != null) {
                    hVar2.f19337i.remove(d0Var);
                }
            }
            hVar.f45490c.J0(null);
            af.h hVar3 = hVar.h;
            if (hVar3 != null) {
                hVar3.D();
                hVar3.f277e = null;
            }
            af.h hVar4 = hVar.f45494i;
            if (hVar4 != null) {
                hVar4.D();
                hVar4.f277e = null;
            }
            android.support.v4.media.session.d0 d0Var2 = hVar.f45501p;
            if (d0Var2 != null) {
                d0Var2.d(null, null);
                hVar.f45501p.e(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.d0 d0Var3 = hVar.f45501p;
            if (d0Var3 != null) {
                d0Var3.c(false);
                hVar.f45501p.b();
                hVar.f45501p = null;
            }
            hVar.f45499n = null;
            hVar.f45500o = null;
            hVar.h();
            if (i10 == 0) {
                hVar.i();
            }
        }
        f0 f0Var = cVar.f18307i;
        if (f0Var != null) {
            com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
            vVarB.f3359c = m5.a0.f17737b;
            vVarB.f3357a = 8403;
            f0Var.e(1, vVarB.b());
            f0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a9.i.N(f0Var.f3391f, f0Var.f17770k, "castDeviceControllerListenerKey").f3318c;
            y5.l.i(nVar, "Key must not be null");
            f0Var.c(nVar, 8415);
            cVar.f18307i = null;
        }
        cVar.f18309k = null;
        o5.h hVar5 = cVar.f18308j;
        if (hVar5 != null) {
            hVar5.v(null);
            cVar.f18308j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        r5.b bVar = f18302m;
        r rVar = cVar.f18304e;
        if (rVar == null) {
            return;
        }
        int i10 = 0;
        try {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (!(exception instanceof com.google.android.gms.common.api.f)) {
                    p pVar = (p) rVar;
                    Parcel parcelM0 = pVar.M0();
                    parcelM0.writeInt(2476);
                    pVar.Q0(parcelM0, 5);
                    return;
                }
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                p pVar2 = (p) rVar;
                Parcel parcelM1 = pVar2.M0();
                parcelM1.writeInt(statusCode);
                pVar2.Q0(parcelM1, 5);
                return;
            }
            r5.u uVar = (r5.u) task.getResult();
            Status status = uVar.f46810a;
            if (!status.b()) {
                bVar.b("%s() -> failure result", str);
                int i11 = status.f3186a;
                p pVar3 = (p) rVar;
                Parcel parcelM2 = pVar3.M0();
                parcelM2.writeInt(i11);
                pVar3.Q0(parcelM2, 5);
                return;
            }
            bVar.b("%s() -> success result", str);
            o5.h hVar = new o5.h(new r5.n());
            cVar.f18308j = hVar;
            hVar.v(cVar.f18307i);
            cVar.f18308j.p(new d0(cVar, i10));
            cVar.f18308j.u();
            p5.h hVar2 = cVar.h;
            o5.h hVar3 = cVar.f18308j;
            y5.l.e("Must be called from the main thread.");
            hVar2.a(hVar3, cVar.f18309k);
            m5.d dVar = uVar.f46811b;
            y5.l.h(dVar);
            String str2 = uVar.f46812c;
            String str3 = uVar.d;
            y5.l.h(str3);
            boolean z10 = uVar.f46813e;
            p pVar4 = (p) rVar;
            Parcel parcelM3 = pVar4.M0();
            com.google.android.gms.internal.cast.t.c(parcelM3, dVar);
            parcelM3.writeString(str2);
            parcelM3.writeString(str3);
            parcelM3.writeInt(z10 ? 1 : 0);
            pVar4.Q0(parcelM3, 4);
        } catch (RemoteException e9) {
            bVar.a(e9, "Unable to call %s on %s.", "methods", r.class.getSimpleName());
        }
    }

    public final void i(Bundle bundle) {
        boolean z10;
        r5.b bVar = g.f18316b;
        y yVar = this.f18317a;
        CastDevice castDeviceB = CastDevice.b(bundle);
        this.f18309k = castDeviceB;
        if (castDeviceB == null) {
            y5.l.e("Must be called from the main thread.");
            if (yVar != null) {
                try {
                    w wVar = (w) yVar;
                    Parcel parcelO0 = wVar.O0(wVar.M0(), 9);
                    int i10 = com.google.android.gms.internal.cast.t.f3660a;
                    z10 = parcelO0.readInt() != 0;
                    parcelO0.recycle();
                } catch (RemoteException e9) {
                    bVar.a(e9, "Unable to call %s on %s.", "isResuming", y.class.getSimpleName());
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                if (yVar == null) {
                    return;
                }
                try {
                    w wVar2 = (w) yVar;
                    Parcel parcelM0 = wVar2.M0();
                    parcelM0.writeInt(2153);
                    wVar2.Q0(parcelM0, 15);
                    return;
                } catch (RemoteException e10) {
                    bVar.a(e10, "Unable to call %s on %s.", "notifyFailedToResumeSession", y.class.getSimpleName());
                    return;
                }
            }
            if (yVar == null) {
                return;
            }
            try {
                w wVar3 = (w) yVar;
                Parcel parcelM1 = wVar3.M0();
                parcelM1.writeInt(2151);
                wVar3.Q0(parcelM1, 12);
                return;
            } catch (RemoteException e11) {
                bVar.a(e11, "Unable to call %s on %s.", "notifyFailedToStartSession", y.class.getSimpleName());
                return;
            }
        }
        f0 f0Var = this.f18307i;
        if (f0Var != null) {
            com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
            vVarB.f3359c = m5.a0.f17737b;
            vVarB.f3357a = 8403;
            f0Var.e(1, vVarB.b());
            f0Var.h();
            com.google.android.gms.common.api.internal.n nVar = a9.i.N(f0Var.f3391f, f0Var.f17770k, "castDeviceControllerListenerKey").f3318c;
            y5.l.i(nVar, "Key must not be null");
            f0Var.c(nVar, 8415);
            this.f18307i = null;
        }
        f18302m.b("Acquiring a connection to Google Play Services for %s", this.f18309k);
        CastDevice castDevice = this.f18309k;
        y5.l.h(castDevice);
        Bundle bundle2 = new Bundle();
        b bVar2 = this.f18305f;
        o5.a aVar = bVar2 == null ? null : bVar2.f18294f;
        o5.f fVar = aVar != null ? aVar.d : null;
        boolean z11 = aVar != null && aVar.f19300e;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z11);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.f18306g.f3614i);
        j9.a aVar2 = new j9.a(castDevice, new e0(this));
        aVar2.d = bundle2;
        m5.e eVar = new m5.e(aVar2);
        Context context = this.f18303c;
        int i11 = m5.g.f17785a;
        f0 f0Var2 = new f0(context, eVar);
        f0Var2.E.add(new j(this));
        this.f18307i = f0Var2;
        com.google.android.gms.common.api.internal.p pVarN = a9.i.N(f0Var2.f3391f, f0Var2.f17770k, "castDeviceControllerListenerKey");
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r();
        rVar.f3339b = true;
        ae.b bVar3 = new ae.b(f0Var2, 28);
        m5.a0 a0Var = m5.a0.f17738c;
        rVar.f3341e = pVarN;
        rVar.f3340c = bVar3;
        rVar.d = a0Var;
        rVar.f3342f = new v5.c[]{m5.z.f17867a};
        rVar.f3338a = 8428;
        f0Var2.b(rVar.a());
    }
}
