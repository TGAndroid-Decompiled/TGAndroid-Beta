package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
public final class pbd extends o59 {
    public final gg0 a;

    public pbd(gg0 gg0Var, Looper looper) {
        super(looper, (byte) 4);
        this.a = gg0Var;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        n4d n4dVar;
        gg0 gg0Var = this.a;
        int i = gg0Var.C.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (n4dVar = (n4d) message.obj) != null) {
                n4dVar.c();
            }
        } else if ((i3 != 1 && i3 != 7 && i3 != 4 && i3 != 5) || gg0Var.r()) {
            int i4 = message.what;
            if (i4 == 4) {
                gg0Var.z = new ds2(message.arg2, null, null);
                if (!gg0Var.A) {
                    TextUtils.isEmpty(gg0Var.l());
                }
                ds2 ds2Var = gg0Var.z;
                if (ds2Var == null) {
                    ds2Var = new ds2(8, null, null);
                }
                gg0Var.o.a(ds2Var);
                gg0Var.s(ds2Var);
            } else if (i4 == 5) {
                ds2 ds2Var2 = gg0Var.z;
                if (ds2Var2 == null) {
                    ds2Var2 = new ds2(8, null, null);
                }
                gg0Var.o.a(ds2Var2);
                gg0Var.s(ds2Var2);
            } else if (i4 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                ds2 ds2Var3 = new ds2(message.arg2, pendingIntent2, null);
                gg0Var.o.a(ds2Var3);
                gg0Var.s(ds2Var3);
            } else if (i4 == 6) {
                gg0Var.A(5, null);
                ln8 ln8Var = gg0Var.t;
                if (ln8Var != null) {
                    ((ey4) ln8Var.b).onConnectionSuspended(message.arg2);
                }
                gg0Var.t(message.arg2);
                gg0Var.y(5, 1, null);
            } else if (i4 == 2 && !gg0Var.q()) {
                n4d n4dVar2 = (n4d) message.obj;
                if (n4dVar2 != null) {
                    n4dVar2.c();
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
                n4d n4dVar3 = (n4d) message.obj;
                synchronized (n4dVar3) {
                    bool = n4dVar3.a;
                    if (n4dVar3.b) {
                        String obj2 = n4dVar3.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                        sb2.append("Callback proxy ");
                        sb2.append(obj2);
                        sb2.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb2.toString());
                    }
                }
                if (bool != null) {
                    gg0 gg0Var2 = n4dVar3.f;
                    int i6 = n4dVar3.d;
                    if (i6 == 0) {
                        if (!n4dVar3.a()) {
                            gg0Var2.A(1, null);
                            n4dVar3.b(new ds2(8, null, null));
                        }
                    } else {
                        gg0Var2.A(1, null);
                        Bundle bundle = n4dVar3.e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        } else {
                            pendingIntent = null;
                        }
                        n4dVar3.b(new ds2(i6, pendingIntent, null));
                    }
                }
                synchronized (n4dVar3) {
                    n4dVar3.b = true;
                }
                n4dVar3.c();
            }
        } else {
            n4d n4dVar4 = (n4d) message.obj;
            if (n4dVar4 != null) {
                n4dVar4.c();
            }
        }
    }
}
