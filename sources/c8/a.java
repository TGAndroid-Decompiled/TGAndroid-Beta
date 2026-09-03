package c8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b6.m;
import b6.v;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
public final class a extends b6.g implements com.google.android.gms.common.api.c {
    public final boolean R;
    public final s3 S;
    public final Bundle T;
    public final Integer U;

    public a(Context context, Looper looper, s3 s3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, s3Var, kVar, lVar, 0);
        this.R = true;
        this.S = s3Var;
        this.T = bundle;
        this.U = (Integer) s3Var.h;
    }

    public final void G() {
        n(new b6.c(this));
    }

    public final void H(c cVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.S.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = o5.b.a(this.f1599n).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.U;
            m.h(num);
            v vVar = new v(2, account, num.intValue(), googleSignInAccount);
            e eVar = (e) u();
            g gVar = new g(1, vVar);
            Parcel G0 = eVar.G0();
            y6.a.c(G0, gVar);
            y6.a.d(G0, cVar);
            eVar.H0(G0, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.h(new h(1, new y5.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final boolean p() {
        return this.R;
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
        return new a7.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 11);
    }

    @Override
    public final Bundle t() {
        s3 s3Var = this.S;
        boolean equals = this.f1599n.getPackageName().equals((String) s3Var.d);
        Bundle bundle = this.T;
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
