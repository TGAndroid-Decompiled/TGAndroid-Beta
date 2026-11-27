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
public final class md1 extends v8a {
    public static final he6 m = new he6("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final ycd e;
    public final ld1 f;
    public final hhd g;
    public final alf h;
    public rjd i;
    public v99 j;
    public CastDevice k;
    public uae l;

    public md1(Context context, String str, String str2, ld1 ld1Var, hhd hhdVar, alf alfVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = ld1Var;
        this.g = hhdVar;
        this.h = alfVar;
        al5 f = f();
        kad kadVar = new kad(this);
        he6 he6Var = mbd.a;
        ycd ycdVar = null;
        if (f != null) {
            try {
                ycdVar = mbd.b(context).Z(ld1Var, f, kadVar);
            } catch (RemoteException | zg7 e) {
                mbd.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", hcd.class.getSimpleName());
            }
        }
        this.e = ycdVar;
    }

    public static void g(md1 md1Var, int i) {
        alf alfVar = md1Var.h;
        if (alfVar.q) {
            alfVar.q = false;
            v99 v99Var = alfVar.n;
            if (v99Var != null) {
                sff sffVar = alfVar.m;
                xve.e("Must be called from the main thread.");
                if (sffVar != null) {
                    v99Var.i.remove(sffVar);
                }
            }
            alfVar.c.T(null);
            am2 am2Var = alfVar.h;
            if (am2Var != null) {
                am2Var.Q();
                am2Var.f = null;
            }
            am2 am2Var2 = alfVar.i;
            if (am2Var2 != null) {
                am2Var2.Q();
                am2Var2.f = null;
            }
            rx6 rx6Var = alfVar.p;
            if (rx6Var != null) {
                rx6Var.p0(null, null);
                alfVar.p.r0(new MediaMetadataCompat(new Bundle()));
                alfVar.j(0, null);
            }
            rx6 rx6Var2 = alfVar.p;
            if (rx6Var2 != null) {
                rx6Var2.n0(false);
                ex6 ex6Var = (ex6) alfVar.p.b;
                MediaSession mediaSession = ex6Var.a;
                ex6Var.e.kill();
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
                ex6Var.b.a.set(null);
                mediaSession.release();
                alfVar.p = null;
            }
            alfVar.n = null;
            alfVar.o = null;
            alfVar.h();
            if (i == 0) {
                alfVar.i();
            }
        }
        rjd rjdVar = md1Var.i;
        if (rjdVar != null) {
            wjb b = xjb.b();
            b.a = qf5.e;
            b.d = (char) 8403;
            rjdVar.e(1, b.a());
            rjdVar.h();
            y76 y76Var = aj3.T(rjdVar.g, rjdVar.l, "castDeviceControllerListenerKey").b;
            xve.i(y76Var, "Key must not be null");
            rjdVar.c(y76Var, 8415);
            md1Var.i = null;
        }
        md1Var.k = null;
        v99 v99Var2 = md1Var.j;
        if (v99Var2 != null) {
            v99Var2.v(null);
            md1Var.j = null;
        }
    }

    public static void h(md1 md1Var, String str, Task task) {
        he6 he6Var = m;
        ycd ycdVar = md1Var.e;
        if (ycdVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                zdf zdfVar = (zdf) task.getResult();
                Status status = zdfVar.a;
                if (status.b()) {
                    he6Var.b("%s() -> success result", str);
                    v99 v99Var = new v99(new rdd());
                    md1Var.j = v99Var;
                    v99Var.v(md1Var.i);
                    md1Var.j.p(new sff(md1Var, (byte) 0));
                    md1Var.j.u();
                    alf alfVar = md1Var.h;
                    v99 v99Var2 = md1Var.j;
                    xve.e("Must be called from the main thread.");
                    alfVar.a(v99Var2, md1Var.k);
                    xr xrVar = zdfVar.b;
                    xve.h(xrVar);
                    String str2 = zdfVar.c;
                    String str3 = zdfVar.d;
                    xve.h(str3);
                    boolean z = zdfVar.e;
                    ncd ncdVar = (ncd) ycdVar;
                    Parcel R = ncdVar.R();
                    ald.c(R, xrVar);
                    R.writeString(str2);
                    R.writeString(str3);
                    R.writeInt(z ? 1 : 0);
                    ncdVar.V(R, 4);
                    return;
                }
                he6Var.b("%s() -> failure result", str);
                int i = status.a;
                ncd ncdVar2 = (ncd) ycdVar;
                Parcel R2 = ncdVar2.R();
                R2.writeInt(i);
                ncdVar2.V(R2, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof ao) {
                int statusCode = ((ao) exception).getStatusCode();
                ncd ncdVar3 = (ncd) ycdVar;
                Parcel R3 = ncdVar3.R();
                R3.writeInt(statusCode);
                ncdVar3.V(R3, 5);
                return;
            }
            ncd ncdVar4 = (ncd) ycdVar;
            Parcel R4 = ncdVar4.R();
            R4.writeInt(2476);
            ncdVar4.V(R4, 5);
        } catch (RemoteException e) {
            he6Var.a(e, "Unable to call %s on %s.", "methods", ycd.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md1.i(android.os.Bundle):void");
    }
}
