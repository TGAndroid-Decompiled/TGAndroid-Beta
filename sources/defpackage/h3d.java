package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
public final class h3d extends s3d {
    public final byte b = 0;
    public final Object c;
    public final Object d;

    public h3d(i3d i3dVar, r3d r3dVar, ot2 ot2Var) {
        super(r3dVar);
        this.c = ot2Var;
        this.d = i3dVar;
    }

    @Override
    public final void a() {
        ti5 f1dVar;
        byte b = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((i3d) obj).c.g((ot2) obj2);
                return;
            default:
                l3d l3dVar = (l3d) obj2;
                e5d e5dVar = (e5d) obj;
                if (l3dVar.i(0)) {
                    ot2 ot2Var = e5dVar.b;
                    if (ot2Var.c()) {
                        n5d n5dVar = e5dVar.c;
                        ite.h(n5dVar);
                        ot2 ot2Var2 = n5dVar.c;
                        if (!ot2Var2.c()) {
                            String valueOf = String.valueOf(ot2Var2);
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                            l3dVar.g(ot2Var2);
                            return;
                        }
                        l3dVar.E = true;
                        IBinder iBinder = n5dVar.b;
                        if (iBinder == null) {
                            f1dVar = 0;
                        } else {
                            int i = e5.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof ti5) {
                                f1dVar = (ti5) queryLocalInterface;
                            } else {
                                f1dVar = new f1d(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                        }
                        ite.h(f1dVar);
                        l3dVar.F = f1dVar;
                        l3dVar.G = n5dVar.d;
                        l3dVar.H = n5dVar.e;
                        l3dVar.b();
                        return;
                    } else if (l3dVar.x && !ot2Var.b()) {
                        l3dVar.f();
                        l3dVar.b();
                        return;
                    } else {
                        l3dVar.g(ot2Var);
                        return;
                    }
                }
                return;
        }
    }

    public h3d(j3d j3dVar, l3d l3dVar, l3d l3dVar2, e5d e5dVar) {
        super(l3dVar);
        this.c = l3dVar2;
        this.d = e5dVar;
    }
}
