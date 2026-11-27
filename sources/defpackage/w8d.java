package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
public final class w8d extends jg0 {
    public final byte q;

    public w8d(o6d o6dVar, byte b) {
        super(q40.a, o6dVar);
        this.q = b;
    }

    @Override
    public final void a(ie9 ie9Var) {
        a(ie9Var);
    }

    @Override
    public final ie9 d(Status status) {
        byte b = this.q;
        return status;
    }

    @Override
    public final void n(d05 d05Var) {
        switch (this.q) {
            case 0:
                q8d q8dVar = (q8d) d05Var;
                a9d a9dVar = (a9d) q8dVar.k();
                t8d t8dVar = new t8d(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = q8dVar.F;
                Parcel e = a9dVar.e();
                int i = n8d.a;
                e.writeStrongBinder(t8dVar);
                n8d.c(e, googleSignInOptions);
                a9dVar.f(e, 102);
                return;
            default:
                q8d q8dVar2 = (q8d) d05Var;
                a9d a9dVar2 = (a9d) q8dVar2.k();
                t8d t8dVar2 = new t8d(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = q8dVar2.F;
                Parcel e2 = a9dVar2.e();
                int i2 = n8d.a;
                e2.writeStrongBinder(t8dVar2);
                n8d.c(e2, googleSignInOptions2);
                a9dVar2.f(e2, 103);
                return;
        }
    }
}
