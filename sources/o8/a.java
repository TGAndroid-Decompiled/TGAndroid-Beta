package o8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
import n6.u;
public final class a extends n6.g implements com.google.android.gms.common.api.c {
    public final boolean U;
    public final r3 V;
    public final Bundle W;
    public final Integer X;

    public a(Context context, Looper looper, r3 r3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, r3Var, kVar, lVar, 0);
        this.U = true;
        this.V = r3Var;
        this.W = bundle;
        this.X = (Integer) r3Var.h;
    }

    public final void G() {
        f(new n6.c(this));
    }

    public final void H(c cVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.V.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = a6.b.a(this.f13864n).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.X;
            n6.l.h(num);
            u uVar = new u(2, account, num.intValue(), googleSignInAccount);
            e eVar = (e) u();
            g gVar = new g(1, uVar);
            Parcel I0 = eVar.I0();
            k7.a.c(I0, gVar);
            k7.a.d(I0, cVar);
            eVar.J0(I0, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.B(new h(1, new k6.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final boolean p() {
        return this.U;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 6);
    }

    @Override
    public final Bundle t() {
        r3 r3Var = this.V;
        boolean equals = this.f13864n.getPackageName().equals((String) r3Var.d);
        Bundle bundle = this.W;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) r3Var.d);
        }
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
