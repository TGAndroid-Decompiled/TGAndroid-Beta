package a8;

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
import m.s3;
import z5.u;
public final class a extends z5.g implements com.google.android.gms.common.api.c {
    public final boolean Q;
    public final s3 R;
    public final Bundle S;
    public final Integer T;

    public a(Context context, Looper looper, s3 s3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, s3Var, kVar, lVar, 0);
        this.Q = true;
        this.R = s3Var;
        this.S = bundle;
        this.T = (Integer) s3Var.h;
    }

    public final void G() {
        d(new z5.c(this));
    }

    public final void H(c cVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.R.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = m5.b.a(this.f50618n).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.T;
            z5.l.h(num);
            u uVar = new u(2, account, num.intValue(), googleSignInAccount);
            e eVar = (e) u();
            g gVar = new g(1, uVar);
            Parcel G0 = eVar.G0();
            w6.a.c(G0, gVar);
            w6.a.d(G0, cVar);
            eVar.H0(G0, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.t0(new h(1, new w5.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final boolean p() {
        return this.Q;
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
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 10);
    }

    @Override
    public final Bundle t() {
        s3 s3Var = this.R;
        boolean equals = this.f50618n.getPackageName().equals((String) s3Var.d);
        Bundle bundle = this.S;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) s3Var.d);
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
