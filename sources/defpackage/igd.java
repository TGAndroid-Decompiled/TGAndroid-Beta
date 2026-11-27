package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
public final class igd extends b99 {
    public final hg0 a;

    public igd(hg0 hg0Var, Looper looper) {
        super(looper, (byte) 4);
        this.a = hg0Var;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        e9d e9dVar;
        hg0 hg0Var = this.a;
        int i = hg0Var.C.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (e9dVar = (e9d) message.obj) != null) {
                e9dVar.c();
            }
        } else if ((i3 != 1 && i3 != 7 && i3 != 4 && i3 != 5) || hg0Var.r()) {
            int i4 = message.what;
            if (i4 == 4) {
                hg0Var.z = new ws2(message.arg2, null, null);
                if (!hg0Var.A) {
                    TextUtils.isEmpty(hg0Var.l());
                }
                ws2 ws2Var = hg0Var.z;
                if (ws2Var == null) {
                    ws2Var = new ws2(8, null, null);
                }
                hg0Var.o.a(ws2Var);
                hg0Var.s(ws2Var);
            } else if (i4 == 5) {
                ws2 ws2Var2 = hg0Var.z;
                if (ws2Var2 == null) {
                    ws2Var2 = new ws2(8, null, null);
                }
                hg0Var.o.a(ws2Var2);
                hg0Var.s(ws2Var2);
            } else if (i4 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                ws2 ws2Var3 = new ws2(message.arg2, pendingIntent2, null);
                hg0Var.o.a(ws2Var3);
                hg0Var.s(ws2Var3);
            } else if (i4 == 6) {
                hg0Var.A(5, null);
                i09 i09Var = hg0Var.t;
                if (i09Var != null) {
                    ((k05) i09Var.b).onConnectionSuspended(message.arg2);
                }
                hg0Var.t(message.arg2);
                hg0Var.y(5, 1, null);
            } else if (i4 == 2 && !hg0Var.q()) {
                e9d e9dVar2 = (e9d) message.obj;
                if (e9dVar2 != null) {
                    e9dVar2.c();
                }
            } else {
                int i5 = message.what;
                if (i5 != 2 && i5 != 1 && i5 != 7) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i5);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                    return;
                }
                e9d e9dVar3 = (e9d) message.obj;
                synchronized (e9dVar3) {
                    bool = e9dVar3.a;
                    if (e9dVar3.b) {
                        String obj2 = e9dVar3.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                        sb2.append("Callback proxy ");
                        sb2.append(obj2);
                        sb2.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb2.toString());
                    }
                }
                if (bool != null) {
                    hg0 hg0Var2 = e9dVar3.f;
                    int i6 = e9dVar3.d;
                    if (i6 == 0) {
                        if (!e9dVar3.a()) {
                            hg0Var2.A(1, null);
                            e9dVar3.b(new ws2(8, null, null));
                        }
                    } else {
                        hg0Var2.A(1, null);
                        Bundle bundle = e9dVar3.e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        } else {
                            pendingIntent = null;
                        }
                        e9dVar3.b(new ws2(i6, pendingIntent, null));
                    }
                }
                synchronized (e9dVar3) {
                    e9dVar3.b = true;
                }
                e9dVar3.c();
            }
        } else {
            e9d e9dVar4 = (e9d) message.obj;
            if (e9dVar4 != null) {
                e9dVar4.c();
            }
        }
    }
}
