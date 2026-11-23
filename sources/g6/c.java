package g6;

import a8.r7;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.tasks.Task;
import f6.e0;
import java.lang.reflect.Field;
import java.util.HashSet;
public final class c extends f {
    public static final j6.b f13202m = new j6.b("CastSession", null);
    public final Context f13203c;
    public final HashSet d;
    public final q f13204e;
    public final b f13205f;
    public final com.google.android.gms.internal.cast.p f13206g;
    public final i6.i h;
    public e0 f13207i;
    public h6.h f13208j;
    public CastDevice f13209k;
    public l4 f13210l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, i6.i iVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f13203c = context.getApplicationContext();
        this.f13205f = bVar;
        this.f13206g = pVar;
        this.h = iVar;
        a7.a f10 = f();
        j jVar = new j(this);
        j6.b bVar2 = com.google.android.gms.internal.cast.d.f6503a;
        q qVar = null;
        if (f10 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).x1(bVar, f10, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.d.f6503a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.f13204e = qVar;
    }

    public static void g(c cVar, int i7) {
        i6.i iVar = cVar.h;
        if (iVar.f16253q) {
            iVar.f16253q = false;
            h6.h hVar = iVar.f16250n;
            if (hVar != null) {
                c0 c0Var = iVar.f16249m;
                q6.m.e("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar.f13920i.remove(c0Var);
                }
            }
            iVar.f16241c.m1(null);
            r7 r7Var = iVar.h;
            if (r7Var != null) {
                r7Var.N();
                r7Var.f619f = null;
            }
            r7 r7Var2 = iVar.f16245i;
            if (r7Var2 != null) {
                r7Var2.N();
                r7Var2.f619f = null;
            }
            android.support.v4.media.session.a0 a0Var = iVar.f16252p;
            if (a0Var != null) {
                a0Var.r(null, null);
                iVar.f16252p.s(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = iVar.f16252p;
            if (a0Var2 != null) {
                a0Var2.q(false);
                android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) iVar.f16252p.f1676b;
                MediaSession mediaSession = uVar.f1706a;
                uVar.f1709e.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e10) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                    }
                }
                mediaSession.setCallback(null);
                uVar.f1707b.f1705a.set(null);
                mediaSession.release();
                iVar.f16252p = null;
            }
            iVar.f16250n = null;
            iVar.f16251o = null;
            iVar.h();
            if (i7 == 0) {
                iVar.i();
            }
        }
        e0 e0Var = cVar.f13207i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
            b10.f6348c = f6.z.f11474b;
            b10.f6346a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.m mVar = d6.i.p(e0Var.f6384g, e0Var.f11375l, "castDeviceControllerListenerKey").f6331b;
            q6.m.i(mVar, "Key must not be null");
            e0Var.c(mVar, 8415);
            cVar.f13207i = null;
        }
        cVar.f13209k = null;
        h6.h hVar2 = cVar.f13208j;
        if (hVar2 != null) {
            hVar2.v(null);
            cVar.f13208j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        j6.b bVar = f13202m;
        q qVar = cVar.f13204e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                j6.v vVar = (j6.v) task.getResult();
                Status status = vVar.f17376a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    h6.h hVar = new h6.h(new j6.n());
                    cVar.f13208j = hVar;
                    hVar.v(cVar.f13207i);
                    cVar.f13208j.p(new c0(cVar, 0));
                    cVar.f13208j.u();
                    i6.i iVar = cVar.h;
                    h6.h hVar2 = cVar.f13208j;
                    q6.m.e("Must be called from the main thread.");
                    iVar.a(hVar2, cVar.f13209k);
                    f6.d dVar = vVar.f17377b;
                    q6.m.h(dVar);
                    String str2 = vVar.f17378c;
                    String str3 = vVar.d;
                    q6.m.h(str3);
                    boolean z10 = vVar.f17379e;
                    o oVar = (o) qVar;
                    Parcel p12 = oVar.p1();
                    com.google.android.gms.internal.cast.t.c(p12, dVar);
                    p12.writeString(str2);
                    p12.writeString(str3);
                    p12.writeInt(z10 ? 1 : 0);
                    oVar.t1(p12, 4);
                    return;
                }
                bVar.b("%s() -> failure result", str);
                int i7 = status.f6189a;
                o oVar2 = (o) qVar;
                Parcel p13 = oVar2.p1();
                p13.writeInt(i7);
                oVar2.t1(p13, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof com.google.android.gms.common.api.f) {
                int statusCode = ((com.google.android.gms.common.api.f) exception).getStatusCode();
                o oVar3 = (o) qVar;
                Parcel p14 = oVar3.p1();
                p14.writeInt(statusCode);
                oVar3.t1(p14, 5);
                return;
            }
            o oVar4 = (o) qVar;
            Parcel p15 = oVar4.p1();
            p15.writeInt(2476);
            oVar4.t1(p15, 5);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: g6.c.i(android.os.Bundle):void");
    }
}
