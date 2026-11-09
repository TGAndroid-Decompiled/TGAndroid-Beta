package d6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
public final class g extends com.google.android.gms.common.api.internal.d {
    public final int f8203q;

    public g(m mVar, int i7) {
        super(z5.a.f59716a, mVar);
        this.f8203q = i7;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i7 = this.f8203q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f8203q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.n();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.F;
                Parcel l1 = kVar.l1();
                int i7 = l7.f.f18202a;
                l1.writeStrongBinder(fVar);
                l7.f.c(l1, googleSignInOptions);
                kVar.m1(l1, 102);
                return;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.n();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.F;
                Parcel l12 = kVar2.l1();
                int i10 = l7.f.f18202a;
                l12.writeStrongBinder(fVar2);
                l7.f.c(l12, googleSignInOptions2);
                kVar2.m1(l12, 103);
                return;
        }
    }
}
