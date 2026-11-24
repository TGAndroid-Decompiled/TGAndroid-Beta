package defpackage;

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
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Field;
import java.util.HashSet;
public final class ed1 extends d5a {
    public static final dc6 m = new dc6("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final f8d e;
    public final dd1 f;
    public final ocd g;
    public final kgf h;
    public afd i;
    public i69 j;
    public CastDevice k;
    public e6e l;

    public ed1(Context context, String str, String str2, dd1 dd1Var, ocd ocdVar, kgf kgfVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = dd1Var;
        this.g = ocdVar;
        this.h = kgfVar;
        yi5 f = f();
        r5d r5dVar = new r5d(this);
        dc6 dc6Var = t6d.a;
        f8d f8dVar = null;
        if (f != null) {
            try {
                f8dVar = t6d.b(context).Z(dd1Var, f, r5dVar);
            } catch (RemoteException | qe7 e) {
                t6d.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", o7d.class.getSimpleName());
            }
        }
        this.e = f8dVar;
    }

    public static void g(ed1 ed1Var, int i) {
        kgf kgfVar = ed1Var.h;
        if (kgfVar.q) {
            kgfVar.q = false;
            i69 i69Var = kgfVar.n;
            if (i69Var != null) {
                cbf cbfVar = kgfVar.m;
                fre.e("Must be called from the main thread.");
                if (cbfVar != null) {
                    i69Var.i.remove(cbfVar);
                }
            }
            kgfVar.c.T(null);
            gl2 gl2Var = kgfVar.h;
            if (gl2Var != null) {
                gl2Var.R();
                gl2Var.f = null;
            }
            gl2 gl2Var2 = kgfVar.i;
            if (gl2Var2 != null) {
                gl2Var2.R();
                gl2Var2.f = null;
            }
            mv6 mv6Var = kgfVar.p;
            if (mv6Var != null) {
                mv6Var.k0(null, null);
                kgfVar.p.m0(new MediaMetadataCompat(new Bundle()));
                kgfVar.j(0, null);
            }
            mv6 mv6Var2 = kgfVar.p;
            if (mv6Var2 != null) {
                mv6Var2.i0(false);
                zu6 zu6Var = (zu6) kgfVar.p.b;
                MediaSession mediaSession = zu6Var.a;
                zu6Var.e.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                    }
                }
                mediaSession.setCallback(null);
                zu6Var.b.a.set(null);
                mediaSession.release();
                kgfVar.p = null;
            }
            kgfVar.n = null;
            kgfVar.o = null;
            kgfVar.h();
            if (i == 0) {
                kgfVar.i();
            }
        }
        afd afdVar = ed1Var.i;
        if (afdVar != null) {
            agb b = bgb.b();
            b.a = pd5.e;
            b.d = (char) 8403;
            afdVar.e(1, b.a());
            afdVar.h();
            u56 u56Var = s34.w(afdVar.g, afdVar.l, "castDeviceControllerListenerKey").b;
            fre.i(u56Var, "Key must not be null");
            afdVar.c(u56Var, 8415);
            ed1Var.i = null;
        }
        ed1Var.k = null;
        i69 i69Var2 = ed1Var.j;
        if (i69Var2 != null) {
            i69Var2.v(null);
            ed1Var.j = null;
        }
    }

    public static void h(ed1 ed1Var, String str, Task task) {
        dc6 dc6Var = m;
        f8d f8dVar = ed1Var.e;
        if (f8dVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                i9f i9fVar = (i9f) task.getResult();
                Status status = i9fVar.a;
                if (status.b()) {
                    dc6Var.b("%s() -> success result", str);
                    i69 i69Var = new i69(new y8d());
                    ed1Var.j = i69Var;
                    i69Var.v(ed1Var.i);
                    ed1Var.j.p(new cbf(ed1Var, (byte) 0));
                    ed1Var.j.u();
                    kgf kgfVar = ed1Var.h;
                    i69 i69Var2 = ed1Var.j;
                    fre.e("Must be called from the main thread.");
                    kgfVar.a(i69Var2, ed1Var.k);
                    wr wrVar = i9fVar.b;
                    fre.h(wrVar);
                    String str2 = i9fVar.c;
                    String str3 = i9fVar.d;
                    fre.h(str3);
                    boolean z = i9fVar.e;
                    u7d u7dVar = (u7d) f8dVar;
                    Parcel R = u7dVar.R();
                    jgd.c(R, wrVar);
                    R.writeString(str2);
                    R.writeString(str3);
                    R.writeInt(z ? 1 : 0);
                    u7dVar.V(R, 4);
                    return;
                }
                dc6Var.b("%s() -> failure result", str);
                int i = status.a;
                u7d u7dVar2 = (u7d) f8dVar;
                Parcel R2 = u7dVar2.R();
                R2.writeInt(i);
                u7dVar2.V(R2, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof zn) {
                int statusCode = ((zn) exception).getStatusCode();
                u7d u7dVar3 = (u7d) f8dVar;
                Parcel R3 = u7dVar3.R();
                R3.writeInt(statusCode);
                u7dVar3.V(R3, 5);
                return;
            }
            u7d u7dVar4 = (u7d) f8dVar;
            Parcel R4 = u7dVar4.R();
            R4.writeInt(2476);
            u7dVar4.V(R4, 5);
        } catch (RemoteException e) {
            dc6Var.a(e, "Unable to call %s on %s.", "methods", f8d.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed1.i(android.os.Bundle):void");
    }
}
