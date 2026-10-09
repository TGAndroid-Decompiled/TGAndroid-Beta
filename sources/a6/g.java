package a6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
public final class g extends com.google.android.gms.common.api.internal.e {
    public final int f322q;

    public g(m mVar, int i10) {
        super(w5.a.f49884a, mVar);
        this.f322q = i10;
    }

    @Override
    public final void a(q qVar) {
        a(qVar);
    }

    @Override
    public final q d(Status status) {
        int i10 = this.f322q;
        return status;
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        switch (this.f322q) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.u();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.U;
                Parcel J0 = kVar.J0();
                int i10 = i7.f.f12041a;
                J0.writeStrongBinder(fVar);
                i7.f.c(J0, googleSignInOptions);
                kVar.K0(J0, 102);
                return;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.u();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.U;
                Parcel J02 = kVar2.J0();
                int i11 = i7.f.f12041a;
                J02.writeStrongBinder(fVar2);
                i7.f.c(J02, googleSignInOptions2);
                kVar2.K0(J02, 103);
                return;
        }
    }
}
