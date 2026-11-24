package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
public final class h6d extends jh0 {
    public final byte q;

    public h6d(z3d z3dVar, byte b) {
        super(o50.a, z3dVar);
        this.q = b;
    }

    @Override
    public final void a(uc9 uc9Var) {
        a(uc9Var);
    }

    @Override
    public final uc9 d(Status status) {
        byte b = this.q;
        return status;
    }

    @Override
    public final void n(zz4 zz4Var) {
        switch (this.q) {
            case 0:
                b6d b6dVar = (b6d) zz4Var;
                l6d l6dVar = (l6d) b6dVar.k();
                e6d e6dVar = new e6d(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = b6dVar.F;
                Parcel e = l6dVar.e();
                int i = y5d.a;
                e.writeStrongBinder(e6dVar);
                y5d.c(e, googleSignInOptions);
                l6dVar.f(e, 102);
                return;
            default:
                b6d b6dVar2 = (b6d) zz4Var;
                l6d l6dVar2 = (l6d) b6dVar2.k();
                e6d e6dVar2 = new e6d(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = b6dVar2.F;
                Parcel e2 = l6dVar2.e();
                int i2 = y5d.a;
                e2.writeStrongBinder(e6dVar2);
                y5d.c(e2, googleSignInOptions2);
                l6dVar2.f(e2, 103);
                return;
        }
    }
}
