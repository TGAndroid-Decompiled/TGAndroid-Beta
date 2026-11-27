package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
public final class w5d extends h6d {
    public final byte b = 0;
    public final Object c;
    public final Object d;

    public w5d(x5d x5dVar, g6d g6dVar, ws2 ws2Var) {
        super(g6dVar);
        this.c = ws2Var;
        this.d = x5dVar;
    }

    @Override
    public final void a() {
        wi5 v3dVar;
        byte b = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((x5d) obj).c.g((ws2) obj2);
                return;
            default:
                a6d a6dVar = (a6d) obj2;
                t7d t7dVar = (t7d) obj;
                if (a6dVar.i(0)) {
                    ws2 ws2Var = t7dVar.b;
                    if (ws2Var.c()) {
                        c8d c8dVar = t7dVar.c;
                        xve.h(c8dVar);
                        ws2 ws2Var2 = c8dVar.c;
                        if (!ws2Var2.c()) {
                            String valueOf = String.valueOf(ws2Var2);
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                            a6dVar.g(ws2Var2);
                            return;
                        }
                        a6dVar.E = true;
                        IBinder iBinder = c8dVar.b;
                        if (iBinder == null) {
                            v3dVar = 0;
                        } else {
                            int i = f5.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof wi5) {
                                v3dVar = (wi5) queryLocalInterface;
                            } else {
                                v3dVar = new v3d(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                        }
                        xve.h(v3dVar);
                        a6dVar.F = v3dVar;
                        a6dVar.G = c8dVar.d;
                        a6dVar.H = c8dVar.e;
                        a6dVar.b();
                        return;
                    } else if (a6dVar.x && !ws2Var.b()) {
                        a6dVar.f();
                        a6dVar.b();
                        return;
                    } else {
                        a6dVar.g(ws2Var);
                        return;
                    }
                }
                return;
        }
    }

    public w5d(y5d y5dVar, a6d a6dVar, a6d a6dVar2, t7d t7dVar) {
        super(a6dVar);
        this.c = a6dVar2;
        this.d = t7dVar;
    }
}
