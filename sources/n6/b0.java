package n6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
public final class b0 extends com.google.android.gms.internal.cast.a0 {
    public final g f16705a;

    public b0(g gVar, Looper looper) {
        super(looper, 4);
        this.f16705a = gVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f16705a.R.get() != message.arg1) {
            int i10 = message.what;
            if (i10 != 2 && i10 != 1 && i10 != 7) {
                return;
            }
            x xVar = (x) message.obj;
            xVar.getClass();
            xVar.d();
            return;
        }
        int i11 = message.what;
        if ((i11 != 1 && i11 != 7 && i11 != 4 && i11 != 5) || this.f16705a.g()) {
            int i12 = message.what;
            PendingIntent pendingIntent = null;
            if (i12 == 4) {
                g gVar = this.f16705a;
                gVar.O = new k6.a(message.arg2);
                if (!gVar.P && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(gVar.v());
                        g gVar2 = this.f16705a;
                        if (!gVar2.P) {
                            gVar2.F(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                g gVar3 = this.f16705a;
                k6.a aVar = gVar3.O;
                if (aVar == null) {
                    aVar = new k6.a(8);
                }
                gVar3.E.a(aVar);
                this.f16705a.z(aVar);
                return;
            } else if (i12 == 5) {
                g gVar4 = this.f16705a;
                k6.a aVar2 = gVar4.O;
                if (aVar2 == null) {
                    aVar2 = new k6.a(8);
                }
                gVar4.E.a(aVar2);
                this.f16705a.z(aVar2);
                return;
            } else if (i12 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                k6.a aVar3 = new k6.a(message.arg2, pendingIntent);
                this.f16705a.E.a(aVar3);
                this.f16705a.z(aVar3);
                return;
            } else if (i12 == 6) {
                this.f16705a.F(5, null);
                n nVar = this.f16705a.J;
                if (nVar != null) {
                    ((com.google.android.gms.common.api.k) nVar.f16780a).onConnectionSuspended(message.arg2);
                }
                this.f16705a.A(message.arg2);
                g.E(this.f16705a, 5, 1, null);
                return;
            } else if (i12 == 2 && !this.f16705a.j()) {
                x xVar2 = (x) message.obj;
                xVar2.getClass();
                xVar2.d();
                return;
            } else {
                int i13 = message.what;
                if (i13 != 2 && i13 != 1 && i13 != 7) {
                    Log.wtf("GmsClient", hg.c.h(i13, "Don't know how to handle message: "), new Exception());
                    return;
                }
                x xVar3 = (x) message.obj;
                synchronized (xVar3) {
                    try {
                        bool = xVar3.f16811a;
                        if (xVar3.f16812b) {
                            String obj2 = xVar3.toString();
                            Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bool != null) {
                    g gVar5 = xVar3.f16815f;
                    int i14 = xVar3.d;
                    if (i14 == 0) {
                        if (!xVar3.b()) {
                            gVar5.F(1, null);
                            xVar3.a(new k6.a(8, null));
                        }
                    } else {
                        gVar5.F(1, null);
                        Bundle bundle = xVar3.f16814e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        }
                        xVar3.a(new k6.a(i14, pendingIntent));
                    }
                }
                synchronized (xVar3) {
                    xVar3.f16812b = true;
                }
                xVar3.d();
                return;
            }
        }
        x xVar4 = (x) message.obj;
        xVar4.getClass();
        xVar4.d();
    }
}
