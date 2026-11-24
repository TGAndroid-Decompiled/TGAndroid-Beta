package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
public final class f4d extends ig0 {
    public final byte q;

    public f4d(x1d x1dVar, byte b) {
        super(o40.a, x1dVar);
        this.q = b;
    }

    @Override
    public final void a(ua9 ua9Var) {
        a(ua9Var);
    }

    @Override
    public final ua9 d(Status status) {
        byte b = this.q;
        return status;
    }

    @Override
    public final void n(xx4 xx4Var) {
        switch (this.q) {
            case 0:
                z3d z3dVar = (z3d) xx4Var;
                j4d j4dVar = (j4d) z3dVar.k();
                c4d c4dVar = new c4d(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = z3dVar.F;
                Parcel e = j4dVar.e();
                int i = w3d.a;
                e.writeStrongBinder(c4dVar);
                w3d.c(e, googleSignInOptions);
                j4dVar.f(e, 102);
                return;
            default:
                z3d z3dVar2 = (z3d) xx4Var;
                j4d j4dVar2 = (j4d) z3dVar2.k();
                c4d c4dVar2 = new c4d(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = z3dVar2.F;
                Parcel e2 = j4dVar2.e();
                int i2 = w3d.a;
                e2.writeStrongBinder(c4dVar2);
                w3d.c(e2, googleSignInOptions2);
                j4dVar2.f(e2, 103);
                return;
        }
    }
}
