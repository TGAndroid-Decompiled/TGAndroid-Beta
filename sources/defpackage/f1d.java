package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
public final class f1d extends q1d {
    public final byte b = 0;
    public final Object c;
    public final Object d;

    public f1d(g1d g1dVar, p1d p1dVar, ds2 ds2Var) {
        super(p1dVar);
        this.c = ds2Var;
        this.d = g1dVar;
    }

    @Override
    public final void a() {
        ug5 ezcVar;
        byte b = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((g1d) obj).c.g((ds2) obj2);
                return;
            default:
                j1d j1dVar = (j1d) obj2;
                c3d c3dVar = (c3d) obj;
                if (j1dVar.j(0)) {
                    ds2 ds2Var = c3dVar.b;
                    if (ds2Var.c()) {
                        l3d l3dVar = c3dVar.c;
                        fre.h(l3dVar);
                        ds2 ds2Var2 = l3dVar.c;
                        if (!ds2Var2.c()) {
                            String valueOf = String.valueOf(ds2Var2);
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                            j1dVar.g(ds2Var2);
                            return;
                        }
                        j1dVar.E = true;
                        IBinder iBinder = l3dVar.b;
                        if (iBinder == null) {
                            ezcVar = 0;
                        } else {
                            int i = e5.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof ug5) {
                                ezcVar = (ug5) queryLocalInterface;
                            } else {
                                ezcVar = new ezc(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 4);
                            }
                        }
                        fre.h(ezcVar);
                        j1dVar.F = ezcVar;
                        j1dVar.G = l3dVar.d;
                        j1dVar.H = l3dVar.e;
                        j1dVar.b();
                        return;
                    } else if (j1dVar.x && !ds2Var.b()) {
                        j1dVar.f();
                        j1dVar.b();
                        return;
                    } else {
                        j1dVar.g(ds2Var);
                        return;
                    }
                }
                return;
        }
    }

    public f1d(h1d h1dVar, j1d j1dVar, j1d j1dVar2, c3d c3dVar) {
        super(j1dVar);
        this.c = j1dVar2;
        this.d = c3dVar;
    }
}
