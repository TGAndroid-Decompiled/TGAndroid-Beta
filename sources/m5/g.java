package m5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
public final class g extends com.google.android.gms.common.api.internal.e {
    public final int f16876q;

    public g(m mVar, int i10) {
        super(i5.a.f8249a, mVar);
        this.f16876q = i10;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i10 = this.f16876q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f16876q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.u();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.Q;
                Parcel I0 = kVar.I0();
                int i10 = u6.f.f49121a;
                I0.writeStrongBinder(fVar);
                u6.f.c(I0, googleSignInOptions);
                kVar.J0(I0, 102);
                return;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.Q;
                Parcel I02 = kVar2.I0();
                int i11 = u6.f.f49121a;
                I02.writeStrongBinder(fVar2);
                u6.f.c(I02, googleSignInOptions2);
                kVar2.J0(I02, 103);
                return;
        }
    }
}
