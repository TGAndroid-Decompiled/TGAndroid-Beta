package c6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
public final class g extends com.google.android.gms.common.api.internal.d {
    public final int f4231q;

    public g(m mVar, int i3) {
        super(y5.a.f59031a, mVar);
        this.f4231q = i3;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i3 = this.f4231q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f4231q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.m();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.F;
                Parcel L0 = kVar.L0();
                int i3 = k7.f.f16904a;
                L0.writeStrongBinder(fVar);
                k7.f.c(L0, googleSignInOptions);
                kVar.M0(L0, 102);
                return;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.m();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.F;
                Parcel L02 = kVar2.L0();
                int i10 = k7.f.f16904a;
                L02.writeStrongBinder(fVar2);
                k7.f.c(L02, googleSignInOptions2);
                kVar2.M0(L02, 103);
                return;
        }
    }
}
