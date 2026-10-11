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
import m.q3;
import n6.m;
import n6.v;
public final class a extends n6.g implements com.google.android.gms.common.api.c {
    public final boolean U;
    public final q3 V;
    public final Bundle W;
    public final Integer X;

    public a(Context context, Looper looper, q3 q3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, q3Var, kVar, lVar, 0);
        this.U = true;
        this.V = q3Var;
        this.W = bundle;
        this.X = (Integer) q3Var.h;
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
                googleSignInAccount = a6.b.a(this.f16700n).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.X;
            m.h(num);
            v vVar = new v(2, account, num.intValue(), googleSignInAccount);
            e eVar = (e) u();
            g gVar = new g(1, vVar);
            Parcel H0 = eVar.H0();
            k7.a.c(H0, gVar);
            k7.a.d(H0, cVar);
            eVar.I0(H0, 12);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.B(new h(1, new k6.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
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
        q3 q3Var = this.V;
        boolean equals = this.f16700n.getPackageName().equals((String) q3Var.d);
        Bundle bundle = this.W;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) q3Var.d);
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
