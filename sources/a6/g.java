package a6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class g extends com.google.android.gms.common.api.internal.e {
    public final int f320q;

    public g(com.google.android.gms.common.api.m mVar, int i10) {
        super(w5.a.f48066a, mVar);
        this.f320q = i10;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i10 = this.f320q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f320q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.u();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.U;
                Parcel K0 = kVar.K0();
                int i10 = i7.f.f11912a;
                K0.writeStrongBinder(fVar);
                i7.f.c(K0, googleSignInOptions);
                kVar.L0(K0, 102);
                return;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.U;
                Parcel K02 = kVar2.K0();
                int i11 = i7.f.f11912a;
                K02.writeStrongBinder(fVar2);
                i7.f.c(K02, googleSignInOptions2);
                kVar2.L0(K02, 103);
                return;
        }
    }
}
