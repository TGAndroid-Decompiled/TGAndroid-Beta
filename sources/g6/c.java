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
    public static final j6.b f12894m = new j6.b("CastSession", null);
    public final Context f12895c;
    public final HashSet d;
    public final q f12896e;
    public final b f12897f;
    public final com.google.android.gms.internal.cast.p f12898g;
    public final i6.h h;
    public e0 f12899i;
    public h6.h f12900j;
    public CastDevice f12901k;
    public l4 f12902l;

    public c(Context context, String str, String str2, b bVar, com.google.android.gms.internal.cast.p pVar, i6.h hVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.f12895c = context.getApplicationContext();
        this.f12897f = bVar;
        this.f12898g = pVar;
        this.h = hVar;
        a7.a f10 = f();
        j jVar = new j(this);
        j6.b bVar2 = com.google.android.gms.internal.cast.d.f6229a;
        q qVar = null;
        if (f10 != null) {
            try {
                qVar = com.google.android.gms.internal.cast.d.b(context).x1(bVar, f10, jVar);
            } catch (RemoteException | d e10) {
                com.google.android.gms.internal.cast.d.f6229a.a(e10, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.f.class.getSimpleName());
            }
        }
        this.f12896e = qVar;
    }

    public static void g(c cVar, int i7) {
        i6.h hVar = cVar.h;
        if (hVar.f15847q) {
            hVar.f15847q = false;
            h6.h hVar2 = hVar.f15844n;
            if (hVar2 != null) {
                c0 c0Var = hVar.f15843m;
                q6.m.d("Must be called from the main thread.");
                if (c0Var != null) {
                    hVar2.f13613i.remove(c0Var);
                }
            }
            hVar.f15835c.m1(null);
            r7 r7Var = hVar.h;
            if (r7Var != null) {
                r7Var.N();
                r7Var.f620f = null;
            }
            r7 r7Var2 = hVar.f15839i;
            if (r7Var2 != null) {
                r7Var2.N();
                r7Var2.f620f = null;
            }
            android.support.v4.media.session.a0 a0Var = hVar.f15846p;
            if (a0Var != null) {
                a0Var.r(null, null);
                hVar.f15846p.s(new MediaMetadataCompat(new Bundle()));
                hVar.j(0, null);
            }
            android.support.v4.media.session.a0 a0Var2 = hVar.f15846p;
            if (a0Var2 != null) {
                a0Var2.q(false);
                android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) hVar.f15846p.f1713b;
                MediaSession mediaSession = uVar.f1743a;
                uVar.f1746e.kill();
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
                uVar.f1744b.f1742a.set(null);
                mediaSession.release();
                hVar.f15846p = null;
            }
            hVar.f15844n = null;
            hVar.f15845o = null;
            hVar.h();
            if (i7 == 0) {
                hVar.i();
            }
        }
        e0 e0Var = cVar.f12899i;
        if (e0Var != null) {
            com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
            b10.f6074c = f6.z.f11163b;
            b10.f6072a = 8403;
            e0Var.e(1, b10.a());
            e0Var.h();
            com.google.android.gms.common.api.internal.m mVar = cb.c.h(e0Var.f6110g, e0Var.f11064l, "castDeviceControllerListenerKey").f6055b;
            q6.m.h(mVar, "Key must not be null");
            e0Var.c(mVar, 8415);
            cVar.f12899i = null;
        }
        cVar.f12901k = null;
        h6.h hVar3 = cVar.f12900j;
        if (hVar3 != null) {
            hVar3.v(null);
            cVar.f12900j = null;
        }
    }

    public static void h(c cVar, String str, Task task) {
        j6.b bVar = f12894m;
        q qVar = cVar.f12896e;
        if (qVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                j6.u uVar = (j6.u) task.getResult();
                Status status = uVar.f16900a;
                if (status.b()) {
                    bVar.b("%s() -> success result", str);
                    h6.h hVar = new h6.h(new j6.m());
                    cVar.f12900j = hVar;
                    hVar.v(cVar.f12899i);
                    cVar.f12900j.p(new c0(cVar, 0));
                    cVar.f12900j.u();
                    i6.h hVar2 = cVar.h;
                    h6.h hVar3 = cVar.f12900j;
                    q6.m.d("Must be called from the main thread.");
                    hVar2.a(hVar3, cVar.f12901k);
                    f6.d dVar = uVar.f16901b;
                    q6.m.g(dVar);
                    String str2 = uVar.f16902c;
                    String str3 = uVar.d;
                    q6.m.g(str3);
                    boolean z10 = uVar.f16903e;
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
                int i7 = status.f5914a;
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
