package o5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
public final class g extends com.google.android.gms.common.api.internal.e {
    public final int f16435q;

    public g(m mVar, int i10) {
        super(k5.a.f9729a, mVar);
        this.f16435q = i10;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i10 = this.f16435q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f16435q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.u();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.R;
                Parcel I0 = kVar.I0();
                int i10 = w6.f.f46550a;
                I0.writeStrongBinder(fVar);
                w6.f.c(I0, googleSignInOptions);
                kVar.J0(I0, 102);
                return;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.R;
                Parcel I02 = kVar2.I0();
                int i11 = w6.f.f46550a;
                I02.writeStrongBinder(fVar2);
                w6.f.c(I02, googleSignInOptions2);
                kVar2.J0(I02, 103);
                return;
        }
    }
}
