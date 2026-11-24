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
public final class me1 extends f7a {
    public static final ce6 m = new ce6("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final had e;
    public final le1 f;
    public final qed g;
    public final lif h;
    public bhd i;
    public k89 j;
    public CastDevice k;
    public fkd l;

    public me1(Context context, String str, String str2, le1 le1Var, qed qedVar, lif lifVar) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = le1Var;
        this.g = qedVar;
        this.h = lifVar;
        xk5 f = f();
        t7d t7dVar = new t7d(this);
        ce6 ce6Var = v8d.a;
        had hadVar = null;
        if (f != null) {
            try {
                hadVar = v8d.b(context).Z(le1Var, f, t7dVar);
            } catch (RemoteException | sg7 e) {
                v8d.a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", q9d.class.getSimpleName());
            }
        }
        this.e = hadVar;
    }

    public static void g(me1 me1Var, int i) {
        lif lifVar = me1Var.h;
        if (lifVar.q) {
            lifVar.q = false;
            k89 k89Var = lifVar.n;
            if (k89Var != null) {
                ddf ddfVar = lifVar.m;
                ite.e("Must be called from the main thread.");
                if (ddfVar != null) {
                    k89Var.i.remove(ddfVar);
                }
            }
            lifVar.c.T(null);
            sm2 sm2Var = lifVar.h;
            if (sm2Var != null) {
                sm2Var.Q();
                sm2Var.f = null;
            }
            sm2 sm2Var2 = lifVar.i;
            if (sm2Var2 != null) {
                sm2Var2.Q();
                sm2Var2.f = null;
            }
            mx6 mx6Var = lifVar.p;
            if (mx6Var != null) {
                mx6Var.o0(null, null);
                lifVar.p.q0(new MediaMetadataCompat(new Bundle()));
                lifVar.j(0, null);
            }
            mx6 mx6Var2 = lifVar.p;
            if (mx6Var2 != null) {
                mx6Var2.l0(false);
                zw6 zw6Var = (zw6) lifVar.p.b;
                MediaSession mediaSession = zw6Var.a;
                zw6Var.e.kill();
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
                zw6Var.b.a.set(null);
                mediaSession.release();
                lifVar.p = null;
            }
            lifVar.n = null;
            lifVar.o = null;
            lifVar.h();
            if (i == 0) {
                lifVar.i();
            }
        }
        bhd bhdVar = me1Var.i;
        if (bhdVar != null) {
            bib b = cib.b();
            b.a = nf5.e;
            b.d = (char) 8403;
            bhdVar.e(1, b.a());
            bhdVar.h();
            u76 u76Var = fk3.U(bhdVar.g, bhdVar.l, "castDeviceControllerListenerKey").b;
            ite.i(u76Var, "Key must not be null");
            bhdVar.c(u76Var, 8415);
            me1Var.i = null;
        }
        me1Var.k = null;
        k89 k89Var2 = me1Var.j;
        if (k89Var2 != null) {
            k89Var2.v(null);
            me1Var.j = null;
        }
    }

    public static void h(me1 me1Var, String str, Task task) {
        ce6 ce6Var = m;
        had hadVar = me1Var.e;
        if (hadVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                kbf kbfVar = (kbf) task.getResult();
                Status status = kbfVar.a;
                if (status.b()) {
                    ce6Var.b("%s() -> success result", str);
                    k89 k89Var = new k89(new abd());
                    me1Var.j = k89Var;
                    k89Var.v(me1Var.i);
                    me1Var.j.p(new ddf(me1Var, (byte) 0));
                    me1Var.j.u();
                    lif lifVar = me1Var.h;
                    k89 k89Var2 = me1Var.j;
                    ite.e("Must be called from the main thread.");
                    lifVar.a(k89Var2, me1Var.k);
                    ws wsVar = kbfVar.b;
                    ite.h(wsVar);
                    String str2 = kbfVar.c;
                    String str3 = kbfVar.d;
                    ite.h(str3);
                    boolean z = kbfVar.e;
                    w9d w9dVar = (w9d) hadVar;
                    Parcel R = w9dVar.R();
                    kid.c(R, wsVar);
                    R.writeString(str2);
                    R.writeString(str3);
                    R.writeInt(z ? 1 : 0);
                    w9dVar.V(R, 4);
                    return;
                }
                ce6Var.b("%s() -> failure result", str);
                int i = status.a;
                w9d w9dVar2 = (w9d) hadVar;
                Parcel R2 = w9dVar2.R();
                R2.writeInt(i);
                w9dVar2.V(R2, 5);
                return;
            }
            Exception exception = task.getException();
            if (exception instanceof ap) {
                int statusCode = ((ap) exception).getStatusCode();
                w9d w9dVar3 = (w9d) hadVar;
                Parcel R3 = w9dVar3.R();
                R3.writeInt(statusCode);
                w9dVar3.V(R3, 5);
                return;
            }
            w9d w9dVar4 = (w9d) hadVar;
            Parcel R4 = w9dVar4.R();
            R4.writeInt(2476);
            w9dVar4.V(R4, 5);
        } catch (RemoteException e) {
            ce6Var.a(e, "Unable to call %s on %s.", "methods", had.class.getSimpleName());
        }
    }

    public final void i(android.os.Bundle r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me1.i(android.os.Bundle):void");
    }
}
