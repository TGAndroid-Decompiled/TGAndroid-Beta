package n6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
public final class a0 extends com.google.android.gms.internal.cast.c0 {
    public final g f16532a;

    public a0(g gVar, Looper looper) {
        super(looper, 4);
        this.f16532a = gVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f16532a.R.get() != message.arg1) {
            int i10 = message.what;
            if (i10 != 2 && i10 != 1 && i10 != 7) {
                return;
            }
            w wVar = (w) message.obj;
            wVar.getClass();
            wVar.d();
            return;
        }
        int i11 = message.what;
        if ((i11 != 1 && i11 != 7 && i11 != 4 && i11 != 5) || this.f16532a.f()) {
            int i12 = message.what;
            PendingIntent pendingIntent = null;
            if (i12 == 4) {
                g gVar = this.f16532a;
                gVar.O = new k6.a(message.arg2);
                if (!gVar.P && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(gVar.v());
                        g gVar2 = this.f16532a;
                        if (!gVar2.P) {
                            gVar2.F(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                g gVar3 = this.f16532a;
                k6.a aVar = gVar3.O;
                if (aVar == null) {
                    aVar = new k6.a(8);
                }
                gVar3.E.a(aVar);
                this.f16532a.z(aVar);
                return;
            } else if (i12 == 5) {
                g gVar4 = this.f16532a;
                k6.a aVar2 = gVar4.O;
                if (aVar2 == null) {
                    aVar2 = new k6.a(8);
                }
                gVar4.E.a(aVar2);
                this.f16532a.z(aVar2);
                return;
            } else if (i12 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                k6.a aVar3 = new k6.a(message.arg2, pendingIntent);
                this.f16532a.E.a(aVar3);
                this.f16532a.z(aVar3);
                return;
            } else if (i12 == 6) {
                this.f16532a.F(5, null);
                m mVar = this.f16532a.J;
                if (mVar != null) {
                    ((com.google.android.gms.common.api.k) mVar.f16604a).onConnectionSuspended(message.arg2);
                }
                this.f16532a.A(message.arg2);
                g.E(this.f16532a, 5, 1, null);
                return;
            } else if (i12 == 2 && !this.f16532a.j()) {
                w wVar2 = (w) message.obj;
                wVar2.getClass();
                wVar2.d();
                return;
            } else {
                int i13 = message.what;
                if (i13 != 2 && i13 != 1 && i13 != 7) {
                    Log.wtf("GmsClient", i2.g.i(i13, "Don't know how to handle message: "), new Exception());
                    return;
                }
                w wVar3 = (w) message.obj;
                synchronized (wVar3) {
                    try {
                        bool = wVar3.f16635a;
                        if (wVar3.f16636b) {
                            String obj2 = wVar3.toString();
                            Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bool != null) {
                    g gVar5 = wVar3.f16639f;
                    int i14 = wVar3.d;
                    if (i14 == 0) {
                        if (!wVar3.b()) {
                            gVar5.F(1, null);
                            wVar3.a(new k6.a(8, null));
                        }
                    } else {
                        gVar5.F(1, null);
                        Bundle bundle = wVar3.f16638e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        }
                        wVar3.a(new k6.a(i14, pendingIntent));
                    }
                }
                synchronized (wVar3) {
                    wVar3.f16636b = true;
                }
                wVar3.d();
                return;
            }
        }
        w wVar4 = (w) message.obj;
        wVar4.getClass();
        wVar4.d();
    }
}
