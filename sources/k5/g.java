package k5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
public final class g extends com.google.android.gms.common.api.internal.e {
    public final int f14655q;

    public g(m mVar, int i9) {
        super(g5.a.f7109a, mVar);
        this.f14655q = i9;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i9 = this.f14655q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f14655q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.u();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.Q;
                Parcel I0 = kVar.I0();
                int i9 = s6.f.f47457a;
                I0.writeStrongBinder(fVar);
                s6.f.c(I0, googleSignInOptions);
                kVar.J0(I0, 102);
                return;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.Q;
                Parcel I02 = kVar2.I0();
                int i10 = s6.f.f47457a;
                I02.writeStrongBinder(fVar2);
                s6.f.c(I02, googleSignInOptions2);
                kVar2.J0(I02, 103);
                return;
        }
    }
}
