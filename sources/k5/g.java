package k5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;

public final class g extends com.google.android.gms.common.api.internal.e {

    public final int f14476q;

    public g(m mVar, int i10) {
        super(g5.a.f6387a, mVar);
        this.f14476q = i10;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i10 = this.f14476q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f14476q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.u();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.Q;
                Parcel parcelI0 = kVar.I0();
                int i10 = t6.f.f48106a;
                parcelI0.writeStrongBinder(fVar);
                t6.f.c(parcelI0, googleSignInOptions);
                kVar.J0(parcelI0, 102);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.Q;
                Parcel parcelI1 = kVar2.I0();
                int i11 = t6.f.f48106a;
                parcelI1.writeStrongBinder(fVar2);
                t6.f.c(parcelI1, googleSignInOptions2);
                kVar2.J0(parcelI1, 103);
                break;
        }
    }
}
