package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
public final class rdd extends q79 {
    public final hh0 a;

    public rdd(hh0 hh0Var, Looper looper) {
        super(looper, (byte) 4);
        this.a = hh0Var;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        p6d p6dVar;
        hh0 hh0Var = this.a;
        int i = hh0Var.C.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (p6dVar = (p6d) message.obj) != null) {
                p6dVar.c();
            }
        } else if ((i3 != 1 && i3 != 7 && i3 != 4 && i3 != 5) || hh0Var.r()) {
            int i4 = message.what;
            if (i4 == 4) {
                hh0Var.z = new ot2(message.arg2, null, null);
                if (!hh0Var.A) {
                    TextUtils.isEmpty(hh0Var.l());
                }
                ot2 ot2Var = hh0Var.z;
                if (ot2Var == null) {
                    ot2Var = new ot2(8, null, null);
                }
                hh0Var.o.a(ot2Var);
                hh0Var.s(ot2Var);
            } else if (i4 == 5) {
                ot2 ot2Var2 = hh0Var.z;
                if (ot2Var2 == null) {
                    ot2Var2 = new ot2(8, null, null);
                }
                hh0Var.o.a(ot2Var2);
                hh0Var.s(ot2Var2);
            } else if (i4 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                ot2 ot2Var3 = new ot2(message.arg2, pendingIntent2, null);
                hh0Var.o.a(ot2Var3);
                hh0Var.s(ot2Var3);
            } else if (i4 == 6) {
                hh0Var.A(5, null);
                cf9 cf9Var = hh0Var.t;
                if (cf9Var != null) {
                    ((f05) cf9Var.b).onConnectionSuspended(message.arg2);
                }
                hh0Var.t(message.arg2);
                hh0Var.y(5, 1, null);
            } else if (i4 == 2 && !hh0Var.q()) {
                p6d p6dVar2 = (p6d) message.obj;
                if (p6dVar2 != null) {
                    p6dVar2.c();
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
                p6d p6dVar3 = (p6d) message.obj;
                synchronized (p6dVar3) {
                    bool = p6dVar3.a;
                    if (p6dVar3.b) {
                        String obj2 = p6dVar3.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                        sb2.append("Callback proxy ");
                        sb2.append(obj2);
                        sb2.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb2.toString());
                    }
                }
                if (bool != null) {
                    hh0 hh0Var2 = p6dVar3.f;
                    int i6 = p6dVar3.d;
                    if (i6 == 0) {
                        if (!p6dVar3.a()) {
                            hh0Var2.A(1, null);
                            p6dVar3.b(new ot2(8, null, null));
                        }
                    } else {
                        hh0Var2.A(1, null);
                        Bundle bundle = p6dVar3.e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        } else {
                            pendingIntent = null;
                        }
                        p6dVar3.b(new ot2(i6, pendingIntent, null));
                    }
                }
                synchronized (p6dVar3) {
                    p6dVar3.b = true;
                }
                p6dVar3.c();
            }
        } else {
            p6d p6dVar4 = (p6d) message.obj;
            if (p6dVar4 != null) {
                p6dVar4.c();
            }
        }
    }
}
